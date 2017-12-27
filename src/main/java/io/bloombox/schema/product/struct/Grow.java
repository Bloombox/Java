/*
 * Copyright 2017, Bloombox, LLC.
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
// source: structs/Grow.proto

package io.bloombox.schema.product.struct;

/**
 * Protobuf enum {@code structs.Grow}
 */
public enum Grow
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>GENERIC = 0;</code>
   */
  GENERIC(0),
  /**
   * <code>INDOOR = 1;</code>
   */
  INDOOR(1),
  /**
   * <code>GREENHOUSE = 2;</code>
   */
  GREENHOUSE(2),
  /**
   * <code>OUTDOOR = 3;</code>
   */
  OUTDOOR(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>GENERIC = 0;</code>
   */
  public static final int GENERIC_VALUE = 0;
  /**
   * <code>INDOOR = 1;</code>
   */
  public static final int INDOOR_VALUE = 1;
  /**
   * <code>GREENHOUSE = 2;</code>
   */
  public static final int GREENHOUSE_VALUE = 2;
  /**
   * <code>OUTDOOR = 3;</code>
   */
  public static final int OUTDOOR_VALUE = 3;


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
  public static Grow valueOf(int value) {
    return forNumber(value);
  }

  public static Grow forNumber(int value) {
    switch (value) {
      case 0: return GENERIC;
      case 1: return INDOOR;
      case 2: return GREENHOUSE;
      case 3: return OUTDOOR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Grow>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Grow> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Grow>() {
          public Grow findValueByNumber(int number) {
            return Grow.forNumber(number);
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
    return io.bloombox.schema.product.struct.MaterialGrow.getDescriptor().getEnumTypes().get(0);
  }

  private static final Grow[] VALUES = values();

  public static Grow valueOf(
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

  private Grow(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:structs.Grow)
}

