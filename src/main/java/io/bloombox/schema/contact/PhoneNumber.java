/*
 * Copyright 2017, Bloombox, LLC.
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

package io.bloombox.schema.contact;

/**
 * Protobuf type {@code contact.PhoneNumber}
 */
public  final class PhoneNumber extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:contact.PhoneNumber)
    PhoneNumberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhoneNumber.newBuilder() to construct.
  private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhoneNumber() {
    e164_ = "";
    validated_ = false;
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
    return io.bloombox.schema.contact.PhoneNumberOuterClass.internal_static_contact_PhoneNumber_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.contact.PhoneNumberOuterClass.internal_static_contact_PhoneNumber_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.contact.PhoneNumber.class, io.bloombox.schema.contact.PhoneNumber.Builder.class);
  }

  public static final int E164_FIELD_NUMBER = 1;
  private volatile java.lang.Object e164_;
  /**
   * <code>string e164 = 1;</code>
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
   * <code>string e164 = 1;</code>
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
   * <code>bool validated = 2;</code>
   */
  public boolean getValidated() {
    return validated_;
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.bloombox.schema.contact.PhoneNumber)) {
      return super.equals(obj);
    }
    io.bloombox.schema.contact.PhoneNumber other = (io.bloombox.schema.contact.PhoneNumber) obj;

    boolean result = true;
    result = result && getE164()
        .equals(other.getE164());
    result = result && (getValidated()
        == other.getValidated());
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.contact.PhoneNumber parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.contact.PhoneNumber prototype) {
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
   * Protobuf type {@code contact.PhoneNumber}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:contact.PhoneNumber)
      io.bloombox.schema.contact.PhoneNumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.contact.PhoneNumberOuterClass.internal_static_contact_PhoneNumber_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.contact.PhoneNumberOuterClass.internal_static_contact_PhoneNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.contact.PhoneNumber.class, io.bloombox.schema.contact.PhoneNumber.Builder.class);
    }

    // Construct using io.bloombox.schema.contact.PhoneNumber.newBuilder()
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

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.contact.PhoneNumberOuterClass.internal_static_contact_PhoneNumber_descriptor;
    }

    public io.bloombox.schema.contact.PhoneNumber getDefaultInstanceForType() {
      return io.bloombox.schema.contact.PhoneNumber.getDefaultInstance();
    }

    public io.bloombox.schema.contact.PhoneNumber build() {
      io.bloombox.schema.contact.PhoneNumber result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.contact.PhoneNumber buildPartial() {
      io.bloombox.schema.contact.PhoneNumber result = new io.bloombox.schema.contact.PhoneNumber(this);
      result.e164_ = e164_;
      result.validated_ = validated_;
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
      if (other instanceof io.bloombox.schema.contact.PhoneNumber) {
        return mergeFrom((io.bloombox.schema.contact.PhoneNumber)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.contact.PhoneNumber other) {
      if (other == io.bloombox.schema.contact.PhoneNumber.getDefaultInstance()) return this;
      if (!other.getE164().isEmpty()) {
        e164_ = other.e164_;
        onChanged();
      }
      if (other.getValidated() != false) {
        setValidated(other.getValidated());
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
      io.bloombox.schema.contact.PhoneNumber parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.contact.PhoneNumber) e.getUnfinishedMessage();
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
     * <code>string e164 = 1;</code>
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
     * <code>string e164 = 1;</code>
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
     * <code>string e164 = 1;</code>
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
     * <code>string e164 = 1;</code>
     */
    public Builder clearE164() {
      
      e164_ = getDefaultInstance().getE164();
      onChanged();
      return this;
    }
    /**
     * <code>string e164 = 1;</code>
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
     * <code>bool validated = 2;</code>
     */
    public boolean getValidated() {
      return validated_;
    }
    /**
     * <code>bool validated = 2;</code>
     */
    public Builder setValidated(boolean value) {
      
      validated_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool validated = 2;</code>
     */
    public Builder clearValidated() {
      
      validated_ = false;
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


    // @@protoc_insertion_point(builder_scope:contact.PhoneNumber)
  }

  // @@protoc_insertion_point(class_scope:contact.PhoneNumber)
  private static final io.bloombox.schema.contact.PhoneNumber DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.contact.PhoneNumber();
  }

  public static io.bloombox.schema.contact.PhoneNumber getDefaultInstance() {
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

  public io.bloombox.schema.contact.PhoneNumber getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

