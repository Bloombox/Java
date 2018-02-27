/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bloombox.client.internals.rpc

import bloombox.client.ClientException
import com.google.common.util.concurrent.ListenableFuture
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit


/**
 * Base RPC client logic, specifies the client-side operator of an RPC connection with the Bloombox Platform.
 */
@Suppress("unused")
abstract class RPCClient(apiKey: String) {
  /**
   * Modes for communication transport for RPCs.
   */
  enum class TransportMode {
    SECURE,
    CLEARTEXT;
  }

  /**
   * Client credentials specification.
   */
  data class ClientCredentials(
        internal val privateKey: InputStream,
        internal val certificate: InputStream,
        internal val keyPassword: String?)

  /**
   * API key header interceptor.
   */
  protected class APIKeyInterceptor(private val apikey: String?) : ClientInterceptor {
    companion object {
      /**
       * API key header sentinel.
       */
      val apiKeyHeader: io.grpc.Metadata.Key<String> = io.grpc.Metadata.Key.of(
            "x-api-key", io.grpc.Metadata.ASCII_STRING_MARSHALLER)
    }

    override fun <ReqT : Any?, RespT : Any?> interceptCall(method: MethodDescriptor<ReqT, RespT>?,
                                                           callOptions: CallOptions?,
                                                           next: Channel): ClientCall<ReqT, RespT>? {
      var call: ClientCall<ReqT, RespT> = next.newCall(method, callOptions)
      call = object : ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
        override fun start(responseListener: Listener<RespT>, headers: Metadata) {
          if (apikey != null && apikey.length > 2) {
            headers.put(apiKeyHeader, apikey)
          }
          super.start(responseListener, headers)
        }
      }
      return call
    }
  }

  /**
   * Managed channel.
   */
  abstract val channel: ManagedChannel

  /**
   * Header interceptor.
   */
  private val interceptor = APIKeyInterceptor(apiKey)

  /**
   * Close active connections.
   */
  fun close(soft: Boolean,
            block: Boolean,
            timeout: Pair<Long, TimeUnit>) {
    if (!channel.isShutdown) {
      if (soft) {
        channel.shutdown()
      } else {
        channel.shutdownNow()
      }
      if (block)
        channel.awaitTermination(timeout.first, timeout.second)
    }
  }

  companion object {
    /**
     * Default authority roots file.
     */
    private const val defaultAuthorityRoots = "/authority-roots.pem"

    /**
     * Session cache size.
     */
    private const val sessionCacheSize: Long = 100

    /**
     * Session cache timeout.
     */
    private const val sessionCacheTimeout: Long = 3600

    /**
     * Whether to enable keepalive for RPC connections.
     */
    private const val keepalive: Boolean = true

    /**
     * Keepalive time, in seconds, defined as "the delay time for sending the next keepalive ping."
     */
    private const val keepaliveTime: Long = 60

    /**
     * Keepalive timeout, in seconds, defined as "the timeout for keepalive ping requests."
     */
    private const val keepaliveTimeout: Long = 90

    /**
     * Idle connection timeout, in seconds, after which an idle RPC connection will be severed.
     */
    private const val idleConnectionTimeout: Long = 120

    /**
     * Resolve a set of client authority roots, either via a custom input stream,
     * or an asset embedded in the RPC client JAR.
     */
    private fun authorityRoots(custom: InputStream?): InputStream {
      return custom ?: RPCClient::class.java.getResourceAsStream(defaultAuthorityRoots)
    }

    /**
     * Execute an operation, and dispatch a user callback accordingly, handling underlying
     * errors according to the provided error callback.
     */
    @JvmStatic
    fun <T> executeAndDispatchCallback(op: ListenableFuture<T>,
                                       callback: ((T) -> Unit)?,
                                       err: ((ClientException?) -> Unit)?,
                                       timeout: Duration): ListenableFuture<T> {
      try {
        val response = op.get(timeout.toMillis(), TimeUnit.MILLISECONDS)
        if (response != null) {
          if (callback != null)
            callback(response)
        }
      } catch (e: ClientException) {
        handleError(e, err)
      } catch (e: StatusRuntimeException) {
        handleError(e, err)
      }
      return op
    }

    /**
     * Handle an exception encountered in an RPC operation, dispatching the error callback appropriately.
     */
    @JvmStatic
    protected fun handleError(err: Throwable?,
                              cbk: ((ClientException?) -> Unit)?) {
      when {
        err is ClientException -> cbk?.invoke(err)
        err != null -> throw err
        else -> throw IllegalStateException("Invalid null failure result.")
      }
    }
  }

  /**
   * Prepare a channel builder according to standard settings.
   */
  fun channelBuilder(host: String,
                     port: Int,
                     transportMode: TransportMode,
                     clientAuth: ClientAuth,
                     clientCredentials: ClientCredentials? = null,
                     clientAuthorityRoots: InputStream?,
                     executor: Executor): NettyChannelBuilder {
    val builder = NettyChannelBuilder
          .forAddress(host, port)
          .executor(executor)
          .idleTimeout(idleConnectionTimeout, TimeUnit.SECONDS)

    builder.intercept(interceptor)

    @Suppress("ConstantConditionIf")
    if (keepalive)
      builder
            .keepAliveTime(keepaliveTime, TimeUnit.SECONDS)
            .keepAliveTimeout(keepaliveTimeout, TimeUnit.SECONDS)

    val compressionRegistry = CompressorRegistry.newEmptyInstance()
    val decompressorRegistry = DecompressorRegistry.emptyInstance()
          .with(Codec.Gzip(), true)
          .with(Codec.Identity.NONE, false)

    // register gzip and 'identity' (no compression) as available transport encodings
    compressionRegistry.register(Codec.Gzip())
    compressionRegistry.register(Codec.Identity.NONE)

    // install both sides of the codec registry set
    builder.compressorRegistry(compressionRegistry)
    builder.decompressorRegistry(decompressorRegistry)

    return when (transportMode) {
      RPCClient.TransportMode.SECURE -> {
        return if (clientAuth == ClientAuth.NONE) {
          builder
                .negotiationType(NegotiationType.TLS)
                .sslContext(GrpcSslContexts.forClient()
                      .trustManager(authorityRoots(clientAuthorityRoots))
                      .build())
        } else {
          if (clientCredentials == null)
            throw IllegalArgumentException("Configuration error: Client auth is active, but no credentials were provided.")
          builder
                .negotiationType(NegotiationType.TLS)
                .sslContext(GrpcSslContexts.forClient()
                      .trustManager(authorityRoots(clientAuthorityRoots))
                      .clientAuth(clientAuth)
                      .keyManager(clientCredentials.certificate, clientCredentials.privateKey, clientCredentials.keyPassword)
                      .sessionCacheSize(sessionCacheSize)
                      .sessionTimeout(sessionCacheTimeout)
                      .build())
        }
      }

      RPCClient.TransportMode.CLEARTEXT ->
        NettyChannelBuilder
              .forAddress(host, port)
              .executor(executor)
              .sslContext(GrpcSslContexts.forClient()
                    .trustManager(authorityRoots(clientAuthorityRoots))
                    .build())
    }
  }
}
