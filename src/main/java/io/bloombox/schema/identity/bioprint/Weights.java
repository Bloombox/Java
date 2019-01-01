/*
 * Copyright 2018, Momentum Ideas, Co. All rights reserved.
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
// source: identity/bioprint/Weights.proto

package io.bloombox.schema.identity.bioprint;

public final class Weights {
  private Weights() {}
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
   * Specifies signals from which significance may be tracked, or otherwise made addressable, by the user.
   * </pre>
   *
   * Protobuf enum {@code bloombox.identity.bioprint.SignificanceSignal}
   */
  public enum SignificanceSignal
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * User-declared preferences and proclivities.
     * </pre>
     *
     * <code>DECLARED = 0;</code>
     */
    DECLARED(0),
    /**
     * <pre>
     * Machine-inferred, or history-inferred, preferences and proclivities.
     * </pre>
     *
     * <code>INFERRED = 1;</code>
     */
    INFERRED(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * User-declared preferences and proclivities.
     * </pre>
     *
     * <code>DECLARED = 0;</code>
     */
    public static final int DECLARED_VALUE = 0;
    /**
     * <pre>
     * Machine-inferred, or history-inferred, preferences and proclivities.
     * </pre>
     *
     * <code>INFERRED = 1;</code>
     */
    public static final int INFERRED_VALUE = 1;


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
    public static SignificanceSignal valueOf(int value) {
      return forNumber(value);
    }

    public static SignificanceSignal forNumber(int value) {
      switch (value) {
        case 0: return DECLARED;
        case 1: return INFERRED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SignificanceSignal>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        SignificanceSignal> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<SignificanceSignal>() {
            public SignificanceSignal findValueByNumber(int number) {
              return SignificanceSignal.forNumber(number);
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
      return io.bloombox.schema.identity.bioprint.Weights.getDescriptor().getEnumTypes().get(0);
    }

    private static final SignificanceSignal[] VALUES = values();

    public static SignificanceSignal valueOf(
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

    private SignificanceSignal(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:bloombox.identity.bioprint.SignificanceSignal)
  }

  public interface MetricSignificanceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bloombox.identity.bioprint.MetricSignificance)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Signal from which this significance value is derived.
     * </pre>
     *
     * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
     */
    int getSignalValue();
    /**
     * <pre>
     * Signal from which this significance value is derived.
     * </pre>
     *
     * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
     */
    io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal getSignal();

    /**
     * <pre>
     * Weight value provided for a given metric, to indicate significance.
     * </pre>
     *
     * <code>sfixed32 weight = 2;</code>
     */
    int getWeight();
  }
  /**
   * <pre>
   * Describes the relative significance, to a user, of some cannabis use metric or affinity. Referenced from affinities
   * and affinity groups do apply consideration in a measured way according to the user's profile.
   * </pre>
   *
   * Protobuf type {@code bloombox.identity.bioprint.MetricSignificance}
   */
  public  static final class MetricSignificance extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bloombox.identity.bioprint.MetricSignificance)
      MetricSignificanceOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetricSignificance.newBuilder() to construct.
    private MetricSignificance(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetricSignificance() {
      signal_ = 0;
      weight_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetricSignificance(
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
            case 8: {
              int rawValue = input.readEnum();

              signal_ = rawValue;
              break;
            }
            case 21: {

              weight_ = input.readSFixed32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
      return io.bloombox.schema.identity.bioprint.Weights.internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.bioprint.Weights.internal_static_bloombox_identity_bioprint_MetricSignificance_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.class, io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.Builder.class);
    }

    public static final int SIGNAL_FIELD_NUMBER = 1;
    private int signal_;
    /**
     * <pre>
     * Signal from which this significance value is derived.
     * </pre>
     *
     * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
     */
    public int getSignalValue() {
      return signal_;
    }
    /**
     * <pre>
     * Signal from which this significance value is derived.
     * </pre>
     *
     * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
     */
    public io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal getSignal() {
      @SuppressWarnings("deprecation")
      io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal result = io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.valueOf(signal_);
      return result == null ? io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.UNRECOGNIZED : result;
    }

    public static final int WEIGHT_FIELD_NUMBER = 2;
    private int weight_;
    /**
     * <pre>
     * Weight value provided for a given metric, to indicate significance.
     * </pre>
     *
     * <code>sfixed32 weight = 2;</code>
     */
    public int getWeight() {
      return weight_;
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
      if (signal_ != io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.DECLARED.getNumber()) {
        output.writeEnum(1, signal_);
      }
      if (weight_ != 0) {
        output.writeSFixed32(2, weight_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (signal_ != io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.DECLARED.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, signal_);
      }
      if (weight_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed32Size(2, weight_);
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
      if (!(obj instanceof io.bloombox.schema.identity.bioprint.Weights.MetricSignificance)) {
        return super.equals(obj);
      }
      io.bloombox.schema.identity.bioprint.Weights.MetricSignificance other = (io.bloombox.schema.identity.bioprint.Weights.MetricSignificance) obj;

      boolean result = true;
      result = result && signal_ == other.signal_;
      result = result && (getWeight()
          == other.getWeight());
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
      hash = (37 * hash) + SIGNAL_FIELD_NUMBER;
      hash = (53 * hash) + signal_;
      hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + getWeight();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parseFrom(
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
    public static Builder newBuilder(io.bloombox.schema.identity.bioprint.Weights.MetricSignificance prototype) {
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
     * Describes the relative significance, to a user, of some cannabis use metric or affinity. Referenced from affinities
     * and affinity groups do apply consideration in a measured way according to the user's profile.
     * </pre>
     *
     * Protobuf type {@code bloombox.identity.bioprint.MetricSignificance}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bloombox.identity.bioprint.MetricSignificance)
        io.bloombox.schema.identity.bioprint.Weights.MetricSignificanceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.bloombox.schema.identity.bioprint.Weights.internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.bloombox.schema.identity.bioprint.Weights.internal_static_bloombox_identity_bioprint_MetricSignificance_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.class, io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.Builder.class);
      }

      // Construct using io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.newBuilder()
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
        signal_ = 0;

        weight_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.bloombox.schema.identity.bioprint.Weights.internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor;
      }

      @java.lang.Override
      public io.bloombox.schema.identity.bioprint.Weights.MetricSignificance getDefaultInstanceForType() {
        return io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.getDefaultInstance();
      }

      @java.lang.Override
      public io.bloombox.schema.identity.bioprint.Weights.MetricSignificance build() {
        io.bloombox.schema.identity.bioprint.Weights.MetricSignificance result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.bloombox.schema.identity.bioprint.Weights.MetricSignificance buildPartial() {
        io.bloombox.schema.identity.bioprint.Weights.MetricSignificance result = new io.bloombox.schema.identity.bioprint.Weights.MetricSignificance(this);
        result.signal_ = signal_;
        result.weight_ = weight_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.bloombox.schema.identity.bioprint.Weights.MetricSignificance) {
          return mergeFrom((io.bloombox.schema.identity.bioprint.Weights.MetricSignificance)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.bloombox.schema.identity.bioprint.Weights.MetricSignificance other) {
        if (other == io.bloombox.schema.identity.bioprint.Weights.MetricSignificance.getDefaultInstance()) return this;
        if (other.signal_ != 0) {
          setSignalValue(other.getSignalValue());
        }
        if (other.getWeight() != 0) {
          setWeight(other.getWeight());
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
        io.bloombox.schema.identity.bioprint.Weights.MetricSignificance parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.bloombox.schema.identity.bioprint.Weights.MetricSignificance) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int signal_ = 0;
      /**
       * <pre>
       * Signal from which this significance value is derived.
       * </pre>
       *
       * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
       */
      public int getSignalValue() {
        return signal_;
      }
      /**
       * <pre>
       * Signal from which this significance value is derived.
       * </pre>
       *
       * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
       */
      public Builder setSignalValue(int value) {
        signal_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Signal from which this significance value is derived.
       * </pre>
       *
       * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
       */
      public io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal getSignal() {
        @SuppressWarnings("deprecation")
        io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal result = io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.valueOf(signal_);
        return result == null ? io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * Signal from which this significance value is derived.
       * </pre>
       *
       * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
       */
      public Builder setSignal(io.bloombox.schema.identity.bioprint.Weights.SignificanceSignal value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        signal_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Signal from which this significance value is derived.
       * </pre>
       *
       * <code>.bloombox.identity.bioprint.SignificanceSignal signal = 1;</code>
       */
      public Builder clearSignal() {
        
        signal_ = 0;
        onChanged();
        return this;
      }

      private int weight_ ;
      /**
       * <pre>
       * Weight value provided for a given metric, to indicate significance.
       * </pre>
       *
       * <code>sfixed32 weight = 2;</code>
       */
      public int getWeight() {
        return weight_;
      }
      /**
       * <pre>
       * Weight value provided for a given metric, to indicate significance.
       * </pre>
       *
       * <code>sfixed32 weight = 2;</code>
       */
      public Builder setWeight(int value) {
        
        weight_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Weight value provided for a given metric, to indicate significance.
       * </pre>
       *
       * <code>sfixed32 weight = 2;</code>
       */
      public Builder clearWeight() {
        
        weight_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:bloombox.identity.bioprint.MetricSignificance)
    }

    // @@protoc_insertion_point(class_scope:bloombox.identity.bioprint.MetricSignificance)
    private static final io.bloombox.schema.identity.bioprint.Weights.MetricSignificance DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.bloombox.schema.identity.bioprint.Weights.MetricSignificance();
    }

    public static io.bloombox.schema.identity.bioprint.Weights.MetricSignificance getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricSignificance>
        PARSER = new com.google.protobuf.AbstractParser<MetricSignificance>() {
      @java.lang.Override
      public MetricSignificance parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetricSignificance(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MetricSignificance> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricSignificance> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.bloombox.schema.identity.bioprint.Weights.MetricSignificance getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_identity_bioprint_MetricSignificance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037identity/bioprint/Weights.proto\022\032bloom" +
      "box.identity.bioprint\"d\n\022MetricSignifica" +
      "nce\022>\n\006signal\030\001 \001(\0162..bloombox.identity." +
      "bioprint.SignificanceSignal\022\016\n\006weight\030\002 " +
      "\001(\017*0\n\022SignificanceSignal\022\014\n\010DECLARED\020\000\022" +
      "\014\n\010INFERRED\020\001B9\n$io.bloombox.schema.iden" +
      "tity.bioprintB\007WeightsH\001P\000\242\002\003BBSb\006proto3"
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
    internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_identity_bioprint_MetricSignificance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_identity_bioprint_MetricSignificance_descriptor,
        new java.lang.String[] { "Signal", "Weight", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
