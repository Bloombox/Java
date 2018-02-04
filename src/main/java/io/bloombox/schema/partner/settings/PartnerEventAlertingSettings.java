// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerSettings.proto

package io.bloombox.schema.partner.settings;

/**
 * <pre>
 * Specifies event-level alerting settings.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.PartnerEventAlertingSettings}
 */
public  final class PartnerEventAlertingSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.PartnerEventAlertingSettings)
    PartnerEventAlertingSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartnerEventAlertingSettings.newBuilder() to construct.
  private PartnerEventAlertingSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartnerEventAlertingSettings() {
    promo_ = false;
    security_ = false;
    volume_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartnerEventAlertingSettings(
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

            promo_ = input.readBool();
            break;
          }
          case 16: {

            security_ = input.readBool();
            break;
          }
          case 24: {

            volume_ = input.readBool();
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
    return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.class, io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.Builder.class);
  }

  public static final int PROMO_FIELD_NUMBER = 1;
  private boolean promo_;
  /**
   * <pre>
   * Specifies 'promo' notifications.
   * </pre>
   *
   * <code>bool promo = 1;</code>
   */
  public boolean getPromo() {
    return promo_;
  }

  public static final int SECURITY_FIELD_NUMBER = 2;
  private boolean security_;
  /**
   * <pre>
   * Specifies 'security' notifications.
   * </pre>
   *
   * <code>bool security = 2;</code>
   */
  public boolean getSecurity() {
    return security_;
  }

  public static final int VOLUME_FIELD_NUMBER = 3;
  private boolean volume_;
  /**
   * <pre>
   * Specifies 'volume' notifications.
   * </pre>
   *
   * <code>bool volume = 3;</code>
   */
  public boolean getVolume() {
    return volume_;
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
    if (promo_ != false) {
      output.writeBool(1, promo_);
    }
    if (security_ != false) {
      output.writeBool(2, security_);
    }
    if (volume_ != false) {
      output.writeBool(3, volume_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (promo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, promo_);
    }
    if (security_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, security_);
    }
    if (volume_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, volume_);
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.PartnerEventAlertingSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.PartnerEventAlertingSettings other = (io.bloombox.schema.partner.settings.PartnerEventAlertingSettings) obj;

    boolean result = true;
    result = result && (getPromo()
        == other.getPromo());
    result = result && (getSecurity()
        == other.getSecurity());
    result = result && (getVolume()
        == other.getVolume());
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
    hash = (37 * hash) + PROMO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPromo());
    hash = (37 * hash) + SECURITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSecurity());
    hash = (37 * hash) + VOLUME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getVolume());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.PartnerEventAlertingSettings prototype) {
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
   * Specifies event-level alerting settings.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.PartnerEventAlertingSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.PartnerEventAlertingSettings)
      io.bloombox.schema.partner.settings.PartnerEventAlertingSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.class, io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.newBuilder()
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
      promo_ = false;

      security_ = false;

      volume_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_PartnerEventAlertingSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.PartnerEventAlertingSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.PartnerEventAlertingSettings build() {
      io.bloombox.schema.partner.settings.PartnerEventAlertingSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.PartnerEventAlertingSettings buildPartial() {
      io.bloombox.schema.partner.settings.PartnerEventAlertingSettings result = new io.bloombox.schema.partner.settings.PartnerEventAlertingSettings(this);
      result.promo_ = promo_;
      result.security_ = security_;
      result.volume_ = volume_;
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
      if (other instanceof io.bloombox.schema.partner.settings.PartnerEventAlertingSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.PartnerEventAlertingSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.PartnerEventAlertingSettings other) {
      if (other == io.bloombox.schema.partner.settings.PartnerEventAlertingSettings.getDefaultInstance()) return this;
      if (other.getPromo() != false) {
        setPromo(other.getPromo());
      }
      if (other.getSecurity() != false) {
        setSecurity(other.getSecurity());
      }
      if (other.getVolume() != false) {
        setVolume(other.getVolume());
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
      io.bloombox.schema.partner.settings.PartnerEventAlertingSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.PartnerEventAlertingSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean promo_ ;
    /**
     * <pre>
     * Specifies 'promo' notifications.
     * </pre>
     *
     * <code>bool promo = 1;</code>
     */
    public boolean getPromo() {
      return promo_;
    }
    /**
     * <pre>
     * Specifies 'promo' notifications.
     * </pre>
     *
     * <code>bool promo = 1;</code>
     */
    public Builder setPromo(boolean value) {
      
      promo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies 'promo' notifications.
     * </pre>
     *
     * <code>bool promo = 1;</code>
     */
    public Builder clearPromo() {
      
      promo_ = false;
      onChanged();
      return this;
    }

    private boolean security_ ;
    /**
     * <pre>
     * Specifies 'security' notifications.
     * </pre>
     *
     * <code>bool security = 2;</code>
     */
    public boolean getSecurity() {
      return security_;
    }
    /**
     * <pre>
     * Specifies 'security' notifications.
     * </pre>
     *
     * <code>bool security = 2;</code>
     */
    public Builder setSecurity(boolean value) {
      
      security_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies 'security' notifications.
     * </pre>
     *
     * <code>bool security = 2;</code>
     */
    public Builder clearSecurity() {
      
      security_ = false;
      onChanged();
      return this;
    }

    private boolean volume_ ;
    /**
     * <pre>
     * Specifies 'volume' notifications.
     * </pre>
     *
     * <code>bool volume = 3;</code>
     */
    public boolean getVolume() {
      return volume_;
    }
    /**
     * <pre>
     * Specifies 'volume' notifications.
     * </pre>
     *
     * <code>bool volume = 3;</code>
     */
    public Builder setVolume(boolean value) {
      
      volume_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies 'volume' notifications.
     * </pre>
     *
     * <code>bool volume = 3;</code>
     */
    public Builder clearVolume() {
      
      volume_ = false;
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.PartnerEventAlertingSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.PartnerEventAlertingSettings)
  private static final io.bloombox.schema.partner.settings.PartnerEventAlertingSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.PartnerEventAlertingSettings();
  }

  public static io.bloombox.schema.partner.settings.PartnerEventAlertingSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartnerEventAlertingSettings>
      PARSER = new com.google.protobuf.AbstractParser<PartnerEventAlertingSettings>() {
    public PartnerEventAlertingSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartnerEventAlertingSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartnerEventAlertingSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartnerEventAlertingSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.PartnerEventAlertingSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

