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
// source: contact/EmailAddress.proto

package io.opencannabis.schema.contact;

public final class ContactEmail {
  private ContactEmail() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EmailAddressOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.contact.EmailAddress)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Email address, in standard format ('example&#64;sample.com').
     * </pre>
     *
     * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
     */
    java.lang.String getAddress();
    /**
     * <pre>
     * Email address, in standard format ('example&#64;sample.com').
     * </pre>
     *
     * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes();

    /**
     * <pre>
     * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
     * address remains unvalidated.
     * </pre>
     *
     * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
     */
    boolean getValidated();

    /**
     * <pre>
     * Display name for the email address, if known/specified.
     * </pre>
     *
     * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Display name for the email address, if known/specified.
     * </pre>
     *
     * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * <pre>
   * Specifies information about an electronic mail (email) address, and optionally, its validation status.
   * </pre>
   *
   * Protobuf type {@code opencannabis.contact.EmailAddress}
   */
  public  static final class EmailAddress extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.contact.EmailAddress)
      EmailAddressOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EmailAddress.newBuilder() to construct.
    private EmailAddress(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EmailAddress() {
      address_ = "";
      validated_ = false;
      name_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EmailAddress(
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

              address_ = s;
              break;
            }
            case 16: {

              validated_ = input.readBool();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
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
      return io.opencannabis.schema.contact.ContactEmail.internal_static_opencannabis_contact_EmailAddress_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.contact.ContactEmail.internal_static_opencannabis_contact_EmailAddress_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.contact.ContactEmail.EmailAddress.class, io.opencannabis.schema.contact.ContactEmail.EmailAddress.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private volatile java.lang.Object address_;
    /**
     * <pre>
     * Email address, in standard format ('example&#64;sample.com').
     * </pre>
     *
     * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Email address, in standard format ('example&#64;sample.com').
     * </pre>
     *
     * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALIDATED_FIELD_NUMBER = 2;
    private boolean validated_;
    /**
     * <pre>
     * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
     * address remains unvalidated.
     * </pre>
     *
     * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
     */
    public boolean getValidated() {
      return validated_;
    }

    public static final int NAME_FIELD_NUMBER = 3;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Display name for the email address, if known/specified.
     * </pre>
     *
     * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Display name for the email address, if known/specified.
     * </pre>
     *
     * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
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
      if (!getAddressBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
      }
      if (validated_ != false) {
        output.writeBool(2, validated_);
      }
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getAddressBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
      }
      if (validated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, validated_);
      }
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
      if (!(obj instanceof io.opencannabis.schema.contact.ContactEmail.EmailAddress)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.contact.ContactEmail.EmailAddress other = (io.opencannabis.schema.contact.ContactEmail.EmailAddress) obj;

      boolean result = true;
      result = result && getAddress()
          .equals(other.getAddress());
      result = result && (getValidated()
          == other.getValidated());
      result = result && getName()
          .equals(other.getName());
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
      hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getAddress().hashCode();
      hash = (37 * hash) + VALIDATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getValidated());
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.contact.ContactEmail.EmailAddress prototype) {
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
     * Specifies information about an electronic mail (email) address, and optionally, its validation status.
     * </pre>
     *
     * Protobuf type {@code opencannabis.contact.EmailAddress}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.contact.EmailAddress)
        io.opencannabis.schema.contact.ContactEmail.EmailAddressOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.contact.ContactEmail.internal_static_opencannabis_contact_EmailAddress_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.contact.ContactEmail.internal_static_opencannabis_contact_EmailAddress_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.contact.ContactEmail.EmailAddress.class, io.opencannabis.schema.contact.ContactEmail.EmailAddress.Builder.class);
      }

      // Construct using io.opencannabis.schema.contact.ContactEmail.EmailAddress.newBuilder()
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
        address_ = "";

        validated_ = false;

        name_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.opencannabis.schema.contact.ContactEmail.internal_static_opencannabis_contact_EmailAddress_descriptor;
      }

      public io.opencannabis.schema.contact.ContactEmail.EmailAddress getDefaultInstanceForType() {
        return io.opencannabis.schema.contact.ContactEmail.EmailAddress.getDefaultInstance();
      }

      public io.opencannabis.schema.contact.ContactEmail.EmailAddress build() {
        io.opencannabis.schema.contact.ContactEmail.EmailAddress result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.opencannabis.schema.contact.ContactEmail.EmailAddress buildPartial() {
        io.opencannabis.schema.contact.ContactEmail.EmailAddress result = new io.opencannabis.schema.contact.ContactEmail.EmailAddress(this);
        result.address_ = address_;
        result.validated_ = validated_;
        result.name_ = name_;
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
        if (other instanceof io.opencannabis.schema.contact.ContactEmail.EmailAddress) {
          return mergeFrom((io.opencannabis.schema.contact.ContactEmail.EmailAddress)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.contact.ContactEmail.EmailAddress other) {
        if (other == io.opencannabis.schema.contact.ContactEmail.EmailAddress.getDefaultInstance()) return this;
        if (!other.getAddress().isEmpty()) {
          address_ = other.address_;
          onChanged();
        }
        if (other.getValidated() != false) {
          setValidated(other.getValidated());
        }
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
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
        io.opencannabis.schema.contact.ContactEmail.EmailAddress parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.contact.ContactEmail.EmailAddress) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object address_ = "";
      /**
       * <pre>
       * Email address, in standard format ('example&#64;sample.com').
       * </pre>
       *
       * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
       */
      public java.lang.String getAddress() {
        java.lang.Object ref = address_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          address_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Email address, in standard format ('example&#64;sample.com').
       * </pre>
       *
       * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes() {
        java.lang.Object ref = address_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          address_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Email address, in standard format ('example&#64;sample.com').
       * </pre>
       *
       * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
       */
      public Builder setAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        address_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Email address, in standard format ('example&#64;sample.com').
       * </pre>
       *
       * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
       */
      public Builder clearAddress() {
        
        address_ = getDefaultInstance().getAddress();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Email address, in standard format ('example&#64;sample.com').
       * </pre>
       *
       * <code>string address = 1 [(.gen_bq_schema.description) = "Email address, in standard format (&#92;'example&#64;sample.com&#92;')."];</code>
       */
      public Builder setAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        address_ = value;
        onChanged();
        return this;
      }

      private boolean validated_ ;
      /**
       * <pre>
       * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
       * address remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
       */
      public boolean getValidated() {
        return validated_;
      }
      /**
       * <pre>
       * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
       * address remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
       */
      public Builder setValidated(boolean value) {
        
        validated_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Validation status. Usable by providers to indicate an email address that has already been validated, or that an
       * address remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this email address."];</code>
       */
      public Builder clearValidated() {
        
        validated_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Display name for the email address, if known/specified.
       * </pre>
       *
       * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Display name for the email address, if known/specified.
       * </pre>
       *
       * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Display name for the email address, if known/specified.
       * </pre>
       *
       * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Display name for the email address, if known/specified.
       * </pre>
       *
       * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Display name for the email address, if known/specified.
       * </pre>
       *
       * <code>string name = 3 [(.gen_bq_schema.description) = "Display name for the email address, if known/specified."];</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
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


      // @@protoc_insertion_point(builder_scope:opencannabis.contact.EmailAddress)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.contact.EmailAddress)
    private static final io.opencannabis.schema.contact.ContactEmail.EmailAddress DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.contact.ContactEmail.EmailAddress();
    }

    public static io.opencannabis.schema.contact.ContactEmail.EmailAddress getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EmailAddress>
        PARSER = new com.google.protobuf.AbstractParser<EmailAddress>() {
      public EmailAddress parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EmailAddress(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EmailAddress> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EmailAddress> getParserForType() {
      return PARSER;
    }

    public io.opencannabis.schema.contact.ContactEmail.EmailAddress getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_contact_EmailAddress_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_contact_EmailAddress_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032contact/EmailAddress.proto\022\024opencannab" +
      "is.contact\032\016bq_field.proto\"\350\001\n\014EmailAddr" +
      "ess\022M\n\007address\030\001 \001(\tB<\212@9Email address, " +
      "in standard format (\'example@sample.com\'" +
      ").\022?\n\tvalidated\030\002 \001(\010B,\212@)Validation sta" +
      "tus for this email address.\022H\n\004name\030\003 \001(" +
      "\tB:\212@7Display name for the email address" +
      ", if known/specified.B8\n\036io.opencannabis" +
      ".schema.contactB\014ContactEmailH\001P\000\242\002\003OCSb" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gen_bq_schema.BqField.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_contact_EmailAddress_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_contact_EmailAddress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_contact_EmailAddress_descriptor,
        new java.lang.String[] { "Address", "Validated", "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
