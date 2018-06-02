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
// source: structs/Genetics.proto

package io.opencannabis.schema.product.struct;

/**
 * <pre>
 * Specifies genetics for a particular plant or flower item.
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.Genetics}
 */
public  final class Genetics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.Genetics)
    GeneticsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Genetics.newBuilder() to construct.
  private Genetics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Genetics() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Genetics(
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
            io.opencannabis.schema.base.ProductReference.Builder subBuilder = null;
            if (male_ != null) {
              subBuilder = male_.toBuilder();
            }
            male_ = input.readMessage(io.opencannabis.schema.base.ProductReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(male_);
              male_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.base.ProductReference.Builder subBuilder = null;
            if (female_ != null) {
              subBuilder = female_.toBuilder();
            }
            female_ = input.readMessage(io.opencannabis.schema.base.ProductReference.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(female_);
              female_ = subBuilder.buildPartial();
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
    return io.opencannabis.schema.product.struct.GeneticsStructs.internal_static_opencannabis_structs_Genetics_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.GeneticsStructs.internal_static_opencannabis_structs_Genetics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.Genetics.class, io.opencannabis.schema.product.struct.Genetics.Builder.class);
  }

  public static final int MALE_FIELD_NUMBER = 1;
  private io.opencannabis.schema.base.ProductReference male_;
  /**
   * <pre>
   * Specifies the male side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference male = 1;</code>
   */
  public boolean hasMale() {
    return male_ != null;
  }
  /**
   * <pre>
   * Specifies the male side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference male = 1;</code>
   */
  public io.opencannabis.schema.base.ProductReference getMale() {
    return male_ == null ? io.opencannabis.schema.base.ProductReference.getDefaultInstance() : male_;
  }
  /**
   * <pre>
   * Specifies the male side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference male = 1;</code>
   */
  public io.opencannabis.schema.base.ProductReferenceOrBuilder getMaleOrBuilder() {
    return getMale();
  }

  public static final int FEMALE_FIELD_NUMBER = 2;
  private io.opencannabis.schema.base.ProductReference female_;
  /**
   * <pre>
   * Specifies the female side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference female = 2;</code>
   */
  public boolean hasFemale() {
    return female_ != null;
  }
  /**
   * <pre>
   * Specifies the female side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference female = 2;</code>
   */
  public io.opencannabis.schema.base.ProductReference getFemale() {
    return female_ == null ? io.opencannabis.schema.base.ProductReference.getDefaultInstance() : female_;
  }
  /**
   * <pre>
   * Specifies the female side of an item's genetics.
   * </pre>
   *
   * <code>.opencannabis.base.ProductReference female = 2;</code>
   */
  public io.opencannabis.schema.base.ProductReferenceOrBuilder getFemaleOrBuilder() {
    return getFemale();
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
    if (male_ != null) {
      output.writeMessage(1, getMale());
    }
    if (female_ != null) {
      output.writeMessage(2, getFemale());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (male_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMale());
    }
    if (female_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getFemale());
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.Genetics)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.Genetics other = (io.opencannabis.schema.product.struct.Genetics) obj;

    boolean result = true;
    result = result && (hasMale() == other.hasMale());
    if (hasMale()) {
      result = result && getMale()
          .equals(other.getMale());
    }
    result = result && (hasFemale() == other.hasFemale());
    if (hasFemale()) {
      result = result && getFemale()
          .equals(other.getFemale());
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
    if (hasMale()) {
      hash = (37 * hash) + MALE_FIELD_NUMBER;
      hash = (53 * hash) + getMale().hashCode();
    }
    if (hasFemale()) {
      hash = (37 * hash) + FEMALE_FIELD_NUMBER;
      hash = (53 * hash) + getFemale().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.Genetics parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.Genetics prototype) {
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
   * Specifies genetics for a particular plant or flower item.
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.Genetics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.Genetics)
      io.opencannabis.schema.product.struct.GeneticsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.GeneticsStructs.internal_static_opencannabis_structs_Genetics_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.GeneticsStructs.internal_static_opencannabis_structs_Genetics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.Genetics.class, io.opencannabis.schema.product.struct.Genetics.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.Genetics.newBuilder()
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
      if (maleBuilder_ == null) {
        male_ = null;
      } else {
        male_ = null;
        maleBuilder_ = null;
      }
      if (femaleBuilder_ == null) {
        female_ = null;
      } else {
        female_ = null;
        femaleBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.GeneticsStructs.internal_static_opencannabis_structs_Genetics_descriptor;
    }

    public io.opencannabis.schema.product.struct.Genetics getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.Genetics.getDefaultInstance();
    }

    public io.opencannabis.schema.product.struct.Genetics build() {
      io.opencannabis.schema.product.struct.Genetics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.product.struct.Genetics buildPartial() {
      io.opencannabis.schema.product.struct.Genetics result = new io.opencannabis.schema.product.struct.Genetics(this);
      if (maleBuilder_ == null) {
        result.male_ = male_;
      } else {
        result.male_ = maleBuilder_.build();
      }
      if (femaleBuilder_ == null) {
        result.female_ = female_;
      } else {
        result.female_ = femaleBuilder_.build();
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
      if (other instanceof io.opencannabis.schema.product.struct.Genetics) {
        return mergeFrom((io.opencannabis.schema.product.struct.Genetics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.Genetics other) {
      if (other == io.opencannabis.schema.product.struct.Genetics.getDefaultInstance()) return this;
      if (other.hasMale()) {
        mergeMale(other.getMale());
      }
      if (other.hasFemale()) {
        mergeFemale(other.getFemale());
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
      io.opencannabis.schema.product.struct.Genetics parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.Genetics) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.base.ProductReference male_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder> maleBuilder_;
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public boolean hasMale() {
      return maleBuilder_ != null || male_ != null;
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public io.opencannabis.schema.base.ProductReference getMale() {
      if (maleBuilder_ == null) {
        return male_ == null ? io.opencannabis.schema.base.ProductReference.getDefaultInstance() : male_;
      } else {
        return maleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public Builder setMale(io.opencannabis.schema.base.ProductReference value) {
      if (maleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        male_ = value;
        onChanged();
      } else {
        maleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public Builder setMale(
        io.opencannabis.schema.base.ProductReference.Builder builderForValue) {
      if (maleBuilder_ == null) {
        male_ = builderForValue.build();
        onChanged();
      } else {
        maleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public Builder mergeMale(io.opencannabis.schema.base.ProductReference value) {
      if (maleBuilder_ == null) {
        if (male_ != null) {
          male_ =
            io.opencannabis.schema.base.ProductReference.newBuilder(male_).mergeFrom(value).buildPartial();
        } else {
          male_ = value;
        }
        onChanged();
      } else {
        maleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public Builder clearMale() {
      if (maleBuilder_ == null) {
        male_ = null;
        onChanged();
      } else {
        male_ = null;
        maleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public io.opencannabis.schema.base.ProductReference.Builder getMaleBuilder() {
      
      onChanged();
      return getMaleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    public io.opencannabis.schema.base.ProductReferenceOrBuilder getMaleOrBuilder() {
      if (maleBuilder_ != null) {
        return maleBuilder_.getMessageOrBuilder();
      } else {
        return male_ == null ?
            io.opencannabis.schema.base.ProductReference.getDefaultInstance() : male_;
      }
    }
    /**
     * <pre>
     * Specifies the male side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference male = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder> 
        getMaleFieldBuilder() {
      if (maleBuilder_ == null) {
        maleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder>(
                getMale(),
                getParentForChildren(),
                isClean());
        male_ = null;
      }
      return maleBuilder_;
    }

    private io.opencannabis.schema.base.ProductReference female_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder> femaleBuilder_;
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public boolean hasFemale() {
      return femaleBuilder_ != null || female_ != null;
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public io.opencannabis.schema.base.ProductReference getFemale() {
      if (femaleBuilder_ == null) {
        return female_ == null ? io.opencannabis.schema.base.ProductReference.getDefaultInstance() : female_;
      } else {
        return femaleBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public Builder setFemale(io.opencannabis.schema.base.ProductReference value) {
      if (femaleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        female_ = value;
        onChanged();
      } else {
        femaleBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public Builder setFemale(
        io.opencannabis.schema.base.ProductReference.Builder builderForValue) {
      if (femaleBuilder_ == null) {
        female_ = builderForValue.build();
        onChanged();
      } else {
        femaleBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public Builder mergeFemale(io.opencannabis.schema.base.ProductReference value) {
      if (femaleBuilder_ == null) {
        if (female_ != null) {
          female_ =
            io.opencannabis.schema.base.ProductReference.newBuilder(female_).mergeFrom(value).buildPartial();
        } else {
          female_ = value;
        }
        onChanged();
      } else {
        femaleBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public Builder clearFemale() {
      if (femaleBuilder_ == null) {
        female_ = null;
        onChanged();
      } else {
        female_ = null;
        femaleBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public io.opencannabis.schema.base.ProductReference.Builder getFemaleBuilder() {
      
      onChanged();
      return getFemaleFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    public io.opencannabis.schema.base.ProductReferenceOrBuilder getFemaleOrBuilder() {
      if (femaleBuilder_ != null) {
        return femaleBuilder_.getMessageOrBuilder();
      } else {
        return female_ == null ?
            io.opencannabis.schema.base.ProductReference.getDefaultInstance() : female_;
      }
    }
    /**
     * <pre>
     * Specifies the female side of an item's genetics.
     * </pre>
     *
     * <code>.opencannabis.base.ProductReference female = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder> 
        getFemaleFieldBuilder() {
      if (femaleBuilder_ == null) {
        femaleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.base.ProductReference, io.opencannabis.schema.base.ProductReference.Builder, io.opencannabis.schema.base.ProductReferenceOrBuilder>(
                getFemale(),
                getParentForChildren(),
                isClean());
        female_ = null;
      }
      return femaleBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.Genetics)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.Genetics)
  private static final io.opencannabis.schema.product.struct.Genetics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.Genetics();
  }

  public static io.opencannabis.schema.product.struct.Genetics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Genetics>
      PARSER = new com.google.protobuf.AbstractParser<Genetics>() {
    public Genetics parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Genetics(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Genetics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Genetics> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.product.struct.Genetics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

