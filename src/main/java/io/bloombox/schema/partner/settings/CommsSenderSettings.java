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
 * Specifies sender account settings for SMS and email notification channels.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.settings.CommsSenderSettings}
 */
public  final class CommsSenderSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.settings.CommsSenderSettings)
    CommsSenderSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CommsSenderSettings.newBuilder() to construct.
  private CommsSenderSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CommsSenderSettings() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CommsSenderSettings(
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
            io.opencannabis.schema.contact.EmailAddress.Builder subBuilder = null;
            if (email_ != null) {
              subBuilder = email_.toBuilder();
            }
            email_ = input.readMessage(io.opencannabis.schema.contact.EmailAddress.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(email_);
              email_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.contact.PhoneNumber.Builder subBuilder = null;
            if (phone_ != null) {
              subBuilder = phone_.toBuilder();
            }
            phone_ = input.readMessage(io.opencannabis.schema.contact.PhoneNumber.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(phone_);
              phone_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_CommsSenderSettings_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_CommsSenderSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.settings.CommsSenderSettings.class, io.bloombox.schema.partner.settings.CommsSenderSettings.Builder.class);
  }

  public static final int EMAIL_FIELD_NUMBER = 1;
  private io.opencannabis.schema.contact.EmailAddress email_;
  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  public boolean hasEmail() {
    return email_ != null;
  }
  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  public io.opencannabis.schema.contact.EmailAddress getEmail() {
    return email_ == null ? io.opencannabis.schema.contact.EmailAddress.getDefaultInstance() : email_;
  }
  /**
   * <pre>
   * Specifies the email address to send from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.EmailAddress email = 1;</code>
   */
  public io.opencannabis.schema.contact.EmailAddressOrBuilder getEmailOrBuilder() {
    return getEmail();
  }

  public static final int PHONE_FIELD_NUMBER = 2;
  private io.opencannabis.schema.contact.PhoneNumber phone_;
  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  public boolean hasPhone() {
    return phone_ != null;
  }
  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  public io.opencannabis.schema.contact.PhoneNumber getPhone() {
    return phone_ == null ? io.opencannabis.schema.contact.PhoneNumber.getDefaultInstance() : phone_;
  }
  /**
   * <pre>
   * Specifies the phone number to send SMS messages from for a particular type of notifications.
   * </pre>
   *
   * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
   */
  public io.opencannabis.schema.contact.PhoneNumberOrBuilder getPhoneOrBuilder() {
    return getPhone();
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
    if (email_ != null) {
      output.writeMessage(1, getEmail());
    }
    if (phone_ != null) {
      output.writeMessage(2, getPhone());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (email_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEmail());
    }
    if (phone_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPhone());
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
    if (!(obj instanceof io.bloombox.schema.partner.settings.CommsSenderSettings)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.settings.CommsSenderSettings other = (io.bloombox.schema.partner.settings.CommsSenderSettings) obj;

    boolean result = true;
    result = result && (hasEmail() == other.hasEmail());
    if (hasEmail()) {
      result = result && getEmail()
          .equals(other.getEmail());
    }
    result = result && (hasPhone() == other.hasPhone());
    if (hasPhone()) {
      result = result && getPhone()
          .equals(other.getPhone());
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
    if (hasEmail()) {
      hash = (37 * hash) + EMAIL_FIELD_NUMBER;
      hash = (53 * hash) + getEmail().hashCode();
    }
    if (hasPhone()) {
      hash = (37 * hash) + PHONE_FIELD_NUMBER;
      hash = (53 * hash) + getPhone().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.settings.CommsSenderSettings parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.settings.CommsSenderSettings prototype) {
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
   * Specifies sender account settings for SMS and email notification channels.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.settings.CommsSenderSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.settings.CommsSenderSettings)
      io.bloombox.schema.partner.settings.CommsSenderSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_CommsSenderSettings_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_CommsSenderSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.settings.CommsSenderSettings.class, io.bloombox.schema.partner.settings.CommsSenderSettings.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.settings.CommsSenderSettings.newBuilder()
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
      if (emailBuilder_ == null) {
        email_ = null;
      } else {
        email_ = null;
        emailBuilder_ = null;
      }
      if (phoneBuilder_ == null) {
        phone_ = null;
      } else {
        phone_ = null;
        phoneBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.settings.PartnerLocationSettingsOuterClass.internal_static_bloombox_schema_partner_settings_CommsSenderSettings_descriptor;
    }

    public io.bloombox.schema.partner.settings.CommsSenderSettings getDefaultInstanceForType() {
      return io.bloombox.schema.partner.settings.CommsSenderSettings.getDefaultInstance();
    }

    public io.bloombox.schema.partner.settings.CommsSenderSettings build() {
      io.bloombox.schema.partner.settings.CommsSenderSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.settings.CommsSenderSettings buildPartial() {
      io.bloombox.schema.partner.settings.CommsSenderSettings result = new io.bloombox.schema.partner.settings.CommsSenderSettings(this);
      if (emailBuilder_ == null) {
        result.email_ = email_;
      } else {
        result.email_ = emailBuilder_.build();
      }
      if (phoneBuilder_ == null) {
        result.phone_ = phone_;
      } else {
        result.phone_ = phoneBuilder_.build();
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
      if (other instanceof io.bloombox.schema.partner.settings.CommsSenderSettings) {
        return mergeFrom((io.bloombox.schema.partner.settings.CommsSenderSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.settings.CommsSenderSettings other) {
      if (other == io.bloombox.schema.partner.settings.CommsSenderSettings.getDefaultInstance()) return this;
      if (other.hasEmail()) {
        mergeEmail(other.getEmail());
      }
      if (other.hasPhone()) {
        mergePhone(other.getPhone());
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
      io.bloombox.schema.partner.settings.CommsSenderSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.settings.CommsSenderSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.contact.EmailAddress email_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.contact.EmailAddress, io.opencannabis.schema.contact.EmailAddress.Builder, io.opencannabis.schema.contact.EmailAddressOrBuilder> emailBuilder_;
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public boolean hasEmail() {
      return emailBuilder_ != null || email_ != null;
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public io.opencannabis.schema.contact.EmailAddress getEmail() {
      if (emailBuilder_ == null) {
        return email_ == null ? io.opencannabis.schema.contact.EmailAddress.getDefaultInstance() : email_;
      } else {
        return emailBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public Builder setEmail(io.opencannabis.schema.contact.EmailAddress value) {
      if (emailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        email_ = value;
        onChanged();
      } else {
        emailBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public Builder setEmail(
        io.opencannabis.schema.contact.EmailAddress.Builder builderForValue) {
      if (emailBuilder_ == null) {
        email_ = builderForValue.build();
        onChanged();
      } else {
        emailBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public Builder mergeEmail(io.opencannabis.schema.contact.EmailAddress value) {
      if (emailBuilder_ == null) {
        if (email_ != null) {
          email_ =
            io.opencannabis.schema.contact.EmailAddress.newBuilder(email_).mergeFrom(value).buildPartial();
        } else {
          email_ = value;
        }
        onChanged();
      } else {
        emailBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public Builder clearEmail() {
      if (emailBuilder_ == null) {
        email_ = null;
        onChanged();
      } else {
        email_ = null;
        emailBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public io.opencannabis.schema.contact.EmailAddress.Builder getEmailBuilder() {
      
      onChanged();
      return getEmailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    public io.opencannabis.schema.contact.EmailAddressOrBuilder getEmailOrBuilder() {
      if (emailBuilder_ != null) {
        return emailBuilder_.getMessageOrBuilder();
      } else {
        return email_ == null ?
            io.opencannabis.schema.contact.EmailAddress.getDefaultInstance() : email_;
      }
    }
    /**
     * <pre>
     * Specifies the email address to send from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.EmailAddress email = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.contact.EmailAddress, io.opencannabis.schema.contact.EmailAddress.Builder, io.opencannabis.schema.contact.EmailAddressOrBuilder> 
        getEmailFieldBuilder() {
      if (emailBuilder_ == null) {
        emailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.contact.EmailAddress, io.opencannabis.schema.contact.EmailAddress.Builder, io.opencannabis.schema.contact.EmailAddressOrBuilder>(
                getEmail(),
                getParentForChildren(),
                isClean());
        email_ = null;
      }
      return emailBuilder_;
    }

    private io.opencannabis.schema.contact.PhoneNumber phone_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.contact.PhoneNumber, io.opencannabis.schema.contact.PhoneNumber.Builder, io.opencannabis.schema.contact.PhoneNumberOrBuilder> phoneBuilder_;
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public boolean hasPhone() {
      return phoneBuilder_ != null || phone_ != null;
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public io.opencannabis.schema.contact.PhoneNumber getPhone() {
      if (phoneBuilder_ == null) {
        return phone_ == null ? io.opencannabis.schema.contact.PhoneNumber.getDefaultInstance() : phone_;
      } else {
        return phoneBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public Builder setPhone(io.opencannabis.schema.contact.PhoneNumber value) {
      if (phoneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        phone_ = value;
        onChanged();
      } else {
        phoneBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public Builder setPhone(
        io.opencannabis.schema.contact.PhoneNumber.Builder builderForValue) {
      if (phoneBuilder_ == null) {
        phone_ = builderForValue.build();
        onChanged();
      } else {
        phoneBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public Builder mergePhone(io.opencannabis.schema.contact.PhoneNumber value) {
      if (phoneBuilder_ == null) {
        if (phone_ != null) {
          phone_ =
            io.opencannabis.schema.contact.PhoneNumber.newBuilder(phone_).mergeFrom(value).buildPartial();
        } else {
          phone_ = value;
        }
        onChanged();
      } else {
        phoneBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public Builder clearPhone() {
      if (phoneBuilder_ == null) {
        phone_ = null;
        onChanged();
      } else {
        phone_ = null;
        phoneBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public io.opencannabis.schema.contact.PhoneNumber.Builder getPhoneBuilder() {
      
      onChanged();
      return getPhoneFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    public io.opencannabis.schema.contact.PhoneNumberOrBuilder getPhoneOrBuilder() {
      if (phoneBuilder_ != null) {
        return phoneBuilder_.getMessageOrBuilder();
      } else {
        return phone_ == null ?
            io.opencannabis.schema.contact.PhoneNumber.getDefaultInstance() : phone_;
      }
    }
    /**
     * <pre>
     * Specifies the phone number to send SMS messages from for a particular type of notifications.
     * </pre>
     *
     * <code>.opencannabis.contact.PhoneNumber phone = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.contact.PhoneNumber, io.opencannabis.schema.contact.PhoneNumber.Builder, io.opencannabis.schema.contact.PhoneNumberOrBuilder> 
        getPhoneFieldBuilder() {
      if (phoneBuilder_ == null) {
        phoneBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.contact.PhoneNumber, io.opencannabis.schema.contact.PhoneNumber.Builder, io.opencannabis.schema.contact.PhoneNumberOrBuilder>(
                getPhone(),
                getParentForChildren(),
                isClean());
        phone_ = null;
      }
      return phoneBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.settings.CommsSenderSettings)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.settings.CommsSenderSettings)
  private static final io.bloombox.schema.partner.settings.CommsSenderSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.settings.CommsSenderSettings();
  }

  public static io.bloombox.schema.partner.settings.CommsSenderSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CommsSenderSettings>
      PARSER = new com.google.protobuf.AbstractParser<CommsSenderSettings>() {
    public CommsSenderSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CommsSenderSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CommsSenderSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CommsSenderSettings> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.settings.CommsSenderSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

