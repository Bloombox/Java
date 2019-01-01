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
// source: products/menu/Menu.proto

package io.opencannabis.schema.menu;

/**
 * <pre>
 * Specifies an inner menu payload which contains menu data for a given menu section.
 * </pre>
 *
 * Protobuf type {@code opencannabis.products.menu.SectionData}
 */
public  final class SectionData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.products.menu.SectionData)
    SectionDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SectionData.newBuilder() to construct.
  private SectionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SectionData() {
    count_ = 0;
    product_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SectionData(
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

            count_ = input.readInt32();
            break;
          }
          case 18: {
            io.opencannabis.schema.menu.section.SectionSpec.Builder subBuilder = null;
            if (section_ != null) {
              subBuilder = section_.toBuilder();
            }
            section_ = input.readMessage(io.opencannabis.schema.menu.section.SectionSpec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(section_);
              section_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              product_ = new java.util.ArrayList<io.opencannabis.schema.menu.MenuProduct>();
              mutable_bitField0_ |= 0x00000004;
            }
            product_.add(
                input.readMessage(io.opencannabis.schema.menu.MenuProduct.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        product_ = java.util.Collections.unmodifiableList(product_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_SectionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_SectionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.menu.SectionData.class, io.opencannabis.schema.menu.SectionData.Builder.class);
  }

  private int bitField0_;
  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <pre>
   * Count of products included in this menu section data.
   * </pre>
   *
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int SECTION_FIELD_NUMBER = 2;
  private io.opencannabis.schema.menu.section.SectionSpec section_;
  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
   */
  public boolean hasSection() {
    return section_ != null;
  }
  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
   */
  public io.opencannabis.schema.menu.section.SectionSpec getSection() {
    return section_ == null ? io.opencannabis.schema.menu.section.SectionSpec.getDefaultInstance() : section_;
  }
  /**
   * <pre>
   * Section that this data is attached to.
   * </pre>
   *
   * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
   */
  public io.opencannabis.schema.menu.section.SectionSpecOrBuilder getSectionOrBuilder() {
    return getSection();
  }

  public static final int PRODUCT_FIELD_NUMBER = 3;
  private java.util.List<io.opencannabis.schema.menu.MenuProduct> product_;
  /**
   * <pre>
   * Menu products attached to this section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
   */
  public java.util.List<io.opencannabis.schema.menu.MenuProduct> getProductList() {
    return product_;
  }
  /**
   * <pre>
   * Menu products attached to this section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
   */
  public java.util.List<? extends io.opencannabis.schema.menu.MenuProductOrBuilder> 
      getProductOrBuilderList() {
    return product_;
  }
  /**
   * <pre>
   * Menu products attached to this section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
   */
  public int getProductCount() {
    return product_.size();
  }
  /**
   * <pre>
   * Menu products attached to this section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
   */
  public io.opencannabis.schema.menu.MenuProduct getProduct(int index) {
    return product_.get(index);
  }
  /**
   * <pre>
   * Menu products attached to this section.
   * </pre>
   *
   * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
   */
  public io.opencannabis.schema.menu.MenuProductOrBuilder getProductOrBuilder(
      int index) {
    return product_.get(index);
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    if (section_ != null) {
      output.writeMessage(2, getSection());
    }
    for (int i = 0; i < product_.size(); i++) {
      output.writeMessage(3, product_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    if (section_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSection());
    }
    for (int i = 0; i < product_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, product_.get(i));
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
    if (!(obj instanceof io.opencannabis.schema.menu.SectionData)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.menu.SectionData other = (io.opencannabis.schema.menu.SectionData) obj;

    boolean result = true;
    result = result && (getCount()
        == other.getCount());
    result = result && (hasSection() == other.hasSection());
    if (hasSection()) {
      result = result && getSection()
          .equals(other.getSection());
    }
    result = result && getProductList()
        .equals(other.getProductList());
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (hasSection()) {
      hash = (37 * hash) + SECTION_FIELD_NUMBER;
      hash = (53 * hash) + getSection().hashCode();
    }
    if (getProductCount() > 0) {
      hash = (37 * hash) + PRODUCT_FIELD_NUMBER;
      hash = (53 * hash) + getProductList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.menu.SectionData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.SectionData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.SectionData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.SectionData parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.menu.SectionData prototype) {
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
   * Specifies an inner menu payload which contains menu data for a given menu section.
   * </pre>
   *
   * Protobuf type {@code opencannabis.products.menu.SectionData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.products.menu.SectionData)
      io.opencannabis.schema.menu.SectionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_SectionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_SectionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.menu.SectionData.class, io.opencannabis.schema.menu.SectionData.Builder.class);
    }

    // Construct using io.opencannabis.schema.menu.SectionData.newBuilder()
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
        getProductFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      count_ = 0;

      if (sectionBuilder_ == null) {
        section_ = null;
      } else {
        section_ = null;
        sectionBuilder_ = null;
      }
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        productBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_SectionData_descriptor;
    }

    @java.lang.Override
    public io.opencannabis.schema.menu.SectionData getDefaultInstanceForType() {
      return io.opencannabis.schema.menu.SectionData.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencannabis.schema.menu.SectionData build() {
      io.opencannabis.schema.menu.SectionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencannabis.schema.menu.SectionData buildPartial() {
      io.opencannabis.schema.menu.SectionData result = new io.opencannabis.schema.menu.SectionData(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.count_ = count_;
      if (sectionBuilder_ == null) {
        result.section_ = section_;
      } else {
        result.section_ = sectionBuilder_.build();
      }
      if (productBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          product_ = java.util.Collections.unmodifiableList(product_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.product_ = product_;
      } else {
        result.product_ = productBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.opencannabis.schema.menu.SectionData) {
        return mergeFrom((io.opencannabis.schema.menu.SectionData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.menu.SectionData other) {
      if (other == io.opencannabis.schema.menu.SectionData.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.hasSection()) {
        mergeSection(other.getSection());
      }
      if (productBuilder_ == null) {
        if (!other.product_.isEmpty()) {
          if (product_.isEmpty()) {
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureProductIsMutable();
            product_.addAll(other.product_);
          }
          onChanged();
        }
      } else {
        if (!other.product_.isEmpty()) {
          if (productBuilder_.isEmpty()) {
            productBuilder_.dispose();
            productBuilder_ = null;
            product_ = other.product_;
            bitField0_ = (bitField0_ & ~0x00000004);
            productBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getProductFieldBuilder() : null;
          } else {
            productBuilder_.addAllMessages(other.product_);
          }
        }
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
      io.opencannabis.schema.menu.SectionData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.menu.SectionData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int count_ ;
    /**
     * <pre>
     * Count of products included in this menu section data.
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     * Count of products included in this menu section data.
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Count of products included in this menu section data.
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.menu.section.SectionSpec section_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.section.SectionSpec, io.opencannabis.schema.menu.section.SectionSpec.Builder, io.opencannabis.schema.menu.section.SectionSpecOrBuilder> sectionBuilder_;
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public boolean hasSection() {
      return sectionBuilder_ != null || section_ != null;
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionSpec getSection() {
      if (sectionBuilder_ == null) {
        return section_ == null ? io.opencannabis.schema.menu.section.SectionSpec.getDefaultInstance() : section_;
      } else {
        return sectionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public Builder setSection(io.opencannabis.schema.menu.section.SectionSpec value) {
      if (sectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        section_ = value;
        onChanged();
      } else {
        sectionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public Builder setSection(
        io.opencannabis.schema.menu.section.SectionSpec.Builder builderForValue) {
      if (sectionBuilder_ == null) {
        section_ = builderForValue.build();
        onChanged();
      } else {
        sectionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public Builder mergeSection(io.opencannabis.schema.menu.section.SectionSpec value) {
      if (sectionBuilder_ == null) {
        if (section_ != null) {
          section_ =
            io.opencannabis.schema.menu.section.SectionSpec.newBuilder(section_).mergeFrom(value).buildPartial();
        } else {
          section_ = value;
        }
        onChanged();
      } else {
        sectionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public Builder clearSection() {
      if (sectionBuilder_ == null) {
        section_ = null;
        onChanged();
      } else {
        section_ = null;
        sectionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionSpec.Builder getSectionBuilder() {
      
      onChanged();
      return getSectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    public io.opencannabis.schema.menu.section.SectionSpecOrBuilder getSectionOrBuilder() {
      if (sectionBuilder_ != null) {
        return sectionBuilder_.getMessageOrBuilder();
      } else {
        return section_ == null ?
            io.opencannabis.schema.menu.section.SectionSpec.getDefaultInstance() : section_;
      }
    }
    /**
     * <pre>
     * Section that this data is attached to.
     * </pre>
     *
     * <code>.opencannabis.products.menu.section.SectionSpec section = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.section.SectionSpec, io.opencannabis.schema.menu.section.SectionSpec.Builder, io.opencannabis.schema.menu.section.SectionSpecOrBuilder> 
        getSectionFieldBuilder() {
      if (sectionBuilder_ == null) {
        sectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.menu.section.SectionSpec, io.opencannabis.schema.menu.section.SectionSpec.Builder, io.opencannabis.schema.menu.section.SectionSpecOrBuilder>(
                getSection(),
                getParentForChildren(),
                isClean());
        section_ = null;
      }
      return sectionBuilder_;
    }

    private java.util.List<io.opencannabis.schema.menu.MenuProduct> product_ =
      java.util.Collections.emptyList();
    private void ensureProductIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        product_ = new java.util.ArrayList<io.opencannabis.schema.menu.MenuProduct>(product_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opencannabis.schema.menu.MenuProduct, io.opencannabis.schema.menu.MenuProduct.Builder, io.opencannabis.schema.menu.MenuProductOrBuilder> productBuilder_;

    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public java.util.List<io.opencannabis.schema.menu.MenuProduct> getProductList() {
      if (productBuilder_ == null) {
        return java.util.Collections.unmodifiableList(product_);
      } else {
        return productBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public int getProductCount() {
      if (productBuilder_ == null) {
        return product_.size();
      } else {
        return productBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public io.opencannabis.schema.menu.MenuProduct getProduct(int index) {
      if (productBuilder_ == null) {
        return product_.get(index);
      } else {
        return productBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder setProduct(
        int index, io.opencannabis.schema.menu.MenuProduct value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.set(index, value);
        onChanged();
      } else {
        productBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder setProduct(
        int index, io.opencannabis.schema.menu.MenuProduct.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.set(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder addProduct(io.opencannabis.schema.menu.MenuProduct value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(value);
        onChanged();
      } else {
        productBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder addProduct(
        int index, io.opencannabis.schema.menu.MenuProduct value) {
      if (productBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProductIsMutable();
        product_.add(index, value);
        onChanged();
      } else {
        productBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder addProduct(
        io.opencannabis.schema.menu.MenuProduct.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder addProduct(
        int index, io.opencannabis.schema.menu.MenuProduct.Builder builderForValue) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.add(index, builderForValue.build());
        onChanged();
      } else {
        productBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder addAllProduct(
        java.lang.Iterable<? extends io.opencannabis.schema.menu.MenuProduct> values) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, product_);
        onChanged();
      } else {
        productBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder clearProduct() {
      if (productBuilder_ == null) {
        product_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        productBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public Builder removeProduct(int index) {
      if (productBuilder_ == null) {
        ensureProductIsMutable();
        product_.remove(index);
        onChanged();
      } else {
        productBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public io.opencannabis.schema.menu.MenuProduct.Builder getProductBuilder(
        int index) {
      return getProductFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public io.opencannabis.schema.menu.MenuProductOrBuilder getProductOrBuilder(
        int index) {
      if (productBuilder_ == null) {
        return product_.get(index);  } else {
        return productBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public java.util.List<? extends io.opencannabis.schema.menu.MenuProductOrBuilder> 
         getProductOrBuilderList() {
      if (productBuilder_ != null) {
        return productBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(product_);
      }
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public io.opencannabis.schema.menu.MenuProduct.Builder addProductBuilder() {
      return getProductFieldBuilder().addBuilder(
          io.opencannabis.schema.menu.MenuProduct.getDefaultInstance());
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public io.opencannabis.schema.menu.MenuProduct.Builder addProductBuilder(
        int index) {
      return getProductFieldBuilder().addBuilder(
          index, io.opencannabis.schema.menu.MenuProduct.getDefaultInstance());
    }
    /**
     * <pre>
     * Menu products attached to this section.
     * </pre>
     *
     * <code>repeated .opencannabis.products.menu.MenuProduct product = 3;</code>
     */
    public java.util.List<io.opencannabis.schema.menu.MenuProduct.Builder> 
         getProductBuilderList() {
      return getProductFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opencannabis.schema.menu.MenuProduct, io.opencannabis.schema.menu.MenuProduct.Builder, io.opencannabis.schema.menu.MenuProductOrBuilder> 
        getProductFieldBuilder() {
      if (productBuilder_ == null) {
        productBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.opencannabis.schema.menu.MenuProduct, io.opencannabis.schema.menu.MenuProduct.Builder, io.opencannabis.schema.menu.MenuProductOrBuilder>(
                product_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        product_ = null;
      }
      return productBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.products.menu.SectionData)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.products.menu.SectionData)
  private static final io.opencannabis.schema.menu.SectionData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.menu.SectionData();
  }

  public static io.opencannabis.schema.menu.SectionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SectionData>
      PARSER = new com.google.protobuf.AbstractParser<SectionData>() {
    @java.lang.Override
    public SectionData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SectionData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SectionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SectionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencannabis.schema.menu.SectionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

