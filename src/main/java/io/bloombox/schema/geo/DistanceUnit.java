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
// source: geo/Location.proto

package io.bloombox.schema.geo;

/**
 * <pre>
 * Enumeration of recognized units of distance.
 * </pre>
 *
 * Protobuf enum {@code geo.DistanceUnit}
 */
public enum DistanceUnit
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Distance in meters.
   * </pre>
   *
   * <code>METERS = 0;</code>
   */
  METERS(0),
  /**
   * <pre>
   * Distance in inches.
   * </pre>
   *
   * <code>INCHES = 1;</code>
   */
  INCHES(1),
  /**
   * <pre>
   * Distance in feet.
   * </pre>
   *
   * <code>FEET = 2;</code>
   */
  FEET(2),
  /**
   * <pre>
   * Distance in millimeters.
   * </pre>
   *
   * <code>MILLIMETERS = 3;</code>
   */
  MILLIMETERS(3),
  /**
   * <pre>
   * Distance in centimeters.
   * </pre>
   *
   * <code>CENTIMETERS = 4;</code>
   */
  CENTIMETERS(4),
  /**
   * <pre>
   * Distance in kilometers.
   * </pre>
   *
   * <code>KILOMETERS = 5;</code>
   */
  KILOMETERS(5),
  /**
   * <pre>
   * Distance in miles.
   * </pre>
   *
   * <code>MILES = 6;</code>
   */
  MILES(6),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Distance in meters.
   * </pre>
   *
   * <code>METERS = 0;</code>
   */
  public static final int METERS_VALUE = 0;
  /**
   * <pre>
   * Distance in inches.
   * </pre>
   *
   * <code>INCHES = 1;</code>
   */
  public static final int INCHES_VALUE = 1;
  /**
   * <pre>
   * Distance in feet.
   * </pre>
   *
   * <code>FEET = 2;</code>
   */
  public static final int FEET_VALUE = 2;
  /**
   * <pre>
   * Distance in millimeters.
   * </pre>
   *
   * <code>MILLIMETERS = 3;</code>
   */
  public static final int MILLIMETERS_VALUE = 3;
  /**
   * <pre>
   * Distance in centimeters.
   * </pre>
   *
   * <code>CENTIMETERS = 4;</code>
   */
  public static final int CENTIMETERS_VALUE = 4;
  /**
   * <pre>
   * Distance in kilometers.
   * </pre>
   *
   * <code>KILOMETERS = 5;</code>
   */
  public static final int KILOMETERS_VALUE = 5;
  /**
   * <pre>
   * Distance in miles.
   * </pre>
   *
   * <code>MILES = 6;</code>
   */
  public static final int MILES_VALUE = 6;


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
  public static DistanceUnit valueOf(int value) {
    return forNumber(value);
  }

  public static DistanceUnit forNumber(int value) {
    switch (value) {
      case 0: return METERS;
      case 1: return INCHES;
      case 2: return FEET;
      case 3: return MILLIMETERS;
      case 4: return CENTIMETERS;
      case 5: return KILOMETERS;
      case 6: return MILES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DistanceUnit>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DistanceUnit> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DistanceUnit>() {
          public DistanceUnit findValueByNumber(int number) {
            return DistanceUnit.forNumber(number);
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
    return io.bloombox.schema.geo.LocationOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final DistanceUnit[] VALUES = values();

  public static DistanceUnit valueOf(
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

  private DistanceUnit(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:geo.DistanceUnit)
}

