// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device/Device.proto

package io.opencannabis.schema.device;

public interface DeviceCredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.device.DeviceCredentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Raw bytes for a device's public key.
   * </pre>
   *
   * <code>bytes public_key = 1 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getPublicKey();

  /**
   * <pre>
   * Raw bytes for the device's private key.
   * </pre>
   *
   * <code>bytes private_key = 2 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getPrivateKey();

  /**
   * <pre>
   * SHA256 hash of this device's public key.
   * </pre>
   *
   * <code>string sha256 = 3 [(.gen_bq_schema.description) = "SHA256 hash of this device&#92;'s public key."];</code>
   */
  java.lang.String getSha256();
  /**
   * <pre>
   * SHA256 hash of this device's public key.
   * </pre>
   *
   * <code>string sha256 = 3 [(.gen_bq_schema.description) = "SHA256 hash of this device&#92;'s public key."];</code>
   */
  com.google.protobuf.ByteString
      getSha256Bytes();

  /**
   * <pre>
   * A device's raw identity payload.
   * </pre>
   *
   * <code>string identity = 4 [(.gen_bq_schema.ignore) = true];</code>
   */
  java.lang.String getIdentity();
  /**
   * <pre>
   * A device's raw identity payload.
   * </pre>
   *
   * <code>string identity = 4 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString
      getIdentityBytes();

  /**
   * <pre>
   * Repeated PEM authority payloads, asserted as trusted by the server.
   * </pre>
   *
   * <code>repeated bytes authorities = 5 [(.gen_bq_schema.ignore) = true];</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAuthoritiesList();
  /**
   * <pre>
   * Repeated PEM authority payloads, asserted as trusted by the server.
   * </pre>
   *
   * <code>repeated bytes authorities = 5 [(.gen_bq_schema.ignore) = true];</code>
   */
  int getAuthoritiesCount();
  /**
   * <pre>
   * Repeated PEM authority payloads, asserted as trusted by the server.
   * </pre>
   *
   * <code>repeated bytes authorities = 5 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getAuthorities(int index);
}
