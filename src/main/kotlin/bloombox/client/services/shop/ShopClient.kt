
package bloombox.client.services.shop

import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.err.ServiceClientException
import bloombox.client.internals.rpc.RPCClient
import io.bloombox.schema.commerce.CommercialOrder
import io.bloombox.schema.partner.PartnerKey
import io.bloombox.schema.partner.PartnerLocationKey
import io.bloombox.schema.services.shop.ShopGrpc
import io.bloombox.schema.services.shop.SubmitOrder
import io.bloombox.schema.services.shop.VerifyMember
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.logging.Logger


/**
 * Shop RPC client.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class ShopClient(override val host: String,
                 override val port: Int,
                 override val apiKey: String,
                 override val enableLogging: Boolean = true,
                 override val executor: Executor = Executors.newSingleThreadExecutor(),
                 internal val defaultPartner: String? = null,
                 internal val defaultLocation: String? = null,
                 internal val deviceUUID: String? = null): RPCClient(), ServiceClient {
  /**
   * Specifies contextual information for a shop operation.
   */
  data class ShopContext(internal val partner: String? = null,
                         internal val location: String? = null,
                         internal val deviceUUID: String? = null) {
    companion object {
      /**
       * Generate a default shop context.
       */
      fun defaultContext() = ShopContext()
    }

    /**
     * Serialize this shop context.
     */
    fun serialize(partner: String? = null,
                  location: String? = null,
                  deviceUUID: String? = null): ShopContext =
            ShopContext(
              partner = this.partner ?: partner,
              location = this.location ?: location,
              deviceUUID = this.deviceUUID ?: deviceUUID)
  }

  /**
   * Auth interceptor for shop requests.
   */
  class ShopInterceptor(val apikey: String?): ClientInterceptor {
    companion object {
      val apiKeyHeader: Metadata.Key<String> = Metadata.Key.of(
              "x-api-key", Metadata.ASCII_STRING_MARSHALLER)
    }

    override fun <ReqT : Any?, RespT : Any?> interceptCall(method: MethodDescriptor<ReqT, RespT>?,
                                                           callOptions: CallOptions?,
                                                           next: Channel?): ClientCall<ReqT, RespT>? {
      if (next == null)
        return null

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
  private val interceptor = ShopInterceptor(apiKey)

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
   * Blocking call stub.
   */
  private val blocking: ShopGrpc.ShopBlockingStub = ShopGrpc.newBlockingStub(channel)

  /**
   * Non-blocking call stub.
   */
  private val async: ShopGrpc.ShopStub = ShopGrpc.newStub(channel)

  /**
   * Future-based call stub.
   */
  private val future: ShopGrpc.ShopFutureStub = ShopGrpc.newFutureStub(channel)

  /**
   * Main function to run the server.
   */
  companion object {
    /**
     * Authority root certificates location.
     */
    private const val authorityRoots = "/authority-roots.pem"

    /**
     * Logging tools.
     */
    private val logging = Logger.getLogger("ShopClient")
  }

  /**
   * Validate shop context for required values before sending.
   */
  @Throws(ServiceClientException::class)
  private fun validateShopContext(context: ShopContext) {
    context.partner ?: throw ServiceClientException(ShopError.PARTNER_INVALID)
    context.location ?: throw ServiceClientException(ShopError.LOCATION_INVALID)
  }

  /**
   * Verify a member.
   */
  @Throws(ServiceClientException::class)
  fun verifyMember(email: String,
                   context: ShopContext = ShopContext.defaultContext()): VerifyMember.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    // must have partner/location key by now - they are validated above
    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = VerifyMember.Request.newBuilder()
            .setEmailAddress(email)
            .setLocation(PartnerLocationKey.newBuilder()
                    .setCode(locationKey)
                    .setPartner(PartnerKey.newBuilder()
                            .setCode(partnerKey)))
            .build()

    try {
      return this.blocking.verifyMember(request)

    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Submit an order to the shop service.
   */
  @Throws(ServiceClientException::class)
  fun submitOrder(order: CommercialOrder.Order,
                  context: ShopContext = ShopContext.defaultContext()): SubmitOrder.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    // must have partner/location key by now - they are validated above
    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = SubmitOrder.Request.newBuilder()
            .setOrder(order)
            .setLocation(PartnerLocationKey.newBuilder()
                    .setCode(locationKey)
                    .setPartner(PartnerKey.newBuilder()
                            .setCode(partnerKey)))
            .build()

    try {
      return this.blocking.submitOrder(request)

    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }
}
