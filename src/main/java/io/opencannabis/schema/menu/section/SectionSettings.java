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
// source: products/menu/Section.proto

package io.opencannabis.schema.menu.section;

/**
 * <pre>
 * Specifies settings that a menu section may consider.
 * </pre>
 *
 * Protobuf type {@code opencannabis.products.menu.section.SectionSettings}
 */
public  final class SectionSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.products.menu.section.SectionSettings)
    SectionSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SectionSettings.newBuilder() to construct.
  private SectionSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SectionSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SectionSettings(
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
            io.opencannabis.schema.content.Name.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(io.opencannabis.schema.content.Name.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.menu.section.SectionMedia.Builder subBuilder = null;
            if (media_ != null) {
              subBuilder = media_.toBuilder();
            }
            media_ = input.readMessage(io.opencannabis.schema.menu.section.SectionMedia.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(media_);
              media_ = subBuilder.buildPartial();
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
    return io.opencannabis.schema.menu.section.SectionOuterClass.internal_static_opencannabis_products_menu_section_SectionSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.menu.section.SectionOuterClass.internal_static_opencannabis_products_menu_section_SectionSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.menu.section.SectionSettings.class, io.opencannabis.schema.menu.section.SectionSettings.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private io.opencannabis.schema.content.Name name_;
  /**
   * <pre>
   * Presentable name for this section.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * Presentable name for this section.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1;</code>
   */
  public io.opencannabis.schema.content.Name getName() {
    return name_ == null ? io.opencannabis.schema.content.Name.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * Presentable name for this section.
   * </pre>
   *
   * <code>.opencannabis.content.Name name = 1;</code>
   */
  public io.opencannabis.schema.content.NameOrBuilder getNameOrBuilder() {
    return getName();
  }

  public static final int MEDIA_FIELD_NUMBER = 2;
  private io.opencannabis.schema.menu.section.SectionMedia media_;
  /**
   * <pre>
   * Media to use when presenting this section.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
   */
  public boolean hasMedia() {
    return media_ != null;
  }
  /**
   * <pre>
   * Media to use when presenting this section.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
   */
  public io.opencannabis.schema.menu.section.SectionMedia getMedia() {
    return media_ == null ? io.opencannabis.schema.menu.section.SectionMedia.getDefaultInstance() : media_;
  }
  /**
   * <pre>
   * Media to use when presenting this section.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
   */
  public io.opencannabis.schema.menu.section.SectionMediaOrBuilder getMediaOrBuilder() {
    return getMedia();
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
    if (name_ != null) {
      output.writeMessage(1, getName());
    }
    if (media_ != null) {
      output.writeMessage(2, getMedia());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getName());
    }
    if (media_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMedia());
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
    if (!(obj instanceof io.opencannabis.schema.menu.section.SectionSettings)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.menu.section.SectionSettings other = (io.opencannabis.schema.menu.section.SectionSettings) obj;

    boolean result = true;
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
    }
    result = result && (hasMedia() == other.hasMedia());
    if (hasMedia()) {
      result = result && getMedia()
          .equals(other.getMedia());
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
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    if (hasMedia()) {
      hash = (37 * hash) + MEDIA_FIELD_NUMBER;
      hash = (53 * hash) + getMedia().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.section.SectionSettings parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.menu.section.SectionSettings prototype) {
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
   * Specifies settings that a menu section may consider.
   * </pre>
   *
   * Protobuf type {@code opencannabis.products.menu.section.SectionSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.products.menu.section.SectionSettings)
      io.opencannabis.schema.menu.section.SectionSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.menu.section.SectionOuterClass.internal_static_opencannabis_products_menu_section_SectionSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.menu.section.SectionOuterClass.internal_static_opencannabis_products_menu_section_SectionSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.menu.section.SectionSettings.class, io.opencannabis.schema.menu.section.SectionSettings.Builder.class);
    }

    // Construct using io.opencannabis.schema.menu.section.SectionSettings.newBuilder()
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
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      if (mediaBuilder_ == null) {
        media_ = null;
      } else {
        media_ = null;
        mediaBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.menu.section.SectionOuterClass.internal_static_opencannabis_products_menu_section_SectionSettings_descriptor;
    }

    public io.opencannabis.schema.menu.section.SectionSettings getDefaultInstanceForType() {
      return io.opencannabis.schema.menu.section.SectionSettings.getDefaultInstance();
    }

    public io.opencannabis.schema.menu.section.SectionSettings build() {
      io.opencannabis.schema.menu.section.SectionSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.menu.section.SectionSettings buildPartial() {
      io.opencannabis.schema.menu.section.SectionSettings result = new io.opencannabis.schema.menu.section.SectionSettings(this);
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
      if (mediaBuilder_ == null) {
        result.media_ = media_;
      } else {
        result.media_ = mediaBuilder_.build();
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
      if (other instanceof io.opencannabis.schema.menu.section.SectionSettings) {
        return mergeFrom((io.opencannabis.schema.menu.section.SectionSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.menu.section.SectionSettings other) {
      if (other == io.opencannabis.schema.menu.section.SectionSettings.getDefaultInstance()) return this;
      if (other.hasName()) {
        mergeName(other.getName());
      }
      if (other.hasMedia()) {
        mergeMedia(other.getMedia());
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
      io.opencannabis.schema.menu.section.SectionSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.menu.section.SectionSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.content.Name name_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.content.Name, io.opencannabis.schema.content.Name.Builder, io.opencannabis.schema.content.NameOrBuilder> nameBuilder_;
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public io.opencannabis.schema.content.Name getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? io.opencannabis.schema.content.Name.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public Builder setName(io.opencannabis.schema.content.Name value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public Builder setName(
        io.opencannabis.schema.content.Name.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public Builder mergeName(io.opencannabis.schema.content.Name value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            io.opencannabis.schema.content.Name.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public io.opencannabis.schema.content.Name.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    public io.opencannabis.schema.content.NameOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            io.opencannabis.schema.content.Name.getDefaultInstance() : name_;
      }
    }
    /**
     * <pre>
     * Presentable name for this section.
     * </pre>
     *
     * <code>.opencannabis.content.Name name = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.content.Name, io.opencannabis.schema.content.Name.Builder, io.opencannabis.schema.content.NameOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.content.Name, io.opencannabis.schema.content.Name.Builder, io.opencannabis.schema.content.NameOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }

    private io.opencannabis.schema.menu.section.SectionMedia media_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.section.SectionMedia, io.opencannabis.schema.menu.section.SectionMedia.Builder, io.opencannabis.schema.menu.section.SectionMediaOrBuilder> mediaBuilder_;
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public boolean hasMedia() {
      return mediaBuilder_ != null || media_ != null;
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionMedia getMedia() {
      if (mediaBuilder_ == null) {
        return media_ == null ? io.opencannabis.schema.menu.section.SectionMedia.getDefaultInstance() : media_;
      } else {
        return mediaBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public Builder setMedia(io.opencannabis.schema.menu.section.SectionMedia value) {
      if (mediaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        media_ = value;
        onChanged();
      } else {
        mediaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public Builder setMedia(
        io.opencannabis.schema.menu.section.SectionMedia.Builder builderForValue) {
      if (mediaBuilder_ == null) {
        media_ = builderForValue.build();
        onChanged();
      } else {
        mediaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public Builder mergeMedia(io.opencannabis.schema.menu.section.SectionMedia value) {
      if (mediaBuilder_ == null) {
        if (media_ != null) {
          media_ =
            io.opencannabis.schema.menu.section.SectionMedia.newBuilder(media_).mergeFrom(value).buildPartial();
        } else {
          media_ = value;
        }
        onChanged();
      } else {
        mediaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public Builder clearMedia() {
      if (mediaBuilder_ == null) {
        media_ = null;
        onChanged();
      } else {
        media_ = null;
        mediaBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionMedia.Builder getMediaBuilder() {
      
      onChanged();
      return getMediaFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionMediaOrBuilder getMediaOrBuilder() {
      if (mediaBuilder_ != null) {
        return mediaBuilder_.getMessageOrBuilder();
      } else {
        return media_ == null ?
            io.opencannabis.schema.menu.section.SectionMedia.getDefaultInstance() : media_;
      }
    }
    /**
     * <pre>
     * Media to use when presenting this section.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionMedia media = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.section.SectionMedia, io.opencannabis.schema.menu.section.SectionMedia.Builder, io.opencannabis.schema.menu.section.SectionMediaOrBuilder> 
        getMediaFieldBuilder() {
      if (mediaBuilder_ == null) {
        mediaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.menu.section.SectionMedia, io.opencannabis.schema.menu.section.SectionMedia.Builder, io.opencannabis.schema.menu.section.SectionMediaOrBuilder>(
                getMedia(),
                getParentForChildren(),
                isClean());
        media_ = null;
      }
      return mediaBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.products.menu.section.SectionSettings)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.products.menu.section.SectionSettings)
  private static final io.opencannabis.schema.menu.section.SectionSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.menu.section.SectionSettings();
  }

  public static io.opencannabis.schema.menu.section.SectionSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SectionSettings>
      PARSER = new com.google.protobuf.AbstractParser<SectionSettings>() {
    public SectionSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SectionSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SectionSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SectionSettings> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.menu.section.SectionSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

