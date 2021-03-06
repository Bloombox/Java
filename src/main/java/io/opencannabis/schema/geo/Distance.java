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
// source: geo/Distance.proto

package io.opencannabis.schema.geo;

/**
 * <pre>
 * Specifies a distance between two locations.
 * </pre>
 *
 * Protobuf type {@code opencannabis.geo.Distance}
 */
public  final class Distance extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.geo.Distance)
    DistanceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Distance.newBuilder() to construct.
  private Distance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Distance() {
    unit_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Distance(
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

            estimate_ = input.readBool();
            break;
          }
          case 18: {
            io.opencannabis.schema.geo.LocationAccuracy.Builder subBuilder = null;
            if (accuracy_ != null) {
              subBuilder = accuracy_.toBuilder();
            }
            accuracy_ = input.readMessage(io.opencannabis.schema.geo.LocationAccuracy.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accuracy_);
              accuracy_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            unit_ = rawValue;
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
    return io.opencannabis.schema.geo.DistanceOuterClass.internal_static_opencannabis_geo_Distance_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.geo.DistanceOuterClass.internal_static_opencannabis_geo_Distance_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.geo.Distance.class, io.opencannabis.schema.geo.Distance.Builder.class);
  }

  public static final int ESTIMATE_FIELD_NUMBER = 1;
  private boolean estimate_;
  /**
   * <pre>
   * Specifies whether this distance is an estimate.
   * </pre>
   *
   * <code>bool estimate = 1 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
   */
  public boolean getEstimate() {
    return estimate_;
  }

  public static final int ACCURACY_FIELD_NUMBER = 2;
  private io.opencannabis.schema.geo.LocationAccuracy accuracy_;
  /**
   * <pre>
   * Specifies the accuracy estimate for the distance values, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
   */
  public boolean hasAccuracy() {
    return accuracy_ != null;
  }
  /**
   * <pre>
   * Specifies the accuracy estimate for the distance values, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
   */
  public io.opencannabis.schema.geo.LocationAccuracy getAccuracy() {
    return accuracy_ == null ? io.opencannabis.schema.geo.LocationAccuracy.getDefaultInstance() : accuracy_;
  }
  /**
   * <pre>
   * Specifies the accuracy estimate for the distance values, if known.
   * </pre>
   *
   * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
   */
  public io.opencannabis.schema.geo.LocationAccuracyOrBuilder getAccuracyOrBuilder() {
    return getAccuracy();
  }

  public static final int UNIT_FIELD_NUMBER = 3;
  private int unit_;
  /**
   * <pre>
   * Specifies the unit of measurement for a location accuracy estimate.
   * </pre>
   *
   * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <pre>
   * Specifies the unit of measurement for a location accuracy estimate.
   * </pre>
   *
   * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
   */
  public io.opencannabis.schema.geo.DistanceUnit getUnit() {
    @SuppressWarnings("deprecation")
    io.opencannabis.schema.geo.DistanceUnit result = io.opencannabis.schema.geo.DistanceUnit.valueOf(unit_);
    return result == null ? io.opencannabis.schema.geo.DistanceUnit.UNRECOGNIZED : result;
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
    if (estimate_ != false) {
      output.writeBool(1, estimate_);
    }
    if (accuracy_ != null) {
      output.writeMessage(2, getAccuracy());
    }
    if (unit_ != io.opencannabis.schema.geo.DistanceUnit.METERS.getNumber()) {
      output.writeEnum(3, unit_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (estimate_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, estimate_);
    }
    if (accuracy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAccuracy());
    }
    if (unit_ != io.opencannabis.schema.geo.DistanceUnit.METERS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, unit_);
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
    if (!(obj instanceof io.opencannabis.schema.geo.Distance)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.geo.Distance other = (io.opencannabis.schema.geo.Distance) obj;

    if (getEstimate()
        != other.getEstimate()) return false;
    if (hasAccuracy() != other.hasAccuracy()) return false;
    if (hasAccuracy()) {
      if (!getAccuracy()
          .equals(other.getAccuracy())) return false;
    }
    if (unit_ != other.unit_) return false;
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
    hash = (37 * hash) + ESTIMATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEstimate());
    if (hasAccuracy()) {
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + getAccuracy().hashCode();
    }
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.geo.Distance parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Distance parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Distance parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Distance parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.geo.Distance prototype) {
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
   * Specifies a distance between two locations.
   * </pre>
   *
   * Protobuf type {@code opencannabis.geo.Distance}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.geo.Distance)
      io.opencannabis.schema.geo.DistanceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.geo.DistanceOuterClass.internal_static_opencannabis_geo_Distance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.geo.DistanceOuterClass.internal_static_opencannabis_geo_Distance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.geo.Distance.class, io.opencannabis.schema.geo.Distance.Builder.class);
    }

    // Construct using io.opencannabis.schema.geo.Distance.newBuilder()
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
      estimate_ = false;

      if (accuracyBuilder_ == null) {
        accuracy_ = null;
      } else {
        accuracy_ = null;
        accuracyBuilder_ = null;
      }
      unit_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.geo.DistanceOuterClass.internal_static_opencannabis_geo_Distance_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Distance getDefaultInstanceForType() {
      return io.opencannabis.schema.geo.Distance.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Distance build() {
      io.opencannabis.schema.geo.Distance result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Distance buildPartial() {
      io.opencannabis.schema.geo.Distance result = new io.opencannabis.schema.geo.Distance(this);
      result.estimate_ = estimate_;
      if (accuracyBuilder_ == null) {
        result.accuracy_ = accuracy_;
      } else {
        result.accuracy_ = accuracyBuilder_.build();
      }
      result.unit_ = unit_;
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
      if (other instanceof io.opencannabis.schema.geo.Distance) {
        return mergeFrom((io.opencannabis.schema.geo.Distance)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.geo.Distance other) {
      if (other == io.opencannabis.schema.geo.Distance.getDefaultInstance()) return this;
      if (other.getEstimate() != false) {
        setEstimate(other.getEstimate());
      }
      if (other.hasAccuracy()) {
        mergeAccuracy(other.getAccuracy());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
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
      io.opencannabis.schema.geo.Distance parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.geo.Distance) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean estimate_ ;
    /**
     * <pre>
     * Specifies whether this distance is an estimate.
     * </pre>
     *
     * <code>bool estimate = 1 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public boolean getEstimate() {
      return estimate_;
    }
    /**
     * <pre>
     * Specifies whether this distance is an estimate.
     * </pre>
     *
     * <code>bool estimate = 1 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public Builder setEstimate(boolean value) {
      
      estimate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether this distance is an estimate.
     * </pre>
     *
     * <code>bool estimate = 1 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public Builder clearEstimate() {
      
      estimate_ = false;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.geo.LocationAccuracy accuracy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.LocationAccuracy, io.opencannabis.schema.geo.LocationAccuracy.Builder, io.opencannabis.schema.geo.LocationAccuracyOrBuilder> accuracyBuilder_;
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public boolean hasAccuracy() {
      return accuracyBuilder_ != null || accuracy_ != null;
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public io.opencannabis.schema.geo.LocationAccuracy getAccuracy() {
      if (accuracyBuilder_ == null) {
        return accuracy_ == null ? io.opencannabis.schema.geo.LocationAccuracy.getDefaultInstance() : accuracy_;
      } else {
        return accuracyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public Builder setAccuracy(io.opencannabis.schema.geo.LocationAccuracy value) {
      if (accuracyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accuracy_ = value;
        onChanged();
      } else {
        accuracyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public Builder setAccuracy(
        io.opencannabis.schema.geo.LocationAccuracy.Builder builderForValue) {
      if (accuracyBuilder_ == null) {
        accuracy_ = builderForValue.build();
        onChanged();
      } else {
        accuracyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public Builder mergeAccuracy(io.opencannabis.schema.geo.LocationAccuracy value) {
      if (accuracyBuilder_ == null) {
        if (accuracy_ != null) {
          accuracy_ =
            io.opencannabis.schema.geo.LocationAccuracy.newBuilder(accuracy_).mergeFrom(value).buildPartial();
        } else {
          accuracy_ = value;
        }
        onChanged();
      } else {
        accuracyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public Builder clearAccuracy() {
      if (accuracyBuilder_ == null) {
        accuracy_ = null;
        onChanged();
      } else {
        accuracy_ = null;
        accuracyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public io.opencannabis.schema.geo.LocationAccuracy.Builder getAccuracyBuilder() {
      
      onChanged();
      return getAccuracyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    public io.opencannabis.schema.geo.LocationAccuracyOrBuilder getAccuracyOrBuilder() {
      if (accuracyBuilder_ != null) {
        return accuracyBuilder_.getMessageOrBuilder();
      } else {
        return accuracy_ == null ?
            io.opencannabis.schema.geo.LocationAccuracy.getDefaultInstance() : accuracy_;
      }
    }
    /**
     * <pre>
     * Specifies the accuracy estimate for the distance values, if known.
     * </pre>
     *
     * <code>.opencannabis.geo.LocationAccuracy accuracy = 2 [(.gen_bq_schema.description) = "Specifies the accuracy estimate for the distance values, if known."];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.LocationAccuracy, io.opencannabis.schema.geo.LocationAccuracy.Builder, io.opencannabis.schema.geo.LocationAccuracyOrBuilder> 
        getAccuracyFieldBuilder() {
      if (accuracyBuilder_ == null) {
        accuracyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.geo.LocationAccuracy, io.opencannabis.schema.geo.LocationAccuracy.Builder, io.opencannabis.schema.geo.LocationAccuracyOrBuilder>(
                getAccuracy(),
                getParentForChildren(),
                isClean());
        accuracy_ = null;
      }
      return accuracyBuilder_;
    }

    private int unit_ = 0;
    /**
     * <pre>
     * Specifies the unit of measurement for a location accuracy estimate.
     * </pre>
     *
     * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <pre>
     * Specifies the unit of measurement for a location accuracy estimate.
     * </pre>
     *
     * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the unit of measurement for a location accuracy estimate.
     * </pre>
     *
     * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public io.opencannabis.schema.geo.DistanceUnit getUnit() {
      @SuppressWarnings("deprecation")
      io.opencannabis.schema.geo.DistanceUnit result = io.opencannabis.schema.geo.DistanceUnit.valueOf(unit_);
      return result == null ? io.opencannabis.schema.geo.DistanceUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the unit of measurement for a location accuracy estimate.
     * </pre>
     *
     * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public Builder setUnit(io.opencannabis.schema.geo.DistanceUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the unit of measurement for a location accuracy estimate.
     * </pre>
     *
     * <code>.opencannabis.geo.DistanceUnit unit = 3 [(.gen_bq_schema.description) = "Specifies whether this distance is an estimate."];</code>
     */
    public Builder clearUnit() {
      
      unit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.geo.Distance)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.geo.Distance)
  private static final io.opencannabis.schema.geo.Distance DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.geo.Distance();
  }

  public static io.opencannabis.schema.geo.Distance getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Distance>
      PARSER = new com.google.protobuf.AbstractParser<Distance>() {
    @java.lang.Override
    public Distance parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Distance(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Distance> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Distance> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.geo.Distance getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

