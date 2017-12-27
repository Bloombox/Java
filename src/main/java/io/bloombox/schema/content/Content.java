// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/Content.proto

package io.bloombox.schema.content;

/**
 * <pre>
 * Specifies a freeform content payload of some kind.
 * </pre>
 *
 * Protobuf type {@code content.Content}
 */
public  final class Content extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:content.Content)
    ContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Content.newBuilder() to construct.
  private Content(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Content() {
    type_ = 0;
    encoding_ = 0;
    content_ = com.google.protobuf.ByteString.EMPTY;
    language_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Content(
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
            int rawValue = input.readEnum();

            encoding_ = rawValue;
            break;
          }
          case 26: {

            content_ = input.readBytes();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            language_ = rawValue;
            break;
          }
          case 42: {
            io.bloombox.schema.base.Compression.Builder subBuilder = null;
            if (compression_ != null) {
              subBuilder = compression_.toBuilder();
            }
            compression_ = input.readMessage(io.bloombox.schema.base.Compression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(compression_);
              compression_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.content.GenericContent.internal_static_content_Content_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.content.GenericContent.internal_static_content_Content_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.content.Content.class, io.bloombox.schema.content.Content.Builder.class);
  }

  /**
   * <pre>
   * Enumerates supported types/formats for content data.
   * </pre>
   *
   * Protobuf enum {@code content.Content.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Plaintext format.
     * </pre>
     *
     * <code>TEXT = 0;</code>
     */
    TEXT(0),
    /**
     * <pre>
     * Markdown format.
     * </pre>
     *
     * <code>MARKDOWN = 1;</code>
     */
    MARKDOWN(1),
    /**
     * <pre>
     * HTML format.
     * </pre>
     *
     * <code>HTML = 2;</code>
     */
    HTML(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Plaintext format.
     * </pre>
     *
     * <code>TEXT = 0;</code>
     */
    public static final int TEXT_VALUE = 0;
    /**
     * <pre>
     * Markdown format.
     * </pre>
     *
     * <code>MARKDOWN = 1;</code>
     */
    public static final int MARKDOWN_VALUE = 1;
    /**
     * <pre>
     * HTML format.
     * </pre>
     *
     * <code>HTML = 2;</code>
     */
    public static final int HTML_VALUE = 2;


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
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    public static Type forNumber(int value) {
      switch (value) {
        case 0: return TEXT;
        case 1: return MARKDOWN;
        case 2: return HTML;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
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
      return io.bloombox.schema.content.Content.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
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

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:content.Content.Type)
  }

  /**
   * <pre>
   * Enumerates supported encodings for content data.
   * </pre>
   *
   * Protobuf enum {@code content.Content.Encoding}
   */
  public enum Encoding
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * UTF-8 standard encoding.
     * </pre>
     *
     * <code>UTF8 = 0;</code>
     */
    UTF8(0),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * UTF-8 standard encoding.
     * </pre>
     *
     * <code>UTF8 = 0;</code>
     */
    public static final int UTF8_VALUE = 0;


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
    public static Encoding valueOf(int value) {
      return forNumber(value);
    }

    public static Encoding forNumber(int value) {
      switch (value) {
        case 0: return UTF8;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Encoding>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Encoding> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Encoding>() {
            public Encoding findValueByNumber(int number) {
              return Encoding.forNumber(number);
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
      return io.bloombox.schema.content.Content.getDescriptor().getEnumTypes().get(1);
    }

    private static final Encoding[] VALUES = values();

    public static Encoding valueOf(
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

    private Encoding(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:content.Content.Encoding)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Format/underlying type of content data.
   * </pre>
   *
   * <code>.content.Content.Type type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Format/underlying type of content data.
   * </pre>
   *
   * <code>.content.Content.Type type = 1;</code>
   */
  public io.bloombox.schema.content.Content.Type getType() {
    io.bloombox.schema.content.Content.Type result = io.bloombox.schema.content.Content.Type.valueOf(type_);
    return result == null ? io.bloombox.schema.content.Content.Type.UNRECOGNIZED : result;
  }

  public static final int ENCODING_FIELD_NUMBER = 2;
  private int encoding_;
  /**
   * <pre>
   * Encoding of underlying content data.
   * </pre>
   *
   * <code>.content.Content.Encoding encoding = 2;</code>
   */
  public int getEncodingValue() {
    return encoding_;
  }
  /**
   * <pre>
   * Encoding of underlying content data.
   * </pre>
   *
   * <code>.content.Content.Encoding encoding = 2;</code>
   */
  public io.bloombox.schema.content.Content.Encoding getEncoding() {
    io.bloombox.schema.content.Content.Encoding result = io.bloombox.schema.content.Content.Encoding.valueOf(encoding_);
    return result == null ? io.bloombox.schema.content.Content.Encoding.UNRECOGNIZED : result;
  }

  public static final int CONTENT_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString content_;
  /**
   * <pre>
   * Raw bytes of underlying content data.
   * </pre>
   *
   * <code>bytes content = 3;</code>
   */
  public com.google.protobuf.ByteString getContent() {
    return content_;
  }

  public static final int LANGUAGE_FIELD_NUMBER = 4;
  private int language_;
  /**
   * <pre>
   * Language information for underlying content.
   * </pre>
   *
   * <code>.base.Language language = 4;</code>
   */
  public int getLanguageValue() {
    return language_;
  }
  /**
   * <pre>
   * Language information for underlying content.
   * </pre>
   *
   * <code>.base.Language language = 4;</code>
   */
  public io.bloombox.schema.base.Language getLanguage() {
    io.bloombox.schema.base.Language result = io.bloombox.schema.base.Language.valueOf(language_);
    return result == null ? io.bloombox.schema.base.Language.UNRECOGNIZED : result;
  }

  public static final int COMPRESSION_FIELD_NUMBER = 5;
  private io.bloombox.schema.base.Compression compression_;
  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.base.Compression compression = 5;</code>
   */
  public boolean hasCompression() {
    return compression_ != null;
  }
  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.base.Compression compression = 5;</code>
   */
  public io.bloombox.schema.base.Compression getCompression() {
    return compression_ == null ? io.bloombox.schema.base.Compression.getDefaultInstance() : compression_;
  }
  /**
   * <pre>
   * Compression settings for underlying content.
   * </pre>
   *
   * <code>.base.Compression compression = 5;</code>
   */
  public io.bloombox.schema.base.CompressionOrBuilder getCompressionOrBuilder() {
    return getCompression();
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
    if (type_ != io.bloombox.schema.content.Content.Type.TEXT.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (encoding_ != io.bloombox.schema.content.Content.Encoding.UTF8.getNumber()) {
      output.writeEnum(2, encoding_);
    }
    if (!content_.isEmpty()) {
      output.writeBytes(3, content_);
    }
    if (language_ != io.bloombox.schema.base.Language.ENGLISH.getNumber()) {
      output.writeEnum(4, language_);
    }
    if (compression_ != null) {
      output.writeMessage(5, getCompression());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.bloombox.schema.content.Content.Type.TEXT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (encoding_ != io.bloombox.schema.content.Content.Encoding.UTF8.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, encoding_);
    }
    if (!content_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, content_);
    }
    if (language_ != io.bloombox.schema.base.Language.ENGLISH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, language_);
    }
    if (compression_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getCompression());
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
    if (!(obj instanceof io.bloombox.schema.content.Content)) {
      return super.equals(obj);
    }
    io.bloombox.schema.content.Content other = (io.bloombox.schema.content.Content) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && encoding_ == other.encoding_;
    result = result && getContent()
        .equals(other.getContent());
    result = result && language_ == other.language_;
    result = result && (hasCompression() == other.hasCompression());
    if (hasCompression()) {
      result = result && getCompression()
          .equals(other.getCompression());
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + encoding_;
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + language_;
    if (hasCompression()) {
      hash = (37 * hash) + COMPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getCompression().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.content.Content parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Content parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Content parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.Content parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Content parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.Content parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Content parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.content.Content prototype) {
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
   * Specifies a freeform content payload of some kind.
   * </pre>
   *
   * Protobuf type {@code content.Content}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:content.Content)
      io.bloombox.schema.content.ContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.content.GenericContent.internal_static_content_Content_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.content.GenericContent.internal_static_content_Content_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.content.Content.class, io.bloombox.schema.content.Content.Builder.class);
    }

    // Construct using io.bloombox.schema.content.Content.newBuilder()
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

      encoding_ = 0;

      content_ = com.google.protobuf.ByteString.EMPTY;

      language_ = 0;

      if (compressionBuilder_ == null) {
        compression_ = null;
      } else {
        compression_ = null;
        compressionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.content.GenericContent.internal_static_content_Content_descriptor;
    }

    public io.bloombox.schema.content.Content getDefaultInstanceForType() {
      return io.bloombox.schema.content.Content.getDefaultInstance();
    }

    public io.bloombox.schema.content.Content build() {
      io.bloombox.schema.content.Content result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.content.Content buildPartial() {
      io.bloombox.schema.content.Content result = new io.bloombox.schema.content.Content(this);
      result.type_ = type_;
      result.encoding_ = encoding_;
      result.content_ = content_;
      result.language_ = language_;
      if (compressionBuilder_ == null) {
        result.compression_ = compression_;
      } else {
        result.compression_ = compressionBuilder_.build();
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
      if (other instanceof io.bloombox.schema.content.Content) {
        return mergeFrom((io.bloombox.schema.content.Content)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.content.Content other) {
      if (other == io.bloombox.schema.content.Content.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.encoding_ != 0) {
        setEncodingValue(other.getEncodingValue());
      }
      if (other.getContent() != com.google.protobuf.ByteString.EMPTY) {
        setContent(other.getContent());
      }
      if (other.language_ != 0) {
        setLanguageValue(other.getLanguageValue());
      }
      if (other.hasCompression()) {
        mergeCompression(other.getCompression());
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
      io.bloombox.schema.content.Content parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.content.Content) e.getUnfinishedMessage();
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
     * Format/underlying type of content data.
     * </pre>
     *
     * <code>.content.Content.Type type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Format/underlying type of content data.
     * </pre>
     *
     * <code>.content.Content.Type type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Format/underlying type of content data.
     * </pre>
     *
     * <code>.content.Content.Type type = 1;</code>
     */
    public io.bloombox.schema.content.Content.Type getType() {
      io.bloombox.schema.content.Content.Type result = io.bloombox.schema.content.Content.Type.valueOf(type_);
      return result == null ? io.bloombox.schema.content.Content.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Format/underlying type of content data.
     * </pre>
     *
     * <code>.content.Content.Type type = 1;</code>
     */
    public Builder setType(io.bloombox.schema.content.Content.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Format/underlying type of content data.
     * </pre>
     *
     * <code>.content.Content.Type type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private int encoding_ = 0;
    /**
     * <pre>
     * Encoding of underlying content data.
     * </pre>
     *
     * <code>.content.Content.Encoding encoding = 2;</code>
     */
    public int getEncodingValue() {
      return encoding_;
    }
    /**
     * <pre>
     * Encoding of underlying content data.
     * </pre>
     *
     * <code>.content.Content.Encoding encoding = 2;</code>
     */
    public Builder setEncodingValue(int value) {
      encoding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encoding of underlying content data.
     * </pre>
     *
     * <code>.content.Content.Encoding encoding = 2;</code>
     */
    public io.bloombox.schema.content.Content.Encoding getEncoding() {
      io.bloombox.schema.content.Content.Encoding result = io.bloombox.schema.content.Content.Encoding.valueOf(encoding_);
      return result == null ? io.bloombox.schema.content.Content.Encoding.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Encoding of underlying content data.
     * </pre>
     *
     * <code>.content.Content.Encoding encoding = 2;</code>
     */
    public Builder setEncoding(io.bloombox.schema.content.Content.Encoding value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encoding of underlying content data.
     * </pre>
     *
     * <code>.content.Content.Encoding encoding = 2;</code>
     */
    public Builder clearEncoding() {
      
      encoding_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString content_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Raw bytes of underlying content data.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     */
    public com.google.protobuf.ByteString getContent() {
      return content_;
    }
    /**
     * <pre>
     * Raw bytes of underlying content data.
     * </pre>
     *
     * <code>bytes content = 3;</code>
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
     * Raw bytes of underlying content data.
     * </pre>
     *
     * <code>bytes content = 3;</code>
     */
    public Builder clearContent() {
      
      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }

    private int language_ = 0;
    /**
     * <pre>
     * Language information for underlying content.
     * </pre>
     *
     * <code>.base.Language language = 4;</code>
     */
    public int getLanguageValue() {
      return language_;
    }
    /**
     * <pre>
     * Language information for underlying content.
     * </pre>
     *
     * <code>.base.Language language = 4;</code>
     */
    public Builder setLanguageValue(int value) {
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language information for underlying content.
     * </pre>
     *
     * <code>.base.Language language = 4;</code>
     */
    public io.bloombox.schema.base.Language getLanguage() {
      io.bloombox.schema.base.Language result = io.bloombox.schema.base.Language.valueOf(language_);
      return result == null ? io.bloombox.schema.base.Language.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Language information for underlying content.
     * </pre>
     *
     * <code>.base.Language language = 4;</code>
     */
    public Builder setLanguage(io.bloombox.schema.base.Language value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      language_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Language information for underlying content.
     * </pre>
     *
     * <code>.base.Language language = 4;</code>
     */
    public Builder clearLanguage() {
      
      language_ = 0;
      onChanged();
      return this;
    }

    private io.bloombox.schema.base.Compression compression_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.base.Compression, io.bloombox.schema.base.Compression.Builder, io.bloombox.schema.base.CompressionOrBuilder> compressionBuilder_;
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public boolean hasCompression() {
      return compressionBuilder_ != null || compression_ != null;
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public io.bloombox.schema.base.Compression getCompression() {
      if (compressionBuilder_ == null) {
        return compression_ == null ? io.bloombox.schema.base.Compression.getDefaultInstance() : compression_;
      } else {
        return compressionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public Builder setCompression(io.bloombox.schema.base.Compression value) {
      if (compressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compression_ = value;
        onChanged();
      } else {
        compressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public Builder setCompression(
        io.bloombox.schema.base.Compression.Builder builderForValue) {
      if (compressionBuilder_ == null) {
        compression_ = builderForValue.build();
        onChanged();
      } else {
        compressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public Builder mergeCompression(io.bloombox.schema.base.Compression value) {
      if (compressionBuilder_ == null) {
        if (compression_ != null) {
          compression_ =
            io.bloombox.schema.base.Compression.newBuilder(compression_).mergeFrom(value).buildPartial();
        } else {
          compression_ = value;
        }
        onChanged();
      } else {
        compressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public Builder clearCompression() {
      if (compressionBuilder_ == null) {
        compression_ = null;
        onChanged();
      } else {
        compression_ = null;
        compressionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public io.bloombox.schema.base.Compression.Builder getCompressionBuilder() {
      
      onChanged();
      return getCompressionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    public io.bloombox.schema.base.CompressionOrBuilder getCompressionOrBuilder() {
      if (compressionBuilder_ != null) {
        return compressionBuilder_.getMessageOrBuilder();
      } else {
        return compression_ == null ?
            io.bloombox.schema.base.Compression.getDefaultInstance() : compression_;
      }
    }
    /**
     * <pre>
     * Compression settings for underlying content.
     * </pre>
     *
     * <code>.base.Compression compression = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.base.Compression, io.bloombox.schema.base.Compression.Builder, io.bloombox.schema.base.CompressionOrBuilder> 
        getCompressionFieldBuilder() {
      if (compressionBuilder_ == null) {
        compressionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.base.Compression, io.bloombox.schema.base.Compression.Builder, io.bloombox.schema.base.CompressionOrBuilder>(
                getCompression(),
                getParentForChildren(),
                isClean());
        compression_ = null;
      }
      return compressionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:content.Content)
  }

  // @@protoc_insertion_point(class_scope:content.Content)
  private static final io.bloombox.schema.content.Content DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.content.Content();
  }

  public static io.bloombox.schema.content.Content getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Content>
      PARSER = new com.google.protobuf.AbstractParser<Content>() {
    public Content parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Content(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Content> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Content> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.content.Content getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

