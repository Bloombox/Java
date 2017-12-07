/*
 * Copyright 2017, Bloombox, LLC.
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
// source: structs/Version.proto

package io.bloombox.schema.struct;

/**
 * <pre>
 * Structure that allows universal specification of most common version patterns.
 * </pre>
 *
 * Protobuf type {@code structs.VersionSpec}
 */
public  final class VersionSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:structs.VersionSpec)
    VersionSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VersionSpec.newBuilder() to construct.
  private VersionSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VersionSpec() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VersionSpec(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
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
            java.lang.String s = input.readStringRequireUtf8();
            specCase_ = 1;
            spec_ = s;
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
    return io.bloombox.schema.struct.Version.internal_static_structs_VersionSpec_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.struct.Version.internal_static_structs_VersionSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.struct.VersionSpec.class, io.bloombox.schema.struct.VersionSpec.Builder.class);
  }

  private int specCase_ = 0;
  private java.lang.Object spec_;
  public enum SpecCase
      implements com.google.protobuf.Internal.EnumLite {
    NAME(1),
    SPEC_NOT_SET(0);
    private final int value;
    private SpecCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecCase forNumber(int value) {
      switch (value) {
        case 1: return NAME;
        case 0: return SPEC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecCase
  getSpecCase() {
    return SpecCase.forNumber(
        specCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Version specified by arbitrary name.
   * </pre>
   *
   * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = "";
    if (specCase_ == 1) {
      ref = spec_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (specCase_ == 1) {
        spec_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Version specified by arbitrary name.
   * </pre>
   *
   * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = "";
    if (specCase_ == 1) {
      ref = spec_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (specCase_ == 1) {
        spec_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (specCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spec_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spec_);
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
    if (!(obj instanceof io.bloombox.schema.struct.VersionSpec)) {
      return super.equals(obj);
    }
    io.bloombox.schema.struct.VersionSpec other = (io.bloombox.schema.struct.VersionSpec) obj;

    boolean result = true;
    result = result && getSpecCase().equals(
        other.getSpecCase());
    if (!result) return false;
    switch (specCase_) {
      case 1:
        result = result && getName()
            .equals(other.getName());
        break;
      case 0:
      default:
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
    switch (specCase_) {
      case 1:
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.struct.VersionSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.struct.VersionSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.struct.VersionSpec parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.struct.VersionSpec prototype) {
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
   * Structure that allows universal specification of most common version patterns.
   * </pre>
   *
   * Protobuf type {@code structs.VersionSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:structs.VersionSpec)
      io.bloombox.schema.struct.VersionSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.struct.Version.internal_static_structs_VersionSpec_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.struct.Version.internal_static_structs_VersionSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.struct.VersionSpec.class, io.bloombox.schema.struct.VersionSpec.Builder.class);
    }

    // Construct using io.bloombox.schema.struct.VersionSpec.newBuilder()
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
      specCase_ = 0;
      spec_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.struct.Version.internal_static_structs_VersionSpec_descriptor;
    }

    public io.bloombox.schema.struct.VersionSpec getDefaultInstanceForType() {
      return io.bloombox.schema.struct.VersionSpec.getDefaultInstance();
    }

    public io.bloombox.schema.struct.VersionSpec build() {
      io.bloombox.schema.struct.VersionSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.struct.VersionSpec buildPartial() {
      io.bloombox.schema.struct.VersionSpec result = new io.bloombox.schema.struct.VersionSpec(this);
      if (specCase_ == 1) {
        result.spec_ = spec_;
      }
      result.specCase_ = specCase_;
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
      if (other instanceof io.bloombox.schema.struct.VersionSpec) {
        return mergeFrom((io.bloombox.schema.struct.VersionSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.struct.VersionSpec other) {
      if (other == io.bloombox.schema.struct.VersionSpec.getDefaultInstance()) return this;
      switch (other.getSpecCase()) {
        case NAME: {
          specCase_ = 1;
          spec_ = other.spec_;
          onChanged();
          break;
        }
        case SPEC_NOT_SET: {
          break;
        }
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
      io.bloombox.schema.struct.VersionSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.struct.VersionSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int specCase_ = 0;
    private java.lang.Object spec_;
    public SpecCase
        getSpecCase() {
      return SpecCase.forNumber(
          specCase_);
    }

    public Builder clearSpec() {
      specCase_ = 0;
      spec_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Version specified by arbitrary name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = "";
      if (specCase_ == 1) {
        ref = spec_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (specCase_ == 1) {
          spec_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Version specified by arbitrary name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = "";
      if (specCase_ == 1) {
        ref = spec_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (specCase_ == 1) {
          spec_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Version specified by arbitrary name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  specCase_ = 1;
      spec_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Version specified by arbitrary name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
     */
    public Builder clearName() {
      if (specCase_ == 1) {
        specCase_ = 0;
        spec_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Version specified by arbitrary name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.description) = "Version specified by arbitrary name."];</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      specCase_ = 1;
      spec_ = value;
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


    // @@protoc_insertion_point(builder_scope:structs.VersionSpec)
  }

  // @@protoc_insertion_point(class_scope:structs.VersionSpec)
  private static final io.bloombox.schema.struct.VersionSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.struct.VersionSpec();
  }

  public static io.bloombox.schema.struct.VersionSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VersionSpec>
      PARSER = new com.google.protobuf.AbstractParser<VersionSpec>() {
    public VersionSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new VersionSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VersionSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VersionSpec> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.struct.VersionSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

