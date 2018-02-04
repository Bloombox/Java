// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

/**
 * <pre>
 * Enumerates known fields on a US Driver's License, that may be expressed or extracted via data entry/scanning of the
 * document with OCR or reading the document's barcodes.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.identity.ids.USDLField}
 */
public enum USDLField
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Raw barcode data for the back USDL barcode, which usually carries most of the data and is generally encoded using
   * PDF417 (for instance, this is the case for California and New York).
   * </pre>
   *
   * <code>BACK_BARCODE = 0;</code>
   */
  BACK_BARCODE(0),
  /**
   * <pre>
   * Person's family name, or last name.
   * </pre>
   *
   * <code>FAMILY_NAME = 1;</code>
   */
  FAMILY_NAME(1),
  /**
   * <pre>
   * Person's first anme, or given name.
   * </pre>
   *
   * <code>GIVEN_NAME = 2;</code>
   */
  GIVEN_NAME(2),
  /**
   * <pre>
   * Person's middle name.
   * </pre>
   *
   * <code>MIDDLE_NAME = 3;</code>
   */
  MIDDLE_NAME(3),
  /**
   * <pre>
   * Person's full name, expressed in a concatenated field.
   * </pre>
   *
   * <code>FULL_NAME = 4;</code>
   */
  FULL_NAME(4),
  /**
   * <pre>
   * Person's name prefix, like "Dr" or some other salutation.
   * </pre>
   *
   * <code>NAME_PREFIX = 5;</code>
   */
  NAME_PREFIX(5),
  /**
   * <pre>
   * Person's name suffix, like "III".
   * </pre>
   *
   * <code>NAME_SUFFIX = 6;</code>
   */
  NAME_SUFFIX(6),
  /**
   * <pre>
   * Date of birth for this person.
   * </pre>
   *
   * <code>DATE_OF_BIRTH = 10;</code>
   */
  DATE_OF_BIRTH(10),
  /**
   * <pre>
   * Gender specified for this person.
   * </pre>
   *
   * <code>SEX = 11;</code>
   */
  SEX(11),
  /**
   * <pre>
   * Physical height specified for this person.
   * </pre>
   *
   * <code>HEIGHT = 12;</code>
   */
  HEIGHT(12),
  /**
   * <pre>
   * Physical weight specified for this person.
   * </pre>
   *
   * <code>WEIGHT = 13;</code>
   */
  WEIGHT(13),
  /**
   * <pre>
   * Eye color specified for this person.
   * </pre>
   *
   * <code>EYE_COLOR = 14;</code>
   */
  EYE_COLOR(14),
  /**
   * <pre>
   * Hair color specified for this person.
   * </pre>
   *
   * <code>HAIR_COLOR = 15;</code>
   */
  HAIR_COLOR(15),
  /**
   * <pre>
   * Full, concatenated main user address string.
   * </pre>
   *
   * <code>FULL_ADDRESS = 20;</code>
   */
  FULL_ADDRESS(20),
  /**
   * <pre>
   * First line of the main address.
   * </pre>
   *
   * <code>ADDRESS_LINE = 21;</code>
   */
  ADDRESS_LINE(21),
  /**
   * <pre>
   * Second line of the main address.
   * </pre>
   *
   * <code>ADDRESS_LINE2 = 22;</code>
   */
  ADDRESS_LINE2(22),
  /**
   * <pre>
   * City name from the main address.
   * </pre>
   *
   * <code>ADDRESS_CITY = 23;</code>
   */
  ADDRESS_CITY(23),
  /**
   * <pre>
   * Postal or zip code from the main address.
   * </pre>
   *
   * <code>POSTAL_CODE = 24;</code>
   */
  POSTAL_CODE(24),
  /**
   * <pre>
   * Issuing state jurisdiction code for this document.
   * </pre>
   *
   * <code>STATE_JURISDICTION = 25;</code>
   */
  STATE_JURISDICTION(25),
  /**
   * <pre>
   * ID number for this license document.
   * </pre>
   *
   * <code>LICENSE_ID = 30;</code>
   */
  LICENSE_ID(30),
  /**
   * <pre>
   * Issuance date for this license document.
   * </pre>
   *
   * <code>LICENSE_ISSUE_DATE = 31;</code>
   */
  LICENSE_ISSUE_DATE(31),
  /**
   * <pre>
   * Expiration date for this license document.
   * </pre>
   *
   * <code>LICENSE_EXPIRY_DATE = 32;</code>
   */
  LICENSE_EXPIRY_DATE(32),
  /**
   * <pre>
   * Jurisdiction of issuance for this license document.
   * </pre>
   *
   * <code>ISSUER_JURISDICTION = 33;</code>
   */
  ISSUER_JURISDICTION(33),
  /**
   * <pre>
   * Jurisdiction-scoped format specifier for this document.
   * </pre>
   *
   * <code>ISSUER_JURISDICTION_FORMAT_VERSION = 34;</code>
   */
  ISSUER_JURISDICTION_FORMAT_VERSION(34),
  /**
   * <pre>
   * Unique document code for this specific instance of a license document.
   * </pre>
   *
   * <code>UNIQUE_DOCUMENT_CODE = 40;</code>
   */
  UNIQUE_DOCUMENT_CODE(40),
  /**
   * <pre>
   * Inventory unique control code, used for license document disambiguation if specified.
   * </pre>
   *
   * <code>INVENTORY_CONTROL_CODE = 41;</code>
   */
  INVENTORY_CONTROL_CODE(41),
  /**
   * <pre>
   * Date the user will turn 18 years old.
   * </pre>
   *
   * <code>UNDER_18_DATE = 50;</code>
   */
  UNDER_18_DATE(50),
  /**
   * <pre>
   * Date the user will turn 19 years old.
   * </pre>
   *
   * <code>UNDER_19_DATE = 51;</code>
   */
  UNDER_19_DATE(51),
  /**
   * <pre>
   * Date the user will turn 21 years old.
   * </pre>
   *
   * <code>UNDER_21_DATE = 52;</code>
   */
  UNDER_21_DATE(52),
  /**
   * <pre>
   * Flag to indicate the user was under 18 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_18 = 60;</code>
   */
  UNDER_18(60),
  /**
   * <pre>
   * Flag to indicate the user was under 19 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_19 = 61;</code>
   */
  UNDER_19(61),
  /**
   * <pre>
   * Flag to indicate the user was under 21 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_21 = 62;</code>
   */
  UNDER_21(62),
  /**
   * <pre>
   * Flag to indicate this person opted to be an organ donor.
   * </pre>
   *
   * <code>ORGAN_DONOR = 63;</code>
   */
  ORGAN_DONOR(63),
  /**
   * <pre>
   * Flag to indicate that this person is a veteran.
   * </pre>
   *
   * <code>VETERAN = 64;</code>
   */
  VETERAN(64),
  /**
   * <pre>
   * Flag to indicate that this person is a nonresident.
   * </pre>
   *
   * <code>NONRESIDENT = 65;</code>
   */
  NONRESIDENT(65),
  /**
   * <pre>
   * Race or ethnicity information specified in this document.
   * </pre>
   *
   * <code>RACE_ETHNICITY = 70;</code>
   */
  RACE_ETHNICITY(70),
  /**
   * <pre>
   * Compliance-related data field for storage standards.
   * </pre>
   *
   * <code>COMPLIANCE_TYPE = 71;</code>
   */
  COMPLIANCE_TYPE(71),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Raw barcode data for the back USDL barcode, which usually carries most of the data and is generally encoded using
   * PDF417 (for instance, this is the case for California and New York).
   * </pre>
   *
   * <code>BACK_BARCODE = 0;</code>
   */
  public static final int BACK_BARCODE_VALUE = 0;
  /**
   * <pre>
   * Person's family name, or last name.
   * </pre>
   *
   * <code>FAMILY_NAME = 1;</code>
   */
  public static final int FAMILY_NAME_VALUE = 1;
  /**
   * <pre>
   * Person's first anme, or given name.
   * </pre>
   *
   * <code>GIVEN_NAME = 2;</code>
   */
  public static final int GIVEN_NAME_VALUE = 2;
  /**
   * <pre>
   * Person's middle name.
   * </pre>
   *
   * <code>MIDDLE_NAME = 3;</code>
   */
  public static final int MIDDLE_NAME_VALUE = 3;
  /**
   * <pre>
   * Person's full name, expressed in a concatenated field.
   * </pre>
   *
   * <code>FULL_NAME = 4;</code>
   */
  public static final int FULL_NAME_VALUE = 4;
  /**
   * <pre>
   * Person's name prefix, like "Dr" or some other salutation.
   * </pre>
   *
   * <code>NAME_PREFIX = 5;</code>
   */
  public static final int NAME_PREFIX_VALUE = 5;
  /**
   * <pre>
   * Person's name suffix, like "III".
   * </pre>
   *
   * <code>NAME_SUFFIX = 6;</code>
   */
  public static final int NAME_SUFFIX_VALUE = 6;
  /**
   * <pre>
   * Date of birth for this person.
   * </pre>
   *
   * <code>DATE_OF_BIRTH = 10;</code>
   */
  public static final int DATE_OF_BIRTH_VALUE = 10;
  /**
   * <pre>
   * Gender specified for this person.
   * </pre>
   *
   * <code>SEX = 11;</code>
   */
  public static final int SEX_VALUE = 11;
  /**
   * <pre>
   * Physical height specified for this person.
   * </pre>
   *
   * <code>HEIGHT = 12;</code>
   */
  public static final int HEIGHT_VALUE = 12;
  /**
   * <pre>
   * Physical weight specified for this person.
   * </pre>
   *
   * <code>WEIGHT = 13;</code>
   */
  public static final int WEIGHT_VALUE = 13;
  /**
   * <pre>
   * Eye color specified for this person.
   * </pre>
   *
   * <code>EYE_COLOR = 14;</code>
   */
  public static final int EYE_COLOR_VALUE = 14;
  /**
   * <pre>
   * Hair color specified for this person.
   * </pre>
   *
   * <code>HAIR_COLOR = 15;</code>
   */
  public static final int HAIR_COLOR_VALUE = 15;
  /**
   * <pre>
   * Full, concatenated main user address string.
   * </pre>
   *
   * <code>FULL_ADDRESS = 20;</code>
   */
  public static final int FULL_ADDRESS_VALUE = 20;
  /**
   * <pre>
   * First line of the main address.
   * </pre>
   *
   * <code>ADDRESS_LINE = 21;</code>
   */
  public static final int ADDRESS_LINE_VALUE = 21;
  /**
   * <pre>
   * Second line of the main address.
   * </pre>
   *
   * <code>ADDRESS_LINE2 = 22;</code>
   */
  public static final int ADDRESS_LINE2_VALUE = 22;
  /**
   * <pre>
   * City name from the main address.
   * </pre>
   *
   * <code>ADDRESS_CITY = 23;</code>
   */
  public static final int ADDRESS_CITY_VALUE = 23;
  /**
   * <pre>
   * Postal or zip code from the main address.
   * </pre>
   *
   * <code>POSTAL_CODE = 24;</code>
   */
  public static final int POSTAL_CODE_VALUE = 24;
  /**
   * <pre>
   * Issuing state jurisdiction code for this document.
   * </pre>
   *
   * <code>STATE_JURISDICTION = 25;</code>
   */
  public static final int STATE_JURISDICTION_VALUE = 25;
  /**
   * <pre>
   * ID number for this license document.
   * </pre>
   *
   * <code>LICENSE_ID = 30;</code>
   */
  public static final int LICENSE_ID_VALUE = 30;
  /**
   * <pre>
   * Issuance date for this license document.
   * </pre>
   *
   * <code>LICENSE_ISSUE_DATE = 31;</code>
   */
  public static final int LICENSE_ISSUE_DATE_VALUE = 31;
  /**
   * <pre>
   * Expiration date for this license document.
   * </pre>
   *
   * <code>LICENSE_EXPIRY_DATE = 32;</code>
   */
  public static final int LICENSE_EXPIRY_DATE_VALUE = 32;
  /**
   * <pre>
   * Jurisdiction of issuance for this license document.
   * </pre>
   *
   * <code>ISSUER_JURISDICTION = 33;</code>
   */
  public static final int ISSUER_JURISDICTION_VALUE = 33;
  /**
   * <pre>
   * Jurisdiction-scoped format specifier for this document.
   * </pre>
   *
   * <code>ISSUER_JURISDICTION_FORMAT_VERSION = 34;</code>
   */
  public static final int ISSUER_JURISDICTION_FORMAT_VERSION_VALUE = 34;
  /**
   * <pre>
   * Unique document code for this specific instance of a license document.
   * </pre>
   *
   * <code>UNIQUE_DOCUMENT_CODE = 40;</code>
   */
  public static final int UNIQUE_DOCUMENT_CODE_VALUE = 40;
  /**
   * <pre>
   * Inventory unique control code, used for license document disambiguation if specified.
   * </pre>
   *
   * <code>INVENTORY_CONTROL_CODE = 41;</code>
   */
  public static final int INVENTORY_CONTROL_CODE_VALUE = 41;
  /**
   * <pre>
   * Date the user will turn 18 years old.
   * </pre>
   *
   * <code>UNDER_18_DATE = 50;</code>
   */
  public static final int UNDER_18_DATE_VALUE = 50;
  /**
   * <pre>
   * Date the user will turn 19 years old.
   * </pre>
   *
   * <code>UNDER_19_DATE = 51;</code>
   */
  public static final int UNDER_19_DATE_VALUE = 51;
  /**
   * <pre>
   * Date the user will turn 21 years old.
   * </pre>
   *
   * <code>UNDER_21_DATE = 52;</code>
   */
  public static final int UNDER_21_DATE_VALUE = 52;
  /**
   * <pre>
   * Flag to indicate the user was under 18 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_18 = 60;</code>
   */
  public static final int UNDER_18_VALUE = 60;
  /**
   * <pre>
   * Flag to indicate the user was under 19 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_19 = 61;</code>
   */
  public static final int UNDER_19_VALUE = 61;
  /**
   * <pre>
   * Flag to indicate the user was under 21 when this document was issued, and may still be.
   * </pre>
   *
   * <code>UNDER_21 = 62;</code>
   */
  public static final int UNDER_21_VALUE = 62;
  /**
   * <pre>
   * Flag to indicate this person opted to be an organ donor.
   * </pre>
   *
   * <code>ORGAN_DONOR = 63;</code>
   */
  public static final int ORGAN_DONOR_VALUE = 63;
  /**
   * <pre>
   * Flag to indicate that this person is a veteran.
   * </pre>
   *
   * <code>VETERAN = 64;</code>
   */
  public static final int VETERAN_VALUE = 64;
  /**
   * <pre>
   * Flag to indicate that this person is a nonresident.
   * </pre>
   *
   * <code>NONRESIDENT = 65;</code>
   */
  public static final int NONRESIDENT_VALUE = 65;
  /**
   * <pre>
   * Race or ethnicity information specified in this document.
   * </pre>
   *
   * <code>RACE_ETHNICITY = 70;</code>
   */
  public static final int RACE_ETHNICITY_VALUE = 70;
  /**
   * <pre>
   * Compliance-related data field for storage standards.
   * </pre>
   *
   * <code>COMPLIANCE_TYPE = 71;</code>
   */
  public static final int COMPLIANCE_TYPE_VALUE = 71;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static USDLField valueOf(int value) {
    return forNumber(value);
  }

  public static USDLField forNumber(int value) {
    switch (value) {
      case 0: return BACK_BARCODE;
      case 1: return FAMILY_NAME;
      case 2: return GIVEN_NAME;
      case 3: return MIDDLE_NAME;
      case 4: return FULL_NAME;
      case 5: return NAME_PREFIX;
      case 6: return NAME_SUFFIX;
      case 10: return DATE_OF_BIRTH;
      case 11: return SEX;
      case 12: return HEIGHT;
      case 13: return WEIGHT;
      case 14: return EYE_COLOR;
      case 15: return HAIR_COLOR;
      case 20: return FULL_ADDRESS;
      case 21: return ADDRESS_LINE;
      case 22: return ADDRESS_LINE2;
      case 23: return ADDRESS_CITY;
      case 24: return POSTAL_CODE;
      case 25: return STATE_JURISDICTION;
      case 30: return LICENSE_ID;
      case 31: return LICENSE_ISSUE_DATE;
      case 32: return LICENSE_EXPIRY_DATE;
      case 33: return ISSUER_JURISDICTION;
      case 34: return ISSUER_JURISDICTION_FORMAT_VERSION;
      case 40: return UNIQUE_DOCUMENT_CODE;
      case 41: return INVENTORY_CONTROL_CODE;
      case 50: return UNDER_18_DATE;
      case 51: return UNDER_19_DATE;
      case 52: return UNDER_21_DATE;
      case 60: return UNDER_18;
      case 61: return UNDER_19;
      case 62: return UNDER_21;
      case 63: return ORGAN_DONOR;
      case 64: return VETERAN;
      case 65: return NONRESIDENT;
      case 70: return RACE_ETHNICITY;
      case 71: return COMPLIANCE_TYPE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<USDLField>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      USDLField> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<USDLField>() {
          public USDLField findValueByNumber(int number) {
            return USDLField.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.bloombox.schema.identity.ids.USDLOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final USDLField[] VALUES = values();

  public static USDLField valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private USDLField(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.identity.ids.USDLField)
}

