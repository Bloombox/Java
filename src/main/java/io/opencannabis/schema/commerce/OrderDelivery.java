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
// source: commerce/Delivery.proto

package io.opencannabis.schema.commerce;

public final class OrderDelivery {
  private OrderDelivery() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DeliveryDestinationOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.commerce.DeliveryDestination)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    boolean hasAddress();
    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    io.opencannabis.schema.geo.Address getAddress();
    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    io.opencannabis.schema.geo.AddressOrBuilder getAddressOrBuilder();

    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    java.lang.String getInstructions();
    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    com.google.protobuf.ByteString
        getInstructionsBytes();
  }
  /**
   * <pre>
   * Specifies the location to deliver the order.
   * </pre>
   *
   * Protobuf type {@code opencannabis.commerce.DeliveryDestination}
   */
  public  static final class DeliveryDestination extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.commerce.DeliveryDestination)
      DeliveryDestinationOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DeliveryDestination.newBuilder() to construct.
    private DeliveryDestination(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DeliveryDestination() {
      instructions_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DeliveryDestination(
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
              io.opencannabis.schema.geo.Address.Builder subBuilder = null;
              if (address_ != null) {
                subBuilder = address_.toBuilder();
              }
              address_ = input.readMessage(io.opencannabis.schema.geo.Address.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(address_);
                address_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              instructions_ = s;
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
      return io.opencannabis.schema.commerce.OrderDelivery.internal_static_opencannabis_commerce_DeliveryDestination_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.commerce.OrderDelivery.internal_static_opencannabis_commerce_DeliveryDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.class, io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private io.opencannabis.schema.geo.Address address_;
    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    public boolean hasAddress() {
      return address_ != null;
    }
    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    public io.opencannabis.schema.geo.Address getAddress() {
      return address_ == null ? io.opencannabis.schema.geo.Address.getDefaultInstance() : address_;
    }
    /**
     * <pre>
     * Location/address to send a delivery order.
     * </pre>
     *
     * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
     */
    public io.opencannabis.schema.geo.AddressOrBuilder getAddressOrBuilder() {
      return getAddress();
    }

    public static final int INSTRUCTIONS_FIELD_NUMBER = 2;
    private volatile java.lang.Object instructions_;
    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    public java.lang.String getInstructions() {
      java.lang.Object ref = instructions_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instructions_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    public com.google.protobuf.ByteString
        getInstructionsBytes() {
      java.lang.Object ref = instructions_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instructions_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (address_ != null) {
        output.writeMessage(1, getAddress());
      }
      if (!getInstructionsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, instructions_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (address_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getAddress());
      }
      if (!getInstructionsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, instructions_);
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
      if (!(obj instanceof io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination other = (io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination) obj;

      if (hasAddress() != other.hasAddress()) return false;
      if (hasAddress()) {
        if (!getAddress()
            .equals(other.getAddress())) return false;
      }
      if (!getInstructions()
          .equals(other.getInstructions())) return false;
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
      if (hasAddress()) {
        hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
        hash = (53 * hash) + getAddress().hashCode();
      }
      hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getInstructions().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination prototype) {
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
     * Specifies the location to deliver the order.
     * </pre>
     *
     * Protobuf type {@code opencannabis.commerce.DeliveryDestination}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.commerce.DeliveryDestination)
        io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestinationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.commerce.OrderDelivery.internal_static_opencannabis_commerce_DeliveryDestination_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.commerce.OrderDelivery.internal_static_opencannabis_commerce_DeliveryDestination_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.class, io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.Builder.class);
      }

      // Construct using io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.newBuilder()
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
        if (addressBuilder_ == null) {
          address_ = null;
        } else {
          address_ = null;
          addressBuilder_ = null;
        }
        instructions_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.opencannabis.schema.commerce.OrderDelivery.internal_static_opencannabis_commerce_DeliveryDestination_descriptor;
      }

      @java.lang.Override
      public io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstanceForType() {
        return io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.getDefaultInstance();
      }

      @java.lang.Override
      public io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination build() {
        io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination buildPartial() {
        io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination result = new io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination(this);
        if (addressBuilder_ == null) {
          result.address_ = address_;
        } else {
          result.address_ = addressBuilder_.build();
        }
        result.instructions_ = instructions_;
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
        if (other instanceof io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination) {
          return mergeFrom((io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination other) {
        if (other == io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination.getDefaultInstance()) return this;
        if (other.hasAddress()) {
          mergeAddress(other.getAddress());
        }
        if (!other.getInstructions().isEmpty()) {
          instructions_ = other.instructions_;
          onChanged();
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
        io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.opencannabis.schema.geo.Address address_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.geo.Address, io.opencannabis.schema.geo.Address.Builder, io.opencannabis.schema.geo.AddressOrBuilder> addressBuilder_;
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public boolean hasAddress() {
        return addressBuilder_ != null || address_ != null;
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public io.opencannabis.schema.geo.Address getAddress() {
        if (addressBuilder_ == null) {
          return address_ == null ? io.opencannabis.schema.geo.Address.getDefaultInstance() : address_;
        } else {
          return addressBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public Builder setAddress(io.opencannabis.schema.geo.Address value) {
        if (addressBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          address_ = value;
          onChanged();
        } else {
          addressBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public Builder setAddress(
          io.opencannabis.schema.geo.Address.Builder builderForValue) {
        if (addressBuilder_ == null) {
          address_ = builderForValue.build();
          onChanged();
        } else {
          addressBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public Builder mergeAddress(io.opencannabis.schema.geo.Address value) {
        if (addressBuilder_ == null) {
          if (address_ != null) {
            address_ =
              io.opencannabis.schema.geo.Address.newBuilder(address_).mergeFrom(value).buildPartial();
          } else {
            address_ = value;
          }
          onChanged();
        } else {
          addressBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public Builder clearAddress() {
        if (addressBuilder_ == null) {
          address_ = null;
          onChanged();
        } else {
          address_ = null;
          addressBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public io.opencannabis.schema.geo.Address.Builder getAddressBuilder() {
        
        onChanged();
        return getAddressFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      public io.opencannabis.schema.geo.AddressOrBuilder getAddressOrBuilder() {
        if (addressBuilder_ != null) {
          return addressBuilder_.getMessageOrBuilder();
        } else {
          return address_ == null ?
              io.opencannabis.schema.geo.Address.getDefaultInstance() : address_;
        }
      }
      /**
       * <pre>
       * Location/address to send a delivery order.
       * </pre>
       *
       * <code>.opencannabis.geo.Address address = 1 [(.gen_bq_schema.description) = "Location/address to send a delivery order."];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.geo.Address, io.opencannabis.schema.geo.Address.Builder, io.opencannabis.schema.geo.AddressOrBuilder> 
          getAddressFieldBuilder() {
        if (addressBuilder_ == null) {
          addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.opencannabis.schema.geo.Address, io.opencannabis.schema.geo.Address.Builder, io.opencannabis.schema.geo.AddressOrBuilder>(
                  getAddress(),
                  getParentForChildren(),
                  isClean());
          address_ = null;
        }
        return addressBuilder_;
      }

      private java.lang.Object instructions_ = "";
      /**
       * <pre>
       * Special delivery instructions
       * </pre>
       *
       * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public java.lang.String getInstructions() {
        java.lang.Object ref = instructions_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instructions_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Special delivery instructions
       * </pre>
       *
       * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public com.google.protobuf.ByteString
          getInstructionsBytes() {
        java.lang.Object ref = instructions_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          instructions_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Special delivery instructions
       * </pre>
       *
       * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setInstructions(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        instructions_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Special delivery instructions
       * </pre>
       *
       * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder clearInstructions() {
        
        instructions_ = getDefaultInstance().getInstructions();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Special delivery instructions
       * </pre>
       *
       * <code>string instructions = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setInstructionsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        instructions_ = value;
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


      // @@protoc_insertion_point(builder_scope:opencannabis.commerce.DeliveryDestination)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.commerce.DeliveryDestination)
    private static final io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination();
    }

    public static io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeliveryDestination>
        PARSER = new com.google.protobuf.AbstractParser<DeliveryDestination>() {
      @java.lang.Override
      public DeliveryDestination parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DeliveryDestination(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DeliveryDestination> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DeliveryDestination> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.opencannabis.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_commerce_DeliveryDestination_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_commerce_DeliveryDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027commerce/Delivery.proto\022\025opencannabis." +
      "commerce\032\016bq_field.proto\032\021geo/Address.pr" +
      "oto\"\213\001\n\023DeliveryDestination\022Y\n\007address\030\001" +
      " \001(\0132\031.opencannabis.geo.AddressB-\212@*Loca" +
      "tion/address to send a delivery order.\022\031" +
      "\n\014instructions\030\002 \001(\tB\003\200@\001B:\n\037io.opencann" +
      "abis.schema.commerceB\rOrderDeliveryH\001P\000\242" +
      "\002\003OCSb\006proto3"
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
          io.opencannabis.schema.geo.AddressOuterClass.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_commerce_DeliveryDestination_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_commerce_DeliveryDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_commerce_DeliveryDestination_descriptor,
        new java.lang.String[] { "Address", "Instructions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.ignore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.geo.AddressOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
