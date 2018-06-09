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
// source: products/menu/Menu.proto

package io.opencannabis.schema.menu;

/**
 * <pre>
 * Enumerates flags that can be set on a menu.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.products.menu.Flag}
 */
public enum Flag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Indicates that this entire menu is considered a draft.
   * </pre>
   *
   * <code>DRAFT = 0;</code>
   */
  DRAFT(0),
  /**
   * <pre>
   * Indicates that the underlying menu data is currently private and should not be exposed publicly.
   * </pre>
   *
   * <code>PRIVATE = 1;</code>
   */
  PRIVATE(1),
  /**
   * <pre>
   * Indicates that the underlying menu data is known to be out-of-date.
   * </pre>
   *
   * <code>OUT_OF_DATE = 2;</code>
   */
  OUT_OF_DATE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Indicates that this entire menu is considered a draft.
   * </pre>
   *
   * <code>DRAFT = 0;</code>
   */
  public static final int DRAFT_VALUE = 0;
  /**
   * <pre>
   * Indicates that the underlying menu data is currently private and should not be exposed publicly.
   * </pre>
   *
   * <code>PRIVATE = 1;</code>
   */
  public static final int PRIVATE_VALUE = 1;
  /**
   * <pre>
   * Indicates that the underlying menu data is known to be out-of-date.
   * </pre>
   *
   * <code>OUT_OF_DATE = 2;</code>
   */
  public static final int OUT_OF_DATE_VALUE = 2;


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
  public static Flag valueOf(int value) {
    return forNumber(value);
  }

  public static Flag forNumber(int value) {
    switch (value) {
      case 0: return DRAFT;
      case 1: return PRIVATE;
      case 2: return OUT_OF_DATE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Flag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Flag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Flag>() {
          public Flag findValueByNumber(int number) {
            return Flag.forNumber(number);
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
    return io.opencannabis.schema.menu.MenuOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final Flag[] VALUES = values();

  public static Flag valueOf(
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

  private Flag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.products.menu.Flag)
}

