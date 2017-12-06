package bloombox.client.internals.services.telemetry

import bloombox.client.interfaces.ServiceClient
import core.Logging
import io.bloombox.schema.base.ProductKey
import io.bloombox.schema.identity.UserKey
import io.bloombox.schema.menu.section.Section
import io.bloombox.schema.services.telemetry.v1beta3.CommercialTelemetryGrpc
import io.bloombox.schema.services.telemetry.v1beta3.EventTelemetryGrpc
import io.bloombox.schema.services.telemetry.v1beta3.IdentityTelemetryGrpc
import io.bloombox.schema.services.telemetry.v1beta3.TelemetryPing
import io.bloombox.schema.telemetry.AnalyticsContext
import io.bloombox.schema.telemetry.AnalyticsScope
import io.bloombox.schema.telemetry.context.BrowserContext
import io.bloombox.schema.telemetry.context.DeviceContext
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NettyChannelBuilder
import rpc.client.RPCClient
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * RPC client for the Telemetry API.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class TelemetryClient(override val host: String,
                      override val port: Int,
                      override val apiKey: String,
                      override val enableLogging: Boolean = true,
                      override val executor: Executor = Executors.newSingleThreadExecutor(),
                      internal val defaultPartner: String? = null,
                      internal val defaultLocation: String? = null,
                      internal val deviceUUID: String? = null): RPCClient(host, port), ServiceClient {
  // -- Settings & Context -- //
  /**
   * Context for an event, with the opportunity to override settings.
   */
  data class EventContext(
          /**
           * Partner code for an event. Explicitly overrides `defaultPartner`.
           */
          val partner: String? = null,

          /**
           * Location code for an event. Explicitly overrides `defaultLocation`.
           */
          val location: String? = null,

          /**
           * Device UUID to report. Requires a value for `partner` and `location`.
           */
          val deviceUUID: String? = null,

          /**
           * User key to report as active for this event.
           */
          val userKey: String? = null,

          /**
           * Order key to report as active for this event.
           */
          val orderKey: String? = null,

          /**
           * Menu section to report as active for this event.
           */
          val section: Section? = null,

          /**
           * Item key to report as active for this event.
           */
          val item: ProductKey? = null,

          /**
           * Unique fingerprint for an anonymous device.
           */
          val fingerprint: String? = null,

          /**
           * Group or session ID for an event.
           */
          val group: String? = null,

          /**
           * Native device context to use for an event.
           */
          val nativeContext: DeviceContext.NativeDeviceContext? = null,

          /**
           * Browser context to send for an event.
           */
          val browserContext: BrowserContext.BrowserDeviceContext? = null)

  // -- Internals -- //
  /**
   * Interceptor for telemetry auth.
   */
  class TelemetryInterceptor(val apikey: String?): ClientInterceptor {
    companion object {
      /**
       * Bloombox library API key header, at X-Bloom-Key.
       */
      private val bloomApiKeyHeader: io.grpc.Metadata.Key<String> = io.grpc.Metadata.Key.of(
              "x-bloom-key", io.grpc.Metadata.ASCII_STRING_MARSHALLER)

      /**
       * Bloombox debug header, at X-Bloom-Debug.
       */
      private val debugModeHeader: io.grpc.Metadata.Key<String> = io.grpc.Metadata.Key.of(
              "x-bloom-debug", io.grpc.Metadata.ASCII_STRING_MARSHALLER)

      /**
       * Bloombox event context header, at X-Bloom-Context.
       */
      private val contextHeader: io.grpc.Metadata.Key<String> = io.grpc.Metadata.Key.of(
              "x-bloom-context", io.grpc.Metadata.ASCII_STRING_MARSHALLER)
    }

    /**
     * Intercept and rewrite a gRPC call.
     */
    override fun <ReqT : Any?, RespT : Any?> interceptCall(method: MethodDescriptor<ReqT, RespT>?,
                                                           callOptions: CallOptions?,
                                                           next: Channel?): ClientCall<ReqT, RespT>? {
      if (next == null)
        return null

      var call: ClientCall<ReqT, RespT> = next.newCall(method, callOptions)

      call = object : ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(call) {
        override fun start(responseListener: Listener<RespT>, headers: Metadata) {
          if (apikey != null && apikey.length > 2) {
            headers.put(bloomApiKeyHeader, apikey)
          }
          super.start(responseListener, headers)
        }
      }
      return call
    }
  }

  /**
   * Interceptor object.
   */
  private val interceptor = TelemetryInterceptor(apiKey)

  /**
   * Channel for client->server traffic.
   */
  override val channel: ManagedChannel = NettyChannelBuilder
          .forAddress(host, port)
          .executor(executor)
          .sslContext(GrpcSslContexts.forClient()
                  .trustManager(this.javaClass.getResourceAsStream(authorityRoots))
                  .build())
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
    private val logging = Logging.logger("TelemetryClient")
  }

  // -- Protocol Stubs -- //
  /**
   * Protocol stub.
   */
  private inner class Client {
    /**
     * Event telemetry service stub.
     */
    private val event = EventTelemetryGrpc.newStub(channel)

    /**
     * Commercial telemetry service stub.
     */
    private val commercial = CommercialTelemetryGrpc.newStub(channel)

    /**
     * Identity telemetry service stub.
     */
    private val identity = IdentityTelemetryGrpc.newStub(channel)
  }

  /**
   * Serialize individual event context into a final analytics context, considering default values passed in when
   * creating the service.
   */
  internal fun EventContext.serialize(defaultPartner: String? = null,
                                      defaultLocation: String? = null,
                                      deviceUUID: String? = null): AnalyticsContext.Context.Builder {
    // build and return according to defaults
    val builder = AnalyticsContext.Context.newBuilder()
    val scope = AnalyticsScope.Scope.newBuilder()

    // partner scope first
    if ((defaultPartner ?: this.partner) != null) {
      val partner = (defaultPartner ?: this.partner)!!

      if ((defaultLocation ?: this.location) != null) {
        val location = (defaultLocation ?: this.location)!!

        if ((deviceUUID ?: this.deviceUUID) != null) {
          // full set of partner/device context
          val device = (deviceUUID ?: this.deviceUUID)!!
          scope.partner = "$partner/$location/$device"
        } else {
          // partner/location only
          scope.partner = "$partner/$location"
        }
      } else {
        // partner only
        scope.partner = partner
      }
    }

    // commercial scope second
    if (section != null) {
      if (item != null && item.id != null && item.id.isNotEmpty() && item.id.isNotBlank()) {
        // section and item
        scope.commercial = "${section.name}/${item.id}"
      } else {
        // section-level
        scope.commercial = section.name
      }
    }
    if (orderKey != null && orderKey.isNotBlank() && orderKey.isNotEmpty())
      // set order key
      scope.order = orderKey
    builder.setScope(scope)

    // handle user and order key
    if (userKey != null && userKey.isNotEmpty() && userKey.isNotEmpty())
      builder.setUserKey(UserKey.newBuilder().setUid(userKey))

    // set fingerprint and group
    if (fingerprint != null && fingerprint.isNotEmpty() && fingerprint.isNotBlank())
      builder.fingerprint = fingerprint
    if (group != null && group.isNotBlank() && group.isNotBlank())
      builder.group = group

    return builder
  }

  /**
   * Close active connections.
   */
  override fun close(soft: Boolean,
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

  // -- Public Interface -- //
  /**
   * Generic event methods.
   */
  inner class Generic {
    /**
     * Event telemetry service stub.
     */
    private val event = EventTelemetryGrpc.newFutureStub(channel)

    /**
     * Event telemetry service stub.
     */
    private val eventSync = EventTelemetryGrpc.newBlockingStub(channel)

    /**
     * Ping the service.
     */
    fun ping() {
      // take a starting timestamp
      val start = System.currentTimeMillis()
      logging.info { "PING @ $start" }

      // send the event
      eventSync.ping(TelemetryPing.Request.getDefaultInstance())

      // note when the pong came back
      val done = System.currentTimeMillis()
      logging.info { "PONG @ $done: ${done - start}ms" }
    }

    /**
     * Record a generic event.
     */
    fun event() {
      TODO("not implemented")
    }

    /**
     * Record a generic error report.
     */
    fun exception() {
      TODO("not implemented")
    }
  }

  /**
   * Commercial telemetry methods.
   */
  inner class Commercial {
    /**
     * Record a commercial impression event.
     */
    fun impression() {
      TODO("not implemented")
    }

    /**
     * Record a commercial view event.
     */
    fun view() {
      TODO("not implemented")
    }

    /**
     * Record a commercial action event.
     */
    fun action() {
      TODO("not implemented")
    }
  }

  /**
   * Identity and user telemetry methods.
   */
  inner class Identity {
    /**
     * Record an identity-related event.
     */
    fun action() {
      TODO("not implemented")
    }
  }
}
