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
// source: structs/pricing/SaleDescriptor.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * A buy-one-get-one discount. Some discounted amount, applicable to the second item bought. First item is usually full
 * price. Can be applied in various ways. I.E. a customer purchases two items for full price and the third is discounted
 * .
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.pricing.BOGODiscount}
 */
public  final class BOGODiscount extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.pricing.BOGODiscount)
    BOGODiscountOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BOGODiscount.newBuilder() to construct.
  private BOGODiscount(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BOGODiscount() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BOGODiscount(
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
          case 168: {

            trigger_ = input.readUInt32();
            break;
          }
          case 176: {

            reward_ = input.readUInt32();
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
    return io.opencannabis.schema.product.struct.ProductDiscount.internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.ProductDiscount.internal_static_opencannabis_structs_pricing_BOGODiscount_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.BOGODiscount.class, io.opencannabis.schema.product.struct.BOGODiscount.Builder.class);
  }

  public static final int TRIGGER_FIELD_NUMBER = 21;
  private int trigger_;
  /**
   * <pre>
   * The discount code used to trigger the discount.
   * </pre>
   *
   * <code>uint32 trigger = 21;</code>
   */
  public int getTrigger() {
    return trigger_;
  }

  public static final int REWARD_FIELD_NUMBER = 22;
  private int reward_;
  /**
   * <pre>
   * The value for the discount.
   * </pre>
   *
   * <code>uint32 reward = 22;</code>
   */
  public int getReward() {
    return reward_;
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
    if (trigger_ != 0) {
      output.writeUInt32(21, trigger_);
    }
    if (reward_ != 0) {
      output.writeUInt32(22, reward_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trigger_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(21, trigger_);
    }
    if (reward_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(22, reward_);
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.BOGODiscount)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.BOGODiscount other = (io.opencannabis.schema.product.struct.BOGODiscount) obj;

    if (getTrigger()
        != other.getTrigger()) return false;
    if (getReward()
        != other.getReward()) return false;
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
    hash = (37 * hash) + TRIGGER_FIELD_NUMBER;
    hash = (53 * hash) + getTrigger();
    hash = (37 * hash) + REWARD_FIELD_NUMBER;
    hash = (53 * hash) + getReward();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.BOGODiscount parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.BOGODiscount prototype) {
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
   * A buy-one-get-one discount. Some discounted amount, applicable to the second item bought. First item is usually full
   * price. Can be applied in various ways. I.E. a customer purchases two items for full price and the third is discounted
   * .
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.pricing.BOGODiscount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.pricing.BOGODiscount)
      io.opencannabis.schema.product.struct.BOGODiscountOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.ProductDiscount.internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.ProductDiscount.internal_static_opencannabis_structs_pricing_BOGODiscount_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.BOGODiscount.class, io.opencannabis.schema.product.struct.BOGODiscount.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.BOGODiscount.newBuilder()
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
      trigger_ = 0;

      reward_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.ProductDiscount.internal_static_opencannabis_structs_pricing_BOGODiscount_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.BOGODiscount getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.BOGODiscount.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.BOGODiscount build() {
      io.opencannabis.schema.product.struct.BOGODiscount result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.BOGODiscount buildPartial() {
      io.opencannabis.schema.product.struct.BOGODiscount result = new io.opencannabis.schema.product.struct.BOGODiscount(this);
      result.trigger_ = trigger_;
      result.reward_ = reward_;
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
      if (other instanceof io.opencannabis.schema.product.struct.BOGODiscount) {
        return mergeFrom((io.opencannabis.schema.product.struct.BOGODiscount)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.BOGODiscount other) {
      if (other == io.opencannabis.schema.product.struct.BOGODiscount.getDefaultInstance()) return this;
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

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.opencannabis.schema.product.struct.BOGODiscount parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.BOGODiscount) e.getUnfinishedMessage();
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
     * <pre>
     * The discount code used to trigger the discount.
     * </pre>
     *
     * <code>uint32 trigger = 21;</code>
     */
    public int getTrigger() {
      return trigger_;
    }
    /**
     * <pre>
     * The discount code used to trigger the discount.
     * </pre>
     *
     * <code>uint32 trigger = 21;</code>
     */
    public Builder setTrigger(int value) {
      
      trigger_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The discount code used to trigger the discount.
     * </pre>
     *
     * <code>uint32 trigger = 21;</code>
     */
    public Builder clearTrigger() {
      
      trigger_ = 0;
      onChanged();
      return this;
    }

    private int reward_ ;
    /**
     * <pre>
     * The value for the discount.
     * </pre>
     *
     * <code>uint32 reward = 22;</code>
     */
    public int getReward() {
      return reward_;
    }
    /**
     * <pre>
     * The value for the discount.
     * </pre>
     *
     * <code>uint32 reward = 22;</code>
     */
    public Builder setReward(int value) {
      
      reward_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value for the discount.
     * </pre>
     *
     * <code>uint32 reward = 22;</code>
     */
    public Builder clearReward() {
      
      reward_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.pricing.BOGODiscount)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.pricing.BOGODiscount)
  private static final io.opencannabis.schema.product.struct.BOGODiscount DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.BOGODiscount();
  }

  public static io.opencannabis.schema.product.struct.BOGODiscount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BOGODiscount>
      PARSER = new com.google.protobuf.AbstractParser<BOGODiscount>() {
    @java.lang.Override
    public BOGODiscount parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BOGODiscount(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BOGODiscount> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BOGODiscount> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.product.struct.BOGODiscount getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

