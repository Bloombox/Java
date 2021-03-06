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
// source: structs/pricing/PricingDescriptor.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * Specifies availability and stock status flags for a particular pricing tier.
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.pricing.PricingTierAvailability}
 */
public  final class PricingTierAvailability extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.pricing.PricingTierAvailability)
    PricingTierAvailabilityOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PricingTierAvailability.newBuilder() to construct.
  private PricingTierAvailability(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PricingTierAvailability() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PricingTierAvailability(
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

            offered_ = input.readBool();
            break;
          }
          case 16: {

            available_ = input.readBool();
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
    return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_PricingTierAvailability_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.PricingTierAvailability.class, io.opencannabis.schema.product.struct.PricingTierAvailability.Builder.class);
  }

  public static final int OFFERED_FIELD_NUMBER = 1;
  private boolean offered_;
  /**
   * <pre>
   * Specifies whether a particular pricing tier is offered at all. This would be interpreted to indicate whether a
   * particular pricing tier is 'ever available' or 'ever offered.'
   * </pre>
   *
   * <code>bool offered = 1;</code>
   */
  public boolean getOffered() {
    return offered_;
  }

  public static final int AVAILABLE_FIELD_NUMBER = 2;
  private boolean available_;
  /**
   * <pre>
   * Specifies whether a particular pricing tier is currently available. This would be interpreted to indicate whether a
   * particular pricing tier is 'currently available,' 'currently in stock,' or 'currently offered.'
   * </pre>
   *
   * <code>bool available = 2;</code>
   */
  public boolean getAvailable() {
    return available_;
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
    if (offered_ != false) {
      output.writeBool(1, offered_);
    }
    if (available_ != false) {
      output.writeBool(2, available_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (offered_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, offered_);
    }
    if (available_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, available_);
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.PricingTierAvailability)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.PricingTierAvailability other = (io.opencannabis.schema.product.struct.PricingTierAvailability) obj;

    if (getOffered()
        != other.getOffered()) return false;
    if (getAvailable()
        != other.getAvailable()) return false;
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
    hash = (37 * hash) + OFFERED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOffered());
    hash = (37 * hash) + AVAILABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAvailable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.PricingTierAvailability parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.PricingTierAvailability prototype) {
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
   * Specifies availability and stock status flags for a particular pricing tier.
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.pricing.PricingTierAvailability}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.pricing.PricingTierAvailability)
      io.opencannabis.schema.product.struct.PricingTierAvailabilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_PricingTierAvailability_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.PricingTierAvailability.class, io.opencannabis.schema.product.struct.PricingTierAvailability.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.PricingTierAvailability.newBuilder()
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
      offered_ = false;

      available_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.ProductPricingSpec.internal_static_opencannabis_structs_pricing_PricingTierAvailability_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.PricingTierAvailability getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.PricingTierAvailability.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.PricingTierAvailability build() {
      io.opencannabis.schema.product.struct.PricingTierAvailability result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.PricingTierAvailability buildPartial() {
      io.opencannabis.schema.product.struct.PricingTierAvailability result = new io.opencannabis.schema.product.struct.PricingTierAvailability(this);
      result.offered_ = offered_;
      result.available_ = available_;
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
      if (other instanceof io.opencannabis.schema.product.struct.PricingTierAvailability) {
        return mergeFrom((io.opencannabis.schema.product.struct.PricingTierAvailability)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.PricingTierAvailability other) {
      if (other == io.opencannabis.schema.product.struct.PricingTierAvailability.getDefaultInstance()) return this;
      if (other.getOffered() != false) {
        setOffered(other.getOffered());
      }
      if (other.getAvailable() != false) {
        setAvailable(other.getAvailable());
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
      io.opencannabis.schema.product.struct.PricingTierAvailability parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.PricingTierAvailability) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean offered_ ;
    /**
     * <pre>
     * Specifies whether a particular pricing tier is offered at all. This would be interpreted to indicate whether a
     * particular pricing tier is 'ever available' or 'ever offered.'
     * </pre>
     *
     * <code>bool offered = 1;</code>
     */
    public boolean getOffered() {
      return offered_;
    }
    /**
     * <pre>
     * Specifies whether a particular pricing tier is offered at all. This would be interpreted to indicate whether a
     * particular pricing tier is 'ever available' or 'ever offered.'
     * </pre>
     *
     * <code>bool offered = 1;</code>
     */
    public Builder setOffered(boolean value) {
      
      offered_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether a particular pricing tier is offered at all. This would be interpreted to indicate whether a
     * particular pricing tier is 'ever available' or 'ever offered.'
     * </pre>
     *
     * <code>bool offered = 1;</code>
     */
    public Builder clearOffered() {
      
      offered_ = false;
      onChanged();
      return this;
    }

    private boolean available_ ;
    /**
     * <pre>
     * Specifies whether a particular pricing tier is currently available. This would be interpreted to indicate whether a
     * particular pricing tier is 'currently available,' 'currently in stock,' or 'currently offered.'
     * </pre>
     *
     * <code>bool available = 2;</code>
     */
    public boolean getAvailable() {
      return available_;
    }
    /**
     * <pre>
     * Specifies whether a particular pricing tier is currently available. This would be interpreted to indicate whether a
     * particular pricing tier is 'currently available,' 'currently in stock,' or 'currently offered.'
     * </pre>
     *
     * <code>bool available = 2;</code>
     */
    public Builder setAvailable(boolean value) {
      
      available_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether a particular pricing tier is currently available. This would be interpreted to indicate whether a
     * particular pricing tier is 'currently available,' 'currently in stock,' or 'currently offered.'
     * </pre>
     *
     * <code>bool available = 2;</code>
     */
    public Builder clearAvailable() {
      
      available_ = false;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.pricing.PricingTierAvailability)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.pricing.PricingTierAvailability)
  private static final io.opencannabis.schema.product.struct.PricingTierAvailability DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.PricingTierAvailability();
  }

  public static io.opencannabis.schema.product.struct.PricingTierAvailability getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PricingTierAvailability>
      PARSER = new com.google.protobuf.AbstractParser<PricingTierAvailability>() {
    @java.lang.Override
    public PricingTierAvailability parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PricingTierAvailability(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PricingTierAvailability> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PricingTierAvailability> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.product.struct.PricingTierAvailability getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

