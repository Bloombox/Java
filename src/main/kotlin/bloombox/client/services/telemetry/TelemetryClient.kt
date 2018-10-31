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

import bloombox.client.Bloombox
import bloombox.client.interfaces.ServiceClient
import bloombox.client.internals.mtls.ClientCredentials
import bloombox.client.internals.rpc.RPCClient
import com.google.protobuf.Struct
import com.google.protobuf.Value
import io.bloombox.schema.identity.AppUserKey.UserKey
import io.opencannabis.schema.base.BaseProductKey.ProductKey
import io.opencannabis.schema.menu.section.Section
import io.bloombox.schema.services.telemetry.v1beta4.*
import io.bloombox.schema.telemetry.AnalyticsContext
import io.bloombox.schema.telemetry.AnalyticsEvent
import io.bloombox.schema.telemetry.AnalyticsScope
import io.bloombox.schema.telemetry.context.*
import io.opencannabis.schema.struct.VersionSpec
import io.opencannabis.schema.temporal.TemporalInstant.Instant
import io.grpc.*
import io.netty.handler.ssl.ClientAuth
import java.io.InputStream
import java.nio.charset.StandardCharsets
import java.time.Duration
import java.util.*
import java.util.concurrent.Executor
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit


/**
 * Telemetry API client, which allows developers to send telemetry event data to the Bloombox Telemetry service, so it
 * may be considered with other built-in telemetry data during analytics and reporting calculations. Partners are also
 * enabled to send their own arbitrary events and later perform analysis over them.
 */
@Suppress("unused", "CanBeParameter", "MemberVisibilityCanPrivate")
class TelemetryClient(override val host: String,
                      override val port: Int,
                      override val apiKey: String,
                      override val timeout: Duration,
                      override val transportMode: TransportMode = TransportMode.SECURE,
                      override val clientAuth: ClientAuth = ClientAuth.NONE,
                      override val clientCredentials: ClientCredentials? = null,
                      override val clientAuthorityRoots: InputStream? = null,
                      override val executor: Executor = Executors.newSingleThreadExecutor(),
                      internal val defaultPartner: String? = null,
                      internal val defaultLocation: String? = null,
                      internal val deviceUUID: String? = null) : RPCClient(apiKey), ServiceClient {
  // -- Settings & Context -- //
  /**
   * Context for an event, with the opportunity to override settings and configuration for the telemetry client. This is
   * different from other API clients and services, in that it offers many more settings than usual - these values (i.e.
   * the 'userKey', 'deviceUUID', and so on) are automatically attached as "event context" to events sent with the
   * resulting client object.
   */
  data class EventContext(
        /**
         * Partner code for an event. Explicitly overrides `defaultPartner`. Specifies the partner account scope for a
         * given RPC transaction.
         */
        val partner: String? = null,

        /**
         * Location code for an event. Explicitly overrides `defaultLocation`. Specifies the partner's location record
         * scope for a given RPC transaction.
         */
        val location: String? = null,

        /**
         * Device UUID to report. Requires a value for `partner` and `location`. Used to signify events sent from a
         * specific, known, partner-co-located device.
         */
        val deviceUUID: String? = null,

        /**
         * Active user account key, if applicable. In scenarios where an end-user logs in, their key is set as soon as
         * their account is validated or otherwise resolved.
         */
        val userKey: String? = null,

        /**
         * Order key to report as active for this event. In general, this ID may not exist - it is sent with any and all
         * events by the client and can be generated client-side, without consulting the server. A conversion is
         * recorded when the order itself is submitted.
         */
        val orderKey: String? = null,

        /**
         * Menu section to report as active for this event. In cases where an event is a commercial-style occurrence
         * (i.e. an impression, view, or action on a section or product), this section key is included as context. All
         * commercial events with a product scope have a section scope, too.
         */
        val section: Section? = null,

        /**
         * Item key to report as active for this event. In cases where an event is a commercial-style occurrence (i.e.
         * an impression, view, or action on a section or product), this product key is included as context, where
         * applicable.
         */
        val item: ProductKey? = null,

        /**
         * Unique fingerprint for an anonymous device. This is generated client-side and not guaranteed to be unique
         * globally - only in the scope of a single partner/location account. Usually a hashed UUID is used for this
         * value so as to guarantee a reasonable level of collision resistance.
         */
        val fingerprint: String? = null,

        /**
         * Group or session ID for an event. Generated upon initialization of a new session, which happens client-side,
         * without consulting the server. Basically, it can be specified as any string to correlate events of a single
         * "session." It is usually implemented as a hashed UUID to guarantee a reasonable level of collision
         * resistance.
         */
        val group: String? = null,

        /**
         * Native device context to use for an event. This specifies information about the native hardware on which the
         * reported event occurred. Native device context includes things like device screen resolution, window size,
         * OS name and version, the active telemetry client library language and version, and so on.
         */
        val nativeContext: DeviceContext.NativeDeviceContext? = null,

        /**
         * Browser context to send for an event. In circumstances where an event is relayed or originally sent from an
         * internet-facing browser agent, this context structure specifies items like the browser name, version, pixel
         * density, capabilities, and vendor.
         */
        val browserContext: BrowserContext.BrowserDeviceContext? = null)

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

  // -- Internals -- //
  private val b64 = org.apache.commons.codec.binary.Base64()

  companion object {
    private const val internalPrefix = "_bloom_"

    private val fingerprint = UUID.randomUUID().toString().toUpperCase()

    private val baseContext: AnalyticsContext.Context = AnalyticsContext.Context.newBuilder()
          .setLibrary(LibraryContext.DeviceLibrary.newBuilder()
                .setClient(LibraryContext.APIClient.JAVA)
                .setVariant(Bloombox.VARIANT)
                .setVersion(VersionSpec.newBuilder().setName(Bloombox.VERSION)))
          .setNative(DeviceContext.NativeDeviceContext.newBuilder()
                .setRole(DeviceContext.DeviceRole.SERVER)
                .setOs(OperatingSystemContext.DeviceOS.newBuilder()
                      .setType(OperatingSystemContext.OSType.LINUX)))
          .build()
  }

  // -- Protocol Stubs -- //
  private val eventService = EventTelemetryGrpc.newFutureStub(channel)
  private val commercialService = CommercialTelemetryGrpc.newFutureStub(channel)
  private val identityService = IdentityTelemetryGrpc.newFutureStub(channel)

  /**
   * Serialize individual event context into a final analytics context, considering default values passed in when
   * creating the service. This prepares and merges global context with explicitly-specified context and readies it for
   * transmission to the telemetry service.
   */
  private fun EventContext.serialize(defaultPartner: String? = null,
                                     defaultLocation: String? = null,
                                     deviceUUID: String? = null): AnalyticsContext.Context.Builder {
    // build and return according to defaults
    val builder = AnalyticsContext.Context.newBuilder()
    val scope = AnalyticsScope.Scope.newBuilder()

    val partner = defaultPartner ?: this.partner
    val location = defaultLocation ?: this.location
    val device = deviceUUID ?: this.deviceUUID

    // partner scope first
    if (partner != null) {
      if (location != null) {
        if (device != null) {
          // full set of partner/device context
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
      if (item?.id?.isNotBlank() == true) {
        // section and item
        scope.commercial = "section/${section.name}/item/${item.id}"
      } else {
        // section-level
        scope.commercial = section.name
      }
    }
    if (orderKey?.isNotBlank() == true)
    // set order key
      scope.order = orderKey
    builder.setScope(scope)

    // handle user and order key
    if (userKey?.isNotBlank() == true)
      builder.setUserKey(UserKey.newBuilder().setUid(userKey))

    // set fingerprint and group
    if (fingerprint?.isNotBlank() == true)
      builder.fingerprint = fingerprint
    if (group?.isNotBlank() == true)
      builder.group = group

    return builder
  }

  /**
   * Resolve event context, according to global settings, and also explicit context passed into whatever higher-order
   * method is calling this. Ensure that a device fingerprint, session group, and valid set of partner/location context
   * are resolved before proceeding.
   */
  private fun resolveContext(collection: String,
                             context: EventContext? = null): AnalyticsContext.Context.Builder {
    val merged: AnalyticsContext.Context.Builder = if (context != null) {
      context.serialize(defaultPartner, defaultLocation, deviceUUID).mergeFrom(baseContext)
    } else {
      baseContext.toBuilder()
    }

    // add event collection
    if (!merged.hasCollection())
      merged.setCollection(AnalyticsCollection.Collection.newBuilder()
            .setInternal(collection.startsWith(internalPrefix))
            .setType(AnalyticsCollection.EventType.GENERIC)
            .setName(b64.encodeAsString(collection.toByteArray(StandardCharsets.UTF_8))))

    if (merged.fingerprint == null || merged.fingerprint.isEmpty() || merged.fingerprint.isBlank())
      merged.fingerprint = fingerprint
    if (merged.group == null || merged.group.isEmpty() || merged.group.isBlank())
      merged.group = fingerprint
    return merged
  }

  // -- API: Ping -- //
  /**
   * Ping the service. This emits a lightweight message and asks the server to respond ASAP. In some cases, a telemetry
   * ping may be used to establish session-level default context, by specifying global context in headers/trailers
   * alongside the ping request.
   */
  fun ping(callback: PingCallback? = null) {
    // take a starting timestamp
    val start: Long = System.currentTimeMillis()

    try {
      // send the event
      eventService.ping(TelemetryPing.Request.getDefaultInstance())
            .get(timeout.toMillis(), TimeUnit.MILLISECONDS)
      val end = System.currentTimeMillis()

      // note when the pong came back
      callback?.invoke(end - start)
    } catch (e: StatusRuntimeException) {
      callback?.invoke(null)
    }
  }

  /**
   * Record a generic event. A "generic event" is any JSON-compatible payload, plus an "event collection," which is
   * simply a string name.
   */
  fun event(collection: String,
            payload: Map<String, Value>? = null) {
    event(collection, null, null, payload, null)
  }

  /**
   * Record a generic event. A "generic event" is any JSON-compatible payload, plus an "event collection," which is
   * simply a string name. Additionally, context may be sent along with an event about how and where the event was
   * recorded - i.e. native and browser-oriented device information, and so on.
   */
  fun event(collection: String,
            payload: Map<String, Value>? = null,
            context: EventContext? = null) {
    event(collection, null, null, payload, context)
  }

  // -- API: Events -- //
  /**
   * Record a generic event. A "generic event" is any JSON-compatible payload, plus an "event collection," which is
   * simply a string name. Additionally, context may be sent along with an event about how and where the event was
   * recorded - i.e. native and browser-oriented device information, and so on. This variant allows the additional
   * specification of an explicit event UUID and occurrence timestamp.
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
}
