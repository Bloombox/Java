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
// source: partner/PartnerLocation.proto

package io.bloombox.schema.partner;

/**
 * <pre>
 * Specifies a key that references a location owned by a partner organization that has an active account with Bloombox.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.partner.PartnerLocationKey}
 */
public  final class PartnerLocationKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.partner.PartnerLocationKey)
    PartnerLocationKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartnerLocationKey.newBuilder() to construct.
  private PartnerLocationKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartnerLocationKey() {
    code_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartnerLocationKey(
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
            io.bloombox.schema.partner.PartnerKey.Builder subBuilder = null;
            if (partner_ != null) {
              subBuilder = partner_.toBuilder();
            }
            partner_ = input.readMessage(io.bloombox.schema.partner.PartnerKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(partner_);
              partner_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            code_ = s;
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
    return io.bloombox.schema.partner.PartnerLocationOuterClass.internal_static_bloombox_schema_partner_PartnerLocationKey_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.PartnerLocationOuterClass.internal_static_bloombox_schema_partner_PartnerLocationKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.PartnerLocationKey.class, io.bloombox.schema.partner.PartnerLocationKey.Builder.class);
  }

  public static final int PARTNER_FIELD_NUMBER = 1;
  private io.bloombox.schema.partner.PartnerKey partner_;
  /**
   * <pre>
   * Specifies the partner that owns this location.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
   */
  public boolean hasPartner() {
    return partner_ != null;
  }
  /**
   * <pre>
   * Specifies the partner that owns this location.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
   */
  public io.bloombox.schema.partner.PartnerKey getPartner() {
    return partner_ == null ? io.bloombox.schema.partner.PartnerKey.getDefaultInstance() : partner_;
  }
  /**
   * <pre>
   * Specifies the partner that owns this location.
   * </pre>
   *
   * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
   */
  public io.bloombox.schema.partner.PartnerKeyOrBuilder getPartnerOrBuilder() {
    return getPartner();
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile java.lang.Object code_;
  /**
   * <pre>
   * Short string that uniquely identifies this location, under a given partner account.
   * </pre>
   *
   * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
   */
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Short string that uniquely identifies this location, under a given partner account.
   * </pre>
   *
   * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
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
    if (partner_ != null) {
      output.writeMessage(1, getPartner());
    }
    if (!getCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPartner());
    }
    if (!getCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
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
    if (!(obj instanceof io.bloombox.schema.partner.PartnerLocationKey)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.PartnerLocationKey other = (io.bloombox.schema.partner.PartnerLocationKey) obj;

    boolean result = true;
    result = result && (hasPartner() == other.hasPartner());
    if (hasPartner()) {
      result = result && getPartner()
          .equals(other.getPartner());
    }
    result = result && getCode()
        .equals(other.getCode());
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
    if (hasPartner()) {
      hash = (37 * hash) + PARTNER_FIELD_NUMBER;
      hash = (53 * hash) + getPartner().hashCode();
    }
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerLocationKey parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.PartnerLocationKey prototype) {
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
   * Specifies a key that references a location owned by a partner organization that has an active account with Bloombox.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.partner.PartnerLocationKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.partner.PartnerLocationKey)
      io.bloombox.schema.partner.PartnerLocationKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.PartnerLocationOuterClass.internal_static_bloombox_schema_partner_PartnerLocationKey_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.PartnerLocationOuterClass.internal_static_bloombox_schema_partner_PartnerLocationKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.PartnerLocationKey.class, io.bloombox.schema.partner.PartnerLocationKey.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.PartnerLocationKey.newBuilder()
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
      if (partnerBuilder_ == null) {
        partner_ = null;
      } else {
        partner_ = null;
        partnerBuilder_ = null;
      }
      code_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.PartnerLocationOuterClass.internal_static_bloombox_schema_partner_PartnerLocationKey_descriptor;
    }

    public io.bloombox.schema.partner.PartnerLocationKey getDefaultInstanceForType() {
      return io.bloombox.schema.partner.PartnerLocationKey.getDefaultInstance();
    }

    public io.bloombox.schema.partner.PartnerLocationKey build() {
      io.bloombox.schema.partner.PartnerLocationKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.PartnerLocationKey buildPartial() {
      io.bloombox.schema.partner.PartnerLocationKey result = new io.bloombox.schema.partner.PartnerLocationKey(this);
      if (partnerBuilder_ == null) {
        result.partner_ = partner_;
      } else {
        result.partner_ = partnerBuilder_.build();
      }
      result.code_ = code_;
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
      if (other instanceof io.bloombox.schema.partner.PartnerLocationKey) {
        return mergeFrom((io.bloombox.schema.partner.PartnerLocationKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.PartnerLocationKey other) {
      if (other == io.bloombox.schema.partner.PartnerLocationKey.getDefaultInstance()) return this;
      if (other.hasPartner()) {
        mergePartner(other.getPartner());
      }
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
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
      io.bloombox.schema.partner.PartnerLocationKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.PartnerLocationKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.partner.PartnerKey partner_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.PartnerKey, io.bloombox.schema.partner.PartnerKey.Builder, io.bloombox.schema.partner.PartnerKeyOrBuilder> partnerBuilder_;
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public boolean hasPartner() {
      return partnerBuilder_ != null || partner_ != null;
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public io.bloombox.schema.partner.PartnerKey getPartner() {
      if (partnerBuilder_ == null) {
        return partner_ == null ? io.bloombox.schema.partner.PartnerKey.getDefaultInstance() : partner_;
      } else {
        return partnerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public Builder setPartner(io.bloombox.schema.partner.PartnerKey value) {
      if (partnerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partner_ = value;
        onChanged();
      } else {
        partnerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public Builder setPartner(
        io.bloombox.schema.partner.PartnerKey.Builder builderForValue) {
      if (partnerBuilder_ == null) {
        partner_ = builderForValue.build();
        onChanged();
      } else {
        partnerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public Builder mergePartner(io.bloombox.schema.partner.PartnerKey value) {
      if (partnerBuilder_ == null) {
        if (partner_ != null) {
          partner_ =
            io.bloombox.schema.partner.PartnerKey.newBuilder(partner_).mergeFrom(value).buildPartial();
        } else {
          partner_ = value;
        }
        onChanged();
      } else {
        partnerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public Builder clearPartner() {
      if (partnerBuilder_ == null) {
        partner_ = null;
        onChanged();
      } else {
        partner_ = null;
        partnerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public io.bloombox.schema.partner.PartnerKey.Builder getPartnerBuilder() {
      
      onChanged();
      return getPartnerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    public io.bloombox.schema.partner.PartnerKeyOrBuilder getPartnerOrBuilder() {
      if (partnerBuilder_ != null) {
        return partnerBuilder_.getMessageOrBuilder();
      } else {
        return partner_ == null ?
            io.bloombox.schema.partner.PartnerKey.getDefaultInstance() : partner_;
      }
    }
    /**
     * <pre>
     * Specifies the partner that owns this location.
     * </pre>
     *
     * <code>.bloombox.schema.partner.PartnerKey partner = 1 [(.gen_bq_schema.description) = "Specifies the partner that owns this location."];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.partner.PartnerKey, io.bloombox.schema.partner.PartnerKey.Builder, io.bloombox.schema.partner.PartnerKeyOrBuilder> 
        getPartnerFieldBuilder() {
      if (partnerBuilder_ == null) {
        partnerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.partner.PartnerKey, io.bloombox.schema.partner.PartnerKey.Builder, io.bloombox.schema.partner.PartnerKeyOrBuilder>(
                getPartner(),
                getParentForChildren(),
                isClean());
        partner_ = null;
      }
      return partnerBuilder_;
    }

    private java.lang.Object code_ = "";
    /**
     * <pre>
     * Short string that uniquely identifies this location, under a given partner account.
     * </pre>
     *
     * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Short string that uniquely identifies this location, under a given partner account.
     * </pre>
     *
     * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Short string that uniquely identifies this location, under a given partner account.
     * </pre>
     *
     * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Short string that uniquely identifies this location, under a given partner account.
     * </pre>
     *
     * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
     */
    public Builder clearCode() {
      
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Short string that uniquely identifies this location, under a given partner account.
     * </pre>
     *
     * <code>string code = 2 [(.gen_bq_schema.description) = "Short string that uniquely identifies this location, under a given partner account."];</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      code_ = value;
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


    // @@protoc_insertion_point(builder_scope:bloombox.schema.partner.PartnerLocationKey)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.partner.PartnerLocationKey)
  private static final io.bloombox.schema.partner.PartnerLocationKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.PartnerLocationKey();
  }

  public static io.bloombox.schema.partner.PartnerLocationKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartnerLocationKey>
      PARSER = new com.google.protobuf.AbstractParser<PartnerLocationKey>() {
    public PartnerLocationKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PartnerLocationKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartnerLocationKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartnerLocationKey> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.PartnerLocationKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

