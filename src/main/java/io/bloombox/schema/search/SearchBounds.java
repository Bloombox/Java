/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
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
 * Specifies bounds for a search query.
 * </pre>
 *
 * Protobuf type {@code bloombox.search.SearchBounds}
 */
public  final class SearchBounds extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.search.SearchBounds)
    SearchBoundsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchBounds.newBuilder() to construct.
  private SearchBounds(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchBounds() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchBounds(
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
          case 8: {

            limit_ = input.readInt32();
            break;
          }
          case 16: {

            offset_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchBounds_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchBounds_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.search.SearchBounds.class, io.bloombox.schema.search.SearchBounds.Builder.class);
  }

  public static final int LIMIT_FIELD_NUMBER = 1;
  private int limit_;
  /**
   * <pre>
   * Specifies a limit on the number of search results desired.
   * </pre>
   *
   * <code>int32 limit = 1;</code>
   */
  public int getLimit() {
    return limit_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_;
  /**
   * <pre>
   * Specifies an offset of records to skip during result pagination.
   * </pre>
   *
   * <code>int32 offset = 2;</code>
   */
  public int getOffset() {
    return offset_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (limit_ != 0) {
      output.writeInt32(1, limit_);
    }
    if (offset_ != 0) {
      output.writeInt32(2, offset_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, limit_);
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, offset_);
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
    if (!(obj instanceof io.bloombox.schema.search.SearchBounds)) {
      return super.equals(obj);
    }
    io.bloombox.schema.search.SearchBounds other = (io.bloombox.schema.search.SearchBounds) obj;

    if (getLimit()
        != other.getLimit()) return false;
    if (getOffset()
        != other.getOffset()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.search.SearchBounds parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchBounds parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchBounds parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchBounds parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.bloombox.schema.search.SearchBounds prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Specifies bounds for a search query.
   * </pre>
   *
   * Protobuf type {@code bloombox.search.SearchBounds}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.search.SearchBounds)
      io.bloombox.schema.search.SearchBoundsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchBounds_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchBounds_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.search.SearchBounds.class, io.bloombox.schema.search.SearchBounds.Builder.class);
    }

    // Construct using io.bloombox.schema.search.SearchBounds.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      limit_ = 0;

      offset_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchBounds_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchBounds getDefaultInstanceForType() {
      return io.bloombox.schema.search.SearchBounds.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchBounds build() {
      io.bloombox.schema.search.SearchBounds result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchBounds buildPartial() {
      io.bloombox.schema.search.SearchBounds result = new io.bloombox.schema.search.SearchBounds(this);
      result.limit_ = limit_;
      result.offset_ = offset_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.search.SearchBounds) {
        return mergeFrom((io.bloombox.schema.search.SearchBounds)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.search.SearchBounds other) {
      if (other == io.bloombox.schema.search.SearchBounds.getDefaultInstance()) return this;
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.bloombox.schema.search.SearchBounds parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.search.SearchBounds) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     * Specifies a limit on the number of search results desired.
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     */
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     * Specifies a limit on the number of search results desired.
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a limit on the number of search results desired.
     * </pre>
     *
     * <code>int32 limit = 1;</code>
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private int offset_ ;
    /**
     * <pre>
     * Specifies an offset of records to skip during result pagination.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     */
    public int getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * Specifies an offset of records to skip during result pagination.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     */
    public Builder setOffset(int value) {
      
      offset_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies an offset of records to skip during result pagination.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     */
    public Builder clearOffset() {
      
      offset_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.search.SearchBounds)
  }

  // @@protoc_insertion_point(class_scope:bloombox.search.SearchBounds)
  private static final io.bloombox.schema.search.SearchBounds DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.search.SearchBounds();
  }

  public static io.bloombox.schema.search.SearchBounds getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchBounds>
      PARSER = new com.google.protobuf.AbstractParser<SearchBounds>() {
    @java.lang.Override
    public SearchBounds parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchBounds(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchBounds> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchBounds> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.search.SearchBounds getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

