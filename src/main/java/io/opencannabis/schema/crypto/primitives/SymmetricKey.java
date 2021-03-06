/*
 * Copyright 2019, Momentum Ideas Co.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crypto/primitives/Keys.proto

package io.opencannabis.schema.crypto.primitives;

/**
 * <pre>
 * Specifies a symmetric encryption key, which is generally considered a secret value.
 * </pre>
 *
 * Protobuf type {@code opencannabis.crypto.SymmetricKey}
 */
public  final class SymmetricKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.crypto.SymmetricKey)
    SymmetricKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SymmetricKey.newBuilder() to construct.
  private SymmetricKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SymmetricKey() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SymmetricKey(
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
          case 8: {

            bits_ = input.readUInt32();
            break;
          }
          case 18: {
            io.opencannabis.schema.crypto.primitives.InitializationVector.Builder subBuilder = null;
            if (iv_ != null) {
              subBuilder = iv_.toBuilder();
            }
            iv_ = input.readMessage(io.opencannabis.schema.crypto.primitives.InitializationVector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(iv_);
              iv_ = subBuilder.buildPartial();
            }

            break;
          }
          case 82: {
            dataCase_ = 10;
            data_ = input.readBytes();
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();
            dataCase_ = 11;
            data_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
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
    return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.crypto.primitives.SymmetricKey.class, io.opencannabis.schema.crypto.primitives.SymmetricKey.Builder.class);
  }

  private int dataCase_ = 0;
  private java.lang.Object data_;
  public enum DataCase
      implements com.google.protobuf.Internal.EnumLite {
    RAW(10),
    B64(11),
    DATA_NOT_SET(0);
    private final int value;
    private DataCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DataCase valueOf(int value) {
      return forNumber(value);
    }

    public static DataCase forNumber(int value) {
      switch (value) {
        case 10: return RAW;
        case 11: return B64;
        case 0: return DATA_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public DataCase
  getDataCase() {
    return DataCase.forNumber(
        dataCase_);
  }

  public static final int BITS_FIELD_NUMBER = 1;
  private int bits_;
  /**
   * <pre>
   * Bit size for the underlying symmetric key.
   * </pre>
   *
   * <code>uint32 bits = 1;</code>
   */
  public int getBits() {
    return bits_;
  }

  public static final int IV_FIELD_NUMBER = 2;
  private io.opencannabis.schema.crypto.primitives.InitializationVector iv_;
  /**
   * <pre>
   * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
   * </pre>
   *
   * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
   */
  public boolean hasIv() {
    return iv_ != null;
  }
  /**
   * <pre>
   * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
   * </pre>
   *
   * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
   */
  public io.opencannabis.schema.crypto.primitives.InitializationVector getIv() {
    return iv_ == null ? io.opencannabis.schema.crypto.primitives.InitializationVector.getDefaultInstance() : iv_;
  }
  /**
   * <pre>
   * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
   * </pre>
   *
   * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
   */
  public io.opencannabis.schema.crypto.primitives.InitializationVectorOrBuilder getIvOrBuilder() {
    return getIv();
  }

  public static final int RAW_FIELD_NUMBER = 10;
  /**
   * <pre>
   * Specifies the raw bytes of the key.
   * </pre>
   *
   * <code>bytes raw = 10;</code>
   */
  public com.google.protobuf.ByteString getRaw() {
    if (dataCase_ == 10) {
      return (com.google.protobuf.ByteString) data_;
    }
    return com.google.protobuf.ByteString.EMPTY;
  }

  public static final int B64_FIELD_NUMBER = 11;
  /**
   * <pre>
   * Specifies the key bytes, encoded in base64.
   * </pre>
   *
   * <code>string b64 = 11;</code>
   */
  public java.lang.String getB64() {
    java.lang.Object ref = "";
    if (dataCase_ == 11) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (dataCase_ == 11) {
        data_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the key bytes, encoded in base64.
   * </pre>
   *
   * <code>string b64 = 11;</code>
   */
  public com.google.protobuf.ByteString
      getB64Bytes() {
    java.lang.Object ref = "";
    if (dataCase_ == 11) {
      ref = data_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (dataCase_ == 11) {
        data_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (bits_ != 0) {
      output.writeUInt32(1, bits_);
    }
    if (iv_ != null) {
      output.writeMessage(2, getIv());
    }
    if (dataCase_ == 10) {
      output.writeBytes(
          10, (com.google.protobuf.ByteString) data_);
    }
    if (dataCase_ == 11) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bits_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, bits_);
    }
    if (iv_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getIv());
    }
    if (dataCase_ == 10) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(
            10, (com.google.protobuf.ByteString) data_);
    }
    if (dataCase_ == 11) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, data_);
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
    if (!(obj instanceof io.opencannabis.schema.crypto.primitives.SymmetricKey)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.crypto.primitives.SymmetricKey other = (io.opencannabis.schema.crypto.primitives.SymmetricKey) obj;

    if (getBits()
        != other.getBits()) return false;
    if (hasIv() != other.hasIv()) return false;
    if (hasIv()) {
      if (!getIv()
          .equals(other.getIv())) return false;
    }
    if (!getDataCase().equals(other.getDataCase())) return false;
    switch (dataCase_) {
      case 10:
        if (!getRaw()
            .equals(other.getRaw())) return false;
        break;
      case 11:
        if (!getB64()
            .equals(other.getB64())) return false;
        break;
      case 0:
      default:
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + BITS_FIELD_NUMBER;
    hash = (53 * hash) + getBits();
    if (hasIv()) {
      hash = (37 * hash) + IV_FIELD_NUMBER;
      hash = (53 * hash) + getIv().hashCode();
    }
    switch (dataCase_) {
      case 10:
        hash = (37 * hash) + RAW_FIELD_NUMBER;
        hash = (53 * hash) + getRaw().hashCode();
        break;
      case 11:
        hash = (37 * hash) + B64_FIELD_NUMBER;
        hash = (53 * hash) + getB64().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKey parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.opencannabis.schema.crypto.primitives.SymmetricKey prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Specifies a symmetric encryption key, which is generally considered a secret value.
   * </pre>
   *
   * Protobuf type {@code opencannabis.crypto.SymmetricKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.crypto.SymmetricKey)
      io.opencannabis.schema.crypto.primitives.SymmetricKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.crypto.primitives.SymmetricKey.class, io.opencannabis.schema.crypto.primitives.SymmetricKey.Builder.class);
    }

    // Construct using io.opencannabis.schema.crypto.primitives.SymmetricKey.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bits_ = 0;

      if (ivBuilder_ == null) {
        iv_ = null;
      } else {
        iv_ = null;
        ivBuilder_ = null;
      }
      dataCase_ = 0;
      data_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKey_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKey getDefaultInstanceForType() {
      return io.opencannabis.schema.crypto.primitives.SymmetricKey.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKey build() {
      io.opencannabis.schema.crypto.primitives.SymmetricKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKey buildPartial() {
      io.opencannabis.schema.crypto.primitives.SymmetricKey result = new io.opencannabis.schema.crypto.primitives.SymmetricKey(this);
      result.bits_ = bits_;
      if (ivBuilder_ == null) {
        result.iv_ = iv_;
      } else {
        result.iv_ = ivBuilder_.build();
      }
      if (dataCase_ == 10) {
        result.data_ = data_;
      }
      if (dataCase_ == 11) {
        result.data_ = data_;
      }
      result.dataCase_ = dataCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.opencannabis.schema.crypto.primitives.SymmetricKey) {
        return mergeFrom((io.opencannabis.schema.crypto.primitives.SymmetricKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.crypto.primitives.SymmetricKey other) {
      if (other == io.opencannabis.schema.crypto.primitives.SymmetricKey.getDefaultInstance()) return this;
      if (other.getBits() != 0) {
        setBits(other.getBits());
      }
      if (other.hasIv()) {
        mergeIv(other.getIv());
      }
      switch (other.getDataCase()) {
        case RAW: {
          setRaw(other.getRaw());
          break;
        }
        case B64: {
          dataCase_ = 11;
          data_ = other.data_;
          onChanged();
          break;
        }
        case DATA_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.opencannabis.schema.crypto.primitives.SymmetricKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.crypto.primitives.SymmetricKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int dataCase_ = 0;
    private java.lang.Object data_;
    public DataCase
        getDataCase() {
      return DataCase.forNumber(
          dataCase_);
    }

    public Builder clearData() {
      dataCase_ = 0;
      data_ = null;
      onChanged();
      return this;
    }


    private int bits_ ;
    /**
     * <pre>
     * Bit size for the underlying symmetric key.
     * </pre>
     *
     * <code>uint32 bits = 1;</code>
     */
    public int getBits() {
      return bits_;
    }
    /**
     * <pre>
     * Bit size for the underlying symmetric key.
     * </pre>
     *
     * <code>uint32 bits = 1;</code>
     */
    public Builder setBits(int value) {
      
      bits_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Bit size for the underlying symmetric key.
     * </pre>
     *
     * <code>uint32 bits = 1;</code>
     */
    public Builder clearBits() {
      
      bits_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.crypto.primitives.InitializationVector iv_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.InitializationVector, io.opencannabis.schema.crypto.primitives.InitializationVector.Builder, io.opencannabis.schema.crypto.primitives.InitializationVectorOrBuilder> ivBuilder_;
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public boolean hasIv() {
      return ivBuilder_ != null || iv_ != null;
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.InitializationVector getIv() {
      if (ivBuilder_ == null) {
        return iv_ == null ? io.opencannabis.schema.crypto.primitives.InitializationVector.getDefaultInstance() : iv_;
      } else {
        return ivBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public Builder setIv(io.opencannabis.schema.crypto.primitives.InitializationVector value) {
      if (ivBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        iv_ = value;
        onChanged();
      } else {
        ivBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public Builder setIv(
        io.opencannabis.schema.crypto.primitives.InitializationVector.Builder builderForValue) {
      if (ivBuilder_ == null) {
        iv_ = builderForValue.build();
        onChanged();
      } else {
        ivBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public Builder mergeIv(io.opencannabis.schema.crypto.primitives.InitializationVector value) {
      if (ivBuilder_ == null) {
        if (iv_ != null) {
          iv_ =
            io.opencannabis.schema.crypto.primitives.InitializationVector.newBuilder(iv_).mergeFrom(value).buildPartial();
        } else {
          iv_ = value;
        }
        onChanged();
      } else {
        ivBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public Builder clearIv() {
      if (ivBuilder_ == null) {
        iv_ = null;
        onChanged();
      } else {
        iv_ = null;
        ivBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.InitializationVector.Builder getIvBuilder() {
      
      onChanged();
      return getIvFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.InitializationVectorOrBuilder getIvOrBuilder() {
      if (ivBuilder_ != null) {
        return ivBuilder_.getMessageOrBuilder();
      } else {
        return iv_ == null ?
            io.opencannabis.schema.crypto.primitives.InitializationVector.getDefaultInstance() : iv_;
      }
    }
    /**
     * <pre>
     * Specifies an initialization vector value. Raw bytes should be encoded in Base64.
     * </pre>
     *
     * <code>.opencannabis.crypto.InitializationVector iv = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.InitializationVector, io.opencannabis.schema.crypto.primitives.InitializationVector.Builder, io.opencannabis.schema.crypto.primitives.InitializationVectorOrBuilder> 
        getIvFieldBuilder() {
      if (ivBuilder_ == null) {
        ivBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.crypto.primitives.InitializationVector, io.opencannabis.schema.crypto.primitives.InitializationVector.Builder, io.opencannabis.schema.crypto.primitives.InitializationVectorOrBuilder>(
                getIv(),
                getParentForChildren(),
                isClean());
        iv_ = null;
      }
      return ivBuilder_;
    }

    /**
     * <pre>
     * Specifies the raw bytes of the key.
     * </pre>
     *
     * <code>bytes raw = 10;</code>
     */
    public com.google.protobuf.ByteString getRaw() {
      if (dataCase_ == 10) {
        return (com.google.protobuf.ByteString) data_;
      }
      return com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * <pre>
     * Specifies the raw bytes of the key.
     * </pre>
     *
     * <code>bytes raw = 10;</code>
     */
    public Builder setRaw(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 10;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the raw bytes of the key.
     * </pre>
     *
     * <code>bytes raw = 10;</code>
     */
    public Builder clearRaw() {
      if (dataCase_ == 10) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <pre>
     * Specifies the key bytes, encoded in base64.
     * </pre>
     *
     * <code>string b64 = 11;</code>
     */
    public java.lang.String getB64() {
      java.lang.Object ref = "";
      if (dataCase_ == 11) {
        ref = data_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (dataCase_ == 11) {
          data_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the key bytes, encoded in base64.
     * </pre>
     *
     * <code>string b64 = 11;</code>
     */
    public com.google.protobuf.ByteString
        getB64Bytes() {
      java.lang.Object ref = "";
      if (dataCase_ == 11) {
        ref = data_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (dataCase_ == 11) {
          data_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the key bytes, encoded in base64.
     * </pre>
     *
     * <code>string b64 = 11;</code>
     */
    public Builder setB64(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  dataCase_ = 11;
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the key bytes, encoded in base64.
     * </pre>
     *
     * <code>string b64 = 11;</code>
     */
    public Builder clearB64() {
      if (dataCase_ == 11) {
        dataCase_ = 0;
        data_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies the key bytes, encoded in base64.
     * </pre>
     *
     * <code>string b64 = 11;</code>
     */
    public Builder setB64Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      dataCase_ = 11;
      data_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.crypto.SymmetricKey)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.crypto.SymmetricKey)
  private static final io.opencannabis.schema.crypto.primitives.SymmetricKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.crypto.primitives.SymmetricKey();
  }

  public static io.opencannabis.schema.crypto.primitives.SymmetricKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SymmetricKey>
      PARSER = new com.google.protobuf.AbstractParser<SymmetricKey>() {
    @java.lang.Override
    public SymmetricKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SymmetricKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SymmetricKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SymmetricKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.crypto.primitives.SymmetricKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

