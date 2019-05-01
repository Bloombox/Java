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
// source: temporal/Duration.proto

package io.opencannabis.schema.temporal;

/**
 * <pre>
 * Specifies a duration, or, a distance between two points in temporal space.
 * </pre>
 *
 * Protobuf type {@code opencannabis.temporal.Duration}
 */
public  final class Duration extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.temporal.Duration)
    DurationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Duration.newBuilder() to construct.
  private Duration(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Duration() {
    unit_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Duration(
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

            unit_ = rawValue;
            break;
          }
          case 16: {

            amount_ = input.readUInt32();
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
    return io.opencannabis.schema.temporal.DurationOuterClass.internal_static_opencannabis_temporal_Duration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.temporal.DurationOuterClass.internal_static_opencannabis_temporal_Duration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.temporal.Duration.class, io.opencannabis.schema.temporal.Duration.Builder.class);
  }

  public static final int UNIT_FIELD_NUMBER = 1;
  private int unit_;
  /**
   * <pre>
   * Specifies the unit this duration operates on.
   * </pre>
   *
   * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <pre>
   * Specifies the unit this duration operates on.
   * </pre>
   *
   * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
   */
  public io.opencannabis.schema.temporal.TimeUnit getUnit() {
    @SuppressWarnings("deprecation")
    io.opencannabis.schema.temporal.TimeUnit result = io.opencannabis.schema.temporal.TimeUnit.valueOf(unit_);
    return result == null ? io.opencannabis.schema.temporal.TimeUnit.UNRECOGNIZED : result;
  }

  public static final int AMOUNT_FIELD_NUMBER = 2;
  private int amount_;
  /**
   * <pre>
   * Specifies the amount expressed of the above duration.
   * </pre>
   *
   * <code>uint32 amount = 2;</code>
   */
  public int getAmount() {
    return amount_;
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
    if (unit_ != io.opencannabis.schema.temporal.TimeUnit.MILLISECONDS.getNumber()) {
      output.writeEnum(1, unit_);
    }
    if (amount_ != 0) {
      output.writeUInt32(2, amount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unit_ != io.opencannabis.schema.temporal.TimeUnit.MILLISECONDS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, unit_);
    }
    if (amount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, amount_);
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
    if (!(obj instanceof io.opencannabis.schema.temporal.Duration)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.temporal.Duration other = (io.opencannabis.schema.temporal.Duration) obj;

    if (unit_ != other.unit_) return false;
    if (getAmount()
        != other.getAmount()) return false;
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
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getAmount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.temporal.Duration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.temporal.Duration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.temporal.Duration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.temporal.Duration parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.temporal.Duration prototype) {
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
   * Specifies a duration, or, a distance between two points in temporal space.
   * </pre>
   *
   * Protobuf type {@code opencannabis.temporal.Duration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.temporal.Duration)
      io.opencannabis.schema.temporal.DurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.temporal.DurationOuterClass.internal_static_opencannabis_temporal_Duration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.temporal.DurationOuterClass.internal_static_opencannabis_temporal_Duration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.temporal.Duration.class, io.opencannabis.schema.temporal.Duration.Builder.class);
    }

    // Construct using io.opencannabis.schema.temporal.Duration.newBuilder()
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
      unit_ = 0;

      amount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.temporal.DurationOuterClass.internal_static_opencannabis_temporal_Duration_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.temporal.Duration getDefaultInstanceForType() {
      return io.opencannabis.schema.temporal.Duration.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.temporal.Duration build() {
      io.opencannabis.schema.temporal.Duration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.temporal.Duration buildPartial() {
      io.opencannabis.schema.temporal.Duration result = new io.opencannabis.schema.temporal.Duration(this);
      result.unit_ = unit_;
      result.amount_ = amount_;
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
      if (other instanceof io.opencannabis.schema.temporal.Duration) {
        return mergeFrom((io.opencannabis.schema.temporal.Duration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.temporal.Duration other) {
      if (other == io.opencannabis.schema.temporal.Duration.getDefaultInstance()) return this;
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      if (other.getAmount() != 0) {
        setAmount(other.getAmount());
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
      io.opencannabis.schema.temporal.Duration parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.temporal.Duration) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int unit_ = 0;
    /**
     * <pre>
     * Specifies the unit this duration operates on.
     * </pre>
     *
     * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <pre>
     * Specifies the unit this duration operates on.
     * </pre>
     *
     * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the unit this duration operates on.
     * </pre>
     *
     * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
     */
    public io.opencannabis.schema.temporal.TimeUnit getUnit() {
      @SuppressWarnings("deprecation")
      io.opencannabis.schema.temporal.TimeUnit result = io.opencannabis.schema.temporal.TimeUnit.valueOf(unit_);
      return result == null ? io.opencannabis.schema.temporal.TimeUnit.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the unit this duration operates on.
     * </pre>
     *
     * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
     */
    public Builder setUnit(io.opencannabis.schema.temporal.TimeUnit value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the unit this duration operates on.
     * </pre>
     *
     * <code>.opencannabis.temporal.TimeUnit unit = 1;</code>
     */
    public Builder clearUnit() {
      
      unit_ = 0;
      onChanged();
      return this;
    }

    private int amount_ ;
    /**
     * <pre>
     * Specifies the amount expressed of the above duration.
     * </pre>
     *
     * <code>uint32 amount = 2;</code>
     */
    public int getAmount() {
      return amount_;
    }
    /**
     * <pre>
     * Specifies the amount expressed of the above duration.
     * </pre>
     *
     * <code>uint32 amount = 2;</code>
     */
    public Builder setAmount(int value) {
      
      amount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the amount expressed of the above duration.
     * </pre>
     *
     * <code>uint32 amount = 2;</code>
     */
    public Builder clearAmount() {
      
      amount_ = 0;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.temporal.Duration)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.temporal.Duration)
  private static final io.opencannabis.schema.temporal.Duration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.temporal.Duration();
  }

  public static io.opencannabis.schema.temporal.Duration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Duration>
      PARSER = new com.google.protobuf.AbstractParser<Duration>() {
    @java.lang.Override
    public Duration parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Duration(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Duration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Duration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.temporal.Duration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

