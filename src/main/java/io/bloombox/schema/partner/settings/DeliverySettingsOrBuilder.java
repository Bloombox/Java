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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface DeliverySettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.DeliverySettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Global delivery minimum. A delivery order must meet this subtotal minimum to be eligible for submission.
   * </pre>
   *
   * <code>uint32 global_minimum = 1;</code>
   */
  int getGlobalMinimum();

  /**
   * <pre>
   * Specifies zipcode-level settings for delivery.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.settings.DeliveryZipcodeSettings&gt; zipcodes = 2;</code>
   */
  int getZipcodesCount();
  /**
   * <pre>
   * Specifies zipcode-level settings for delivery.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.settings.DeliveryZipcodeSettings&gt; zipcodes = 2;</code>
   */
  boolean containsZipcodes(
      java.lang.String key);
  /**
   * Use {@link #getZipcodesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, io.bloombox.schema.partner.settings.DeliveryZipcodeSettings>
  getZipcodes();
  /**
   * <pre>
   * Specifies zipcode-level settings for delivery.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.settings.DeliveryZipcodeSettings&gt; zipcodes = 2;</code>
   */
  java.util.Map<java.lang.String, io.bloombox.schema.partner.settings.DeliveryZipcodeSettings>
  getZipcodesMap();
  /**
   * <pre>
   * Specifies zipcode-level settings for delivery.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.settings.DeliveryZipcodeSettings&gt; zipcodes = 2;</code>
   */

  io.bloombox.schema.partner.settings.DeliveryZipcodeSettings getZipcodesOrDefault(
      java.lang.String key,
      io.bloombox.schema.partner.settings.DeliveryZipcodeSettings defaultValue);
  /**
   * <pre>
   * Specifies zipcode-level settings for delivery.
   * </pre>
   *
   * <code>map&lt;string, .bloombox.schema.partner.settings.DeliveryZipcodeSettings&gt; zipcodes = 2;</code>
   */

  io.bloombox.schema.partner.settings.DeliveryZipcodeSettings getZipcodesOrThrow(
      java.lang.String key);
}
