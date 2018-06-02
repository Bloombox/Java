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
 * Settings related to tablet menus.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.TabletSettings}
 */
public  final class TabletSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.TabletSettings)
    TabletSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TabletSettings.newBuilder() to construct.
  private TabletSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TabletSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TabletSettings(
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
            io.bloombox.schema.partner.settings.CartSettings.Builder subBuilder = null;
            if (cart_ != null) {
              subBuilder = cart_.toBuilder();
            }
            cart_ = input.readMessage(io.bloombox.schema.partner.settings.CartSettings.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cart_);
              cart_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TabletSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TabletSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.TabletSettings.class, io.bloombox.schema.partner.settings.TabletSettings.Builder.class);
  }

  public static final int CART_FIELD_NUMBER = 1;
  private io.bloombox.schema.partner.settings.CartSettings cart_;
  /**
   * <pre>
   * Settings for the tablet menu cart/build-a-bag feature.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
   */
  public boolean hasCart() {
    return cart_ != null;
  }
  /**
   * <pre>
   * Settings for the tablet menu cart/build-a-bag feature.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
   */
  public io.bloombox.schema.partner.settings.CartSettings getCart() {
    return cart_ == null ? io.bloombox.schema.partner.settings.CartSettings.getDefaultInstance() : cart_;
  }
  /**
   * <pre>
   * Settings for the tablet menu cart/build-a-bag feature.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
   */
  public io.bloombox.schema.partner.settings.CartSettingsOrBuilder getCartOrBuilder() {
    return getCart();
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
    if (cart_ != null) {
      output.writeMessage(1, getCart());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cart_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCart());
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.TabletSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.TabletSettings other = (io.bloombox.schema.partner.settings.TabletSettings) obj;

    boolean result = true;
    result = result && (hasCart() == other.hasCart());
    if (hasCart()) {
      result = result && getCart()
          .equals(other.getCart());
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
    if (hasCart()) {
      hash = (37 * hash) + CART_FIELD_NUMBER;
      hash = (53 * hash) + getCart().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.TabletSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.TabletSettings prototype) {
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
   * Settings related to tablet menus.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.TabletSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.TabletSettings)
      io.bloombox.schema.partner.settings.TabletSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TabletSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TabletSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.TabletSettings.class, io.bloombox.schema.partner.settings.TabletSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.TabletSettings.newBuilder()
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
      if (cartBuilder_ == null) {
        cart_ = null;
      } else {
        cart_ = null;
        cartBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_TabletSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.TabletSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.TabletSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.TabletSettings build() {
      io.bloombox.schema.partner.settings.TabletSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.TabletSettings buildPartial() {
      io.bloombox.schema.partner.settings.TabletSettings result = new io.bloombox.schema.partner.settings.TabletSettings(this);
      if (cartBuilder_ == null) {
        result.cart_ = cart_;
      } else {
        result.cart_ = cartBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.settings.TabletSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.TabletSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.TabletSettings other) {
      if (other == io.bloombox.schema.partner.settings.TabletSettings.getDefaultInstance()) return this;
      if (other.hasCart()) {
        mergeCart(other.getCart());
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
      io.bloombox.schema.partner.settings.TabletSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.TabletSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.settings.CartSettings cart_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.CartSettings, io.bloombox.schema.partner.settings.CartSettings.Builder, io.bloombox.schema.partner.settings.CartSettingsOrBuilder> cartBuilder_;
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public boolean hasCart() {
      return cartBuilder_ != null || cart_ != null;
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public io.bloombox.schema.partner.settings.CartSettings getCart() {
      if (cartBuilder_ == null) {
        return cart_ == null ? io.bloombox.schema.partner.settings.CartSettings.getDefaultInstance() : cart_;
      } else {
        return cartBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public Builder setCart(io.bloombox.schema.partner.settings.CartSettings value) {
      if (cartBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cart_ = value;
        onChanged();
      } else {
        cartBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public Builder setCart(
        io.bloombox.schema.partner.settings.CartSettings.Builder builderForValue) {
      if (cartBuilder_ == null) {
        cart_ = builderForValue.build();
        onChanged();
      } else {
        cartBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public Builder mergeCart(io.bloombox.schema.partner.settings.CartSettings value) {
      if (cartBuilder_ == null) {
        if (cart_ != null) {
          cart_ =
            io.bloombox.schema.partner.settings.CartSettings.newBuilder(cart_).mergeFrom(value).buildPartial();
        } else {
          cart_ = value;
        }
        onChanged();
      } else {
        cartBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public Builder clearCart() {
      if (cartBuilder_ == null) {
        cart_ = null;
        onChanged();
      } else {
        cart_ = null;
        cartBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public io.bloombox.schema.partner.settings.CartSettings.Builder getCartBuilder() {
      
      onChanged();
      return getCartFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    public io.bloombox.schema.partner.settings.CartSettingsOrBuilder getCartOrBuilder() {
      if (cartBuilder_ != null) {
        return cartBuilder_.getMessageOrBuilder();
      } else {
        return cart_ == null ?
            io.bloombox.schema.partner.settings.CartSettings.getDefaultInstance() : cart_;
      }
    }
    /**
     * <pre>
     * Settings for the tablet menu cart/build-a-bag feature.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.CartSettings cart = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.CartSettings, io.bloombox.schema.partner.settings.CartSettings.Builder, io.bloombox.schema.partner.settings.CartSettingsOrBuilder> 
        getCartFieldBuilder() {
      if (cartBuilder_ == null) {
        cartBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.settings.CartSettings, io.bloombox.schema.partner.settings.CartSettings.Builder, io.bloombox.schema.partner.settings.CartSettingsOrBuilder>(
                getCart(),
                getParentForChildren(),
                isClean());
        cart_ = null;
      }
      return cartBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.TabletSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.TabletSettings)
  private static final io.bloombox.schema.partner.settings.TabletSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.TabletSettings();
  }

  public static io.bloombox.schema.partner.settings.TabletSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TabletSettings>
      PARSER = new com.google.protobuf.AbstractParser<TabletSettings>() {
    public TabletSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TabletSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TabletSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TabletSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.TabletSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

