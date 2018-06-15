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
 * <pre>
 * Generic potency estimate enumeration, either based on subjective product testing or calculated against some metric
 * for the user's tolerance level.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.structs.labtesting.PotencyEstimate}
 */
public enum PotencyEstimate
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Light potency.
   * </pre>
   *
   * <code>LIGHT = 0;</code>
   */
  LIGHT(0),
  /**
   * <pre>
   * Medium potency.
   * </pre>
   *
   * <code>MEDIUM = 1;</code>
   */
  MEDIUM(1),
  /**
   * <pre>
   * Heavy potency.
   * </pre>
   *
   * <code>HEAVY = 2;</code>
   */
  HEAVY(2),
  /**
   * <pre>
   * Top/super potency.
   * </pre>
   *
   * <code>SUPER = 3;</code>
   */
  SUPER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Light potency.
   * </pre>
   *
   * <code>LIGHT = 0;</code>
   */
  public static final int LIGHT_VALUE = 0;
  /**
   * <pre>
   * Medium potency.
   * </pre>
   *
   * <code>MEDIUM = 1;</code>
   */
  public static final int MEDIUM_VALUE = 1;
  /**
   * <pre>
   * Heavy potency.
   * </pre>
   *
   * <code>HEAVY = 2;</code>
   */
  public static final int HEAVY_VALUE = 2;
  /**
   * <pre>
   * Top/super potency.
   * </pre>
   *
   * <code>SUPER = 3;</code>
   */
  public static final int SUPER_VALUE = 3;


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
  public static PotencyEstimate valueOf(int value) {
    return forNumber(value);
  }

  public static PotencyEstimate forNumber(int value) {
    switch (value) {
      case 0: return LIGHT;
      case 1: return MEDIUM;
      case 2: return HEAVY;
      case 3: return SUPER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PotencyEstimate>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PotencyEstimate> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PotencyEstimate>() {
          public PotencyEstimate findValueByNumber(int number) {
            return PotencyEstimate.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.getDescriptor().getEnumTypes().get(5);
  }

  private static final PotencyEstimate[] VALUES = values();

  public static PotencyEstimate valueOf(
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

  private PotencyEstimate(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.PotencyEstimate)
}

