/*
 * Copyright 2017, Bloombox, LLC.
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

package bloombox.client.services.shop

import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.err.ServiceClientException
import bloombox.client.internals.rpc.RPCClient
import com.google.common.util.concurrent.ListenableFuture
import io.bloombox.schema.commerce.CommercialOrder
import io.bloombox.schema.partner.PartnerKey
import io.bloombox.schema.partner.PartnerLocationKey
import io.bloombox.schema.services.shop.*
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import java.util.logging.Logger


/**
 * Shop RPC client.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class ShopClient(override val host: String,
                 override val port: Int,
                 override val apiKey: String,
                 override val timeout: Duration,
                 override val enableLogging: Boolean = true,
                 override val executor: Executor = Executors.newSingleThreadExecutor(),
                 internal val defaultPartner: String? = null,
                 internal val defaultLocation: String? = null,
                 internal val deviceUUID: String? = null) : RPCClient(), ServiceClient {
  // -- Internals -- //
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
  class ShopInterceptor(val apikey: String?) : ClientInterceptor {
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

  // -- Stubs -- //
  /**
   * Future-based call stub.
   */
  private val future: ShopGrpc.ShopFutureStub = ShopGrpc.newFutureStub(channel)

  // -- API: Shop Hours -- //
  /**
   * Fetch hours info for the active partner/location pair.
   */
  @Throws(ServiceClientException::class)
  fun shopInfo(context: ShopContext = ShopContext.defaultContext()): ShopInfo.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = ShopInfo.Request.newBuilder()
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    try {
      return this.future.shopInfo(request)
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Fetch hours, asynchronously, for the active partner/location pair.
   */
  fun shopInfo(callback: Runnable? = null,
               context: ShopContext = ShopContext.defaultContext()): ListenableFuture<ShopInfo.Response> {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = ShopInfo.Request.newBuilder()
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    val op = this.future.shopInfo(request)
    if (callback != null) op.addListener(callback, executor)
    return op
  }

  // -- API: Zip Check -- //
  /**
   * Fetch delivery support status and minimum order value for a given US zipcode.
   */
  @Throws(ServiceClientException::class)
  fun zipCheck(zipcode: String,
               context: ShopContext = ShopContext.defaultContext()): CheckZipcode.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = CheckZipcode.Request.newBuilder()
          .setZipcode(zipcode)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    try {
      return this.future.checkZipcode(request)
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Fetch delivery support status and minimum order value, asynchronously, for a given US zipcode.
   */
  fun zipCheck(zipcode: String,
               callback: Runnable? = null,
               context: ShopContext = ShopContext.defaultContext()): ListenableFuture<CheckZipcode.Response> {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = CheckZipcode.Request.newBuilder()
          .setZipcode(zipcode)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    val op = this.future.checkZipcode(request)
    if (callback != null) op.addListener(callback, executor)
    return op
  }

  // -- API: Member Verification -- //
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
      return this.future.verifyMember(request)
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Verify a member asynchronously.
   */
  fun verifyMember(email: String,
                   callback: Runnable? = null,
                   context: ShopContext = ShopContext.defaultContext()): ListenableFuture<VerifyMember.Response> {
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

    val op = this.future.verifyMember(request)
    if (callback != null) op.addListener(callback, executor)
    return op
  }

  // -- API: Order Submission -- //
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
      return this.future.submitOrder(request)
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Submit an order, asynchronously, to the shop service.
   */
  fun submitOrder(order: CommercialOrder.Order,
                  callback: Runnable? = null,
                  context: ShopContext = ShopContext.defaultContext()): ListenableFuture<SubmitOrder.Response> {
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

    val op = this.future.submitOrder(request)
    if (callback != null) op.addListener(callback, executor)
    return op
  }

  // -- API: Order Retrieval -- //
  /**
   * Fetch an order along with its status.
   */
  @Throws(ServiceClientException::class)
  fun getOrder(id: String,
               context: ShopContext = ShopContext.defaultContext()): GetOrder.Response {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    // must have partner/location key by now - they are validated above
    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = GetOrder.Request.newBuilder()
          .setOrderId(id)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    try {
      return this.future.getOrder(request)
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

    } catch (e: StatusRuntimeException) {
      logging.severe("StatusRuntimeException: '${e.message}'")
      throw e
    }
  }

  /**
   * Fetch an order, asynchronously, along with its status.
   */
  fun getOrder(id: String,
               callback: Runnable? = null,
               context: ShopContext = ShopContext.defaultContext()): ListenableFuture<GetOrder.Response> {
    val rendered = context.serialize(defaultPartner, defaultLocation, deviceUUID)
    validateShopContext(rendered)

    // must have partner/location key by now - they are validated above
    val partnerKey = rendered.partner!!
    val locationKey = rendered.location!!

    val request = GetOrder.Request.newBuilder()
          .setOrderId(id)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    val op = this.future.getOrder(request)
    if (callback != null) op.addListener(callback, executor)
    return op
  }
}
