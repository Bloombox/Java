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

package bloombox.client.services.telemetry

import bloombox.client.BloomboxClient
import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.rpc.RPCClient
import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.bloombox.schema.base.ProductKey
import io.bloombox.schema.identity.UserKey
import io.bloombox.schema.menu.section.Section
import io.bloombox.schema.services.telemetry.v1beta3.*
import io.bloombox.schema.telemetry.AnalyticsContext
import io.bloombox.schema.telemetry.AnalyticsEvent
import io.bloombox.schema.telemetry.AnalyticsException
import io.bloombox.schema.telemetry.AnalyticsScope
import io.bloombox.schema.telemetry.context.*
import io.opencannabis.schema.struct.VersionSpec
import io.opencannabis.schema.temporal.Instant
import io.grpc.*
import io.grpc.netty.GrpcSslContexts
import io.grpc.netty.NegotiationType
import io.grpc.netty.NettyChannelBuilder
import java.time.Duration
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


// Method Callbacks
typealias PingCallback = (Long?) -> Unit


/**
 * RPC client for the Telemetry API.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class TelemetryClient(override val host: String,
                      override val port: Int,
                      override val apiKey: String,
                      override val timeout: Duration,
                      override val executor: Executor = Executors.newSingleThreadExecutor(),
                      internal val defaultPartner: String? = null,
                      internal val defaultLocation: String? = null,
                      internal val deviceUUID: String? = null) : RPCClient(), ServiceClient {
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
  class TelemetryInterceptor(val apikey: String?) : ClientInterceptor {
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
                                                           next: Channel): ClientCall<ReqT, RespT>? {
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
     * Internal collection prefix.
     */
    private const val internalPrefix = "_bloom_"

    /**
     * Server-side event fingerprint.
     */
    private val fingerprint = UUID.randomUUID().toString().toUpperCase()
  }

  // -- Protocol Stubs -- //
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
          scope.partner = "partner/$partner/location/$location/device/$device"
        } else {
          // partner/location only
          scope.partner = "partner/$partner/location/$location"
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
        scope.commercial = "section/${section.name}/item/${item.id}"
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

  // -- Service: Generic Telemetry -- //
  /**
   * Event telemetry service stub.
   */
  private val eventService = EventTelemetryGrpc.newFutureStub(channel)

  /**
   * Base context to use.
   */
  private val _baseContext: AnalyticsContext.Context = AnalyticsContext.Context.newBuilder()
        .setLibrary(LibraryContext.DeviceLibrary.newBuilder()
              .setClient(LibraryContext.APIClient.JAVA)
              .setVariant(BloomboxClient.VARIANT)
              .setVersion(VersionSpec.newBuilder().setName(BloomboxClient.VERSION)))
        .setNative(DeviceContext.NativeDeviceContext.newBuilder()
              .setRole(DeviceContext.DeviceRole.SERVER)
              .setOs(OperatingSystemContext.DeviceOS.newBuilder()
                    .setType(OperatingSystemContext.OSType.LINUX)))
        .build()

  /**
   * Resolve event context, according to global settings, and also explicit
   * context passed into whatever higher-order method is calling this.
   */
  private fun resolveContext(collection: String,
                             context: EventContext? = null): AnalyticsContext.Context.Builder {
    val merged: AnalyticsContext.Context.Builder = if (context != null) {
      context.serialize(defaultPartner, defaultLocation, deviceUUID)
            .mergeFrom(_baseContext)
    } else {
      _baseContext.toBuilder()
    }

    // add event collection
    if (!merged.hasCollection())
      merged.setCollection(AnalyticsCollection.Collection.newBuilder()
            .setInternal(collection.startsWith(internalPrefix))
            .setType(AnalyticsCollection.EventType.GENERIC)
            .setName(collection))

    if (merged.fingerprint == null || merged.fingerprint.isEmpty() || merged.fingerprint.isBlank())
      merged.fingerprint = fingerprint
    if (merged.group == null || merged.group.isEmpty() || merged.group.isBlank())
      merged.group = fingerprint
    return merged
  }

  // -- API: Ping -- //
  /**
   * Ping the service.
   */
  fun ping(callback: PingCallback? = null) {
    // take a starting timestamp
    val start: Long? = if (callback != null) {
      System.currentTimeMillis()
    } else {
      null
    }

    try {
      // send the event
      eventService.ping(TelemetryPing.Request.getDefaultInstance())
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)

      // note when the pong came back
      if (callback != null) {
        val done = System.currentTimeMillis()
        callback(done - start!!)
      }
    } catch (e: StatusRuntimeException) {

    }
  }

  // -- API: Events -- //
  /**
   * Record a generic event.
   */
  fun event(collection: String,
            uuid: String? = null,
            occurred: Long? = null,
            payload: Map<String, Value>? = null,
            context: EventContext? = null) {
    val merged = resolveContext(collection, context)

    val eventUUID = uuid?.toUpperCase() ?: UUID.randomUUID().toString().toUpperCase()

    val instant = Instant.newBuilder().setTimestamp(
          occurred ?: System.currentTimeMillis())

    val ev = AnalyticsEvent.Event.newBuilder()
          .setOccurred(instant)
          .setPayload(Struct.newBuilder().putAllFields(payload))
          .build()

    val req = Event.Request.newBuilder()
          .setUuid(eventUUID)
          .setEvent(ev)
          .setContext(merged)
          .build()

    eventService.event(req)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
  }

  // -- API: Errors -- //
  /**
   * Record a generic error report.
   */
  fun exception(collection: String,
                uuid: String? = null,
                domain: String = "global",
                code: Int = -1,
                occurred: Long? = null,
                context: EventContext? = null) {
    val merged = resolveContext(collection, context)
    val errorUUID = uuid?.toUpperCase() ?: UUID.randomUUID().toString().toUpperCase()

    val instant = Instant.newBuilder().setTimestamp(
          occurred ?: System.currentTimeMillis())

    val ev = Exception.newBuilder()
          .setUuid(errorUUID)
          .setError(AnalyticsException.Exception.newBuilder()
                .setOccurred(instant)
                .setCode(code)
                .setDomain(domain))
          .setContext(merged)
          .build()

    eventService.error(ev)
          .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
  }
}
