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
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * Specifies pricing information for a weight-priced product, at a particular weight tier, including the price value,
 * tier status, and, optionally, a custom weight.
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.pricing.WeightedPricingDescriptor}
 */
public  final class WeightedPricingDescriptor extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.pricing.WeightedPricingDescriptor)
    WeightedPricingDescriptorOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeightedPricingDescriptor.newBuilder() to construct.
  private WeightedPricingDescriptor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeightedPricingDescriptor() {
    weight_ = 0;
    weightInGrams_ = 0F;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeightedPricingDescriptor(
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

            weight_ = rawValue;
            break;
          }
          case 18: {
            io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder subBuilder = null;
            if (tier_ != null) {
              subBuilder = tier_.toBuilder();
            }
            tier_ = input.readMessage(io.opencannabis.schema.product.struct.UnitPricingDescriptor.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tier_);
              tier_ = subBuilder.buildPartial();
            }

            break;
          }
          case 29: {

            weightInGrams_ = input.readFloat();
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
    return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.WeightedPricingDescriptor.class, io.opencannabis.schema.product.struct.WeightedPricingDescriptor.Builder.class);
  }

  public static final int WEIGHT_FIELD_NUMBER = 1;
  private int weight_;
  /**
   * <pre>
   * Weight tier selection.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
   */
  public int getWeightValue() {
    return weight_;
  }
  /**
   * <pre>
   * Weight tier selection.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
   */
  public io.opencannabis.schema.product.struct.PricingWeightTier getWeight() {
    @SuppressWarnings("deprecation")
    io.opencannabis.schema.product.struct.PricingWeightTier result = io.opencannabis.schema.product.struct.PricingWeightTier.valueOf(weight_);
    return result == null ? io.opencannabis.schema.product.struct.PricingWeightTier.UNRECOGNIZED : result;
  }

  public static final int TIER_FIELD_NUMBER = 2;
  private io.opencannabis.schema.product.struct.UnitPricingDescriptor tier_;
  /**
   * <pre>
   * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  public boolean hasTier() {
    return tier_ != null;
  }
  /**
   * <pre>
   * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  public io.opencannabis.schema.product.struct.UnitPricingDescriptor getTier() {
    return tier_ == null ? io.opencannabis.schema.product.struct.UnitPricingDescriptor.getDefaultInstance() : tier_;
  }
  /**
   * <pre>
   * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
   * </pre>
   *
   * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
   */
  public io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder getTierOrBuilder() {
    return getTier();
  }

  public static final int WEIGHT_IN_GRAMS_FIELD_NUMBER = 3;
  private float weightInGrams_;
  /**
   * <pre>
   * Custom weight in grams, if any.
   * </pre>
   *
   * <code>float weight_in_grams = 3;</code>
   */
  public float getWeightInGrams() {
    return weightInGrams_;
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
    if (weight_ != io.opencannabis.schema.product.struct.PricingWeightTier.NO_WEIGHT.getNumber()) {
      output.writeEnum(1, weight_);
    }
    if (tier_ != null) {
      output.writeMessage(2, getTier());
    }
    if (weightInGrams_ != 0F) {
      output.writeFloat(3, weightInGrams_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (weight_ != io.opencannabis.schema.product.struct.PricingWeightTier.NO_WEIGHT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, weight_);
    }
    if (tier_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTier());
    }
    if (weightInGrams_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, weightInGrams_);
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.WeightedPricingDescriptor)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.WeightedPricingDescriptor other = (io.opencannabis.schema.product.struct.WeightedPricingDescriptor) obj;

    boolean result = true;
    result = result && weight_ == other.weight_;
    result = result && (hasTier() == other.hasTier());
    if (hasTier()) {
      result = result && getTier()
          .equals(other.getTier());
    }
    result = result && (
        java.lang.Float.floatToIntBits(getWeightInGrams())
        == java.lang.Float.floatToIntBits(
            other.getWeightInGrams()));
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
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + weight_;
    if (hasTier()) {
      hash = (37 * hash) + TIER_FIELD_NUMBER;
      hash = (53 * hash) + getTier().hashCode();
    }
    hash = (37 * hash) + WEIGHT_IN_GRAMS_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getWeightInGrams());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.WeightedPricingDescriptor prototype) {
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
   * Specifies pricing information for a weight-priced product, at a particular weight tier, including the price value,
   * tier status, and, optionally, a custom weight.
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.pricing.WeightedPricingDescriptor}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.pricing.WeightedPricingDescriptor)
      io.opencannabis.schema.product.struct.WeightedPricingDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.WeightedPricingDescriptor.class, io.opencannabis.schema.product.struct.WeightedPricingDescriptor.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.WeightedPricingDescriptor.newBuilder()
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
      weight_ = 0;

      if (tierBuilder_ == null) {
        tier_ = null;
      } else {
        tier_ = null;
        tierBuilder_ = null;
      }
      weightInGrams_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_WeightedPricingDescriptor_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.WeightedPricingDescriptor getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.WeightedPricingDescriptor.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.WeightedPricingDescriptor build() {
      io.opencannabis.schema.product.struct.WeightedPricingDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.WeightedPricingDescriptor buildPartial() {
      io.opencannabis.schema.product.struct.WeightedPricingDescriptor result = new io.opencannabis.schema.product.struct.WeightedPricingDescriptor(this);
      result.weight_ = weight_;
      if (tierBuilder_ == null) {
        result.tier_ = tier_;
      } else {
        result.tier_ = tierBuilder_.build();
      }
      result.weightInGrams_ = weightInGrams_;
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
      if (other instanceof io.opencannabis.schema.product.struct.WeightedPricingDescriptor) {
        return mergeFrom((io.opencannabis.schema.product.struct.WeightedPricingDescriptor)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.WeightedPricingDescriptor other) {
      if (other == io.opencannabis.schema.product.struct.WeightedPricingDescriptor.getDefaultInstance()) return this;
      if (other.weight_ != 0) {
        setWeightValue(other.getWeightValue());
      }
      if (other.hasTier()) {
        mergeTier(other.getTier());
      }
      if (other.getWeightInGrams() != 0F) {
        setWeightInGrams(other.getWeightInGrams());
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
      io.opencannabis.schema.product.struct.WeightedPricingDescriptor parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.WeightedPricingDescriptor) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int weight_ = 0;
    /**
     * <pre>
     * Weight tier selection.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
     */
    public int getWeightValue() {
      return weight_;
    }
    /**
     * <pre>
     * Weight tier selection.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
     */
    public Builder setWeightValue(int value) {
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Weight tier selection.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
     */
    public io.opencannabis.schema.product.struct.PricingWeightTier getWeight() {
      @SuppressWarnings("deprecation")
      io.opencannabis.schema.product.struct.PricingWeightTier result = io.opencannabis.schema.product.struct.PricingWeightTier.valueOf(weight_);
      return result == null ? io.opencannabis.schema.product.struct.PricingWeightTier.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Weight tier selection.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
     */
    public Builder setWeight(io.opencannabis.schema.product.struct.PricingWeightTier value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      weight_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Weight tier selection.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.PricingWeightTier weight = 1;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.product.struct.UnitPricingDescriptor tier_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.UnitPricingDescriptor, io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder, io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder> tierBuilder_;
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public boolean hasTier() {
      return tierBuilder_ != null || tier_ != null;
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public io.opencannabis.schema.product.struct.UnitPricingDescriptor getTier() {
      if (tierBuilder_ == null) {
        return tier_ == null ? io.opencannabis.schema.product.struct.UnitPricingDescriptor.getDefaultInstance() : tier_;
      } else {
        return tierBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public Builder setTier(io.opencannabis.schema.product.struct.UnitPricingDescriptor value) {
      if (tierBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tier_ = value;
        onChanged();
      } else {
        tierBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public Builder setTier(
        io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder builderForValue) {
      if (tierBuilder_ == null) {
        tier_ = builderForValue.build();
        onChanged();
      } else {
        tierBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public Builder mergeTier(io.opencannabis.schema.product.struct.UnitPricingDescriptor value) {
      if (tierBuilder_ == null) {
        if (tier_ != null) {
          tier_ =
            io.opencannabis.schema.product.struct.UnitPricingDescriptor.newBuilder(tier_).mergeFrom(value).buildPartial();
        } else {
          tier_ = value;
        }
        onChanged();
      } else {
        tierBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public Builder clearTier() {
      if (tierBuilder_ == null) {
        tier_ = null;
        onChanged();
      } else {
        tier_ = null;
        tierBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder getTierBuilder() {
      
      onChanged();
      return getTierFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    public io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder getTierOrBuilder() {
      if (tierBuilder_ != null) {
        return tierBuilder_.getMessageOrBuilder();
      } else {
        return tier_ == null ?
            io.opencannabis.schema.product.struct.UnitPricingDescriptor.getDefaultInstance() : tier_;
      }
    }
    /**
     * <pre>
     * Pricing descriptor for this tier, including the price value, status, and any discounts that should apply.
     * </pre>
     *
     * <code>.opencannabis.structs.pricing.UnitPricingDescriptor tier = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.UnitPricingDescriptor, io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder, io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder> 
        getTierFieldBuilder() {
      if (tierBuilder_ == null) {
        tierBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.product.struct.UnitPricingDescriptor, io.opencannabis.schema.product.struct.UnitPricingDescriptor.Builder, io.opencannabis.schema.product.struct.UnitPricingDescriptorOrBuilder>(
                getTier(),
                getParentForChildren(),
                isClean());
        tier_ = null;
      }
      return tierBuilder_;
    }

    private float weightInGrams_ ;
    /**
     * <pre>
     * Custom weight in grams, if any.
     * </pre>
     *
     * <code>float weight_in_grams = 3;</code>
     */
    public float getWeightInGrams() {
      return weightInGrams_;
    }
    /**
     * <pre>
     * Custom weight in grams, if any.
     * </pre>
     *
     * <code>float weight_in_grams = 3;</code>
     */
    public Builder setWeightInGrams(float value) {
      
      weightInGrams_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Custom weight in grams, if any.
     * </pre>
     *
     * <code>float weight_in_grams = 3;</code>
     */
    public Builder clearWeightInGrams() {
      
      weightInGrams_ = 0F;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.pricing.WeightedPricingDescriptor)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.pricing.WeightedPricingDescriptor)
  private static final io.opencannabis.schema.product.struct.WeightedPricingDescriptor DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.WeightedPricingDescriptor();
  }

  public static io.opencannabis.schema.product.struct.WeightedPricingDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeightedPricingDescriptor>
      PARSER = new com.google.protobuf.AbstractParser<WeightedPricingDescriptor>() {
    @java.lang.Override
    public WeightedPricingDescriptor parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeightedPricingDescriptor(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeightedPricingDescriptor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeightedPricingDescriptor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.product.struct.WeightedPricingDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

