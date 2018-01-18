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
// source: security/DeviceToken.proto

package io.bloombox.schema.security;

public interface DeviceTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:security.DeviceToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.security.AuthToken token = 1;</code>
   */
  boolean hasToken();
  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.security.AuthToken token = 1;</code>
   */
  io.bloombox.schema.security.AuthToken getToken();
  /**
   * <pre>
   * Authentication token, usable by this device to authenticate to the API, etc.
   * </pre>
   *
   * <code>.security.AuthToken token = 1;</code>
   */
  io.bloombox.schema.security.AuthTokenOrBuilder getTokenOrBuilder();

  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.device.Device device = 2;</code>
   */
  boolean hasDevice();
  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.device.Device device = 2;</code>
   */
  io.bloombox.schema.device.Device getDevice();
  /**
   * <pre>
   * Information passed from the server to this device, including credentials, stateful flags, and so on.
   * </pre>
   *
   * <code>.device.Device device = 2;</code>
   */
  io.bloombox.schema.device.DeviceOrBuilder getDeviceOrBuilder();

  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant issued = 3;</code>
   */
  boolean hasIssued();
  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant issued = 3;</code>
   */
  io.bloombox.schema.temporal.Instant getIssued();
  /**
   * <pre>
   * Issuance timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant issued = 3;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getIssuedOrBuilder();

  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant expires = 4;</code>
   */
  boolean hasExpires();
  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant expires = 4;</code>
   */
  io.bloombox.schema.temporal.Instant getExpires();
  /**
   * <pre>
   * Expiry timestamp for this device token.
   * </pre>
   *
   * <code>.temporal.Instant expires = 4;</code>
   */
  io.bloombox.schema.temporal.InstantOrBuilder getExpiresOrBuilder();
}
