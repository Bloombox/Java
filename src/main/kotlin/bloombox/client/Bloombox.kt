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
import bloombox.client.internals.mtls.ClientCredentials
import bloombox.client.services.menu.MenuClient
import bloombox.client.services.shop.ShopClient
import bloombox.client.services.telemetry.TelemetryClient

import java.time.Duration
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Specifies a unified Bloombox API client, that is capable of calling methods on any service exposed by the Bloombox
 * Cloud Platform. This is accomplished by integrating with lower-level gRPC-based APIs. Under the hood, Protobuf is
 * used over HTTP2. Services are lazy-loaded and maintain a live connection with a reasonable keepalive (10 minutes).
 *
 * At the time of writing, supported services include:
 * - `shop/v1`: Shop service. For submitting orders, verifying customers, enrolling customers, etc.
 * - `menu/v1beta1`: Menu service. For downloading product catalog data, subscribing to changes, and publishing updates.
 * - `telemetry/v1beta3`: Telemetry service. For submitting telemetry event data of different kinds.
 */
@Suppress("unused")
class Bloombox constructor (
      /**
       * Settings to use for RPCs. These are applied to each service and in some cases act as fallback values for values
       * configured at the service level. Library-global settings are specified here.
       */
      internal val settings: Settings,

      /**
       * Target to use for RPCs. This is almost always "PRODUCTION." If you are running a sandbox or local copy of the
       * Bloombox Cloud APIs, change this value to either "SANDBOX" or "LOCAL."
       */
      target: ClientTarget = ClientTarget.PRODUCTION) {
  // -- Settings -- //
  companion object {
    /**
     * Version for the library. This is sent with telemetry information and kept around so the user has a way to access
     * and know the active library version at runtime.
     */
    internal const val VERSION = "1.4"

    /**
     * API client variant name. In all cases, for now, this is "full," indicating a full client library. If other,
     * customized variants of the library are created and designated, each would express their own variant value here.
     */
    internal const val VARIANT = "full"

    /**
     * Number of seconds to set the close timeout to. After this duration of inactivity, active connections with remote
     * Bloombox cloud services are closed.
     */
    internal const val defaultCloseTimeoutDuration: Long = 10

    /**
     * Number of seconds to set the request timeout to. During a request/response cycle, if this amount of time passes,
     * the request is considered failed and "timed out."
     */
    internal const val defaultRequestTimeoutDuration: Long = 30
  }

  /**
   * Describes available API regions. In some cases, library users may want to force-direct (or at least prefer) a
   * particular API hosting region. Available options are "USW1" (hosted in Oregon, USA) or "USC1" (hosted in South
   * Carolina, USA).
   */
  enum class APIRegion {
    /**
     * 'USW1' region code, which stands for "US West 1." Hosted from The Dalles, Oregon, on Google Cloud Platform. Use
     * this for mostly west-coast-bound or originating traffic.
     */
    USW1,

    /**
     * 'USC1' region code, which stands for "US Central 1." Hosted from South Carolina on Google Cloud Platform. Use
     * this for east-coast-bound or central-US originating traffic.
     */
    USC1;

    /**
     * Fetch the region code for a given region. This is basically the name of the region, i.e. 'USW1' or 'USC1', but
     * in lowercase.
     */
    val code: String get() = this.name.toLowerCase()
  }

  /**
   * Describes available API environments. In some cases, you may want to test systems against bleeding-edge or beta
   * versions of Bloombox services. Use 'STAGING' to test against the beta environment. 'SANDBOX' is reserved for
   * internal use only and refuses non-internal traffic. Note that this value describes the data namespace in use for a
   * given API client, not the systems the traffic is sent to.
   */
  enum class APIEnvironment {
    /**
     * Production API namespace. Default.
     */
    PRODUCTION,

    /**
     * Staging or beta API namespace.
     */
    STAGING,

    /**
     * Sandbox namespace, for internal use only.
     */
    SANDBOX;

    /**
     * Fetch the region code for a given region. This is basically the name of the environment, but in lowercase, except
     * for one exception: "production" has the code, "prod."
     */
    val code: String get() = when (this) {
      PRODUCTION -> "prod"
      else -> this.name.toLowerCase()
    }
  }

  /**
   * Specifies client target settings understood by the Java/Kotlin client. In some cases, you may want to test systems
   * against bleeding-edge or beta versions of Bloombox services. This enum directs traffic to one service cluster or
   * another, note that it does not affect the active data namespace (unless 'SANDBOX' is used, in which 'SANDBOX' is
   * enforced for the API environment value).
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

  /**
   * Specifies client settings that can be passed in to modify RPC behavior.
   */
  data class Settings(
        /**
         * API key to use. The API key identifies the originating project for the API traffic, or the application that
         * is integrating with Bloombox.
         */
        internal val apiKey: String,

        /**
         * Partner code. This specifies the organizational account for which traffic will be sent over the API. This
         * value is API-client-level and applied as a default to services held by the client. In many cases, this value
         * can be overridden for individual services or calls.
         */
        internal val partner: String? = null,

        /**
         * Location code. Optional, and if specified, requires a partner code. This specifies the location or sub-
         * organization under the specified `partner` to be applied for subject traffic. This value is API-client-level
         * and applied as a default to services held by the client. In many cases, this value can be overridden for
         * individual services or calls.
         */
        internal val location: String? = null,

        /**
         * Device UUID. Optional, and if specified, requires a partner and location code. This specifies a known,
         * partner-co-located device ID. Used particularly in the Telemetry API and in general for internal use only.
         */
        internal val device: String? = null,

        /**
         * Where needed, an explicit API region to prefer. This defaults to the primary API hosting region, "USW1,"
         * which is hosted in The Dalles, Oregon. If South Carolina is closer to you, feel free to set this to "USC1."
         */
        internal val region: APIRegion = APIRegion.USW1,

        /**
         * Enable or disable debug logging. If this flag is set to `true`, the API client will log various things about
         * what it's doing to the standard Java logging facade.
         */
        internal val enableLogging: Boolean = false,

        /**
         * API environment to prefer. This defaults to "PRODUCTION," which is the API interface into live Bloombox
         * services. Other options include "STAGING," which is an isolated data namespace for testing and evaluation of
         * upcoming features.
         */
        internal val environment: APIEnvironment = APIEnvironment.PRODUCTION,

        /**
         * Executor to use for followup tasks and client RPC execution. Defaults to a simple, single-threaded executor
         * to automatically perform API requests in the background.
         */
        internal val executor: Executor = Executors.newSingleThreadExecutor(),

        /**
         * Timeout value for unary (i.e., non-streaming) requests. When a request is placed in-flight, a timer starts.
         * If this many seconds pass without a response from the server, the request is considered failed and "timed
         * out." The default value for the request timeout is 30 seconds.
         */
        internal val requestTimeout: Duration = Duration.ofSeconds(defaultRequestTimeoutDuration),

        /**
         * Timeout value for unary (i.e., non-streaming) connections. After this number of seconds of inactivity over a
         * non-streaming connection, it is closed and re-opened again when needed.
         */
        internal val closeTimeout: Duration = Duration.ofSeconds(defaultCloseTimeoutDuration),

        /**
         * Client-side TLS credentials, for mTLS functionality. Specifies a set of cryptographic credential information
         * for use in identifying this particular client (includes a private key and certificate chain). Authority
         * information is embedded in the API client.
         */
        internal val clientCredentials: ClientCredentials? = null) {
    companion object {
      /**
       * Generate default settings for a given partner, location, and API key, which is the minimum amount of
       * configuration for a given API settings instance.
       */
      fun defaults(apiKey: String,
                   partner: String,
                   location: String): Settings =
            Settings(
                  apiKey = apiKey,
                  partner = partner,
                  location = location)

      /**
       * Generate default settings for a given partner, location, and API key, which is the minimum amount of
       * configuration for a given API settings instance.
       */
      fun withLogging(apiKey: String,
                      partner: String,
                      location: String): Settings =
            Settings(
                  apiKey = apiKey,
                  partner = partner,
                  location = location,
                  enableLogging = true)
    }
  }

  /**
   * Statically-set RPC client endpoints. Different API client targets consume and send data from/to these various
   * endpoints, depending on the circumstances and active environment.
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

  // -- Internals -- //
  private fun ClientTarget.host(region: APIRegion = APIRegion.USW1,
                                environment: APIEnvironment = APIEnvironment.PRODUCTION): String =
        when (this) {
          ClientTarget.LOCAL -> "127.0.0.1"
          ClientTarget.PRODUCTION -> Endpoints.production
          ClientTarget.INTERNAL -> "${environment.code}.${region.code}.${Endpoints.internal}"
          ClientTarget.SANDBOX -> Endpoints.sandbox
        }

  /**
   * Holds references to each RPC service, so calls may be proxied to them. Each of the enclosed objects is an
   * implementation of a backing gRPC service specification that may be communicated with over the managed channel
   * embedded in each constituent object.
   */
  private inner class Services(
        /**
         * Target domain to send traffic to. In general, this is either prepended to to produce a service-specific API
         * endpoint, or it is used raw if all traffic is being sent to a single domain.
         */
        private val domain: String,

        /**
         * API key to use. The originating project or integration system is identified with this value. It can be
         * obtained from the Bloombox Dashboard or via an integrated Google Cloud Platform project.
         */
        private val apiKey: String,

        /**
         * Which target domain is active. In certain circumstances, the domain is mutated or used verbatim according to
         * the client target value.
         */
        private val ct: ClientTarget) {
    /**
     * Service map, where we can lookup services as they are added to the services list. This allows the ability to look
     * an active service instance up by its service name. For instance, the Shop API may be acquired at the key "shop."
     */
    private var serviceMap: HashMap<String, ServiceClient> = HashMap()

    /**
     * Shop client. Offers the ability to submit or query orders, verify or enroll users, check shop status and zipcode
     * delivery eligibility, and so on. Powered by digital storefront features of the Bloombox platform, and integrates
     * with the embedded web store.
     */
    internal fun shopClient(): ShopClient {
      return if (serviceMap["shop"] == null) {
        // we have no shop service yet
        val shopClient = if (ct == ClientTarget.LOCAL) {
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
                  ClientTarget.INTERNAL -> "shop.rpc.$domain"
                  else -> "shop.$domain"
                },
                Bloombox.Endpoints.grpcPort,
                apiKey,
                timeout = settings.requestTimeout,
                executor = settings.executor,
                defaultPartner = settings.partner,
                defaultLocation = settings.location)
        }

        serviceMap["shop"] = shopClient
        shopClient
      } else {
        // use existing shop service
        serviceMap["shop"] as? ShopClient
      } ?: throw IllegalStateException("Failed to initialize shop client.")
    }

    /**
     * Telemetry client. Offers RPC access to telemetry data ingest services. Events may be sent to the Telemetry Cloud
     * API so they may be later correlated with standard telemetry during analysis and reporting. Partners may also
     * elect to send their own analytics data for ad-hoc reporting.
     */
    internal fun telemetryClient(): TelemetryClient {
      return if (serviceMap["telemetry"] == null) {
        val telemetryClient = if (ct == ClientTarget.LOCAL) {
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
                  ClientTarget.INTERNAL -> "telemetry.rpc.$domain"
                  else -> "telemetry.$domain"
                },
                Bloombox.Endpoints.grpcPort,
                apiKey,
                timeout = settings.requestTimeout,
                executor = settings.executor,
                defaultPartner = settings.partner,
                defaultLocation = settings.location,
                deviceUUID = settings.device)
        }

        serviceMap["telemetry"] = telemetryClient
        telemetryClient
      } else {
        serviceMap["telemetry"] as? TelemetryClient
      } ?: throw IllegalStateException("Failed to initialize telemetry client.")
    }

    /**
     * Menu client. Offers RPC access to retrieve and update product catalog data. Menus may be retrieved in full, or
     * section-by-section. By default, items that are "invisible" (i.e. out-of-stock or no longer carried) are withheld
     * from the response.
     */
    internal fun menuClient(): MenuClient {
      return if (serviceMap["menu"] == null) {
        val menuClient = if (ct == ClientTarget.LOCAL) {
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
                  ClientTarget.INTERNAL -> "menu.rpc.$domain"
                  else -> "menu.$domain"
                },
                Bloombox.Endpoints.grpcPort,
                apiKey,
                timeout = settings.requestTimeout,
                executor = settings.executor,
                defaultPartner = settings.partner,
                defaultLocation = settings.location)
        }

        serviceMap["menu"] = menuClient
        menuClient
      } else {
        serviceMap["menu"] as? MenuClient
      } ?: throw IllegalStateException("Failed to initialize menu client.")
    }

    /**
     * Reference to all mounted/supported services. For each service that has been initialized within the lifetime of
     * this API client, return a reference to the client object.
     */
    internal fun allServices(): Array<ServiceClient?> = Array(serviceMap.size, {
      serviceMap.values.elementAt(it)
    })
  }

  /**
   * Private access to service clients. This object mediates between the main API client facade and underlying services,
   * passing through the API key and target/environment for traffic.
   */
  private val services = Services(
        target.host(settings.region, settings.environment),
        settings.apiKey,
        target)

  // -- Public Methods -- //
  /**
   * Close all client connections. For each service that has been initialized within the lifetime of this API client,
   * sever any active connections and evict any related resources from memory.
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
   * Shop client. Offers the ability to submit or query orders, verify or enroll users, check shop status and zipcode
   * delivery eligibility, and so on. Powered by digital storefront features of the Bloombox platform, and integrates
   * with the embedded web store.
   */
  fun shop(): ShopClient = services.shopClient()

  /**
   * Telemetry client. Offers RPC access to telemetry data ingest services. Events may be sent to the Telemetry Cloud
   * API so they may be later correlated with standard telemetry during analysis and reporting. Partners may also
   * elect to send their own analytics data for ad-hoc reporting.
   */
  fun telemetry(): TelemetryClient = services.telemetryClient()

  /**
   * Menu client. Offers RPC access to retrieve and update product catalog data. Menus may be retrieved in full, or
   * section-by-section. By default, items that are "invisible" (i.e. out-of-stock or no longer carried) are withheld
   * from the response.
   */
  fun menu(): MenuClient = services.menuClient()
}
