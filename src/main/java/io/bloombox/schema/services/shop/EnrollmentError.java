/*
 * Copyright 2017, Bloombox, LLC.
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
// source: shop/v1/ShopService_v1.proto

package io.bloombox.schema.services.shop;

/**
 * <pre>
 * Specifies errors that may be encountered during enrollment of a new user.
 * </pre>
 *
 * Protobuf enum {@code services.shop.v1.EnrollmentError}
 */
public enum EnrollmentError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ENROLLMENT_ERROR = 0;</code>
   */
  NO_ENROLLMENT_ERROR(0),
  /**
   * <pre>
   * Invalid email address.
   * </pre>
   *
   * <code>INVALID_EMAIL = 1;</code>
   */
  INVALID_EMAIL(1),
  /**
   * <pre>
   * Invalid name info.
   * </pre>
   *
   * <code>INVALID_NAME = 2;</code>
   */
  INVALID_NAME(2),
  /**
   * <pre>
   * Invalid phone number.
   * </pre>
   *
   * <code>INVALID_PHONE = 3;</code>
   */
  INVALID_PHONE(3),
  /**
   * <pre>
   * Invalid date of birth.
   * </pre>
   *
   * <code>INVALID_DATE_OF_BIRTH = 4;</code>
   */
  INVALID_DATE_OF_BIRTH(4),
  /**
   * <pre>
   * Invalid recommendation ID
   * </pre>
   *
   * <code>INVALID_REC_ID = 5;</code>
   */
  INVALID_REC_ID(5),
  /**
   * <pre>
   * Invalid recommendation expiry date.
   * </pre>
   *
   * <code>INVALID_REC_EXPIRATION = 6;</code>
   */
  INVALID_REC_EXPIRATION(6),
  /**
   * <pre>
   * Invalid recommendation doctor name.
   * </pre>
   *
   * <code>INVALID_REC_DOCTOR_NAME = 7;</code>
   */
  INVALID_REC_DOCTOR_NAME(7),
  /**
   * <pre>
   * Invalid recommendation doctor phone.
   * </pre>
   *
   * <code>INVALID_REC_DOCTOR_PHONE = 8;</code>
   */
  INVALID_REC_DOCTOR_PHONE(8),
  /**
   * <pre>
   * Invalid USDL ID.
   * </pre>
   *
   * <code>INVALID_USDL_ID = 9;</code>
   */
  INVALID_USDL_ID(9),
  /**
   * <pre>
   * Invalid USDL expiration date.
   * </pre>
   *
   * <code>INVALID_USDL_EXPIRATION = 11;</code>
   */
  INVALID_USDL_EXPIRATION(11),
  /**
   * <pre>
   * Invalid USDL jurisdiction code.
   * </pre>
   *
   * <code>INVALID_USDL_JURISDICTION = 12;</code>
   */
  INVALID_USDL_JURISDICTION(12),
  /**
   * <pre>
   * The account in question already exists.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT = 13;</code>
   */
  ACCOUNT_CONFLICT(13),
  /**
   * <pre>
   * The account in question already exists, because the email in question is taken.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT_EMAIL = 14;</code>
   */
  ACCOUNT_CONFLICT_EMAIL(14),
  /**
   * <pre>
   * The account in question already exists, because the phone number in question is taken.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT_PHONE = 15;</code>
   */
  ACCOUNT_CONFLICT_PHONE(15),
  /**
   * <pre>
   * Invalid payload, in general.
   * </pre>
   *
   * <code>INVALID_ENROLLMENT_PAYLOAD = 99;</code>
   */
  INVALID_ENROLLMENT_PAYLOAD(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ENROLLMENT_ERROR = 0;</code>
   */
  public static final int NO_ENROLLMENT_ERROR_VALUE = 0;
  /**
   * <pre>
   * Invalid email address.
   * </pre>
   *
   * <code>INVALID_EMAIL = 1;</code>
   */
  public static final int INVALID_EMAIL_VALUE = 1;
  /**
   * <pre>
   * Invalid name info.
   * </pre>
   *
   * <code>INVALID_NAME = 2;</code>
   */
  public static final int INVALID_NAME_VALUE = 2;
  /**
   * <pre>
   * Invalid phone number.
   * </pre>
   *
   * <code>INVALID_PHONE = 3;</code>
   */
  public static final int INVALID_PHONE_VALUE = 3;
  /**
   * <pre>
   * Invalid date of birth.
   * </pre>
   *
   * <code>INVALID_DATE_OF_BIRTH = 4;</code>
   */
  public static final int INVALID_DATE_OF_BIRTH_VALUE = 4;
  /**
   * <pre>
   * Invalid recommendation ID
   * </pre>
   *
   * <code>INVALID_REC_ID = 5;</code>
   */
  public static final int INVALID_REC_ID_VALUE = 5;
  /**
   * <pre>
   * Invalid recommendation expiry date.
   * </pre>
   *
   * <code>INVALID_REC_EXPIRATION = 6;</code>
   */
  public static final int INVALID_REC_EXPIRATION_VALUE = 6;
  /**
   * <pre>
   * Invalid recommendation doctor name.
   * </pre>
   *
   * <code>INVALID_REC_DOCTOR_NAME = 7;</code>
   */
  public static final int INVALID_REC_DOCTOR_NAME_VALUE = 7;
  /**
   * <pre>
   * Invalid recommendation doctor phone.
   * </pre>
   *
   * <code>INVALID_REC_DOCTOR_PHONE = 8;</code>
   */
  public static final int INVALID_REC_DOCTOR_PHONE_VALUE = 8;
  /**
   * <pre>
   * Invalid USDL ID.
   * </pre>
   *
   * <code>INVALID_USDL_ID = 9;</code>
   */
  public static final int INVALID_USDL_ID_VALUE = 9;
  /**
   * <pre>
   * Invalid USDL expiration date.
   * </pre>
   *
   * <code>INVALID_USDL_EXPIRATION = 11;</code>
   */
  public static final int INVALID_USDL_EXPIRATION_VALUE = 11;
  /**
   * <pre>
   * Invalid USDL jurisdiction code.
   * </pre>
   *
   * <code>INVALID_USDL_JURISDICTION = 12;</code>
   */
  public static final int INVALID_USDL_JURISDICTION_VALUE = 12;
  /**
   * <pre>
   * The account in question already exists.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT = 13;</code>
   */
  public static final int ACCOUNT_CONFLICT_VALUE = 13;
  /**
   * <pre>
   * The account in question already exists, because the email in question is taken.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT_EMAIL = 14;</code>
   */
  public static final int ACCOUNT_CONFLICT_EMAIL_VALUE = 14;
  /**
   * <pre>
   * The account in question already exists, because the phone number in question is taken.
   * </pre>
   *
   * <code>ACCOUNT_CONFLICT_PHONE = 15;</code>
   */
  public static final int ACCOUNT_CONFLICT_PHONE_VALUE = 15;
  /**
   * <pre>
   * Invalid payload, in general.
   * </pre>
   *
   * <code>INVALID_ENROLLMENT_PAYLOAD = 99;</code>
   */
  public static final int INVALID_ENROLLMENT_PAYLOAD_VALUE = 99;


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
  public static EnrollmentError valueOf(int value) {
    return forNumber(value);
  }

  public static EnrollmentError forNumber(int value) {
    switch (value) {
      case 0: return NO_ENROLLMENT_ERROR;
      case 1: return INVALID_EMAIL;
      case 2: return INVALID_NAME;
      case 3: return INVALID_PHONE;
      case 4: return INVALID_DATE_OF_BIRTH;
      case 5: return INVALID_REC_ID;
      case 6: return INVALID_REC_EXPIRATION;
      case 7: return INVALID_REC_DOCTOR_NAME;
      case 8: return INVALID_REC_DOCTOR_PHONE;
      case 9: return INVALID_USDL_ID;
      case 11: return INVALID_USDL_EXPIRATION;
      case 12: return INVALID_USDL_JURISDICTION;
      case 13: return ACCOUNT_CONFLICT;
      case 14: return ACCOUNT_CONFLICT_EMAIL;
      case 15: return ACCOUNT_CONFLICT_PHONE;
      case 99: return INVALID_ENROLLMENT_PAYLOAD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<EnrollmentError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      EnrollmentError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<EnrollmentError>() {
          public EnrollmentError findValueByNumber(int number) {
            return EnrollmentError.forNumber(number);
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
    return io.bloombox.schema.services.shop.ShopServiceV1.getDescriptor().getEnumTypes().get(2);
  }

  private static final EnrollmentError[] VALUES = values();

  public static EnrollmentError valueOf(
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

  private EnrollmentError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.shop.v1.EnrollmentError)
}

