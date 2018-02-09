// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/integrations/GreenbitsSettings.proto

package io.bloombox.schema.partner.integrations.greenbits;

/**
 * <pre>
 * Specifies settings related to Greenbits integration with Bloombox.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.integrations.greenbits.GreenbitsSettings}
 */
public  final class GreenbitsSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)
    GreenbitsSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GreenbitsSettings.newBuilder() to construct.
  private GreenbitsSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GreenbitsSettings() {
    organization_ = "";
    apiKey_ = "";
    authToken_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GreenbitsSettings(
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

            organization_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            apiKey_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            authToken_ = s;
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
    return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.class, io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.Builder.class);
  }

  public static final int ORGANIZATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object organization_;
  /**
   * <pre>
   * Organization account ID in Greenbits.
   * </pre>
   *
   * <code>string organization = 1;</code>
   */
  public java.lang.String getOrganization() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      organization_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Organization account ID in Greenbits.
   * </pre>
   *
   * <code>string organization = 1;</code>
   */
  public com.google.protobuf.ByteString
      getOrganizationBytes() {
    java.lang.Object ref = organization_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      organization_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object apiKey_;
  /**
   * <pre>
   * Greenbits API key, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string api_key = 2;</code>
   */
  public java.lang.String getApiKey() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      apiKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Greenbits API key, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string api_key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getApiKeyBytes() {
    java.lang.Object ref = apiKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      apiKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTH_TOKEN_FIELD_NUMBER = 3;
  private volatile java.lang.Object authToken_;
  /**
   * <pre>
   * Greenbits Auth token to use, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string auth_token = 3;</code>
   */
  public java.lang.String getAuthToken() {
    java.lang.Object ref = authToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      authToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Greenbits Auth token to use, available in the Greenbits dashboard.
   * </pre>
   *
   * <code>string auth_token = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAuthTokenBytes() {
    java.lang.Object ref = authToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      authToken_ = b;
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
    if (!getOrganizationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, organization_);
    }
    if (!getApiKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, apiKey_);
    }
    if (!getAuthTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, authToken_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getOrganizationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, organization_);
    }
    if (!getApiKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, apiKey_);
    }
    if (!getAuthTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, authToken_);
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
    if (!(obj instanceof io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings other = (io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings) obj;

    boolean result = true;
    result = result && getOrganization()
        .equals(other.getOrganization());
    result = result && getApiKey()
        .equals(other.getApiKey());
    result = result && getAuthToken()
        .equals(other.getAuthToken());
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
    hash = (37 * hash) + ORGANIZATION_FIELD_NUMBER;
    hash = (53 * hash) + getOrganization().hashCode();
    hash = (37 * hash) + API_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getApiKey().hashCode();
    hash = (37 * hash) + AUTH_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getAuthToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings prototype) {
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
   * Specifies settings related to Greenbits integration with Bloombox.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.integrations.greenbits.GreenbitsSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)
      io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.class, io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.newBuilder()
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
      organization_ = "";

      apiKey_ = "";

      authToken_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_greenbits_GreenbitsSettings_descriptor;
    }

    public io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings build() {
      io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings buildPartial() {
      io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings result = new io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings(this);
      result.organization_ = organization_;
      result.apiKey_ = apiKey_;
      result.authToken_ = authToken_;
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
      if (other instanceof io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings) {
        return mergeFrom((io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings other) {
      if (other == io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings.getDefaultInstance()) return this;
      if (!other.getOrganization().isEmpty()) {
        organization_ = other.organization_;
        onChanged();
      }
      if (!other.getApiKey().isEmpty()) {
        apiKey_ = other.apiKey_;
        onChanged();
      }
      if (!other.getAuthToken().isEmpty()) {
        authToken_ = other.authToken_;
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
      io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object organization_ = "";
    /**
     * <pre>
     * Organization account ID in Greenbits.
     * </pre>
     *
     * <code>string organization = 1;</code>
     */
    public java.lang.String getOrganization() {
      java.lang.Object ref = organization_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        organization_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Organization account ID in Greenbits.
     * </pre>
     *
     * <code>string organization = 1;</code>
     */
    public com.google.protobuf.ByteString
        getOrganizationBytes() {
      java.lang.Object ref = organization_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        organization_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Organization account ID in Greenbits.
     * </pre>
     *
     * <code>string organization = 1;</code>
     */
    public Builder setOrganization(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      organization_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization account ID in Greenbits.
     * </pre>
     *
     * <code>string organization = 1;</code>
     */
    public Builder clearOrganization() {
      
      organization_ = getDefaultInstance().getOrganization();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Organization account ID in Greenbits.
     * </pre>
     *
     * <code>string organization = 1;</code>
     */
    public Builder setOrganizationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      organization_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object apiKey_ = "";
    /**
     * <pre>
     * Greenbits API key, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string api_key = 2;</code>
     */
    public java.lang.String getApiKey() {
      java.lang.Object ref = apiKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        apiKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Greenbits API key, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string api_key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getApiKeyBytes() {
      java.lang.Object ref = apiKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        apiKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Greenbits API key, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string api_key = 2;</code>
     */
    public Builder setApiKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      apiKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenbits API key, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string api_key = 2;</code>
     */
    public Builder clearApiKey() {
      
      apiKey_ = getDefaultInstance().getApiKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenbits API key, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string api_key = 2;</code>
     */
    public Builder setApiKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      apiKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object authToken_ = "";
    /**
     * <pre>
     * Greenbits Auth token to use, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string auth_token = 3;</code>
     */
    public java.lang.String getAuthToken() {
      java.lang.Object ref = authToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        authToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Greenbits Auth token to use, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string auth_token = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAuthTokenBytes() {
      java.lang.Object ref = authToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        authToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Greenbits Auth token to use, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string auth_token = 3;</code>
     */
    public Builder setAuthToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenbits Auth token to use, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string auth_token = 3;</code>
     */
    public Builder clearAuthToken() {
      
      authToken_ = getDefaultInstance().getAuthToken();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenbits Auth token to use, available in the Greenbits dashboard.
     * </pre>
     *
     * <code>string auth_token = 3;</code>
     */
    public Builder setAuthTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.integrations.greenbits.GreenbitsSettings)
  private static final io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings();
  }

  public static io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GreenbitsSettings>
      PARSER = new com.google.protobuf.AbstractParser<GreenbitsSettings>() {
    public GreenbitsSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GreenbitsSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GreenbitsSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GreenbitsSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.integrations.greenbits.GreenbitsSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

