// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/MediaItem.proto

package io.opencannabis.schema.media;

/**
 * <pre>
 * Describes an individual media item, which can be an image, video, etc.
 * </pre>
 *
 * Protobuf type {@code opencannabis.media.MediaItem}
 */
public  final class MediaItem extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.media.MediaItem)
    MediaItemOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaItem.newBuilder() to construct.
  private MediaItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaItem() {
    name_ = "";
    uri_ = "";
    servingUri_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaItem(
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
          case 10: {
            io.opencannabis.schema.media.MediaKey.Builder subBuilder = null;
            if (key_ != null) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(io.opencannabis.schema.media.MediaKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.media.MediaType.Builder subBuilder = null;
            if (type_ != null) {
              subBuilder = type_.toBuilder();
            }
            type_ = input.readMessage(io.opencannabis.schema.media.MediaType.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(type_);
              type_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            uri_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            servingUri_ = s;
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
    return io.opencannabis.schema.media.AttachedMedia.internal_static_opencannabis_media_MediaItem_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.media.AttachedMedia.internal_static_opencannabis_media_MediaItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.media.MediaItem.class, io.opencannabis.schema.media.MediaItem.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private io.opencannabis.schema.media.MediaKey key_;
  /**
   * <pre>
   * Key uniquely identifying this media item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
   */
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * Key uniquely identifying this media item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.media.MediaKey getKey() {
    return key_ == null ? io.opencannabis.schema.media.MediaKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Key uniquely identifying this media item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.media.MediaKeyOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private io.opencannabis.schema.media.MediaType type_;
  /**
   * <pre>
   * Type of media this is describing.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
   */
  public boolean hasType() {
    return type_ != null;
  }
  /**
   * <pre>
   * Type of media this is describing.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.media.MediaType getType() {
    return type_ == null ? io.opencannabis.schema.media.MediaType.getDefaultInstance() : type_;
  }
  /**
   * <pre>
   * Type of media this is describing.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.media.MediaTypeOrBuilder getTypeOrBuilder() {
    return getType();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Friendly name for this media.
   * </pre>
   *
   * <code>string name = 3 [(.core.field) = { ... }</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Friendly name for this media.
   * </pre>
   *
   * <code>string name = 3 [(.core.field) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int URI_FIELD_NUMBER = 4;
  private volatile java.lang.Object uri_;
  /**
   * <pre>
   * Origin URI to this media.
   * </pre>
   *
   * <code>string uri = 4 [(.core.field) = { ... }</code>
   */
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Origin URI to this media.
   * </pre>
   *
   * <code>string uri = 4 [(.core.field) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVING_URI_FIELD_NUMBER = 5;
  private volatile java.lang.Object servingUri_;
  /**
   * <pre>
   * Serving URI for this media, if it differs from the origin URI.
   * </pre>
   *
   * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
   */
  public java.lang.String getServingUri() {
    java.lang.Object ref = servingUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      servingUri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Serving URI for this media, if it differs from the origin URI.
   * </pre>
   *
   * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getServingUriBytes() {
    java.lang.Object ref = servingUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      servingUri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (type_ != null) {
      output.writeMessage(2, getType());
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    if (!getUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, uri_);
    }
    if (!getServingUriBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, servingUri_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (type_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getType());
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    if (!getUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, uri_);
    }
    if (!getServingUriBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, servingUri_);
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
    if (!(obj instanceof io.opencannabis.schema.media.MediaItem)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.media.MediaItem other = (io.opencannabis.schema.media.MediaItem) obj;

    boolean result = true;
    result = result && (hasKey() == other.hasKey());
    if (hasKey()) {
      result = result && getKey()
          .equals(other.getKey());
    }
    result = result && (hasType() == other.hasType());
    if (hasType()) {
      result = result && getType()
          .equals(other.getType());
    }
    result = result && getName()
        .equals(other.getName());
    result = result && getUri()
        .equals(other.getUri());
    result = result && getServingUri()
        .equals(other.getServingUri());
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    hash = (37 * hash) + SERVING_URI_FIELD_NUMBER;
    hash = (53 * hash) + getServingUri().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.media.MediaItem parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.media.MediaItem parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.media.MediaItem parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.media.MediaItem parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.media.MediaItem prototype) {
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
   * Describes an individual media item, which can be an image, video, etc.
   * </pre>
   *
   * Protobuf type {@code opencannabis.media.MediaItem}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.media.MediaItem)
      io.opencannabis.schema.media.MediaItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.media.AttachedMedia.internal_static_opencannabis_media_MediaItem_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.media.AttachedMedia.internal_static_opencannabis_media_MediaItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.media.MediaItem.class, io.opencannabis.schema.media.MediaItem.Builder.class);
    }

    // Construct using io.opencannabis.schema.media.MediaItem.newBuilder()
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
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      if (typeBuilder_ == null) {
        type_ = null;
      } else {
        type_ = null;
        typeBuilder_ = null;
      }
      name_ = "";

      uri_ = "";

      servingUri_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.media.AttachedMedia.internal_static_opencannabis_media_MediaItem_descriptor;
    }

    public io.opencannabis.schema.media.MediaItem getDefaultInstanceForType() {
      return io.opencannabis.schema.media.MediaItem.getDefaultInstance();
    }

    public io.opencannabis.schema.media.MediaItem build() {
      io.opencannabis.schema.media.MediaItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.media.MediaItem buildPartial() {
      io.opencannabis.schema.media.MediaItem result = new io.opencannabis.schema.media.MediaItem(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      if (typeBuilder_ == null) {
        result.type_ = type_;
      } else {
        result.type_ = typeBuilder_.build();
      }
      result.name_ = name_;
      result.uri_ = uri_;
      result.servingUri_ = servingUri_;
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
      if (other instanceof io.opencannabis.schema.media.MediaItem) {
        return mergeFrom((io.opencannabis.schema.media.MediaItem)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.media.MediaItem other) {
      if (other == io.opencannabis.schema.media.MediaItem.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        onChanged();
      }
      if (!other.getServingUri().isEmpty()) {
        servingUri_ = other.servingUri_;
        onChanged();
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
      io.opencannabis.schema.media.MediaItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.media.MediaItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.media.MediaKey key_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.MediaKey, io.opencannabis.schema.media.MediaKey.Builder, io.opencannabis.schema.media.MediaKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? io.opencannabis.schema.media.MediaKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder setKey(io.opencannabis.schema.media.MediaKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder setKey(
        io.opencannabis.schema.media.MediaKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder mergeKey(io.opencannabis.schema.media.MediaKey value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            io.opencannabis.schema.media.MediaKey.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaKey.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            io.opencannabis.schema.media.MediaKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Key uniquely identifying this media item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaKey key = 1 [(.core.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.MediaKey, io.opencannabis.schema.media.MediaKey.Builder, io.opencannabis.schema.media.MediaKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.media.MediaKey, io.opencannabis.schema.media.MediaKey.Builder, io.opencannabis.schema.media.MediaKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private io.opencannabis.schema.media.MediaType type_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.MediaType, io.opencannabis.schema.media.MediaType.Builder, io.opencannabis.schema.media.MediaTypeOrBuilder> typeBuilder_;
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public boolean hasType() {
      return typeBuilder_ != null || type_ != null;
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaType getType() {
      if (typeBuilder_ == null) {
        return type_ == null ? io.opencannabis.schema.media.MediaType.getDefaultInstance() : type_;
      } else {
        return typeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public Builder setType(io.opencannabis.schema.media.MediaType value) {
      if (typeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        type_ = value;
        onChanged();
      } else {
        typeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public Builder setType(
        io.opencannabis.schema.media.MediaType.Builder builderForValue) {
      if (typeBuilder_ == null) {
        type_ = builderForValue.build();
        onChanged();
      } else {
        typeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public Builder mergeType(io.opencannabis.schema.media.MediaType value) {
      if (typeBuilder_ == null) {
        if (type_ != null) {
          type_ =
            io.opencannabis.schema.media.MediaType.newBuilder(type_).mergeFrom(value).buildPartial();
        } else {
          type_ = value;
        }
        onChanged();
      } else {
        typeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public Builder clearType() {
      if (typeBuilder_ == null) {
        type_ = null;
        onChanged();
      } else {
        type_ = null;
        typeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaType.Builder getTypeBuilder() {
      
      onChanged();
      return getTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.media.MediaTypeOrBuilder getTypeOrBuilder() {
      if (typeBuilder_ != null) {
        return typeBuilder_.getMessageOrBuilder();
      } else {
        return type_ == null ?
            io.opencannabis.schema.media.MediaType.getDefaultInstance() : type_;
      }
    }
    /**
     * <pre>
     * Type of media this is describing.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2 [(.core.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.MediaType, io.opencannabis.schema.media.MediaType.Builder, io.opencannabis.schema.media.MediaTypeOrBuilder> 
        getTypeFieldBuilder() {
      if (typeBuilder_ == null) {
        typeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.media.MediaType, io.opencannabis.schema.media.MediaType.Builder, io.opencannabis.schema.media.MediaTypeOrBuilder>(
                getType(),
                getParentForChildren(),
                isClean());
        type_ = null;
      }
      return typeBuilder_;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Friendly name for this media.
     * </pre>
     *
     * <code>string name = 3 [(.core.field) = { ... }</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Friendly name for this media.
     * </pre>
     *
     * <code>string name = 3 [(.core.field) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Friendly name for this media.
     * </pre>
     *
     * <code>string name = 3 [(.core.field) = { ... }</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Friendly name for this media.
     * </pre>
     *
     * <code>string name = 3 [(.core.field) = { ... }</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Friendly name for this media.
     * </pre>
     *
     * <code>string name = 3 [(.core.field) = { ... }</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * Origin URI to this media.
     * </pre>
     *
     * <code>string uri = 4 [(.core.field) = { ... }</code>
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Origin URI to this media.
     * </pre>
     *
     * <code>string uri = 4 [(.core.field) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Origin URI to this media.
     * </pre>
     *
     * <code>string uri = 4 [(.core.field) = { ... }</code>
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Origin URI to this media.
     * </pre>
     *
     * <code>string uri = 4 [(.core.field) = { ... }</code>
     */
    public Builder clearUri() {
      
      uri_ = getDefaultInstance().getUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Origin URI to this media.
     * </pre>
     *
     * <code>string uri = 4 [(.core.field) = { ... }</code>
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uri_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object servingUri_ = "";
    /**
     * <pre>
     * Serving URI for this media, if it differs from the origin URI.
     * </pre>
     *
     * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
     */
    public java.lang.String getServingUri() {
      java.lang.Object ref = servingUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        servingUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Serving URI for this media, if it differs from the origin URI.
     * </pre>
     *
     * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getServingUriBytes() {
      java.lang.Object ref = servingUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        servingUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Serving URI for this media, if it differs from the origin URI.
     * </pre>
     *
     * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
     */
    public Builder setServingUri(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      servingUri_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Serving URI for this media, if it differs from the origin URI.
     * </pre>
     *
     * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
     */
    public Builder clearServingUri() {
      
      servingUri_ = getDefaultInstance().getServingUri();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Serving URI for this media, if it differs from the origin URI.
     * </pre>
     *
     * <code>string serving_uri = 5 [(.core.field) = { ... }</code>
     */
    public Builder setServingUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      servingUri_ = value;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.media.MediaItem)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.media.MediaItem)
  private static final io.opencannabis.schema.media.MediaItem DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.media.MediaItem();
  }

  public static io.opencannabis.schema.media.MediaItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaItem>
      PARSER = new com.google.protobuf.AbstractParser<MediaItem>() {
    public MediaItem parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaItem(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaItem> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.media.MediaItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

