// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/integrations/SendgridSettings.proto

package io.bloombox.schema.partner.integrations.sendgrid;

/**
 * <pre>
 * Specifies Sendgrid settings for integration with Bloombox.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.integrations.sendgrid.SendgridSettings}
 */
public  final class SendgridSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.integrations.sendgrid.SendgridSettings)
    SendgridSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendgridSettings.newBuilder() to construct.
  private SendgridSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendgridSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendgridSettings(
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
          case 82: {
            io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder subBuilder = null;
            if (features_ != null) {
              subBuilder = features_.toBuilder();
            }
            features_ = input.readMessage(io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(features_);
              features_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_sendgrid_SendgridSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_sendgrid_SendgridSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.class, io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 10;
  private io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features_;
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
   */
  public boolean hasFeatures() {
    return features_ != null;
  }
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
   */
  public io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures getFeatures() {
    return features_ == null ? io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.getDefaultInstance() : features_;
  }
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
   */
  public io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeaturesOrBuilder getFeaturesOrBuilder() {
    return getFeatures();
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
    if (features_ != null) {
      output.writeMessage(10, getFeatures());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (features_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getFeatures());
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
    if (!(obj instanceof io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings other = (io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings) obj;

    boolean result = true;
    result = result && (hasFeatures() == other.hasFeatures());
    if (hasFeatures()) {
      result = result && getFeatures()
          .equals(other.getFeatures());
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
    if (hasFeatures()) {
      hash = (37 * hash) + FEATURES_FIELD_NUMBER;
      hash = (53 * hash) + getFeatures().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings prototype) {
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
   * Specifies Sendgrid settings for integration with Bloombox.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.integrations.sendgrid.SendgridSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.integrations.sendgrid.SendgridSettings)
      io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_sendgrid_SendgridSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_sendgrid_SendgridSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.class, io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.newBuilder()
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
      if (featuresBuilder_ == null) {
        features_ = null;
      } else {
        features_ = null;
        featuresBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_sendgrid_SendgridSettings_descriptor;
    }

    public io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings build() {
      io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings buildPartial() {
      io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings result = new io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings(this);
      if (featuresBuilder_ == null) {
        result.features_ = features_;
      } else {
        result.features_ = featuresBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings) {
        return mergeFrom((io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings other) {
      if (other == io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings.getDefaultInstance()) return this;
      if (other.hasFeatures()) {
        mergeFeatures(other.getFeatures());
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
      io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeaturesOrBuilder> featuresBuilder_;
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public boolean hasFeatures() {
      return featuresBuilder_ != null || features_ != null;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures getFeatures() {
      if (featuresBuilder_ == null) {
        return features_ == null ? io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.getDefaultInstance() : features_;
      } else {
        return featuresBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public Builder setFeatures(io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures value) {
      if (featuresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        features_ = value;
        onChanged();
      } else {
        featuresBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public Builder setFeatures(
        io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder builderForValue) {
      if (featuresBuilder_ == null) {
        features_ = builderForValue.build();
        onChanged();
      } else {
        featuresBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public Builder mergeFeatures(io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures value) {
      if (featuresBuilder_ == null) {
        if (features_ != null) {
          features_ =
            io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.newBuilder(features_).mergeFrom(value).buildPartial();
        } else {
          features_ = value;
        }
        onChanged();
      } else {
        featuresBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public Builder clearFeatures() {
      if (featuresBuilder_ == null) {
        features_ = null;
        onChanged();
      } else {
        features_ = null;
        featuresBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder getFeaturesBuilder() {
      
      onChanged();
      return getFeaturesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeaturesOrBuilder getFeaturesOrBuilder() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilder();
      } else {
        return features_ == null ?
            io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.getDefaultInstance() : features_;
      }
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures features = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeaturesOrBuilder> 
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.sendgrid.SendgridIntegrationFeaturesOrBuilder>(
                getFeatures(),
                getParentForChildren(),
                isClean());
        features_ = null;
      }
      return featuresBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.integrations.sendgrid.SendgridSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.integrations.sendgrid.SendgridSettings)
  private static final io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings();
  }

  public static io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendgridSettings>
      PARSER = new com.google.protobuf.AbstractParser<SendgridSettings>() {
    public SendgridSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendgridSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendgridSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendgridSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.integrations.sendgrid.SendgridSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

