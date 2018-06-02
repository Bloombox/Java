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
// source: search/SearchSpec.proto

package io.bloombox.schema.search;

/**
 * <pre>
 * Specifies modes for sorting search results.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.search.SearchSortMode}
 */
public enum SearchSortMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Let the server decide, using magic.
   * </pre>
   *
   * <code>NATURAL = 0;</code>
   */
  NATURAL(0),
  /**
   * <pre>
   * Lexicographically sort by name.
   * </pre>
   *
   * <code>LEXICOGRAPHIC = 1;</code>
   */
  LEXICOGRAPHIC(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Let the server decide, using magic.
   * </pre>
   *
   * <code>NATURAL = 0;</code>
   */
  public static final int NATURAL_VALUE = 0;
  /**
   * <pre>
   * Lexicographically sort by name.
   * </pre>
   *
   * <code>LEXICOGRAPHIC = 1;</code>
   */
  public static final int LEXICOGRAPHIC_VALUE = 1;


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
  public static SearchSortMode valueOf(int value) {
    return forNumber(value);
  }

  public static SearchSortMode forNumber(int value) {
    switch (value) {
      case 0: return NATURAL;
      case 1: return LEXICOGRAPHIC;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchSortMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SearchSortMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SearchSortMode>() {
          public SearchSortMode findValueByNumber(int number) {
            return SearchSortMode.forNumber(number);
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
    return io.bloombox.schema.search.SearchSpecOuterClass.getDescriptor().getEnumTypes().get(3);
  }

  private static final SearchSortMode[] VALUES = values();

  public static SearchSortMode valueOf(
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

  private SearchSortMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.search.SearchSortMode)
}

