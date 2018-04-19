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
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

/**
 * <pre>
 * Enumerates types of section settings that may be applied and considered.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.partner.settings.SectionSettingsType}
 */
public enum SectionSettingsType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Settings for a standard section, based on product types or categories.
   * </pre>
   *
   * <code>STANDARD = 0;</code>
   */
  STANDARD(0),
  /**
   * <pre>
   * Settings for a filtered section, based on categorical filtering across menu types or categories.
   * </pre>
   *
   * <code>FILTERED = 1;</code>
   */
  FILTERED(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Settings for a standard section, based on product types or categories.
   * </pre>
   *
   * <code>STANDARD = 0;</code>
   */
  public static final int STANDARD_VALUE = 0;
  /**
   * <pre>
   * Settings for a filtered section, based on categorical filtering across menu types or categories.
   * </pre>
   *
   * <code>FILTERED = 1;</code>
   */
  public static final int FILTERED_VALUE = 1;


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
  public static SectionSettingsType valueOf(int value) {
    return forNumber(value);
  }

  public static SectionSettingsType forNumber(int value) {
    switch (value) {
      case 0: return STANDARD;
      case 1: return FILTERED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SectionSettingsType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SectionSettingsType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SectionSettingsType>() {
          public SectionSettingsType findValueByNumber(int number) {
            return SectionSettingsType.forNumber(number);
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
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.getDescriptor().getEnumTypes().get(0);
  }

  private static final SectionSettingsType[] VALUES = values();

  public static SectionSettingsType valueOf(
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

  private SectionSettingsType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.partner.settings.SectionSettingsType)
}

