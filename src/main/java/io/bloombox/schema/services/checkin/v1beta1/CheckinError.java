/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

/**
 * <pre>
 * Enumerates known errors that may be thrown by checkin operations.
 * </pre>
 *
 * Protobuf enum {@code bloombox.services.checkin.v1beta1.CheckinError}
 */
public enum CheckinError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error was encountered.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * Unable to locate the specified identification document.
   * </pre>
   *
   * <code>ID_NOT_FOUND = 1;</code>
   */
  ID_NOT_FOUND(1),
  /**
   * <pre>
   * The user's subject ID, either provided or already known, is currently expired.
   * </pre>
   *
   * <code>ID_EXPIRED = 2;</code>
   */
  ID_EXPIRED(2),
  /**
   * <pre>
   * The user's subject ID failed to be validated in some manner.
   * </pre>
   *
   * <code>ID_INVALID = 3;</code>
   */
  ID_INVALID(3),
  /**
   * <pre>
   * The subject ID type is currently unsupported.
   * </pre>
   *
   * <code>ID_TYPE_UNSUPPORTED = 4;</code>
   */
  ID_TYPE_UNSUPPORTED(4),
  /**
   * <pre>
   * The subject digital card type is invalid or unrecognized.
   * </pre>
   *
   * <code>CARD_TYPE_INVALID = 5;</code>
   */
  CARD_TYPE_INVALID(5),
  /**
   * <pre>
   * The subject digital card is expired.
   * </pre>
   *
   * <code>CARD_EXPIRED = 6;</code>
   */
  CARD_EXPIRED(6),
  /**
   * <pre>
   * The subject digital card is suspended.
   * </pre>
   *
   * <code>CARD_SUSPENDED = 7;</code>
   */
  CARD_SUSPENDED(7),
  /**
   * <pre>
   * The resolved user account is entirely suspended from Bloombox.
   * </pre>
   *
   * <code>USER_SUSPENDED = 8;</code>
   */
  USER_SUSPENDED(8),
  /**
   * <pre>
   * The resolved user account is suspended by the backing partner.
   * </pre>
   *
   * <code>PARTNER_SUSPENDED = 9;</code>
   */
  PARTNER_SUSPENDED(9),
  /**
   * <pre>
   * The partner code was invalid in some way.
   * </pre>
   *
   * <code>PARTNER_INVALID = 10;</code>
   */
  PARTNER_INVALID(10),
  /**
   * <pre>
   * The location code was invalid in some way.
   * </pre>
   *
   * <code>LOCATION_INVALID = 11;</code>
   */
  LOCATION_INVALID(11),
  /**
   * <pre>
   * The subject document has an invalid issuance jurisdiction.
   * </pre>
   *
   * <code>JURISDICTION_INVALID = 12;</code>
   */
  JURISDICTION_INVALID(12),
  /**
   * <pre>
   * The subject document issuance jurisdiction is not supported or eligible.
   * </pre>
   *
   * <code>JURISDICTION_UNSUPPORTED = 13;</code>
   */
  JURISDICTION_UNSUPPORTED(13),
  /**
   * <pre>
   * The user is not old enough to meet the requisite age requirements for the jurisdiction within which
   * they attempted to checkin.
   * </pre>
   *
   * <code>USER_UNDERAGE = 14;</code>
   */
  USER_UNDERAGE(14),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error was encountered.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * Unable to locate the specified identification document.
   * </pre>
   *
   * <code>ID_NOT_FOUND = 1;</code>
   */
  public static final int ID_NOT_FOUND_VALUE = 1;
  /**
   * <pre>
   * The user's subject ID, either provided or already known, is currently expired.
   * </pre>
   *
   * <code>ID_EXPIRED = 2;</code>
   */
  public static final int ID_EXPIRED_VALUE = 2;
  /**
   * <pre>
   * The user's subject ID failed to be validated in some manner.
   * </pre>
   *
   * <code>ID_INVALID = 3;</code>
   */
  public static final int ID_INVALID_VALUE = 3;
  /**
   * <pre>
   * The subject ID type is currently unsupported.
   * </pre>
   *
   * <code>ID_TYPE_UNSUPPORTED = 4;</code>
   */
  public static final int ID_TYPE_UNSUPPORTED_VALUE = 4;
  /**
   * <pre>
   * The subject digital card type is invalid or unrecognized.
   * </pre>
   *
   * <code>CARD_TYPE_INVALID = 5;</code>
   */
  public static final int CARD_TYPE_INVALID_VALUE = 5;
  /**
   * <pre>
   * The subject digital card is expired.
   * </pre>
   *
   * <code>CARD_EXPIRED = 6;</code>
   */
  public static final int CARD_EXPIRED_VALUE = 6;
  /**
   * <pre>
   * The subject digital card is suspended.
   * </pre>
   *
   * <code>CARD_SUSPENDED = 7;</code>
   */
  public static final int CARD_SUSPENDED_VALUE = 7;
  /**
   * <pre>
   * The resolved user account is entirely suspended from Bloombox.
   * </pre>
   *
   * <code>USER_SUSPENDED = 8;</code>
   */
  public static final int USER_SUSPENDED_VALUE = 8;
  /**
   * <pre>
   * The resolved user account is suspended by the backing partner.
   * </pre>
   *
   * <code>PARTNER_SUSPENDED = 9;</code>
   */
  public static final int PARTNER_SUSPENDED_VALUE = 9;
  /**
   * <pre>
   * The partner code was invalid in some way.
   * </pre>
   *
   * <code>PARTNER_INVALID = 10;</code>
   */
  public static final int PARTNER_INVALID_VALUE = 10;
  /**
   * <pre>
   * The location code was invalid in some way.
   * </pre>
   *
   * <code>LOCATION_INVALID = 11;</code>
   */
  public static final int LOCATION_INVALID_VALUE = 11;
  /**
   * <pre>
   * The subject document has an invalid issuance jurisdiction.
   * </pre>
   *
   * <code>JURISDICTION_INVALID = 12;</code>
   */
  public static final int JURISDICTION_INVALID_VALUE = 12;
  /**
   * <pre>
   * The subject document issuance jurisdiction is not supported or eligible.
   * </pre>
   *
   * <code>JURISDICTION_UNSUPPORTED = 13;</code>
   */
  public static final int JURISDICTION_UNSUPPORTED_VALUE = 13;
  /**
   * <pre>
   * The user is not old enough to meet the requisite age requirements for the jurisdiction within which
   * they attempted to checkin.
   * </pre>
   *
   * <code>USER_UNDERAGE = 14;</code>
   */
  public static final int USER_UNDERAGE_VALUE = 14;


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
  public static CheckinError valueOf(int value) {
    return forNumber(value);
  }

  public static CheckinError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return ID_NOT_FOUND;
      case 2: return ID_EXPIRED;
      case 3: return ID_INVALID;
      case 4: return ID_TYPE_UNSUPPORTED;
      case 5: return CARD_TYPE_INVALID;
      case 6: return CARD_EXPIRED;
      case 7: return CARD_SUSPENDED;
      case 8: return USER_SUSPENDED;
      case 9: return PARTNER_SUSPENDED;
      case 10: return PARTNER_INVALID;
      case 11: return LOCATION_INVALID;
      case 12: return JURISDICTION_INVALID;
      case 13: return JURISDICTION_UNSUPPORTED;
      case 14: return USER_UNDERAGE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CheckinError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CheckinError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CheckinError>() {
          public CheckinError findValueByNumber(int number) {
            return CheckinError.forNumber(number);
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
    return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final CheckinError[] VALUES = values();

  public static CheckinError valueOf(
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

  private CheckinError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.services.checkin.v1beta1.CheckinError)
}

