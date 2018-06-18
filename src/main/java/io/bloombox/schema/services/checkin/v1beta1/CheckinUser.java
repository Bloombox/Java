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
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

/**
 * <pre>
 * Specifies information about the user account resolved during a checkin operation. Account flags are expressed, along
 * with enough information for a salutation.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.services.checkin.v1beta1.CheckinUser}
 */
public  final class CheckinUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.services.checkin.v1beta1.CheckinUser)
    CheckinUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckinUser.newBuilder() to construct.
  private CheckinUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckinUser() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckinUser(
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
            io.bloombox.schema.identity.AppUserKey.UserKey.Builder subBuilder = null;
            if (key_ != null) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(io.bloombox.schema.identity.AppUserKey.UserKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.bloombox.schema.identity.AppUser.UserFlags.Builder subBuilder = null;
            if (flags_ != null) {
              subBuilder = flags_.toBuilder();
            }
            flags_ = input.readMessage(io.bloombox.schema.identity.AppUser.UserFlags.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(flags_);
              flags_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            io.opencannabis.schema.person.Name.Builder subBuilder = null;
            if (name_ != null) {
              subBuilder = name_.toBuilder();
            }
            name_ = input.readMessage(io.opencannabis.schema.person.Name.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(name_);
              name_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.checkin.v1beta1.CheckinUser.class, io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private io.bloombox.schema.identity.AppUserKey.UserKey key_;
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  public io.bloombox.schema.identity.AppUserKey.UserKey getKey() {
    return key_ == null ? io.bloombox.schema.identity.AppUserKey.UserKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Key and identity ID for the user who was checked in.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserKey key = 1;</code>
   */
  public io.bloombox.schema.identity.AppUserKey.UserKeyOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int FLAGS_FIELD_NUMBER = 2;
  private io.bloombox.schema.identity.AppUser.UserFlags flags_;
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  public boolean hasFlags() {
    return flags_ != null;
  }
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  public io.bloombox.schema.identity.AppUser.UserFlags getFlags() {
    return flags_ == null ? io.bloombox.schema.identity.AppUser.UserFlags.getDefaultInstance() : flags_;
  }
  /**
   * <pre>
   * Active account flags.
   * </pre>
   *
   * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
   */
  public io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder getFlagsOrBuilder() {
    return getFlags();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private io.opencannabis.schema.person.Name name_;
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  public boolean hasName() {
    return name_ != null;
  }
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  public io.opencannabis.schema.person.Name getName() {
    return name_ == null ? io.opencannabis.schema.person.Name.getDefaultInstance() : name_;
  }
  /**
   * <pre>
   * Person's name information, for display purposes.
   * </pre>
   *
   * <code>.opencannabis.person.Name name = 3;</code>
   */
  public io.opencannabis.schema.person.NameOrBuilder getNameOrBuilder() {
    return getName();
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (flags_ != null) {
      output.writeMessage(2, getFlags());
    }
    if (name_ != null) {
      output.writeMessage(3, getName());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (flags_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFlags());
    }
    if (name_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getName());
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
    if (!(obj instanceof io.bloombox.schema.services.checkin.v1beta1.CheckinUser)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.checkin.v1beta1.CheckinUser other = (io.bloombox.schema.services.checkin.v1beta1.CheckinUser) obj;

    boolean result = true;
    result = result && (hasKey() == other.hasKey());
    if (hasKey()) {
      result = result && getKey()
          .equals(other.getKey());
    }
    result = result && (hasFlags() == other.hasFlags());
    if (hasFlags()) {
      result = result && getFlags()
          .equals(other.getFlags());
    }
    result = result && (hasName() == other.hasName());
    if (hasName()) {
      result = result && getName()
          .equals(other.getName());
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    if (hasFlags()) {
      hash = (37 * hash) + FLAGS_FIELD_NUMBER;
      hash = (53 * hash) + getFlags().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.checkin.v1beta1.CheckinUser prototype) {
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
   * Specifies information about the user account resolved during a checkin operation. Account flags are expressed, along
   * with enough information for a salutation.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.services.checkin.v1beta1.CheckinUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.services.checkin.v1beta1.CheckinUser)
      io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.checkin.v1beta1.CheckinUser.class, io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder.class);
    }

    // Construct using io.bloombox.schema.services.checkin.v1beta1.CheckinUser.newBuilder()
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
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      if (flagsBuilder_ == null) {
        flags_ = null;
      } else {
        flags_ = null;
        flagsBuilder_ = null;
      }
      if (nameBuilder_ == null) {
        name_ = null;
      } else {
        name_ = null;
        nameBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinUser_descriptor;
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinUser getDefaultInstanceForType() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinUser.getDefaultInstance();
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinUser build() {
      io.bloombox.schema.services.checkin.v1beta1.CheckinUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinUser buildPartial() {
      io.bloombox.schema.services.checkin.v1beta1.CheckinUser result = new io.bloombox.schema.services.checkin.v1beta1.CheckinUser(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      if (flagsBuilder_ == null) {
        result.flags_ = flags_;
      } else {
        result.flags_ = flagsBuilder_.build();
      }
      if (nameBuilder_ == null) {
        result.name_ = name_;
      } else {
        result.name_ = nameBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.services.checkin.v1beta1.CheckinUser) {
        return mergeFrom((io.bloombox.schema.services.checkin.v1beta1.CheckinUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.checkin.v1beta1.CheckinUser other) {
      if (other == io.bloombox.schema.services.checkin.v1beta1.CheckinUser.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (other.hasFlags()) {
        mergeFlags(other.getFlags());
      }
      if (other.hasName()) {
        mergeName(other.getName());
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
      io.bloombox.schema.services.checkin.v1beta1.CheckinUser parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.checkin.v1beta1.CheckinUser) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.identity.AppUserKey.UserKey key_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.AppUserKey.UserKey, io.bloombox.schema.identity.AppUserKey.UserKey.Builder, io.bloombox.schema.identity.AppUserKey.UserKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public io.bloombox.schema.identity.AppUserKey.UserKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? io.bloombox.schema.identity.AppUserKey.UserKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public Builder setKey(io.bloombox.schema.identity.AppUserKey.UserKey value) {
      if (keyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        key_ = value;
        onChanged();
      } else {
        keyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public Builder setKey(
        io.bloombox.schema.identity.AppUserKey.UserKey.Builder builderForValue) {
      if (keyBuilder_ == null) {
        key_ = builderForValue.build();
        onChanged();
      } else {
        keyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public Builder mergeKey(io.bloombox.schema.identity.AppUserKey.UserKey value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            io.bloombox.schema.identity.AppUserKey.UserKey.newBuilder(key_).mergeFrom(value).buildPartial();
        } else {
          key_ = value;
        }
        onChanged();
      } else {
        keyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public Builder clearKey() {
      if (keyBuilder_ == null) {
        key_ = null;
        onChanged();
      } else {
        key_ = null;
        keyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public io.bloombox.schema.identity.AppUserKey.UserKey.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    public io.bloombox.schema.identity.AppUserKey.UserKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            io.bloombox.schema.identity.AppUserKey.UserKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Key and identity ID for the user who was checked in.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserKey key = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.AppUserKey.UserKey, io.bloombox.schema.identity.AppUserKey.UserKey.Builder, io.bloombox.schema.identity.AppUserKey.UserKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.identity.AppUserKey.UserKey, io.bloombox.schema.identity.AppUserKey.UserKey.Builder, io.bloombox.schema.identity.AppUserKey.UserKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private io.bloombox.schema.identity.AppUser.UserFlags flags_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.AppUser.UserFlags, io.bloombox.schema.identity.AppUser.UserFlags.Builder, io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder> flagsBuilder_;
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public boolean hasFlags() {
      return flagsBuilder_ != null || flags_ != null;
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public io.bloombox.schema.identity.AppUser.UserFlags getFlags() {
      if (flagsBuilder_ == null) {
        return flags_ == null ? io.bloombox.schema.identity.AppUser.UserFlags.getDefaultInstance() : flags_;
      } else {
        return flagsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public Builder setFlags(io.bloombox.schema.identity.AppUser.UserFlags value) {
      if (flagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        flags_ = value;
        onChanged();
      } else {
        flagsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public Builder setFlags(
        io.bloombox.schema.identity.AppUser.UserFlags.Builder builderForValue) {
      if (flagsBuilder_ == null) {
        flags_ = builderForValue.build();
        onChanged();
      } else {
        flagsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public Builder mergeFlags(io.bloombox.schema.identity.AppUser.UserFlags value) {
      if (flagsBuilder_ == null) {
        if (flags_ != null) {
          flags_ =
            io.bloombox.schema.identity.AppUser.UserFlags.newBuilder(flags_).mergeFrom(value).buildPartial();
        } else {
          flags_ = value;
        }
        onChanged();
      } else {
        flagsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public Builder clearFlags() {
      if (flagsBuilder_ == null) {
        flags_ = null;
        onChanged();
      } else {
        flags_ = null;
        flagsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public io.bloombox.schema.identity.AppUser.UserFlags.Builder getFlagsBuilder() {
      
      onChanged();
      return getFlagsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    public io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder getFlagsOrBuilder() {
      if (flagsBuilder_ != null) {
        return flagsBuilder_.getMessageOrBuilder();
      } else {
        return flags_ == null ?
            io.bloombox.schema.identity.AppUser.UserFlags.getDefaultInstance() : flags_;
      }
    }
    /**
     * <pre>
     * Active account flags.
     * </pre>
     *
     * <code>.bloombox.schema.identity.UserFlags flags = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.AppUser.UserFlags, io.bloombox.schema.identity.AppUser.UserFlags.Builder, io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder> 
        getFlagsFieldBuilder() {
      if (flagsBuilder_ == null) {
        flagsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.identity.AppUser.UserFlags, io.bloombox.schema.identity.AppUser.UserFlags.Builder, io.bloombox.schema.identity.AppUser.UserFlagsOrBuilder>(
                getFlags(),
                getParentForChildren(),
                isClean());
        flags_ = null;
      }
      return flagsBuilder_;
    }

    private io.opencannabis.schema.person.Name name_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.person.Name, io.opencannabis.schema.person.Name.Builder, io.opencannabis.schema.person.NameOrBuilder> nameBuilder_;
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public boolean hasName() {
      return nameBuilder_ != null || name_ != null;
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public io.opencannabis.schema.person.Name getName() {
      if (nameBuilder_ == null) {
        return name_ == null ? io.opencannabis.schema.person.Name.getDefaultInstance() : name_;
      } else {
        return nameBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public Builder setName(io.opencannabis.schema.person.Name value) {
      if (nameBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        name_ = value;
        onChanged();
      } else {
        nameBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public Builder setName(
        io.opencannabis.schema.person.Name.Builder builderForValue) {
      if (nameBuilder_ == null) {
        name_ = builderForValue.build();
        onChanged();
      } else {
        nameBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public Builder mergeName(io.opencannabis.schema.person.Name value) {
      if (nameBuilder_ == null) {
        if (name_ != null) {
          name_ =
            io.opencannabis.schema.person.Name.newBuilder(name_).mergeFrom(value).buildPartial();
        } else {
          name_ = value;
        }
        onChanged();
      } else {
        nameBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public Builder clearName() {
      if (nameBuilder_ == null) {
        name_ = null;
        onChanged();
      } else {
        name_ = null;
        nameBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public io.opencannabis.schema.person.Name.Builder getNameBuilder() {
      
      onChanged();
      return getNameFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    public io.opencannabis.schema.person.NameOrBuilder getNameOrBuilder() {
      if (nameBuilder_ != null) {
        return nameBuilder_.getMessageOrBuilder();
      } else {
        return name_ == null ?
            io.opencannabis.schema.person.Name.getDefaultInstance() : name_;
      }
    }
    /**
     * <pre>
     * Person's name information, for display purposes.
     * </pre>
     *
     * <code>.opencannabis.person.Name name = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.person.Name, io.opencannabis.schema.person.Name.Builder, io.opencannabis.schema.person.NameOrBuilder> 
        getNameFieldBuilder() {
      if (nameBuilder_ == null) {
        nameBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.person.Name, io.opencannabis.schema.person.Name.Builder, io.opencannabis.schema.person.NameOrBuilder>(
                getName(),
                getParentForChildren(),
                isClean());
        name_ = null;
      }
      return nameBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.services.checkin.v1beta1.CheckinUser)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.services.checkin.v1beta1.CheckinUser)
  private static final io.bloombox.schema.services.checkin.v1beta1.CheckinUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.checkin.v1beta1.CheckinUser();
  }

  public static io.bloombox.schema.services.checkin.v1beta1.CheckinUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckinUser>
      PARSER = new com.google.protobuf.AbstractParser<CheckinUser>() {
    public CheckinUser parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckinUser(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckinUser> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckinUser> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.checkin.v1beta1.CheckinUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

