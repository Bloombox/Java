/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
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
// source: identity/v1beta1/IdentityService_Beta1.proto

package io.bloombox.schema.services.identity.v1beta1;

/**
 * <pre>
 * Enumerates error codes that may be emitted by the identity service.
 * </pre>
 *
 * Protobuf enum {@code bloombox.services.identity.v1beta1.IdentityError}
 */
public enum IdentityError
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  NO_ERROR(0),
  /**
   * <pre>
   * The subject public key could not be located at the provided fingerprint or key ID.
   * </pre>
   *
   * <code>KEY_NOT_FOUND = 1;</code>
   */
  KEY_NOT_FOUND(1),
  /**
   * <pre>
   * The subject public key reference was found to be invalid.
   * </pre>
   *
   * <code>KEY_ID_INVALID = 2;</code>
   */
  KEY_ID_INVALID(2),
  /**
   * <pre>
   * The subject public key registration conflicts with a previous one.
   * </pre>
   *
   * <code>KEY_CONFLICT = 3;</code>
   */
  KEY_CONFLICT(3),
  /**
   * <pre>
   * An unidentified internal error occurred.
   * </pre>
   *
   * <code>INTERNAL_ERROR = 99;</code>
   */
  INTERNAL_ERROR(99),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * No error occurred.
   * </pre>
   *
   * <code>NO_ERROR = 0;</code>
   */
  public static final int NO_ERROR_VALUE = 0;
  /**
   * <pre>
   * The subject public key could not be located at the provided fingerprint or key ID.
   * </pre>
   *
   * <code>KEY_NOT_FOUND = 1;</code>
   */
  public static final int KEY_NOT_FOUND_VALUE = 1;
  /**
   * <pre>
   * The subject public key reference was found to be invalid.
   * </pre>
   *
   * <code>KEY_ID_INVALID = 2;</code>
   */
  public static final int KEY_ID_INVALID_VALUE = 2;
  /**
   * <pre>
   * The subject public key registration conflicts with a previous one.
   * </pre>
   *
   * <code>KEY_CONFLICT = 3;</code>
   */
  public static final int KEY_CONFLICT_VALUE = 3;
  /**
   * <pre>
   * An unidentified internal error occurred.
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
  public static IdentityError valueOf(int value) {
    return forNumber(value);
  }

  public static IdentityError forNumber(int value) {
    switch (value) {
      case 0: return NO_ERROR;
      case 1: return KEY_NOT_FOUND;
      case 2: return KEY_ID_INVALID;
      case 3: return KEY_CONFLICT;
      case 99: return INTERNAL_ERROR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityError>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentityError> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentityError>() {
          public IdentityError findValueByNumber(int number) {
            return IdentityError.forNumber(number);
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
    return io.bloombox.schema.services.identity.v1beta1.IdentityServiceBeta1.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentityError[] VALUES = values();

  public static IdentityError valueOf(
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

  private IdentityError(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.services.identity.v1beta1.IdentityError)
}

