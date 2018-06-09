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
// source: structs/labtesting/TestValue.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * <pre>
 * Specifies the different types of testing error that may be reported: percent error, absolute error, and
 * relative error.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.structs.labtesting.TestErrorType}
 */
public enum TestErrorType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>PERCENT = 0;</code>
   */
  PERCENT(0),
  /**
   * <code>ABSOLUTE = 1;</code>
   */
  ABSOLUTE(1),
  /**
   * <code>RELATIVE = 2;</code>
   */
  RELATIVE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>PERCENT = 0;</code>
   */
  public static final int PERCENT_VALUE = 0;
  /**
   * <code>ABSOLUTE = 1;</code>
   */
  public static final int ABSOLUTE_VALUE = 1;
  /**
   * <code>RELATIVE = 2;</code>
   */
  public static final int RELATIVE_VALUE = 2;


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
  public static TestErrorType valueOf(int value) {
    return forNumber(value);
  }

  public static TestErrorType forNumber(int value) {
    switch (value) {
      case 0: return PERCENT;
      case 1: return ABSOLUTE;
      case 2: return RELATIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestErrorType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestErrorType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestErrorType>() {
          public TestErrorType findValueByNumber(int number) {
            return TestErrorType.forNumber(number);
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
    return io.opencannabis.schema.product.struct.testing.BaseTestingSpec.getDescriptor().getEnumTypes().get(1);
  }

  private static final TestErrorType[] VALUES = values();

  public static TestErrorType valueOf(
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

  private TestErrorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.structs.labtesting.TestErrorType)
}

