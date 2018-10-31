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

import bloombox.client.ClientException
import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.mtls.ClientCredentials
import bloombox.client.internals.rpc.RPCClient
import com.google.common.util.concurrent.ListenableFuture
import io.bloombox.schema.services.menu.v1beta1.GetMenu
import io.bloombox.schema.services.menu.v1beta1.MenuGrpc
import io.grpc.*
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Menu API client. Provides access to menu/product catalog data for a particular partner and location pair. Menus can'
 * be requested in full or section by section. By default, items marked as "invisible" are not returned - these are
 * items considered out-of-stock or no longer carried by the partner. To retrieve all items, pass `full` as `true`.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class MenuClient(override val host: String,
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
   * Specifies contextual information for a menu operation. Required context items (aside from the standard API key
   * required for all operations) are the partner code and location code to consider when downloading menu data.
   */
  data class MenuContext(internal val partner: String? = null,
                         internal val location: String? = null) {
    companion object {
      /**
       * Generate a default menu context. This yields to the outer API client to resolve the desired partner and
       * location codes before submitting a request. One way or another they must be defined, or that's an error.
       */
      fun defaultContext() = MenuContext()
    }
  }

  /**
   * Channel for client->server traffic. Construction of this object is handled by the base RPC client class, which adds
   * necessary items like base interceptors and crypto assets.
   */
  override val channel: ManagedChannel = managedChannel(
        host = host,
        port = port,
        executor = executor,
        clientAuth = clientAuth,
        transportMode = transportMode,
        clientCredentials = clientCredentials,
        clientAuthorityRoots = clientAuthorityRoots)

  /**
   * Validate menu context required values before sending. These consist of the partner and location code. The API key
   * is validated by the underlying RPC client. All values are also validated by the server before processing begins.
   */
  @Throws(ClientException::class)
  private fun validateMenuContext(context: MenuContext,
                                  defaultPartner: String?,
                                  defaultLocation: String?): Pair<String, String> {
    val partner = context.partner ?: defaultPartner
    val location = context.location ?: defaultLocation
    partner ?: throw ClientException.fromClientError(MenuClientError.PARTNER_INVALID)
    location ?: throw ClientException.fromClientError(MenuClientError.LOCATION_INVALID)
    if (partner.length < 2) throw ClientException.fromClientError(MenuClientError.PARTNER_INVALID)
    if (location.length < 2) throw ClientException.fromClientError(MenuClientError.LOCATION_INVALID)
    return partner to location
  }

  // -- Stubs -- //
  private val future: MenuGrpc.MenuFutureStub = MenuGrpc.newFutureStub(channel)

  // -- API: Retrieve Menu -- //
  /**
   * Fetch an entire menu, asynchronously, for a given partner/location code pair. Every menu section is fetched. By
   * default, items marked as "invisible" (i.e. out of stock, or not carried any longer) are not returned. To fetch all
   * product catalog entries including these items, pass `true` for `full`.
   */
  @Throws(ClientException::class)
  fun retrieve(context: MenuContext = MenuContext.defaultContext(),
               full: Boolean = false,
               callback: MenuCallback?,
               err: MenuErrorCallback?): ListenableFuture<GetMenu.Response> {
    val (partnerKey, locationKey) = validateMenuContext(context, defaultPartner, defaultLocation)

    val request = GetMenu.Request.newBuilder()
          .setScope("partners/$partnerKey/locations/$locationKey")

    if (full) request.full = true
    return executeAndDispatchCallback(this.future.retrieve(request.build()), callback, err, timeout)
  }

  /**
   * Fetch an entire menu, synchronously, for a given partner/location code pair. Every menu section is fetched. By
   * default, items marked as "invisible" (i.e. out of stock, or not carried any longer) are not returned. To fetch all
   * product catalog entries including these items, pass `true` for `full`.
   */
  @Throws(ClientException::class)
  fun retrieve(context: MenuContext = MenuContext.defaultContext(),
               full: Boolean = false): GetMenu.Response =
        this.retrieve(context, full, null, null)
              .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
}
