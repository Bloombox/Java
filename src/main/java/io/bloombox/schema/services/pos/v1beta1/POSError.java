/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
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
 * Enumerated error states that may be served from the POS service.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.services.pos.v1beta1.POSError}
 */
public enum POSError
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
   * The specified partner could not be found.
   * </pre>
   *
   * <code>PARTNER_NOT_FOUND = 5;</code>
   */
  PARTNER_NOT_FOUND(5),
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>LOCATION_NOT_FOUND = 6;</code>
   */
  LOCATION_NOT_FOUND(6),
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
   * The specified partner could not be found.
   * </pre>
   *
   * <code>PARTNER_NOT_FOUND = 5;</code>
   */
  public static final int PARTNER_NOT_FOUND_VALUE = 5;
  /**
   * <pre>
   * The specified partner could not be found.
   * </pre>
   *
   * <code>LOCATION_NOT_FOUND = 6;</code>
   */
  public static final int LOCATION_NOT_FOUND_VALUE = 6;
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
  public static POSError valueOf(int value) {
    return forNumber(value);
  }

  public static POSError forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN;
      case 1: return INVALID_COLLECTION;
      case 2: return INVALID_PARTNER;
      case 3: return INVALID_LOCATION;
      case 4: return INVALID_DEVICE;
      case 5: return PARTNER_NOT_FOUND;
      case 6: return LOCATION_NOT_FOUND;
      case 99: return INVALID_PAYLOAD;
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

  // @@protoc_insertion_point(enum_scope:bloombox.schema.services.pos.v1beta1.POSError)
}

