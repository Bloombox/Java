// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ID.proto

package io.bloombox.schema.identity;

public interface IDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of ID we're specifying.
   * </pre>
   *
   * <code>.identity.IDType type = 1;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of ID we're specifying.
   * </pre>
   *
   * <code>.identity.IDType type = 1;</code>
   */
  io.bloombox.schema.identity.IDType getType();

  /**
   * <pre>
   * ID number or string identifying this identity document.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID number or string identifying this identity document.
   * </pre>
   *
   * <code>string id = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Expiration date for this document.
   * </pre>
   *
   * <code>.temporal.Date expire_date = 3;</code>
   */
  boolean hasExpireDate();
  /**
   * <pre>
   * Expiration date for this document.
   * </pre>
   *
   * <code>.temporal.Date expire_date = 3;</code>
   */
  io.bloombox.schema.temporal.Date getExpireDate();
  /**
   * <pre>
   * Expiration date for this document.
   * </pre>
   *
   * <code>.temporal.Date expire_date = 3;</code>
   */
  io.bloombox.schema.temporal.DateOrBuilder getExpireDateOrBuilder();

  /**
   * <pre>
   * Birth date listed on this document.
   * </pre>
   *
   * <code>.temporal.Date birth_date = 4;</code>
   */
  boolean hasBirthDate();
  /**
   * <pre>
   * Birth date listed on this document.
   * </pre>
   *
   * <code>.temporal.Date birth_date = 4;</code>
   */
  io.bloombox.schema.temporal.Date getBirthDate();
  /**
   * <pre>
   * Birth date listed on this document.
   * </pre>
   *
   * <code>.temporal.Date birth_date = 4;</code>
   */
  io.bloombox.schema.temporal.DateOrBuilder getBirthDateOrBuilder();

  /**
   * <pre>
   * United States Driver's License.
   * </pre>
   *
   * <code>.identity.ids.USDL license = 20;</code>
   */
  boolean hasLicense();
  /**
   * <pre>
   * United States Driver's License.
   * </pre>
   *
   * <code>.identity.ids.USDL license = 20;</code>
   */
  io.bloombox.schema.identity.ids.USDL getLicense();
  /**
   * <pre>
   * United States Driver's License.
   * </pre>
   *
   * <code>.identity.ids.USDL license = 20;</code>
   */
  io.bloombox.schema.identity.ids.USDLOrBuilder getLicenseOrBuilder();

  /**
   * <pre>
   * National passport.
   * </pre>
   *
   * <code>.identity.ids.Passport passport = 21;</code>
   */
  boolean hasPassport();
  /**
   * <pre>
   * National passport.
   * </pre>
   *
   * <code>.identity.ids.Passport passport = 21;</code>
   */
  io.bloombox.schema.identity.ids.Passport getPassport();
  /**
   * <pre>
   * National passport.
   * </pre>
   *
   * <code>.identity.ids.Passport passport = 21;</code>
   */
  io.bloombox.schema.identity.ids.PassportOrBuilder getPassportOrBuilder();

  public io.bloombox.schema.identity.ID.DocumentCase getDocumentCase();
}
