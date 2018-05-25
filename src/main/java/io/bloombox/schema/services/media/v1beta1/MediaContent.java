// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

/**
 * <pre>
 * Specifies media content uploaded inline via the API, if applicable for a given media upload request.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.services.media.v1beta1.MediaContent}
 */
public  final class MediaContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.services.media.v1beta1.MediaContent)
    MediaContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaContent.newBuilder() to construct.
  private MediaContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaContent() {
    content_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaContent(
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

            content_ = input.readBytes();
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
            io.bloombox.schema.services.media.v1beta1.MediaFile.Builder subBuilder = null;
            if (specCase_ == 3) {
              subBuilder = ((io.bloombox.schema.services.media.v1beta1.MediaFile) spec_).toBuilder();
            }
            spec_ =
                input.readMessage(io.bloombox.schema.services.media.v1beta1.MediaFile.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.services.media.v1beta1.MediaFile) spec_);
              spec_ = subBuilder.buildPartial();
            }
            specCase_ = 3;
            break;
          }
          case 32: {
            specCase_ = 4;
            spec_ = input.readBool();
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
    return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_schema_services_media_v1beta1_MediaContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.media.v1beta1.MediaContent.class, io.bloombox.schema.services.media.v1beta1.MediaContent.Builder.class);
  }

  private int specCase_ = 0;
  private java.lang.Object spec_;
  public enum SpecCase
      implements com.google.protobuf.Internal.EnumLite {
    FILE(3),
    BLOB(4),
    SPEC_NOT_SET(0);
    private final int value;
    private SpecCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecCase forNumber(int value) {
      switch (value) {
        case 3: return FILE;
        case 4: return BLOB;
        case 0: return SPEC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecCase
  getSpecCase() {
    return SpecCase.forNumber(
        specCase_);
  }

  public static final int CONTENT_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString content_;
  /**
   * <pre>
   * Raw data for the media content being uploaded, if applicable.
   * </pre>
   *
   * <code>bytes content = 1;</code>
   */
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private io.opencannabis.schema.media.MediaType type_;
  /**
   * <pre>
   * Type specification for the media being uploaded.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2;</code>
   */
  public boolean hasType() {
    return type_ != null;
  }
  /**
   * <pre>
   * Type specification for the media being uploaded.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2;</code>
   */
  public io.opencannabis.schema.media.MediaType getType() {
    return type_ == null ? io.opencannabis.schema.media.MediaType.getDefaultInstance() : type_;
  }
  /**
   * <pre>
   * Type specification for the media being uploaded.
   * </pre>
   *
   * <code>.opencannabis.media.MediaType type = 2;</code>
   */
  public io.opencannabis.schema.media.MediaTypeOrBuilder getTypeOrBuilder() {
    return getType();
  }

  public static final int FILE_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Information about the file being uploaded, including the filename and content mime type.
   * </pre>
   *
   * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
   */
  public boolean hasFile() {
    return specCase_ == 3;
  }
  /**
   * <pre>
   * Information about the file being uploaded, including the filename and content mime type.
   * </pre>
   *
   * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
   */
  public io.bloombox.schema.services.media.v1beta1.MediaFile getFile() {
    if (specCase_ == 3) {
       return (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_;
    }
    return io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
  }
  /**
   * <pre>
   * Information about the file being uploaded, including the filename and content mime type.
   * </pre>
   *
   * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
   */
  public io.bloombox.schema.services.media.v1beta1.MediaFileOrBuilder getFileOrBuilder() {
    if (specCase_ == 3) {
       return (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_;
    }
    return io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
  }

  public static final int BLOB_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Flag indicating the specified/attached content is a raw data blob.
   * </pre>
   *
   * <code>bool blob = 4;</code>
   */
  public boolean getBlob() {
    if (specCase_ == 4) {
      return (java.lang.Boolean) spec_;
    }
    return false;
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
    if (!content_.isEmpty()) {
      output.writeBytes(1, content_);
    }
    if (type_ != null) {
      output.writeMessage(2, getType());
    }
    if (specCase_ == 3) {
      output.writeMessage(3, (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_);
    }
    if (specCase_ == 4) {
      output.writeBool(
          4, (boolean)((java.lang.Boolean) spec_));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, content_);
    }
    if (type_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getType());
    }
    if (specCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_);
    }
    if (specCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            4, (boolean)((java.lang.Boolean) spec_));
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
    if (!(obj instanceof io.bloombox.schema.services.media.v1beta1.MediaContent)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.media.v1beta1.MediaContent other = (io.bloombox.schema.services.media.v1beta1.MediaContent) obj;

    boolean result = true;
    result = result && getContent()
        .equals(other.getContent());
    result = result && (hasType() == other.hasType());
    if (hasType()) {
      result = result && getType()
          .equals(other.getType());
    }
    result = result && getSpecCase().equals(
        other.getSpecCase());
    if (!result) return false;
    switch (specCase_) {
      case 3:
        result = result && getFile()
            .equals(other.getFile());
        break;
      case 4:
        result = result && (getBlob()
            == other.getBlob());
        break;
      case 0:
      default:
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
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasType()) {
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
    }
    switch (specCase_) {
      case 3:
        hash = (37 * hash) + FILE_FIELD_NUMBER;
        hash = (53 * hash) + getFile().hashCode();
        break;
      case 4:
        hash = (37 * hash) + BLOB_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getBlob());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.MediaContent parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.media.v1beta1.MediaContent prototype) {
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
   * Specifies media content uploaded inline via the API, if applicable for a given media upload request.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.services.media.v1beta1.MediaContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.services.media.v1beta1.MediaContent)
      io.bloombox.schema.services.media.v1beta1.MediaContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_schema_services_media_v1beta1_MediaContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.media.v1beta1.MediaContent.class, io.bloombox.schema.services.media.v1beta1.MediaContent.Builder.class);
    }

    // Construct using io.bloombox.schema.services.media.v1beta1.MediaContent.newBuilder()
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
      content_ = com.google.protobuf.ByteString.EMPTY;

      if (typeBuilder_ == null) {
        type_ = null;
      } else {
        type_ = null;
        typeBuilder_ = null;
      }
      specCase_ = 0;
      spec_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_schema_services_media_v1beta1_MediaContent_descriptor;
    }

    public io.bloombox.schema.services.media.v1beta1.MediaContent getDefaultInstanceForType() {
      return io.bloombox.schema.services.media.v1beta1.MediaContent.getDefaultInstance();
    }

    public io.bloombox.schema.services.media.v1beta1.MediaContent build() {
      io.bloombox.schema.services.media.v1beta1.MediaContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.media.v1beta1.MediaContent buildPartial() {
      io.bloombox.schema.services.media.v1beta1.MediaContent result = new io.bloombox.schema.services.media.v1beta1.MediaContent(this);
      result.content_ = content_;
      if (typeBuilder_ == null) {
        result.type_ = type_;
      } else {
        result.type_ = typeBuilder_.build();
      }
      if (specCase_ == 3) {
        if (fileBuilder_ == null) {
          result.spec_ = spec_;
        } else {
          result.spec_ = fileBuilder_.build();
        }
      }
      if (specCase_ == 4) {
        result.spec_ = spec_;
      }
      result.specCase_ = specCase_;
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
      if (other instanceof io.bloombox.schema.services.media.v1beta1.MediaContent) {
        return mergeFrom((io.bloombox.schema.services.media.v1beta1.MediaContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.media.v1beta1.MediaContent other) {
      if (other == io.bloombox.schema.services.media.v1beta1.MediaContent.getDefaultInstance()) return this;
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      if (other.hasType()) {
        mergeType(other.getType());
      }
      switch (other.getSpecCase()) {
        case FILE: {
          mergeFile(other.getFile());
          break;
        }
        case BLOB: {
          setBlob(other.getBlob());
          break;
        }
        case SPEC_NOT_SET: {
          break;
        }
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
      io.bloombox.schema.services.media.v1beta1.MediaContent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.media.v1beta1.MediaContent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int specCase_ = 0;
    private java.lang.Object spec_;
    public SpecCase
        getSpecCase() {
      return SpecCase.forNumber(
          specCase_);
    }

    public Builder clearSpec() {
      specCase_ = 0;
      spec_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Raw data for the media content being uploaded, if applicable.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     * <pre>
     * Raw data for the media content being uploaded, if applicable.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public Builder setContent(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      content_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Raw data for the media content being uploaded, if applicable.
     * </pre>
     *
     * <code>bytes content = 1;</code>
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    private io.opencannabis.schema.media.MediaType type_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.MediaType, io.opencannabis.schema.media.MediaType.Builder, io.opencannabis.schema.media.MediaTypeOrBuilder> typeBuilder_;
    /**
     * <pre>
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
     */
    public boolean hasType() {
      return typeBuilder_ != null || type_ != null;
    }
    /**
     * <pre>
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
     */
    public io.opencannabis.schema.media.MediaType.Builder getTypeBuilder() {
      
      onChanged();
      return getTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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
     * Type specification for the media being uploaded.
     * </pre>
     *
     * <code>.opencannabis.media.MediaType type = 2;</code>
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

    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.media.v1beta1.MediaFile, io.bloombox.schema.services.media.v1beta1.MediaFile.Builder, io.bloombox.schema.services.media.v1beta1.MediaFileOrBuilder> fileBuilder_;
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public boolean hasFile() {
      return specCase_ == 3;
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public io.bloombox.schema.services.media.v1beta1.MediaFile getFile() {
      if (fileBuilder_ == null) {
        if (specCase_ == 3) {
          return (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_;
        }
        return io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
      } else {
        if (specCase_ == 3) {
          return fileBuilder_.getMessage();
        }
        return io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public Builder setFile(io.bloombox.schema.services.media.v1beta1.MediaFile value) {
      if (fileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
        onChanged();
      } else {
        fileBuilder_.setMessage(value);
      }
      specCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public Builder setFile(
        io.bloombox.schema.services.media.v1beta1.MediaFile.Builder builderForValue) {
      if (fileBuilder_ == null) {
        spec_ = builderForValue.build();
        onChanged();
      } else {
        fileBuilder_.setMessage(builderForValue.build());
      }
      specCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public Builder mergeFile(io.bloombox.schema.services.media.v1beta1.MediaFile value) {
      if (fileBuilder_ == null) {
        if (specCase_ == 3 &&
            spec_ != io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance()) {
          spec_ = io.bloombox.schema.services.media.v1beta1.MediaFile.newBuilder((io.bloombox.schema.services.media.v1beta1.MediaFile) spec_)
              .mergeFrom(value).buildPartial();
        } else {
          spec_ = value;
        }
        onChanged();
      } else {
        if (specCase_ == 3) {
          fileBuilder_.mergeFrom(value);
        }
        fileBuilder_.setMessage(value);
      }
      specCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public Builder clearFile() {
      if (fileBuilder_ == null) {
        if (specCase_ == 3) {
          specCase_ = 0;
          spec_ = null;
          onChanged();
        }
      } else {
        if (specCase_ == 3) {
          specCase_ = 0;
          spec_ = null;
        }
        fileBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public io.bloombox.schema.services.media.v1beta1.MediaFile.Builder getFileBuilder() {
      return getFileFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    public io.bloombox.schema.services.media.v1beta1.MediaFileOrBuilder getFileOrBuilder() {
      if ((specCase_ == 3) && (fileBuilder_ != null)) {
        return fileBuilder_.getMessageOrBuilder();
      } else {
        if (specCase_ == 3) {
          return (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_;
        }
        return io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Information about the file being uploaded, including the filename and content mime type.
     * </pre>
     *
     * <code>.bloombox.schema.services.media.v1beta1.MediaFile file = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.media.v1beta1.MediaFile, io.bloombox.schema.services.media.v1beta1.MediaFile.Builder, io.bloombox.schema.services.media.v1beta1.MediaFileOrBuilder> 
        getFileFieldBuilder() {
      if (fileBuilder_ == null) {
        if (!(specCase_ == 3)) {
          spec_ = io.bloombox.schema.services.media.v1beta1.MediaFile.getDefaultInstance();
        }
        fileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.services.media.v1beta1.MediaFile, io.bloombox.schema.services.media.v1beta1.MediaFile.Builder, io.bloombox.schema.services.media.v1beta1.MediaFileOrBuilder>(
                (io.bloombox.schema.services.media.v1beta1.MediaFile) spec_,
                getParentForChildren(),
                isClean());
        spec_ = null;
      }
      specCase_ = 3;
      onChanged();;
      return fileBuilder_;
    }

    /**
     * <pre>
     * Flag indicating the specified/attached content is a raw data blob.
     * </pre>
     *
     * <code>bool blob = 4;</code>
     */
    public boolean getBlob() {
      if (specCase_ == 4) {
        return (java.lang.Boolean) spec_;
      }
      return false;
    }
    /**
     * <pre>
     * Flag indicating the specified/attached content is a raw data blob.
     * </pre>
     *
     * <code>bool blob = 4;</code>
     */
    public Builder setBlob(boolean value) {
      specCase_ = 4;
      spec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag indicating the specified/attached content is a raw data blob.
     * </pre>
     *
     * <code>bool blob = 4;</code>
     */
    public Builder clearBlob() {
      if (specCase_ == 4) {
        specCase_ = 0;
        spec_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.services.media.v1beta1.MediaContent)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.services.media.v1beta1.MediaContent)
  private static final io.bloombox.schema.services.media.v1beta1.MediaContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.media.v1beta1.MediaContent();
  }

  public static io.bloombox.schema.services.media.v1beta1.MediaContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaContent>
      PARSER = new com.google.protobuf.AbstractParser<MediaContent>() {
    public MediaContent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaContent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaContent> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.media.v1beta1.MediaContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

