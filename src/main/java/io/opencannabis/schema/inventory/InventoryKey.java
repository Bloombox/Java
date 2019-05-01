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
// source: inventory/InventoryProduct.proto

package io.opencannabis.schema.inventory;

/**
 * <pre>
 * Key structure for inventory records. Identifies the product being inventoried, with a unique ID set upon creation or
 * allocation of the record.
 * </pre>
 *
 * Protobuf type {@code opencannabis.inventory.InventoryKey}
 */
public  final class InventoryKey extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.inventory.InventoryKey)
    InventoryKeyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryKey.newBuilder() to construct.
  private InventoryKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryKey() {
    uuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryKey(
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
            io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder subBuilder = null;
            if (key_ != null) {
              subBuilder = key_.toBuilder();
            }
            key_ = input.readMessage(io.opencannabis.schema.base.BaseProductKey.ProductKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(key_);
              key_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
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
    return io.opencannabis.schema.inventory.InventoryProductOuterClass.internal_static_opencannabis_inventory_InventoryKey_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.inventory.InventoryProductOuterClass.internal_static_opencannabis_inventory_InventoryKey_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.inventory.InventoryKey.class, io.opencannabis.schema.inventory.InventoryKey.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;
  private io.opencannabis.schema.base.BaseProductKey.ProductKey key_;
  /**
   * <pre>
   * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
   * attached concrete record below.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
   */
  public boolean hasKey() {
    return key_ != null;
  }
  /**
   * <pre>
   * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
   * attached concrete record below.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.base.BaseProductKey.ProductKey getKey() {
    return key_ == null ? io.opencannabis.schema.base.BaseProductKey.ProductKey.getDefaultInstance() : key_;
  }
  /**
   * <pre>
   * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
   * attached concrete record below.
   * </pre>
   *
   * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
   */
  public io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder getKeyOrBuilder() {
    return getKey();
  }

  public static final int UUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object uuid_;
  /**
   * <pre>
   * Unique ID provisioned for this inventory item.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Unique ID provisioned for this inventory item.
   * </pre>
   *
   * <code>string uuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
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
    if (key_ != null) {
      output.writeMessage(1, getKey());
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (key_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getKey());
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uuid_);
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
    if (!(obj instanceof io.opencannabis.schema.inventory.InventoryKey)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.inventory.InventoryKey other = (io.opencannabis.schema.inventory.InventoryKey) obj;

    if (hasKey() != other.hasKey()) return false;
    if (hasKey()) {
      if (!getKey()
          .equals(other.getKey())) return false;
    }
    if (!getUuid()
        .equals(other.getUuid())) return false;
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
    if (hasKey()) {
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey().hashCode();
    }
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryKey parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.inventory.InventoryKey prototype) {
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
   * Key structure for inventory records. Identifies the product being inventoried, with a unique ID set upon creation or
   * allocation of the record.
   * </pre>
   *
   * Protobuf type {@code opencannabis.inventory.InventoryKey}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.inventory.InventoryKey)
      io.opencannabis.schema.inventory.InventoryKeyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.inventory.InventoryProductOuterClass.internal_static_opencannabis_inventory_InventoryKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.inventory.InventoryProductOuterClass.internal_static_opencannabis_inventory_InventoryKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.inventory.InventoryKey.class, io.opencannabis.schema.inventory.InventoryKey.Builder.class);
    }

    // Construct using io.opencannabis.schema.inventory.InventoryKey.newBuilder()
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
      if (keyBuilder_ == null) {
        key_ = null;
      } else {
        key_ = null;
        keyBuilder_ = null;
      }
      uuid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.inventory.InventoryProductOuterClass.internal_static_opencannabis_inventory_InventoryKey_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryKey getDefaultInstanceForType() {
      return io.opencannabis.schema.inventory.InventoryKey.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryKey build() {
      io.opencannabis.schema.inventory.InventoryKey result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryKey buildPartial() {
      io.opencannabis.schema.inventory.InventoryKey result = new io.opencannabis.schema.inventory.InventoryKey(this);
      if (keyBuilder_ == null) {
        result.key_ = key_;
      } else {
        result.key_ = keyBuilder_.build();
      }
      result.uuid_ = uuid_;
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
      if (other instanceof io.opencannabis.schema.inventory.InventoryKey) {
        return mergeFrom((io.opencannabis.schema.inventory.InventoryKey)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.inventory.InventoryKey other) {
      if (other == io.opencannabis.schema.inventory.InventoryKey.getDefaultInstance()) return this;
      if (other.hasKey()) {
        mergeKey(other.getKey());
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
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
      io.opencannabis.schema.inventory.InventoryKey parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.inventory.InventoryKey) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.base.BaseProductKey.ProductKey key_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.BaseProductKey.ProductKey, io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder, io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder> keyBuilder_;
    /**
     * <pre>
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public boolean hasKey() {
      return keyBuilder_ != null || key_ != null;
    }
    /**
     * <pre>
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.base.BaseProductKey.ProductKey getKey() {
      if (keyBuilder_ == null) {
        return key_ == null ? io.opencannabis.schema.base.BaseProductKey.ProductKey.getDefaultInstance() : key_;
      } else {
        return keyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder setKey(io.opencannabis.schema.base.BaseProductKey.ProductKey value) {
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
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder setKey(
        io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder builderForValue) {
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
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public Builder mergeKey(io.opencannabis.schema.base.BaseProductKey.ProductKey value) {
      if (keyBuilder_ == null) {
        if (key_ != null) {
          key_ =
            io.opencannabis.schema.base.BaseProductKey.ProductKey.newBuilder(key_).mergeFrom(value).buildPartial();
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
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
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
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder getKeyBuilder() {
      
      onChanged();
      return getKeyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    public io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder getKeyOrBuilder() {
      if (keyBuilder_ != null) {
        return keyBuilder_.getMessageOrBuilder();
      } else {
        return key_ == null ?
            io.opencannabis.schema.base.BaseProductKey.ProductKey.getDefaultInstance() : key_;
      }
    }
    /**
     * <pre>
     * Key record uniquely identifying this inventory product. Keys for saved items are lifted to this property from the
     * attached concrete record below.
     * </pre>
     *
     * <code>.opencannabis.base.ProductKey key = 1 [(.core.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.BaseProductKey.ProductKey, io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder, io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder> 
        getKeyFieldBuilder() {
      if (keyBuilder_ == null) {
        keyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.base.BaseProductKey.ProductKey, io.opencannabis.schema.base.BaseProductKey.ProductKey.Builder, io.opencannabis.schema.base.BaseProductKey.ProductKeyOrBuilder>(
                getKey(),
                getParentForChildren(),
                isClean());
        key_ = null;
      }
      return keyBuilder_;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <pre>
     * Unique ID provisioned for this inventory item.
     * </pre>
     *
     * <code>string uuid = 2;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Unique ID provisioned for this inventory item.
     * </pre>
     *
     * <code>string uuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Unique ID provisioned for this inventory item.
     * </pre>
     *
     * <code>string uuid = 2;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID provisioned for this inventory item.
     * </pre>
     *
     * <code>string uuid = 2;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Unique ID provisioned for this inventory item.
     * </pre>
     *
     * <code>string uuid = 2;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.inventory.InventoryKey)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.inventory.InventoryKey)
  private static final io.opencannabis.schema.inventory.InventoryKey DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.inventory.InventoryKey();
  }

  public static io.opencannabis.schema.inventory.InventoryKey getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryKey>
      PARSER = new com.google.protobuf.AbstractParser<InventoryKey>() {
    @java.lang.Override
    public InventoryKey parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryKey(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryKey> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryKey> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.inventory.InventoryKey getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

