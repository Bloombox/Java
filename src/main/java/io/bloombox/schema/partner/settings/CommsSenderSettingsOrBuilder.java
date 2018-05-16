// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

public interface CommsSenderSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bloombox.schema.partner.settings.CommsSenderSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  boolean hasEmail();
  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  io.opencannabis.schema.contact.EmailAddress getEmail();
  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  io.opencannabis.schema.contact.EmailAddressOrBuilder getEmailOrBuilder();

  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  boolean hasPhone();
  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  io.opencannabis.schema.contact.PhoneNumber getPhone();
  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  io.opencannabis.schema.contact.PhoneNumberOrBuilder getPhoneOrBuilder();
}
