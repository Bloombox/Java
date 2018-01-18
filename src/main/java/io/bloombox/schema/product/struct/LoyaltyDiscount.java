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
// source: structs/pricing/SaleDescriptor.proto

package io.bloombox.schema.product.struct;

/**
 * Protobuf type {@code structs.pricing.LoyaltyDiscount}
 */
public  final class LoyaltyDiscount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:structs.pricing.LoyaltyDiscount)
    LoyaltyDiscountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoyaltyDiscount.newBuilder() to construct.
  private LoyaltyDiscount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoyaltyDiscount() {
    trigger_ = 0;
    reward_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoyaltyDiscount(
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
          case 184: {

            trigger_ = input.readUInt32();
            break;
          }
          case 192: {

            reward_ = input.readUInt32();
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
    return io.bloombox.schema.product.struct.ProductDiscount.internal_static_structs_pricing_LoyaltyDiscount_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.product.struct.ProductDiscount.internal_static_structs_pricing_LoyaltyDiscount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.product.struct.LoyaltyDiscount.class, io.bloombox.schema.product.struct.LoyaltyDiscount.Builder.class);
  }

  public static final int TRIGGER_FIELD_NUMBER = 23;
  private int trigger_;
  /**
   * <code>uint32 trigger = 23;</code>
   */
  public int getTrigger() {
    return trigger_;
  }

  public static final int REWARD_FIELD_NUMBER = 24;
  private int reward_;
  /**
   * <code>uint32 reward = 24;</code>
   */
  public int getReward() {
    return reward_;
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
    if (trigger_ != 0) {
      output.writeUInt32(23, trigger_);
    }
    if (reward_ != 0) {
      output.writeUInt32(24, reward_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trigger_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(23, trigger_);
    }
    if (reward_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(24, reward_);
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
    if (!(obj instanceof io.bloombox.schema.product.struct.LoyaltyDiscount)) {
      return super.equals(obj);
    }
    io.bloombox.schema.product.struct.LoyaltyDiscount other = (io.bloombox.schema.product.struct.LoyaltyDiscount) obj;

    boolean result = true;
    result = result && (getTrigger()
        == other.getTrigger());
    result = result && (getReward()
        == other.getReward());
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
    hash = (37 * hash) + TRIGGER_FIELD_NUMBER;
    hash = (53 * hash) + getTrigger();
    hash = (37 * hash) + REWARD_FIELD_NUMBER;
    hash = (53 * hash) + getReward();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.product.struct.LoyaltyDiscount parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.product.struct.LoyaltyDiscount prototype) {
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
   * Protobuf type {@code structs.pricing.LoyaltyDiscount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:structs.pricing.LoyaltyDiscount)
      io.bloombox.schema.product.struct.LoyaltyDiscountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.product.struct.ProductDiscount.internal_static_structs_pricing_LoyaltyDiscount_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.product.struct.ProductDiscount.internal_static_structs_pricing_LoyaltyDiscount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.product.struct.LoyaltyDiscount.class, io.bloombox.schema.product.struct.LoyaltyDiscount.Builder.class);
    }

    // Construct using io.bloombox.schema.product.struct.LoyaltyDiscount.newBuilder()
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
      trigger_ = 0;

      reward_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.product.struct.ProductDiscount.internal_static_structs_pricing_LoyaltyDiscount_descriptor;
    }

    public io.bloombox.schema.product.struct.LoyaltyDiscount getDefaultInstanceForType() {
      return io.bloombox.schema.product.struct.LoyaltyDiscount.getDefaultInstance();
    }

    public io.bloombox.schema.product.struct.LoyaltyDiscount build() {
      io.bloombox.schema.product.struct.LoyaltyDiscount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.product.struct.LoyaltyDiscount buildPartial() {
      io.bloombox.schema.product.struct.LoyaltyDiscount result = new io.bloombox.schema.product.struct.LoyaltyDiscount(this);
      result.trigger_ = trigger_;
      result.reward_ = reward_;
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
      if (other instanceof io.bloombox.schema.product.struct.LoyaltyDiscount) {
        return mergeFrom((io.bloombox.schema.product.struct.LoyaltyDiscount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.product.struct.LoyaltyDiscount other) {
      if (other == io.bloombox.schema.product.struct.LoyaltyDiscount.getDefaultInstance()) return this;
      if (other.getTrigger() != 0) {
        setTrigger(other.getTrigger());
      }
      if (other.getReward() != 0) {
        setReward(other.getReward());
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
      io.bloombox.schema.product.struct.LoyaltyDiscount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.product.struct.LoyaltyDiscount) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int trigger_ ;
    /**
     * <code>uint32 trigger = 23;</code>
     */
    public int getTrigger() {
      return trigger_;
    }
    /**
     * <code>uint32 trigger = 23;</code>
     */
    public Builder setTrigger(int value) {
      
      trigger_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 trigger = 23;</code>
     */
    public Builder clearTrigger() {
      
      trigger_ = 0;
      onChanged();
      return this;
    }

    private int reward_ ;
    /**
     * <code>uint32 reward = 24;</code>
     */
    public int getReward() {
      return reward_;
    }
    /**
     * <code>uint32 reward = 24;</code>
     */
    public Builder setReward(int value) {
      
      reward_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 reward = 24;</code>
     */
    public Builder clearReward() {
      
      reward_ = 0;
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


    // @@protoc_insertion_point(builder_scope:structs.pricing.LoyaltyDiscount)
  }

  // @@protoc_insertion_point(class_scope:structs.pricing.LoyaltyDiscount)
  private static final io.bloombox.schema.product.struct.LoyaltyDiscount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.product.struct.LoyaltyDiscount();
  }

  public static io.bloombox.schema.product.struct.LoyaltyDiscount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoyaltyDiscount>
      PARSER = new com.google.protobuf.AbstractParser<LoyaltyDiscount>() {
    public LoyaltyDiscount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoyaltyDiscount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoyaltyDiscount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoyaltyDiscount> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.product.struct.LoyaltyDiscount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

