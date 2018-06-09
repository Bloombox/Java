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
// source: temporal/Instant.proto

package io.opencannabis.schema.temporal;

public final class TemporalInstant {
  private TemporalInstant() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InstantOrBuilder extends
      // @@protoc_insertion_point(interface_extends:opencannabis.temporal.Instant)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * ISO8601-formatted timestamp.
     * </pre>
     *
     * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
     */
    java.lang.String getIso8601();
    /**
     * <pre>
     * ISO8601-formatted timestamp.
     * </pre>
     *
     * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
     */
    com.google.protobuf.ByteString
        getIso8601Bytes();

    /**
     * <pre>
     * Unix epoch timestamp, at millisecond resolution.
     * </pre>
     *
     * <code>uint64 timestamp = 2 [(.gen_bq_schema.description) = "Unix epoch timestamp, at millisecond resolution."];</code>
     */
    long getTimestamp();

    public io.opencannabis.schema.temporal.TemporalInstant.Instant.SpecCase getSpecCase();
  }
  /**
   * <pre>
   * Specifies a particular moment in time.
   * </pre>
   *
   * Protobuf type {@code opencannabis.temporal.Instant}
   */
  public  static final class Instant extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:opencannabis.temporal.Instant)
      InstantOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Instant.newBuilder() to construct.
    private Instant(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Instant() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Instant(
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
            case 16: {
              specCase_ = 2;
              spec_ = input.readUInt64();
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
      return io.opencannabis.schema.temporal.TemporalInstant.internal_static_opencannabis_temporal_Instant_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.temporal.TemporalInstant.internal_static_opencannabis_temporal_Instant_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.temporal.TemporalInstant.Instant.class, io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder.class);
    }

    private int specCase_ = 0;
    private java.lang.Object spec_;
    public enum SpecCase
        implements com.google.protobuf.Internal.EnumLite {
      ISO8601(1),
      TIMESTAMP(2),
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
          case 2: return TIMESTAMP;
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
     * ISO8601-formatted timestamp.
     * </pre>
     *
     * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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
     * ISO8601-formatted timestamp.
     * </pre>
     *
     * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    /**
     * <pre>
     * Unix epoch timestamp, at millisecond resolution.
     * </pre>
     *
     * <code>uint64 timestamp = 2 [(.gen_bq_schema.description) = "Unix epoch timestamp, at millisecond resolution."];</code>
     */
    public long getTimestamp() {
      if (specCase_ == 2) {
        return (java.lang.Long) spec_;
      }
      return 0L;
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
      if (specCase_ == 2) {
        output.writeUInt64(
            2, (long)((java.lang.Long) spec_));
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
      if (specCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(
              2, (long)((java.lang.Long) spec_));
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
      if (!(obj instanceof io.opencannabis.schema.temporal.TemporalInstant.Instant)) {
        return super.equals(obj);
      }
      io.opencannabis.schema.temporal.TemporalInstant.Instant other = (io.opencannabis.schema.temporal.TemporalInstant.Instant) obj;

      boolean result = true;
      result = result && getSpecCase().equals(
          other.getSpecCase());
      if (!result) return false;
      switch (specCase_) {
        case 1:
          result = result && getIso8601()
              .equals(other.getIso8601());
          break;
        case 2:
          result = result && (getTimestamp()
              == other.getTimestamp());
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
        case 2:
          hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
          hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
              getTimestamp());
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.opencannabis.schema.temporal.TemporalInstant.Instant parseFrom(
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
    public static Builder newBuilder(io.opencannabis.schema.temporal.TemporalInstant.Instant prototype) {
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
     * Specifies a particular moment in time.
     * </pre>
     *
     * Protobuf type {@code opencannabis.temporal.Instant}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:opencannabis.temporal.Instant)
        io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.opencannabis.schema.temporal.TemporalInstant.internal_static_opencannabis_temporal_Instant_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.opencannabis.schema.temporal.TemporalInstant.internal_static_opencannabis_temporal_Instant_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.opencannabis.schema.temporal.TemporalInstant.Instant.class, io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder.class);
      }

      // Construct using io.opencannabis.schema.temporal.TemporalInstant.Instant.newBuilder()
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
        return io.opencannabis.schema.temporal.TemporalInstant.internal_static_opencannabis_temporal_Instant_descriptor;
      }

      public io.opencannabis.schema.temporal.TemporalInstant.Instant getDefaultInstanceForType() {
        return io.opencannabis.schema.temporal.TemporalInstant.Instant.getDefaultInstance();
      }

      public io.opencannabis.schema.temporal.TemporalInstant.Instant build() {
        io.opencannabis.schema.temporal.TemporalInstant.Instant result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public io.opencannabis.schema.temporal.TemporalInstant.Instant buildPartial() {
        io.opencannabis.schema.temporal.TemporalInstant.Instant result = new io.opencannabis.schema.temporal.TemporalInstant.Instant(this);
        if (specCase_ == 1) {
          result.spec_ = spec_;
        }
        if (specCase_ == 2) {
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
        if (other instanceof io.opencannabis.schema.temporal.TemporalInstant.Instant) {
          return mergeFrom((io.opencannabis.schema.temporal.TemporalInstant.Instant)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.opencannabis.schema.temporal.TemporalInstant.Instant other) {
        if (other == io.opencannabis.schema.temporal.TemporalInstant.Instant.getDefaultInstance()) return this;
        switch (other.getSpecCase()) {
          case ISO8601: {
            specCase_ = 1;
            spec_ = other.spec_;
            onChanged();
            break;
          }
          case TIMESTAMP: {
            setTimestamp(other.getTimestamp());
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
        io.opencannabis.schema.temporal.TemporalInstant.Instant parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.opencannabis.schema.temporal.TemporalInstant.Instant) e.getUnfinishedMessage();
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
       * ISO8601-formatted timestamp.
       * </pre>
       *
       * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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
       * ISO8601-formatted timestamp.
       * </pre>
       *
       * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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
       * ISO8601-formatted timestamp.
       * </pre>
       *
       * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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
       * ISO8601-formatted timestamp.
       * </pre>
       *
       * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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
       * ISO8601-formatted timestamp.
       * </pre>
       *
       * <code>string iso8601 = 1 [(.gen_bq_schema.description) = "ISO8601-formatted timestamp."];</code>
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

      /**
       * <pre>
       * Unix epoch timestamp, at millisecond resolution.
       * </pre>
       *
       * <code>uint64 timestamp = 2 [(.gen_bq_schema.description) = "Unix epoch timestamp, at millisecond resolution."];</code>
       */
      public long getTimestamp() {
        if (specCase_ == 2) {
          return (java.lang.Long) spec_;
        }
        return 0L;
      }
      /**
       * <pre>
       * Unix epoch timestamp, at millisecond resolution.
       * </pre>
       *
       * <code>uint64 timestamp = 2 [(.gen_bq_schema.description) = "Unix epoch timestamp, at millisecond resolution."];</code>
       */
      public Builder setTimestamp(long value) {
        specCase_ = 2;
        spec_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Unix epoch timestamp, at millisecond resolution.
       * </pre>
       *
       * <code>uint64 timestamp = 2 [(.gen_bq_schema.description) = "Unix epoch timestamp, at millisecond resolution."];</code>
       */
      public Builder clearTimestamp() {
        if (specCase_ == 2) {
          specCase_ = 0;
          spec_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:opencannabis.temporal.Instant)
    }

    // @@protoc_insertion_point(class_scope:opencannabis.temporal.Instant)
    private static final io.opencannabis.schema.temporal.TemporalInstant.Instant DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.opencannabis.schema.temporal.TemporalInstant.Instant();
    }

    public static io.opencannabis.schema.temporal.TemporalInstant.Instant getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Instant>
        PARSER = new com.google.protobuf.AbstractParser<Instant>() {
      public Instant parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Instant(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Instant> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Instant> getParserForType() {
      return PARSER;
    }

    public io.opencannabis.schema.temporal.TemporalInstant.Instant getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_temporal_Instant_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_temporal_Instant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026temporal/Instant.proto\022\025opencannabis.t" +
      "emporal\032\016bq_field.proto\"\217\001\n\007Instant\0222\n\007i" +
      "so8601\030\001 \001(\tB\037\212@\034ISO8601-formatted times" +
      "tamp.H\000\022H\n\ttimestamp\030\002 \001(\004B3\212@0Unix epoc" +
      "h timestamp, at millisecond resolution.H" +
      "\000B\006\n\004specB<\n\037io.opencannabis.schema.temp" +
      "oralB\017TemporalInstantH\001P\000\242\002\003OCSb\006proto3"
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
        }, assigner);
    internal_static_opencannabis_temporal_Instant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_temporal_Instant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_temporal_Instant_descriptor,
        new java.lang.String[] { "Iso8601", "Timestamp", "Spec", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
