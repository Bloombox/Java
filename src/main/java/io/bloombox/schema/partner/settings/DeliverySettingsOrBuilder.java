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
