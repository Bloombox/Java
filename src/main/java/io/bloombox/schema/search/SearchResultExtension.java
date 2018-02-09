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
 * Specifies data extensions that may be requested, and returned, with stock search results.
 * </pre>
 *
 * Protobuf enum {@code bloombox.schema.search.SearchResultExtension}
 */
public enum SearchResultExtension
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Return the result's name along with its key. This is included in the default set of returned items when not
   * searching in `keys_only` mode.
   * </pre>
   *
   * <code>NAME = 0;</code>
   */
  NAME(0),
  /**
   * <pre>
   * Return the result's description along with its key. This is included in the default set of returned items when not
   * searching in `keys_only` mode.
   * </pre>
   *
   * <code>DESCRIPTION = 1;</code>
   */
  DESCRIPTION(1),
  /**
   * <pre>
   * Return at least one media link per result along with its key. This is included in the default set of returned items
   * when not searching in `keys_only` mode.
   * </pre>
   *
   * <code>MEDIA = 2;</code>
   */
  MEDIA(2),
  /**
   * <pre>
   * Return lab results in full along with each key.
   * </pre>
   *
   * <code>LABS = 3;</code>
   */
  LABS(3),
  /**
   * <pre>
   * Return pricing information along with each key.
   * </pre>
   *
   * <code>PRICING = 4;</code>
   */
  PRICING(4),
  /**
   * <pre>
   * Return related item keys along with each key.
   * </pre>
   *
   * <code>RELATED = 5;</code>
   */
  RELATED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Return the result's name along with its key. This is included in the default set of returned items when not
   * searching in `keys_only` mode.
   * </pre>
   *
   * <code>NAME = 0;</code>
   */
  public static final int NAME_VALUE = 0;
  /**
   * <pre>
   * Return the result's description along with its key. This is included in the default set of returned items when not
   * searching in `keys_only` mode.
   * </pre>
   *
   * <code>DESCRIPTION = 1;</code>
   */
  public static final int DESCRIPTION_VALUE = 1;
  /**
   * <pre>
   * Return at least one media link per result along with its key. This is included in the default set of returned items
   * when not searching in `keys_only` mode.
   * </pre>
   *
   * <code>MEDIA = 2;</code>
   */
  public static final int MEDIA_VALUE = 2;
  /**
   * <pre>
   * Return lab results in full along with each key.
   * </pre>
   *
   * <code>LABS = 3;</code>
   */
  public static final int LABS_VALUE = 3;
  /**
   * <pre>
   * Return pricing information along with each key.
   * </pre>
   *
   * <code>PRICING = 4;</code>
   */
  public static final int PRICING_VALUE = 4;
  /**
   * <pre>
   * Return related item keys along with each key.
   * </pre>
   *
   * <code>RELATED = 5;</code>
   */
  public static final int RELATED_VALUE = 5;


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
  public static SearchResultExtension valueOf(int value) {
    return forNumber(value);
  }

  public static SearchResultExtension forNumber(int value) {
    switch (value) {
      case 0: return NAME;
      case 1: return DESCRIPTION;
      case 2: return MEDIA;
      case 3: return LABS;
      case 4: return PRICING;
      case 5: return RELATED;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SearchResultExtension>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SearchResultExtension> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SearchResultExtension>() {
          public SearchResultExtension findValueByNumber(int number) {
            return SearchResultExtension.forNumber(number);
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
    return io.bloombox.schema.search.SearchSpecOuterClass.getDescriptor().getEnumTypes().get(1);
  }

  private static final SearchResultExtension[] VALUES = values();

  public static SearchResultExtension valueOf(
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

  private SearchResultExtension(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:bloombox.schema.search.SearchResultExtension)
}

