/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

public interface DeviceActivationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.services.devices.v1beta1.DeviceActivation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID for the device.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   */
  java.lang.String getUuid();
  /**
   * <pre>
   * Unique ID for the device.
   * </pre>
   *
   * <code>string uuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getUuidBytes();

  /**
   * <pre>
   * Hostname for the device.
   * </pre>
   *
   * <code>string hostname = 2;</code>
   */
  java.lang.String getHostname();
  /**
   * <pre>
   * Hostname for the device.
   * </pre>
   *
   * <code>string hostname = 2;</code>
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <pre>
   * Assignment information for the device.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceAssignment assignment = 3;</code>
   */
  boolean hasAssignment();
  /**
   * <pre>
   * Assignment information for the device.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceAssignment assignment = 3;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceAssignment getAssignment();
  /**
   * <pre>
   * Assignment information for the device.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceAssignment assignment = 3;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceAssignmentOrBuilder getAssignmentOrBuilder();

  /**
   * <pre>
   * Specifies an activation ticket for the subject device, including authorization information and a signed JWT that
   * allows the device access to assigned information and credentials.
   * </pre>
   *
   * <code>.bloombox.schema.security.DeviceTicket ticket = 4;</code>
   */
  boolean hasTicket();
  /**
   * <pre>
   * Specifies an activation ticket for the subject device, including authorization information and a signed JWT that
   * allows the device access to assigned information and credentials.
   * </pre>
   *
   * <code>.bloombox.schema.security.DeviceTicket ticket = 4;</code>
   */
  io.bloombox.schema.security.DeviceSecurity.DeviceTicket getTicket();
  /**
   * <pre>
   * Specifies an activation ticket for the subject device, including authorization information and a signed JWT that
   * allows the device access to assigned information and credentials.
   * </pre>
   *
   * <code>.bloombox.schema.security.DeviceTicket ticket = 4;</code>
   */
  io.bloombox.schema.security.DeviceSecurity.DeviceTicketOrBuilder getTicketOrBuilder();

  /**
   * <pre>
   * Payload specifying endpoints the device should use under different circumstances, to include OAuth2, API use, and
   * direct use of Firebase.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceEndpoints endpoints = 5;</code>
   */
  boolean hasEndpoints();
  /**
   * <pre>
   * Payload specifying endpoints the device should use under different circumstances, to include OAuth2, API use, and
   * direct use of Firebase.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceEndpoints endpoints = 5;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceEndpoints getEndpoints();
  /**
   * <pre>
   * Payload specifying endpoints the device should use under different circumstances, to include OAuth2, API use, and
   * direct use of Firebase.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceEndpoints endpoints = 5;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceEndpointsOrBuilder getEndpointsOrBuilder();

  /**
   * <pre>
   * If this device is assigned to broadcast a BLE signal, its configuration parameters are specified here, including
   * the minimum required for an iBeacon (UUID, major and minor values).
   * </pre>
   *
   * <code>.opencannabis.proximity.BluetoothBeacon beacon = 6;</code>
   */
  boolean hasBeacon();
  /**
   * <pre>
   * If this device is assigned to broadcast a BLE signal, its configuration parameters are specified here, including
   * the minimum required for an iBeacon (UUID, major and minor values).
   * </pre>
   *
   * <code>.opencannabis.proximity.BluetoothBeacon beacon = 6;</code>
   */
  io.opencannabis.schema.proximity.BluetoothBeacon getBeacon();
  /**
   * <pre>
   * If this device is assigned to broadcast a BLE signal, its configuration parameters are specified here, including
   * the minimum required for an iBeacon (UUID, major and minor values).
   * </pre>
   *
   * <code>.opencannabis.proximity.BluetoothBeacon beacon = 6;</code>
   */
  io.opencannabis.schema.proximity.BluetoothBeaconOrBuilder getBeaconOrBuilder();

  /**
   * <pre>
   * Specifies the cryptographic material this activated device should make use of when communicating with the Bloombox
   * Platform server-side systems.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceKeys credentials = 7;</code>
   */
  boolean hasCredentials();
  /**
   * <pre>
   * Specifies the cryptographic material this activated device should make use of when communicating with the Bloombox
   * Platform server-side systems.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceKeys credentials = 7;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceKeys getCredentials();
  /**
   * <pre>
   * Specifies the cryptographic material this activated device should make use of when communicating with the Bloombox
   * Platform server-side systems.
   * </pre>
   *
   * <code>.bloombox.schema.services.devices.v1beta1.DeviceKeys credentials = 7;</code>
   */
  io.bloombox.schema.services.devices.v1beta1.DeviceKeysOrBuilder getCredentialsOrBuilder();
}
