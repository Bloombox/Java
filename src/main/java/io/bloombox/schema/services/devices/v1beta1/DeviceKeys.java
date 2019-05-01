/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
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
// source: devices/v1beta1/DevicesService_Beta1.proto

package io.bloombox.schema.services.devices.v1beta1;

/**
 * <pre>
 * Credentials an activated partner device should make use of when communicating with server-side systems.
 * </pre>
 *
 * Protobuf type {@code bloombox.services.devices.v1beta1.DeviceKeys}
 */
public  final class DeviceKeys extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.services.devices.v1beta1.DeviceKeys)
    DeviceKeysOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceKeys.newBuilder() to construct.
  private DeviceKeys(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceKeys() {
    api_ = "";
    telemetry_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceKeys(
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

            api_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            telemetry_ = s;
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
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_bloombox_services_devices_v1beta1_DeviceKeys_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_bloombox_services_devices_v1beta1_DeviceKeys_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.devices.v1beta1.DeviceKeys.class, io.bloombox.schema.services.devices.v1beta1.DeviceKeys.Builder.class);
  }

  public static final int API_FIELD_NUMBER = 1;
  private volatile java.lang.Object api_;
  /**
   * <pre>
   * Generic API key to use, if applicable.
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  public java.lang.String getApi() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      api_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Generic API key to use, if applicable.
   * </pre>
   *
   * <code>string api = 1;</code>
   */
  public com.google.protobuf.ByteString
      getApiBytes() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      api_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TELEMETRY_FIELD_NUMBER = 2;
  private volatile java.lang.Object telemetry_;
  /**
   * <pre>
   * Analytics API key to use, if applicable.
   * </pre>
   *
   * <code>string telemetry = 2;</code>
   */
  public java.lang.String getTelemetry() {
    java.lang.Object ref = telemetry_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      telemetry_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Analytics API key to use, if applicable.
   * </pre>
   *
   * <code>string telemetry = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTelemetryBytes() {
    java.lang.Object ref = telemetry_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      telemetry_ = b;
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
    if (!getApiBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, api_);
    }
    if (!getTelemetryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, telemetry_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getApiBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, api_);
    }
    if (!getTelemetryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, telemetry_);
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
    if (!(obj instanceof io.bloombox.schema.services.devices.v1beta1.DeviceKeys)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.devices.v1beta1.DeviceKeys other = (io.bloombox.schema.services.devices.v1beta1.DeviceKeys) obj;

    if (!getApi()
        .equals(other.getApi())) return false;
    if (!getTelemetry()
        .equals(other.getTelemetry())) return false;
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
    hash = (37 * hash) + API_FIELD_NUMBER;
    hash = (53 * hash) + getApi().hashCode();
    hash = (37 * hash) + TELEMETRY_FIELD_NUMBER;
    hash = (53 * hash) + getTelemetry().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.devices.v1beta1.DeviceKeys prototype) {
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
   * Credentials an activated partner device should make use of when communicating with server-side systems.
   * </pre>
   *
   * Protobuf type {@code bloombox.services.devices.v1beta1.DeviceKeys}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.services.devices.v1beta1.DeviceKeys)
      io.bloombox.schema.services.devices.v1beta1.DeviceKeysOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_bloombox_services_devices_v1beta1_DeviceKeys_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_bloombox_services_devices_v1beta1_DeviceKeys_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.devices.v1beta1.DeviceKeys.class, io.bloombox.schema.services.devices.v1beta1.DeviceKeys.Builder.class);
    }

    // Construct using io.bloombox.schema.services.devices.v1beta1.DeviceKeys.newBuilder()
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
      api_ = "";

      telemetry_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_bloombox_services_devices_v1beta1_DeviceKeys_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.services.devices.v1beta1.DeviceKeys getDefaultInstanceForType() {
      return io.bloombox.schema.services.devices.v1beta1.DeviceKeys.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.services.devices.v1beta1.DeviceKeys build() {
      io.bloombox.schema.services.devices.v1beta1.DeviceKeys result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.services.devices.v1beta1.DeviceKeys buildPartial() {
      io.bloombox.schema.services.devices.v1beta1.DeviceKeys result = new io.bloombox.schema.services.devices.v1beta1.DeviceKeys(this);
      result.api_ = api_;
      result.telemetry_ = telemetry_;
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
      if (other instanceof io.bloombox.schema.services.devices.v1beta1.DeviceKeys) {
        return mergeFrom((io.bloombox.schema.services.devices.v1beta1.DeviceKeys)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.devices.v1beta1.DeviceKeys other) {
      if (other == io.bloombox.schema.services.devices.v1beta1.DeviceKeys.getDefaultInstance()) return this;
      if (!other.getApi().isEmpty()) {
        api_ = other.api_;
        onChanged();
      }
      if (!other.getTelemetry().isEmpty()) {
        telemetry_ = other.telemetry_;
        onChanged();
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
      io.bloombox.schema.services.devices.v1beta1.DeviceKeys parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.devices.v1beta1.DeviceKeys) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object api_ = "";
    /**
     * <pre>
     * Generic API key to use, if applicable.
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public java.lang.String getApi() {
      java.lang.Object ref = api_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        api_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Generic API key to use, if applicable.
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public com.google.protobuf.ByteString
        getApiBytes() {
      java.lang.Object ref = api_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        api_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Generic API key to use, if applicable.
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder setApi(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      api_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generic API key to use, if applicable.
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder clearApi() {
      
      api_ = getDefaultInstance().getApi();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Generic API key to use, if applicable.
     * </pre>
     *
     * <code>string api = 1;</code>
     */
    public Builder setApiBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      api_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object telemetry_ = "";
    /**
     * <pre>
     * Analytics API key to use, if applicable.
     * </pre>
     *
     * <code>string telemetry = 2;</code>
     */
    public java.lang.String getTelemetry() {
      java.lang.Object ref = telemetry_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        telemetry_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Analytics API key to use, if applicable.
     * </pre>
     *
     * <code>string telemetry = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTelemetryBytes() {
      java.lang.Object ref = telemetry_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        telemetry_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Analytics API key to use, if applicable.
     * </pre>
     *
     * <code>string telemetry = 2;</code>
     */
    public Builder setTelemetry(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      telemetry_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Analytics API key to use, if applicable.
     * </pre>
     *
     * <code>string telemetry = 2;</code>
     */
    public Builder clearTelemetry() {
      
      telemetry_ = getDefaultInstance().getTelemetry();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Analytics API key to use, if applicable.
     * </pre>
     *
     * <code>string telemetry = 2;</code>
     */
    public Builder setTelemetryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      telemetry_ = value;
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


    // @@protoc_insertion_point(builder_scope:bloombox.services.devices.v1beta1.DeviceKeys)
  }

  // @@protoc_insertion_point(class_scope:bloombox.services.devices.v1beta1.DeviceKeys)
  private static final io.bloombox.schema.services.devices.v1beta1.DeviceKeys DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.devices.v1beta1.DeviceKeys();
  }

  public static io.bloombox.schema.services.devices.v1beta1.DeviceKeys getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceKeys>
      PARSER = new com.google.protobuf.AbstractParser<DeviceKeys>() {
    @java.lang.Override
    public DeviceKeys parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceKeys(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceKeys> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceKeys> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.services.devices.v1beta1.DeviceKeys getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

