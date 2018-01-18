/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
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
 * Describes a device's assignment information, in terms of its role, and also the partner/location it is co-located
 * with.
 * </pre>
 *
 * Protobuf type {@code services.devices.v1beta1.DeviceAssignment}
 */
public  final class DeviceAssignment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.devices.v1beta1.DeviceAssignment)
    DeviceAssignmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DeviceAssignment.newBuilder() to construct.
  private DeviceAssignment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DeviceAssignment() {
    partner_ = "";
    location_ = "";
    role_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DeviceAssignment(
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

            partner_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            location_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            role_ = rawValue;
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
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_services_devices_v1beta1_DeviceAssignment_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_services_devices_v1beta1_DeviceAssignment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.class, io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.Builder.class);
  }

  public static final int PARTNER_FIELD_NUMBER = 1;
  private volatile java.lang.Object partner_;
  /**
   * <pre>
   * Partner code for the device assignment.
   * </pre>
   *
   * <code>string partner = 1;</code>
   */
  public java.lang.String getPartner() {
    java.lang.Object ref = partner_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partner_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Partner code for the device assignment.
   * </pre>
   *
   * <code>string partner = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPartnerBytes() {
    java.lang.Object ref = partner_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      partner_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   * <pre>
   * Location code for the device assignment.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Location code for the device assignment.
   * </pre>
   *
   * <code>string location = 2;</code>
   */
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ROLE_FIELD_NUMBER = 3;
  private int role_;
  /**
   * <pre>
   * Role setting for the device.
   * </pre>
   *
   * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
   */
  public int getRoleValue() {
    return role_;
  }
  /**
   * <pre>
   * Role setting for the device.
   * </pre>
   *
   * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
   */
  public io.bloombox.schema.services.devices.v1beta1.DeviceRole getRole() {
    io.bloombox.schema.services.devices.v1beta1.DeviceRole result = io.bloombox.schema.services.devices.v1beta1.DeviceRole.valueOf(role_);
    return result == null ? io.bloombox.schema.services.devices.v1beta1.DeviceRole.UNRECOGNIZED : result;
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
    if (!getPartnerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, partner_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (role_ != io.bloombox.schema.services.devices.v1beta1.DeviceRole.UNASSIGNED.getNumber()) {
      output.writeEnum(3, role_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPartnerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, partner_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (role_ != io.bloombox.schema.services.devices.v1beta1.DeviceRole.UNASSIGNED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, role_);
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
    if (!(obj instanceof io.bloombox.schema.services.devices.v1beta1.DeviceAssignment)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.devices.v1beta1.DeviceAssignment other = (io.bloombox.schema.services.devices.v1beta1.DeviceAssignment) obj;

    boolean result = true;
    result = result && getPartner()
        .equals(other.getPartner());
    result = result && getLocation()
        .equals(other.getLocation());
    result = result && role_ == other.role_;
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
    hash = (37 * hash) + PARTNER_FIELD_NUMBER;
    hash = (53 * hash) + getPartner().hashCode();
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + ROLE_FIELD_NUMBER;
    hash = (53 * hash) + role_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.devices.v1beta1.DeviceAssignment prototype) {
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
   * Describes a device's assignment information, in terms of its role, and also the partner/location it is co-located
   * with.
   * </pre>
   *
   * Protobuf type {@code services.devices.v1beta1.DeviceAssignment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.devices.v1beta1.DeviceAssignment)
      io.bloombox.schema.services.devices.v1beta1.DeviceAssignmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_services_devices_v1beta1_DeviceAssignment_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_services_devices_v1beta1_DeviceAssignment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.class, io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.Builder.class);
    }

    // Construct using io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.newBuilder()
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
      partner_ = "";

      location_ = "";

      role_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.devices.v1beta1.DevicesServiceBeta1.internal_static_services_devices_v1beta1_DeviceAssignment_descriptor;
    }

    public io.bloombox.schema.services.devices.v1beta1.DeviceAssignment getDefaultInstanceForType() {
      return io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.getDefaultInstance();
    }

    public io.bloombox.schema.services.devices.v1beta1.DeviceAssignment build() {
      io.bloombox.schema.services.devices.v1beta1.DeviceAssignment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.devices.v1beta1.DeviceAssignment buildPartial() {
      io.bloombox.schema.services.devices.v1beta1.DeviceAssignment result = new io.bloombox.schema.services.devices.v1beta1.DeviceAssignment(this);
      result.partner_ = partner_;
      result.location_ = location_;
      result.role_ = role_;
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
      if (other instanceof io.bloombox.schema.services.devices.v1beta1.DeviceAssignment) {
        return mergeFrom((io.bloombox.schema.services.devices.v1beta1.DeviceAssignment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.devices.v1beta1.DeviceAssignment other) {
      if (other == io.bloombox.schema.services.devices.v1beta1.DeviceAssignment.getDefaultInstance()) return this;
      if (!other.getPartner().isEmpty()) {
        partner_ = other.partner_;
        onChanged();
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (other.role_ != 0) {
        setRoleValue(other.getRoleValue());
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
      io.bloombox.schema.services.devices.v1beta1.DeviceAssignment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.devices.v1beta1.DeviceAssignment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object partner_ = "";
    /**
     * <pre>
     * Partner code for the device assignment.
     * </pre>
     *
     * <code>string partner = 1;</code>
     */
    public java.lang.String getPartner() {
      java.lang.Object ref = partner_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partner_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Partner code for the device assignment.
     * </pre>
     *
     * <code>string partner = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPartnerBytes() {
      java.lang.Object ref = partner_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        partner_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Partner code for the device assignment.
     * </pre>
     *
     * <code>string partner = 1;</code>
     */
    public Builder setPartner(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      partner_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partner code for the device assignment.
     * </pre>
     *
     * <code>string partner = 1;</code>
     */
    public Builder clearPartner() {
      
      partner_ = getDefaultInstance().getPartner();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partner code for the device assignment.
     * </pre>
     *
     * <code>string partner = 1;</code>
     */
    public Builder setPartnerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      partner_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     * <pre>
     * Location code for the device assignment.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Location code for the device assignment.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Location code for the device assignment.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location code for the device assignment.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Location code for the device assignment.
     * </pre>
     *
     * <code>string location = 2;</code>
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
      onChanged();
      return this;
    }

    private int role_ = 0;
    /**
     * <pre>
     * Role setting for the device.
     * </pre>
     *
     * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
     */
    public int getRoleValue() {
      return role_;
    }
    /**
     * <pre>
     * Role setting for the device.
     * </pre>
     *
     * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
     */
    public Builder setRoleValue(int value) {
      role_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role setting for the device.
     * </pre>
     *
     * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
     */
    public io.bloombox.schema.services.devices.v1beta1.DeviceRole getRole() {
      io.bloombox.schema.services.devices.v1beta1.DeviceRole result = io.bloombox.schema.services.devices.v1beta1.DeviceRole.valueOf(role_);
      return result == null ? io.bloombox.schema.services.devices.v1beta1.DeviceRole.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Role setting for the device.
     * </pre>
     *
     * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
     */
    public Builder setRole(io.bloombox.schema.services.devices.v1beta1.DeviceRole value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      role_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Role setting for the device.
     * </pre>
     *
     * <code>.services.devices.v1beta1.DeviceRole role = 3;</code>
     */
    public Builder clearRole() {
      
      role_ = 0;
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


    // @@protoc_insertion_point(builder_scope:services.devices.v1beta1.DeviceAssignment)
  }

  // @@protoc_insertion_point(class_scope:services.devices.v1beta1.DeviceAssignment)
  private static final io.bloombox.schema.services.devices.v1beta1.DeviceAssignment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.devices.v1beta1.DeviceAssignment();
  }

  public static io.bloombox.schema.services.devices.v1beta1.DeviceAssignment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeviceAssignment>
      PARSER = new com.google.protobuf.AbstractParser<DeviceAssignment>() {
    public DeviceAssignment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DeviceAssignment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DeviceAssignment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeviceAssignment> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.devices.v1beta1.DeviceAssignment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

