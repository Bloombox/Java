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
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * Protobuf enum {@code opencannabis.structs.labtesting.CannabinoidRatio}
 */
public enum CannabinoidRatio
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NO_CANNABINOID_PREFERENCE = 0;</code>
   */
  NO_CANNABINOID_PREFERENCE(0),
  /**
   * <code>THC_ONLY = 1;</code>
   */
  THC_ONLY(1),
  /**
   * <code>THC_OVER_CBD = 2;</code>
   */
  THC_OVER_CBD(2),
  /**
   * <code>EQUAL = 3;</code>
   */
  EQUAL(3),
  /**
   * <code>CBD_OVER_THC = 4;</code>
   */
  CBD_OVER_THC(4),
  /**
   * <code>CBD_ONLY = 5;</code>
   */
  CBD_ONLY(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NO_CANNABINOID_PREFERENCE = 0;</code>
   */
  public static final int NO_CANNABINOID_PREFERENCE_VALUE = 0;
  /**
   * <code>THC_ONLY = 1;</code>
   */
  public static final int THC_ONLY_VALUE = 1;
  /**
   * <code>THC_OVER_CBD = 2;</code>
   */
  public static final int THC_OVER_CBD_VALUE = 2;
  /**
   * <code>EQUAL = 3;</code>
   */
  public static final int EQUAL_VALUE = 3;
  /**
   * <code>CBD_OVER_THC = 4;</code>
   */
  public static final int CBD_OVER_THC_VALUE = 4;
  /**
   * <code>CBD_ONLY = 5;</code>
   */
  public static final int CBD_ONLY_VALUE = 5;


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
  public static CannabinoidRatio valueOf(int value) {
    return forNumber(value);
  }

  public static CannabinoidRatio forNumber(int value) {
    switch (value) {
      case 0: return NO_CANNABINOID_PREFERENCE;
      case 1: return THC_ONLY;
      case 2: return THC_OVER_CBD;
      case 3: return EQUAL;
      case 4: return CBD_OVER_THC;
      case 5: return CBD_ONLY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CannabinoidRatio>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CannabinoidRatio> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CannabinoidRatio>() {
          public CannabinoidRatio findValueByNumber(int number) {
            return CannabinoidRatio.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor().getEnumTypes().get(1);
  }

  private static final CannabinoidRatio[] VALUES = values();

  public static CannabinoidRatio valueOf(
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

  private CannabinoidRatio(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.CannabinoidRatio)
}

