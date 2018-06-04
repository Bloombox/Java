// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/DeviceToken.proto

package io.bloombox.schema.security;

public interface DeviceTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.security.DeviceToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.bloombox.schema.security.AuthToken token = 1;</code>
   */
  boolean hasToken();
  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.bloombox.schema.security.AuthToken token = 1;</code>
   */
  io.bloombox.schema.security.AuthToken getToken();
  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.bloombox.schema.security.AuthToken token = 1;</code>
   */
  io.bloombox.schema.security.AuthTokenOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.opencannabis.device.Device device = 2;</code>
   */
  boolean hasDevice();
  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.opencannabis.device.Device device = 2;</code>
   */
  io.opencannabis.schema.device.Device getDevice();
  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.opencannabis.device.Device device = 2;</code>
   */
  io.opencannabis.schema.device.DeviceOrBuilder getDeviceOrBuilder();

  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant issued = 3;</code>
   */
  boolean hasIssued();
  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant issued = 3;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getIssued();
  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant issued = 3;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getIssuedOrBuilder();

  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 4;</code>
   */
  boolean hasExpires();
  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 4;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.Instant getExpires();
  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.opencannabis.temporal.Instant expires = 4;</code>
   */
  io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getExpiresOrBuilder();
}
