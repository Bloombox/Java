/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: device/Device.proto

package io.opencannabis.schema.device;

public interface DeviceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.device.Device)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Universally unique identifier for this device.
   * </pre>
   *
   * <code>string uuid = 1 [(.gen_bq_schema.description) = "Universally unique identifier for this device."];</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * Universally unique identifier for this device.
   * </pre>
   *
   * <code>string uuid = 1 [(.gen_bq_schema.description) = "Universally unique identifier for this device."];</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * Type of this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceType type = 2 [(.gen_bq_schema.description) = "Type of this device."];</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceType type = 2 [(.gen_bq_schema.description) = "Type of this device."];</code>
   */
  io.opencannabis.schema.device.DeviceType getType();

  /**
   * <pre>
   * Flags for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceFlags flags = 3 [(.gen_bq_schema.description) = "Flags for this device."];</code>
   */
  boolean hasFlags();
  /**
   * <pre>
   * Flags for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceFlags flags = 3 [(.gen_bq_schema.description) = "Flags for this device."];</code>
   */
  io.opencannabis.schema.device.DeviceFlags getFlags();
  /**
   * <pre>
   * Flags for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceFlags flags = 3 [(.gen_bq_schema.description) = "Flags for this device."];</code>
   */
  io.opencannabis.schema.device.DeviceFlagsOrBuilder getFlagsOrBuilder();

  /**
   * <pre>
   * Credentials for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceCredentials key = 4 [(.gen_bq_schema.description) = "Credentials for this device."];</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * Credentials for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceCredentials key = 4 [(.gen_bq_schema.description) = "Credentials for this device."];</code>
   */
  io.opencannabis.schema.device.DeviceCredentials getKey();
  /**
   * <pre>
   * Credentials for this device.
   * </pre>
   *
   * <code>.opencannabis.device.DeviceCredentials key = 4 [(.gen_bq_schema.description) = "Credentials for this device."];</code>
   */
  io.opencannabis.schema.device.DeviceCredentialsOrBuilder getKeyOrBuilder();
}
