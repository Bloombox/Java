// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/UserDoctorRec.proto

package io.bloombox.schema.identity.ids;

public interface UserDoctorRecOrBuilder extends
    // @@protoc_insertion_point(interface_extends:identity.ids.UserDoctorRec)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID number/unique code.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  java.lang.String getId();
  /**
   * <pre>
   * ID number/unique code.
   * </pre>
   *
   * <code>string id = 1;</code>
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2;</code>
   */
  boolean hasExpirationDate();
  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2;</code>
   */
  io.bloombox.schema.temporal.Date getExpirationDate();
  /**
   * <pre>
   * Expiration date for the recommendation.
   * </pre>
   *
   * <code>.temporal.Date expiration_date = 2;</code>
   */
  io.bloombox.schema.temporal.DateOrBuilder getExpirationDateOrBuilder();

  /**
   * <pre>
   * Raw barcode value.
   * </pre>
   *
   * <code>string barcode = 3;</code>
   */
  java.lang.String getBarcode();
  /**
   * <pre>
   * Raw barcode value.
   * </pre>
   *
   * <code>string barcode = 3;</code>
   */
  com.google.protobuf.ByteString
      getBarcodeBytes();

  /**
   * <pre>
   * US state where the recommendation is valid.
   * </pre>
   *
   * <code>.geo.usa.USState state = 4;</code>
   */
  int getStateValue();
  /**
   * <pre>
   * US state where the recommendation is valid.
   * </pre>
   *
   * <code>.geo.usa.USState state = 4;</code>
   */
  io.bloombox.schema.geo.usa.USState getState();

  /**
   * <pre>
   * Country for the recommendation.
   * </pre>
   *
   * <code>string country = 5;</code>
   */
  java.lang.String getCountry();
  /**
   * <pre>
   * Country for the recommendation.
   * </pre>
   *
   * <code>string country = 5;</code>
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <pre>
   * Doctor's unique ID.
   * </pre>
   *
   * <code>string doctor_id = 6;</code>
   */
  java.lang.String getDoctorId();
  /**
   * <pre>
   * Doctor's unique ID.
   * </pre>
   *
   * <code>string doctor_id = 6;</code>
   */
  com.google.protobuf.ByteString
      getDoctorIdBytes();

  /**
   * <pre>
   * Person that backs the doctor.
   * </pre>
   *
   * <code>.person.Person doctor = 7;</code>
   */
  boolean hasDoctor();
  /**
   * <pre>
   * Person that backs the doctor.
   * </pre>
   *
   * <code>.person.Person doctor = 7;</code>
   */
  io.bloombox.schema.person.Person getDoctor();
  /**
   * <pre>
   * Person that backs the doctor.
   * </pre>
   *
   * <code>.person.Person doctor = 7;</code>
   */
  io.bloombox.schema.person.PersonOrBuilder getDoctorOrBuilder();
}
