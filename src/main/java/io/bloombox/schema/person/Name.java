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
// source: person/PersonName.proto

package io.bloombox.schema.person;

/**
 * Protobuf type {@code person.Name}
 */
public  final class Name extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:person.Name)
    NameOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Name.newBuilder() to construct.
  private Name(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Name() {
    fullName_ = "";
    firstName_ = "";
    lastName_ = "";
    middleName_ = "";
    prefix_ = "";
    postfix_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Name(
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

            fullName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            firstName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lastName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            middleName_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            prefix_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            postfix_ = s;
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
    return io.bloombox.schema.person.PersonName.internal_static_person_Name_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.person.PersonName.internal_static_person_Name_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.person.Name.class, io.bloombox.schema.person.Name.Builder.class);
  }

  public static final int FULL_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object fullName_;
  /**
   * <code>string full_name = 1;</code>
   */
  public java.lang.String getFullName() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fullName_ = s;
      return s;
    }
  }
  /**
   * <code>string full_name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getFullNameBytes() {
    java.lang.Object ref = fullName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fullName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FIRST_NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object firstName_;
  /**
   * <code>string first_name = 2;</code>
   */
  public java.lang.String getFirstName() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstName_ = s;
      return s;
    }
  }
  /**
   * <code>string first_name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFirstNameBytes() {
    java.lang.Object ref = firstName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      firstName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LAST_NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object lastName_;
  /**
   * <code>string last_name = 3;</code>
   */
  public java.lang.String getLastName() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastName_ = s;
      return s;
    }
  }
  /**
   * <code>string last_name = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLastNameBytes() {
    java.lang.Object ref = lastName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MIDDLE_NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object middleName_;
  /**
   * <code>string middle_name = 4;</code>
   */
  public java.lang.String getMiddleName() {
    java.lang.Object ref = middleName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      middleName_ = s;
      return s;
    }
  }
  /**
   * <code>string middle_name = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMiddleNameBytes() {
    java.lang.Object ref = middleName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      middleName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREFIX_FIELD_NUMBER = 5;
  private volatile java.lang.Object prefix_;
  /**
   * <code>string prefix = 5;</code>
   */
  public java.lang.String getPrefix() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      prefix_ = s;
      return s;
    }
  }
  /**
   * <code>string prefix = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPrefixBytes() {
    java.lang.Object ref = prefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      prefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POSTFIX_FIELD_NUMBER = 6;
  private volatile java.lang.Object postfix_;
  /**
   * <code>string postfix = 6;</code>
   */
  public java.lang.String getPostfix() {
    java.lang.Object ref = postfix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      postfix_ = s;
      return s;
    }
  }
  /**
   * <code>string postfix = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPostfixBytes() {
    java.lang.Object ref = postfix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      postfix_ = b;
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
    if (!getFullNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, fullName_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lastName_);
    }
    if (!getMiddleNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, middleName_);
    }
    if (!getPrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, prefix_);
    }
    if (!getPostfixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, postfix_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFullNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, fullName_);
    }
    if (!getFirstNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, firstName_);
    }
    if (!getLastNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lastName_);
    }
    if (!getMiddleNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, middleName_);
    }
    if (!getPrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, prefix_);
    }
    if (!getPostfixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, postfix_);
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
    if (!(obj instanceof io.bloombox.schema.person.Name)) {
      return super.equals(obj);
    }
    io.bloombox.schema.person.Name other = (io.bloombox.schema.person.Name) obj;

    boolean result = true;
    result = result && getFullName()
        .equals(other.getFullName());
    result = result && getFirstName()
        .equals(other.getFirstName());
    result = result && getLastName()
        .equals(other.getLastName());
    result = result && getMiddleName()
        .equals(other.getMiddleName());
    result = result && getPrefix()
        .equals(other.getPrefix());
    result = result && getPostfix()
        .equals(other.getPostfix());
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
    hash = (37 * hash) + FULL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFullName().hashCode();
    hash = (37 * hash) + FIRST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getFirstName().hashCode();
    hash = (37 * hash) + LAST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getLastName().hashCode();
    hash = (37 * hash) + MIDDLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getMiddleName().hashCode();
    hash = (37 * hash) + PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPrefix().hashCode();
    hash = (37 * hash) + POSTFIX_FIELD_NUMBER;
    hash = (53 * hash) + getPostfix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.person.Name parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.person.Name parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.person.Name parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.person.Name parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.person.Name parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.person.Name parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.person.Name parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.person.Name prototype) {
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
   * Protobuf type {@code person.Name}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:person.Name)
      io.bloombox.schema.person.NameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.person.PersonName.internal_static_person_Name_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.person.PersonName.internal_static_person_Name_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.person.Name.class, io.bloombox.schema.person.Name.Builder.class);
    }

    // Construct using io.bloombox.schema.person.Name.newBuilder()
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
      fullName_ = "";

      firstName_ = "";

      lastName_ = "";

      middleName_ = "";

      prefix_ = "";

      postfix_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.person.PersonName.internal_static_person_Name_descriptor;
    }

    public io.bloombox.schema.person.Name getDefaultInstanceForType() {
      return io.bloombox.schema.person.Name.getDefaultInstance();
    }

    public io.bloombox.schema.person.Name build() {
      io.bloombox.schema.person.Name result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.person.Name buildPartial() {
      io.bloombox.schema.person.Name result = new io.bloombox.schema.person.Name(this);
      result.fullName_ = fullName_;
      result.firstName_ = firstName_;
      result.lastName_ = lastName_;
      result.middleName_ = middleName_;
      result.prefix_ = prefix_;
      result.postfix_ = postfix_;
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
      if (other instanceof io.bloombox.schema.person.Name) {
        return mergeFrom((io.bloombox.schema.person.Name)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.person.Name other) {
      if (other == io.bloombox.schema.person.Name.getDefaultInstance()) return this;
      if (!other.getFullName().isEmpty()) {
        fullName_ = other.fullName_;
        onChanged();
      }
      if (!other.getFirstName().isEmpty()) {
        firstName_ = other.firstName_;
        onChanged();
      }
      if (!other.getLastName().isEmpty()) {
        lastName_ = other.lastName_;
        onChanged();
      }
      if (!other.getMiddleName().isEmpty()) {
        middleName_ = other.middleName_;
        onChanged();
      }
      if (!other.getPrefix().isEmpty()) {
        prefix_ = other.prefix_;
        onChanged();
      }
      if (!other.getPostfix().isEmpty()) {
        postfix_ = other.postfix_;
        onChanged();
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
      io.bloombox.schema.person.Name parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.person.Name) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object fullName_ = "";
    /**
     * <code>string full_name = 1;</code>
     */
    public java.lang.String getFullName() {
      java.lang.Object ref = fullName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fullName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string full_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFullNameBytes() {
      java.lang.Object ref = fullName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fullName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string full_name = 1;</code>
     */
    public Builder setFullName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fullName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string full_name = 1;</code>
     */
    public Builder clearFullName() {
      
      fullName_ = getDefaultInstance().getFullName();
      onChanged();
      return this;
    }
    /**
     * <code>string full_name = 1;</code>
     */
    public Builder setFullNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fullName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object firstName_ = "";
    /**
     * <code>string first_name = 2;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
      onChanged();
      return this;
    }
    /**
     * <code>string first_name = 2;</code>
     */
    public Builder setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lastName_ = "";
    /**
     * <code>string last_name = 3;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
      onChanged();
      return this;
    }
    /**
     * <code>string last_name = 3;</code>
     */
    public Builder setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object middleName_ = "";
    /**
     * <code>string middle_name = 4;</code>
     */
    public java.lang.String getMiddleName() {
      java.lang.Object ref = middleName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        middleName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string middle_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMiddleNameBytes() {
      java.lang.Object ref = middleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        middleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string middle_name = 4;</code>
     */
    public Builder setMiddleName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      middleName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string middle_name = 4;</code>
     */
    public Builder clearMiddleName() {
      
      middleName_ = getDefaultInstance().getMiddleName();
      onChanged();
      return this;
    }
    /**
     * <code>string middle_name = 4;</code>
     */
    public Builder setMiddleNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      middleName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object prefix_ = "";
    /**
     * <code>string prefix = 5;</code>
     */
    public java.lang.String getPrefix() {
      java.lang.Object ref = prefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        prefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string prefix = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPrefixBytes() {
      java.lang.Object ref = prefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        prefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string prefix = 5;</code>
     */
    public Builder setPrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      prefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string prefix = 5;</code>
     */
    public Builder clearPrefix() {
      
      prefix_ = getDefaultInstance().getPrefix();
      onChanged();
      return this;
    }
    /**
     * <code>string prefix = 5;</code>
     */
    public Builder setPrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      prefix_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object postfix_ = "";
    /**
     * <code>string postfix = 6;</code>
     */
    public java.lang.String getPostfix() {
      java.lang.Object ref = postfix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        postfix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string postfix = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPostfixBytes() {
      java.lang.Object ref = postfix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        postfix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string postfix = 6;</code>
     */
    public Builder setPostfix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      postfix_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string postfix = 6;</code>
     */
    public Builder clearPostfix() {
      
      postfix_ = getDefaultInstance().getPostfix();
      onChanged();
      return this;
    }
    /**
     * <code>string postfix = 6;</code>
     */
    public Builder setPostfixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      postfix_ = value;
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


    // @@protoc_insertion_point(builder_scope:person.Name)
  }

  // @@protoc_insertion_point(class_scope:person.Name)
  private static final io.bloombox.schema.person.Name DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.person.Name();
  }

  public static io.bloombox.schema.person.Name getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Name>
      PARSER = new com.google.protobuf.AbstractParser<Name>() {
    public Name parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Name(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Name> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Name> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.person.Name getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
