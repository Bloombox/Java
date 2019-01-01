/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/Token.proto

package io.bloombox.schema.security;

/**
 * <pre>
 * Specifies an ID token, usually structured as a JWT.
 * </pre>
 *
 * Protobuf type {@code bloombox.security.IDToken}
 */
public  final class IDToken extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.security.IDToken)
    IDTokenOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IDToken.newBuilder() to construct.
  private IDToken(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IDToken() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IDToken(
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
            java.lang.String s = input.readStringRequireUtf8();
            payloadCase_ = 1;
            payload_ = s;
            break;
          }
          case 18: {
            io.bloombox.schema.security.IDTokenPayload.Builder subBuilder = null;
            if (payloadCase_ == 2) {
              subBuilder = ((io.bloombox.schema.security.IDTokenPayload) payload_).toBuilder();
            }
            payload_ =
                input.readMessage(io.bloombox.schema.security.IDTokenPayload.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.security.IDTokenPayload) payload_);
              payload_ = subBuilder.buildPartial();
            }
            payloadCase_ = 2;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return io.bloombox.schema.security.Token.internal_static_bloombox_security_IDToken_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.security.Token.internal_static_bloombox_security_IDToken_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.security.IDToken.class, io.bloombox.schema.security.IDToken.Builder.class);
  }

  private int payloadCase_ = 0;
  private java.lang.Object payload_;
  public enum PayloadCase
      implements com.google.protobuf.Internal.EnumLite {
    ENCODED(1),
    DATA(2),
    PAYLOAD_NOT_SET(0);
    private final int value;
    private PayloadCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PayloadCase valueOf(int value) {
      return forNumber(value);
    }

    public static PayloadCase forNumber(int value) {
      switch (value) {
        case 1: return ENCODED;
        case 2: return DATA;
        case 0: return PAYLOAD_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public PayloadCase
  getPayloadCase() {
    return PayloadCase.forNumber(
        payloadCase_);
  }

  public static final int ENCODED_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Encoded ID token.
   * </pre>
   *
   * <code>string encoded = 1;</code>
   */
  public java.lang.String getEncoded() {
    java.lang.Object ref = "";
    if (payloadCase_ == 1) {
      ref = payload_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (payloadCase_ == 1) {
        payload_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Encoded ID token.
   * </pre>
   *
   * <code>string encoded = 1;</code>
   */
  public com.google.protobuf.ByteString
      getEncodedBytes() {
    java.lang.Object ref = "";
    if (payloadCase_ == 1) {
      ref = payload_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (payloadCase_ == 1) {
        payload_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Parsed identity JWT payload.
   * </pre>
   *
   * <code>.bloombox.security.IDTokenPayload data = 2;</code>
   */
  public boolean hasData() {
    return payloadCase_ == 2;
  }
  /**
   * <pre>
   * Parsed identity JWT payload.
   * </pre>
   *
   * <code>.bloombox.security.IDTokenPayload data = 2;</code>
   */
  public io.bloombox.schema.security.IDTokenPayload getData() {
    if (payloadCase_ == 2) {
       return (io.bloombox.schema.security.IDTokenPayload) payload_;
    }
    return io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
  }
  /**
   * <pre>
   * Parsed identity JWT payload.
   * </pre>
   *
   * <code>.bloombox.security.IDTokenPayload data = 2;</code>
   */
  public io.bloombox.schema.security.IDTokenPayloadOrBuilder getDataOrBuilder() {
    if (payloadCase_ == 2) {
       return (io.bloombox.schema.security.IDTokenPayload) payload_;
    }
    return io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
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
    if (payloadCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, payload_);
    }
    if (payloadCase_ == 2) {
      output.writeMessage(2, (io.bloombox.schema.security.IDTokenPayload) payload_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (payloadCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, payload_);
    }
    if (payloadCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.bloombox.schema.security.IDTokenPayload) payload_);
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
    if (!(obj instanceof io.bloombox.schema.security.IDToken)) {
      return super.equals(obj);
    }
    io.bloombox.schema.security.IDToken other = (io.bloombox.schema.security.IDToken) obj;

    boolean result = true;
    result = result && getPayloadCase().equals(
        other.getPayloadCase());
    if (!result) return false;
    switch (payloadCase_) {
      case 1:
        result = result && getEncoded()
            .equals(other.getEncoded());
        break;
      case 2:
        result = result && getData()
            .equals(other.getData());
        break;
      case 0:
      default:
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
    switch (payloadCase_) {
      case 1:
        hash = (37 * hash) + ENCODED_FIELD_NUMBER;
        hash = (53 * hash) + getEncoded().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATA_FIELD_NUMBER;
        hash = (53 * hash) + getData().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.security.IDToken parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.security.IDToken parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IDToken parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.security.IDToken parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.security.IDToken prototype) {
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
   * Specifies an ID token, usually structured as a JWT.
   * </pre>
   *
   * Protobuf type {@code bloombox.security.IDToken}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.security.IDToken)
      io.bloombox.schema.security.IDTokenOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.security.Token.internal_static_bloombox_security_IDToken_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.security.Token.internal_static_bloombox_security_IDToken_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.security.IDToken.class, io.bloombox.schema.security.IDToken.Builder.class);
    }

    // Construct using io.bloombox.schema.security.IDToken.newBuilder()
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
      payloadCase_ = 0;
      payload_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.security.Token.internal_static_bloombox_security_IDToken_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.security.IDToken getDefaultInstanceForType() {
      return io.bloombox.schema.security.IDToken.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.security.IDToken build() {
      io.bloombox.schema.security.IDToken result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.security.IDToken buildPartial() {
      io.bloombox.schema.security.IDToken result = new io.bloombox.schema.security.IDToken(this);
      if (payloadCase_ == 1) {
        result.payload_ = payload_;
      }
      if (payloadCase_ == 2) {
        if (dataBuilder_ == null) {
          result.payload_ = payload_;
        } else {
          result.payload_ = dataBuilder_.build();
        }
      }
      result.payloadCase_ = payloadCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.security.IDToken) {
        return mergeFrom((io.bloombox.schema.security.IDToken)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.security.IDToken other) {
      if (other == io.bloombox.schema.security.IDToken.getDefaultInstance()) return this;
      switch (other.getPayloadCase()) {
        case ENCODED: {
          payloadCase_ = 1;
          payload_ = other.payload_;
          onChanged();
          break;
        }
        case DATA: {
          mergeData(other.getData());
          break;
        }
        case PAYLOAD_NOT_SET: {
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
      io.bloombox.schema.security.IDToken parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.security.IDToken) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int payloadCase_ = 0;
    private java.lang.Object payload_;
    public PayloadCase
        getPayloadCase() {
      return PayloadCase.forNumber(
          payloadCase_);
    }

    public Builder clearPayload() {
      payloadCase_ = 0;
      payload_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Encoded ID token.
     * </pre>
     *
     * <code>string encoded = 1;</code>
     */
    public java.lang.String getEncoded() {
      java.lang.Object ref = "";
      if (payloadCase_ == 1) {
        ref = payload_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (payloadCase_ == 1) {
          payload_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Encoded ID token.
     * </pre>
     *
     * <code>string encoded = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEncodedBytes() {
      java.lang.Object ref = "";
      if (payloadCase_ == 1) {
        ref = payload_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (payloadCase_ == 1) {
          payload_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Encoded ID token.
     * </pre>
     *
     * <code>string encoded = 1;</code>
     */
    public Builder setEncoded(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  payloadCase_ = 1;
      payload_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Encoded ID token.
     * </pre>
     *
     * <code>string encoded = 1;</code>
     */
    public Builder clearEncoded() {
      if (payloadCase_ == 1) {
        payloadCase_ = 0;
        payload_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Encoded ID token.
     * </pre>
     *
     * <code>string encoded = 1;</code>
     */
    public Builder setEncodedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      payloadCase_ = 1;
      payload_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.security.IDTokenPayload, io.bloombox.schema.security.IDTokenPayload.Builder, io.bloombox.schema.security.IDTokenPayloadOrBuilder> dataBuilder_;
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public boolean hasData() {
      return payloadCase_ == 2;
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public io.bloombox.schema.security.IDTokenPayload getData() {
      if (dataBuilder_ == null) {
        if (payloadCase_ == 2) {
          return (io.bloombox.schema.security.IDTokenPayload) payload_;
        }
        return io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
      } else {
        if (payloadCase_ == 2) {
          return dataBuilder_.getMessage();
        }
        return io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public Builder setData(io.bloombox.schema.security.IDTokenPayload value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        payload_ = value;
        onChanged();
      } else {
        dataBuilder_.setMessage(value);
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public Builder setData(
        io.bloombox.schema.security.IDTokenPayload.Builder builderForValue) {
      if (dataBuilder_ == null) {
        payload_ = builderForValue.build();
        onChanged();
      } else {
        dataBuilder_.setMessage(builderForValue.build());
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public Builder mergeData(io.bloombox.schema.security.IDTokenPayload value) {
      if (dataBuilder_ == null) {
        if (payloadCase_ == 2 &&
            payload_ != io.bloombox.schema.security.IDTokenPayload.getDefaultInstance()) {
          payload_ = io.bloombox.schema.security.IDTokenPayload.newBuilder((io.bloombox.schema.security.IDTokenPayload) payload_)
              .mergeFrom(value).buildPartial();
        } else {
          payload_ = value;
        }
        onChanged();
      } else {
        if (payloadCase_ == 2) {
          dataBuilder_.mergeFrom(value);
        }
        dataBuilder_.setMessage(value);
      }
      payloadCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        if (payloadCase_ == 2) {
          payloadCase_ = 0;
          payload_ = null;
          onChanged();
        }
      } else {
        if (payloadCase_ == 2) {
          payloadCase_ = 0;
          payload_ = null;
        }
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public io.bloombox.schema.security.IDTokenPayload.Builder getDataBuilder() {
      return getDataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    public io.bloombox.schema.security.IDTokenPayloadOrBuilder getDataOrBuilder() {
      if ((payloadCase_ == 2) && (dataBuilder_ != null)) {
        return dataBuilder_.getMessageOrBuilder();
      } else {
        if (payloadCase_ == 2) {
          return (io.bloombox.schema.security.IDTokenPayload) payload_;
        }
        return io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Parsed identity JWT payload.
     * </pre>
     *
     * <code>.bloombox.security.IDTokenPayload data = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.security.IDTokenPayload, io.bloombox.schema.security.IDTokenPayload.Builder, io.bloombox.schema.security.IDTokenPayloadOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        if (!(payloadCase_ == 2)) {
          payload_ = io.bloombox.schema.security.IDTokenPayload.getDefaultInstance();
        }
        dataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.security.IDTokenPayload, io.bloombox.schema.security.IDTokenPayload.Builder, io.bloombox.schema.security.IDTokenPayloadOrBuilder>(
                (io.bloombox.schema.security.IDTokenPayload) payload_,
                getParentForChildren(),
                isClean());
        payload_ = null;
      }
      payloadCase_ = 2;
      onChanged();;
      return dataBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.security.IDToken)
  }

  // @@protoc_insertion_point(class_scope:bloombox.security.IDToken)
  private static final io.bloombox.schema.security.IDToken DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.security.IDToken();
  }

  public static io.bloombox.schema.security.IDToken getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IDToken>
      PARSER = new com.google.protobuf.AbstractParser<IDToken>() {
    @java.lang.Override
    public IDToken parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IDToken(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IDToken> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IDToken> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.security.IDToken getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

