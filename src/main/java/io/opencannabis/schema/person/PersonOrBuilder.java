// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person/Person.proto

package io.opencannabis.schema.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opencannabis.person.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Person's primary name information.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 1 [(.gen_bq_schema.description) = "Person&#92;'s primary name information."];</code>
   */
  boolean hasName();
  /**
   * <pre>
   * Person's primary name information.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 1 [(.gen_bq_schema.description) = "Person&#92;'s primary name information."];</code>
   */
  io.opencannabis.schema.person.Name getName();
  /**
   * <pre>
   * Person's primary name information.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 1 [(.gen_bq_schema.description) = "Person&#92;'s primary name information."];</code>
   */
  io.opencannabis.schema.person.NameOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Person's legal name, if it differs from their primary name.
   * </pre>
   *
   * <code>.opencannabis.person.Name legal_name = 2 [(.gen_bq_schema.description) = "Person&#92;'s legal name, if it differs from their primary name."];</code>
   */
  boolean hasLegalName();
  /**
   * <pre>
   * Person's legal name, if it differs from their primary name.
   * </pre>
   *
   * <code>.opencannabis.person.Name legal_name = 2 [(.gen_bq_schema.description) = "Person&#92;'s legal name, if it differs from their primary name."];</code>
   */
  io.opencannabis.schema.person.Name getLegalName();
  /**
   * <pre>
   * Person's legal name, if it differs from their primary name.
   * </pre>
   *
   * <code>.opencannabis.person.Name legal_name = 2 [(.gen_bq_schema.description) = "Person&#92;'s legal name, if it differs from their primary name."];</code>
   */
  io.opencannabis.schema.person.NameOrBuilder getLegalNameOrBuilder();

  /**
   * <pre>
   * Person's optional alternate name.
   * </pre>
   *
   * <code>.opencannabis.person.Name alternate_name = 3 [(.gen_bq_schema.description) = "Person&#92;'s optional alternate name."];</code>
   */
  boolean hasAlternateName();
  /**
   * <pre>
   * Person's optional alternate name.
   * </pre>
   *
   * <code>.opencannabis.person.Name alternate_name = 3 [(.gen_bq_schema.description) = "Person&#92;'s optional alternate name."];</code>
   */
  io.opencannabis.schema.person.Name getAlternateName();
  /**
   * <pre>
   * Person's optional alternate name.
   * </pre>
   *
   * <code>.opencannabis.person.Name alternate_name = 3 [(.gen_bq_schema.description) = "Person&#92;'s optional alternate name."];</code>
   */
  io.opencannabis.schema.person.NameOrBuilder getAlternateNameOrBuilder();

  /**
   * <pre>
   * Person's contact information.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4 [(.gen_bq_schema.description) = "Person&#92;'s contact information."];</code>
   */
  boolean hasContact();
  /**
   * <pre>
   * Person's contact information.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4 [(.gen_bq_schema.description) = "Person&#92;'s contact information."];</code>
   */
  io.opencannabis.schema.contact.ContactInfo getContact();
  /**
   * <pre>
   * Person's contact information.
   * </pre>
   *
   * <code>.opencannabis.contact.ContactInfo contact = 4 [(.gen_bq_schema.description) = "Person&#92;'s contact information."];</code>
   */
  io.opencannabis.schema.contact.ContactInfoOrBuilder getContactOrBuilder();

  /**
   * <pre>
   * Date of birth.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date_of_birth = 5 [(.gen_bq_schema.description) = "Date of birth."];</code>
   */
  boolean hasDateOfBirth();
  /**
   * <pre>
   * Date of birth.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date_of_birth = 5 [(.gen_bq_schema.description) = "Date of birth."];</code>
   */
  io.opencannabis.schema.temporal.Date getDateOfBirth();
  /**
   * <pre>
   * Date of birth.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date_of_birth = 5 [(.gen_bq_schema.description) = "Date of birth."];</code>
   */
  io.opencannabis.schema.temporal.DateOrBuilder getDateOfBirthOrBuilder();
}
