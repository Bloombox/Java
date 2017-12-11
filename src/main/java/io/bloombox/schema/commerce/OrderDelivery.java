// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commerce/Delivery.proto

package io.bloombox.schema.commerce;

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
      // @@protoc_insertion_point(interface_extends:commerce.DeliveryDestination)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    boolean hasAddress();
    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    io.bloombox.schema.geo.Address getAddress();
    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    io.bloombox.schema.geo.AddressOrBuilder getAddressOrBuilder();

    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2;</code>
     */
    java.lang.String getInstructions();
    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2;</code>
     */
    com.google.protobuf.ByteString
        getInstructionsBytes();
  }
  /**
   * <pre>
   * Specifies the location to deliver the order.
   * </pre>
   *
   * Protobuf type {@code commerce.DeliveryDestination}
   */
  public  static final class DeliveryDestination extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:commerce.DeliveryDestination)
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
              io.bloombox.schema.geo.Address.Builder subBuilder = null;
              if (address_ != null) {
                subBuilder = address_.toBuilder();
              }
              address_ = input.readMessage(io.bloombox.schema.geo.Address.parser(), extensionRegistry);
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
      return io.bloombox.schema.commerce.OrderDelivery.internal_static_commerce_DeliveryDestination_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.commerce.OrderDelivery.internal_static_commerce_DeliveryDestination_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.class, io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.Builder.class);
    }

    public static final int ADDRESS_FIELD_NUMBER = 1;
    private io.bloombox.schema.geo.Address address_;
    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    public boolean hasAddress() {
      return address_ != null;
    }
    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    public io.bloombox.schema.geo.Address getAddress() {
      return address_ == null ? io.bloombox.schema.geo.Address.getDefaultInstance() : address_;
    }
    /**
     * <pre>
     * Location/address.
     * </pre>
     *
     * <code>.geo.Address address = 1;</code>
     */
    public io.bloombox.schema.geo.AddressOrBuilder getAddressOrBuilder() {
      return getAddress();
    }

    public static final int INSTRUCTIONS_FIELD_NUMBER = 2;
    private volatile java.lang.Object instructions_;
    /**
     * <pre>
     * Special delivery instructions
     * </pre>
     *
     * <code>string instructions = 2;</code>
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
     * <code>string instructions = 2;</code>
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
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

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
      if (!(obj instanceof io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination)) {
        return super.equals(obj);
      }
      io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination other = (io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination) obj;

      boolean result = true;
      result = result && (hasAddress() == other.hasAddress());
      if (hasAddress()) {
        result = result && getAddress()
            .equals(other.getAddress());
      }
      result = result && getInstructions()
          .equals(other.getInstructions());
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

    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parseFrom(
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
    public static Builder newBuilder(io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination prototype) {
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
     * Specifies the location to deliver the order.
     * </pre>
     *
     * Protobuf type {@code commerce.DeliveryDestination}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:commerce.DeliveryDestination)
        io.bloombox.schema.commerce.OrderDelivery.DeliveryDestinationOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.bloombox.schema.commerce.OrderDelivery.internal_static_commerce_DeliveryDestination_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.bloombox.schema.commerce.OrderDelivery.internal_static_commerce_DeliveryDestination_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.class, io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.Builder.class);
      }

      // Construct using io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.newBuilder()
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
        if (addressBuilder_ == null) {
          address_ = null;
        } else {
          address_ = null;
          addressBuilder_ = null;
        }
        instructions_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.bloombox.schema.commerce.OrderDelivery.internal_static_commerce_DeliveryDestination_descriptor;
      }

      public io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstanceForType() {
        return io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.getDefaultInstance();
      }

      public io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination build() {
        io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination buildPartial() {
        io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination result = new io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination(this);
        if (addressBuilder_ == null) {
          result.address_ = address_;
        } else {
          result.address_ = addressBuilder_.build();
        }
        result.instructions_ = instructions_;
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
        if (other instanceof io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination) {
          return mergeFrom((io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination other) {
        if (other == io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination.getDefaultInstance()) return this;
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

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.bloombox.schema.geo.Address address_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.bloombox.schema.geo.Address, io.bloombox.schema.geo.Address.Builder, io.bloombox.schema.geo.AddressOrBuilder> addressBuilder_;
      /**
       * <pre>
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public boolean hasAddress() {
        return addressBuilder_ != null || address_ != null;
      }
      /**
       * <pre>
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public io.bloombox.schema.geo.Address getAddress() {
        if (addressBuilder_ == null) {
          return address_ == null ? io.bloombox.schema.geo.Address.getDefaultInstance() : address_;
        } else {
          return addressBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public Builder setAddress(io.bloombox.schema.geo.Address value) {
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
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public Builder setAddress(
          io.bloombox.schema.geo.Address.Builder builderForValue) {
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
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public Builder mergeAddress(io.bloombox.schema.geo.Address value) {
        if (addressBuilder_ == null) {
          if (address_ != null) {
            address_ =
              io.bloombox.schema.geo.Address.newBuilder(address_).mergeFrom(value).buildPartial();
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
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
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
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public io.bloombox.schema.geo.Address.Builder getAddressBuilder() {
        
        onChanged();
        return getAddressFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      public io.bloombox.schema.geo.AddressOrBuilder getAddressOrBuilder() {
        if (addressBuilder_ != null) {
          return addressBuilder_.getMessageOrBuilder();
        } else {
          return address_ == null ?
              io.bloombox.schema.geo.Address.getDefaultInstance() : address_;
        }
      }
      /**
       * <pre>
       * Location/address.
       * </pre>
       *
       * <code>.geo.Address address = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.bloombox.schema.geo.Address, io.bloombox.schema.geo.Address.Builder, io.bloombox.schema.geo.AddressOrBuilder> 
          getAddressFieldBuilder() {
        if (addressBuilder_ == null) {
          addressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.bloombox.schema.geo.Address, io.bloombox.schema.geo.Address.Builder, io.bloombox.schema.geo.AddressOrBuilder>(
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
       * <code>string instructions = 2;</code>
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
       * <code>string instructions = 2;</code>
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
       * <code>string instructions = 2;</code>
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
       * <code>string instructions = 2;</code>
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
       * <code>string instructions = 2;</code>
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
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:commerce.DeliveryDestination)
    }

    // @@protoc_insertion_point(class_scope:commerce.DeliveryDestination)
    private static final io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination();
    }

    public static io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DeliveryDestination>
        PARSER = new com.google.protobuf.AbstractParser<DeliveryDestination>() {
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

    public io.bloombox.schema.commerce.OrderDelivery.DeliveryDestination getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_commerce_DeliveryDestination_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_commerce_DeliveryDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027commerce/Delivery.proto\022\010commerce\032\021geo" +
      "/Address.proto\"J\n\023DeliveryDestination\022\035\n" +
      "\007address\030\001 \001(\0132\014.geo.Address\022\024\n\014instruct" +
      "ions\030\002 \001(\tB3\n\033io.bloombox.schema.commerc" +
      "eB\rOrderDeliveryH\001P\000\370\001\001b\006proto3"
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
          io.bloombox.schema.geo.AddressOuterClass.getDescriptor(),
        }, assigner);
    internal_static_commerce_DeliveryDestination_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_commerce_DeliveryDestination_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_commerce_DeliveryDestination_descriptor,
        new java.lang.String[] { "Address", "Instructions", });
    io.bloombox.schema.geo.AddressOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
