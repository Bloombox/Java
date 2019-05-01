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
 * Specifies parameters that are applicable to symmetric keys, or, keys shared between parties and identically used for
 * encryption and decryption.
 * </pre>
 *
 * Protobuf type {@code opencannabis.crypto.SymmetricKeyParameters}
 */
public  final class SymmetricKeyParameters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.crypto.SymmetricKeyParameters)
    SymmetricKeyParametersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SymmetricKeyParameters.newBuilder() to construct.
  private SymmetricKeyParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SymmetricKeyParameters() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SymmetricKeyParameters(
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
            int rawValue = input.readEnum();
            cipherCase_ = 1;
            cipher_ = rawValue;
            break;
          }
          case 18: {
            io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder subBuilder = null;
            if (cipherCase_ == 2) {
              subBuilder = ((io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_).toBuilder();
            }
            cipher_ =
                input.readMessage(io.opencannabis.schema.crypto.primitives.BlockCipherParameters.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_);
              cipher_ = subBuilder.buildPartial();
            }
            cipherCase_ = 2;
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
    return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKeyParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.class, io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.Builder.class);
  }

  private int cipherCase_ = 0;
  private java.lang.Object cipher_;
  public enum CipherCase
      implements com.google.protobuf.Internal.EnumLite {
    STREAM(1),
    BLOCK(2),
    CIPHER_NOT_SET(0);
    private final int value;
    private CipherCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CipherCase valueOf(int value) {
      return forNumber(value);
    }

    public static CipherCase forNumber(int value) {
      switch (value) {
        case 1: return STREAM;
        case 2: return BLOCK;
        case 0: return CIPHER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public CipherCase
  getCipherCase() {
    return CipherCase.forNumber(
        cipherCase_);
  }

  public static final int STREAM_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Specifies a stream cipher.
   * </pre>
   *
   * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
   */
  public int getStreamValue() {
    if (cipherCase_ == 1) {
      return (java.lang.Integer) cipher_;
    }
    return 0;
  }
  /**
   * <pre>
   * Specifies a stream cipher.
   * </pre>
   *
   * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
   */
  public io.opencannabis.schema.crypto.primitives.StreamCipher getStream() {
    if (cipherCase_ == 1) {
      @SuppressWarnings("deprecation")
      io.opencannabis.schema.crypto.primitives.StreamCipher result = io.opencannabis.schema.crypto.primitives.StreamCipher.valueOf(
          (java.lang.Integer) cipher_);
      return result == null ? io.opencannabis.schema.crypto.primitives.StreamCipher.UNRECOGNIZED : result;
    }
    return io.opencannabis.schema.crypto.primitives.StreamCipher.UNSPECIFIED_STREAM_CIPHER;
  }

  public static final int BLOCK_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Specifies a block cipher.
   * </pre>
   *
   * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
   */
  public boolean hasBlock() {
    return cipherCase_ == 2;
  }
  /**
   * <pre>
   * Specifies a block cipher.
   * </pre>
   *
   * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
   */
  public io.opencannabis.schema.crypto.primitives.BlockCipherParameters getBlock() {
    if (cipherCase_ == 2) {
       return (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_;
    }
    return io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
  }
  /**
   * <pre>
   * Specifies a block cipher.
   * </pre>
   *
   * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
   */
  public io.opencannabis.schema.crypto.primitives.BlockCipherParametersOrBuilder getBlockOrBuilder() {
    if (cipherCase_ == 2) {
       return (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_;
    }
    return io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
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
    if (cipherCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) cipher_));
    }
    if (cipherCase_ == 2) {
      output.writeMessage(2, (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cipherCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) cipher_));
    }
    if (cipherCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_);
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
    if (!(obj instanceof io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters other = (io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters) obj;

    if (!getCipherCase().equals(other.getCipherCase())) return false;
    switch (cipherCase_) {
      case 1:
        if (getStreamValue()
            != other.getStreamValue()) return false;
        break;
      case 2:
        if (!getBlock()
            .equals(other.getBlock())) return false;
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
    switch (cipherCase_) {
      case 1:
        hash = (37 * hash) + STREAM_FIELD_NUMBER;
        hash = (53 * hash) + getStreamValue();
        break;
      case 2:
        hash = (37 * hash) + BLOCK_FIELD_NUMBER;
        hash = (53 * hash) + getBlock().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters prototype) {
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
   * Specifies parameters that are applicable to symmetric keys, or, keys shared between parties and identically used for
   * encryption and decryption.
   * </pre>
   *
   * Protobuf type {@code opencannabis.crypto.SymmetricKeyParameters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.crypto.SymmetricKeyParameters)
      io.opencannabis.schema.crypto.primitives.SymmetricKeyParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKeyParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.class, io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.Builder.class);
    }

    // Construct using io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.newBuilder()
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
      cipherCase_ = 0;
      cipher_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.crypto.primitives.Keys.internal_static_opencannabis_crypto_SymmetricKeyParameters_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters getDefaultInstanceForType() {
      return io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters build() {
      io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters buildPartial() {
      io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters result = new io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters(this);
      if (cipherCase_ == 1) {
        result.cipher_ = cipher_;
      }
      if (cipherCase_ == 2) {
        if (blockBuilder_ == null) {
          result.cipher_ = cipher_;
        } else {
          result.cipher_ = blockBuilder_.build();
        }
      }
      result.cipherCase_ = cipherCase_;
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
      if (other instanceof io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters) {
        return mergeFrom((io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters other) {
      if (other == io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters.getDefaultInstance()) return this;
      switch (other.getCipherCase()) {
        case STREAM: {
          setStreamValue(other.getStreamValue());
          break;
        }
        case BLOCK: {
          mergeBlock(other.getBlock());
          break;
        }
        case CIPHER_NOT_SET: {
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
      io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int cipherCase_ = 0;
    private java.lang.Object cipher_;
    public CipherCase
        getCipherCase() {
      return CipherCase.forNumber(
          cipherCase_);
    }

    public Builder clearCipher() {
      cipherCase_ = 0;
      cipher_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Specifies a stream cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
     */
    public int getStreamValue() {
      if (cipherCase_ == 1) {
        return ((java.lang.Integer) cipher_).intValue();
      }
      return 0;
    }
    /**
     * <pre>
     * Specifies a stream cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
     */
    public Builder setStreamValue(int value) {
      cipherCase_ = 1;
      cipher_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a stream cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
     */
    public io.opencannabis.schema.crypto.primitives.StreamCipher getStream() {
      if (cipherCase_ == 1) {
        @SuppressWarnings("deprecation")
        io.opencannabis.schema.crypto.primitives.StreamCipher result = io.opencannabis.schema.crypto.primitives.StreamCipher.valueOf(
            (java.lang.Integer) cipher_);
        return result == null ? io.opencannabis.schema.crypto.primitives.StreamCipher.UNRECOGNIZED : result;
      }
      return io.opencannabis.schema.crypto.primitives.StreamCipher.UNSPECIFIED_STREAM_CIPHER;
    }
    /**
     * <pre>
     * Specifies a stream cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
     */
    public Builder setStream(io.opencannabis.schema.crypto.primitives.StreamCipher value) {
      if (value == null) {
        throw new NullPointerException();
      }
      cipherCase_ = 1;
      cipher_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a stream cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.StreamCipher stream = 1;</code>
     */
    public Builder clearStream() {
      if (cipherCase_ == 1) {
        cipherCase_ = 0;
        cipher_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.BlockCipherParameters, io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder, io.opencannabis.schema.crypto.primitives.BlockCipherParametersOrBuilder> blockBuilder_;
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public boolean hasBlock() {
      return cipherCase_ == 2;
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.BlockCipherParameters getBlock() {
      if (blockBuilder_ == null) {
        if (cipherCase_ == 2) {
          return (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_;
        }
        return io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
      } else {
        if (cipherCase_ == 2) {
          return blockBuilder_.getMessage();
        }
        return io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public Builder setBlock(io.opencannabis.schema.crypto.primitives.BlockCipherParameters value) {
      if (blockBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cipher_ = value;
        onChanged();
      } else {
        blockBuilder_.setMessage(value);
      }
      cipherCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public Builder setBlock(
        io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder builderForValue) {
      if (blockBuilder_ == null) {
        cipher_ = builderForValue.build();
        onChanged();
      } else {
        blockBuilder_.setMessage(builderForValue.build());
      }
      cipherCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public Builder mergeBlock(io.opencannabis.schema.crypto.primitives.BlockCipherParameters value) {
      if (blockBuilder_ == null) {
        if (cipherCase_ == 2 &&
            cipher_ != io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance()) {
          cipher_ = io.opencannabis.schema.crypto.primitives.BlockCipherParameters.newBuilder((io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_)
              .mergeFrom(value).buildPartial();
        } else {
          cipher_ = value;
        }
        onChanged();
      } else {
        if (cipherCase_ == 2) {
          blockBuilder_.mergeFrom(value);
        }
        blockBuilder_.setMessage(value);
      }
      cipherCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public Builder clearBlock() {
      if (blockBuilder_ == null) {
        if (cipherCase_ == 2) {
          cipherCase_ = 0;
          cipher_ = null;
          onChanged();
        }
      } else {
        if (cipherCase_ == 2) {
          cipherCase_ = 0;
          cipher_ = null;
        }
        blockBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder getBlockBuilder() {
      return getBlockFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    public io.opencannabis.schema.crypto.primitives.BlockCipherParametersOrBuilder getBlockOrBuilder() {
      if ((cipherCase_ == 2) && (blockBuilder_ != null)) {
        return blockBuilder_.getMessageOrBuilder();
      } else {
        if (cipherCase_ == 2) {
          return (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_;
        }
        return io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies a block cipher.
     * </pre>
     *
     * <code>.opencannabis.crypto.BlockCipherParameters block = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.crypto.primitives.BlockCipherParameters, io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder, io.opencannabis.schema.crypto.primitives.BlockCipherParametersOrBuilder> 
        getBlockFieldBuilder() {
      if (blockBuilder_ == null) {
        if (!(cipherCase_ == 2)) {
          cipher_ = io.opencannabis.schema.crypto.primitives.BlockCipherParameters.getDefaultInstance();
        }
        blockBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.crypto.primitives.BlockCipherParameters, io.opencannabis.schema.crypto.primitives.BlockCipherParameters.Builder, io.opencannabis.schema.crypto.primitives.BlockCipherParametersOrBuilder>(
                (io.opencannabis.schema.crypto.primitives.BlockCipherParameters) cipher_,
                getParentForChildren(),
                isClean());
        cipher_ = null;
      }
      cipherCase_ = 2;
      onChanged();;
      return blockBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.crypto.SymmetricKeyParameters)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.crypto.SymmetricKeyParameters)
  private static final io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters();
  }

  public static io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SymmetricKeyParameters>
      PARSER = new com.google.protobuf.AbstractParser<SymmetricKeyParameters>() {
    @java.lang.Override
    public SymmetricKeyParameters parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SymmetricKeyParameters(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SymmetricKeyParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SymmetricKeyParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.crypto.primitives.SymmetricKeyParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

