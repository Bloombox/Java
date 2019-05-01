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
// source: search/SearchSpec.proto

package io.bloombox.schema.search;

/**
 * <pre>
 * Specifies options for conducting a fulltext search operation.
 * </pre>
 *
 * Protobuf type {@code bloombox.search.SearchOptions}
 */
public  final class SearchOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.search.SearchOptions)
    SearchOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchOptions.newBuilder() to construct.
  private SearchOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchOptions() {
    scope_ = "";
    section_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SearchOptions(
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

            scope_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              section_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000002;
            }
            section_.add(rawValue);
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                section_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000002;
              }
              section_.add(rawValue);
            }
            input.popLimit(oldLimit);
            break;
          }
          case 24: {

            hidden_ = input.readBool();
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        section_ = java.util.Collections.unmodifiableList(section_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.search.SearchOptions.class, io.bloombox.schema.search.SearchOptions.Builder.class);
  }

  private int bitField0_;
  public static final int SCOPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object scope_;
  /**
   * <pre>
   * Partner and location scope to apply during a search operation.
   * </pre>
   *
   * <code>string scope = 1;</code>
   */
  public java.lang.String getScope() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scope_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Partner and location scope to apply during a search operation.
   * </pre>
   *
   * <code>string scope = 1;</code>
   */
  public com.google.protobuf.ByteString
      getScopeBytes() {
    java.lang.Object ref = scope_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scope_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SECTION_FIELD_NUMBER = 2;
  private java.util.List<java.lang.Integer> section_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, io.opencannabis.schema.menu.section.Section> section_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, io.opencannabis.schema.menu.section.Section>() {
            public io.opencannabis.schema.menu.section.Section convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              io.opencannabis.schema.menu.section.Section result = io.opencannabis.schema.menu.section.Section.valueOf(from);
              return result == null ? io.opencannabis.schema.menu.section.Section.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  public java.util.List<io.opencannabis.schema.menu.section.Section> getSectionList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, io.opencannabis.schema.menu.section.Section>(section_, section_converter_);
  }
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  public int getSectionCount() {
    return section_.size();
  }
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  public io.opencannabis.schema.menu.section.Section getSection(int index) {
    return section_converter_.convert(section_.get(index));
  }
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  public java.util.List<java.lang.Integer>
  getSectionValueList() {
    return section_;
  }
  /**
   * <pre>
   * Menu sections to search in. If unspecified, search all sections.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
   */
  public int getSectionValue(int index) {
    return section_.get(index);
  }
  private int sectionMemoizedSerializedSize;

  public static final int HIDDEN_FIELD_NUMBER = 3;
  private boolean hidden_;
  /**
   * <pre>
   * Return products regardless of their visibility status.
   * </pre>
   *
   * <code>bool hidden = 3;</code>
   */
  public boolean getHidden() {
    return hidden_;
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
    getSerializedSize();
    if (!getScopeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, scope_);
    }
    if (getSectionList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(sectionMemoizedSerializedSize);
    }
    for (int i = 0; i < section_.size(); i++) {
      output.writeEnumNoTag(section_.get(i));
    }
    if (hidden_ != false) {
      output.writeBool(3, hidden_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getScopeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, scope_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < section_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(section_.get(i));
      }
      size += dataSize;
      if (!getSectionList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }sectionMemoizedSerializedSize = dataSize;
    }
    if (hidden_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hidden_);
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
    if (!(obj instanceof io.bloombox.schema.search.SearchOptions)) {
      return super.equals(obj);
    }
    io.bloombox.schema.search.SearchOptions other = (io.bloombox.schema.search.SearchOptions) obj;

    if (!getScope()
        .equals(other.getScope())) return false;
    if (!section_.equals(other.section_)) return false;
    if (getHidden()
        != other.getHidden()) return false;
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
    hash = (37 * hash) + SCOPE_FIELD_NUMBER;
    hash = (53 * hash) + getScope().hashCode();
    if (getSectionCount() > 0) {
      hash = (37 * hash) + SECTION_FIELD_NUMBER;
      hash = (53 * hash) + section_.hashCode();
    }
    hash = (37 * hash) + HIDDEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHidden());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.search.SearchOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.search.SearchOptions parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.search.SearchOptions prototype) {
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
   * Specifies options for conducting a fulltext search operation.
   * </pre>
   *
   * Protobuf type {@code bloombox.search.SearchOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.search.SearchOptions)
      io.bloombox.schema.search.SearchOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.search.SearchOptions.class, io.bloombox.schema.search.SearchOptions.Builder.class);
    }

    // Construct using io.bloombox.schema.search.SearchOptions.newBuilder()
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
      scope_ = "";

      section_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      hidden_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.search.SearchMetadata.internal_static_bloombox_search_SearchOptions_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchOptions getDefaultInstanceForType() {
      return io.bloombox.schema.search.SearchOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchOptions build() {
      io.bloombox.schema.search.SearchOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.search.SearchOptions buildPartial() {
      io.bloombox.schema.search.SearchOptions result = new io.bloombox.schema.search.SearchOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.scope_ = scope_;
      if (((bitField0_ & 0x00000002) != 0)) {
        section_ = java.util.Collections.unmodifiableList(section_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.section_ = section_;
      result.hidden_ = hidden_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.bloombox.schema.search.SearchOptions) {
        return mergeFrom((io.bloombox.schema.search.SearchOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.search.SearchOptions other) {
      if (other == io.bloombox.schema.search.SearchOptions.getDefaultInstance()) return this;
      if (!other.getScope().isEmpty()) {
        scope_ = other.scope_;
        onChanged();
      }
      if (!other.section_.isEmpty()) {
        if (section_.isEmpty()) {
          section_ = other.section_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureSectionIsMutable();
          section_.addAll(other.section_);
        }
        onChanged();
      }
      if (other.getHidden() != false) {
        setHidden(other.getHidden());
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
      io.bloombox.schema.search.SearchOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.search.SearchOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object scope_ = "";
    /**
     * <pre>
     * Partner and location scope to apply during a search operation.
     * </pre>
     *
     * <code>string scope = 1;</code>
     */
    public java.lang.String getScope() {
      java.lang.Object ref = scope_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scope_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Partner and location scope to apply during a search operation.
     * </pre>
     *
     * <code>string scope = 1;</code>
     */
    public com.google.protobuf.ByteString
        getScopeBytes() {
      java.lang.Object ref = scope_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scope_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Partner and location scope to apply during a search operation.
     * </pre>
     *
     * <code>string scope = 1;</code>
     */
    public Builder setScope(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scope_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partner and location scope to apply during a search operation.
     * </pre>
     *
     * <code>string scope = 1;</code>
     */
    public Builder clearScope() {
      
      scope_ = getDefaultInstance().getScope();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Partner and location scope to apply during a search operation.
     * </pre>
     *
     * <code>string scope = 1;</code>
     */
    public Builder setScopeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scope_ = value;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> section_ =
      java.util.Collections.emptyList();
    private void ensureSectionIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        section_ = new java.util.ArrayList<java.lang.Integer>(section_);
        bitField0_ |= 0x00000002;
      }
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public java.util.List<io.opencannabis.schema.menu.section.Section> getSectionList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, io.opencannabis.schema.menu.section.Section>(section_, section_converter_);
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public int getSectionCount() {
      return section_.size();
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public io.opencannabis.schema.menu.section.Section getSection(int index) {
      return section_converter_.convert(section_.get(index));
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder setSection(
        int index, io.opencannabis.schema.menu.section.Section value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSectionIsMutable();
      section_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder addSection(io.opencannabis.schema.menu.section.Section value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureSectionIsMutable();
      section_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder addAllSection(
        java.lang.Iterable<? extends io.opencannabis.schema.menu.section.Section> values) {
      ensureSectionIsMutable();
      for (io.opencannabis.schema.menu.section.Section value : values) {
        section_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder clearSection() {
      section_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public java.util.List<java.lang.Integer>
    getSectionValueList() {
      return java.util.Collections.unmodifiableList(section_);
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public int getSectionValue(int index) {
      return section_.get(index);
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder setSectionValue(
        int index, int value) {
      ensureSectionIsMutable();
      section_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder addSectionValue(int value) {
      ensureSectionIsMutable();
      section_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Menu sections to search in. If unspecified, search all sections.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.section.Section section = 2;</code>
     */
    public Builder addAllSectionValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureSectionIsMutable();
      for (int value : values) {
        section_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean hidden_ ;
    /**
     * <pre>
     * Return products regardless of their visibility status.
     * </pre>
     *
     * <code>bool hidden = 3;</code>
     */
    public boolean getHidden() {
      return hidden_;
    }
    /**
     * <pre>
     * Return products regardless of their visibility status.
     * </pre>
     *
     * <code>bool hidden = 3;</code>
     */
    public Builder setHidden(boolean value) {
      
      hidden_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Return products regardless of their visibility status.
     * </pre>
     *
     * <code>bool hidden = 3;</code>
     */
    public Builder clearHidden() {
      
      hidden_ = false;
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


    // @@protoc_insertion_point(builder_scope:bloombox.search.SearchOptions)
  }

  // @@protoc_insertion_point(class_scope:bloombox.search.SearchOptions)
  private static final io.bloombox.schema.search.SearchOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.search.SearchOptions();
  }

  public static io.bloombox.schema.search.SearchOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchOptions>
      PARSER = new com.google.protobuf.AbstractParser<SearchOptions>() {
    @java.lang.Override
    public SearchOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SearchOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SearchOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.search.SearchOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

