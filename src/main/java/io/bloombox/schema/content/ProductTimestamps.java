// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/ProductContent.proto

package io.bloombox.schema.content;

/**
 * <pre>
 * Specifies timestamps applied to a product, so that it may be tracked or sorted according to publish date, creation
 * date, or last modification date.
 * </pre>
 *
 * Protobuf type {@code content.ProductTimestamps}
 */
public  final class ProductTimestamps extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:content.ProductTimestamps)
    ProductTimestampsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductTimestamps.newBuilder() to construct.
  private ProductTimestamps(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductTimestamps() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductTimestamps(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
          case 10: {
            io.bloombox.schema.temporal.Instant.Builder subBuilder = null;
            if (created_ != null) {
              subBuilder = created_.toBuilder();
            }
            created_ = input.readMessage(io.bloombox.schema.temporal.Instant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(created_);
              created_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.bloombox.schema.temporal.Instant.Builder subBuilder = null;
            if (modified_ != null) {
              subBuilder = modified_.toBuilder();
            }
            modified_ = input.readMessage(io.bloombox.schema.temporal.Instant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(modified_);
              modified_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            io.bloombox.schema.temporal.Instant.Builder subBuilder = null;
            if (published_ != null) {
              subBuilder = published_.toBuilder();
            }
            published_ = input.readMessage(io.bloombox.schema.temporal.Instant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(published_);
              published_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.content.AttachedContent.internal_static_content_ProductTimestamps_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.content.AttachedContent.internal_static_content_ProductTimestamps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.content.ProductTimestamps.class, io.bloombox.schema.content.ProductTimestamps.Builder.class);
  }

  public static final int CREATED_FIELD_NUMBER = 1;
  private io.bloombox.schema.temporal.Instant created_;
  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  public boolean hasCreated() {
    return created_ != null;
  }
  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  public io.bloombox.schema.temporal.Instant getCreated() {
    return created_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : created_;
  }
  /**
   * <pre>
   * When the subject product was created.
   * </pre>
   *
   * <code>.temporal.Instant created = 1;</code>
   */
  public io.bloombox.schema.temporal.InstantOrBuilder getCreatedOrBuilder() {
    return getCreated();
  }

  public static final int MODIFIED_FIELD_NUMBER = 2;
  private io.bloombox.schema.temporal.Instant modified_;
  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  public boolean hasModified() {
    return modified_ != null;
  }
  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  public io.bloombox.schema.temporal.Instant getModified() {
    return modified_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : modified_;
  }
  /**
   * <pre>
   * When the subject product was last modified.
   * </pre>
   *
   * <code>.temporal.Instant modified = 2;</code>
   */
  public io.bloombox.schema.temporal.InstantOrBuilder getModifiedOrBuilder() {
    return getModified();
  }

  public static final int PUBLISHED_FIELD_NUMBER = 3;
  private io.bloombox.schema.temporal.Instant published_;
  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  public boolean hasPublished() {
    return published_ != null;
  }
  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  public io.bloombox.schema.temporal.Instant getPublished() {
    return published_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : published_;
  }
  /**
   * <pre>
   * When the subject product was last or first published.
   * </pre>
   *
   * <code>.temporal.Instant published = 3;</code>
   */
  public io.bloombox.schema.temporal.InstantOrBuilder getPublishedOrBuilder() {
    return getPublished();
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
    if (created_ != null) {
      output.writeMessage(1, getCreated());
    }
    if (modified_ != null) {
      output.writeMessage(2, getModified());
    }
    if (published_ != null) {
      output.writeMessage(3, getPublished());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (created_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCreated());
    }
    if (modified_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getModified());
    }
    if (published_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPublished());
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
    if (!(obj instanceof io.bloombox.schema.content.ProductTimestamps)) {
      return super.equals(obj);
    }
    io.bloombox.schema.content.ProductTimestamps other = (io.bloombox.schema.content.ProductTimestamps) obj;

    boolean result = true;
    result = result && (hasCreated() == other.hasCreated());
    if (hasCreated()) {
      result = result && getCreated()
          .equals(other.getCreated());
    }
    result = result && (hasModified() == other.hasModified());
    if (hasModified()) {
      result = result && getModified()
          .equals(other.getModified());
    }
    result = result && (hasPublished() == other.hasPublished());
    if (hasPublished()) {
      result = result && getPublished()
          .equals(other.getPublished());
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
    if (hasCreated()) {
      hash = (37 * hash) + CREATED_FIELD_NUMBER;
      hash = (53 * hash) + getCreated().hashCode();
    }
    if (hasModified()) {
      hash = (37 * hash) + MODIFIED_FIELD_NUMBER;
      hash = (53 * hash) + getModified().hashCode();
    }
    if (hasPublished()) {
      hash = (37 * hash) + PUBLISHED_FIELD_NUMBER;
      hash = (53 * hash) + getPublished().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.ProductTimestamps parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.content.ProductTimestamps prototype) {
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
   * Specifies timestamps applied to a product, so that it may be tracked or sorted according to publish date, creation
   * date, or last modification date.
   * </pre>
   *
   * Protobuf type {@code content.ProductTimestamps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:content.ProductTimestamps)
      io.bloombox.schema.content.ProductTimestampsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.content.AttachedContent.internal_static_content_ProductTimestamps_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.content.AttachedContent.internal_static_content_ProductTimestamps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.content.ProductTimestamps.class, io.bloombox.schema.content.ProductTimestamps.Builder.class);
    }

    // Construct using io.bloombox.schema.content.ProductTimestamps.newBuilder()
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
      if (createdBuilder_ == null) {
        created_ = null;
      } else {
        created_ = null;
        createdBuilder_ = null;
      }
      if (modifiedBuilder_ == null) {
        modified_ = null;
      } else {
        modified_ = null;
        modifiedBuilder_ = null;
      }
      if (publishedBuilder_ == null) {
        published_ = null;
      } else {
        published_ = null;
        publishedBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.content.AttachedContent.internal_static_content_ProductTimestamps_descriptor;
    }

    public io.bloombox.schema.content.ProductTimestamps getDefaultInstanceForType() {
      return io.bloombox.schema.content.ProductTimestamps.getDefaultInstance();
    }

    public io.bloombox.schema.content.ProductTimestamps build() {
      io.bloombox.schema.content.ProductTimestamps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.content.ProductTimestamps buildPartial() {
      io.bloombox.schema.content.ProductTimestamps result = new io.bloombox.schema.content.ProductTimestamps(this);
      if (createdBuilder_ == null) {
        result.created_ = created_;
      } else {
        result.created_ = createdBuilder_.build();
      }
      if (modifiedBuilder_ == null) {
        result.modified_ = modified_;
      } else {
        result.modified_ = modifiedBuilder_.build();
      }
      if (publishedBuilder_ == null) {
        result.published_ = published_;
      } else {
        result.published_ = publishedBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.content.ProductTimestamps) {
        return mergeFrom((io.bloombox.schema.content.ProductTimestamps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.content.ProductTimestamps other) {
      if (other == io.bloombox.schema.content.ProductTimestamps.getDefaultInstance()) return this;
      if (other.hasCreated()) {
        mergeCreated(other.getCreated());
      }
      if (other.hasModified()) {
        mergeModified(other.getModified());
      }
      if (other.hasPublished()) {
        mergePublished(other.getPublished());
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
      io.bloombox.schema.content.ProductTimestamps parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.content.ProductTimestamps) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.temporal.Instant created_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> createdBuilder_;
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public boolean hasCreated() {
      return createdBuilder_ != null || created_ != null;
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public io.bloombox.schema.temporal.Instant getCreated() {
      if (createdBuilder_ == null) {
        return created_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : created_;
      } else {
        return createdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public Builder setCreated(io.bloombox.schema.temporal.Instant value) {
      if (createdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        created_ = value;
        onChanged();
      } else {
        createdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public Builder setCreated(
        io.bloombox.schema.temporal.Instant.Builder builderForValue) {
      if (createdBuilder_ == null) {
        created_ = builderForValue.build();
        onChanged();
      } else {
        createdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public Builder mergeCreated(io.bloombox.schema.temporal.Instant value) {
      if (createdBuilder_ == null) {
        if (created_ != null) {
          created_ =
            io.bloombox.schema.temporal.Instant.newBuilder(created_).mergeFrom(value).buildPartial();
        } else {
          created_ = value;
        }
        onChanged();
      } else {
        createdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public Builder clearCreated() {
      if (createdBuilder_ == null) {
        created_ = null;
        onChanged();
      } else {
        created_ = null;
        createdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public io.bloombox.schema.temporal.Instant.Builder getCreatedBuilder() {
      
      onChanged();
      return getCreatedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    public io.bloombox.schema.temporal.InstantOrBuilder getCreatedOrBuilder() {
      if (createdBuilder_ != null) {
        return createdBuilder_.getMessageOrBuilder();
      } else {
        return created_ == null ?
            io.bloombox.schema.temporal.Instant.getDefaultInstance() : created_;
      }
    }
    /**
     * <pre>
     * When the subject product was created.
     * </pre>
     *
     * <code>.temporal.Instant created = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> 
        getCreatedFieldBuilder() {
      if (createdBuilder_ == null) {
        createdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder>(
                getCreated(),
                getParentForChildren(),
                isClean());
        created_ = null;
      }
      return createdBuilder_;
    }

    private io.bloombox.schema.temporal.Instant modified_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> modifiedBuilder_;
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public boolean hasModified() {
      return modifiedBuilder_ != null || modified_ != null;
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public io.bloombox.schema.temporal.Instant getModified() {
      if (modifiedBuilder_ == null) {
        return modified_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : modified_;
      } else {
        return modifiedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public Builder setModified(io.bloombox.schema.temporal.Instant value) {
      if (modifiedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        modified_ = value;
        onChanged();
      } else {
        modifiedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public Builder setModified(
        io.bloombox.schema.temporal.Instant.Builder builderForValue) {
      if (modifiedBuilder_ == null) {
        modified_ = builderForValue.build();
        onChanged();
      } else {
        modifiedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public Builder mergeModified(io.bloombox.schema.temporal.Instant value) {
      if (modifiedBuilder_ == null) {
        if (modified_ != null) {
          modified_ =
            io.bloombox.schema.temporal.Instant.newBuilder(modified_).mergeFrom(value).buildPartial();
        } else {
          modified_ = value;
        }
        onChanged();
      } else {
        modifiedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public Builder clearModified() {
      if (modifiedBuilder_ == null) {
        modified_ = null;
        onChanged();
      } else {
        modified_ = null;
        modifiedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public io.bloombox.schema.temporal.Instant.Builder getModifiedBuilder() {
      
      onChanged();
      return getModifiedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    public io.bloombox.schema.temporal.InstantOrBuilder getModifiedOrBuilder() {
      if (modifiedBuilder_ != null) {
        return modifiedBuilder_.getMessageOrBuilder();
      } else {
        return modified_ == null ?
            io.bloombox.schema.temporal.Instant.getDefaultInstance() : modified_;
      }
    }
    /**
     * <pre>
     * When the subject product was last modified.
     * </pre>
     *
     * <code>.temporal.Instant modified = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> 
        getModifiedFieldBuilder() {
      if (modifiedBuilder_ == null) {
        modifiedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder>(
                getModified(),
                getParentForChildren(),
                isClean());
        modified_ = null;
      }
      return modifiedBuilder_;
    }

    private io.bloombox.schema.temporal.Instant published_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> publishedBuilder_;
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public boolean hasPublished() {
      return publishedBuilder_ != null || published_ != null;
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public io.bloombox.schema.temporal.Instant getPublished() {
      if (publishedBuilder_ == null) {
        return published_ == null ? io.bloombox.schema.temporal.Instant.getDefaultInstance() : published_;
      } else {
        return publishedBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public Builder setPublished(io.bloombox.schema.temporal.Instant value) {
      if (publishedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        published_ = value;
        onChanged();
      } else {
        publishedBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public Builder setPublished(
        io.bloombox.schema.temporal.Instant.Builder builderForValue) {
      if (publishedBuilder_ == null) {
        published_ = builderForValue.build();
        onChanged();
      } else {
        publishedBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public Builder mergePublished(io.bloombox.schema.temporal.Instant value) {
      if (publishedBuilder_ == null) {
        if (published_ != null) {
          published_ =
            io.bloombox.schema.temporal.Instant.newBuilder(published_).mergeFrom(value).buildPartial();
        } else {
          published_ = value;
        }
        onChanged();
      } else {
        publishedBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public Builder clearPublished() {
      if (publishedBuilder_ == null) {
        published_ = null;
        onChanged();
      } else {
        published_ = null;
        publishedBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public io.bloombox.schema.temporal.Instant.Builder getPublishedBuilder() {
      
      onChanged();
      return getPublishedFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    public io.bloombox.schema.temporal.InstantOrBuilder getPublishedOrBuilder() {
      if (publishedBuilder_ != null) {
        return publishedBuilder_.getMessageOrBuilder();
      } else {
        return published_ == null ?
            io.bloombox.schema.temporal.Instant.getDefaultInstance() : published_;
      }
    }
    /**
     * <pre>
     * When the subject product was last or first published.
     * </pre>
     *
     * <code>.temporal.Instant published = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder> 
        getPublishedFieldBuilder() {
      if (publishedBuilder_ == null) {
        publishedBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.temporal.Instant, io.bloombox.schema.temporal.Instant.Builder, io.bloombox.schema.temporal.InstantOrBuilder>(
                getPublished(),
                getParentForChildren(),
                isClean());
        published_ = null;
      }
      return publishedBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:content.ProductTimestamps)
  }

  // @@protoc_insertion_point(class_scope:content.ProductTimestamps)
  private static final io.bloombox.schema.content.ProductTimestamps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.content.ProductTimestamps();
  }

  public static io.bloombox.schema.content.ProductTimestamps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductTimestamps>
      PARSER = new com.google.protobuf.AbstractParser<ProductTimestamps>() {
    public ProductTimestamps parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductTimestamps(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductTimestamps> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductTimestamps> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.content.ProductTimestamps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

