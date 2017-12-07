
package bloombox.client

import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.services.shop.ShopClient
import bloombox.client.internals.services.telemetry.TelemetryClient
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Specifies a unified Bloombox API client, that is capable of calling methods on any service exposed by the Bloombox
 * Cloud Platform. At the time of writing, this includes:
 *
 * - `shop/v1`: Shop service. For submitting orders, verifying customers, enrolling customers, etc.
 * - `telemetry/v1beta3`: Telemetry service. For submitting telemetry event data of different kinds.
 */
class BloomboxClient(
        /**
         * Settings to use for RPCs.
         */
        internal val settings: Settings,

        /**
         * Target to use for RPCs.
         */
        target: ClientTarget = ClientTarget.LOCAL) {
  // -- Settings -- //
  /**
   * Specifies client settings that can be passed in to modify RPC behavior.
   */
  data class Settings(
    /**
     * API key to use under the hood.
     */
    internal val apiKey: String,

    /**
     * Whether to enable logging.
     */
    internal val enableLogging: Boolean = true,

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
     * Executor to use for followup tasks and client RPC execution.
     */
    internal val executor: Executor = Executors.newSingleThreadExecutor(),

    /**
     * Timeout value for unary (i.e., non-streaming) requests.
     */
    internal val requestTimeout: Pair<Long, TimeUnit> = Pair(10, TimeUnit.MINUTES),

    /**
     * Timeout to wait for a client to close its connection.
     */
    internal val closeTimeout: Pair<Long, TimeUnit> = Pair(2, TimeUnit.SECONDS))

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
     * Send RPCs to production. This is the default.
     */
    PRODUCTION;
  }

  // -- Internals -- //
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
  }

  /**
   * Resolve the host endpoint for the selected client target.
   */
  private fun ClientTarget.host(): String =
      when (this) {
        ClientTarget.LOCAL -> "127.0.0.1"
        ClientTarget.PRODUCTION -> Endpoints.production
        ClientTarget.SANDBOX -> Endpoints.sandbox
      }

  /**
   * Holds references to each RPC service, so calls may be proxied to them.
   */
  private inner class Services(domain: String,
                               apiKey: String,
                               ct: ClientTarget) {
    /**
     * Shop client. Offers the ability to submit or query orders, verify or enroll users, check shop status and zipcode
     * delivery eligibility, and so on.
     */
    internal val shop = if (ct == ClientTarget.LOCAL) {
      ShopClient(
              domain,
              Endpoints.localShopPort,
              apiKey,
              settings.enableLogging,
              settings.executor,
              settings.partner,
              settings.location) } else {
      ShopClient(
              if (ct == ClientTarget.SANDBOX) { "shop.rpc.$domain" } else { "shop.$domain" },
              Endpoints.grpcPort,
              apiKey,
              settings.enableLogging,
              settings.executor,
              settings.partner,
              settings.location,
              settings.device) }

    /**
     * Telemetry client. Offers RPC access to telemetry data ingest services.
     */
    internal val telemetry = if (ct == ClientTarget.LOCAL) {
      TelemetryClient(
              domain,
              Endpoints.localTelemetryPort,
              apiKey,
              settings.enableLogging,
              settings.executor) } else {
      TelemetryClient(
              if (ct == ClientTarget.SANDBOX) { "telemetry.rpc.$domain" } else { "telemetry.$domain" },
              Endpoints.grpcPort,
              apiKey,
              settings.enableLogging,
              settings.executor,
              settings.partner,
              settings.location,
              settings.device) }

    /**
     * Reference to all mounted/supported services.
     */
    internal val _allServices: Array<ServiceClient> = arrayOf(shop, telemetry)
  }

  /**
   * Private access to service clients.
   */
  private val services = Services(target.host(), settings.apiKey, target)

  // -- Public Methods -- //
  /**
   * Close all client connections.
   */
  fun close(soft: Boolean = true,
            block: Boolean = true,
            timeout: Pair<Long, TimeUnit>? = null) {
    val closeTimeout = timeout ?: settings.closeTimeout
    services._allServices.forEach { it.close(soft, block, closeTimeout) }
  }

  // -- Public Services -- //
  /**
   * Fetch a reference to the Shop API client.
   */
  fun shop(): ShopClient = services.shop

  /**
   * Fetch a reference to the Telemetry API client.
   */
  fun telemetry(): TelemetryClient = services.telemetry
}
