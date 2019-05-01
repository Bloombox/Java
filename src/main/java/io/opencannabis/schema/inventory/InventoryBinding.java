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
// source: inventory/InventoryLocation.proto

package io.opencannabis.schema.inventory;

/**
 * <pre>
 * Inventory binding. Binds an inventory item to an inventory location.
 * </pre>
 *
 * Protobuf type {@code opencannabis.inventory.InventoryBinding}
 */
public  final class InventoryBinding extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.inventory.InventoryBinding)
    InventoryBindingOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InventoryBinding.newBuilder() to construct.
  private InventoryBinding(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InventoryBinding() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InventoryBinding(
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
            io.opencannabis.schema.inventory.InventoryLocationKey.Builder subBuilder = null;
            if (heldBy_ != null) {
              subBuilder = heldBy_.toBuilder();
            }
            heldBy_ = input.readMessage(io.opencannabis.schema.inventory.InventoryLocationKey.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(heldBy_);
              heldBy_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.inventory.InventoryProduct.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(io.opencannabis.schema.inventory.InventoryProduct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
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
    return io.opencannabis.schema.inventory.InventoryLocationOuterClass.internal_static_opencannabis_inventory_InventoryBinding_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.inventory.InventoryLocationOuterClass.internal_static_opencannabis_inventory_InventoryBinding_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.inventory.InventoryBinding.class, io.opencannabis.schema.inventory.InventoryBinding.Builder.class);
  }

  public static final int HELD_BY_FIELD_NUMBER = 1;
  private io.opencannabis.schema.inventory.InventoryLocationKey heldBy_;
  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  public boolean hasHeldBy() {
    return heldBy_ != null;
  }
  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  public io.opencannabis.schema.inventory.InventoryLocationKey getHeldBy() {
    return heldBy_ == null ? io.opencannabis.schema.inventory.InventoryLocationKey.getDefaultInstance() : heldBy_;
  }
  /**
   * <pre>
   * Inventory location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
   */
  public io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder getHeldByOrBuilder() {
    return getHeldBy();
  }

  public static final int ITEM_FIELD_NUMBER = 2;
  private io.opencannabis.schema.inventory.InventoryProduct item_;
  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  public io.opencannabis.schema.inventory.InventoryProduct getItem() {
    return item_ == null ? io.opencannabis.schema.inventory.InventoryProduct.getDefaultInstance() : item_;
  }
  /**
   * <pre>
   * Item held in inventory at the subject location.
   * </pre>
   *
   * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
   */
  public io.opencannabis.schema.inventory.InventoryProductOrBuilder getItemOrBuilder() {
    return getItem();
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
    if (heldBy_ != null) {
      output.writeMessage(1, getHeldBy());
    }
    if (item_ != null) {
      output.writeMessage(2, getItem());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (heldBy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeldBy());
    }
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getItem());
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
    if (!(obj instanceof io.opencannabis.schema.inventory.InventoryBinding)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.inventory.InventoryBinding other = (io.opencannabis.schema.inventory.InventoryBinding) obj;

    if (hasHeldBy() != other.hasHeldBy()) return false;
    if (hasHeldBy()) {
      if (!getHeldBy()
          .equals(other.getHeldBy())) return false;
    }
    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem()
          .equals(other.getItem())) return false;
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
    if (hasHeldBy()) {
      hash = (37 * hash) + HELD_BY_FIELD_NUMBER;
      hash = (53 * hash) + getHeldBy().hashCode();
    }
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.inventory.InventoryBinding parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.inventory.InventoryBinding prototype) {
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
   * Inventory binding. Binds an inventory item to an inventory location.
   * </pre>
   *
   * Protobuf type {@code opencannabis.inventory.InventoryBinding}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.inventory.InventoryBinding)
      io.opencannabis.schema.inventory.InventoryBindingOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.inventory.InventoryLocationOuterClass.internal_static_opencannabis_inventory_InventoryBinding_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.inventory.InventoryLocationOuterClass.internal_static_opencannabis_inventory_InventoryBinding_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.inventory.InventoryBinding.class, io.opencannabis.schema.inventory.InventoryBinding.Builder.class);
    }

    // Construct using io.opencannabis.schema.inventory.InventoryBinding.newBuilder()
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
      if (heldByBuilder_ == null) {
        heldBy_ = null;
      } else {
        heldBy_ = null;
        heldByBuilder_ = null;
      }
      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.inventory.InventoryLocationOuterClass.internal_static_opencannabis_inventory_InventoryBinding_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryBinding getDefaultInstanceForType() {
      return io.opencannabis.schema.inventory.InventoryBinding.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryBinding build() {
      io.opencannabis.schema.inventory.InventoryBinding result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.inventory.InventoryBinding buildPartial() {
      io.opencannabis.schema.inventory.InventoryBinding result = new io.opencannabis.schema.inventory.InventoryBinding(this);
      if (heldByBuilder_ == null) {
        result.heldBy_ = heldBy_;
      } else {
        result.heldBy_ = heldByBuilder_.build();
      }
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
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
      if (other instanceof io.opencannabis.schema.inventory.InventoryBinding) {
        return mergeFrom((io.opencannabis.schema.inventory.InventoryBinding)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.inventory.InventoryBinding other) {
      if (other == io.opencannabis.schema.inventory.InventoryBinding.getDefaultInstance()) return this;
      if (other.hasHeldBy()) {
        mergeHeldBy(other.getHeldBy());
      }
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
      io.opencannabis.schema.inventory.InventoryBinding parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.inventory.InventoryBinding) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.inventory.InventoryLocationKey heldBy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.inventory.InventoryLocationKey, io.opencannabis.schema.inventory.InventoryLocationKey.Builder, io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder> heldByBuilder_;
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public boolean hasHeldBy() {
      return heldByBuilder_ != null || heldBy_ != null;
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public io.opencannabis.schema.inventory.InventoryLocationKey getHeldBy() {
      if (heldByBuilder_ == null) {
        return heldBy_ == null ? io.opencannabis.schema.inventory.InventoryLocationKey.getDefaultInstance() : heldBy_;
      } else {
        return heldByBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public Builder setHeldBy(io.opencannabis.schema.inventory.InventoryLocationKey value) {
      if (heldByBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        heldBy_ = value;
        onChanged();
      } else {
        heldByBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public Builder setHeldBy(
        io.opencannabis.schema.inventory.InventoryLocationKey.Builder builderForValue) {
      if (heldByBuilder_ == null) {
        heldBy_ = builderForValue.build();
        onChanged();
      } else {
        heldByBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public Builder mergeHeldBy(io.opencannabis.schema.inventory.InventoryLocationKey value) {
      if (heldByBuilder_ == null) {
        if (heldBy_ != null) {
          heldBy_ =
            io.opencannabis.schema.inventory.InventoryLocationKey.newBuilder(heldBy_).mergeFrom(value).buildPartial();
        } else {
          heldBy_ = value;
        }
        onChanged();
      } else {
        heldByBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public Builder clearHeldBy() {
      if (heldByBuilder_ == null) {
        heldBy_ = null;
        onChanged();
      } else {
        heldBy_ = null;
        heldByBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public io.opencannabis.schema.inventory.InventoryLocationKey.Builder getHeldByBuilder() {
      
      onChanged();
      return getHeldByFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    public io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder getHeldByOrBuilder() {
      if (heldByBuilder_ != null) {
        return heldByBuilder_.getMessageOrBuilder();
      } else {
        return heldBy_ == null ?
            io.opencannabis.schema.inventory.InventoryLocationKey.getDefaultInstance() : heldBy_;
      }
    }
    /**
     * <pre>
     * Inventory location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryLocationKey held_by = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.inventory.InventoryLocationKey, io.opencannabis.schema.inventory.InventoryLocationKey.Builder, io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder> 
        getHeldByFieldBuilder() {
      if (heldByBuilder_ == null) {
        heldByBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.inventory.InventoryLocationKey, io.opencannabis.schema.inventory.InventoryLocationKey.Builder, io.opencannabis.schema.inventory.InventoryLocationKeyOrBuilder>(
                getHeldBy(),
                getParentForChildren(),
                isClean());
        heldBy_ = null;
      }
      return heldByBuilder_;
    }

    private io.opencannabis.schema.inventory.InventoryProduct item_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.inventory.InventoryProduct, io.opencannabis.schema.inventory.InventoryProduct.Builder, io.opencannabis.schema.inventory.InventoryProductOrBuilder> itemBuilder_;
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public io.opencannabis.schema.inventory.InventoryProduct getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? io.opencannabis.schema.inventory.InventoryProduct.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public Builder setItem(io.opencannabis.schema.inventory.InventoryProduct value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public Builder setItem(
        io.opencannabis.schema.inventory.InventoryProduct.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public Builder mergeItem(io.opencannabis.schema.inventory.InventoryProduct value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            io.opencannabis.schema.inventory.InventoryProduct.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public io.opencannabis.schema.inventory.InventoryProduct.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    public io.opencannabis.schema.inventory.InventoryProductOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            io.opencannabis.schema.inventory.InventoryProduct.getDefaultInstance() : item_;
      }
    }
    /**
     * <pre>
     * Item held in inventory at the subject location.
     * </pre>
     *
     * <code>.opencannabis.inventory.InventoryProduct item = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.inventory.InventoryProduct, io.opencannabis.schema.inventory.InventoryProduct.Builder, io.opencannabis.schema.inventory.InventoryProductOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.inventory.InventoryProduct, io.opencannabis.schema.inventory.InventoryProduct.Builder, io.opencannabis.schema.inventory.InventoryProductOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.inventory.InventoryBinding)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.inventory.InventoryBinding)
  private static final io.opencannabis.schema.inventory.InventoryBinding DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.inventory.InventoryBinding();
  }

  public static io.opencannabis.schema.inventory.InventoryBinding getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InventoryBinding>
      PARSER = new com.google.protobuf.AbstractParser<InventoryBinding>() {
    @java.lang.Override
    public InventoryBinding parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InventoryBinding(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InventoryBinding> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InventoryBinding> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.inventory.InventoryBinding getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

