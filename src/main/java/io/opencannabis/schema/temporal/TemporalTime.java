// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: temporal/Time.proto

package io.opencannabis.schema.temporal;

public final class TemporalTime {
  private TemporalTime() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TimeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.temporal.Time)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ISO8601 time format.
     * </pre>
     *
     * <code>string iso8601 = 1;</code>
     */
    java.lang.String getIso8601();
    /**
     * <pre>
     * ISO8601 time format.
     * </pre>
     *
     * <code>string iso8601 = 1;</code>
     */
    com.google.protobuf.ByteString
        getIso8601Bytes();

    public io.opencannabis.schema.temporal.TemporalTime.Time.SpecCase getSpecCase();
  }
  /**
   * <pre>
   * Specifies a particular time of day.
   * </pre>
   *
   * Protobuf type {@code opencannabis.temporal.Time}
   */
  public  static final class Time extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.temporal.Time)
      TimeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Time.newBuilder() to construct.
    private Time(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Time() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Time(
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
      return io.opencannabis.schema.temporal.TemporalTime.internal_static_opencannabis_temporal_Time_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.temporal.TemporalTime.internal_static_opencannabis_temporal_Time_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.temporal.TemporalTime.Time.class, io.opencannabis.schema.temporal.TemporalTime.Time.Builder.class);
    }

    private int specCase_ = 0;
    private java.lang.Object spec_;
    public enum SpecCase
        implements com.google.protobuf.Internal.EnumLite {
      ISO8601(1),
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
          case 1: return ISO8601;
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

    public static final int ISO8601_FIELD_NUMBER = 1;
    /**
     * <pre>
     * ISO8601 time format.
     * </pre>
     *
     * <code>string iso8601 = 1;</code>
     */
    public java.lang.String getIso8601() {
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
     * ISO8601 time format.
     * </pre>
     *
     * <code>string iso8601 = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIso8601Bytes() {
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
      if (!(obj instanceof io.opencannabis.schema.temporal.TemporalTime.Time)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.temporal.TemporalTime.Time other = (io.opencannabis.schema.temporal.TemporalTime.Time) obj;

      boolean result = true;
      result = result && getSpecCase().equals(
          other.getSpecCase());
      if (!result) return false;
      switch (specCase_) {
        case 1:
          result = result && getIso8601()
              .equals(other.getIso8601());
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
          hash = (37 * hash) + ISO8601_FIELD_NUMBER;
          hash = (53 * hash) + getIso8601().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalTime.Time parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.temporal.TemporalTime.Time prototype) {
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
     * Specifies a particular time of day.
     * </pre>
     *
     * Protobuf type {@code opencannabis.temporal.Time}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.temporal.Time)
        io.opencannabis.schema.temporal.TemporalTime.TimeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.temporal.TemporalTime.internal_static_opencannabis_temporal_Time_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.temporal.TemporalTime.internal_static_opencannabis_temporal_Time_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.temporal.TemporalTime.Time.class, io.opencannabis.schema.temporal.TemporalTime.Time.Builder.class);
      }

      // Construct using io.opencannabis.schema.temporal.TemporalTime.Time.newBuilder()
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
        return io.opencannabis.schema.temporal.TemporalTime.internal_static_opencannabis_temporal_Time_descriptor;
      }

      public io.opencannabis.schema.temporal.TemporalTime.Time getDefaultInstanceForType() {
        return io.opencannabis.schema.temporal.TemporalTime.Time.getDefaultInstance();
      }

      public io.opencannabis.schema.temporal.TemporalTime.Time build() {
        io.opencannabis.schema.temporal.TemporalTime.Time result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.opencannabis.schema.temporal.TemporalTime.Time buildPartial() {
        io.opencannabis.schema.temporal.TemporalTime.Time result = new io.opencannabis.schema.temporal.TemporalTime.Time(this);
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
        if (other instanceof io.opencannabis.schema.temporal.TemporalTime.Time) {
          return mergeFrom((io.opencannabis.schema.temporal.TemporalTime.Time)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.temporal.TemporalTime.Time other) {
        if (other == io.opencannabis.schema.temporal.TemporalTime.Time.getDefaultInstance()) return this;
        switch (other.getSpecCase()) {
          case ISO8601: {
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
        io.opencannabis.schema.temporal.TemporalTime.Time parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.temporal.TemporalTime.Time) e.getUnfinishedMessage();
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
       * ISO8601 time format.
       * </pre>
       *
       * <code>string iso8601 = 1;</code>
       */
      public java.lang.String getIso8601() {
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
       * ISO8601 time format.
       * </pre>
       *
       * <code>string iso8601 = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIso8601Bytes() {
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
       * ISO8601 time format.
       * </pre>
       *
       * <code>string iso8601 = 1;</code>
       */
      public Builder setIso8601(
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
       * ISO8601 time format.
       * </pre>
       *
       * <code>string iso8601 = 1;</code>
       */
      public Builder clearIso8601() {
        if (specCase_ == 1) {
          specCase_ = 0;
          spec_ = null;
          onChanged();
        }
        return this;
      }
      /**
       * <pre>
       * ISO8601 time format.
       * </pre>
       *
       * <code>string iso8601 = 1;</code>
       */
      public Builder setIso8601Bytes(
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


      // @@protoc_insertion_point(builder_scope:opencannabis.temporal.Time)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.temporal.Time)
    private static final io.opencannabis.schema.temporal.TemporalTime.Time DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.temporal.TemporalTime.Time();
    }

    public static io.opencannabis.schema.temporal.TemporalTime.Time getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Time>
        PARSER = new com.google.protobuf.AbstractParser<Time>() {
      public Time parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Time(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Time> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Time> getParserForType() {
      return PARSER;
    }

    public io.opencannabis.schema.temporal.TemporalTime.Time getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_temporal_Time_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_temporal_Time_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023temporal/Time.proto\022\025opencannabis.temp" +
      "oral\"!\n\004Time\022\021\n\007iso8601\030\001 \001(\tH\000B\006\n\004specB" +
      "9\n\037io.opencannabis.schema.temporalB\014Temp" +
      "oralTimeH\001P\000\242\002\003OCSb\006proto3"
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
        }, assigner);
    internal_static_opencannabis_temporal_Time_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_temporal_Time_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_temporal_Time_descriptor,
        new java.lang.String[] { "Iso8601", "Spec", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
