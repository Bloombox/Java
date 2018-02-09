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
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * <pre>
 * -- Testing: Moisture
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.labtesting.Moisture}
 */
public  final class Moisture extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.labtesting.Moisture)
    MoistureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Moisture.newBuilder() to construct.
  private Moisture(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Moisture() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Moisture(
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
            io.opencannabis.schema.product.struct.testing.TestValue.Builder subBuilder = null;
            if (measurement_ != null) {
              subBuilder = measurement_.toBuilder();
            }
            measurement_ = input.readMessage(io.opencannabis.schema.product.struct.testing.TestValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(measurement_);
              measurement_ = subBuilder.buildPartial();
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Moisture_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Moisture_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.testing.Moisture.class, io.opencannabis.schema.product.struct.testing.Moisture.Builder.class);
  }

  public static final int MEASUREMENT_FIELD_NUMBER = 1;
  private io.opencannabis.schema.product.struct.testing.TestValue measurement_;
  /**
   * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
   */
  public boolean hasMeasurement() {
    return measurement_ != null;
  }
  /**
   * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
   */
  public io.opencannabis.schema.product.struct.testing.TestValue getMeasurement() {
    return measurement_ == null ? io.opencannabis.schema.product.struct.testing.TestValue.getDefaultInstance() : measurement_;
  }
  /**
   * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
   */
  public io.opencannabis.schema.product.struct.testing.TestValueOrBuilder getMeasurementOrBuilder() {
    return getMeasurement();
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
    if (measurement_ != null) {
      output.writeMessage(1, getMeasurement());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (measurement_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMeasurement());
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.testing.Moisture)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.testing.Moisture other = (io.opencannabis.schema.product.struct.testing.Moisture) obj;

    boolean result = true;
    result = result && (hasMeasurement() == other.hasMeasurement());
    if (hasMeasurement()) {
      result = result && getMeasurement()
          .equals(other.getMeasurement());
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
    if (hasMeasurement()) {
      hash = (37 * hash) + MEASUREMENT_FIELD_NUMBER;
      hash = (53 * hash) + getMeasurement().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.Moisture parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.testing.Moisture prototype) {
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
   * -- Testing: Moisture
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.labtesting.Moisture}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.labtesting.Moisture)
      io.opencannabis.schema.product.struct.testing.MoistureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Moisture_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Moisture_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.testing.Moisture.class, io.opencannabis.schema.product.struct.testing.Moisture.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.testing.Moisture.newBuilder()
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
      if (measurementBuilder_ == null) {
        measurement_ = null;
      } else {
        measurement_ = null;
        measurementBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_Moisture_descriptor;
    }

    public io.opencannabis.schema.product.struct.testing.Moisture getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.testing.Moisture.getDefaultInstance();
    }

    public io.opencannabis.schema.product.struct.testing.Moisture build() {
      io.opencannabis.schema.product.struct.testing.Moisture result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.product.struct.testing.Moisture buildPartial() {
      io.opencannabis.schema.product.struct.testing.Moisture result = new io.opencannabis.schema.product.struct.testing.Moisture(this);
      if (measurementBuilder_ == null) {
        result.measurement_ = measurement_;
      } else {
        result.measurement_ = measurementBuilder_.build();
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
      if (other instanceof io.opencannabis.schema.product.struct.testing.Moisture) {
        return mergeFrom((io.opencannabis.schema.product.struct.testing.Moisture)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.testing.Moisture other) {
      if (other == io.opencannabis.schema.product.struct.testing.Moisture.getDefaultInstance()) return this;
      if (other.hasMeasurement()) {
        mergeMeasurement(other.getMeasurement());
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
      io.opencannabis.schema.product.struct.testing.Moisture parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.testing.Moisture) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.product.struct.testing.TestValue measurement_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.testing.TestValue, io.opencannabis.schema.product.struct.testing.TestValue.Builder, io.opencannabis.schema.product.struct.testing.TestValueOrBuilder> measurementBuilder_;
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public boolean hasMeasurement() {
      return measurementBuilder_ != null || measurement_ != null;
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestValue getMeasurement() {
      if (measurementBuilder_ == null) {
        return measurement_ == null ? io.opencannabis.schema.product.struct.testing.TestValue.getDefaultInstance() : measurement_;
      } else {
        return measurementBuilder_.getMessage();
      }
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public Builder setMeasurement(io.opencannabis.schema.product.struct.testing.TestValue value) {
      if (measurementBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        measurement_ = value;
        onChanged();
      } else {
        measurementBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public Builder setMeasurement(
        io.opencannabis.schema.product.struct.testing.TestValue.Builder builderForValue) {
      if (measurementBuilder_ == null) {
        measurement_ = builderForValue.build();
        onChanged();
      } else {
        measurementBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public Builder mergeMeasurement(io.opencannabis.schema.product.struct.testing.TestValue value) {
      if (measurementBuilder_ == null) {
        if (measurement_ != null) {
          measurement_ =
            io.opencannabis.schema.product.struct.testing.TestValue.newBuilder(measurement_).mergeFrom(value).buildPartial();
        } else {
          measurement_ = value;
        }
        onChanged();
      } else {
        measurementBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public Builder clearMeasurement() {
      if (measurementBuilder_ == null) {
        measurement_ = null;
        onChanged();
      } else {
        measurement_ = null;
        measurementBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestValue.Builder getMeasurementBuilder() {
      
      onChanged();
      return getMeasurementFieldBuilder().getBuilder();
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestValueOrBuilder getMeasurementOrBuilder() {
      if (measurementBuilder_ != null) {
        return measurementBuilder_.getMessageOrBuilder();
      } else {
        return measurement_ == null ?
            io.opencannabis.schema.product.struct.testing.TestValue.getDefaultInstance() : measurement_;
      }
    }
    /**
     * <code>.opencannabis.structs.labtesting.TestValue measurement = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.testing.TestValue, io.opencannabis.schema.product.struct.testing.TestValue.Builder, io.opencannabis.schema.product.struct.testing.TestValueOrBuilder> 
        getMeasurementFieldBuilder() {
      if (measurementBuilder_ == null) {
        measurementBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.product.struct.testing.TestValue, io.opencannabis.schema.product.struct.testing.TestValue.Builder, io.opencannabis.schema.product.struct.testing.TestValueOrBuilder>(
                getMeasurement(),
                getParentForChildren(),
                isClean());
        measurement_ = null;
      }
      return measurementBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.labtesting.Moisture)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.labtesting.Moisture)
  private static final io.opencannabis.schema.product.struct.testing.Moisture DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.testing.Moisture();
  }

  public static io.opencannabis.schema.product.struct.testing.Moisture getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Moisture>
      PARSER = new com.google.protobuf.AbstractParser<Moisture>() {
    public Moisture parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Moisture(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Moisture> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Moisture> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.product.struct.testing.Moisture getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

