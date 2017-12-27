/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
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
// source: security/access/PartnerPermissions.proto

package io.bloombox.schema.security.access;

/**
 * Protobuf enum {@code security.access.PartnerPermission}
 */
public enum PartnerPermission
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>OWNER = 0;</code>
   */
  OWNER(0),
  /**
   * <code>SUPERVISOR = 1;</code>
   */
  SUPERVISOR(1),
  /**
   * <code>BILLING = 2;</code>
   */
  BILLING(2),
  /**
   * <code>AUDIT = 3;</code>
   */
  AUDIT(3),
  /**
   * <code>READONLY = 4;</code>
   */
  READONLY(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>OWNER = 0;</code>
   */
  public static final int OWNER_VALUE = 0;
  /**
   * <code>SUPERVISOR = 1;</code>
   */
  public static final int SUPERVISOR_VALUE = 1;
  /**
   * <code>BILLING = 2;</code>
   */
  public static final int BILLING_VALUE = 2;
  /**
   * <code>AUDIT = 3;</code>
   */
  public static final int AUDIT_VALUE = 3;
  /**
   * <code>READONLY = 4;</code>
   */
  public static final int READONLY_VALUE = 4;


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
  public static PartnerPermission valueOf(int value) {
    return forNumber(value);
  }

  public static PartnerPermission forNumber(int value) {
    switch (value) {
      case 0: return OWNER;
      case 1: return SUPERVISOR;
      case 2: return BILLING;
      case 3: return AUDIT;
      case 4: return READONLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PartnerPermission>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PartnerPermission> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PartnerPermission>() {
          public PartnerPermission findValueByNumber(int number) {
            return PartnerPermission.forNumber(number);
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
    return io.bloombox.schema.security.access.PartnerPermissions.getDescriptor().getEnumTypes().get(0);
  }

  private static final PartnerPermission[] VALUES = values();

  public static PartnerPermission valueOf(
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

  private PartnerPermission(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:security.access.PartnerPermission)
}

