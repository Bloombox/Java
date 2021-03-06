/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: inventory/rfid/RFID.proto

package io.opencannabis.schema.inventory;

/**
 * <pre>
 * Describes known vendors of RFID reader equipment.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.inventory.rfid.ReaderVendor}
 */
public enum ReaderVendor
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The vendor for the reader could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_VENDOR = 0;</code>
   */
  UNRECOGNIZED_VENDOR(0),
  /**
   * <pre>
   * The vendor for the reader was detected as Impinj.
   * </pre>
   *
   * <code>IMPINJ = 25882;</code>
   */
  IMPINJ(25882),
  /**
   * <pre>
   * The vendor for the reader was detected as Alien.
   * </pre>
   *
   * <code>ALIEN = 2;</code>
   */
  ALIEN(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The vendor for the reader could not be recognized.
   * </pre>
   *
   * <code>UNRECOGNIZED_VENDOR = 0;</code>
   */
  public static final int UNRECOGNIZED_VENDOR_VALUE = 0;
  /**
   * <pre>
   * The vendor for the reader was detected as Impinj.
   * </pre>
   *
   * <code>IMPINJ = 25882;</code>
   */
  public static final int IMPINJ_VALUE = 25882;
  /**
   * <pre>
   * The vendor for the reader was detected as Alien.
   * </pre>
   *
   * <code>ALIEN = 2;</code>
   */
  public static final int ALIEN_VALUE = 2;


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
  public static ReaderVendor valueOf(int value) {
    return forNumber(value);
  }

  public static ReaderVendor forNumber(int value) {
    switch (value) {
      case 0: return UNRECOGNIZED_VENDOR;
      case 25882: return IMPINJ;
      case 2: return ALIEN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ReaderVendor>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ReaderVendor> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ReaderVendor>() {
          public ReaderVendor findValueByNumber(int number) {
            return ReaderVendor.forNumber(number);
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
    return io.opencannabis.schema.inventory.RFID.getDescriptor().getEnumTypes().get(0);
  }

  private static final ReaderVendor[] VALUES = values();

  public static ReaderVendor valueOf(
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

  private ReaderVendor(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.inventory.rfid.ReaderVendor)
}

