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
// source: device/Device.proto

package io.opencannabis.schema.device;

/**
 * <pre>
 * Stateful flags that may be set on a device.
 * </pre>
 *
 * Protobuf type {@code opencannabis.device.DeviceFlags}
 */
public  final class DeviceFlags extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.device.DeviceFlags)
    DeviceFlagsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceFlags.newBuilder() to construct.
  private DeviceFlags(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceFlags() {
    ephemeral_ = false;
    managed_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceFlags(
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
          case 8: {

            ephemeral_ = input.readBool();
            break;
          }
          case 16: {

            managed_ = input.readBool();
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
    return io.opencannabis.schema.device.DeviceOuterClass.internal_static_opencannabis_device_DeviceFlags_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.device.DeviceOuterClass.internal_static_opencannabis_device_DeviceFlags_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.device.DeviceFlags.class, io.opencannabis.schema.device.DeviceFlags.Builder.class);
  }

  public static final int EPHEMERAL_FIELD_NUMBER = 1;
  private boolean ephemeral_;
  /**
   * <pre>
   * Flag to mark a device as ephemeral, i.e. attached to a disposable identity.
   * </pre>
   *
   * <code>bool ephemeral = 1 [(.gen_bq_schema.description) = "Flag to mark a device as ephemeral, i.e. attached to a disposable identity."];</code>
   */
  public boolean getEphemeral() {
    return ephemeral_;
  }

  public static final int MANAGED_FIELD_NUMBER = 2;
  private boolean managed_;
  /**
   * <pre>
   * Flag to mark a device as managed by EMM systems.
   * </pre>
   *
   * <code>bool managed = 2 [(.gen_bq_schema.description) = "Flag to mark a device as managed by EMM systems."];</code>
   */
  public boolean getManaged() {
    return managed_;
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
    if (ephemeral_ != false) {
      output.writeBool(1, ephemeral_);
    }
    if (managed_ != false) {
      output.writeBool(2, managed_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ephemeral_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, ephemeral_);
    }
    if (managed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, managed_);
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
    if (!(obj instanceof io.opencannabis.schema.device.DeviceFlags)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.device.DeviceFlags other = (io.opencannabis.schema.device.DeviceFlags) obj;

    boolean result = true;
    result = result && (getEphemeral()
        == other.getEphemeral());
    result = result && (getManaged()
        == other.getManaged());
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
    hash = (37 * hash) + EPHEMERAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEphemeral());
    hash = (37 * hash) + MANAGED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getManaged());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.device.DeviceFlags parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.device.DeviceFlags prototype) {
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
   * Stateful flags that may be set on a device.
   * </pre>
   *
   * Protobuf type {@code opencannabis.device.DeviceFlags}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.device.DeviceFlags)
      io.opencannabis.schema.device.DeviceFlagsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.device.DeviceOuterClass.internal_static_opencannabis_device_DeviceFlags_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.device.DeviceOuterClass.internal_static_opencannabis_device_DeviceFlags_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.device.DeviceFlags.class, io.opencannabis.schema.device.DeviceFlags.Builder.class);
    }

    // Construct using io.opencannabis.schema.device.DeviceFlags.newBuilder()
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
      ephemeral_ = false;

      managed_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.device.DeviceOuterClass.internal_static_opencannabis_device_DeviceFlags_descriptor;
    }

    public io.opencannabis.schema.device.DeviceFlags getDefaultInstanceForType() {
      return io.opencannabis.schema.device.DeviceFlags.getDefaultInstance();
    }

    public io.opencannabis.schema.device.DeviceFlags build() {
      io.opencannabis.schema.device.DeviceFlags result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.device.DeviceFlags buildPartial() {
      io.opencannabis.schema.device.DeviceFlags result = new io.opencannabis.schema.device.DeviceFlags(this);
      result.ephemeral_ = ephemeral_;
      result.managed_ = managed_;
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
      if (other instanceof io.opencannabis.schema.device.DeviceFlags) {
        return mergeFrom((io.opencannabis.schema.device.DeviceFlags)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.device.DeviceFlags other) {
      if (other == io.opencannabis.schema.device.DeviceFlags.getDefaultInstance()) return this;
      if (other.getEphemeral() != false) {
        setEphemeral(other.getEphemeral());
      }
      if (other.getManaged() != false) {
        setManaged(other.getManaged());
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
      io.opencannabis.schema.device.DeviceFlags parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.device.DeviceFlags) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean ephemeral_ ;
    /**
     * <pre>
     * Flag to mark a device as ephemeral, i.e. attached to a disposable identity.
     * </pre>
     *
     * <code>bool ephemeral = 1 [(.gen_bq_schema.description) = "Flag to mark a device as ephemeral, i.e. attached to a disposable identity."];</code>
     */
    public boolean getEphemeral() {
      return ephemeral_;
    }
    /**
     * <pre>
     * Flag to mark a device as ephemeral, i.e. attached to a disposable identity.
     * </pre>
     *
     * <code>bool ephemeral = 1 [(.gen_bq_schema.description) = "Flag to mark a device as ephemeral, i.e. attached to a disposable identity."];</code>
     */
    public Builder setEphemeral(boolean value) {
      
      ephemeral_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag to mark a device as ephemeral, i.e. attached to a disposable identity.
     * </pre>
     *
     * <code>bool ephemeral = 1 [(.gen_bq_schema.description) = "Flag to mark a device as ephemeral, i.e. attached to a disposable identity."];</code>
     */
    public Builder clearEphemeral() {
      
      ephemeral_ = false;
      onChanged();
      return this;
    }

    private boolean managed_ ;
    /**
     * <pre>
     * Flag to mark a device as managed by EMM systems.
     * </pre>
     *
     * <code>bool managed = 2 [(.gen_bq_schema.description) = "Flag to mark a device as managed by EMM systems."];</code>
     */
    public boolean getManaged() {
      return managed_;
    }
    /**
     * <pre>
     * Flag to mark a device as managed by EMM systems.
     * </pre>
     *
     * <code>bool managed = 2 [(.gen_bq_schema.description) = "Flag to mark a device as managed by EMM systems."];</code>
     */
    public Builder setManaged(boolean value) {
      
      managed_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag to mark a device as managed by EMM systems.
     * </pre>
     *
     * <code>bool managed = 2 [(.gen_bq_schema.description) = "Flag to mark a device as managed by EMM systems."];</code>
     */
    public Builder clearManaged() {
      
      managed_ = false;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.device.DeviceFlags)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.device.DeviceFlags)
  private static final io.opencannabis.schema.device.DeviceFlags DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.device.DeviceFlags();
  }

  public static io.opencannabis.schema.device.DeviceFlags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceFlags>
      PARSER = new com.google.protobuf.AbstractParser<DeviceFlags>() {
    public DeviceFlags parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceFlags(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceFlags> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceFlags> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.device.DeviceFlags getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

