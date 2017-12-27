// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/User.proto

package io.bloombox.schema.identity;

/**
 * <pre>
 * Specifies preferences related to a user's profile as a cannabis consumer.
 * </pre>
 *
 * Protobuf type {@code identity.ConsumerPreferences}
 */
public  final class ConsumerPreferences extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.ConsumerPreferences)
    ConsumerPreferencesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsumerPreferences.newBuilder() to construct.
  private ConsumerPreferences(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsumerPreferences() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsumerPreferences(
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
          case 82: {
            io.bloombox.schema.identity.MenuPreferences.Builder subBuilder = null;
            if (menu_ != null) {
              subBuilder = menu_.toBuilder();
            }
            menu_ = input.readMessage(io.bloombox.schema.identity.MenuPreferences.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(menu_);
              menu_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_ConsumerPreferences_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_ConsumerPreferences_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.ConsumerPreferences.class, io.bloombox.schema.identity.ConsumerPreferences.Builder.class);
  }

  public static final int MENU_FIELD_NUMBER = 10;
  private io.bloombox.schema.identity.MenuPreferences menu_;
  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  public boolean hasMenu() {
    return menu_ != null;
  }
  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  public io.bloombox.schema.identity.MenuPreferences getMenu() {
    return menu_ == null ? io.bloombox.schema.identity.MenuPreferences.getDefaultInstance() : menu_;
  }
  /**
   * <pre>
   * Preferred menu sections/product types, and so on.
   * </pre>
   *
   * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
   */
  public io.bloombox.schema.identity.MenuPreferencesOrBuilder getMenuOrBuilder() {
    return getMenu();
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
    if (menu_ != null) {
      output.writeMessage(10, getMenu());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (menu_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getMenu());
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
    if (!(obj instanceof io.bloombox.schema.identity.ConsumerPreferences)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.ConsumerPreferences other = (io.bloombox.schema.identity.ConsumerPreferences) obj;

    boolean result = true;
    result = result && (hasMenu() == other.hasMenu());
    if (hasMenu()) {
      result = result && getMenu()
          .equals(other.getMenu());
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
    if (hasMenu()) {
      hash = (37 * hash) + MENU_FIELD_NUMBER;
      hash = (53 * hash) + getMenu().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ConsumerPreferences parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.identity.ConsumerPreferences prototype) {
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
   * Specifies preferences related to a user's profile as a cannabis consumer.
   * </pre>
   *
   * Protobuf type {@code identity.ConsumerPreferences}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.ConsumerPreferences)
      io.bloombox.schema.identity.ConsumerPreferencesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_ConsumerPreferences_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_ConsumerPreferences_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.ConsumerPreferences.class, io.bloombox.schema.identity.ConsumerPreferences.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.ConsumerPreferences.newBuilder()
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
      if (menuBuilder_ == null) {
        menu_ = null;
      } else {
        menu_ = null;
        menuBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.UserOuterClass.internal_static_identity_ConsumerPreferences_descriptor;
    }

    public io.bloombox.schema.identity.ConsumerPreferences getDefaultInstanceForType() {
      return io.bloombox.schema.identity.ConsumerPreferences.getDefaultInstance();
    }

    public io.bloombox.schema.identity.ConsumerPreferences build() {
      io.bloombox.schema.identity.ConsumerPreferences result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.ConsumerPreferences buildPartial() {
      io.bloombox.schema.identity.ConsumerPreferences result = new io.bloombox.schema.identity.ConsumerPreferences(this);
      if (menuBuilder_ == null) {
        result.menu_ = menu_;
      } else {
        result.menu_ = menuBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.identity.ConsumerPreferences) {
        return mergeFrom((io.bloombox.schema.identity.ConsumerPreferences)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.ConsumerPreferences other) {
      if (other == io.bloombox.schema.identity.ConsumerPreferences.getDefaultInstance()) return this;
      if (other.hasMenu()) {
        mergeMenu(other.getMenu());
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
      io.bloombox.schema.identity.ConsumerPreferences parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.ConsumerPreferences) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.identity.MenuPreferences menu_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.MenuPreferences, io.bloombox.schema.identity.MenuPreferences.Builder, io.bloombox.schema.identity.MenuPreferencesOrBuilder> menuBuilder_;
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public boolean hasMenu() {
      return menuBuilder_ != null || menu_ != null;
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public io.bloombox.schema.identity.MenuPreferences getMenu() {
      if (menuBuilder_ == null) {
        return menu_ == null ? io.bloombox.schema.identity.MenuPreferences.getDefaultInstance() : menu_;
      } else {
        return menuBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public Builder setMenu(io.bloombox.schema.identity.MenuPreferences value) {
      if (menuBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        menu_ = value;
        onChanged();
      } else {
        menuBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public Builder setMenu(
        io.bloombox.schema.identity.MenuPreferences.Builder builderForValue) {
      if (menuBuilder_ == null) {
        menu_ = builderForValue.build();
        onChanged();
      } else {
        menuBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public Builder mergeMenu(io.bloombox.schema.identity.MenuPreferences value) {
      if (menuBuilder_ == null) {
        if (menu_ != null) {
          menu_ =
            io.bloombox.schema.identity.MenuPreferences.newBuilder(menu_).mergeFrom(value).buildPartial();
        } else {
          menu_ = value;
        }
        onChanged();
      } else {
        menuBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public Builder clearMenu() {
      if (menuBuilder_ == null) {
        menu_ = null;
        onChanged();
      } else {
        menu_ = null;
        menuBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public io.bloombox.schema.identity.MenuPreferences.Builder getMenuBuilder() {
      
      onChanged();
      return getMenuFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    public io.bloombox.schema.identity.MenuPreferencesOrBuilder getMenuOrBuilder() {
      if (menuBuilder_ != null) {
        return menuBuilder_.getMessageOrBuilder();
      } else {
        return menu_ == null ?
            io.bloombox.schema.identity.MenuPreferences.getDefaultInstance() : menu_;
      }
    }
    /**
     * <pre>
     * Preferred menu sections/product types, and so on.
     * </pre>
     *
     * <code>.identity.MenuPreferences menu = 10 [(.gen_bq_schema.description) = "Preferred menu sections/product types, and so on."];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.identity.MenuPreferences, io.bloombox.schema.identity.MenuPreferences.Builder, io.bloombox.schema.identity.MenuPreferencesOrBuilder> 
        getMenuFieldBuilder() {
      if (menuBuilder_ == null) {
        menuBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.identity.MenuPreferences, io.bloombox.schema.identity.MenuPreferences.Builder, io.bloombox.schema.identity.MenuPreferencesOrBuilder>(
                getMenu(),
                getParentForChildren(),
                isClean());
        menu_ = null;
      }
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


    // @@protoc_insertion_point(builder_scope:identity.ConsumerPreferences)
  }

  // @@protoc_insertion_point(class_scope:identity.ConsumerPreferences)
  private static final io.bloombox.schema.identity.ConsumerPreferences DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.ConsumerPreferences();
  }

  public static io.bloombox.schema.identity.ConsumerPreferences getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsumerPreferences>
      PARSER = new com.google.protobuf.AbstractParser<ConsumerPreferences>() {
    public ConsumerPreferences parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsumerPreferences(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsumerPreferences> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsumerPreferences> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.ConsumerPreferences getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

