// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

/**
 * <pre>
 * Settings related to brand taxonomy for products.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.ProductBrandSettings}
 */
public  final class ProductBrandSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.ProductBrandSettings)
    ProductBrandSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductBrandSettings.newBuilder() to construct.
  private ProductBrandSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductBrandSettings() {
    inhouse_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductBrandSettings(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              inhouse_ = new java.util.ArrayList<io.bloombox.schema.partner.settings.InHouseBrand>();
              mutable_bitField0_ |= 0x00000001;
            }
            inhouse_.add(
                input.readMessage(io.bloombox.schema.partner.settings.InHouseBrand.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        inhouse_ = java.util.Collections.unmodifiableList(inhouse_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_ProductBrandSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_ProductBrandSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.ProductBrandSettings.class, io.bloombox.schema.partner.settings.ProductBrandSettings.Builder.class);
  }

  public static final int INHOUSE_FIELD_NUMBER = 1;
  private java.util.List<io.bloombox.schema.partner.settings.InHouseBrand> inhouse_;
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  public java.util.List<io.bloombox.schema.partner.settings.InHouseBrand> getInhouseList() {
    return inhouse_;
  }
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  public java.util.List<? extends io.bloombox.schema.partner.settings.InHouseBrandOrBuilder> 
      getInhouseOrBuilderList() {
    return inhouse_;
  }
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  public int getInhouseCount() {
    return inhouse_.size();
  }
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  public io.bloombox.schema.partner.settings.InHouseBrand getInhouse(int index) {
    return inhouse_.get(index);
  }
  /**
   * <pre>
   * Settings payloads for in-house brands.
   * </pre>
   *
   * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
   */
  public io.bloombox.schema.partner.settings.InHouseBrandOrBuilder getInhouseOrBuilder(
      int index) {
    return inhouse_.get(index);
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
    for (int i = 0; i < inhouse_.size(); i++) {
      output.writeMessage(1, inhouse_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inhouse_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inhouse_.get(i));
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.ProductBrandSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.ProductBrandSettings other = (io.bloombox.schema.partner.settings.ProductBrandSettings) obj;

    boolean result = true;
    result = result && getInhouseList()
        .equals(other.getInhouseList());
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
    if (getInhouseCount() > 0) {
      hash = (37 * hash) + INHOUSE_FIELD_NUMBER;
      hash = (53 * hash) + getInhouseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.ProductBrandSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.ProductBrandSettings prototype) {
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
   * Settings related to brand taxonomy for products.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.ProductBrandSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.ProductBrandSettings)
      io.bloombox.schema.partner.settings.ProductBrandSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_ProductBrandSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_ProductBrandSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.ProductBrandSettings.class, io.bloombox.schema.partner.settings.ProductBrandSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.ProductBrandSettings.newBuilder()
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
        getInhouseFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (inhouseBuilder_ == null) {
        inhouse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        inhouseBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_ProductBrandSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.ProductBrandSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.ProductBrandSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.ProductBrandSettings build() {
      io.bloombox.schema.partner.settings.ProductBrandSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.ProductBrandSettings buildPartial() {
      io.bloombox.schema.partner.settings.ProductBrandSettings result = new io.bloombox.schema.partner.settings.ProductBrandSettings(this);
      int from_bitField0_ = bitField0_;
      if (inhouseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          inhouse_ = java.util.Collections.unmodifiableList(inhouse_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inhouse_ = inhouse_;
      } else {
        result.inhouse_ = inhouseBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.settings.ProductBrandSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.ProductBrandSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.ProductBrandSettings other) {
      if (other == io.bloombox.schema.partner.settings.ProductBrandSettings.getDefaultInstance()) return this;
      if (inhouseBuilder_ == null) {
        if (!other.inhouse_.isEmpty()) {
          if (inhouse_.isEmpty()) {
            inhouse_ = other.inhouse_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInhouseIsMutable();
            inhouse_.addAll(other.inhouse_);
          }
          onChanged();
        }
      } else {
        if (!other.inhouse_.isEmpty()) {
          if (inhouseBuilder_.isEmpty()) {
            inhouseBuilder_.dispose();
            inhouseBuilder_ = null;
            inhouse_ = other.inhouse_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inhouseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInhouseFieldBuilder() : null;
          } else {
            inhouseBuilder_.addAllMessages(other.inhouse_);
          }
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
      io.bloombox.schema.partner.settings.ProductBrandSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.ProductBrandSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.bloombox.schema.partner.settings.InHouseBrand> inhouse_ =
      java.util.Collections.emptyList();
    private void ensureInhouseIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        inhouse_ = new java.util.ArrayList<io.bloombox.schema.partner.settings.InHouseBrand>(inhouse_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.partner.settings.InHouseBrand, io.bloombox.schema.partner.settings.InHouseBrand.Builder, io.bloombox.schema.partner.settings.InHouseBrandOrBuilder> inhouseBuilder_;

    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public java.util.List<io.bloombox.schema.partner.settings.InHouseBrand> getInhouseList() {
      if (inhouseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inhouse_);
      } else {
        return inhouseBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public int getInhouseCount() {
      if (inhouseBuilder_ == null) {
        return inhouse_.size();
      } else {
        return inhouseBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public io.bloombox.schema.partner.settings.InHouseBrand getInhouse(int index) {
      if (inhouseBuilder_ == null) {
        return inhouse_.get(index);
      } else {
        return inhouseBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder setInhouse(
        int index, io.bloombox.schema.partner.settings.InHouseBrand value) {
      if (inhouseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInhouseIsMutable();
        inhouse_.set(index, value);
        onChanged();
      } else {
        inhouseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder setInhouse(
        int index, io.bloombox.schema.partner.settings.InHouseBrand.Builder builderForValue) {
      if (inhouseBuilder_ == null) {
        ensureInhouseIsMutable();
        inhouse_.set(index, builderForValue.build());
        onChanged();
      } else {
        inhouseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder addInhouse(io.bloombox.schema.partner.settings.InHouseBrand value) {
      if (inhouseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInhouseIsMutable();
        inhouse_.add(value);
        onChanged();
      } else {
        inhouseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder addInhouse(
        int index, io.bloombox.schema.partner.settings.InHouseBrand value) {
      if (inhouseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInhouseIsMutable();
        inhouse_.add(index, value);
        onChanged();
      } else {
        inhouseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder addInhouse(
        io.bloombox.schema.partner.settings.InHouseBrand.Builder builderForValue) {
      if (inhouseBuilder_ == null) {
        ensureInhouseIsMutable();
        inhouse_.add(builderForValue.build());
        onChanged();
      } else {
        inhouseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder addInhouse(
        int index, io.bloombox.schema.partner.settings.InHouseBrand.Builder builderForValue) {
      if (inhouseBuilder_ == null) {
        ensureInhouseIsMutable();
        inhouse_.add(index, builderForValue.build());
        onChanged();
      } else {
        inhouseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder addAllInhouse(
        java.lang.Iterable<? extends io.bloombox.schema.partner.settings.InHouseBrand> values) {
      if (inhouseBuilder_ == null) {
        ensureInhouseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inhouse_);
        onChanged();
      } else {
        inhouseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder clearInhouse() {
      if (inhouseBuilder_ == null) {
        inhouse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inhouseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public Builder removeInhouse(int index) {
      if (inhouseBuilder_ == null) {
        ensureInhouseIsMutable();
        inhouse_.remove(index);
        onChanged();
      } else {
        inhouseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public io.bloombox.schema.partner.settings.InHouseBrand.Builder getInhouseBuilder(
        int index) {
      return getInhouseFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public io.bloombox.schema.partner.settings.InHouseBrandOrBuilder getInhouseOrBuilder(
        int index) {
      if (inhouseBuilder_ == null) {
        return inhouse_.get(index);  } else {
        return inhouseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public java.util.List<? extends io.bloombox.schema.partner.settings.InHouseBrandOrBuilder> 
         getInhouseOrBuilderList() {
      if (inhouseBuilder_ != null) {
        return inhouseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inhouse_);
      }
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public io.bloombox.schema.partner.settings.InHouseBrand.Builder addInhouseBuilder() {
      return getInhouseFieldBuilder().addBuilder(
          io.bloombox.schema.partner.settings.InHouseBrand.getDefaultInstance());
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public io.bloombox.schema.partner.settings.InHouseBrand.Builder addInhouseBuilder(
        int index) {
      return getInhouseFieldBuilder().addBuilder(
          index, io.bloombox.schema.partner.settings.InHouseBrand.getDefaultInstance());
    }
    /**
     * <pre>
     * Settings payloads for in-house brands.
     * </pre>
     *
     * <code>repeated .bloombox.schema.partner.settings.InHouseBrand inhouse = 1;</code>
     */
    public java.util.List<io.bloombox.schema.partner.settings.InHouseBrand.Builder> 
         getInhouseBuilderList() {
      return getInhouseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.partner.settings.InHouseBrand, io.bloombox.schema.partner.settings.InHouseBrand.Builder, io.bloombox.schema.partner.settings.InHouseBrandOrBuilder> 
        getInhouseFieldBuilder() {
      if (inhouseBuilder_ == null) {
        inhouseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.bloombox.schema.partner.settings.InHouseBrand, io.bloombox.schema.partner.settings.InHouseBrand.Builder, io.bloombox.schema.partner.settings.InHouseBrandOrBuilder>(
                inhouse_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        inhouse_ = null;
      }
      return inhouseBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.ProductBrandSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.ProductBrandSettings)
  private static final io.bloombox.schema.partner.settings.ProductBrandSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.ProductBrandSettings();
  }

  public static io.bloombox.schema.partner.settings.ProductBrandSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductBrandSettings>
      PARSER = new com.google.protobuf.AbstractParser<ProductBrandSettings>() {
    public ProductBrandSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductBrandSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductBrandSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductBrandSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.ProductBrandSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

