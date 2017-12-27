/*
 * Copyright 2017, Bloombox, LLC.
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proximity/BluetoothBeacon.proto

package io.bloombox.schema.proximity;

public interface BluetoothBeaconOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proximity.BluetoothBeacon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * UUID for the device, as observed or broadcasted.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * UUID for the device, as observed or broadcasted.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * 'Major' value in the BLE signal.
   * </pre>
   *
   * <code>uint32 major = 2;</code>
   */
  int getMajor();

  /**
   * <pre>
   * 'Minor' value in the BLE signal.
   * </pre>
   *
   * <code>uint32 minor = 3;</code>
   */
  int getMinor();

  /**
   * <pre>
   * Timestamp for when this beacon was witnessed.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4;</code>
   */
  boolean hasSeen();
  /**
   * <pre>
   * Timestamp for when this beacon was witnessed.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4;</code>
   */
  io.bloombox.schema.temporal.Instant getSeen();
  /**
   * <pre>
   * Timestamp for when this beacon was witnessed.
   * </pre>
   *
   * <code>.temporal.Instant seen = 4;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getSeenOrBuilder();

  /**
   * <pre>
   * Location of the emitting or reporting (receiving) beacon.
   * </pre>
   *
   * <code>.geo.Location location = 5;</code>
   */
  boolean hasLocation();
  /**
   * <pre>
   * Location of the emitting or reporting (receiving) beacon.
   * </pre>
   *
   * <code>.geo.Location location = 5;</code>
   */
  io.bloombox.schema.geo.Location getLocation();
  /**
   * <pre>
   * Location of the emitting or reporting (receiving) beacon.
   * </pre>
   *
   * <code>.geo.Location location = 5;</code>
   */
  io.bloombox.schema.geo.LocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Estimate as to the distance accuracy of this beacon.
   * </pre>
   *
   * <code>.geo.LocationAccuracy accuracy = 6;</code>
   */
  boolean hasAccuracy();
  /**
   * <pre>
   * Estimate as to the distance accuracy of this beacon.
   * </pre>
   *
   * <code>.geo.LocationAccuracy accuracy = 6;</code>
   */
  io.bloombox.schema.geo.LocationAccuracy getAccuracy();
  /**
   * <pre>
   * Estimate as to the distance accuracy of this beacon.
   * </pre>
   *
   * <code>.geo.LocationAccuracy accuracy = 6;</code>
   */
  io.bloombox.schema.geo.LocationAccuracyOrBuilder getAccuracyOrBuilder();
}
