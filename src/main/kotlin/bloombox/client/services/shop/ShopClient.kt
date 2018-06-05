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

package bloombox.client.services.shop

import bloombox.client.ClientException
import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.mtls.ClientCredentials
import bloombox.client.internals.rpc.RPCClient
import com.google.common.util.concurrent.ListenableFuture
import io.opencannabis.schema.commerce.CommercialOrder
import io.bloombox.schema.partner.PartnerKeyOuterClass.PartnerKey
import io.bloombox.schema.partner.PartnerLocationOuterClass.PartnerLocationKey
import io.bloombox.schema.services.shop.v1.*
import io.grpc.*
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Shop API client. Provides access to digital storefront and vendor services. With this API, you can communicate with
 * the Bloombox Shop service to retrieve shop info and hours, verify and enroll members, and submit and retrieve
 * commercial orders, among other things.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate", "MemberVisibilityCanBePrivate")
class ShopClient(override val host: String,
                 override val port: Int,
                 override val apiKey: String,
                 override val timeout: Duration,
                 override val transportMode: TransportMode = TransportMode.SECURE,
                 override val clientAuth: ClientAuth = ClientAuth.NONE,
                 override val clientCredentials: ClientCredentials? = null,
                 override val clientAuthorityRoots: InputStream? = null,
                 override val executor: Executor = Executors.newSingleThreadExecutor(),
                 internal val defaultPartner: String? = null,
                 internal val defaultLocation: String? = null) : RPCClient(apiKey), ServiceClient {
  // -- Internals -- //
  /**
   * Specifies contextual information for a shop operation. Required info, aside from the standard API key required for
   * all transactions with the Bloombox API, includes the desired partner and location code. They can be specified here
   * to override context for a specific client instance or request. If left unspecified, defaults are used.
   */
  data class ShopContext(internal val partner: String? = null,
                         internal val location: String? = null) {
    companion object {
      /**
       * Generate a default shop context. In this case, resolution of the partner and location code is left to the outer
       * library context. This is most useful in cases where the partner and location code won't change during the
       * lifetime of an API client.
       */
      fun defaultContext() = ShopContext()
    }
  }

  /**
   * Channel for client->server traffic. Construction of this object is handled by the base RPC client class, which adds
   * necessary items like base interceptors and crypto assets.
   */
  override val channel: ManagedChannel = channelBuilder(
        host = host,
        port = port,
        executor = executor,
        clientAuth = clientAuth,
        transportMode = transportMode,
        clientCredentials = clientCredentials,
        clientAuthorityRoots = clientAuthorityRoots).build()

  /**
   * Validate shop context required values before sending. These consist of the partner and location code. The API key
   * is validated by the underlying RPC client. All values are also validated by the server before processing begins.
   */
  @Throws(ClientException::class)
  private fun validateShopContext(context: ShopContext,
                                  defaultPartner: String?,
                                  defaultLocation: String?): Pair<String, String> {
    val partner = context.partner ?: defaultPartner
    val location = context.location ?: defaultLocation
    partner ?: throw ClientException.fromClientError(ShopClientError.PARTNER_INVALID)
    location ?: throw ClientException.fromClientError(ShopClientError.LOCATION_INVALID)
    if (partner.length < 2) throw ClientException.fromClientError(ShopClientError.PARTNER_INVALID)
    if (location.length < 2) throw ClientException.fromClientError(ShopClientError.LOCATION_INVALID)
    return partner to location
  }

  // -- Stubs -- //
  private val service: ShopGrpc.ShopFutureStub = ShopGrpc.newFutureStub(channel)

  // -- API: Shop Hours -- //
  /**
   * Fetch "top-of-the-fold" (i.e. the most critical) information about a particular digital storefront, asynchronously.
   * This includes its current status (OPEN/CLOSED/{PICKUP|DELIVERY}_ONLY) and any other requisite information to render
   * a page. This may change in the future.
   */
  @Throws(ClientException::class)
  fun info(callback: InfoCallback?,
           err: ShopErrorCallback?,
           context: ShopContext = ShopContext.defaultContext()): ListenableFuture<ShopInfo.Response> {
    // validate and render context in one go
    val (partnerKey, locationKey) = validateShopContext(context, defaultPartner, defaultLocation)

    val request = ShopInfo.Request.newBuilder()
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    return executeAndDispatchCallback(this.service.shopInfo(request), callback, err, timeout)
  }

  /**
   * Fetch "top-of-the-fold" (i.e. the most critical) information about a particular digital storefront. This includes
   * its current status (OPEN/CLOSED/{PICKUP|DELIVERY}_ONLY) and any other requisite information to render a page. This
   * may change in the future.
   */
  @Throws(ClientException::class)
  fun info(context: ShopContext = ShopContext.defaultContext()): ShopInfo.Response =
    this.info(null, null, context)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

  // -- API: Zip Check -- //
  /**
   * Fetch information about a given U.S. zipcode, with regard to storefront sales, asynchronously. The resulting info
   * contains support status for delivery to the subject zipcode, and any delivery minimum subtotal value, if specified.
   * "NOT_FOUND", or 404 when operating over HTTP, is interpreted to mean the zipcode is not supported.
   */
  @Throws(ClientException::class)
  fun checkZipcode(zipcode: String,
                   callback: ZipcheckCallback?,
                   err: ShopErrorCallback?,
                   context: ShopContext = ShopContext.defaultContext()): ListenableFuture<CheckZipcode.Response> {
    // validate and render context in one go
    val (partnerKey, locationKey) = validateShopContext(context, defaultPartner, defaultLocation)

    val request = CheckZipcode.Request.newBuilder()
          .setZipcode(zipcode)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    return executeAndDispatchCallback(this.service.checkZipcode(request), callback, err, timeout)
  }

  /**
   * Fetch information about a given U.S. zipcode, with regard to storefront sales. The resulting info contains support
   * status for delivery to the subject zipcode, and any delivery minimum subtotal value, if specified. "NOT_FOUND", or
   * 404 when operating over HTTP, is interpreted to mean the zipcode is not supported.
   */
  @Throws(ClientException::class)
  fun checkZipcode(zipcode: String,
                   context: ShopContext = ShopContext.defaultContext()): CheckZipcode.Response =
    this.checkZipcode(zipcode, null, null, context)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

  // -- API: Member Verification -- //
  /**
   * Verify that an end user account is a valid and active member of the subject partner and location, asynchronously.
   * This involves re-verifying the subject account's identification and medical recommendation (if applicable), and
   * checking to make sure they are an active member of the specified digital storefront (addressed by its partner and
   * location code pair).
   */
  @Throws(ClientException::class)
  fun verifyMember(email: String,
                   callback: VerifyMemberCallback?,
                   err: ShopErrorCallback?,
                   context: ShopContext = ShopContext.defaultContext()): ListenableFuture<VerifyMember.Response> {
    // validate and render context in one go
    val (partnerKey, locationKey) = validateShopContext(context, defaultPartner, defaultLocation)

    val request = VerifyMember.Request.newBuilder()
          .setEmailAddress(email)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey)))
          .build()

    return executeAndDispatchCallback(this.service.verifyMember(request), callback, err, timeout)
  }

  /**
   * Verify that an end user account is a valid and active member of the subject partner and location, synchronously.
   * This involves re-verifying the subject account's identification and medical recommendation (if applicable), and
   * checking to make sure they are an active member of the specified digital storefront (addressed by its partner and
   * location code pair).
   */
  @Throws(ClientException::class)
  fun verifyMember(email: String,
                   context: ShopContext = ShopContext.defaultContext()): VerifyMember.Response =
    this.verifyMember(email, null, null, context)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

  // -- API: Order Submission -- //
  /**
   * Submit a commercial order, asynchronously, to a particular digital storefront via the shop service (identified by
   * a partner and location code pair). The ordering customer must be a valid member of the storefront at the specified
   * partner and location code pair, in addition to being a valid and active user account at all (i.e. active and valid
   * identification, medical recommendation if applicable, and good account standing). Items in the order are specified
   * as product keys with an associated desired count.
   */
  @Throws(ClientException::class)
  fun submitOrder(order: CommercialOrder.Order,
                  callback: SubmitOrderCallback?,
                  err: ShopErrorCallback?,
                  context: ShopContext = ShopContext.defaultContext()): ListenableFuture<SubmitOrder.Response> {
    // validate and render context in one go
    val (partnerKey, locationKey) = validateShopContext(context, defaultPartner, defaultLocation)

    val request = SubmitOrder.Request.newBuilder()
          .setOrder(order)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey)))
          .build()

    return executeAndDispatchCallback(this.service.submitOrder(request), callback, err, timeout)
  }

  /**
   * Submit a commercial order, synchronously, to a particular digital storefront via the shop service (identified by a
   * partner and location code pair). The ordering customer must be a valid member of the storefront at the specified
   * partner and location code pair, in addition to being a valid and active user account at all (i.e. active and valid
   * identification, medical recommendation if applicable, and good account standing). Items in the order are specified
   * as product keys with an associated desired count.
   */
  @Throws(ClientException::class)
  fun submitOrder(order: CommercialOrder.Order,
                  context: ShopContext = ShopContext.defaultContext()): SubmitOrder.Response =
    this.submitOrder(order, null, null, context)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

  // -- API: Order Retrieval -- //
  /**
   * Fetch a commercial order, asynchronously, with all associated data, including its status, action history, ordering
   * customer info, and constituent order items. If the order could not be found, or the invoking client does not have
   * access to the order, a "NOT_FOUND" status is returned (code 404 if operating over HTTP).
   */
  @Throws(ClientException::class)
  fun getOrder(id: String,
               callback: GetOrderCallback?,
               err: ShopErrorCallback?,
               context: ShopContext = ShopContext.defaultContext()): ListenableFuture<GetOrder.Response> {
    // validate and render context in one go
    val (partnerKey, locationKey) = validateShopContext(context, defaultPartner, defaultLocation)

    val request = GetOrder.Request.newBuilder()
          .setOrderId(id)
          .setLocation(PartnerLocationKey.newBuilder()
                .setCode(locationKey)
                .setPartner(PartnerKey.newBuilder()
                      .setCode(partnerKey))).build()

    return executeAndDispatchCallback(this.service.getOrder(request), callback, err, timeout)
  }

  /**
   * Fetch a commercial order, synchronously, with all associated data, including its status, action history, ordering
   * customer info, and constituent order items. If the order could not be found, or the invoking client does not have
   * access to the order, a "NOT_FOUND" status is returned (code 404 if operating over HTTP).
   */
  @Throws(ClientException::class)
  fun getOrder(id: String,
               context: ShopContext = ShopContext.defaultContext()): GetOrder.Response =
    this.getOrder(id, null, null, context)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
}
