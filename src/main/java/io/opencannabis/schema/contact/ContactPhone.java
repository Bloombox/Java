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
// source: contact/PhoneNumber.proto

package io.opencannabis.schema.contact;

public final class ContactPhone {
  private ContactPhone() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PhoneNumberOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.contact.PhoneNumber)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * E164-formatted telephone number.
     * </pre>
     *
     * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
     */
    java.lang.String getE164();
    /**
     * <pre>
     * E164-formatted telephone number.
     * </pre>
     *
     * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
     */
    com.google.protobuf.ByteString
        getE164Bytes();

    /**
     * <pre>
     * Validation status. Usable by providers to indicate a phone number that has already been validated, or that a phone
     * number remains unvalidated.
     * </pre>
     *
     * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this phone number."];</code>
     */
    boolean getValidated();

    /**
     * <pre>
     * Display text for this phone number, if applicable.
     * </pre>
     *
     * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
     */
    java.lang.String getDisplay();
    /**
     * <pre>
     * Display text for this phone number, if applicable.
     * </pre>
     *
     * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
     */
    com.google.protobuf.ByteString
        getDisplayBytes();
  }
  /**
   * <pre>
   * Payload that specifies a phone number, and any additional information to be carried with it (including verification
   * state, if applicable).
   * </pre>
   *
   * Protobuf type {@code opencannabis.contact.PhoneNumber}
   */
  public  static final class PhoneNumber extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.contact.PhoneNumber)
      PhoneNumberOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PhoneNumber.newBuilder() to construct.
    private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PhoneNumber() {
      e164_ = "";
      validated_ = false;
      display_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PhoneNumber(
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

              e164_ = s;
              break;
            }
            case 16: {

              validated_ = input.readBool();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              display_ = s;
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
      return io.opencannabis.schema.contact.ContactPhone.internal_static_opencannabis_contact_PhoneNumber_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.contact.ContactPhone.internal_static_opencannabis_contact_PhoneNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.contact.ContactPhone.PhoneNumber.class, io.opencannabis.schema.contact.ContactPhone.PhoneNumber.Builder.class);
    }

    public static final int E164_FIELD_NUMBER = 1;
    private volatile java.lang.Object e164_;
    /**
     * <pre>
     * E164-formatted telephone number.
     * </pre>
     *
     * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
     */
    public java.lang.String getE164() {
      java.lang.Object ref = e164_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        e164_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * E164-formatted telephone number.
     * </pre>
     *
     * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
     */
    public com.google.protobuf.ByteString
        getE164Bytes() {
      java.lang.Object ref = e164_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        e164_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int VALIDATED_FIELD_NUMBER = 2;
    private boolean validated_;
    /**
     * <pre>
     * Validation status. Usable by providers to indicate a phone number that has already been validated, or that a phone
     * number remains unvalidated.
     * </pre>
     *
     * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this phone number."];</code>
     */
    public boolean getValidated() {
      return validated_;
    }

    public static final int DISPLAY_FIELD_NUMBER = 3;
    private volatile java.lang.Object display_;
    /**
     * <pre>
     * Display text for this phone number, if applicable.
     * </pre>
     *
     * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
     */
    public java.lang.String getDisplay() {
      java.lang.Object ref = display_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        display_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Display text for this phone number, if applicable.
     * </pre>
     *
     * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
     */
    public com.google.protobuf.ByteString
        getDisplayBytes() {
      java.lang.Object ref = display_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        display_ = b;
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
      if (!getE164Bytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, e164_);
      }
      if (validated_ != false) {
        output.writeBool(2, validated_);
      }
      if (!getDisplayBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, display_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getE164Bytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, e164_);
      }
      if (validated_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, validated_);
      }
      if (!getDisplayBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, display_);
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
      if (!(obj instanceof io.opencannabis.schema.contact.ContactPhone.PhoneNumber)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.contact.ContactPhone.PhoneNumber other = (io.opencannabis.schema.contact.ContactPhone.PhoneNumber) obj;

      boolean result = true;
      result = result && getE164()
          .equals(other.getE164());
      result = result && (getValidated()
          == other.getValidated());
      result = result && getDisplay()
          .equals(other.getDisplay());
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
      hash = (37 * hash) + E164_FIELD_NUMBER;
      hash = (53 * hash) + getE164().hashCode();
      hash = (37 * hash) + VALIDATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getValidated());
      hash = (37 * hash) + DISPLAY_FIELD_NUMBER;
      hash = (53 * hash) + getDisplay().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.contact.ContactPhone.PhoneNumber prototype) {
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
     * Payload that specifies a phone number, and any additional information to be carried with it (including verification
     * state, if applicable).
     * </pre>
     *
     * Protobuf type {@code opencannabis.contact.PhoneNumber}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.contact.PhoneNumber)
        io.opencannabis.schema.contact.ContactPhone.PhoneNumberOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.contact.ContactPhone.internal_static_opencannabis_contact_PhoneNumber_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.contact.ContactPhone.internal_static_opencannabis_contact_PhoneNumber_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.contact.ContactPhone.PhoneNumber.class, io.opencannabis.schema.contact.ContactPhone.PhoneNumber.Builder.class);
      }

      // Construct using io.opencannabis.schema.contact.ContactPhone.PhoneNumber.newBuilder()
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
        e164_ = "";

        validated_ = false;

        display_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.opencannabis.schema.contact.ContactPhone.internal_static_opencannabis_contact_PhoneNumber_descriptor;
      }

      public io.opencannabis.schema.contact.ContactPhone.PhoneNumber getDefaultInstanceForType() {
        return io.opencannabis.schema.contact.ContactPhone.PhoneNumber.getDefaultInstance();
      }

      public io.opencannabis.schema.contact.ContactPhone.PhoneNumber build() {
        io.opencannabis.schema.contact.ContactPhone.PhoneNumber result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.opencannabis.schema.contact.ContactPhone.PhoneNumber buildPartial() {
        io.opencannabis.schema.contact.ContactPhone.PhoneNumber result = new io.opencannabis.schema.contact.ContactPhone.PhoneNumber(this);
        result.e164_ = e164_;
        result.validated_ = validated_;
        result.display_ = display_;
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
        if (other instanceof io.opencannabis.schema.contact.ContactPhone.PhoneNumber) {
          return mergeFrom((io.opencannabis.schema.contact.ContactPhone.PhoneNumber)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.contact.ContactPhone.PhoneNumber other) {
        if (other == io.opencannabis.schema.contact.ContactPhone.PhoneNumber.getDefaultInstance()) return this;
        if (!other.getE164().isEmpty()) {
          e164_ = other.e164_;
          onChanged();
        }
        if (other.getValidated() != false) {
          setValidated(other.getValidated());
        }
        if (!other.getDisplay().isEmpty()) {
          display_ = other.display_;
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
        io.opencannabis.schema.contact.ContactPhone.PhoneNumber parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.contact.ContactPhone.PhoneNumber) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object e164_ = "";
      /**
       * <pre>
       * E164-formatted telephone number.
       * </pre>
       *
       * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
       */
      public java.lang.String getE164() {
        java.lang.Object ref = e164_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          e164_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * E164-formatted telephone number.
       * </pre>
       *
       * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
       */
      public com.google.protobuf.ByteString
          getE164Bytes() {
        java.lang.Object ref = e164_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          e164_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * E164-formatted telephone number.
       * </pre>
       *
       * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
       */
      public Builder setE164(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        e164_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * E164-formatted telephone number.
       * </pre>
       *
       * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
       */
      public Builder clearE164() {
        
        e164_ = getDefaultInstance().getE164();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * E164-formatted telephone number.
       * </pre>
       *
       * <code>string e164 = 1 [(.gen_bq_schema.description) = "E164-formatted telephone number."];</code>
       */
      public Builder setE164Bytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        e164_ = value;
        onChanged();
        return this;
      }

      private boolean validated_ ;
      /**
       * <pre>
       * Validation status. Usable by providers to indicate a phone number that has already been validated, or that a phone
       * number remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this phone number."];</code>
       */
      public boolean getValidated() {
        return validated_;
      }
      /**
       * <pre>
       * Validation status. Usable by providers to indicate a phone number that has already been validated, or that a phone
       * number remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this phone number."];</code>
       */
      public Builder setValidated(boolean value) {
        
        validated_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Validation status. Usable by providers to indicate a phone number that has already been validated, or that a phone
       * number remains unvalidated.
       * </pre>
       *
       * <code>bool validated = 2 [(.gen_bq_schema.description) = "Validation status for this phone number."];</code>
       */
      public Builder clearValidated() {
        
        validated_ = false;
        onChanged();
        return this;
      }

      private java.lang.Object display_ = "";
      /**
       * <pre>
       * Display text for this phone number, if applicable.
       * </pre>
       *
       * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
       */
      public java.lang.String getDisplay() {
        java.lang.Object ref = display_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          display_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Display text for this phone number, if applicable.
       * </pre>
       *
       * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
       */
      public com.google.protobuf.ByteString
          getDisplayBytes() {
        java.lang.Object ref = display_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          display_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Display text for this phone number, if applicable.
       * </pre>
       *
       * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
       */
      public Builder setDisplay(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        display_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Display text for this phone number, if applicable.
       * </pre>
       *
       * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
       */
      public Builder clearDisplay() {
        
        display_ = getDefaultInstance().getDisplay();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Display text for this phone number, if applicable.
       * </pre>
       *
       * <code>string display = 3 [(.gen_bq_schema.description) = "Display text for this phone number, if applicable."];</code>
       */
      public Builder setDisplayBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        display_ = value;
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


      // @@protoc_insertion_point(builder_scope:opencannabis.contact.PhoneNumber)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.contact.PhoneNumber)
    private static final io.opencannabis.schema.contact.ContactPhone.PhoneNumber DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.contact.ContactPhone.PhoneNumber();
    }

    public static io.opencannabis.schema.contact.ContactPhone.PhoneNumber getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PhoneNumber>
        PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
      public PhoneNumber parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PhoneNumber(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PhoneNumber> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
      return PARSER;
    }

    public io.opencannabis.schema.contact.ContactPhone.PhoneNumber getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_contact_PhoneNumber_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_contact_PhoneNumber_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031contact/PhoneNumber.proto\022\024opencannabi" +
      "s.contact\032\016bq_field.proto\"\310\001\n\013PhoneNumbe" +
      "r\0221\n\004e164\030\001 \001(\tB#\212@ E164-formatted telep" +
      "hone number.\022>\n\tvalidated\030\002 \001(\010B+\212@(Vali" +
      "dation status for this phone number.\022F\n\007" +
      "display\030\003 \001(\tB5\212@2Display text for this " +
      "phone number, if applicable.B8\n\036io.openc" +
      "annabis.schema.contactB\014ContactPhoneH\001P\000" +
      "\242\002\003OCSb\006proto3"
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
    internal_static_opencannabis_contact_PhoneNumber_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_contact_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_contact_PhoneNumber_descriptor,
        new java.lang.String[] { "E164", "Validated", "Display", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
