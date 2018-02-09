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
// source: partner/settings/PartnerLocationSettings.proto

package io.bloombox.schema.partner.settings;

/**
 * <pre>
 * Specifies settings for television display units on a per-location basis.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.TVSettings}
 */
public  final class TVSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.TVSettings)
    TVSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TVSettings.newBuilder() to construct.
  private TVSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TVSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TVSettings(
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
            io.bloombox.schema.partner.settings.TVBannerSettings.Builder subBuilder = null;
            if (banner_ != null) {
              subBuilder = banner_.toBuilder();
            }
            banner_ = input.readMessage(io.bloombox.schema.partner.settings.TVBannerSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(banner_);
              banner_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.bloombox.schema.partner.settings.TVMenuSettings.Builder subBuilder = null;
            if (settings_ != null) {
              subBuilder = settings_.toBuilder();
            }
            settings_ = input.readMessage(io.bloombox.schema.partner.settings.TVMenuSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(settings_);
              settings_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TVSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TVSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.TVSettings.class, io.bloombox.schema.partner.settings.TVSettings.Builder.class);
  }

  public static final int BANNER_FIELD_NUMBER = 1;
  private io.bloombox.schema.partner.settings.TVBannerSettings banner_;
  /**
   * <pre>
   * Settings for the TV's top banner.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
   */
  public boolean hasBanner() {
    return banner_ != null;
  }
  /**
   * <pre>
   * Settings for the TV's top banner.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
   */
  public io.bloombox.schema.partner.settings.TVBannerSettings getBanner() {
    return banner_ == null ? io.bloombox.schema.partner.settings.TVBannerSettings.getDefaultInstance() : banner_;
  }
  /**
   * <pre>
   * Settings for the TV's top banner.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
   */
  public io.bloombox.schema.partner.settings.TVBannerSettingsOrBuilder getBannerOrBuilder() {
    return getBanner();
  }

  public static final int SETTINGS_FIELD_NUMBER = 2;
  private io.bloombox.schema.partner.settings.TVMenuSettings settings_;
  /**
   * <pre>
   * Menu-specific settings for TVs.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
   */
  public boolean hasSettings() {
    return settings_ != null;
  }
  /**
   * <pre>
   * Menu-specific settings for TVs.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
   */
  public io.bloombox.schema.partner.settings.TVMenuSettings getSettings() {
    return settings_ == null ? io.bloombox.schema.partner.settings.TVMenuSettings.getDefaultInstance() : settings_;
  }
  /**
   * <pre>
   * Menu-specific settings for TVs.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
   */
  public io.bloombox.schema.partner.settings.TVMenuSettingsOrBuilder getSettingsOrBuilder() {
    return getSettings();
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
    if (banner_ != null) {
      output.writeMessage(1, getBanner());
    }
    if (settings_ != null) {
      output.writeMessage(2, getSettings());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (banner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBanner());
    }
    if (settings_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSettings());
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.TVSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.TVSettings other = (io.bloombox.schema.partner.settings.TVSettings) obj;

    boolean result = true;
    result = result && (hasBanner() == other.hasBanner());
    if (hasBanner()) {
      result = result && getBanner()
          .equals(other.getBanner());
    }
    result = result && (hasSettings() == other.hasSettings());
    if (hasSettings()) {
      result = result && getSettings()
          .equals(other.getSettings());
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
    if (hasBanner()) {
      hash = (37 * hash) + BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getBanner().hashCode();
    }
    if (hasSettings()) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettings().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TVSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.TVSettings prototype) {
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
   * Specifies settings for television display units on a per-location basis.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.TVSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.TVSettings)
      io.bloombox.schema.partner.settings.TVSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TVSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TVSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.TVSettings.class, io.bloombox.schema.partner.settings.TVSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.TVSettings.newBuilder()
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
      if (bannerBuilder_ == null) {
        banner_ = null;
      } else {
        banner_ = null;
        bannerBuilder_ = null;
      }
      if (settingsBuilder_ == null) {
        settings_ = null;
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TVSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.TVSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.TVSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.TVSettings build() {
      io.bloombox.schema.partner.settings.TVSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.TVSettings buildPartial() {
      io.bloombox.schema.partner.settings.TVSettings result = new io.bloombox.schema.partner.settings.TVSettings(this);
      if (bannerBuilder_ == null) {
        result.banner_ = banner_;
      } else {
        result.banner_ = bannerBuilder_.build();
      }
      if (settingsBuilder_ == null) {
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.settings.TVSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.TVSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.TVSettings other) {
      if (other == io.bloombox.schema.partner.settings.TVSettings.getDefaultInstance()) return this;
      if (other.hasBanner()) {
        mergeBanner(other.getBanner());
      }
      if (other.hasSettings()) {
        mergeSettings(other.getSettings());
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
      io.bloombox.schema.partner.settings.TVSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.TVSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.settings.TVBannerSettings banner_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.TVBannerSettings, io.bloombox.schema.partner.settings.TVBannerSettings.Builder, io.bloombox.schema.partner.settings.TVBannerSettingsOrBuilder> bannerBuilder_;
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public boolean hasBanner() {
      return bannerBuilder_ != null || banner_ != null;
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public io.bloombox.schema.partner.settings.TVBannerSettings getBanner() {
      if (bannerBuilder_ == null) {
        return banner_ == null ? io.bloombox.schema.partner.settings.TVBannerSettings.getDefaultInstance() : banner_;
      } else {
        return bannerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public Builder setBanner(io.bloombox.schema.partner.settings.TVBannerSettings value) {
      if (bannerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        banner_ = value;
        onChanged();
      } else {
        bannerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public Builder setBanner(
        io.bloombox.schema.partner.settings.TVBannerSettings.Builder builderForValue) {
      if (bannerBuilder_ == null) {
        banner_ = builderForValue.build();
        onChanged();
      } else {
        bannerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public Builder mergeBanner(io.bloombox.schema.partner.settings.TVBannerSettings value) {
      if (bannerBuilder_ == null) {
        if (banner_ != null) {
          banner_ =
            io.bloombox.schema.partner.settings.TVBannerSettings.newBuilder(banner_).mergeFrom(value).buildPartial();
        } else {
          banner_ = value;
        }
        onChanged();
      } else {
        bannerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public Builder clearBanner() {
      if (bannerBuilder_ == null) {
        banner_ = null;
        onChanged();
      } else {
        banner_ = null;
        bannerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public io.bloombox.schema.partner.settings.TVBannerSettings.Builder getBannerBuilder() {
      
      onChanged();
      return getBannerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    public io.bloombox.schema.partner.settings.TVBannerSettingsOrBuilder getBannerOrBuilder() {
      if (bannerBuilder_ != null) {
        return bannerBuilder_.getMessageOrBuilder();
      } else {
        return banner_ == null ?
            io.bloombox.schema.partner.settings.TVBannerSettings.getDefaultInstance() : banner_;
      }
    }
    /**
     * <pre>
     * Settings for the TV's top banner.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVBannerSettings banner = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.TVBannerSettings, io.bloombox.schema.partner.settings.TVBannerSettings.Builder, io.bloombox.schema.partner.settings.TVBannerSettingsOrBuilder> 
        getBannerFieldBuilder() {
      if (bannerBuilder_ == null) {
        bannerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.settings.TVBannerSettings, io.bloombox.schema.partner.settings.TVBannerSettings.Builder, io.bloombox.schema.partner.settings.TVBannerSettingsOrBuilder>(
                getBanner(),
                getParentForChildren(),
                isClean());
        banner_ = null;
      }
      return bannerBuilder_;
    }

    private io.bloombox.schema.partner.settings.TVMenuSettings settings_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.TVMenuSettings, io.bloombox.schema.partner.settings.TVMenuSettings.Builder, io.bloombox.schema.partner.settings.TVMenuSettingsOrBuilder> settingsBuilder_;
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public boolean hasSettings() {
      return settingsBuilder_ != null || settings_ != null;
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public io.bloombox.schema.partner.settings.TVMenuSettings getSettings() {
      if (settingsBuilder_ == null) {
        return settings_ == null ? io.bloombox.schema.partner.settings.TVMenuSettings.getDefaultInstance() : settings_;
      } else {
        return settingsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public Builder setSettings(io.bloombox.schema.partner.settings.TVMenuSettings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        settings_ = value;
        onChanged();
      } else {
        settingsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public Builder setSettings(
        io.bloombox.schema.partner.settings.TVMenuSettings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        settings_ = builderForValue.build();
        onChanged();
      } else {
        settingsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public Builder mergeSettings(io.bloombox.schema.partner.settings.TVMenuSettings value) {
      if (settingsBuilder_ == null) {
        if (settings_ != null) {
          settings_ =
            io.bloombox.schema.partner.settings.TVMenuSettings.newBuilder(settings_).mergeFrom(value).buildPartial();
        } else {
          settings_ = value;
        }
        onChanged();
      } else {
        settingsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = null;
        onChanged();
      } else {
        settings_ = null;
        settingsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public io.bloombox.schema.partner.settings.TVMenuSettings.Builder getSettingsBuilder() {
      
      onChanged();
      return getSettingsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    public io.bloombox.schema.partner.settings.TVMenuSettingsOrBuilder getSettingsOrBuilder() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilder();
      } else {
        return settings_ == null ?
            io.bloombox.schema.partner.settings.TVMenuSettings.getDefaultInstance() : settings_;
      }
    }
    /**
     * <pre>
     * Menu-specific settings for TVs.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.TVMenuSettings settings = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.TVMenuSettings, io.bloombox.schema.partner.settings.TVMenuSettings.Builder, io.bloombox.schema.partner.settings.TVMenuSettingsOrBuilder> 
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.settings.TVMenuSettings, io.bloombox.schema.partner.settings.TVMenuSettings.Builder, io.bloombox.schema.partner.settings.TVMenuSettingsOrBuilder>(
                getSettings(),
                getParentForChildren(),
                isClean());
        settings_ = null;
      }
      return settingsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.TVSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.TVSettings)
  private static final io.bloombox.schema.partner.settings.TVSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.TVSettings();
  }

  public static io.bloombox.schema.partner.settings.TVSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TVSettings>
      PARSER = new com.google.protobuf.AbstractParser<TVSettings>() {
    public TVSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TVSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TVSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TVSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.TVSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

