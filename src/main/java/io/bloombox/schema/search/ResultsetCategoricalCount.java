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
 * Specifies the count of items in a particular result category included in a search response.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.search.ResultsetCategoricalCount}
 */
public  final class ResultsetCategoricalCount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.search.ResultsetCategoricalCount)
    ResultsetCategoricalCountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResultsetCategoricalCount.newBuilder() to construct.
  private ResultsetCategoricalCount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResultsetCategoricalCount() {
    type_ = 0;
    count_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResultsetCategoricalCount(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 16: {

            count_ = input.readInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_schema_search_ResultsetCategoricalCount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.search.ResultsetCategoricalCount.class, io.bloombox.schema.search.ResultsetCategoricalCount.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Specifies the type of record enclosed with this count.
   * </pre>
   *
   * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Specifies the type of record enclosed with this count.
   * </pre>
   *
   * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
   */
  public io.bloombox.schema.search.SearchableCollection getType() {
    io.bloombox.schema.search.SearchableCollection result = io.bloombox.schema.search.SearchableCollection.valueOf(type_);
    return result == null ? io.bloombox.schema.search.SearchableCollection.UNRECOGNIZED : result;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_;
  /**
   * <pre>
   * Specifies the count of that kind of record enclosed with this response.
   * </pre>
   *
   * <code>int32 count = 2;</code>
   */
  public int getCount() {
    return count_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (type_ != io.bloombox.schema.search.SearchableCollection.GLOBAL.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (count_ != 0) {
      output.writeInt32(2, count_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.bloombox.schema.search.SearchableCollection.GLOBAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, count_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.bloombox.schema.search.ResultsetCategoricalCount)) {
      return super.equals(obj);
    }
    io.bloombox.schema.search.ResultsetCategoricalCount other = (io.bloombox.schema.search.ResultsetCategoricalCount) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && (getCount()
        == other.getCount());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.ResultsetCategoricalCount parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bloombox.schema.search.ResultsetCategoricalCount prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Specifies the count of items in a particular result category included in a search response.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.search.ResultsetCategoricalCount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.search.ResultsetCategoricalCount)
      io.bloombox.schema.search.ResultsetCategoricalCountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_schema_search_ResultsetCategoricalCount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.search.ResultsetCategoricalCount.class, io.bloombox.schema.search.ResultsetCategoricalCount.Builder.class);
    }

    // Construct using io.bloombox.schema.search.ResultsetCategoricalCount.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      type_ = 0;

      count_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_schema_search_ResultsetCategoricalCount_descriptor;
    }

    public io.bloombox.schema.search.ResultsetCategoricalCount getDefaultInstanceForType() {
      return io.bloombox.schema.search.ResultsetCategoricalCount.getDefaultInstance();
    }

    public io.bloombox.schema.search.ResultsetCategoricalCount build() {
      io.bloombox.schema.search.ResultsetCategoricalCount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.search.ResultsetCategoricalCount buildPartial() {
      io.bloombox.schema.search.ResultsetCategoricalCount result = new io.bloombox.schema.search.ResultsetCategoricalCount(this);
      result.type_ = type_;
      result.count_ = count_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.search.ResultsetCategoricalCount) {
        return mergeFrom((io.bloombox.schema.search.ResultsetCategoricalCount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.search.ResultsetCategoricalCount other) {
      if (other == io.bloombox.schema.search.ResultsetCategoricalCount.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bloombox.schema.search.ResultsetCategoricalCount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.search.ResultsetCategoricalCount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Specifies the type of record enclosed with this count.
     * </pre>
     *
     * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Specifies the type of record enclosed with this count.
     * </pre>
     *
     * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the type of record enclosed with this count.
     * </pre>
     *
     * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
     */
    public io.bloombox.schema.search.SearchableCollection getType() {
      io.bloombox.schema.search.SearchableCollection result = io.bloombox.schema.search.SearchableCollection.valueOf(type_);
      return result == null ? io.bloombox.schema.search.SearchableCollection.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the type of record enclosed with this count.
     * </pre>
     *
     * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
     */
    public Builder setType(io.bloombox.schema.search.SearchableCollection value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the type of record enclosed with this count.
     * </pre>
     *
     * <code>.bloombox.schema.search.SearchableCollection type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     * Specifies the count of that kind of record enclosed with this response.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * Specifies the count of that kind of record enclosed with this response.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the count of that kind of record enclosed with this response.
     * </pre>
     *
     * <code>int32 count = 2;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.search.ResultsetCategoricalCount)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.search.ResultsetCategoricalCount)
  private static final io.bloombox.schema.search.ResultsetCategoricalCount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.search.ResultsetCategoricalCount();
  }

  public static io.bloombox.schema.search.ResultsetCategoricalCount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResultsetCategoricalCount>
      PARSER = new com.google.protobuf.AbstractParser<ResultsetCategoricalCount>() {
    public ResultsetCategoricalCount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResultsetCategoricalCount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResultsetCategoricalCount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResultsetCategoricalCount> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.search.ResultsetCategoricalCount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

