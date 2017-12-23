// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: media/MediaType.proto

package io.bloombox.schema.media;

/**
 * <pre>
 * Specifies video type information.
 * </pre>
 *
 * Protobuf type {@code media.VideoType}
 */
public  final class VideoType extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:media.VideoType)
    VideoTypeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoType.newBuilder() to construct.
  private VideoType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoType() {
    kind_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoType(
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
          case 8: {
            int rawValue = input.readEnum();

            kind_ = rawValue;
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
    return io.bloombox.schema.media.MediaItemType.internal_static_media_VideoType_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.media.MediaItemType.internal_static_media_VideoType_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.media.VideoType.class, io.bloombox.schema.media.VideoType.Builder.class);
  }

  /**
   * <pre>
   * Specifies kinds of videos that may be attached or described.
   * </pre>
   *
   * Protobuf enum {@code media.VideoType.VideoKind}
   */
  public enum VideoKind
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * MP4 video.
     * </pre>
     *
     * <code>MP4 = 0;</code>
     */
    MP4(0),
    /**
     * <pre>
     * Flash video.
     * </pre>
     *
     * <code>FLV = 1;</code>
     */
    FLV(1),
    /**
     * <pre>
     * HTTP Live Streaming video.
     * </pre>
     *
     * <code>HLS = 2;</code>
     */
    HLS(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * MP4 video.
     * </pre>
     *
     * <code>MP4 = 0;</code>
     */
    public static final int MP4_VALUE = 0;
    /**
     * <pre>
     * Flash video.
     * </pre>
     *
     * <code>FLV = 1;</code>
     */
    public static final int FLV_VALUE = 1;
    /**
     * <pre>
     * HTTP Live Streaming video.
     * </pre>
     *
     * <code>HLS = 2;</code>
     */
    public static final int HLS_VALUE = 2;


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
    public static VideoKind valueOf(int value) {
      return forNumber(value);
    }

    public static VideoKind forNumber(int value) {
      switch (value) {
        case 0: return MP4;
        case 1: return FLV;
        case 2: return HLS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VideoKind>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VideoKind> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VideoKind>() {
            public VideoKind findValueByNumber(int number) {
              return VideoKind.forNumber(number);
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
      return io.bloombox.schema.media.VideoType.getDescriptor().getEnumTypes().get(0);
    }

    private static final VideoKind[] VALUES = values();

    public static VideoKind valueOf(
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

    private VideoKind(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:media.VideoType.VideoKind)
  }

  public static final int KIND_FIELD_NUMBER = 1;
  private int kind_;
  /**
   * <pre>
   * Specifies the kind of video being attached or described.
   * </pre>
   *
   * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
   */
  public int getKindValue() {
    return kind_;
  }
  /**
   * <pre>
   * Specifies the kind of video being attached or described.
   * </pre>
   *
   * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
   */
  public io.bloombox.schema.media.VideoType.VideoKind getKind() {
    io.bloombox.schema.media.VideoType.VideoKind result = io.bloombox.schema.media.VideoType.VideoKind.valueOf(kind_);
    return result == null ? io.bloombox.schema.media.VideoType.VideoKind.UNRECOGNIZED : result;
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
    if (kind_ != io.bloombox.schema.media.VideoType.VideoKind.MP4.getNumber()) {
      output.writeEnum(1, kind_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kind_ != io.bloombox.schema.media.VideoType.VideoKind.MP4.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, kind_);
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
    if (!(obj instanceof io.bloombox.schema.media.VideoType)) {
      return super.equals(obj);
    }
    io.bloombox.schema.media.VideoType other = (io.bloombox.schema.media.VideoType) obj;

    boolean result = true;
    result = result && kind_ == other.kind_;
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
    hash = (37 * hash) + KIND_FIELD_NUMBER;
    hash = (53 * hash) + kind_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.media.VideoType parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.media.VideoType parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.media.VideoType parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.media.VideoType parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.media.VideoType prototype) {
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
   * Specifies video type information.
   * </pre>
   *
   * Protobuf type {@code media.VideoType}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:media.VideoType)
      io.bloombox.schema.media.VideoTypeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.media.MediaItemType.internal_static_media_VideoType_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.media.MediaItemType.internal_static_media_VideoType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.media.VideoType.class, io.bloombox.schema.media.VideoType.Builder.class);
    }

    // Construct using io.bloombox.schema.media.VideoType.newBuilder()
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
      kind_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.media.MediaItemType.internal_static_media_VideoType_descriptor;
    }

    public io.bloombox.schema.media.VideoType getDefaultInstanceForType() {
      return io.bloombox.schema.media.VideoType.getDefaultInstance();
    }

    public io.bloombox.schema.media.VideoType build() {
      io.bloombox.schema.media.VideoType result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.media.VideoType buildPartial() {
      io.bloombox.schema.media.VideoType result = new io.bloombox.schema.media.VideoType(this);
      result.kind_ = kind_;
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
      if (other instanceof io.bloombox.schema.media.VideoType) {
        return mergeFrom((io.bloombox.schema.media.VideoType)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.media.VideoType other) {
      if (other == io.bloombox.schema.media.VideoType.getDefaultInstance()) return this;
      if (other.kind_ != 0) {
        setKindValue(other.getKindValue());
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
      io.bloombox.schema.media.VideoType parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.media.VideoType) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int kind_ = 0;
    /**
     * <pre>
     * Specifies the kind of video being attached or described.
     * </pre>
     *
     * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
     */
    public int getKindValue() {
      return kind_;
    }
    /**
     * <pre>
     * Specifies the kind of video being attached or described.
     * </pre>
     *
     * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
     */
    public Builder setKindValue(int value) {
      kind_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the kind of video being attached or described.
     * </pre>
     *
     * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
     */
    public io.bloombox.schema.media.VideoType.VideoKind getKind() {
      io.bloombox.schema.media.VideoType.VideoKind result = io.bloombox.schema.media.VideoType.VideoKind.valueOf(kind_);
      return result == null ? io.bloombox.schema.media.VideoType.VideoKind.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the kind of video being attached or described.
     * </pre>
     *
     * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
     */
    public Builder setKind(io.bloombox.schema.media.VideoType.VideoKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      kind_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the kind of video being attached or described.
     * </pre>
     *
     * <code>.media.VideoType.VideoKind kind = 1 [(.gen_bq_schema.description) = "Specifies the kind of video being attached or described."];</code>
     */
    public Builder clearKind() {
      
      kind_ = 0;
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


    // @@protoc_insertion_point(builder_scope:media.VideoType)
  }

  // @@protoc_insertion_point(class_scope:media.VideoType)
  private static final io.bloombox.schema.media.VideoType DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.media.VideoType();
  }

  public static io.bloombox.schema.media.VideoType getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoType>
      PARSER = new com.google.protobuf.AbstractParser<VideoType>() {
    public VideoType parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VideoType(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoType> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoType> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.media.VideoType getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

