// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: content/Name.proto

package io.bloombox.schema.content;

/**
 * Protobuf type {@code content.Name}
 */
public  final class Name extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:content.Name)
    NameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Name.newBuilder() to construct.
  private Name(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Name() {
    primary_ = "";
    display_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Name(
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
            java.lang.String s = input.readStringRequireUtf8();

            primary_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            display_ = s;
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
    return io.bloombox.schema.content.NameContent.internal_static_content_Name_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.content.NameContent.internal_static_content_Name_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.content.Name.class, io.bloombox.schema.content.Name.Builder.class);
  }

  public static final int PRIMARY_FIELD_NUMBER = 1;
  private volatile java.lang.Object primary_;
  /**
   * <pre>
   * basic name
   * </pre>
   *
   * <code>string primary = 1;</code>
   */
  public java.lang.String getPrimary() {
    java.lang.Object ref = primary_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      primary_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * basic name
   * </pre>
   *
   * <code>string primary = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPrimaryBytes() {
    java.lang.Object ref = primary_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      primary_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DISPLAY_FIELD_NUMBER = 2;
  private volatile java.lang.Object display_;
  /**
   * <pre>
   * display name 
   * </pre>
   *
   * <code>string display = 2;</code>
   */
  public java.lang.String getDisplay() {
    java.lang.Object ref = display_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      display_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * display name 
   * </pre>
   *
   * <code>string display = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDisplayBytes() {
    java.lang.Object ref = display_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      display_ = b;
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
    if (!getPrimaryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, primary_);
    }
    if (!getDisplayBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, display_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPrimaryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, primary_);
    }
    if (!getDisplayBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, display_);
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
    if (!(obj instanceof io.bloombox.schema.content.Name)) {
      return super.equals(obj);
    }
    io.bloombox.schema.content.Name other = (io.bloombox.schema.content.Name) obj;

    boolean result = true;
    result = result && getPrimary()
        .equals(other.getPrimary());
    result = result && getDisplay()
        .equals(other.getDisplay());
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
    hash = (37 * hash) + PRIMARY_FIELD_NUMBER;
    hash = (53 * hash) + getPrimary().hashCode();
    hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
    hash = (53 * hash) + getDisplay().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.content.Name parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Name parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.content.Name parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.Name parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Name parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.content.Name parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.content.Name parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.content.Name prototype) {
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
   * Protobuf type {@code content.Name}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:content.Name)
      io.bloombox.schema.content.NameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.content.NameContent.internal_static_content_Name_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.content.NameContent.internal_static_content_Name_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.content.Name.class, io.bloombox.schema.content.Name.Builder.class);
    }

    // Construct using io.bloombox.schema.content.Name.newBuilder()
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
      primary_ = "";

      display_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.content.NameContent.internal_static_content_Name_descriptor;
    }

    public io.bloombox.schema.content.Name getDefaultInstanceForType() {
      return io.bloombox.schema.content.Name.getDefaultInstance();
    }

    public io.bloombox.schema.content.Name build() {
      io.bloombox.schema.content.Name result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.content.Name buildPartial() {
      io.bloombox.schema.content.Name result = new io.bloombox.schema.content.Name(this);
      result.primary_ = primary_;
      result.display_ = display_;
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
      if (other instanceof io.bloombox.schema.content.Name) {
        return mergeFrom((io.bloombox.schema.content.Name)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.content.Name other) {
      if (other == io.bloombox.schema.content.Name.getDefaultInstance()) return this;
      if (!other.getPrimary().isEmpty()) {
        primary_ = other.primary_;
        onChanged();
      }
      if (!other.getDisplay().isEmpty()) {
        display_ = other.display_;
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
      io.bloombox.schema.content.Name parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.content.Name) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object primary_ = "";
    /**
     * <pre>
     * basic name
     * </pre>
     *
     * <code>string primary = 1;</code>
     */
    public java.lang.String getPrimary() {
      java.lang.Object ref = primary_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        primary_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * basic name
     * </pre>
     *
     * <code>string primary = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPrimaryBytes() {
      java.lang.Object ref = primary_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        primary_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * basic name
     * </pre>
     *
     * <code>string primary = 1;</code>
     */
    public Builder setPrimary(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      primary_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * basic name
     * </pre>
     *
     * <code>string primary = 1;</code>
     */
    public Builder clearPrimary() {
      
      primary_ = getDefaultInstance().getPrimary();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * basic name
     * </pre>
     *
     * <code>string primary = 1;</code>
     */
    public Builder setPrimaryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      primary_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object display_ = "";
    /**
     * <pre>
     * display name 
     * </pre>
     *
     * <code>string display = 2;</code>
     */
    public java.lang.String getDisplay() {
      java.lang.Object ref = display_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        display_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * display name 
     * </pre>
     *
     * <code>string display = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDisplayBytes() {
      java.lang.Object ref = display_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        display_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * display name 
     * </pre>
     *
     * <code>string display = 2;</code>
     */
    public Builder setDisplay(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      display_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * display name 
     * </pre>
     *
     * <code>string display = 2;</code>
     */
    public Builder clearDisplay() {
      
      display_ = getDefaultInstance().getDisplay();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * display name 
     * </pre>
     *
     * <code>string display = 2;</code>
     */
    public Builder setDisplayBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      display_ = value;
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


    // @@protoc_insertion_point(builder_scope:content.Name)
  }

  // @@protoc_insertion_point(class_scope:content.Name)
  private static final io.bloombox.schema.content.Name DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.content.Name();
  }

  public static io.bloombox.schema.content.Name getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Name>
      PARSER = new com.google.protobuf.AbstractParser<Name>() {
    public Name parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Name(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Name> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Name> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.content.Name getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

