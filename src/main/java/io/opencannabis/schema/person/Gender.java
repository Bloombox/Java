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
// source: person/Person.proto

package io.opencannabis.schema.person;

/**
 * <pre>
 * Genders that a user may be.
 * </pre>
 *
 * Protobuf enum {@code opencannabis.person.Gender}
 */
public enum Gender
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Unspecified gender.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <pre>
   * Male.
   * </pre>
   *
   * <code>MALE = 1;</code>
   */
  MALE(1),
  /**
   * <pre>
   * Female.
   * </pre>
   *
   * <code>FEMALE = 2;</code>
   */
  FEMALE(2),
  /**
   * <pre>
   * Other.
   * </pre>
   *
   * <code>OTHER = 3;</code>
   */
  OTHER(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Unspecified gender.
   * </pre>
   *
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Male.
   * </pre>
   *
   * <code>MALE = 1;</code>
   */
  public static final int MALE_VALUE = 1;
  /**
   * <pre>
   * Female.
   * </pre>
   *
   * <code>FEMALE = 2;</code>
   */
  public static final int FEMALE_VALUE = 2;
  /**
   * <pre>
   * Other.
   * </pre>
   *
   * <code>OTHER = 3;</code>
   */
  public static final int OTHER_VALUE = 3;


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
  public static Gender valueOf(int value) {
    return forNumber(value);
  }

  public static Gender forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return MALE;
      case 2: return FEMALE;
      case 3: return OTHER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Gender>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Gender> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Gender>() {
          public Gender findValueByNumber(int number) {
            return Gender.forNumber(number);
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
    return io.opencannabis.schema.person.PersonOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final Gender[] VALUES = values();

  public static Gender valueOf(
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

  private Gender(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:opencannabis.person.Gender)
}

