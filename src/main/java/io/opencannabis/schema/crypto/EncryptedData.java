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
// source: crypto/Container.proto

package io.opencannabis.schema.crypto;

/**
 * <pre>
 * Carries a payload of arbitrary data, that is supposedly encrypted in some manner.
 * </pre>
 *
 * Protobuf type {@code opencannabis.crypto.EncryptedData}
 */
public  final class EncryptedData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.crypto.EncryptedData)
    EncryptedDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EncryptedData.newBuilder() to construct.
  private EncryptedData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EncryptedData() {
    data_ = com.google.protobuf.ByteString.EMPTY;
    encoding_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EncryptedData(
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
          case 10: {

            data_ = input.readBytes();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            encoding_ = rawValue;
            break;
          }
          case 26: {
            io.opencannabis.schema.base.BaseCompression.Compression.Builder subBuilder = null;
            if (compression_ != null) {
              subBuilder = compression_.toBuilder();
            }
            compression_ = input.readMessage(io.opencannabis.schema.base.BaseCompression.Compression.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(compression_);
              compression_ = subBuilder.buildPartial();
            }

            break;
          }
          case 34: {
            io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder subBuilder = null;
            if (fingerprint_ != null) {
              subBuilder = fingerprint_.toBuilder();
            }
            fingerprint_ = input.readMessage(io.opencannabis.schema.crypto.primitives.integrity.Hash.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fingerprint_);
              fingerprint_ = subBuilder.buildPartial();
            }

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
    return io.opencannabis.schema.crypto.Container.internal_static_opencannabis_crypto_EncryptedData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.crypto.Container.internal_static_opencannabis_crypto_EncryptedData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.crypto.EncryptedData.class, io.opencannabis.schema.crypto.EncryptedData.Builder.class);
  }

  public static final int DATA_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString data_;
  /**
   * <pre>
   * Ciphertext, i.e., data contained in the encrypted container.
   * </pre>
   *
   * <code>bytes data = 1;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int ENCODING_FIELD_NUMBER = 2;
  private int encoding_;
  /**
   * <pre>
   * Content encoding for the raw ciphertext data specified.
   * </pre>
   *
   * <code>.opencannabis.content.Encoding encoding = 2;</code>
   */
  public int getEncodingValue() {
    return encoding_;
  }
  /**
   * <pre>
   * Content encoding for the raw ciphertext data specified.
   * </pre>
   *
   * <code>.opencannabis.content.Encoding encoding = 2;</code>
   */
  public io.opencannabis.schema.content.GenericContent.Encoding getEncoding() {
    @SuppressWarnings("deprecation")
    io.opencannabis.schema.content.GenericContent.Encoding result = io.opencannabis.schema.content.GenericContent.Encoding.valueOf(encoding_);
    return result == null ? io.opencannabis.schema.content.GenericContent.Encoding.UNRECOGNIZED : result;
  }

  public static final int COMPRESSION_FIELD_NUMBER = 3;
  private io.opencannabis.schema.base.BaseCompression.Compression compression_;
  /**
   * <pre>
   * Compression applied to the cleartext, if applicable and specified.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 3;</code>
   */
  public boolean hasCompression() {
    return compression_ != null;
  }
  /**
   * <pre>
   * Compression applied to the cleartext, if applicable and specified.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 3;</code>
   */
  public io.opencannabis.schema.base.BaseCompression.Compression getCompression() {
    return compression_ == null ? io.opencannabis.schema.base.BaseCompression.Compression.getDefaultInstance() : compression_;
  }
  /**
   * <pre>
   * Compression applied to the cleartext, if applicable and specified.
   * </pre>
   *
   * <code>.opencannabis.base.Compression compression = 3;</code>
   */
  public io.opencannabis.schema.base.BaseCompression.CompressionOrBuilder getCompressionOrBuilder() {
    return getCompression();
  }

  public static final int FINGERPRINT_FIELD_NUMBER = 4;
  private io.opencannabis.schema.crypto.primitives.integrity.Hash fingerprint_;
  /**
   * <pre>
   * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
   * </pre>
   *
   * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
   */
  public boolean hasFingerprint() {
    return fingerprint_ != null;
  }
  /**
   * <pre>
   * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
   * </pre>
   *
   * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
   */
  public io.opencannabis.schema.crypto.primitives.integrity.Hash getFingerprint() {
    return fingerprint_ == null ? io.opencannabis.schema.crypto.primitives.integrity.Hash.getDefaultInstance() : fingerprint_;
  }
  /**
   * <pre>
   * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
   * </pre>
   *
   * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
   */
  public io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder getFingerprintOrBuilder() {
    return getFingerprint();
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
    if (!data_.isEmpty()) {
      output.writeBytes(1, data_);
    }
    if (encoding_ != io.opencannabis.schema.content.GenericContent.Encoding.UTF8.getNumber()) {
      output.writeEnum(2, encoding_);
    }
    if (compression_ != null) {
      output.writeMessage(3, getCompression());
    }
    if (fingerprint_ != null) {
      output.writeMessage(4, getFingerprint());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, data_);
    }
    if (encoding_ != io.opencannabis.schema.content.GenericContent.Encoding.UTF8.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, encoding_);
    }
    if (compression_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCompression());
    }
    if (fingerprint_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFingerprint());
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
    if (!(obj instanceof io.opencannabis.schema.crypto.EncryptedData)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.crypto.EncryptedData other = (io.opencannabis.schema.crypto.EncryptedData) obj;

    if (!getData()
        .equals(other.getData())) return false;
    if (encoding_ != other.encoding_) return false;
    if (hasCompression() != other.hasCompression()) return false;
    if (hasCompression()) {
      if (!getCompression()
          .equals(other.getCompression())) return false;
    }
    if (hasFingerprint() != other.hasFingerprint()) return false;
    if (hasFingerprint()) {
      if (!getFingerprint()
          .equals(other.getFingerprint())) return false;
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
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + ENCODING_FIELD_NUMBER;
    hash = (53 * hash) + encoding_;
    if (hasCompression()) {
      hash = (37 * hash) + COMPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getCompression().hashCode();
    }
    if (hasFingerprint()) {
      hash = (37 * hash) + FINGERPRINT_FIELD_NUMBER;
      hash = (53 * hash) + getFingerprint().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.EncryptedData parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.crypto.EncryptedData prototype) {
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
   * Carries a payload of arbitrary data, that is supposedly encrypted in some manner.
   * </pre>
   *
   * Protobuf type {@code opencannabis.crypto.EncryptedData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.crypto.EncryptedData)
      io.opencannabis.schema.crypto.EncryptedDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.crypto.Container.internal_static_opencannabis_crypto_EncryptedData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.crypto.Container.internal_static_opencannabis_crypto_EncryptedData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.crypto.EncryptedData.class, io.opencannabis.schema.crypto.EncryptedData.Builder.class);
    }

    // Construct using io.opencannabis.schema.crypto.EncryptedData.newBuilder()
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
      data_ = com.google.protobuf.ByteString.EMPTY;

      encoding_ = 0;

      if (compressionBuilder_ == null) {
        compression_ = null;
      } else {
        compression_ = null;
        compressionBuilder_ = null;
      }
      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
      } else {
        fingerprint_ = null;
        fingerprintBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.crypto.Container.internal_static_opencannabis_crypto_EncryptedData_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.EncryptedData getDefaultInstanceForType() {
      return io.opencannabis.schema.crypto.EncryptedData.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.EncryptedData build() {
      io.opencannabis.schema.crypto.EncryptedData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.EncryptedData buildPartial() {
      io.opencannabis.schema.crypto.EncryptedData result = new io.opencannabis.schema.crypto.EncryptedData(this);
      result.data_ = data_;
      result.encoding_ = encoding_;
      if (compressionBuilder_ == null) {
        result.compression_ = compression_;
      } else {
        result.compression_ = compressionBuilder_.build();
      }
      if (fingerprintBuilder_ == null) {
        result.fingerprint_ = fingerprint_;
      } else {
        result.fingerprint_ = fingerprintBuilder_.build();
      }
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
      if (other instanceof io.opencannabis.schema.crypto.EncryptedData) {
        return mergeFrom((io.opencannabis.schema.crypto.EncryptedData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.crypto.EncryptedData other) {
      if (other == io.opencannabis.schema.crypto.EncryptedData.getDefaultInstance()) return this;
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (other.encoding_ != 0) {
        setEncodingValue(other.getEncodingValue());
      }
      if (other.hasCompression()) {
        mergeCompression(other.getCompression());
      }
      if (other.hasFingerprint()) {
        mergeFingerprint(other.getFingerprint());
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
      io.opencannabis.schema.crypto.EncryptedData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.crypto.EncryptedData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Ciphertext, i.e., data contained in the encrypted container.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * Ciphertext, i.e., data contained in the encrypted container.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Ciphertext, i.e., data contained in the encrypted container.
     * </pre>
     *
     * <code>bytes data = 1;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private int encoding_ = 0;
    /**
     * <pre>
     * Content encoding for the raw ciphertext data specified.
     * </pre>
     *
     * <code>.opencannabis.content.Encoding encoding = 2;</code>
     */
    public int getEncodingValue() {
      return encoding_;
    }
    /**
     * <pre>
     * Content encoding for the raw ciphertext data specified.
     * </pre>
     *
     * <code>.opencannabis.content.Encoding encoding = 2;</code>
     */
    public Builder setEncodingValue(int value) {
      encoding_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content encoding for the raw ciphertext data specified.
     * </pre>
     *
     * <code>.opencannabis.content.Encoding encoding = 2;</code>
     */
    public io.opencannabis.schema.content.GenericContent.Encoding getEncoding() {
      @SuppressWarnings("deprecation")
      io.opencannabis.schema.content.GenericContent.Encoding result = io.opencannabis.schema.content.GenericContent.Encoding.valueOf(encoding_);
      return result == null ? io.opencannabis.schema.content.GenericContent.Encoding.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Content encoding for the raw ciphertext data specified.
     * </pre>
     *
     * <code>.opencannabis.content.Encoding encoding = 2;</code>
     */
    public Builder setEncoding(io.opencannabis.schema.content.GenericContent.Encoding value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      encoding_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Content encoding for the raw ciphertext data specified.
     * </pre>
     *
     * <code>.opencannabis.content.Encoding encoding = 2;</code>
     */
    public Builder clearEncoding() {
      
      encoding_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.base.BaseCompression.Compression compression_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.BaseCompression.Compression, io.opencannabis.schema.base.BaseCompression.Compression.Builder, io.opencannabis.schema.base.BaseCompression.CompressionOrBuilder> compressionBuilder_;
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public boolean hasCompression() {
      return compressionBuilder_ != null || compression_ != null;
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public io.opencannabis.schema.base.BaseCompression.Compression getCompression() {
      if (compressionBuilder_ == null) {
        return compression_ == null ? io.opencannabis.schema.base.BaseCompression.Compression.getDefaultInstance() : compression_;
      } else {
        return compressionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public Builder setCompression(io.opencannabis.schema.base.BaseCompression.Compression value) {
      if (compressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        compression_ = value;
        onChanged();
      } else {
        compressionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public Builder setCompression(
        io.opencannabis.schema.base.BaseCompression.Compression.Builder builderForValue) {
      if (compressionBuilder_ == null) {
        compression_ = builderForValue.build();
        onChanged();
      } else {
        compressionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public Builder mergeCompression(io.opencannabis.schema.base.BaseCompression.Compression value) {
      if (compressionBuilder_ == null) {
        if (compression_ != null) {
          compression_ =
            io.opencannabis.schema.base.BaseCompression.Compression.newBuilder(compression_).mergeFrom(value).buildPartial();
        } else {
          compression_ = value;
        }
        onChanged();
      } else {
        compressionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public Builder clearCompression() {
      if (compressionBuilder_ == null) {
        compression_ = null;
        onChanged();
      } else {
        compression_ = null;
        compressionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public io.opencannabis.schema.base.BaseCompression.Compression.Builder getCompressionBuilder() {
      
      onChanged();
      return getCompressionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    public io.opencannabis.schema.base.BaseCompression.CompressionOrBuilder getCompressionOrBuilder() {
      if (compressionBuilder_ != null) {
        return compressionBuilder_.getMessageOrBuilder();
      } else {
        return compression_ == null ?
            io.opencannabis.schema.base.BaseCompression.Compression.getDefaultInstance() : compression_;
      }
    }
    /**
     * <pre>
     * Compression applied to the cleartext, if applicable and specified.
     * </pre>
     *
     * <code>.opencannabis.base.Compression compression = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.BaseCompression.Compression, io.opencannabis.schema.base.BaseCompression.Compression.Builder, io.opencannabis.schema.base.BaseCompression.CompressionOrBuilder> 
        getCompressionFieldBuilder() {
      if (compressionBuilder_ == null) {
        compressionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.base.BaseCompression.Compression, io.opencannabis.schema.base.BaseCompression.Compression.Builder, io.opencannabis.schema.base.BaseCompression.CompressionOrBuilder>(
                getCompression(),
                getParentForChildren(),
                isClean());
        compression_ = null;
      }
      return compressionBuilder_;
    }

    private io.opencannabis.schema.crypto.primitives.integrity.Hash fingerprint_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.integrity.Hash, io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder, io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder> fingerprintBuilder_;
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public boolean hasFingerprint() {
      return fingerprintBuilder_ != null || fingerprint_ != null;
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public io.opencannabis.schema.crypto.primitives.integrity.Hash getFingerprint() {
      if (fingerprintBuilder_ == null) {
        return fingerprint_ == null ? io.opencannabis.schema.crypto.primitives.integrity.Hash.getDefaultInstance() : fingerprint_;
      } else {
        return fingerprintBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public Builder setFingerprint(io.opencannabis.schema.crypto.primitives.integrity.Hash value) {
      if (fingerprintBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fingerprint_ = value;
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public Builder setFingerprint(
        io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder builderForValue) {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = builderForValue.build();
        onChanged();
      } else {
        fingerprintBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public Builder mergeFingerprint(io.opencannabis.schema.crypto.primitives.integrity.Hash value) {
      if (fingerprintBuilder_ == null) {
        if (fingerprint_ != null) {
          fingerprint_ =
            io.opencannabis.schema.crypto.primitives.integrity.Hash.newBuilder(fingerprint_).mergeFrom(value).buildPartial();
        } else {
          fingerprint_ = value;
        }
        onChanged();
      } else {
        fingerprintBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public Builder clearFingerprint() {
      if (fingerprintBuilder_ == null) {
        fingerprint_ = null;
        onChanged();
      } else {
        fingerprint_ = null;
        fingerprintBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder getFingerprintBuilder() {
      
      onChanged();
      return getFingerprintFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    public io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder getFingerprintOrBuilder() {
      if (fingerprintBuilder_ != null) {
        return fingerprintBuilder_.getMessageOrBuilder();
      } else {
        return fingerprint_ == null ?
            io.opencannabis.schema.crypto.primitives.integrity.Hash.getDefaultInstance() : fingerprint_;
      }
    }
    /**
     * <pre>
     * Cryptographic fingerprint of the ciphertext data. If compression is active, this is applied beforehand.
     * </pre>
     *
     * <code>.opencannabis.crypto.Hash fingerprint = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.integrity.Hash, io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder, io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder> 
        getFingerprintFieldBuilder() {
      if (fingerprintBuilder_ == null) {
        fingerprintBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.crypto.primitives.integrity.Hash, io.opencannabis.schema.crypto.primitives.integrity.Hash.Builder, io.opencannabis.schema.crypto.primitives.integrity.HashOrBuilder>(
                getFingerprint(),
                getParentForChildren(),
                isClean());
        fingerprint_ = null;
      }
      return fingerprintBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.crypto.EncryptedData)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.crypto.EncryptedData)
  private static final io.opencannabis.schema.crypto.EncryptedData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.crypto.EncryptedData();
  }

  public static io.opencannabis.schema.crypto.EncryptedData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EncryptedData>
      PARSER = new com.google.protobuf.AbstractParser<EncryptedData>() {
    @java.lang.Override
    public EncryptedData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EncryptedData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EncryptedData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EncryptedData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.crypto.EncryptedData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

