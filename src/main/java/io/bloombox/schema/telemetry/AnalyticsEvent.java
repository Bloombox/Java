/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Momentum Ideas Co., a Delaware Corporation. Use of this
 * code in source form requires permission in writing before use or the
 * assembly, distribution, or publishing of derivative works, for commercial
 * purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: analytics/generic/Event.proto

package io.bloombox.schema.telemetry;

public final class AnalyticsEvent {
  private AnalyticsEvent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bloombox.analytics.generic.Event)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    boolean hasPayload();
    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    com.google.protobuf.Struct getPayload();
    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    com.google.protobuf.StructOrBuilder getPayloadOrBuilder();

    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    boolean hasOccurred();
    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    io.opencannabis.schema.temporal.TemporalInstant.Instant getOccurred();
    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getOccurredOrBuilder();
  }
  /**
   * <pre>
   * Represents a generic event, which can carry an arbitrary payload and is bound to an unenumerated collection.
   * </pre>
   *
   * Protobuf type {@code bloombox.analytics.generic.Event}
   */
  public  static final class Event extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bloombox.analytics.generic.Event)
      EventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Event.newBuilder() to construct.
    private Event(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Event() {
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Event(
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
              com.google.protobuf.Struct.Builder subBuilder = null;
              if (payload_ != null) {
                subBuilder = payload_.toBuilder();
              }
              payload_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(payload_);
                payload_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder subBuilder = null;
              if (occurred_ != null) {
                subBuilder = occurred_.toBuilder();
              }
              occurred_ = input.readMessage(io.opencannabis.schema.temporal.TemporalInstant.Instant.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(occurred_);
                occurred_ = subBuilder.buildPartial();
              }

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
      return io.bloombox.schema.telemetry.AnalyticsEvent.internal_static_bloombox_analytics_generic_Event_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.telemetry.AnalyticsEvent.internal_static_bloombox_analytics_generic_Event_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.telemetry.AnalyticsEvent.Event.class, io.bloombox.schema.telemetry.AnalyticsEvent.Event.Builder.class);
    }

    public static final int PAYLOAD_FIELD_NUMBER = 1;
    private com.google.protobuf.Struct payload_;
    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public boolean hasPayload() {
      return payload_ != null;
    }
    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public com.google.protobuf.Struct getPayload() {
      return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
    }
    /**
     * <pre>
     * Payload data for this event.
     * </pre>
     *
     * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
      return getPayload();
    }

    public static final int OCCURRED_FIELD_NUMBER = 2;
    private io.opencannabis.schema.temporal.TemporalInstant.Instant occurred_;
    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    public boolean hasOccurred() {
      return occurred_ != null;
    }
    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    public io.opencannabis.schema.temporal.TemporalInstant.Instant getOccurred() {
      return occurred_ == null ? io.opencannabis.schema.temporal.TemporalInstant.Instant.getDefaultInstance() : occurred_;
    }
    /**
     * <pre>
     * Occurrence timestamp.
     * </pre>
     *
     * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
     */
    public io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getOccurredOrBuilder() {
      return getOccurred();
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
      if (payload_ != null) {
        output.writeMessage(1, getPayload());
      }
      if (occurred_ != null) {
        output.writeMessage(2, getOccurred());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (payload_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPayload());
      }
      if (occurred_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getOccurred());
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
      if (!(obj instanceof io.bloombox.schema.telemetry.AnalyticsEvent.Event)) {
        return super.equals(obj);
      }
      io.bloombox.schema.telemetry.AnalyticsEvent.Event other = (io.bloombox.schema.telemetry.AnalyticsEvent.Event) obj;

      if (hasPayload() != other.hasPayload()) return false;
      if (hasPayload()) {
        if (!getPayload()
            .equals(other.getPayload())) return false;
      }
      if (hasOccurred() != other.hasOccurred()) return false;
      if (hasOccurred()) {
        if (!getOccurred()
            .equals(other.getOccurred())) return false;
      }
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
      if (hasPayload()) {
        hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
        hash = (53 * hash) + getPayload().hashCode();
      }
      if (hasOccurred()) {
        hash = (37 * hash) + OCCURRED_FIELD_NUMBER;
        hash = (53 * hash) + getOccurred().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event parseFrom(
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
    public static Builder newBuilder(io.bloombox.schema.telemetry.AnalyticsEvent.Event prototype) {
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
     * Represents a generic event, which can carry an arbitrary payload and is bound to an unenumerated collection.
     * </pre>
     *
     * Protobuf type {@code bloombox.analytics.generic.Event}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bloombox.analytics.generic.Event)
        io.bloombox.schema.telemetry.AnalyticsEvent.EventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.bloombox.schema.telemetry.AnalyticsEvent.internal_static_bloombox_analytics_generic_Event_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.bloombox.schema.telemetry.AnalyticsEvent.internal_static_bloombox_analytics_generic_Event_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.bloombox.schema.telemetry.AnalyticsEvent.Event.class, io.bloombox.schema.telemetry.AnalyticsEvent.Event.Builder.class);
      }

      // Construct using io.bloombox.schema.telemetry.AnalyticsEvent.Event.newBuilder()
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
        if (payloadBuilder_ == null) {
          payload_ = null;
        } else {
          payload_ = null;
          payloadBuilder_ = null;
        }
        if (occurredBuilder_ == null) {
          occurred_ = null;
        } else {
          occurred_ = null;
          occurredBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.bloombox.schema.telemetry.AnalyticsEvent.internal_static_bloombox_analytics_generic_Event_descriptor;
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.AnalyticsEvent.Event getDefaultInstanceForType() {
        return io.bloombox.schema.telemetry.AnalyticsEvent.Event.getDefaultInstance();
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.AnalyticsEvent.Event build() {
        io.bloombox.schema.telemetry.AnalyticsEvent.Event result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.AnalyticsEvent.Event buildPartial() {
        io.bloombox.schema.telemetry.AnalyticsEvent.Event result = new io.bloombox.schema.telemetry.AnalyticsEvent.Event(this);
        if (payloadBuilder_ == null) {
          result.payload_ = payload_;
        } else {
          result.payload_ = payloadBuilder_.build();
        }
        if (occurredBuilder_ == null) {
          result.occurred_ = occurred_;
        } else {
          result.occurred_ = occurredBuilder_.build();
        }
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
        if (other instanceof io.bloombox.schema.telemetry.AnalyticsEvent.Event) {
          return mergeFrom((io.bloombox.schema.telemetry.AnalyticsEvent.Event)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.bloombox.schema.telemetry.AnalyticsEvent.Event other) {
        if (other == io.bloombox.schema.telemetry.AnalyticsEvent.Event.getDefaultInstance()) return this;
        if (other.hasPayload()) {
          mergePayload(other.getPayload());
        }
        if (other.hasOccurred()) {
          mergeOccurred(other.getOccurred());
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
        io.bloombox.schema.telemetry.AnalyticsEvent.Event parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.bloombox.schema.telemetry.AnalyticsEvent.Event) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private com.google.protobuf.Struct payload_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> payloadBuilder_;
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public boolean hasPayload() {
        return payloadBuilder_ != null || payload_ != null;
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public com.google.protobuf.Struct getPayload() {
        if (payloadBuilder_ == null) {
          return payload_ == null ? com.google.protobuf.Struct.getDefaultInstance() : payload_;
        } else {
          return payloadBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setPayload(com.google.protobuf.Struct value) {
        if (payloadBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          payload_ = value;
          onChanged();
        } else {
          payloadBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setPayload(
          com.google.protobuf.Struct.Builder builderForValue) {
        if (payloadBuilder_ == null) {
          payload_ = builderForValue.build();
          onChanged();
        } else {
          payloadBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder mergePayload(com.google.protobuf.Struct value) {
        if (payloadBuilder_ == null) {
          if (payload_ != null) {
            payload_ =
              com.google.protobuf.Struct.newBuilder(payload_).mergeFrom(value).buildPartial();
          } else {
            payload_ = value;
          }
          onChanged();
        } else {
          payloadBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder clearPayload() {
        if (payloadBuilder_ == null) {
          payload_ = null;
          onChanged();
        } else {
          payload_ = null;
          payloadBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public com.google.protobuf.Struct.Builder getPayloadBuilder() {
        
        onChanged();
        return getPayloadFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      public com.google.protobuf.StructOrBuilder getPayloadOrBuilder() {
        if (payloadBuilder_ != null) {
          return payloadBuilder_.getMessageOrBuilder();
        } else {
          return payload_ == null ?
              com.google.protobuf.Struct.getDefaultInstance() : payload_;
        }
      }
      /**
       * <pre>
       * Payload data for this event.
       * </pre>
       *
       * <code>.google.protobuf.Struct payload = 1 [(.gen_bq_schema.ignore) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
          getPayloadFieldBuilder() {
        if (payloadBuilder_ == null) {
          payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                  getPayload(),
                  getParentForChildren(),
                  isClean());
          payload_ = null;
        }
        return payloadBuilder_;
      }

      private io.opencannabis.schema.temporal.TemporalInstant.Instant occurred_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.temporal.TemporalInstant.Instant, io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder, io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder> occurredBuilder_;
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public boolean hasOccurred() {
        return occurredBuilder_ != null || occurred_ != null;
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public io.opencannabis.schema.temporal.TemporalInstant.Instant getOccurred() {
        if (occurredBuilder_ == null) {
          return occurred_ == null ? io.opencannabis.schema.temporal.TemporalInstant.Instant.getDefaultInstance() : occurred_;
        } else {
          return occurredBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setOccurred(io.opencannabis.schema.temporal.TemporalInstant.Instant value) {
        if (occurredBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          occurred_ = value;
          onChanged();
        } else {
          occurredBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder setOccurred(
          io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder builderForValue) {
        if (occurredBuilder_ == null) {
          occurred_ = builderForValue.build();
          onChanged();
        } else {
          occurredBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder mergeOccurred(io.opencannabis.schema.temporal.TemporalInstant.Instant value) {
        if (occurredBuilder_ == null) {
          if (occurred_ != null) {
            occurred_ =
              io.opencannabis.schema.temporal.TemporalInstant.Instant.newBuilder(occurred_).mergeFrom(value).buildPartial();
          } else {
            occurred_ = value;
          }
          onChanged();
        } else {
          occurredBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public Builder clearOccurred() {
        if (occurredBuilder_ == null) {
          occurred_ = null;
          onChanged();
        } else {
          occurred_ = null;
          occurredBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder getOccurredBuilder() {
        
        onChanged();
        return getOccurredFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      public io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder getOccurredOrBuilder() {
        if (occurredBuilder_ != null) {
          return occurredBuilder_.getMessageOrBuilder();
        } else {
          return occurred_ == null ?
              io.opencannabis.schema.temporal.TemporalInstant.Instant.getDefaultInstance() : occurred_;
        }
      }
      /**
       * <pre>
       * Occurrence timestamp.
       * </pre>
       *
       * <code>.opencannabis.temporal.Instant occurred = 2 [(.gen_bq_schema.ignore) = true];</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.opencannabis.schema.temporal.TemporalInstant.Instant, io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder, io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder> 
          getOccurredFieldBuilder() {
        if (occurredBuilder_ == null) {
          occurredBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.opencannabis.schema.temporal.TemporalInstant.Instant, io.opencannabis.schema.temporal.TemporalInstant.Instant.Builder, io.opencannabis.schema.temporal.TemporalInstant.InstantOrBuilder>(
                  getOccurred(),
                  getParentForChildren(),
                  isClean());
          occurred_ = null;
        }
        return occurredBuilder_;
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


      // @@protoc_insertion_point(builder_scope:bloombox.analytics.generic.Event)
    }

    // @@protoc_insertion_point(class_scope:bloombox.analytics.generic.Event)
    private static final io.bloombox.schema.telemetry.AnalyticsEvent.Event DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.bloombox.schema.telemetry.AnalyticsEvent.Event();
    }

    public static io.bloombox.schema.telemetry.AnalyticsEvent.Event getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Event>
        PARSER = new com.google.protobuf.AbstractParser<Event>() {
      @java.lang.Override
      public Event parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Event(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Event> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Event> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.bloombox.schema.telemetry.AnalyticsEvent.Event getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_analytics_generic_Event_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_analytics_generic_Event_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035analytics/generic/Event.proto\022\032bloombo" +
      "x.analytics.generic\032\016bq_field.proto\032\026tem" +
      "poral/Instant.proto\032\034google/protobuf/str" +
      "uct.proto\"m\n\005Event\022-\n\007payload\030\001 \001(\0132\027.go" +
      "ogle.protobuf.StructB\003\200@\001\0225\n\010occurred\030\002 " +
      "\001(\0132\036.opencannabis.temporal.InstantB\003\200@\001" +
      "B8\n\034io.bloombox.schema.telemetryB\016Analyt" +
      "icsEventH\001P\000\242\002\003BBSb\006proto3"
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
          io.opencannabis.schema.temporal.TemporalInstant.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        }, assigner);
    internal_static_bloombox_analytics_generic_Event_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_analytics_generic_Event_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_analytics_generic_Event_descriptor,
        new java.lang.String[] { "Payload", "Occurred", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.ignore);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.temporal.TemporalInstant.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
