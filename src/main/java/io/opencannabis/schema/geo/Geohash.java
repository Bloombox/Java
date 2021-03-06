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
// source: geo/Geohash.proto

package io.opencannabis.schema.geo;

/**
 * <pre>
 * Specifies a point or area on earth, in such a manner that a hash algorithm is applied, where digits can be removed to
 * "zoom-out" from the location.
 * </pre>
 *
 * Protobuf type {@code opencannabis.geo.Geohash}
 */
public  final class Geohash extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.geo.Geohash)
    GeohashOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Geohash.newBuilder() to construct.
  private Geohash(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Geohash() {
    component_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Geohash(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              component_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            component_.add(s);
            break;
          }
          case 18: {
            io.opencannabis.schema.geo.Distance.Builder subBuilder = null;
            if (elevation_ != null) {
              subBuilder = elevation_.toBuilder();
            }
            elevation_ = input.readMessage(io.opencannabis.schema.geo.Distance.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(elevation_);
              elevation_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            io.opencannabis.schema.geo.Distance.Builder subBuilder = null;
            if (accuracy_ != null) {
              subBuilder = accuracy_.toBuilder();
            }
            accuracy_ = input.readMessage(io.opencannabis.schema.geo.Distance.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accuracy_);
              accuracy_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        component_ = component_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opencannabis.schema.geo.GeohashOuterClass.internal_static_opencannabis_geo_Geohash_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.geo.GeohashOuterClass.internal_static_opencannabis_geo_Geohash_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.geo.Geohash.class, io.opencannabis.schema.geo.Geohash.Builder.class);
  }

  private int bitField0_;
  public static final int COMPONENT_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList component_;
  /**
   * <pre>
   * Specifies geohash components.
   * </pre>
   *
   * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
   */
  public com.google.protobuf.ProtocolStringList
      getComponentList() {
    return component_;
  }
  /**
   * <pre>
   * Specifies geohash components.
   * </pre>
   *
   * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
   */
  public int getComponentCount() {
    return component_.size();
  }
  /**
   * <pre>
   * Specifies geohash components.
   * </pre>
   *
   * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
   */
  public java.lang.String getComponent(int index) {
    return component_.get(index);
  }
  /**
   * <pre>
   * Specifies geohash components.
   * </pre>
   *
   * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
   */
  public com.google.protobuf.ByteString
      getComponentBytes(int index) {
    return component_.getByteString(index);
  }

  public static final int ELEVATION_FIELD_NUMBER = 2;
  private io.opencannabis.schema.geo.Distance elevation_;
  /**
   * <pre>
   * Elevation of this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
   */
  public boolean hasElevation() {
    return elevation_ != null;
  }
  /**
   * <pre>
   * Elevation of this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
   */
  public io.opencannabis.schema.geo.Distance getElevation() {
    return elevation_ == null ? io.opencannabis.schema.geo.Distance.getDefaultInstance() : elevation_;
  }
  /**
   * <pre>
   * Elevation of this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
   */
  public io.opencannabis.schema.geo.DistanceOrBuilder getElevationOrBuilder() {
    return getElevation();
  }

  public static final int ACCURACY_FIELD_NUMBER = 3;
  private io.opencannabis.schema.geo.Distance accuracy_;
  /**
   * <pre>
   * Accuracy rating attached to this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
   */
  public boolean hasAccuracy() {
    return accuracy_ != null;
  }
  /**
   * <pre>
   * Accuracy rating attached to this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
   */
  public io.opencannabis.schema.geo.Distance getAccuracy() {
    return accuracy_ == null ? io.opencannabis.schema.geo.Distance.getDefaultInstance() : accuracy_;
  }
  /**
   * <pre>
   * Accuracy rating attached to this point, if any.
   * </pre>
   *
   * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
   */
  public io.opencannabis.schema.geo.DistanceOrBuilder getAccuracyOrBuilder() {
    return getAccuracy();
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
    for (int i = 0; i < component_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, component_.getRaw(i));
    }
    if (elevation_ != null) {
      output.writeMessage(2, getElevation());
    }
    if (accuracy_ != null) {
      output.writeMessage(3, getAccuracy());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < component_.size(); i++) {
        dataSize += computeStringSizeNoTag(component_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getComponentList().size();
    }
    if (elevation_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getElevation());
    }
    if (accuracy_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAccuracy());
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
    if (!(obj instanceof io.opencannabis.schema.geo.Geohash)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.geo.Geohash other = (io.opencannabis.schema.geo.Geohash) obj;

    if (!getComponentList()
        .equals(other.getComponentList())) return false;
    if (hasElevation() != other.hasElevation()) return false;
    if (hasElevation()) {
      if (!getElevation()
          .equals(other.getElevation())) return false;
    }
    if (hasAccuracy() != other.hasAccuracy()) return false;
    if (hasAccuracy()) {
      if (!getAccuracy()
          .equals(other.getAccuracy())) return false;
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
    if (getComponentCount() > 0) {
      hash = (37 * hash) + COMPONENT_FIELD_NUMBER;
      hash = (53 * hash) + getComponentList().hashCode();
    }
    if (hasElevation()) {
      hash = (37 * hash) + ELEVATION_FIELD_NUMBER;
      hash = (53 * hash) + getElevation().hashCode();
    }
    if (hasAccuracy()) {
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + getAccuracy().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.geo.Geohash parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Geohash parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Geohash parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Geohash parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.geo.Geohash prototype) {
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
   * Specifies a point or area on earth, in such a manner that a hash algorithm is applied, where digits can be removed to
   * "zoom-out" from the location.
   * </pre>
   *
   * Protobuf type {@code opencannabis.geo.Geohash}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.geo.Geohash)
      io.opencannabis.schema.geo.GeohashOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.geo.GeohashOuterClass.internal_static_opencannabis_geo_Geohash_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.geo.GeohashOuterClass.internal_static_opencannabis_geo_Geohash_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.geo.Geohash.class, io.opencannabis.schema.geo.Geohash.Builder.class);
    }

    // Construct using io.opencannabis.schema.geo.Geohash.newBuilder()
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
      component_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (elevationBuilder_ == null) {
        elevation_ = null;
      } else {
        elevation_ = null;
        elevationBuilder_ = null;
      }
      if (accuracyBuilder_ == null) {
        accuracy_ = null;
      } else {
        accuracy_ = null;
        accuracyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.geo.GeohashOuterClass.internal_static_opencannabis_geo_Geohash_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Geohash getDefaultInstanceForType() {
      return io.opencannabis.schema.geo.Geohash.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Geohash build() {
      io.opencannabis.schema.geo.Geohash result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.geo.Geohash buildPartial() {
      io.opencannabis.schema.geo.Geohash result = new io.opencannabis.schema.geo.Geohash(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        component_ = component_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.component_ = component_;
      if (elevationBuilder_ == null) {
        result.elevation_ = elevation_;
      } else {
        result.elevation_ = elevationBuilder_.build();
      }
      if (accuracyBuilder_ == null) {
        result.accuracy_ = accuracy_;
      } else {
        result.accuracy_ = accuracyBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.opencannabis.schema.geo.Geohash) {
        return mergeFrom((io.opencannabis.schema.geo.Geohash)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.geo.Geohash other) {
      if (other == io.opencannabis.schema.geo.Geohash.getDefaultInstance()) return this;
      if (!other.component_.isEmpty()) {
        if (component_.isEmpty()) {
          component_ = other.component_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureComponentIsMutable();
          component_.addAll(other.component_);
        }
        onChanged();
      }
      if (other.hasElevation()) {
        mergeElevation(other.getElevation());
      }
      if (other.hasAccuracy()) {
        mergeAccuracy(other.getAccuracy());
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
      io.opencannabis.schema.geo.Geohash parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.geo.Geohash) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList component_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureComponentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        component_ = new com.google.protobuf.LazyStringArrayList(component_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public com.google.protobuf.ProtocolStringList
        getComponentList() {
      return component_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public int getComponentCount() {
      return component_.size();
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public java.lang.String getComponent(int index) {
      return component_.get(index);
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public com.google.protobuf.ByteString
        getComponentBytes(int index) {
      return component_.getByteString(index);
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public Builder setComponent(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureComponentIsMutable();
      component_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public Builder addComponent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureComponentIsMutable();
      component_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public Builder addAllComponent(
        java.lang.Iterable<java.lang.String> values) {
      ensureComponentIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, component_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public Builder clearComponent() {
      component_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies geohash components.
     * </pre>
     *
     * <code>repeated string component = 1 [(.gen_bq_schema.description) = "Entire string, and substrings, of the geohash."];</code>
     */
    public Builder addComponentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureComponentIsMutable();
      component_.add(value);
      onChanged();
      return this;
    }

    private io.opencannabis.schema.geo.Distance elevation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder> elevationBuilder_;
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public boolean hasElevation() {
      return elevationBuilder_ != null || elevation_ != null;
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.Distance getElevation() {
      if (elevationBuilder_ == null) {
        return elevation_ == null ? io.opencannabis.schema.geo.Distance.getDefaultInstance() : elevation_;
      } else {
        return elevationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public Builder setElevation(io.opencannabis.schema.geo.Distance value) {
      if (elevationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        elevation_ = value;
        onChanged();
      } else {
        elevationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public Builder setElevation(
        io.opencannabis.schema.geo.Distance.Builder builderForValue) {
      if (elevationBuilder_ == null) {
        elevation_ = builderForValue.build();
        onChanged();
      } else {
        elevationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public Builder mergeElevation(io.opencannabis.schema.geo.Distance value) {
      if (elevationBuilder_ == null) {
        if (elevation_ != null) {
          elevation_ =
            io.opencannabis.schema.geo.Distance.newBuilder(elevation_).mergeFrom(value).buildPartial();
        } else {
          elevation_ = value;
        }
        onChanged();
      } else {
        elevationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public Builder clearElevation() {
      if (elevationBuilder_ == null) {
        elevation_ = null;
        onChanged();
      } else {
        elevation_ = null;
        elevationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.Distance.Builder getElevationBuilder() {
      
      onChanged();
      return getElevationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.DistanceOrBuilder getElevationOrBuilder() {
      if (elevationBuilder_ != null) {
        return elevationBuilder_.getMessageOrBuilder();
      } else {
        return elevation_ == null ?
            io.opencannabis.schema.geo.Distance.getDefaultInstance() : elevation_;
      }
    }
    /**
     * <pre>
     * Elevation of this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance elevation = 2 [(.gen_bq_schema.description) = "Elevation of this point, if any."];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder> 
        getElevationFieldBuilder() {
      if (elevationBuilder_ == null) {
        elevationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder>(
                getElevation(),
                getParentForChildren(),
                isClean());
        elevation_ = null;
      }
      return elevationBuilder_;
    }

    private io.opencannabis.schema.geo.Distance accuracy_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder> accuracyBuilder_;
    /**
     * <pre>
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public boolean hasAccuracy() {
      return accuracyBuilder_ != null || accuracy_ != null;
    }
    /**
     * <pre>
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.Distance getAccuracy() {
      if (accuracyBuilder_ == null) {
        return accuracy_ == null ? io.opencannabis.schema.geo.Distance.getDefaultInstance() : accuracy_;
      } else {
        return accuracyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public Builder setAccuracy(io.opencannabis.schema.geo.Distance value) {
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
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public Builder setAccuracy(
        io.opencannabis.schema.geo.Distance.Builder builderForValue) {
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
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public Builder mergeAccuracy(io.opencannabis.schema.geo.Distance value) {
      if (accuracyBuilder_ == null) {
        if (accuracy_ != null) {
          accuracy_ =
            io.opencannabis.schema.geo.Distance.newBuilder(accuracy_).mergeFrom(value).buildPartial();
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
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
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
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.Distance.Builder getAccuracyBuilder() {
      
      onChanged();
      return getAccuracyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    public io.opencannabis.schema.geo.DistanceOrBuilder getAccuracyOrBuilder() {
      if (accuracyBuilder_ != null) {
        return accuracyBuilder_.getMessageOrBuilder();
      } else {
        return accuracy_ == null ?
            io.opencannabis.schema.geo.Distance.getDefaultInstance() : accuracy_;
      }
    }
    /**
     * <pre>
     * Accuracy rating attached to this point, if any.
     * </pre>
     *
     * <code>.opencannabis.geo.Distance accuracy = 3 [(.gen_bq_schema.description) = "Accuracy rating attached to this point, if any."];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder> 
        getAccuracyFieldBuilder() {
      if (accuracyBuilder_ == null) {
        accuracyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.geo.Distance, io.opencannabis.schema.geo.Distance.Builder, io.opencannabis.schema.geo.DistanceOrBuilder>(
                getAccuracy(),
                getParentForChildren(),
                isClean());
        accuracy_ = null;
      }
      return accuracyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.geo.Geohash)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.geo.Geohash)
  private static final io.opencannabis.schema.geo.Geohash DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.geo.Geohash();
  }

  public static io.opencannabis.schema.geo.Geohash getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Geohash>
      PARSER = new com.google.protobuf.AbstractParser<Geohash>() {
    @java.lang.Override
    public Geohash parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Geohash(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Geohash> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Geohash> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.geo.Geohash getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

