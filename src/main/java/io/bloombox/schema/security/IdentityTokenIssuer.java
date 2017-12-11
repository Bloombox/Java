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
// source: security/IdentityToken.proto

package io.bloombox.schema.security;

/**
 * Protobuf enum {@code security.IdentityTokenIssuer}
 */
public enum IdentityTokenIssuer
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>INTERNAL = 0;</code>
   */
  INTERNAL(0),
  /**
   * <code>FIREBASE = 1;</code>
   */
  FIREBASE(1),
  /**
   * <code>AUTH0 = 2;</code>
   */
  AUTH0(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>INTERNAL = 0;</code>
   */
  public static final int INTERNAL_VALUE = 0;
  /**
   * <code>FIREBASE = 1;</code>
   */
  public static final int FIREBASE_VALUE = 1;
  /**
   * <code>AUTH0 = 2;</code>
   */
  public static final int AUTH0_VALUE = 2;


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
  public static IdentityTokenIssuer valueOf(int value) {
    return forNumber(value);
  }

  public static IdentityTokenIssuer forNumber(int value) {
    switch (value) {
      case 0: return INTERNAL;
      case 1: return FIREBASE;
      case 2: return AUTH0;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<IdentityTokenIssuer>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      IdentityTokenIssuer> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<IdentityTokenIssuer>() {
          public IdentityTokenIssuer findValueByNumber(int number) {
            return IdentityTokenIssuer.forNumber(number);
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
    return io.bloombox.schema.security.IdentityTokenOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final IdentityTokenIssuer[] VALUES = values();

  public static IdentityTokenIssuer valueOf(
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

  private IdentityTokenIssuer(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:security.IdentityTokenIssuer)
}

