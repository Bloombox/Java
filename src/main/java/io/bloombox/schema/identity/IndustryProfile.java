/*
 * Copyright 2017, Bloombox, LLC.
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
// source: identity/User.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Profile for a cannabis industry professional of some sort.
 * </pre>
 *
 * Protobuf type {@code identity.IndustryProfile}
 */
public  final class IndustryProfile extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.IndustryProfile)
    IndustryProfileOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IndustryProfile.newBuilder() to construct.
  private IndustryProfile(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IndustryProfile() {
    active_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IndustryProfile(
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

            active_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              partners_ = com.google.protobuf.MapField.newMapField(
                  PartnersDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000002;
            }
            com.google.protobuf.MapEntry<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
            partners__ = input.readMessage(
                PartnersDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            partners_.getMutableMap().put(
                partners__.getKey(), partners__.getValue());
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
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetPartners();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.IndustryProfile.class, io.bloombox.schema.identity.IndustryProfile.Builder.class);
  }

  private int bitField0_;
  public static final int ACTIVE_FIELD_NUMBER = 1;
  private boolean active_;
  /**
   * <pre>
   * Profile inactive/active status.
   * </pre>
   *
   * <code>bool active = 1;</code>
   */
  public boolean getActive() {
    return active_;
  }

  public static final int PARTNERS_FIELD_NUMBER = 2;
  private static final class PartnersDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.bloombox.schema.security.access.PartnerAccess> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>newDefaultInstance(
                io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_PartnersEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.bloombox.schema.security.access.PartnerAccess.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.bloombox.schema.security.access.PartnerAccess> partners_;
  private com.google.protobuf.MapField<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
  internalGetPartners() {
    if (partners_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          PartnersDefaultEntryHolder.defaultEntry);
    }
    return partners_;
  }

  public int getPartnersCount() {
    return internalGetPartners().getMap().size();
  }
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
   */

  public boolean containsPartners(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetPartners().getMap().containsKey(key);
  }
  /**
   * Use {@link #getPartnersMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> getPartners() {
    return getPartnersMap();
  }
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
   */

  public java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> getPartnersMap() {
    return internalGetPartners().getMap();
  }
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
   */

  public io.bloombox.schema.security.access.PartnerAccess getPartnersOrDefault(
      java.lang.String key,
      io.bloombox.schema.security.access.PartnerAccess defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> map =
        internalGetPartners().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map of partner accesses levels to partner codes.
   * </pre>
   *
   * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
   */

  public io.bloombox.schema.security.access.PartnerAccess getPartnersOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> map =
        internalGetPartners().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (active_ != false) {
      output.writeBool(1, active_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetPartners(),
        PartnersDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, active_);
    }
    for (java.util.Map.Entry<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> entry
         : internalGetPartners().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
      partners__ = PartnersDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, partners__);
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
    if (!(obj instanceof io.bloombox.schema.identity.IndustryProfile)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.IndustryProfile other = (io.bloombox.schema.identity.IndustryProfile) obj;

    boolean result = true;
    result = result && (getActive()
        == other.getActive());
    result = result && internalGetPartners().equals(
        other.internalGetPartners());
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
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    if (!internalGetPartners().getMap().isEmpty()) {
      hash = (37 * hash) + PARTNERS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetPartners().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.IndustryProfile parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.identity.IndustryProfile prototype) {
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
   * Profile for a cannabis industry professional of some sort.
   * </pre>
   *
   * Protobuf type {@code identity.IndustryProfile}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.IndustryProfile)
      io.bloombox.schema.identity.IndustryProfileOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetPartners();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutablePartners();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.IndustryProfile.class, io.bloombox.schema.identity.IndustryProfile.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.IndustryProfile.newBuilder()
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
      active_ = false;

      internalGetMutablePartners().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_IndustryProfile_descriptor;
    }

    public io.bloombox.schema.identity.IndustryProfile getDefaultInstanceForType() {
      return io.bloombox.schema.identity.IndustryProfile.getDefaultInstance();
    }

    public io.bloombox.schema.identity.IndustryProfile build() {
      io.bloombox.schema.identity.IndustryProfile result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.IndustryProfile buildPartial() {
      io.bloombox.schema.identity.IndustryProfile result = new io.bloombox.schema.identity.IndustryProfile(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.active_ = active_;
      result.partners_ = internalGetPartners();
      result.partners_.makeImmutable();
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.bloombox.schema.identity.IndustryProfile) {
        return mergeFrom((io.bloombox.schema.identity.IndustryProfile)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.IndustryProfile other) {
      if (other == io.bloombox.schema.identity.IndustryProfile.getDefaultInstance()) return this;
      if (other.getActive() != false) {
        setActive(other.getActive());
      }
      internalGetMutablePartners().mergeFrom(
          other.internalGetPartners());
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
      io.bloombox.schema.identity.IndustryProfile parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.IndustryProfile) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean active_ ;
    /**
     * <pre>
     * Profile inactive/active status.
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public boolean getActive() {
      return active_;
    }
    /**
     * <pre>
     * Profile inactive/active status.
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public Builder setActive(boolean value) {
      
      active_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Profile inactive/active status.
     * </pre>
     *
     * <code>bool active = 1;</code>
     */
    public Builder clearActive() {
      
      active_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.bloombox.schema.security.access.PartnerAccess> partners_;
    private com.google.protobuf.MapField<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
    internalGetPartners() {
      if (partners_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            PartnersDefaultEntryHolder.defaultEntry);
      }
      return partners_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
    internalGetMutablePartners() {
      onChanged();;
      if (partners_ == null) {
        partners_ = com.google.protobuf.MapField.newMapField(
            PartnersDefaultEntryHolder.defaultEntry);
      }
      if (!partners_.isMutable()) {
        partners_ = partners_.copy();
      }
      return partners_;
    }

    public int getPartnersCount() {
      return internalGetPartners().getMap().size();
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public boolean containsPartners(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetPartners().getMap().containsKey(key);
    }
    /**
     * Use {@link #getPartnersMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> getPartners() {
      return getPartnersMap();
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> getPartnersMap() {
      return internalGetPartners().getMap();
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public io.bloombox.schema.security.access.PartnerAccess getPartnersOrDefault(
        java.lang.String key,
        io.bloombox.schema.security.access.PartnerAccess defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> map =
          internalGetPartners().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public io.bloombox.schema.security.access.PartnerAccess getPartnersOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> map =
          internalGetPartners().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearPartners() {
      internalGetMutablePartners().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public Builder removePartners(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartners().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess>
    getMutablePartners() {
      return internalGetMutablePartners().getMutableMap();
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */
    public Builder putPartners(
        java.lang.String key,
        io.bloombox.schema.security.access.PartnerAccess value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutablePartners().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Map of partner accesses levels to partner codes.
     * </pre>
     *
     * <code>map&lt;string, .security.access.PartnerAccess&gt; partners = 2;</code>
     */

    public Builder putAllPartners(
        java.util.Map<java.lang.String, io.bloombox.schema.security.access.PartnerAccess> values) {
      internalGetMutablePartners().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:identity.IndustryProfile)
  }

  // @@protoc_insertion_point(class_scope:identity.IndustryProfile)
  private static final io.bloombox.schema.identity.IndustryProfile DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.IndustryProfile();
  }

  public static io.bloombox.schema.identity.IndustryProfile getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IndustryProfile>
      PARSER = new com.google.protobuf.AbstractParser<IndustryProfile>() {
    public IndustryProfile parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new IndustryProfile(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IndustryProfile> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IndustryProfile> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.IndustryProfile getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
