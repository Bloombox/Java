/*
 * Copyright 2018, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/settings/PartnerSettings.proto

package io.bloombox.schema.partner.settings;

/**
 * <pre>
 * Beta and sandbox settings.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.BetaSettings}
 */
public  final class BetaSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.BetaSettings)
    BetaSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BetaSettings.newBuilder() to construct.
  private BetaSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BetaSettings() {
    enable_ = false;
    sandbox_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BetaSettings(
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

            enable_ = input.readBool();
            break;
          }
          case 16: {

            sandbox_ = input.readBool();
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
    return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_BetaSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.BetaSettings.class, io.bloombox.schema.partner.settings.BetaSettings.Builder.class);
  }

  public static final int ENABLE_FIELD_NUMBER = 1;
  private boolean enable_;
  /**
   * <pre>
   * Enable access to beta systems for this partner.
   * </pre>
   *
   * <code>bool enable = 1;</code>
   */
  public boolean getEnable() {
    return enable_;
  }

  public static final int SANDBOX_FIELD_NUMBER = 2;
  private boolean sandbox_;
  /**
   * <pre>
   * Enable access to sandbox resources and systems for this partner.
   * </pre>
   *
   * <code>bool sandbox = 2;</code>
   */
  public boolean getSandbox() {
    return sandbox_;
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
    if (enable_ != false) {
      output.writeBool(1, enable_);
    }
    if (sandbox_ != false) {
      output.writeBool(2, sandbox_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enable_);
    }
    if (sandbox_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, sandbox_);
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.BetaSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.BetaSettings other = (io.bloombox.schema.partner.settings.BetaSettings) obj;

    boolean result = true;
    result = result && (getEnable()
        == other.getEnable());
    result = result && (getSandbox()
        == other.getSandbox());
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
    hash = (37 * hash) + ENABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnable());
    hash = (37 * hash) + SANDBOX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSandbox());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.BetaSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.BetaSettings prototype) {
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
   * Beta and sandbox settings.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.BetaSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.BetaSettings)
      io.bloombox.schema.partner.settings.BetaSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_BetaSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.BetaSettings.class, io.bloombox.schema.partner.settings.BetaSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.BetaSettings.newBuilder()
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
      enable_ = false;

      sandbox_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerSettingsOuterClass.internal_static_bloombox_schema_partner_settings_BetaSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.BetaSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.BetaSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.BetaSettings build() {
      io.bloombox.schema.partner.settings.BetaSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.BetaSettings buildPartial() {
      io.bloombox.schema.partner.settings.BetaSettings result = new io.bloombox.schema.partner.settings.BetaSettings(this);
      result.enable_ = enable_;
      result.sandbox_ = sandbox_;
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
      if (other instanceof io.bloombox.schema.partner.settings.BetaSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.BetaSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.BetaSettings other) {
      if (other == io.bloombox.schema.partner.settings.BetaSettings.getDefaultInstance()) return this;
      if (other.getEnable() != false) {
        setEnable(other.getEnable());
      }
      if (other.getSandbox() != false) {
        setSandbox(other.getSandbox());
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
      io.bloombox.schema.partner.settings.BetaSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.BetaSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enable_ ;
    /**
     * <pre>
     * Enable access to beta systems for this partner.
     * </pre>
     *
     * <code>bool enable = 1;</code>
     */
    public boolean getEnable() {
      return enable_;
    }
    /**
     * <pre>
     * Enable access to beta systems for this partner.
     * </pre>
     *
     * <code>bool enable = 1;</code>
     */
    public Builder setEnable(boolean value) {
      
      enable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable access to beta systems for this partner.
     * </pre>
     *
     * <code>bool enable = 1;</code>
     */
    public Builder clearEnable() {
      
      enable_ = false;
      onChanged();
      return this;
    }

    private boolean sandbox_ ;
    /**
     * <pre>
     * Enable access to sandbox resources and systems for this partner.
     * </pre>
     *
     * <code>bool sandbox = 2;</code>
     */
    public boolean getSandbox() {
      return sandbox_;
    }
    /**
     * <pre>
     * Enable access to sandbox resources and systems for this partner.
     * </pre>
     *
     * <code>bool sandbox = 2;</code>
     */
    public Builder setSandbox(boolean value) {
      
      sandbox_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Enable access to sandbox resources and systems for this partner.
     * </pre>
     *
     * <code>bool sandbox = 2;</code>
     */
    public Builder clearSandbox() {
      
      sandbox_ = false;
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.BetaSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.BetaSettings)
  private static final io.bloombox.schema.partner.settings.BetaSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.BetaSettings();
  }

  public static io.bloombox.schema.partner.settings.BetaSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BetaSettings>
      PARSER = new com.google.protobuf.AbstractParser<BetaSettings>() {
    public BetaSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BetaSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BetaSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BetaSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.BetaSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

