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
// source: partner/integrations/TwilioSettings.proto

package io.bloombox.schema.partner.integrations.twilio;

/**
 * <pre>
 * Specifies Twilio settings for integration with Bloombox.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.integrations.twilio.TwilioSettings}
 */
public  final class TwilioSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.integrations.twilio.TwilioSettings)
    TwilioSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TwilioSettings.newBuilder() to construct.
  private TwilioSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TwilioSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TwilioSettings(
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
            io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder subBuilder = null;
            if (features_ != null) {
              subBuilder = features_.toBuilder();
            }
            features_ = input.readMessage(io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.parser(), extensionRegistry);
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
    return io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_twilio_TwilioSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_twilio_TwilioSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.integrations.twilio.TwilioSettings.class, io.bloombox.schema.partner.integrations.twilio.TwilioSettings.Builder.class);
  }

  public static final int FEATURES_FIELD_NUMBER = 10;
  private io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features_;
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
   */
  public boolean hasFeatures() {
    return features_ != null;
  }
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
   */
  public io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures getFeatures() {
    return features_ == null ? io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.getDefaultInstance() : features_;
  }
  /**
   * <pre>
   * Flags indicating features that should be enabled or disabled.
   * </pre>
   *
   * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
   */
  public io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeaturesOrBuilder getFeaturesOrBuilder() {
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
    if (!(obj instanceof io.bloombox.schema.partner.integrations.twilio.TwilioSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.integrations.twilio.TwilioSettings other = (io.bloombox.schema.partner.integrations.twilio.TwilioSettings) obj;

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

  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.integrations.twilio.TwilioSettings prototype) {
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
   * Specifies Twilio settings for integration with Bloombox.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.integrations.twilio.TwilioSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.integrations.twilio.TwilioSettings)
      io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_twilio_TwilioSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_twilio_TwilioSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.integrations.twilio.TwilioSettings.class, io.bloombox.schema.partner.integrations.twilio.TwilioSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.integrations.twilio.TwilioSettings.newBuilder()
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
      return io.bloombox.schema.partner.integrations.twilio.TwilioSettingsOuterClass.internal_static_bloombox_schema_partner_integrations_twilio_TwilioSettings_descriptor;
    }

    public io.bloombox.schema.partner.integrations.twilio.TwilioSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.integrations.twilio.TwilioSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.integrations.twilio.TwilioSettings build() {
      io.bloombox.schema.partner.integrations.twilio.TwilioSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.integrations.twilio.TwilioSettings buildPartial() {
      io.bloombox.schema.partner.integrations.twilio.TwilioSettings result = new io.bloombox.schema.partner.integrations.twilio.TwilioSettings(this);
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
      if (other instanceof io.bloombox.schema.partner.integrations.twilio.TwilioSettings) {
        return mergeFrom((io.bloombox.schema.partner.integrations.twilio.TwilioSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.integrations.twilio.TwilioSettings other) {
      if (other == io.bloombox.schema.partner.integrations.twilio.TwilioSettings.getDefaultInstance()) return this;
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
      io.bloombox.schema.partner.integrations.twilio.TwilioSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.integrations.twilio.TwilioSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeaturesOrBuilder> featuresBuilder_;
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public boolean hasFeatures() {
      return featuresBuilder_ != null || features_ != null;
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures getFeatures() {
      if (featuresBuilder_ == null) {
        return features_ == null ? io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.getDefaultInstance() : features_;
      } else {
        return featuresBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public Builder setFeatures(io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures value) {
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
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public Builder setFeatures(
        io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder builderForValue) {
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
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public Builder mergeFeatures(io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures value) {
      if (featuresBuilder_ == null) {
        if (features_ != null) {
          features_ =
            io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.newBuilder(features_).mergeFrom(value).buildPartial();
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
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
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
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder getFeaturesBuilder() {
      
      onChanged();
      return getFeaturesFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    public io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeaturesOrBuilder getFeaturesOrBuilder() {
      if (featuresBuilder_ != null) {
        return featuresBuilder_.getMessageOrBuilder();
      } else {
        return features_ == null ?
            io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.getDefaultInstance() : features_;
      }
    }
    /**
     * <pre>
     * Flags indicating features that should be enabled or disabled.
     * </pre>
     *
     * <code>.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures features = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeaturesOrBuilder> 
        getFeaturesFieldBuilder() {
      if (featuresBuilder_ == null) {
        featuresBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeatures.Builder, io.bloombox.schema.partner.integrations.twilio.TwilioIntegrationFeaturesOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.integrations.twilio.TwilioSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.integrations.twilio.TwilioSettings)
  private static final io.bloombox.schema.partner.integrations.twilio.TwilioSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.integrations.twilio.TwilioSettings();
  }

  public static io.bloombox.schema.partner.integrations.twilio.TwilioSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TwilioSettings>
      PARSER = new com.google.protobuf.AbstractParser<TwilioSettings>() {
    public TwilioSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TwilioSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TwilioSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TwilioSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.integrations.twilio.TwilioSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

