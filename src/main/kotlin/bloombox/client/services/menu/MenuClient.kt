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

package bloombox.client.services.menu

import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.err.ServiceClientException
import bloombox.client.internals.rpc.RPCClient
import com.google.common.util.concurrent.ListenableFuture
import io.bloombox.schema.services.menu.v1beta1.GetMenu
import io.bloombox.schema.services.menu.v1beta1.MenuGrpc
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Menu RPC client.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class MenuClient(override val host: String,
                 override val port: Int,
                 override val apiKey: String,
                 override val timeout: Duration,
                 override val executor: Executor = Executors.newSingleThreadExecutor(),
                 internal val defaultPartner: String? = null,
                 internal val defaultLocation: String? = null) : RPCClient(), ServiceClient {
  // -- Internals -- //
  /**
   * Specifies contextual information for a menu operation.
   */
  data class MenuContext(internal val partner: String? = null,
                         internal val location: String? = null) {
    companion object {
      /**
       * Generate a default menu context.
       */
      fun defaultContext() = MenuContext()
    }

    /**
     * Serialize this menu context.
     */
    fun serialize(partner: String? = null,
                  location: String? = null): MenuContext =
          MenuContext(
                partner = this.partner ?: partner,
                location = this.location ?: location)
  }

  /**
   * Auth interceptor for menu requests.
   */
  class MenuInterceptor(val apikey: String?) : ClientInterceptor {
    companion object {
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
   * Header interceptor.
   */
  private val interceptor = MenuInterceptor(apiKey)

  /**
   * Channel for client->server traffic.
   */
  override val channel: ManagedChannel = NettyChannelBuilder
        .forAddress(host, port)
        .executor(executor)
        .sslContext(GrpcSslContexts.forClient()
              .trustManager(this.javaClass.getResourceAsStream(authorityRoots))
              .build())
        .negotiationType(NegotiationType.TLS)
        .intercept(interceptor)
        .build()

  /**
   * Main function to run the server.
   */
  companion object {
    /**
     * Authority root certificates location.
     */
    private const val authorityRoots = "/authority-roots.pem"
  }

  /**
   * Validate menu context for required values before sending.
   */
  @Throws(ServiceClientException::class)
  private fun validateMenuContext(context: MenuContext) {
    context.partner ?: throw ServiceClientException(MenuClientError.PARTNER_INVALID)
    context.location ?: throw ServiceClientException(MenuClientError.LOCATION_INVALID)
    if (context.partner.length < 2) throw ServiceClientException(MenuClientError.PARTNER_INVALID)
    if (context.location.length < 2) throw ServiceClientException(MenuClientError.LOCATION_INVALID)
  }

  // -- Stubs -- //
  /**
   * Future-based call stub.
   */
  private val future: MenuGrpc.MenuFutureStub = MenuGrpc.newFutureStub(channel)

  // -- API: Retrieve Menu -- //
  /**
   * Fetch the entire menu for a given location.
   */
  @Throws(ServiceClientException::class, StatusRuntimeException::class)
  fun retrieve(context: MenuContext = MenuContext.defaultContext(),
               full: Boolean = false): GetMenu.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation)
    validateMenuContext(rendered)

    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = GetMenu.Request.newBuilder()
          .setScope("partners/$partnerKey/locations/$locationKey")

    if (full) request.full = true

    return this.future.retrieve(request.build())
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
  }
}
