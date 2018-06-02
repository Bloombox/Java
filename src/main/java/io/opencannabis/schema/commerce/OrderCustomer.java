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
// source: commerce/Customer.proto

package io.opencannabis.schema.commerce;

public final class OrderCustomer {
  private OrderCustomer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CustomerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.commerce.Customer)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    boolean hasPerson();
    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    io.opencannabis.schema.person.Person getPerson();
    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    io.opencannabis.schema.person.PersonOrBuilder getPersonOrBuilder();

    /**
     * <pre>
     * Partner-scoped foreign system ID.
     * </pre>
     *
     * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
     */
    java.lang.String getForeignId();
    /**
     * <pre>
     * Partner-scoped foreign system ID.
     * </pre>
     *
     * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
     */
    com.google.protobuf.ByteString
        getForeignIdBytes();

    /**
     * <pre>
     * Resolved subject user key.
     * </pre>
     *
     * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
     */
    java.lang.String getUserKey();
    /**
     * <pre>
     * Resolved subject user key.
     * </pre>
     *
     * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
     */
    com.google.protobuf.ByteString
        getUserKeyBytes();
  }
  /**
   * <pre>
   * Customer identity.
   * </pre>
   *
   * Protobuf type {@code opencannabis.commerce.Customer}
   */
  public  static final class Customer extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.commerce.Customer)
      CustomerOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Customer.newBuilder() to construct.
    private Customer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Customer() {
      foreignId_ = "";
      userKey_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Customer(
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
              io.opencannabis.schema.person.Person.Builder subBuilder = null;
              if (person_ != null) {
                subBuilder = person_.toBuilder();
              }
              person_ = input.readMessage(io.opencannabis.schema.person.Person.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(person_);
                person_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              foreignId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              userKey_ = s;
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
      return io.opencannabis.schema.commerce.OrderCustomer.internal_static_opencannabis_commerce_Customer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.commerce.OrderCustomer.internal_static_opencannabis_commerce_Customer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.commerce.OrderCustomer.Customer.class, io.opencannabis.schema.commerce.OrderCustomer.Customer.Builder.class);
    }

    public static final int PERSON_FIELD_NUMBER = 1;
    private io.opencannabis.schema.person.Person person_;
    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    public boolean hasPerson() {
      return person_ != null;
    }
    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    public io.opencannabis.schema.person.Person getPerson() {
      return person_ == null ? io.opencannabis.schema.person.Person.getDefaultInstance() : person_;
    }
    /**
     * <pre>
     * Person attached to this customer.
     * </pre>
     *
     * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
     */
    public io.opencannabis.schema.person.PersonOrBuilder getPersonOrBuilder() {
      return getPerson();
    }

    public static final int FOREIGN_ID_FIELD_NUMBER = 2;
    private volatile java.lang.Object foreignId_;
    /**
     * <pre>
     * Partner-scoped foreign system ID.
     * </pre>
     *
     * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
     */
    public java.lang.String getForeignId() {
      java.lang.Object ref = foreignId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        foreignId_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Partner-scoped foreign system ID.
     * </pre>
     *
     * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
     */
    public com.google.protobuf.ByteString
        getForeignIdBytes() {
      java.lang.Object ref = foreignId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        foreignId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int USER_KEY_FIELD_NUMBER = 3;
    private volatile java.lang.Object userKey_;
    /**
     * <pre>
     * Resolved subject user key.
     * </pre>
     *
     * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
     */
    public java.lang.String getUserKey() {
      java.lang.Object ref = userKey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userKey_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Resolved subject user key.
     * </pre>
     *
     * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
     */
    public com.google.protobuf.ByteString
        getUserKeyBytes() {
      java.lang.Object ref = userKey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userKey_ = b;
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
      if (person_ != null) {
        output.writeMessage(1, getPerson());
      }
      if (!getForeignIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, foreignId_);
      }
      if (!getUserKeyBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userKey_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (person_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPerson());
      }
      if (!getForeignIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, foreignId_);
      }
      if (!getUserKeyBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userKey_);
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
      if (!(obj instanceof io.opencannabis.schema.commerce.OrderCustomer.Customer)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.commerce.OrderCustomer.Customer other = (io.opencannabis.schema.commerce.OrderCustomer.Customer) obj;

      boolean result = true;
      result = result && (hasPerson() == other.hasPerson());
      if (hasPerson()) {
        result = result && getPerson()
            .equals(other.getPerson());
      }
      result = result && getForeignId()
          .equals(other.getForeignId());
      result = result && getUserKey()
          .equals(other.getUserKey());
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
      if (hasPerson()) {
        hash = (37 * hash) + PERSON_FIELD_NUMBER;
        hash = (53 * hash) + getPerson().hashCode();
      }
      hash = (37 * hash) + FOREIGN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getForeignId().hashCode();
      hash = (37 * hash) + USER_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getUserKey().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderCustomer.Customer parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.commerce.OrderCustomer.Customer prototype) {
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
     * Customer identity.
     * </pre>
     *
     * Protobuf type {@code opencannabis.commerce.Customer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.commerce.Customer)
        io.opencannabis.schema.commerce.OrderCustomer.CustomerOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.commerce.OrderCustomer.internal_static_opencannabis_commerce_Customer_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.commerce.OrderCustomer.internal_static_opencannabis_commerce_Customer_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.commerce.OrderCustomer.Customer.class, io.opencannabis.schema.commerce.OrderCustomer.Customer.Builder.class);
      }

      // Construct using io.opencannabis.schema.commerce.OrderCustomer.Customer.newBuilder()
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
        if (personBuilder_ == null) {
          person_ = null;
        } else {
          person_ = null;
          personBuilder_ = null;
        }
        foreignId_ = "";

        userKey_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.opencannabis.schema.commerce.OrderCustomer.internal_static_opencannabis_commerce_Customer_descriptor;
      }

      public io.opencannabis.schema.commerce.OrderCustomer.Customer getDefaultInstanceForType() {
        return io.opencannabis.schema.commerce.OrderCustomer.Customer.getDefaultInstance();
      }

      public io.opencannabis.schema.commerce.OrderCustomer.Customer build() {
        io.opencannabis.schema.commerce.OrderCustomer.Customer result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.opencannabis.schema.commerce.OrderCustomer.Customer buildPartial() {
        io.opencannabis.schema.commerce.OrderCustomer.Customer result = new io.opencannabis.schema.commerce.OrderCustomer.Customer(this);
        if (personBuilder_ == null) {
          result.person_ = person_;
        } else {
          result.person_ = personBuilder_.build();
        }
        result.foreignId_ = foreignId_;
        result.userKey_ = userKey_;
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
        if (other instanceof io.opencannabis.schema.commerce.OrderCustomer.Customer) {
          return mergeFrom((io.opencannabis.schema.commerce.OrderCustomer.Customer)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.commerce.OrderCustomer.Customer other) {
        if (other == io.opencannabis.schema.commerce.OrderCustomer.Customer.getDefaultInstance()) return this;
        if (other.hasPerson()) {
          mergePerson(other.getPerson());
        }
        if (!other.getForeignId().isEmpty()) {
          foreignId_ = other.foreignId_;
          onChanged();
        }
        if (!other.getUserKey().isEmpty()) {
          userKey_ = other.userKey_;
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
        io.opencannabis.schema.commerce.OrderCustomer.Customer parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.commerce.OrderCustomer.Customer) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.opencannabis.schema.person.Person person_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.person.Person, io.opencannabis.schema.person.Person.Builder, io.opencannabis.schema.person.PersonOrBuilder> personBuilder_;
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public boolean hasPerson() {
        return personBuilder_ != null || person_ != null;
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public io.opencannabis.schema.person.Person getPerson() {
        if (personBuilder_ == null) {
          return person_ == null ? io.opencannabis.schema.person.Person.getDefaultInstance() : person_;
        } else {
          return personBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public Builder setPerson(io.opencannabis.schema.person.Person value) {
        if (personBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          person_ = value;
          onChanged();
        } else {
          personBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public Builder setPerson(
          io.opencannabis.schema.person.Person.Builder builderForValue) {
        if (personBuilder_ == null) {
          person_ = builderForValue.build();
          onChanged();
        } else {
          personBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public Builder mergePerson(io.opencannabis.schema.person.Person value) {
        if (personBuilder_ == null) {
          if (person_ != null) {
            person_ =
              io.opencannabis.schema.person.Person.newBuilder(person_).mergeFrom(value).buildPartial();
          } else {
            person_ = value;
          }
          onChanged();
        } else {
          personBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public Builder clearPerson() {
        if (personBuilder_ == null) {
          person_ = null;
          onChanged();
        } else {
          person_ = null;
          personBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public io.opencannabis.schema.person.Person.Builder getPersonBuilder() {
        
        onChanged();
        return getPersonFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      public io.opencannabis.schema.person.PersonOrBuilder getPersonOrBuilder() {
        if (personBuilder_ != null) {
          return personBuilder_.getMessageOrBuilder();
        } else {
          return person_ == null ?
              io.opencannabis.schema.person.Person.getDefaultInstance() : person_;
        }
      }
      /**
       * <pre>
       * Person attached to this customer.
       * </pre>
       *
       * <code>.opencannabis.person.Person person = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Person attached to this customer."];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.person.Person, io.opencannabis.schema.person.Person.Builder, io.opencannabis.schema.person.PersonOrBuilder> 
          getPersonFieldBuilder() {
        if (personBuilder_ == null) {
          personBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.opencannabis.schema.person.Person, io.opencannabis.schema.person.Person.Builder, io.opencannabis.schema.person.PersonOrBuilder>(
                  getPerson(),
                  getParentForChildren(),
                  isClean());
          person_ = null;
        }
        return personBuilder_;
      }

      private java.lang.Object foreignId_ = "";
      /**
       * <pre>
       * Partner-scoped foreign system ID.
       * </pre>
       *
       * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
       */
      public java.lang.String getForeignId() {
        java.lang.Object ref = foreignId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          foreignId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Partner-scoped foreign system ID.
       * </pre>
       *
       * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
       */
      public com.google.protobuf.ByteString
          getForeignIdBytes() {
        java.lang.Object ref = foreignId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          foreignId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Partner-scoped foreign system ID.
       * </pre>
       *
       * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
       */
      public Builder setForeignId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        foreignId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Partner-scoped foreign system ID.
       * </pre>
       *
       * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
       */
      public Builder clearForeignId() {
        
        foreignId_ = getDefaultInstance().getForeignId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Partner-scoped foreign system ID.
       * </pre>
       *
       * <code>string foreign_id = 2 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Partner-scoped foreign system ID."];</code>
       */
      public Builder setForeignIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        foreignId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object userKey_ = "";
      /**
       * <pre>
       * Resolved subject user key.
       * </pre>
       *
       * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
       */
      public java.lang.String getUserKey() {
        java.lang.Object ref = userKey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          userKey_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Resolved subject user key.
       * </pre>
       *
       * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
       */
      public com.google.protobuf.ByteString
          getUserKeyBytes() {
        java.lang.Object ref = userKey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          userKey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Resolved subject user key.
       * </pre>
       *
       * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
       */
      public Builder setUserKey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        userKey_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Resolved subject user key.
       * </pre>
       *
       * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
       */
      public Builder clearUserKey() {
        
        userKey_ = getDefaultInstance().getUserKey();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Resolved subject user key.
       * </pre>
       *
       * <code>string user_key = 3 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Resolved subject user key."];</code>
       */
      public Builder setUserKeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        userKey_ = value;
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


      // @@protoc_insertion_point(builder_scope:opencannabis.commerce.Customer)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.commerce.Customer)
    private static final io.opencannabis.schema.commerce.OrderCustomer.Customer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.commerce.OrderCustomer.Customer();
    }

    public static io.opencannabis.schema.commerce.OrderCustomer.Customer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Customer>
        PARSER = new com.google.protobuf.AbstractParser<Customer>() {
      public Customer parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Customer(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Customer> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Customer> getParserForType() {
      return PARSER;
    }

    public io.opencannabis.schema.commerce.OrderCustomer.Customer getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_commerce_Customer_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_commerce_Customer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027commerce/Customer.proto\022\025opencannabis." +
      "commerce\032\016bq_field.proto\032\023person/Person." +
      "proto\"\321\001\n\010Customer\022T\n\006person\030\001 \001(\0132\033.ope" +
      "ncannabis.person.PersonB\'\360?\001\212@!Person at" +
      "tached to this customer.\022;\n\nforeign_id\030\002" +
      " \001(\tB\'\360?\001\212@!Partner-scoped foreign syste" +
      "m ID.\0222\n\010user_key\030\003 \001(\tB \360?\001\212@\032Resolved " +
      "subject user key.B:\n\037io.opencannabis.sch" +
      "ema.commerceB\rOrderCustomerH\001P\000\242\002\003OCSb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          gen_bq_schema.BqField.getDescriptor(),
          io.opencannabis.schema.person.PersonOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_commerce_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_commerce_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_commerce_Customer_descriptor,
        new java.lang.String[] { "Person", "ForeignId", "UserKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.require);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.person.PersonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
