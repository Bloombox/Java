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
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * <pre>
 * Specifies results of heavy metal testing.
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.labtesting.Metals}
 */
public  final class Metals extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.labtesting.Metals)
    MetalsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metals.newBuilder() to construct.
  private Metals(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metals() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metals(
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

            metalFree_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              measurements_ = com.google.protobuf.MapField.newMapField(
                  MeasurementsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
            measurements__ = input.readMessage(
                MeasurementsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            measurements_.getMutableMap().put(
                measurements__.getKey(), measurements__.getValue());
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetMeasurements();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.testing.Metals.class, io.opencannabis.schema.product.struct.testing.Metals.Builder.class);
  }

  private int bitField0_;
  public static final int METAL_FREE_FIELD_NUMBER = 1;
  private boolean metalFree_;
  /**
   * <pre>
   * Flag indicating the product is heavy-metal-free.
   * </pre>
   *
   * <code>bool metal_free = 1;</code>
   */
  public boolean getMetalFree() {
    return metalFree_;
  }

  public static final int MEASUREMENTS_FIELD_NUMBER = 2;
  private static final class MeasurementsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>newDefaultInstance(
                io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_MeasurementsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.opencannabis.schema.product.struct.testing.TestValue.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> measurements_;
  private com.google.protobuf.MapField<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
  internalGetMeasurements() {
    if (measurements_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          MeasurementsDefaultEntryHolder.defaultEntry);
    }
    return measurements_;
  }

  public int getMeasurementsCount() {
    return internalGetMeasurements().getMap().size();
  }
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  public boolean containsMeasurements(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetMeasurements().getMap().containsKey(key);
  }
  /**
   * Use {@link #getMeasurementsMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> getMeasurements() {
    return getMeasurementsMap();
  }
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  public java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> getMeasurementsMap() {
    return internalGetMeasurements().getMap();
  }
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  public io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrDefault(
      java.lang.String key,
      io.opencannabis.schema.product.struct.testing.TestValue defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> map =
        internalGetMeasurements().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Measurements for specific, named, heavy metal values.
   * </pre>
   *
   * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
   */

  public io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> map =
        internalGetMeasurements().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (metalFree_ != false) {
      output.writeBool(1, metalFree_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetMeasurements(),
        MeasurementsDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metalFree_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, metalFree_);
    }
    for (java.util.Map.Entry<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> entry
         : internalGetMeasurements().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
      measurements__ = MeasurementsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, measurements__);
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.testing.Metals)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.testing.Metals other = (io.opencannabis.schema.product.struct.testing.Metals) obj;

    if (getMetalFree()
        != other.getMetalFree()) return false;
    if (!internalGetMeasurements().equals(
        other.internalGetMeasurements())) return false;
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
    hash = (37 * hash) + METAL_FREE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMetalFree());
    if (!internalGetMeasurements().getMap().isEmpty()) {
      hash = (37 * hash) + MEASUREMENTS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetMeasurements().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Metals parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.testing.Metals prototype) {
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
   * Specifies results of heavy metal testing.
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.labtesting.Metals}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.labtesting.Metals)
      io.opencannabis.schema.product.struct.testing.MetalsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMeasurements();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableMeasurements();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.testing.Metals.class, io.opencannabis.schema.product.struct.testing.Metals.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.testing.Metals.newBuilder()
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
      metalFree_ = false;

      internalGetMutableMeasurements().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Metals_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.testing.Metals getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.testing.Metals.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.testing.Metals build() {
      io.opencannabis.schema.product.struct.testing.Metals result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.product.struct.testing.Metals buildPartial() {
      io.opencannabis.schema.product.struct.testing.Metals result = new io.opencannabis.schema.product.struct.testing.Metals(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.metalFree_ = metalFree_;
      result.measurements_ = internalGetMeasurements();
      result.measurements_.makeImmutable();
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
      if (other instanceof io.opencannabis.schema.product.struct.testing.Metals) {
        return mergeFrom((io.opencannabis.schema.product.struct.testing.Metals)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.testing.Metals other) {
      if (other == io.opencannabis.schema.product.struct.testing.Metals.getDefaultInstance()) return this;
      if (other.getMetalFree() != false) {
        setMetalFree(other.getMetalFree());
      }
      internalGetMutableMeasurements().mergeFrom(
          other.internalGetMeasurements());
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
      io.opencannabis.schema.product.struct.testing.Metals parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.testing.Metals) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean metalFree_ ;
    /**
     * <pre>
     * Flag indicating the product is heavy-metal-free.
     * </pre>
     *
     * <code>bool metal_free = 1;</code>
     */
    public boolean getMetalFree() {
      return metalFree_;
    }
    /**
     * <pre>
     * Flag indicating the product is heavy-metal-free.
     * </pre>
     *
     * <code>bool metal_free = 1;</code>
     */
    public Builder setMetalFree(boolean value) {
      
      metalFree_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Flag indicating the product is heavy-metal-free.
     * </pre>
     *
     * <code>bool metal_free = 1;</code>
     */
    public Builder clearMetalFree() {
      
      metalFree_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> measurements_;
    private com.google.protobuf.MapField<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
    internalGetMeasurements() {
      if (measurements_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MeasurementsDefaultEntryHolder.defaultEntry);
      }
      return measurements_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
    internalGetMutableMeasurements() {
      onChanged();;
      if (measurements_ == null) {
        measurements_ = com.google.protobuf.MapField.newMapField(
            MeasurementsDefaultEntryHolder.defaultEntry);
      }
      if (!measurements_.isMutable()) {
        measurements_ = measurements_.copy();
      }
      return measurements_;
    }

    public int getMeasurementsCount() {
      return internalGetMeasurements().getMap().size();
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public boolean containsMeasurements(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetMeasurements().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMeasurementsMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> getMeasurements() {
      return getMeasurementsMap();
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> getMeasurementsMap() {
      return internalGetMeasurements().getMap();
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrDefault(
        java.lang.String key,
        io.opencannabis.schema.product.struct.testing.TestValue defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> map =
          internalGetMeasurements().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public io.opencannabis.schema.product.struct.testing.TestValue getMeasurementsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> map =
          internalGetMeasurements().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearMeasurements() {
      internalGetMutableMeasurements().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public Builder removeMeasurements(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMeasurements().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue>
    getMutableMeasurements() {
      return internalGetMutableMeasurements().getMutableMap();
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */
    public Builder putMeasurements(
        java.lang.String key,
        io.opencannabis.schema.product.struct.testing.TestValue value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableMeasurements().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Measurements for specific, named, heavy metal values.
     * </pre>
     *
     * <code>map&lt;string, .opencannabis.structs.labtesting.TestValue&gt; measurements = 2;</code>
     */

    public Builder putAllMeasurements(
        java.util.Map<java.lang.String, io.opencannabis.schema.product.struct.testing.TestValue> values) {
      internalGetMutableMeasurements().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.labtesting.Metals)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.labtesting.Metals)
  private static final io.opencannabis.schema.product.struct.testing.Metals DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.testing.Metals();
  }

  public static io.opencannabis.schema.product.struct.testing.Metals getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metals>
      PARSER = new com.google.protobuf.AbstractParser<Metals>() {
    @java.lang.Override
    public Metals parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metals(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metals> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metals> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.product.struct.testing.Metals getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

