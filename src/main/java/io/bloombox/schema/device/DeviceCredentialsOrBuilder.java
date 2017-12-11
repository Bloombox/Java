// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device/Device.proto

package io.bloombox.schema.device;

public interface DeviceCredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:device.DeviceCredentials)
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
   * <code>bytes sha256 = 3 [(.gen_bq_schema.ignore) = true];</code>
   */
  com.google.protobuf.ByteString getSha256();

  /**
   * <code>bytes identity = 4;</code>
   */
  com.google.protobuf.ByteString getIdentity();

  /**
   * <code>repeated bytes authorities = 5;</code>
   */
  java.util.List<com.google.protobuf.ByteString> getAuthoritiesList();
  /**
   * <code>repeated bytes authorities = 5;</code>
   */
  int getAuthoritiesCount();
  /**
   * <code>repeated bytes authorities = 5;</code>
   */
  com.google.protobuf.ByteString getAuthorities(int index);
}
