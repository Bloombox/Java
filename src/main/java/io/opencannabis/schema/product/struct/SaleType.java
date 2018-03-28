/*
 * Copyright 2018, Bloombox, LLC.
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
// source: structs/pricing/SaleDescriptor.proto

package io.opencannabis.schema.product.struct;

/**
 * Protobuf enum {@code opencannabis.structs.pricing.SaleType}
 */
public enum SaleType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERCENTAGE_REDUCTION = 0;</code>
   */
  PERCENTAGE_REDUCTION(0),
  /**
   * <code>VALUE_REDUCTION = 1;</code>
   */
  VALUE_REDUCTION(1),
  /**
   * <code>BOGO = 2;</code>
   */
  BOGO(2),
  /**
   * <code>LOYALTY = 3;</code>
   */
  LOYALTY(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERCENTAGE_REDUCTION = 0;</code>
   */
  public static final int PERCENTAGE_REDUCTION_VALUE = 0;
  /**
   * <code>VALUE_REDUCTION = 1;</code>
   */
  public static final int VALUE_REDUCTION_VALUE = 1;
  /**
   * <code>BOGO = 2;</code>
   */
  public static final int BOGO_VALUE = 2;
  /**
   * <code>LOYALTY = 3;</code>
   */
  public static final int LOYALTY_VALUE = 3;


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
  public static SaleType valueOf(int value) {
    return forNumber(value);
  }

  public static SaleType forNumber(int value) {
    switch (value) {
      case 0: return PERCENTAGE_REDUCTION;
      case 1: return VALUE_REDUCTION;
      case 2: return BOGO;
      case 3: return LOYALTY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SaleType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SaleType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SaleType>() {
          public SaleType findValueByNumber(int number) {
            return SaleType.forNumber(number);
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
    return io.opencannabis.schema.product.struct.ProductDiscount.getDescriptor().getEnumTypes().get(0);
  }

  private static final SaleType[] VALUES = values();

  public static SaleType valueOf(
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

  private SaleType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.pricing.SaleType)
}

