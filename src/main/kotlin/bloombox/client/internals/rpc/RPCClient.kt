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

import io.grpc.Codec
import io.grpc.CompressorRegistry
import io.grpc.DecompressorRegistry
import io.grpc.ManagedChannel
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.util.concurrent.Executor
import java.util.concurrent.TimeUnit


/**
 * Base RPC client logic, specifies the client-side operator of an RPC connection with the Bloombox Platform.
 */
@Suppress("unused")
abstract class RPCClient {
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
   * Managed channel.
   */
  abstract val channel: ManagedChannel

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
}
