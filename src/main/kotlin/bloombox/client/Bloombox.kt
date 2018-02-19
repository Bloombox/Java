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

package bloombox.client

import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.rpc.RPCClient
import bloombox.client.services.menu.MenuClient
import bloombox.client.services.shop.ShopClient
import bloombox.client.services.telemetry.TelemetryClient
import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Specifies a unified Bloombox API client, that is capable of calling methods on any service exposed by the Bloombox
 * Cloud Platform. At the time of writing, this includes:
 *
 * - `shop/v1`: Shop service. For submitting orders, verifying customers, enrolling customers, etc.
 * - `menu/v1beta1`: Menu service. For downloading product catalog data, subscribing to changes, and publishing updates.
 * - `telemetry/v1beta3`: Telemetry service. For submitting telemetry event data of different kinds.
 */
class Bloombox(
      /**
       * Settings to use for RPCs.
       */
      internal val settings: Settings,

      /**
       * Target to use for RPCs.
       */
      target: ClientTarget = ClientTarget.PRODUCTION) {
  // -- Settings -- //
  companion object {
    /**
     * Version for the library.
     */
    internal const val VERSION = "1.0-beta10"

    /**
     * API client variant name.
     */
    internal const val VARIANT = "full"

    /**
     * Shop client singleton.
     */
    internal var shopClientSingleton: ShopClient? = null

    /**
     * Menu client singleton.
     */
    internal var menuClientSingleton: MenuClient? = null

    /**
     * Telemetry client singleton.
     */
    internal var telemetryClientSingleton: TelemetryClient? = null
  }

  /**
   * Information about the company.
   */
  object Company {
    /**
     * Human-friendly company name.
     */
    const val name = "Bloombox"

    /**
     * Company legal name.
     */
    const val legalName = "Bloombox, LLC"
  }

  /**
   * Statically-set RPC client endpoints.
   */
  internal object Endpoints {
    /**
     * Production client endpoint.
     */
    internal const val production = "api.bloombox.cloud"

    /**
     * Sandbox endpoint. Requires special auth.
     */
    internal const val internal = "private.bloombox.cloud"

    /**
     * Sandbox endpoint. Requires special auth.
     */
    internal const val sandbox = "sandbox.usw1.bloombox.services"

    /**
     * Port to use for TLS-wrapped gRPC traffic.
     */
    internal const val grpcPort = 443

    /**
     * Port to use locally for the Telemetry service.
     */
    internal const val localTelemetryPort = 1090

    /**
     * Port to use locally for the Shop service.
     */
    internal const val localShopPort = 1091

    /**
     * Port to use locally for the Menu service.
     */
    internal const val localMenuPort = 1094
  }

  /**
   * Describes available API regions.
   */
  enum class APIRegion {
    USW1,
    USC1;

    /**
     * Fetch the region code for a given region.
     */
    val code: String get() = this.name.toLowerCase()
  }

  /**
   * Describes available API environments.
   */
  enum class APIEnvironment {
    PRODUCTION,
    STAGING,
    SANDBOX;

    /**
     * Fetch the region code for a given region.
     */
    val code: String get() = when (this) {
      PRODUCTION -> "prod"
      else -> { this.name.toLowerCase() }
    }
  }

  /**
   * Specifies client settings that can be passed in to modify RPC behavior.
   */
  data class Settings(
        /**
         * API key to use under the hood.
         */
        internal val apiKey: String,

        /**
         * Partner code.
         */
        internal val partner: String? = null,

        /**
         * Location code. Optional, and if specified, requires a partner code.
         */
        internal val location: String? = null,

        /**
         * Device UUID. Optional, and if specified, requires a partner and location code.
         */
        internal val device: String? = null,

        /**
         * Where needed, an explicit API region to prefer.
         */
        internal val region: APIRegion = APIRegion.USW1,

        /**
         * API environment to prefer.
         */
        internal val environment: APIEnvironment = APIEnvironment.PRODUCTION,

        /**
         * Executor to use for followup tasks and client RPC execution.
         */
        internal val executor: Executor = Executors.newSingleThreadExecutor(),

        /**
         * Timeout value for unary (i.e., non-streaming) requests.
         */
        internal val requestTimeout: Duration = Duration.ofSeconds(30),

        /**
         * Timeout to wait for a client to close its connection.
         */
        internal val closeTimeout: Duration = Duration.ofSeconds(10),

        /**
         * Client-side TLS credentials, for mTLS functionality.
         */
        internal val clientCredentials: RPCClient.ClientCredentials? = null)

  /**
   * Specifies client target settings understood by the Java/Kotlin client.
   */
  enum class ClientTarget {
    /**
     * Send RPCs to localhost.
     */
    LOCAL,

    /**
     * Send RPCs to the sandbox. Requires special auth.
     */
    SANDBOX,

    /**
     * Send RPCs to internal gRPC endpoints. Requires special auth.
     */
    INTERNAL,

    /**
     * Send RPCs to production. This is the default.
     */
    PRODUCTION;
  }

  // -- Internals -- //
  /**
   * Resolve the host endpoint for the selected client target.
   */
  private fun ClientTarget.host(region: APIRegion = APIRegion.USW1,
                                environment: APIEnvironment = APIEnvironment.PRODUCTION): String =
        when (this) {
          ClientTarget.LOCAL -> "127.0.0.1"
          ClientTarget.PRODUCTION -> Bloombox.Endpoints.production
          ClientTarget.INTERNAL -> "${environment.code}.${region.code}.${Bloombox.Endpoints.internal}"
          ClientTarget.SANDBOX -> Bloombox.Endpoints.sandbox
        }

  /**
   * Holds references to each RPC service, so calls may be proxied to them.
   */
  private inner class Services(private val domain: String,
                               private val apiKey: String,
                               private val ct: ClientTarget) {
    /**
     * Shop client. Offers the ability to submit or query orders, verify or enroll users, check shop status and zipcode
     * delivery eligibility, and so on.
     */
    private fun shopClient(): ShopClient {
      return if (ct == ClientTarget.LOCAL) {
        ShopClient(
              domain,
              Bloombox.Endpoints.localShopPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location)
      } else {
        ShopClient(
              when (ct) {
                ClientTarget.SANDBOX,
                ClientTarget.INTERNAL -> {
                  "shop.rpc.$domain"
                }
                else -> {
                  "shop.$domain"
                }
              },
              Bloombox.Endpoints.grpcPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location)
      }
    }

    /**
     * Fetch a Shop client singleton.
     */
    internal fun shop(): ShopClient {
      if (shopClientSingleton == null) {
        shopClientSingleton = shopClient()
      }
      return shopClientSingleton!!
    }

    /**
     * Telemetry client. Offers RPC access to telemetry data ingest services.
     */
    private fun telemetryClient(): TelemetryClient {
      return if (ct == ClientTarget.LOCAL) {
        TelemetryClient(
              domain,
              Bloombox.Endpoints.localTelemetryPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location,
              deviceUUID = settings.device)
      } else {
        TelemetryClient(
              when (ct) {
                ClientTarget.SANDBOX,
                ClientTarget.INTERNAL -> {
                  "telemetry.rpc.$domain"
                }
                else -> {
                  "telemetry.$domain"
                }
              },
              Bloombox.Endpoints.grpcPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location,
              deviceUUID = settings.device)
      }
    }

    /**
     * Fetch a Telemetry client singleton.
     */
    internal fun telemetry(): TelemetryClient {
      if (telemetryClientSingleton == null) {
        telemetryClientSingleton = telemetryClient()
      }
      return telemetryClientSingleton!!
    }

    /**
     * Menu client. Offers RPC access to retrieve and update menu data.
     */
    private fun menuClient(): MenuClient {
      return if (ct == ClientTarget.LOCAL) {
        MenuClient(
              domain,
              Bloombox.Endpoints.localMenuPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location)
      } else {
        MenuClient(
              when (ct) {
                ClientTarget.SANDBOX,
                ClientTarget.INTERNAL -> { "menu.rpc.$domain" }
                else -> { "menu.$domain" }
              },
              Bloombox.Endpoints.grpcPort,
              apiKey,
              timeout = settings.requestTimeout,
              executor = settings.executor,
              defaultPartner = settings.partner,
              defaultLocation = settings.location)
      }
    }

    /**
     * Fetch a Menu client singleton.
     */
    internal fun menu(): MenuClient {
      if (menuClientSingleton == null) {
        menuClientSingleton = menuClient()
      }
      return menuClientSingleton!!
    }

    /**
     * Reference to all mounted/supported services.
     */
    internal fun allServices(): Array<ServiceClient?> = arrayOf(
          shopClientSingleton, menuClientSingleton, telemetryClientSingleton)
  }

  /**
   * Private access to service clients.
   */
  private val services = Services(
        target.host(settings.region, settings.environment),
        settings.apiKey,
        target)

  // -- Public Methods -- //
  /**
   * Close all client connections.
   */
  fun close(soft: Boolean = true,
            block: Boolean = true,
            timeout: Duration? = null) {
    val closeTimeout: Duration = timeout ?: settings.closeTimeout
    services.allServices().forEach {
      it?.close(
            soft,
            block,
            Pair(closeTimeout.toMillis(), TimeUnit.MILLISECONDS))
    }
  }

  // -- Public Services -- //
  /**
   * Fetch a reference to the Shop API client.
   */
  fun shop(): ShopClient = services.shop()

  /**
   * Fetch a reference to the Telemetry API client.
   */
  fun telemetry(): TelemetryClient = services.telemetry()

  /**
   * Fetch a reference to the Menu API client.
   */
  fun menu(): MenuClient = services.menu()
}
