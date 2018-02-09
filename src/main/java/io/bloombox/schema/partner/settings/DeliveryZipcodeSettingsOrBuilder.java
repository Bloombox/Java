// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface DeliveryZipcodeSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.DeliveryZipcodeSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Zipcode these settings apply to. Sometimes left unspecified when this record is used as a map value.
   * </pre>
   *
   * <code>string zipcode = 1;</code>
   */
  java.lang.String getZipcode();
  /**
   * <pre>
   * Zipcode these settings apply to. Sometimes left unspecified when this record is used as a map value.
   * </pre>
   *
   * <code>string zipcode = 1;</code>
   */
  com.google.protobuf.ByteString
      getZipcodeBytes();

  /**
   * <pre>
   * Whether this zipcode is currently enabled for delivery.
   * </pre>
   *
   * <code>bool enabled = 2;</code>
   */
  boolean getEnabled();

  /**
   * <pre>
   * Minimum subtotal value an order must meet, if it is bound for delivery to this zipcode, for it to be eligible for
   * submission for fulfillment.
   * </pre>
   *
   * <code>uint32 delivery_minimum = 3;</code>
   */
  int getDeliveryMinimum();
}
