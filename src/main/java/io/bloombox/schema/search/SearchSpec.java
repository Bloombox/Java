/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
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
 * Specification for a search operation.
 * </pre>
 *
 * Protobuf type {@code bloombox.search.SearchSpec}
 */
public  final class SearchSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.search.SearchSpec)
    SearchSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchSpec.newBuilder() to construct.
  private SearchSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchSpec() {
    term_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchSpec(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            term_ = s;
            break;
          }
          case 18: {
            io.bloombox.schema.search.SearchOptions.Builder subBuilder = null;
            if (options_ != null) {
              subBuilder = options_.toBuilder();
            }
            options_ = input.readMessage(io.bloombox.schema.search.SearchOptions.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(options_);
              options_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.search.SearchSpec.class, io.bloombox.schema.search.SearchSpec.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private volatile java.lang.Object term_;
  /**
   * <pre>
   * Value entered into a search box by a user, usually URL-encoded.
   * </pre>
   *
   * <code>string term = 1;</code>
   */
  public java.lang.String getTerm() {
    java.lang.Object ref = term_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      term_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Value entered into a search box by a user, usually URL-encoded.
   * </pre>
   *
   * <code>string term = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTermBytes() {
    java.lang.Object ref = term_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      term_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPTIONS_FIELD_NUMBER = 2;
  private io.bloombox.schema.search.SearchOptions options_;
  /**
   * <pre>
   * Specifies globally-applicable options for a given search operation.
   * </pre>
   *
   * <code>.bloombox.search.SearchOptions options = 2;</code>
   */
  public boolean hasOptions() {
    return options_ != null;
  }
  /**
   * <pre>
   * Specifies globally-applicable options for a given search operation.
   * </pre>
   *
   * <code>.bloombox.search.SearchOptions options = 2;</code>
   */
  public io.bloombox.schema.search.SearchOptions getOptions() {
    return options_ == null ? io.bloombox.schema.search.SearchOptions.getDefaultInstance() : options_;
  }
  /**
   * <pre>
   * Specifies globally-applicable options for a given search operation.
   * </pre>
   *
   * <code>.bloombox.search.SearchOptions options = 2;</code>
   */
  public io.bloombox.schema.search.SearchOptionsOrBuilder getOptionsOrBuilder() {
    return getOptions();
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
    if (!getTermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, term_);
    }
    if (options_ != null) {
      output.writeMessage(2, getOptions());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, term_);
    }
    if (options_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOptions());
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
    if (!(obj instanceof io.bloombox.schema.search.SearchSpec)) {
      return super.equals(obj);
    }
    io.bloombox.schema.search.SearchSpec other = (io.bloombox.schema.search.SearchSpec) obj;

    boolean result = true;
    result = result && getTerm()
        .equals(other.getTerm());
    result = result && (hasOptions() == other.hasOptions());
    if (hasOptions()) {
      result = result && getOptions()
          .equals(other.getOptions());
    }
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
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm().hashCode();
    if (hasOptions()) {
      hash = (37 * hash) + OPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOptions().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.search.SearchSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchSpec parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.search.SearchSpec prototype) {
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
   * Specification for a search operation.
   * </pre>
   *
   * Protobuf type {@code bloombox.search.SearchSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.search.SearchSpec)
      io.bloombox.schema.search.SearchSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.search.SearchSpec.class, io.bloombox.schema.search.SearchSpec.Builder.class);
    }

    // Construct using io.bloombox.schema.search.SearchSpec.newBuilder()
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
      term_ = "";

      if (optionsBuilder_ == null) {
        options_ = null;
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchSpec_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchSpec getDefaultInstanceForType() {
      return io.bloombox.schema.search.SearchSpec.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchSpec build() {
      io.bloombox.schema.search.SearchSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchSpec buildPartial() {
      io.bloombox.schema.search.SearchSpec result = new io.bloombox.schema.search.SearchSpec(this);
      result.term_ = term_;
      if (optionsBuilder_ == null) {
        result.options_ = options_;
      } else {
        result.options_ = optionsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.search.SearchSpec) {
        return mergeFrom((io.bloombox.schema.search.SearchSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.search.SearchSpec other) {
      if (other == io.bloombox.schema.search.SearchSpec.getDefaultInstance()) return this;
      if (!other.getTerm().isEmpty()) {
        term_ = other.term_;
        onChanged();
      }
      if (other.hasOptions()) {
        mergeOptions(other.getOptions());
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
      io.bloombox.schema.search.SearchSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.search.SearchSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object term_ = "";
    /**
     * <pre>
     * Value entered into a search box by a user, usually URL-encoded.
     * </pre>
     *
     * <code>string term = 1;</code>
     */
    public java.lang.String getTerm() {
      java.lang.Object ref = term_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        term_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Value entered into a search box by a user, usually URL-encoded.
     * </pre>
     *
     * <code>string term = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTermBytes() {
      java.lang.Object ref = term_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        term_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Value entered into a search box by a user, usually URL-encoded.
     * </pre>
     *
     * <code>string term = 1;</code>
     */
    public Builder setTerm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value entered into a search box by a user, usually URL-encoded.
     * </pre>
     *
     * <code>string term = 1;</code>
     */
    public Builder clearTerm() {
      
      term_ = getDefaultInstance().getTerm();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Value entered into a search box by a user, usually URL-encoded.
     * </pre>
     *
     * <code>string term = 1;</code>
     */
    public Builder setTermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      term_ = value;
      onChanged();
      return this;
    }

    private io.bloombox.schema.search.SearchOptions options_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.search.SearchOptions, io.bloombox.schema.search.SearchOptions.Builder, io.bloombox.schema.search.SearchOptionsOrBuilder> optionsBuilder_;
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public boolean hasOptions() {
      return optionsBuilder_ != null || options_ != null;
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public io.bloombox.schema.search.SearchOptions getOptions() {
      if (optionsBuilder_ == null) {
        return options_ == null ? io.bloombox.schema.search.SearchOptions.getDefaultInstance() : options_;
      } else {
        return optionsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public Builder setOptions(io.bloombox.schema.search.SearchOptions value) {
      if (optionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        options_ = value;
        onChanged();
      } else {
        optionsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public Builder setOptions(
        io.bloombox.schema.search.SearchOptions.Builder builderForValue) {
      if (optionsBuilder_ == null) {
        options_ = builderForValue.build();
        onChanged();
      } else {
        optionsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public Builder mergeOptions(io.bloombox.schema.search.SearchOptions value) {
      if (optionsBuilder_ == null) {
        if (options_ != null) {
          options_ =
            io.bloombox.schema.search.SearchOptions.newBuilder(options_).mergeFrom(value).buildPartial();
        } else {
          options_ = value;
        }
        onChanged();
      } else {
        optionsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public Builder clearOptions() {
      if (optionsBuilder_ == null) {
        options_ = null;
        onChanged();
      } else {
        options_ = null;
        optionsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public io.bloombox.schema.search.SearchOptions.Builder getOptionsBuilder() {
      
      onChanged();
      return getOptionsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    public io.bloombox.schema.search.SearchOptionsOrBuilder getOptionsOrBuilder() {
      if (optionsBuilder_ != null) {
        return optionsBuilder_.getMessageOrBuilder();
      } else {
        return options_ == null ?
            io.bloombox.schema.search.SearchOptions.getDefaultInstance() : options_;
      }
    }
    /**
     * <pre>
     * Specifies globally-applicable options for a given search operation.
     * </pre>
     *
     * <code>.bloombox.search.SearchOptions options = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.search.SearchOptions, io.bloombox.schema.search.SearchOptions.Builder, io.bloombox.schema.search.SearchOptionsOrBuilder> 
        getOptionsFieldBuilder() {
      if (optionsBuilder_ == null) {
        optionsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.search.SearchOptions, io.bloombox.schema.search.SearchOptions.Builder, io.bloombox.schema.search.SearchOptionsOrBuilder>(
                getOptions(),
                getParentForChildren(),
                isClean());
        options_ = null;
      }
      return optionsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.search.SearchSpec)
  }

  // @@protoc_insertion_point(class_scope:bloombox.search.SearchSpec)
  private static final io.bloombox.schema.search.SearchSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.search.SearchSpec();
  }

  public static io.bloombox.schema.search.SearchSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchSpec>
      PARSER = new com.google.protobuf.AbstractParser<SearchSpec>() {
    @java.lang.Override
    public SearchSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.search.SearchSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

