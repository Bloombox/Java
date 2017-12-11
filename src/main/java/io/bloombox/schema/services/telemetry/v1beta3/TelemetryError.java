/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta3/TelemetryService_Beta3.proto

package io.bloombox.schema.services.telemetry.v1beta3;

/**
 * <pre>
 * Specifies known errors that may be emitted in exceptional processing cases.
 * </pre>
 *
 * Protobuf enum {@code services.telemetry.v1beta3.TelemetryError}
 */
public enum TelemetryError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * An unknown internal error occurred.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  UNKNOWN(0),
  /**
   * <pre>
   * The collection value was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_COLLECTION = 1;</code>
   */
  INVALID_COLLECTION(1),
  /**
   * <pre>
   * The partner code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 2;</code>
   */
  INVALID_PARTNER(2),
  /**
   * <pre>
   * The location code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 3;</code>
   */
  INVALID_LOCATION(3),
  /**
   * <pre>
   * The device key was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_DEVICE = 4;</code>
   */
  INVALID_DEVICE(4),
  /**
   * <pre>
   * The user key or ID was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_USER = 5;</code>
   */
  INVALID_USER(5),
  /**
   * <pre>
   * The client key or ID was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_CLIENT = 6;</code>
   */
  INVALID_CLIENT(6),
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>PARTNER_NOT_FOUND = 7;</code>
   */
  PARTNER_NOT_FOUND(7),
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>LOCATION_NOT_FOUND = 8;</code>
   */
  LOCATION_NOT_FOUND(8),
  /**
   * <pre>
   * The request payload was invalid in some manner.
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 99;</code>
   */
  INVALID_PAYLOAD(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * An unknown internal error occurred.
   * </pre>
   *
   * <code>UNKNOWN = 0;</code>
   */
  public static final int UNKNOWN_VALUE = 0;
  /**
   * <pre>
   * The collection value was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_COLLECTION = 1;</code>
   */
  public static final int INVALID_COLLECTION_VALUE = 1;
  /**
   * <pre>
   * The partner code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_PARTNER = 2;</code>
   */
  public static final int INVALID_PARTNER_VALUE = 2;
  /**
   * <pre>
   * The location code was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_LOCATION = 3;</code>
   */
  public static final int INVALID_LOCATION_VALUE = 3;
  /**
   * <pre>
   * The device key was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_DEVICE = 4;</code>
   */
  public static final int INVALID_DEVICE_VALUE = 4;
  /**
   * <pre>
   * The user key or ID was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_USER = 5;</code>
   */
  public static final int INVALID_USER_VALUE = 5;
  /**
   * <pre>
   * The client key or ID was missing or found to be invalid.
   * </pre>
   *
   * <code>INVALID_CLIENT = 6;</code>
   */
  public static final int INVALID_CLIENT_VALUE = 6;
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>PARTNER_NOT_FOUND = 7;</code>
   */
  public static final int PARTNER_NOT_FOUND_VALUE = 7;
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>LOCATION_NOT_FOUND = 8;</code>
   */
  public static final int LOCATION_NOT_FOUND_VALUE = 8;
  /**
   * <pre>
   * The request payload was invalid in some manner.
   * </pre>
   *
   * <code>INVALID_PAYLOAD = 99;</code>
   */
  public static final int INVALID_PAYLOAD_VALUE = 99;


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
  public static TelemetryError valueOf(int value) {
    return forNumber(value);
  }

  public static TelemetryError forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return INVALID_COLLECTION;
      case 2: return INVALID_PARTNER;
      case 3: return INVALID_LOCATION;
      case 4: return INVALID_DEVICE;
      case 5: return INVALID_USER;
      case 6: return INVALID_CLIENT;
      case 7: return PARTNER_NOT_FOUND;
      case 8: return LOCATION_NOT_FOUND;
      case 99: return INVALID_PAYLOAD;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TelemetryError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TelemetryError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TelemetryError>() {
          public TelemetryError findValueByNumber(int number) {
            return TelemetryError.forNumber(number);
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
    return io.bloombox.schema.services.telemetry.v1beta3.TelemetryServiceBeta3.getDescriptor().getEnumTypes().get(1);
  }

  private static final TelemetryError[] VALUES = values();

  public static TelemetryError valueOf(
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

  private TelemetryError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:services.telemetry.v1beta3.TelemetryError)
}

