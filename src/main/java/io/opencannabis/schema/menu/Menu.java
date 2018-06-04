// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: products/menu/Menu.proto

package io.opencannabis.schema.menu;

/**
 * <pre>
 * Holds a full specification for a revision of menu data, segmented into sections, by the categories member products
 * are filed in. Categories are enumerated in `menu.Section`.
 * </pre>
 *
 * Protobuf type {@code opencannabis.products.menu.Menu}
 */
public  final class Menu extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.products.menu.Menu)
    MenuOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Menu.newBuilder() to construct.
  private Menu(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Menu() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Menu(
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
            io.opencannabis.schema.menu.Metadata.Builder subBuilder = null;
            if (metadata_ != null) {
              subBuilder = metadata_.toBuilder();
            }
            metadata_ = input.readMessage(io.opencannabis.schema.menu.Metadata.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(metadata_);
              metadata_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            io.opencannabis.schema.menu.SectionedMenu.Builder subBuilder = null;
            if (contentCase_ == 3) {
              subBuilder = ((io.opencannabis.schema.menu.SectionedMenu) content_).toBuilder();
            }
            content_ =
                input.readMessage(io.opencannabis.schema.menu.SectionedMenu.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.opencannabis.schema.menu.SectionedMenu) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 3;
            break;
          }
          case 34: {
            io.opencannabis.schema.menu.StaticMenu.Builder subBuilder = null;
            if (contentCase_ == 4) {
              subBuilder = ((io.opencannabis.schema.menu.StaticMenu) content_).toBuilder();
            }
            content_ =
                input.readMessage(io.opencannabis.schema.menu.StaticMenu.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.opencannabis.schema.menu.StaticMenu) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 4;
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
    return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_Menu_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_Menu_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.menu.Menu.class, io.opencannabis.schema.menu.Menu.Builder.class);
  }

  private int contentCase_ = 0;
  private java.lang.Object content_;
  public enum ContentCase
      implements com.google.protobuf.Internal.EnumLite {
    PAYLOAD(3),
    MENU(4),
    CONTENT_NOT_SET(0);
    private final int value;
    private ContentCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentCase forNumber(int value) {
      switch (value) {
        case 3: return PAYLOAD;
        case 4: return MENU;
        case 0: return CONTENT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ContentCase
  getContentCase() {
    return ContentCase.forNumber(
        contentCase_);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private io.opencannabis.schema.menu.Metadata metadata_;
  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
   */
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
   */
  public io.opencannabis.schema.menu.Metadata getMetadata() {
    return metadata_ == null ? io.opencannabis.schema.menu.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <pre>
   * Metadata for the menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
   */
  public io.opencannabis.schema.menu.MetadataOrBuilder getMetadataOrBuilder() {
    return getMetadata();
  }

  public static final int PAYLOAD_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
   */
  public boolean hasPayload() {
    return contentCase_ == 3;
  }
  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
   */
  public io.opencannabis.schema.menu.SectionedMenu getPayload() {
    if (contentCase_ == 3) {
       return (io.opencannabis.schema.menu.SectionedMenu) content_;
    }
    return io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
  }
  /**
   * <pre>
   * Data payloads attached to this menu.
   * </pre>
   *
   * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
   */
  public io.opencannabis.schema.menu.SectionedMenuOrBuilder getPayloadOrBuilder() {
    if (contentCase_ == 3) {
       return (io.opencannabis.schema.menu.SectionedMenu) content_;
    }
    return io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
  }

  public static final int MENU_FIELD_NUMBER = 4;
  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
   */
  public boolean hasMenu() {
    return contentCase_ == 4;
  }
  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
   */
  public io.opencannabis.schema.menu.StaticMenu getMenu() {
    if (contentCase_ == 4) {
       return (io.opencannabis.schema.menu.StaticMenu) content_;
    }
    return io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
  }
  /**
   * <pre>
   * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
   * </pre>
   *
   * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
   */
  public io.opencannabis.schema.menu.StaticMenuOrBuilder getMenuOrBuilder() {
    if (contentCase_ == 4) {
       return (io.opencannabis.schema.menu.StaticMenu) content_;
    }
    return io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
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
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    if (contentCase_ == 3) {
      output.writeMessage(3, (io.opencannabis.schema.menu.SectionedMenu) content_);
    }
    if (contentCase_ == 4) {
      output.writeMessage(4, (io.opencannabis.schema.menu.StaticMenu) content_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetadata());
    }
    if (contentCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.opencannabis.schema.menu.SectionedMenu) content_);
    }
    if (contentCase_ == 4) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, (io.opencannabis.schema.menu.StaticMenu) content_);
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
    if (!(obj instanceof io.opencannabis.schema.menu.Menu)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.menu.Menu other = (io.opencannabis.schema.menu.Menu) obj;

    boolean result = true;
    result = result && (hasMetadata() == other.hasMetadata());
    if (hasMetadata()) {
      result = result && getMetadata()
          .equals(other.getMetadata());
    }
    result = result && getContentCase().equals(
        other.getContentCase());
    if (!result) return false;
    switch (contentCase_) {
      case 3:
        result = result && getPayload()
            .equals(other.getPayload());
        break;
      case 4:
        result = result && getMenu()
            .equals(other.getMenu());
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    switch (contentCase_) {
      case 3:
        hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
        hash = (53 * hash) + getPayload().hashCode();
        break;
      case 4:
        hash = (37 * hash) + MENU_FIELD_NUMBER;
        hash = (53 * hash) + getMenu().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.menu.Menu parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.Menu parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.Menu parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.menu.Menu parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.menu.Menu prototype) {
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
   * Holds a full specification for a revision of menu data, segmented into sections, by the categories member products
   * are filed in. Categories are enumerated in `menu.Section`.
   * </pre>
   *
   * Protobuf type {@code opencannabis.products.menu.Menu}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.products.menu.Menu)
      io.opencannabis.schema.menu.MenuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_Menu_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_Menu_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.menu.Menu.class, io.opencannabis.schema.menu.Menu.Builder.class);
    }

    // Construct using io.opencannabis.schema.menu.Menu.newBuilder()
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
      if (metadataBuilder_ == null) {
        metadata_ = null;
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }
      contentCase_ = 0;
      content_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.menu.MenuOuterClass.internal_static_opencannabis_products_menu_Menu_descriptor;
    }

    public io.opencannabis.schema.menu.Menu getDefaultInstanceForType() {
      return io.opencannabis.schema.menu.Menu.getDefaultInstance();
    }

    public io.opencannabis.schema.menu.Menu build() {
      io.opencannabis.schema.menu.Menu result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.menu.Menu buildPartial() {
      io.opencannabis.schema.menu.Menu result = new io.opencannabis.schema.menu.Menu(this);
      if (metadataBuilder_ == null) {
        result.metadata_ = metadata_;
      } else {
        result.metadata_ = metadataBuilder_.build();
      }
      if (contentCase_ == 3) {
        if (payloadBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = payloadBuilder_.build();
        }
      }
      if (contentCase_ == 4) {
        if (menuBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = menuBuilder_.build();
        }
      }
      result.contentCase_ = contentCase_;
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
      if (other instanceof io.opencannabis.schema.menu.Menu) {
        return mergeFrom((io.opencannabis.schema.menu.Menu)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.menu.Menu other) {
      if (other == io.opencannabis.schema.menu.Menu.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      switch (other.getContentCase()) {
        case PAYLOAD: {
          mergePayload(other.getPayload());
          break;
        }
        case MENU: {
          mergeMenu(other.getMenu());
          break;
        }
        case CONTENT_NOT_SET: {
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
      io.opencannabis.schema.menu.Menu parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.menu.Menu) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int contentCase_ = 0;
    private java.lang.Object content_;
    public ContentCase
        getContentCase() {
      return ContentCase.forNumber(
          contentCase_);
    }

    public Builder clearContent() {
      contentCase_ = 0;
      content_ = null;
      onChanged();
      return this;
    }


    private io.opencannabis.schema.menu.Metadata metadata_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.Metadata, io.opencannabis.schema.menu.Metadata.Builder, io.opencannabis.schema.menu.MetadataOrBuilder> metadataBuilder_;
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public boolean hasMetadata() {
      return metadataBuilder_ != null || metadata_ != null;
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public io.opencannabis.schema.menu.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? io.opencannabis.schema.menu.Metadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public Builder setMetadata(io.opencannabis.schema.menu.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
        onChanged();
      } else {
        metadataBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public Builder setMetadata(
        io.opencannabis.schema.menu.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
        onChanged();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public Builder mergeMetadata(io.opencannabis.schema.menu.Metadata value) {
      if (metadataBuilder_ == null) {
        if (metadata_ != null) {
          metadata_ =
            io.opencannabis.schema.menu.Metadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
        } else {
          metadata_ = value;
        }
        onChanged();
      } else {
        metadataBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public Builder clearMetadata() {
      if (metadataBuilder_ == null) {
        metadata_ = null;
        onChanged();
      } else {
        metadata_ = null;
        metadataBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public io.opencannabis.schema.menu.Metadata.Builder getMetadataBuilder() {
      
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    public io.opencannabis.schema.menu.MetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            io.opencannabis.schema.menu.Metadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <pre>
     * Metadata for the menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.Metadata metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.Metadata, io.opencannabis.schema.menu.Metadata.Builder, io.opencannabis.schema.menu.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.menu.Metadata, io.opencannabis.schema.menu.Metadata.Builder, io.opencannabis.schema.menu.MetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.SectionedMenu, io.opencannabis.schema.menu.SectionedMenu.Builder, io.opencannabis.schema.menu.SectionedMenuOrBuilder> payloadBuilder_;
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public boolean hasPayload() {
      return contentCase_ == 3;
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public io.opencannabis.schema.menu.SectionedMenu getPayload() {
      if (payloadBuilder_ == null) {
        if (contentCase_ == 3) {
          return (io.opencannabis.schema.menu.SectionedMenu) content_;
        }
        return io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
      } else {
        if (contentCase_ == 3) {
          return payloadBuilder_.getMessage();
        }
        return io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public Builder setPayload(io.opencannabis.schema.menu.SectionedMenu value) {
      if (payloadBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        payloadBuilder_.setMessage(value);
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public Builder setPayload(
        io.opencannabis.schema.menu.SectionedMenu.Builder builderForValue) {
      if (payloadBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        payloadBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public Builder mergePayload(io.opencannabis.schema.menu.SectionedMenu value) {
      if (payloadBuilder_ == null) {
        if (contentCase_ == 3 &&
            content_ != io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance()) {
          content_ = io.opencannabis.schema.menu.SectionedMenu.newBuilder((io.opencannabis.schema.menu.SectionedMenu) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 3) {
          payloadBuilder_.mergeFrom(value);
        }
        payloadBuilder_.setMessage(value);
      }
      contentCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public Builder clearPayload() {
      if (payloadBuilder_ == null) {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 3) {
          contentCase_ = 0;
          content_ = null;
        }
        payloadBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public io.opencannabis.schema.menu.SectionedMenu.Builder getPayloadBuilder() {
      return getPayloadFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    public io.opencannabis.schema.menu.SectionedMenuOrBuilder getPayloadOrBuilder() {
      if ((contentCase_ == 3) && (payloadBuilder_ != null)) {
        return payloadBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 3) {
          return (io.opencannabis.schema.menu.SectionedMenu) content_;
        }
        return io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Data payloads attached to this menu.
     * </pre>
     *
     * <code>.opencannabis.products.menu.SectionedMenu payload = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.SectionedMenu, io.opencannabis.schema.menu.SectionedMenu.Builder, io.opencannabis.schema.menu.SectionedMenuOrBuilder> 
        getPayloadFieldBuilder() {
      if (payloadBuilder_ == null) {
        if (!(contentCase_ == 3)) {
          content_ = io.opencannabis.schema.menu.SectionedMenu.getDefaultInstance();
        }
        payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.menu.SectionedMenu, io.opencannabis.schema.menu.SectionedMenu.Builder, io.opencannabis.schema.menu.SectionedMenuOrBuilder>(
                (io.opencannabis.schema.menu.SectionedMenu) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 3;
      onChanged();;
      return payloadBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.StaticMenu, io.opencannabis.schema.menu.StaticMenu.Builder, io.opencannabis.schema.menu.StaticMenuOrBuilder> menuBuilder_;
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public boolean hasMenu() {
      return contentCase_ == 4;
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public io.opencannabis.schema.menu.StaticMenu getMenu() {
      if (menuBuilder_ == null) {
        if (contentCase_ == 4) {
          return (io.opencannabis.schema.menu.StaticMenu) content_;
        }
        return io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
      } else {
        if (contentCase_ == 4) {
          return menuBuilder_.getMessage();
        }
        return io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public Builder setMenu(io.opencannabis.schema.menu.StaticMenu value) {
      if (menuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        menuBuilder_.setMessage(value);
      }
      contentCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public Builder setMenu(
        io.opencannabis.schema.menu.StaticMenu.Builder builderForValue) {
      if (menuBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        menuBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public Builder mergeMenu(io.opencannabis.schema.menu.StaticMenu value) {
      if (menuBuilder_ == null) {
        if (contentCase_ == 4 &&
            content_ != io.opencannabis.schema.menu.StaticMenu.getDefaultInstance()) {
          content_ = io.opencannabis.schema.menu.StaticMenu.newBuilder((io.opencannabis.schema.menu.StaticMenu) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 4) {
          menuBuilder_.mergeFrom(value);
        }
        menuBuilder_.setMessage(value);
      }
      contentCase_ = 4;
      return this;
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public Builder clearMenu() {
      if (menuBuilder_ == null) {
        if (contentCase_ == 4) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 4) {
          contentCase_ = 0;
          content_ = null;
        }
        menuBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public io.opencannabis.schema.menu.StaticMenu.Builder getMenuBuilder() {
      return getMenuFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    public io.opencannabis.schema.menu.StaticMenuOrBuilder getMenuOrBuilder() {
      if ((contentCase_ == 4) && (menuBuilder_ != null)) {
        return menuBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 4) {
          return (io.opencannabis.schema.menu.StaticMenu) content_;
        }
        return io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies a static menu, where each section is specified as a typed map, with keys mapped to products.
     * </pre>
     *
     * <code>.opencannabis.products.menu.StaticMenu menu = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.menu.StaticMenu, io.opencannabis.schema.menu.StaticMenu.Builder, io.opencannabis.schema.menu.StaticMenuOrBuilder> 
        getMenuFieldBuilder() {
      if (menuBuilder_ == null) {
        if (!(contentCase_ == 4)) {
          content_ = io.opencannabis.schema.menu.StaticMenu.getDefaultInstance();
        }
        menuBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.menu.StaticMenu, io.opencannabis.schema.menu.StaticMenu.Builder, io.opencannabis.schema.menu.StaticMenuOrBuilder>(
                (io.opencannabis.schema.menu.StaticMenu) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 4;
      onChanged();;
      return menuBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.products.menu.Menu)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.products.menu.Menu)
  private static final io.opencannabis.schema.menu.Menu DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.menu.Menu();
  }

  public static io.opencannabis.schema.menu.Menu getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Menu>
      PARSER = new com.google.protobuf.AbstractParser<Menu>() {
    public Menu parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Menu(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Menu> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Menu> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.menu.Menu getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

