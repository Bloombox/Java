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
// source: pos/v1beta1/POSService_Beta1.proto

package io.bloombox.schema.services.pos.v1beta1;

/**
 * <pre>
 * Enumerates error states that may be served from the POS service.
 * </pre>
 *
 * Protobuf enum {@code bloombox.services.pos.v1beta1.POSError}
 */
public enum POSError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * An unknown internal error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * The partner code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 1;</code>
   */
  INVALID_PARTNER(1),
  /**
   * <pre>
   * The location code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 2;</code>
   */
  INVALID_LOCATION(2),
  /**
   * <pre>
   * The device key was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_DEVICE = 3;</code>
   */
  INVALID_DEVICE(3),
  /**
   * <pre>
   * The specified ID token was invalid or missing.
   * </pre>
   *
   * <code>INVALID_ID_TOKEN = 4;</code>
   */
  INVALID_ID_TOKEN(4),
  /**
   * <pre>
   * The device's signature was invalid or missing.
   * </pre>
   *
   * <code>INVALID_DEVICE_SIGNATURE = 5;</code>
   */
  INVALID_DEVICE_SIGNATURE(5),
  /**
   * <pre>
   * Invalid purchase payload.
   * </pre>
   *
   * <code>INVALID_TICKET = 6;</code>
   */
  INVALID_TICKET(6),
  /**
   * <pre>
   * Invalid purchase key.
   * </pre>
   *
   * <code>INVALID_TICKET_KEY = 7;</code>
   */
  INVALID_TICKET_KEY(7),
  /**
   * <pre>
   * Purchase signature could not be validated.
   * </pre>
   *
   * <code>INVALID_TICKET_SIGNATURE = 8;</code>
   */
  INVALID_TICKET_SIGNATURE(8),
  /**
   * <pre>
   * An invalid timestamp was provided.
   * </pre>
   *
   * <code>INVALID_TIMESTAMP = 9;</code>
   */
  INVALID_TIMESTAMP(9),
  /**
   * <pre>
   * Unable to locate the specified device.
   * </pre>
   *
   * <code>DEVICE_NOT_FOUND = 10;</code>
   */
  DEVICE_NOT_FOUND(10),
  /**
   * <pre>
   * Unable to locate the specified session.
   * </pre>
   *
   * <code>SESSION_NOT_FOUND = 11;</code>
   */
  SESSION_NOT_FOUND(11),
  /**
   * <pre>
   * Specifies an illegal session state.
   * </pre>
   *
   * <code>SESSION_CONFLICT = 12;</code>
   */
  SESSION_CONFLICT(12),
  /**
   * <pre>
   * The given purchase was structurally invalid.
   * </pre>
   *
   * <code>ILLEGAL_TICKET_STRUCTURE = 20;</code>
   */
  ILLEGAL_TICKET_STRUCTURE(20),
  /**
   * <pre>
   * The specified ticket version is out of date or invalid.
   * </pre>
   *
   * <code>ILLEGAL_TICKET_VERSION = 21;</code>
   */
  ILLEGAL_TICKET_VERSION(21),
  /**
   * <pre>
   * The provided timestamp occurs before the last known event.
   * </pre>
   *
   * <code>ILLEGAL_TIMESTAMP = 22;</code>
   */
  ILLEGAL_TIMESTAMP(22),
  /**
   * <pre>
   * Purchase could not be found.
   * </pre>
   *
   * <code>TICKET_NOT_FOUND = 30;</code>
   */
  TICKET_NOT_FOUND(30),
  /**
   * <pre>
   * There was a conflict preventing the ticket operation.
   * </pre>
   *
   * <code>TICKET_CONFLICT = 31;</code>
   */
  TICKET_CONFLICT(31),
  /**
   * <pre>
   * The ticket in question is currently claimed and cannot be claimed again until closed.
   * </pre>
   *
   * <code>TICKET_CLAIMED = 32;</code>
   */
  TICKET_CLAIMED(32),
  /**
   * <pre>
   * Generic invalid request.
   * </pre>
   *
   * <code>INVALID_REQUEST = 96;</code>
   */
  INVALID_REQUEST(96),
  /**
   * <pre>
   * Access was denied due to authorization failure.
   * </pre>
   *
   * <code>AUTHORIZATION_DENIED = 97;</code>
   */
  AUTHORIZATION_DENIED(97),
  /**
   * <pre>
   * Access cannot be granted due to a conflict.
   * </pre>
   *
   * <code>ACCESS_CONFLICT = 98;</code>
   */
  ACCESS_CONFLICT(98),
  /**
   * <pre>
   * An internal error occurred.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  INTERNAL_ERROR(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * An unknown internal error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * The partner code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 1;</code>
   */
  public static final int INVALID_PARTNER_VALUE = 1;
  /**
   * <pre>
   * The location code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 2;</code>
   */
  public static final int INVALID_LOCATION_VALUE = 2;
  /**
   * <pre>
   * The device key was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_DEVICE = 3;</code>
   */
  public static final int INVALID_DEVICE_VALUE = 3;
  /**
   * <pre>
   * The specified ID token was invalid or missing.
   * </pre>
   *
   * <code>INVALID_ID_TOKEN = 4;</code>
   */
  public static final int INVALID_ID_TOKEN_VALUE = 4;
  /**
   * <pre>
   * The device's signature was invalid or missing.
   * </pre>
   *
   * <code>INVALID_DEVICE_SIGNATURE = 5;</code>
   */
  public static final int INVALID_DEVICE_SIGNATURE_VALUE = 5;
  /**
   * <pre>
   * Invalid purchase payload.
   * </pre>
   *
   * <code>INVALID_TICKET = 6;</code>
   */
  public static final int INVALID_TICKET_VALUE = 6;
  /**
   * <pre>
   * Invalid purchase key.
   * </pre>
   *
   * <code>INVALID_TICKET_KEY = 7;</code>
   */
  public static final int INVALID_TICKET_KEY_VALUE = 7;
  /**
   * <pre>
   * Purchase signature could not be validated.
   * </pre>
   *
   * <code>INVALID_TICKET_SIGNATURE = 8;</code>
   */
  public static final int INVALID_TICKET_SIGNATURE_VALUE = 8;
  /**
   * <pre>
   * An invalid timestamp was provided.
   * </pre>
   *
   * <code>INVALID_TIMESTAMP = 9;</code>
   */
  public static final int INVALID_TIMESTAMP_VALUE = 9;
  /**
   * <pre>
   * Unable to locate the specified device.
   * </pre>
   *
   * <code>DEVICE_NOT_FOUND = 10;</code>
   */
  public static final int DEVICE_NOT_FOUND_VALUE = 10;
  /**
   * <pre>
   * Unable to locate the specified session.
   * </pre>
   *
   * <code>SESSION_NOT_FOUND = 11;</code>
   */
  public static final int SESSION_NOT_FOUND_VALUE = 11;
  /**
   * <pre>
   * Specifies an illegal session state.
   * </pre>
   *
   * <code>SESSION_CONFLICT = 12;</code>
   */
  public static final int SESSION_CONFLICT_VALUE = 12;
  /**
   * <pre>
   * The given purchase was structurally invalid.
   * </pre>
   *
   * <code>ILLEGAL_TICKET_STRUCTURE = 20;</code>
   */
  public static final int ILLEGAL_TICKET_STRUCTURE_VALUE = 20;
  /**
   * <pre>
   * The specified ticket version is out of date or invalid.
   * </pre>
   *
   * <code>ILLEGAL_TICKET_VERSION = 21;</code>
   */
  public static final int ILLEGAL_TICKET_VERSION_VALUE = 21;
  /**
   * <pre>
   * The provided timestamp occurs before the last known event.
   * </pre>
   *
   * <code>ILLEGAL_TIMESTAMP = 22;</code>
   */
  public static final int ILLEGAL_TIMESTAMP_VALUE = 22;
  /**
   * <pre>
   * Purchase could not be found.
   * </pre>
   *
   * <code>TICKET_NOT_FOUND = 30;</code>
   */
  public static final int TICKET_NOT_FOUND_VALUE = 30;
  /**
   * <pre>
   * There was a conflict preventing the ticket operation.
   * </pre>
   *
   * <code>TICKET_CONFLICT = 31;</code>
   */
  public static final int TICKET_CONFLICT_VALUE = 31;
  /**
   * <pre>
   * The ticket in question is currently claimed and cannot be claimed again until closed.
   * </pre>
   *
   * <code>TICKET_CLAIMED = 32;</code>
   */
  public static final int TICKET_CLAIMED_VALUE = 32;
  /**
   * <pre>
   * Generic invalid request.
   * </pre>
   *
   * <code>INVALID_REQUEST = 96;</code>
   */
  public static final int INVALID_REQUEST_VALUE = 96;
  /**
   * <pre>
   * Access was denied due to authorization failure.
   * </pre>
   *
   * <code>AUTHORIZATION_DENIED = 97;</code>
   */
  public static final int AUTHORIZATION_DENIED_VALUE = 97;
  /**
   * <pre>
   * Access cannot be granted due to a conflict.
   * </pre>
   *
   * <code>ACCESS_CONFLICT = 98;</code>
   */
  public static final int ACCESS_CONFLICT_VALUE = 98;
  /**
   * <pre>
   * An internal error occurred.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  public static final int INTERNAL_ERROR_VALUE = 99;


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
  public static POSError valueOf(int value) {
    return forNumber(value);
  }

  public static POSError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return INVALID_PARTNER;
      case 2: return INVALID_LOCATION;
      case 3: return INVALID_DEVICE;
      case 4: return INVALID_ID_TOKEN;
      case 5: return INVALID_DEVICE_SIGNATURE;
      case 6: return INVALID_TICKET;
      case 7: return INVALID_TICKET_KEY;
      case 8: return INVALID_TICKET_SIGNATURE;
      case 9: return INVALID_TIMESTAMP;
      case 10: return DEVICE_NOT_FOUND;
      case 11: return SESSION_NOT_FOUND;
      case 12: return SESSION_CONFLICT;
      case 20: return ILLEGAL_TICKET_STRUCTURE;
      case 21: return ILLEGAL_TICKET_VERSION;
      case 22: return ILLEGAL_TIMESTAMP;
      case 30: return TICKET_NOT_FOUND;
      case 31: return TICKET_CONFLICT;
      case 32: return TICKET_CLAIMED;
      case 96: return INVALID_REQUEST;
      case 97: return AUTHORIZATION_DENIED;
      case 98: return ACCESS_CONFLICT;
      case 99: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<POSError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      POSError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<POSError>() {
          public POSError findValueByNumber(int number) {
            return POSError.forNumber(number);
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
    return io.bloombox.schema.services.pos.v1beta1.POSServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final POSError[] VALUES = values();

  public static POSError valueOf(
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

  private POSError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.services.pos.v1beta1.POSError)
}

