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
// source: base/Language.proto

package io.opencannabis.schema.base;

public final class BaseLanguage {
  private BaseLanguage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Specifies languages available for specification, usually used as an attachment to content or media.
   * </pre>
   *
   * Protobuf enum {@code opencannabis.base.Language}
   */
  public enum Language
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Default or unset language.
     * </pre>
     *
     * <code>LANGUAGE_UNSPECIFIED = 0;</code>
     */
    LANGUAGE_UNSPECIFIED(0),
    /**
     * <pre>
     * English.
     * </pre>
     *
     * <code>ENGLISH = 1;</code>
     */
    ENGLISH(1),
    /**
     * <pre>
     * Spanish.
     * </pre>
     *
     * <code>SPANISH = 2;</code>
     */
    SPANISH(2),
    /**
     * <pre>
     * French.
     * </pre>
     *
     * <code>FRENCH = 3;</code>
     */
    FRENCH(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Default or unset language.
     * </pre>
     *
     * <code>LANGUAGE_UNSPECIFIED = 0;</code>
     */
    public static final int LANGUAGE_UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * English.
     * </pre>
     *
     * <code>ENGLISH = 1;</code>
     */
    public static final int ENGLISH_VALUE = 1;
    /**
     * <pre>
     * Spanish.
     * </pre>
     *
     * <code>SPANISH = 2;</code>
     */
    public static final int SPANISH_VALUE = 2;
    /**
     * <pre>
     * French.
     * </pre>
     *
     * <code>FRENCH = 3;</code>
     */
    public static final int FRENCH_VALUE = 3;


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
    public static Language valueOf(int value) {
      return forNumber(value);
    }

    public static Language forNumber(int value) {
      switch (value) {
        case 0: return LANGUAGE_UNSPECIFIED;
        case 1: return ENGLISH;
        case 2: return SPANISH;
        case 3: return FRENCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Language>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Language> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Language>() {
            public Language findValueByNumber(int number) {
              return Language.forNumber(number);
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
      return io.opencannabis.schema.base.BaseLanguage.getDescriptor().getEnumTypes().get(0);
    }

    private static final Language[] VALUES = values();

    public static Language valueOf(
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

    private Language(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:opencannabis.base.Language)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023base/Language.proto\022\021opencannabis.base" +
      "*J\n\010Language\022\030\n\024LANGUAGE_UNSPECIFIED\020\000\022\013" +
      "\n\007ENGLISH\020\001\022\013\n\007SPANISH\020\002\022\n\n\006FRENCH\020\003B5\n\033" +
      "io.opencannabis.schema.baseB\014BaseLanguag" +
      "eH\001P\000\242\002\003OCSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
