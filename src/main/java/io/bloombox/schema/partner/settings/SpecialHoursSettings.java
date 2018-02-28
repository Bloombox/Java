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
 * Specifies 'special' hours, such as holidays or one-off days.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.SpecialHoursSettings}
 */
public  final class SpecialHoursSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.SpecialHoursSettings)
    SpecialHoursSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SpecialHoursSettings.newBuilder() to construct.
  private SpecialHoursSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SpecialHoursSettings() {
    mode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SpecialHoursSettings(
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
            io.bloombox.schema.partner.settings.HoursBoundary.Builder subBuilder = null;
            if (bounds_ != null) {
              subBuilder = bounds_.toBuilder();
            }
            bounds_ = input.readMessage(io.bloombox.schema.partner.settings.HoursBoundary.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(bounds_);
              bounds_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            mode_ = rawValue;
            break;
          }
          case 26: {
            io.opencannabis.schema.temporal.Date.Builder subBuilder = null;
            if (date_ != null) {
              subBuilder = date_.toBuilder();
            }
            date_ = input.readMessage(io.opencannabis.schema.temporal.Date.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(date_);
              date_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_SpecialHoursSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_SpecialHoursSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.SpecialHoursSettings.class, io.bloombox.schema.partner.settings.SpecialHoursSettings.Builder.class);
  }

  public static final int BOUNDS_FIELD_NUMBER = 1;
  private io.bloombox.schema.partner.settings.HoursBoundary bounds_;
  /**
   * <pre>
   * Boundary of this set of hours settings.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
   */
  public boolean hasBounds() {
    return bounds_ != null;
  }
  /**
   * <pre>
   * Boundary of this set of hours settings.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
   */
  public io.bloombox.schema.partner.settings.HoursBoundary getBounds() {
    return bounds_ == null ? io.bloombox.schema.partner.settings.HoursBoundary.getDefaultInstance() : bounds_;
  }
  /**
   * <pre>
   * Boundary of this set of hours settings.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
   */
  public io.bloombox.schema.partner.settings.HoursBoundaryOrBuilder getBoundsOrBuilder() {
    return getBounds();
  }

  public static final int MODE_FIELD_NUMBER = 2;
  private int mode_;
  /**
   * <pre>
   * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
   */
  public int getModeValue() {
    return mode_;
  }
  /**
   * <pre>
   * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
   * </pre>
   *
   * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
   */
  public io.bloombox.schema.partner.settings.ShopStatus getMode() {
    io.bloombox.schema.partner.settings.ShopStatus result = io.bloombox.schema.partner.settings.ShopStatus.valueOf(mode_);
    return result == null ? io.bloombox.schema.partner.settings.ShopStatus.UNRECOGNIZED : result;
  }

  public static final int DATE_FIELD_NUMBER = 3;
  private io.opencannabis.schema.temporal.Date date_;
  /**
   * <pre>
   * Specifies the date upon which these special hours apply.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date = 3;</code>
   */
  public boolean hasDate() {
    return date_ != null;
  }
  /**
   * <pre>
   * Specifies the date upon which these special hours apply.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date = 3;</code>
   */
  public io.opencannabis.schema.temporal.Date getDate() {
    return date_ == null ? io.opencannabis.schema.temporal.Date.getDefaultInstance() : date_;
  }
  /**
   * <pre>
   * Specifies the date upon which these special hours apply.
   * </pre>
   *
   * <code>.opencannabis.temporal.Date date = 3;</code>
   */
  public io.opencannabis.schema.temporal.DateOrBuilder getDateOrBuilder() {
    return getDate();
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
    if (bounds_ != null) {
      output.writeMessage(1, getBounds());
    }
    if (mode_ != io.bloombox.schema.partner.settings.ShopStatus.OPEN.getNumber()) {
      output.writeEnum(2, mode_);
    }
    if (date_ != null) {
      output.writeMessage(3, getDate());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bounds_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBounds());
    }
    if (mode_ != io.bloombox.schema.partner.settings.ShopStatus.OPEN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, mode_);
    }
    if (date_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDate());
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.SpecialHoursSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.SpecialHoursSettings other = (io.bloombox.schema.partner.settings.SpecialHoursSettings) obj;

    boolean result = true;
    result = result && (hasBounds() == other.hasBounds());
    if (hasBounds()) {
      result = result && getBounds()
          .equals(other.getBounds());
    }
    result = result && mode_ == other.mode_;
    result = result && (hasDate() == other.hasDate());
    if (hasDate()) {
      result = result && getDate()
          .equals(other.getDate());
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
    if (hasBounds()) {
      hash = (37 * hash) + BOUNDS_FIELD_NUMBER;
      hash = (53 * hash) + getBounds().hashCode();
    }
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    if (hasDate()) {
      hash = (37 * hash) + DATE_FIELD_NUMBER;
      hash = (53 * hash) + getDate().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.SpecialHoursSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.SpecialHoursSettings prototype) {
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
   * Specifies 'special' hours, such as holidays or one-off days.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.SpecialHoursSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.SpecialHoursSettings)
      io.bloombox.schema.partner.settings.SpecialHoursSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_SpecialHoursSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_SpecialHoursSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.SpecialHoursSettings.class, io.bloombox.schema.partner.settings.SpecialHoursSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.SpecialHoursSettings.newBuilder()
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
      if (boundsBuilder_ == null) {
        bounds_ = null;
      } else {
        bounds_ = null;
        boundsBuilder_ = null;
      }
      mode_ = 0;

      if (dateBuilder_ == null) {
        date_ = null;
      } else {
        date_ = null;
        dateBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_SpecialHoursSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.SpecialHoursSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.SpecialHoursSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.SpecialHoursSettings build() {
      io.bloombox.schema.partner.settings.SpecialHoursSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.SpecialHoursSettings buildPartial() {
      io.bloombox.schema.partner.settings.SpecialHoursSettings result = new io.bloombox.schema.partner.settings.SpecialHoursSettings(this);
      if (boundsBuilder_ == null) {
        result.bounds_ = bounds_;
      } else {
        result.bounds_ = boundsBuilder_.build();
      }
      result.mode_ = mode_;
      if (dateBuilder_ == null) {
        result.date_ = date_;
      } else {
        result.date_ = dateBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.settings.SpecialHoursSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.SpecialHoursSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.SpecialHoursSettings other) {
      if (other == io.bloombox.schema.partner.settings.SpecialHoursSettings.getDefaultInstance()) return this;
      if (other.hasBounds()) {
        mergeBounds(other.getBounds());
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (other.hasDate()) {
        mergeDate(other.getDate());
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
      io.bloombox.schema.partner.settings.SpecialHoursSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.SpecialHoursSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.settings.HoursBoundary bounds_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.HoursBoundary, io.bloombox.schema.partner.settings.HoursBoundary.Builder, io.bloombox.schema.partner.settings.HoursBoundaryOrBuilder> boundsBuilder_;
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public boolean hasBounds() {
      return boundsBuilder_ != null || bounds_ != null;
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public io.bloombox.schema.partner.settings.HoursBoundary getBounds() {
      if (boundsBuilder_ == null) {
        return bounds_ == null ? io.bloombox.schema.partner.settings.HoursBoundary.getDefaultInstance() : bounds_;
      } else {
        return boundsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public Builder setBounds(io.bloombox.schema.partner.settings.HoursBoundary value) {
      if (boundsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bounds_ = value;
        onChanged();
      } else {
        boundsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public Builder setBounds(
        io.bloombox.schema.partner.settings.HoursBoundary.Builder builderForValue) {
      if (boundsBuilder_ == null) {
        bounds_ = builderForValue.build();
        onChanged();
      } else {
        boundsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public Builder mergeBounds(io.bloombox.schema.partner.settings.HoursBoundary value) {
      if (boundsBuilder_ == null) {
        if (bounds_ != null) {
          bounds_ =
            io.bloombox.schema.partner.settings.HoursBoundary.newBuilder(bounds_).mergeFrom(value).buildPartial();
        } else {
          bounds_ = value;
        }
        onChanged();
      } else {
        boundsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public Builder clearBounds() {
      if (boundsBuilder_ == null) {
        bounds_ = null;
        onChanged();
      } else {
        bounds_ = null;
        boundsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public io.bloombox.schema.partner.settings.HoursBoundary.Builder getBoundsBuilder() {
      
      onChanged();
      return getBoundsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    public io.bloombox.schema.partner.settings.HoursBoundaryOrBuilder getBoundsOrBuilder() {
      if (boundsBuilder_ != null) {
        return boundsBuilder_.getMessageOrBuilder();
      } else {
        return bounds_ == null ?
            io.bloombox.schema.partner.settings.HoursBoundary.getDefaultInstance() : bounds_;
      }
    }
    /**
     * <pre>
     * Boundary of this set of hours settings.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.HoursBoundary bounds = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.settings.HoursBoundary, io.bloombox.schema.partner.settings.HoursBoundary.Builder, io.bloombox.schema.partner.settings.HoursBoundaryOrBuilder> 
        getBoundsFieldBuilder() {
      if (boundsBuilder_ == null) {
        boundsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.settings.HoursBoundary, io.bloombox.schema.partner.settings.HoursBoundary.Builder, io.bloombox.schema.partner.settings.HoursBoundaryOrBuilder>(
                getBounds(),
                getParentForChildren(),
                isClean());
        bounds_ = null;
      }
      return boundsBuilder_;
    }

    private int mode_ = 0;
    /**
     * <pre>
     * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
     */
    public int getModeValue() {
      return mode_;
    }
    /**
     * <pre>
     * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
     */
    public io.bloombox.schema.partner.settings.ShopStatus getMode() {
      io.bloombox.schema.partner.settings.ShopStatus result = io.bloombox.schema.partner.settings.ShopStatus.valueOf(mode_);
      return result == null ? io.bloombox.schema.partner.settings.ShopStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
     */
    public Builder setMode(io.bloombox.schema.partner.settings.ShopStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the policy that should apply during the specified bounds, with regard to the shop's open/closed status.
     * </pre>
     *
     * <code>.bloombox.schema.partner.settings.ShopStatus mode = 2;</code>
     */
    public Builder clearMode() {
      
      mode_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.temporal.Date date_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.temporal.Date, io.opencannabis.schema.temporal.Date.Builder, io.opencannabis.schema.temporal.DateOrBuilder> dateBuilder_;
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public boolean hasDate() {
      return dateBuilder_ != null || date_ != null;
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public io.opencannabis.schema.temporal.Date getDate() {
      if (dateBuilder_ == null) {
        return date_ == null ? io.opencannabis.schema.temporal.Date.getDefaultInstance() : date_;
      } else {
        return dateBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public Builder setDate(io.opencannabis.schema.temporal.Date value) {
      if (dateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        date_ = value;
        onChanged();
      } else {
        dateBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public Builder setDate(
        io.opencannabis.schema.temporal.Date.Builder builderForValue) {
      if (dateBuilder_ == null) {
        date_ = builderForValue.build();
        onChanged();
      } else {
        dateBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public Builder mergeDate(io.opencannabis.schema.temporal.Date value) {
      if (dateBuilder_ == null) {
        if (date_ != null) {
          date_ =
            io.opencannabis.schema.temporal.Date.newBuilder(date_).mergeFrom(value).buildPartial();
        } else {
          date_ = value;
        }
        onChanged();
      } else {
        dateBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public Builder clearDate() {
      if (dateBuilder_ == null) {
        date_ = null;
        onChanged();
      } else {
        date_ = null;
        dateBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public io.opencannabis.schema.temporal.Date.Builder getDateBuilder() {
      
      onChanged();
      return getDateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    public io.opencannabis.schema.temporal.DateOrBuilder getDateOrBuilder() {
      if (dateBuilder_ != null) {
        return dateBuilder_.getMessageOrBuilder();
      } else {
        return date_ == null ?
            io.opencannabis.schema.temporal.Date.getDefaultInstance() : date_;
      }
    }
    /**
     * <pre>
     * Specifies the date upon which these special hours apply.
     * </pre>
     *
     * <code>.opencannabis.temporal.Date date = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.temporal.Date, io.opencannabis.schema.temporal.Date.Builder, io.opencannabis.schema.temporal.DateOrBuilder> 
        getDateFieldBuilder() {
      if (dateBuilder_ == null) {
        dateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.temporal.Date, io.opencannabis.schema.temporal.Date.Builder, io.opencannabis.schema.temporal.DateOrBuilder>(
                getDate(),
                getParentForChildren(),
                isClean());
        date_ = null;
      }
      return dateBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.SpecialHoursSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.SpecialHoursSettings)
  private static final io.bloombox.schema.partner.settings.SpecialHoursSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.SpecialHoursSettings();
  }

  public static io.bloombox.schema.partner.settings.SpecialHoursSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SpecialHoursSettings>
      PARSER = new com.google.protobuf.AbstractParser<SpecialHoursSettings>() {
    public SpecialHoursSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SpecialHoursSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SpecialHoursSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SpecialHoursSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.SpecialHoursSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

