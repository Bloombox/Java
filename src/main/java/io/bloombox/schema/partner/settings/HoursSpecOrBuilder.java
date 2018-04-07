// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface HoursSpecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.HoursSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Hour of the day, in 24h format.
   * </pre>
   *
   * <code>uint32 hour = 1;</code>
   */
  int getHour();

  /**
   * <pre>
   * Minute of the hour. Optional.
   * </pre>
   *
   * <code>uint32 minute = 2;</code>
   */
  int getMinute();
}
