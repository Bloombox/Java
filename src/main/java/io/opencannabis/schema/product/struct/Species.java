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
// source: structs/Species.proto

package io.opencannabis.schema.product.struct;

/**
 * Protobuf enum {@code opencannabis.structs.Species}
 */
public enum Species
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <code>SATIVA = 1;</code>
   */
  SATIVA(1),
  /**
   * <code>HYBRID_SATIVA = 2;</code>
   */
  HYBRID_SATIVA(2),
  /**
   * <code>HYBRID = 3;</code>
   */
  HYBRID(3),
  /**
   * <code>HYBRID_INDICA = 4;</code>
   */
  HYBRID_INDICA(4),
  /**
   * <code>INDICA = 5;</code>
   */
  INDICA(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <code>SATIVA = 1;</code>
   */
  public static final int SATIVA_VALUE = 1;
  /**
   * <code>HYBRID_SATIVA = 2;</code>
   */
  public static final int HYBRID_SATIVA_VALUE = 2;
  /**
   * <code>HYBRID = 3;</code>
   */
  public static final int HYBRID_VALUE = 3;
  /**
   * <code>HYBRID_INDICA = 4;</code>
   */
  public static final int HYBRID_INDICA_VALUE = 4;
  /**
   * <code>INDICA = 5;</code>
   */
  public static final int INDICA_VALUE = 5;


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
  public static Species valueOf(int value) {
    return forNumber(value);
  }

  public static Species forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return SATIVA;
      case 2: return HYBRID_SATIVA;
      case 3: return HYBRID;
      case 4: return HYBRID_INDICA;
      case 5: return INDICA;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Species>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Species> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Species>() {
          public Species findValueByNumber(int number) {
            return Species.forNumber(number);
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
    return io.opencannabis.schema.product.struct.MaterialSpecies.getDescriptor().getEnumTypes().get(0);
  }

  private static final Species[] VALUES = values();

  public static Species valueOf(
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

  private Species(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.Species)
}

