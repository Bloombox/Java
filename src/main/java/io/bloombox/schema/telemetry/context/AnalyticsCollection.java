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
// source: analytics/context/Collection.proto

package io.bloombox.schema.telemetry.context;

public final class AnalyticsCollection {
  private AnalyticsCollection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Enumerates categories of events supported by the telemetry system.
   * </pre>
   *
   * Protobuf enum {@code bloombox.analytics.context.EventType}
   */
  public enum EventType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Generic event or error report with arbitrary payload.
     * </pre>
     *
     * <code>GENERIC = 0;</code>
     */
    GENERIC(0),
    /**
     * <pre>
     * Commercial analytics, like purchases, orders, and so on.
     * </pre>
     *
     * <code>COMMERCIAL = 1;</code>
     */
    COMMERCIAL(1),
    /**
     * <pre>
     * Identity analytics, like profile changes, auth grants and revocations, and so on.
     * </pre>
     *
     * <code>IDENTITY = 2;</code>
     */
    IDENTITY(2),
    /**
     * <pre>
     * Experience analytics, like pageviews, interactions, etc.
     * </pre>
     *
     * <code>EXPERIENCE = 3;</code>
     */
    EXPERIENCE(3),
    /**
     * <pre>
     * Operational analytics, like memory usage, network traffic, etc.
     * </pre>
     *
     * <code>OPERATIONAL = 4;</code>
     */
    OPERATIONAL(4),
    /**
     * <pre>
     * Events from RFID, BCR, or other inventory infrastructure.
     * </pre>
     *
     * <code>INVENTORY = 5;</code>
     */
    INVENTORY(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Generic event or error report with arbitrary payload.
     * </pre>
     *
     * <code>GENERIC = 0;</code>
     */
    public static final int GENERIC_VALUE = 0;
    /**
     * <pre>
     * Commercial analytics, like purchases, orders, and so on.
     * </pre>
     *
     * <code>COMMERCIAL = 1;</code>
     */
    public static final int COMMERCIAL_VALUE = 1;
    /**
     * <pre>
     * Identity analytics, like profile changes, auth grants and revocations, and so on.
     * </pre>
     *
     * <code>IDENTITY = 2;</code>
     */
    public static final int IDENTITY_VALUE = 2;
    /**
     * <pre>
     * Experience analytics, like pageviews, interactions, etc.
     * </pre>
     *
     * <code>EXPERIENCE = 3;</code>
     */
    public static final int EXPERIENCE_VALUE = 3;
    /**
     * <pre>
     * Operational analytics, like memory usage, network traffic, etc.
     * </pre>
     *
     * <code>OPERATIONAL = 4;</code>
     */
    public static final int OPERATIONAL_VALUE = 4;
    /**
     * <pre>
     * Events from RFID, BCR, or other inventory infrastructure.
     * </pre>
     *
     * <code>INVENTORY = 5;</code>
     */
    public static final int INVENTORY_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static EventType valueOf(int value) {
      return forNumber(value);
    }

    public static EventType forNumber(int value) {
      switch (value) {
        case 0: return GENERIC;
        case 1: return COMMERCIAL;
        case 2: return IDENTITY;
        case 3: return EXPERIENCE;
        case 4: return OPERATIONAL;
        case 5: return INVENTORY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EventType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        EventType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<EventType>() {
            public EventType findValueByNumber(int number) {
              return EventType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.bloombox.schema.telemetry.context.AnalyticsCollection.getDescriptor().getEnumTypes().get(0);
    }

    private static final EventType[] VALUES = values();

    public static EventType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EventType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:bloombox.analytics.context.EventType)
  }

  public interface CollectionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bloombox.analytics.context.Collection)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Specifies an un-enumerated collection by name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
     */
    java.lang.String getName();
    /**
     * <pre>
     * Specifies an un-enumerated collection by name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Specifies a specific collection as internal. Backend-only flag.
     * </pre>
     *
     * <code>bool internal = 2 [(.gen_bq_schema.description) = "Specifies a specific collection as internal. Backend-only flag."];</code>
     */
    boolean getInternal();

    /**
     * <pre>
     * Specifies the type of event. Usually added by the telemetry backend.
     * </pre>
     *
     * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
     */
    int getTypeValue();
    /**
     * <pre>
     * Specifies the type of event. Usually added by the telemetry backend.
     * </pre>
     *
     * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
     */
    io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType getType();
  }
  /**
   * <pre>
   * Represents a specification for an analytics event collection.
   * </pre>
   *
   * Protobuf type {@code bloombox.analytics.context.Collection}
   */
  public  static final class Collection extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bloombox.analytics.context.Collection)
      CollectionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Collection.newBuilder() to construct.
    private Collection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Collection() {
      name_ = "";
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Collection(
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
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              internal_ = input.readBool();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();

              type_ = rawValue;
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
      return io.bloombox.schema.telemetry.context.AnalyticsCollection.internal_static_bloombox_analytics_context_Collection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.telemetry.context.AnalyticsCollection.internal_static_bloombox_analytics_context_Collection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.class, io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Specifies an un-enumerated collection by name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Specifies an un-enumerated collection by name.
     * </pre>
     *
     * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int INTERNAL_FIELD_NUMBER = 2;
    private boolean internal_;
    /**
     * <pre>
     * Specifies a specific collection as internal. Backend-only flag.
     * </pre>
     *
     * <code>bool internal = 2 [(.gen_bq_schema.description) = "Specifies a specific collection as internal. Backend-only flag."];</code>
     */
    public boolean getInternal() {
      return internal_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     * Specifies the type of event. Usually added by the telemetry backend.
     * </pre>
     *
     * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Specifies the type of event. Usually added by the telemetry backend.
     * </pre>
     *
     * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
     */
    public io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType getType() {
      @SuppressWarnings("deprecation")
      io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType result = io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.valueOf(type_);
      return result == null ? io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.UNRECOGNIZED : result;
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
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (internal_ != false) {
        output.writeBool(2, internal_);
      }
      if (type_ != io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.GENERIC.getNumber()) {
        output.writeEnum(3, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (internal_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, internal_);
      }
      if (type_ != io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.GENERIC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
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
      if (!(obj instanceof io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection)) {
        return super.equals(obj);
      }
      io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection other = (io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getInternal()
          != other.getInternal()) return false;
      if (type_ != other.type_) return false;
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
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + INTERNAL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getInternal());
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parseFrom(
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
    public static Builder newBuilder(io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection prototype) {
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
     * Represents a specification for an analytics event collection.
     * </pre>
     *
     * Protobuf type {@code bloombox.analytics.context.Collection}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bloombox.analytics.context.Collection)
        io.bloombox.schema.telemetry.context.AnalyticsCollection.CollectionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.bloombox.schema.telemetry.context.AnalyticsCollection.internal_static_bloombox_analytics_context_Collection_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.bloombox.schema.telemetry.context.AnalyticsCollection.internal_static_bloombox_analytics_context_Collection_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.class, io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.Builder.class);
      }

      // Construct using io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.newBuilder()
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
        name_ = "";

        internal_ = false;

        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.bloombox.schema.telemetry.context.AnalyticsCollection.internal_static_bloombox_analytics_context_Collection_descriptor;
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection getDefaultInstanceForType() {
        return io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.getDefaultInstance();
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection build() {
        io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection buildPartial() {
        io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection result = new io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection(this);
        result.name_ = name_;
        result.internal_ = internal_;
        result.type_ = type_;
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
        if (other instanceof io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection) {
          return mergeFrom((io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection other) {
        if (other == io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getInternal() != false) {
          setInternal(other.getInternal());
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
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
        io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Specifies an un-enumerated collection by name.
       * </pre>
       *
       * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Specifies an un-enumerated collection by name.
       * </pre>
       *
       * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Specifies an un-enumerated collection by name.
       * </pre>
       *
       * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Specifies an un-enumerated collection by name.
       * </pre>
       *
       * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Specifies an un-enumerated collection by name.
       * </pre>
       *
       * <code>string name = 1 [(.gen_bq_schema.require) = true, (.gen_bq_schema.description) = "Specifies an un-enumerated collection by name."];</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private boolean internal_ ;
      /**
       * <pre>
       * Specifies a specific collection as internal. Backend-only flag.
       * </pre>
       *
       * <code>bool internal = 2 [(.gen_bq_schema.description) = "Specifies a specific collection as internal. Backend-only flag."];</code>
       */
      public boolean getInternal() {
        return internal_;
      }
      /**
       * <pre>
       * Specifies a specific collection as internal. Backend-only flag.
       * </pre>
       *
       * <code>bool internal = 2 [(.gen_bq_schema.description) = "Specifies a specific collection as internal. Backend-only flag."];</code>
       */
      public Builder setInternal(boolean value) {
        
        internal_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Specifies a specific collection as internal. Backend-only flag.
       * </pre>
       *
       * <code>bool internal = 2 [(.gen_bq_schema.description) = "Specifies a specific collection as internal. Backend-only flag."];</code>
       */
      public Builder clearInternal() {
        
        internal_ = false;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       * Specifies the type of event. Usually added by the telemetry backend.
       * </pre>
       *
       * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <pre>
       * Specifies the type of event. Usually added by the telemetry backend.
       * </pre>
       *
       * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Specifies the type of event. Usually added by the telemetry backend.
       * </pre>
       *
       * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
       */
      public io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType getType() {
        @SuppressWarnings("deprecation")
        io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType result = io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.valueOf(type_);
        return result == null ? io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Specifies the type of event. Usually added by the telemetry backend.
       * </pre>
       *
       * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
       */
      public Builder setType(io.bloombox.schema.telemetry.context.AnalyticsCollection.EventType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Specifies the type of event. Usually added by the telemetry backend.
       * </pre>
       *
       * <code>.bloombox.analytics.context.EventType type = 3 [(.gen_bq_schema.description) = "Specifies the type of event. Usually added by the telemetry backend."];</code>
       */
      public Builder clearType() {
        
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:bloombox.analytics.context.Collection)
    }

    // @@protoc_insertion_point(class_scope:bloombox.analytics.context.Collection)
    private static final io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection();
    }

    public static io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Collection>
        PARSER = new com.google.protobuf.AbstractParser<Collection>() {
      @java.lang.Override
      public Collection parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Collection(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Collection> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Collection> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.bloombox.schema.telemetry.context.AnalyticsCollection.Collection getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_analytics_context_Collection_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_analytics_context_Collection_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"analytics/context/Collection.proto\022\032bl" +
      "oombox.analytics.context\032\016bq_field.proto" +
      "\"\244\002\n\nCollection\022B\n\004name\030\001 \001(\tB4\360?\001\212@.Spe" +
      "cifies an un-enumerated collection by na" +
      "me.\022T\n\010internal\030\002 \001(\010BB\212@?Specifies a sp" +
      "ecific collection as internal. Backend-o" +
      "nly flag.\022|\n\004type\030\003 \001(\0162%.bloombox.analy" +
      "tics.context.EventTypeBG\212@DSpecifies the" +
      " type of event. Usually added by the tel" +
      "emetry backend.*f\n\tEventType\022\013\n\007GENERIC\020" +
      "\000\022\016\n\nCOMMERCIAL\020\001\022\014\n\010IDENTITY\020\002\022\016\n\nEXPER" +
      "IENCE\020\003\022\017\n\013OPERATIONAL\020\004\022\r\n\tINVENTORY\020\005B" +
      "E\n$io.bloombox.schema.telemetry.contextB" +
      "\023AnalyticsCollectionH\001P\000\242\002\003BBSb\006proto3"
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
    internal_static_bloombox_analytics_context_Collection_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_analytics_context_Collection_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_analytics_context_Collection_descriptor,
        new java.lang.String[] { "Name", "Internal", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    registry.add(gen_bq_schema.BqField.require);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
