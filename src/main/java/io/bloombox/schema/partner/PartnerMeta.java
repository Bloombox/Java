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
// source: partner/PartnerKey.proto

package io.bloombox.schema.partner;

public final class PartnerMeta {
  private PartnerMeta() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PartnerKeyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:bloombox.partner.PartnerKey)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Short string that uniquely identifies a partner organization.
     * </pre>
     *
     * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
     */
    java.lang.String getCode();
    /**
     * <pre>
     * Short string that uniquely identifies a partner organization.
     * </pre>
     *
     * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
     */
    com.google.protobuf.ByteString
        getCodeBytes();
  }
  /**
   * <pre>
   * Specifies a key that references a partner organization, with an account opened at Bloombox.
   * </pre>
   *
   * Protobuf type {@code bloombox.partner.PartnerKey}
   */
  public  static final class PartnerKey extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:bloombox.partner.PartnerKey)
      PartnerKeyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PartnerKey.newBuilder() to construct.
    private PartnerKey(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PartnerKey() {
      code_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PartnerKey(
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

              code_ = s;
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
      return io.bloombox.schema.partner.PartnerMeta.internal_static_bloombox_partner_PartnerKey_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.PartnerMeta.internal_static_bloombox_partner_PartnerKey_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.PartnerMeta.PartnerKey.class, io.bloombox.schema.partner.PartnerMeta.PartnerKey.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object code_;
    /**
     * <pre>
     * Short string that uniquely identifies a partner organization.
     * </pre>
     *
     * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Short string that uniquely identifies a partner organization.
     * </pre>
     *
     * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
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
      if (!getCodeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getCodeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code_);
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
      if (!(obj instanceof io.bloombox.schema.partner.PartnerMeta.PartnerKey)) {
        return super.equals(obj);
      }
      io.bloombox.schema.partner.PartnerMeta.PartnerKey other = (io.bloombox.schema.partner.PartnerMeta.PartnerKey) obj;

      if (!getCode()
          .equals(other.getCode())) return false;
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
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey parseFrom(
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
    public static Builder newBuilder(io.bloombox.schema.partner.PartnerMeta.PartnerKey prototype) {
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
     * Specifies a key that references a partner organization, with an account opened at Bloombox.
     * </pre>
     *
     * Protobuf type {@code bloombox.partner.PartnerKey}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:bloombox.partner.PartnerKey)
        io.bloombox.schema.partner.PartnerMeta.PartnerKeyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.bloombox.schema.partner.PartnerMeta.internal_static_bloombox_partner_PartnerKey_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.bloombox.schema.partner.PartnerMeta.internal_static_bloombox_partner_PartnerKey_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.bloombox.schema.partner.PartnerMeta.PartnerKey.class, io.bloombox.schema.partner.PartnerMeta.PartnerKey.Builder.class);
      }

      // Construct using io.bloombox.schema.partner.PartnerMeta.PartnerKey.newBuilder()
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
        code_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.bloombox.schema.partner.PartnerMeta.internal_static_bloombox_partner_PartnerKey_descriptor;
      }

      @java.lang.Override
      public io.bloombox.schema.partner.PartnerMeta.PartnerKey getDefaultInstanceForType() {
        return io.bloombox.schema.partner.PartnerMeta.PartnerKey.getDefaultInstance();
      }

      @java.lang.Override
      public io.bloombox.schema.partner.PartnerMeta.PartnerKey build() {
        io.bloombox.schema.partner.PartnerMeta.PartnerKey result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.bloombox.schema.partner.PartnerMeta.PartnerKey buildPartial() {
        io.bloombox.schema.partner.PartnerMeta.PartnerKey result = new io.bloombox.schema.partner.PartnerMeta.PartnerKey(this);
        result.code_ = code_;
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
        if (other instanceof io.bloombox.schema.partner.PartnerMeta.PartnerKey) {
          return mergeFrom((io.bloombox.schema.partner.PartnerMeta.PartnerKey)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.bloombox.schema.partner.PartnerMeta.PartnerKey other) {
        if (other == io.bloombox.schema.partner.PartnerMeta.PartnerKey.getDefaultInstance()) return this;
        if (!other.getCode().isEmpty()) {
          code_ = other.code_;
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
        io.bloombox.schema.partner.PartnerMeta.PartnerKey parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.bloombox.schema.partner.PartnerMeta.PartnerKey) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object code_ = "";
      /**
       * <pre>
       * Short string that uniquely identifies a partner organization.
       * </pre>
       *
       * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
       */
      public java.lang.String getCode() {
        java.lang.Object ref = code_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          code_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Short string that uniquely identifies a partner organization.
       * </pre>
       *
       * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        java.lang.Object ref = code_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          code_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Short string that uniquely identifies a partner organization.
       * </pre>
       *
       * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
       */
      public Builder setCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Short string that uniquely identifies a partner organization.
       * </pre>
       *
       * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
       */
      public Builder clearCode() {
        
        code_ = getDefaultInstance().getCode();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Short string that uniquely identifies a partner organization.
       * </pre>
       *
       * <code>string code = 1 [(.gen_bq_schema.description) = "Short string that uniquely identifies a partner organization.", (.core.field) = { ... }</code>
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        code_ = value;
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


      // @@protoc_insertion_point(builder_scope:bloombox.partner.PartnerKey)
    }

    // @@protoc_insertion_point(class_scope:bloombox.partner.PartnerKey)
    private static final io.bloombox.schema.partner.PartnerMeta.PartnerKey DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.bloombox.schema.partner.PartnerMeta.PartnerKey();
    }

    public static io.bloombox.schema.partner.PartnerMeta.PartnerKey getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PartnerKey>
        PARSER = new com.google.protobuf.AbstractParser<PartnerKey>() {
      @java.lang.Override
      public PartnerKey parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PartnerKey(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PartnerKey> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PartnerKey> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.bloombox.schema.partner.PartnerMeta.PartnerKey getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_partner_PartnerKey_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_partner_PartnerKey_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030partner/PartnerKey.proto\022\020bloombox.par" +
      "tner\032\016bq_field.proto\032\024core/Datamodel.pro" +
      "to\"b\n\nPartnerKey\022T\n\004code\030\001 \001(\tBF\302\265\003\002\010\002\212@" +
      "=Short string that uniquely identifies a" +
      " partner organization.B3\n\032io.bloombox.sc" +
      "hema.partnerB\013PartnerMetaH\001P\000\242\002\003BBSb\006pro" +
      "to3"
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
          core.Datamodel.getDescriptor(),
        }, assigner);
    internal_static_bloombox_partner_PartnerKey_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_partner_PartnerKey_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_partner_PartnerKey_descriptor,
        new java.lang.String[] { "Code", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(core.Datamodel.field);
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    core.Datamodel.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
