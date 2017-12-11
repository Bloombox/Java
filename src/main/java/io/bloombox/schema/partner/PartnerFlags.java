/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: partner/Partner.proto

package io.bloombox.schema.partner;

/**
 * <pre>
 * Specifies flags that may be set on a partner organization account.
 * </pre>
 *
 * Protobuf type {@code partner.PartnerFlags}
 */
public  final class PartnerFlags extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:partner.PartnerFlags)
    PartnerFlagsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PartnerFlags.newBuilder() to construct.
  private PartnerFlags(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PartnerFlags() {
    suspended_ = false;
    pastdue_ = false;
    beta_ = false;
    sandbox_ = false;
    internal_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PartnerFlags(
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
          case 8: {

            suspended_ = input.readBool();
            break;
          }
          case 16: {

            pastdue_ = input.readBool();
            break;
          }
          case 24: {

            beta_ = input.readBool();
            break;
          }
          case 32: {

            sandbox_ = input.readBool();
            break;
          }
          case 40: {

            internal_ = input.readBool();
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
    return io.bloombox.schema.partner.PartnerOuterClass.internal_static_partner_PartnerFlags_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.partner.PartnerOuterClass.internal_static_partner_PartnerFlags_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.partner.PartnerFlags.class, io.bloombox.schema.partner.PartnerFlags.Builder.class);
  }

  public static final int SUSPENDED_FIELD_NUMBER = 1;
  private boolean suspended_;
  /**
   * <pre>
   * Specifies that the subject partner organization is currently suspended, organization wide, and has had access
   * revoked to Bloombox systems.
   * </pre>
   *
   * <code>bool suspended = 1 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is currently suspended, organization wide, and has had access revoked to Bloombox systems."];</code>
   */
  public boolean getSuspended() {
    return suspended_;
  }

  public static final int PASTDUE_FIELD_NUMBER = 2;
  private boolean pastdue_;
  /**
   * <pre>
   * Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and
   * related access has been heavily restricted.
   * </pre>
   *
   * <code>bool pastdue = 2 [(.gen_bq_schema.description) = "Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and related access has been heavily restricted."];</code>
   */
  public boolean getPastdue() {
    return pastdue_;
  }

  public static final int BETA_FIELD_NUMBER = 3;
  private boolean beta_;
  /**
   * <pre>
   * Specifies that the subject partner organization has access to beta features, clusters, and systems.
   * </pre>
   *
   * <code>bool beta = 3 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has access to beta features, clusters, and systems."];</code>
   */
  public boolean getBeta() {
    return beta_;
  }

  public static final int SANDBOX_FIELD_NUMBER = 4;
  private boolean sandbox_;
  /**
   * <pre>
   * Specifies that the subject partner organization has internal sandbox access.
   * </pre>
   *
   * <code>bool sandbox = 4 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has internal sandbox access."];</code>
   */
  public boolean getSandbox() {
    return sandbox_;
  }

  public static final int INTERNAL_FIELD_NUMBER = 5;
  private boolean internal_;
  /**
   * <pre>
   * Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or
   * by selected partners.
   * </pre>
   *
   * <code>bool internal = 5 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or by selected partners."];</code>
   */
  public boolean getInternal() {
    return internal_;
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
    if (suspended_ != false) {
      output.writeBool(1, suspended_);
    }
    if (pastdue_ != false) {
      output.writeBool(2, pastdue_);
    }
    if (beta_ != false) {
      output.writeBool(3, beta_);
    }
    if (sandbox_ != false) {
      output.writeBool(4, sandbox_);
    }
    if (internal_ != false) {
      output.writeBool(5, internal_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (suspended_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, suspended_);
    }
    if (pastdue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, pastdue_);
    }
    if (beta_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, beta_);
    }
    if (sandbox_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, sandbox_);
    }
    if (internal_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, internal_);
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
    if (!(obj instanceof io.bloombox.schema.partner.PartnerFlags)) {
      return super.equals(obj);
    }
    io.bloombox.schema.partner.PartnerFlags other = (io.bloombox.schema.partner.PartnerFlags) obj;

    boolean result = true;
    result = result && (getSuspended()
        == other.getSuspended());
    result = result && (getPastdue()
        == other.getPastdue());
    result = result && (getBeta()
        == other.getBeta());
    result = result && (getSandbox()
        == other.getSandbox());
    result = result && (getInternal()
        == other.getInternal());
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
    hash = (37 * hash) + SUSPENDED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuspended());
    hash = (37 * hash) + PASTDUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPastdue());
    hash = (37 * hash) + BETA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getBeta());
    hash = (37 * hash) + SANDBOX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSandbox());
    hash = (37 * hash) + INTERNAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInternal());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.partner.PartnerFlags parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.partner.PartnerFlags prototype) {
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
   * Specifies flags that may be set on a partner organization account.
   * </pre>
   *
   * Protobuf type {@code partner.PartnerFlags}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:partner.PartnerFlags)
      io.bloombox.schema.partner.PartnerFlagsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.partner.PartnerOuterClass.internal_static_partner_PartnerFlags_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.partner.PartnerOuterClass.internal_static_partner_PartnerFlags_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.partner.PartnerFlags.class, io.bloombox.schema.partner.PartnerFlags.Builder.class);
    }

    // Construct using io.bloombox.schema.partner.PartnerFlags.newBuilder()
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
      suspended_ = false;

      pastdue_ = false;

      beta_ = false;

      sandbox_ = false;

      internal_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.partner.PartnerOuterClass.internal_static_partner_PartnerFlags_descriptor;
    }

    public io.bloombox.schema.partner.PartnerFlags getDefaultInstanceForType() {
      return io.bloombox.schema.partner.PartnerFlags.getDefaultInstance();
    }

    public io.bloombox.schema.partner.PartnerFlags build() {
      io.bloombox.schema.partner.PartnerFlags result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.partner.PartnerFlags buildPartial() {
      io.bloombox.schema.partner.PartnerFlags result = new io.bloombox.schema.partner.PartnerFlags(this);
      result.suspended_ = suspended_;
      result.pastdue_ = pastdue_;
      result.beta_ = beta_;
      result.sandbox_ = sandbox_;
      result.internal_ = internal_;
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
      if (other instanceof io.bloombox.schema.partner.PartnerFlags) {
        return mergeFrom((io.bloombox.schema.partner.PartnerFlags)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.partner.PartnerFlags other) {
      if (other == io.bloombox.schema.partner.PartnerFlags.getDefaultInstance()) return this;
      if (other.getSuspended() != false) {
        setSuspended(other.getSuspended());
      }
      if (other.getPastdue() != false) {
        setPastdue(other.getPastdue());
      }
      if (other.getBeta() != false) {
        setBeta(other.getBeta());
      }
      if (other.getSandbox() != false) {
        setSandbox(other.getSandbox());
      }
      if (other.getInternal() != false) {
        setInternal(other.getInternal());
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
      io.bloombox.schema.partner.PartnerFlags parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.partner.PartnerFlags) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean suspended_ ;
    /**
     * <pre>
     * Specifies that the subject partner organization is currently suspended, organization wide, and has had access
     * revoked to Bloombox systems.
     * </pre>
     *
     * <code>bool suspended = 1 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is currently suspended, organization wide, and has had access revoked to Bloombox systems."];</code>
     */
    public boolean getSuspended() {
      return suspended_;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization is currently suspended, organization wide, and has had access
     * revoked to Bloombox systems.
     * </pre>
     *
     * <code>bool suspended = 1 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is currently suspended, organization wide, and has had access revoked to Bloombox systems."];</code>
     */
    public Builder setSuspended(boolean value) {
      
      suspended_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization is currently suspended, organization wide, and has had access
     * revoked to Bloombox systems.
     * </pre>
     *
     * <code>bool suspended = 1 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is currently suspended, organization wide, and has had access revoked to Bloombox systems."];</code>
     */
    public Builder clearSuspended() {
      
      suspended_ = false;
      onChanged();
      return this;
    }

    private boolean pastdue_ ;
    /**
     * <pre>
     * Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and
     * related access has been heavily restricted.
     * </pre>
     *
     * <code>bool pastdue = 2 [(.gen_bq_schema.description) = "Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and related access has been heavily restricted."];</code>
     */
    public boolean getPastdue() {
      return pastdue_;
    }
    /**
     * <pre>
     * Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and
     * related access has been heavily restricted.
     * </pre>
     *
     * <code>bool pastdue = 2 [(.gen_bq_schema.description) = "Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and related access has been heavily restricted."];</code>
     */
    public Builder setPastdue(boolean value) {
      
      pastdue_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and
     * related access has been heavily restricted.
     * </pre>
     *
     * <code>bool pastdue = 2 [(.gen_bq_schema.description) = "Specifies that the subject partner organiztaion is currently in a past-due state, where their organization and related access has been heavily restricted."];</code>
     */
    public Builder clearPastdue() {
      
      pastdue_ = false;
      onChanged();
      return this;
    }

    private boolean beta_ ;
    /**
     * <pre>
     * Specifies that the subject partner organization has access to beta features, clusters, and systems.
     * </pre>
     *
     * <code>bool beta = 3 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has access to beta features, clusters, and systems."];</code>
     */
    public boolean getBeta() {
      return beta_;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization has access to beta features, clusters, and systems.
     * </pre>
     *
     * <code>bool beta = 3 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has access to beta features, clusters, and systems."];</code>
     */
    public Builder setBeta(boolean value) {
      
      beta_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization has access to beta features, clusters, and systems.
     * </pre>
     *
     * <code>bool beta = 3 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has access to beta features, clusters, and systems."];</code>
     */
    public Builder clearBeta() {
      
      beta_ = false;
      onChanged();
      return this;
    }

    private boolean sandbox_ ;
    /**
     * <pre>
     * Specifies that the subject partner organization has internal sandbox access.
     * </pre>
     *
     * <code>bool sandbox = 4 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has internal sandbox access."];</code>
     */
    public boolean getSandbox() {
      return sandbox_;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization has internal sandbox access.
     * </pre>
     *
     * <code>bool sandbox = 4 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has internal sandbox access."];</code>
     */
    public Builder setSandbox(boolean value) {
      
      sandbox_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization has internal sandbox access.
     * </pre>
     *
     * <code>bool sandbox = 4 [(.gen_bq_schema.description) = "Specifies that the subject partner organization has internal sandbox access."];</code>
     */
    public Builder clearSandbox() {
      
      sandbox_ = false;
      onChanged();
      return this;
    }

    private boolean internal_ ;
    /**
     * <pre>
     * Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or
     * by selected partners.
     * </pre>
     *
     * <code>bool internal = 5 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or by selected partners."];</code>
     */
    public boolean getInternal() {
      return internal_;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or
     * by selected partners.
     * </pre>
     *
     * <code>bool internal = 5 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or by selected partners."];</code>
     */
    public Builder setInternal(boolean value) {
      
      internal_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or
     * by selected partners.
     * </pre>
     *
     * <code>bool internal = 5 [(.gen_bq_schema.description) = "Specifies that the subject partner organization is a testing account held and managed internally by Bloombox, or by selected partners."];</code>
     */
    public Builder clearInternal() {
      
      internal_ = false;
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


    // @@protoc_insertion_point(builder_scope:partner.PartnerFlags)
  }

  // @@protoc_insertion_point(class_scope:partner.PartnerFlags)
  private static final io.bloombox.schema.partner.PartnerFlags DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.partner.PartnerFlags();
  }

  public static io.bloombox.schema.partner.PartnerFlags getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PartnerFlags>
      PARSER = new com.google.protobuf.AbstractParser<PartnerFlags>() {
    public PartnerFlags parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new PartnerFlags(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PartnerFlags> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PartnerFlags> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.partner.PartnerFlags getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

