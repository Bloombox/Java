// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: marketing/Campaign.proto

package io.bloombox.schema.marketing;

/**
 * <pre>
 * Specifies the actual content of a marketing campaign ad group.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.marketing.Creative}
 */
public  final class Creative extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.marketing.Creative)
    CreativeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Creative.newBuilder() to construct.
  private Creative(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Creative() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Creative(
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
            io.bloombox.schema.marketing.SMSContent.Builder subBuilder = null;
            if (contentCase_ == 1) {
              subBuilder = ((io.bloombox.schema.marketing.SMSContent) content_).toBuilder();
            }
            content_ =
                input.readMessage(io.bloombox.schema.marketing.SMSContent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.marketing.SMSContent) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 1;
            break;
          }
          case 18: {
            io.bloombox.schema.marketing.EmailContent.Builder subBuilder = null;
            if (contentCase_ == 2) {
              subBuilder = ((io.bloombox.schema.marketing.EmailContent) content_).toBuilder();
            }
            content_ =
                input.readMessage(io.bloombox.schema.marketing.EmailContent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.marketing.EmailContent) content_);
              content_ = subBuilder.buildPartial();
            }
            contentCase_ = 2;
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
    return io.bloombox.schema.marketing.CampaignOuterClass.internal_static_bloombox_schema_marketing_Creative_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.marketing.CampaignOuterClass.internal_static_bloombox_schema_marketing_Creative_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.marketing.Creative.class, io.bloombox.schema.marketing.Creative.Builder.class);
  }

  private int contentCase_ = 0;
  private java.lang.Object content_;
  public enum ContentCase
      implements com.google.protobuf.Internal.EnumLite {
    SMS(1),
    EMAIL(2),
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
        case 1: return SMS;
        case 2: return EMAIL;
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

  public static final int SMS_FIELD_NUMBER = 1;
  /**
   * <pre>
   * SMS-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
   */
  public boolean hasSms() {
    return contentCase_ == 1;
  }
  /**
   * <pre>
   * SMS-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
   */
  public io.bloombox.schema.marketing.SMSContent getSms() {
    if (contentCase_ == 1) {
       return (io.bloombox.schema.marketing.SMSContent) content_;
    }
    return io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
  }
  /**
   * <pre>
   * SMS-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
   */
  public io.bloombox.schema.marketing.SMSContentOrBuilder getSmsOrBuilder() {
    if (contentCase_ == 1) {
       return (io.bloombox.schema.marketing.SMSContent) content_;
    }
    return io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
  }

  public static final int EMAIL_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Email-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
   */
  public boolean hasEmail() {
    return contentCase_ == 2;
  }
  /**
   * <pre>
   * Email-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
   */
  public io.bloombox.schema.marketing.EmailContent getEmail() {
    if (contentCase_ == 2) {
       return (io.bloombox.schema.marketing.EmailContent) content_;
    }
    return io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
  }
  /**
   * <pre>
   * Email-specific content.
   * </pre>
   *
   * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
   */
  public io.bloombox.schema.marketing.EmailContentOrBuilder getEmailOrBuilder() {
    if (contentCase_ == 2) {
       return (io.bloombox.schema.marketing.EmailContent) content_;
    }
    return io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
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
    if (contentCase_ == 1) {
      output.writeMessage(1, (io.bloombox.schema.marketing.SMSContent) content_);
    }
    if (contentCase_ == 2) {
      output.writeMessage(2, (io.bloombox.schema.marketing.EmailContent) content_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contentCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.bloombox.schema.marketing.SMSContent) content_);
    }
    if (contentCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.bloombox.schema.marketing.EmailContent) content_);
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
    if (!(obj instanceof io.bloombox.schema.marketing.Creative)) {
      return super.equals(obj);
    }
    io.bloombox.schema.marketing.Creative other = (io.bloombox.schema.marketing.Creative) obj;

    boolean result = true;
    result = result && getContentCase().equals(
        other.getContentCase());
    if (!result) return false;
    switch (contentCase_) {
      case 1:
        result = result && getSms()
            .equals(other.getSms());
        break;
      case 2:
        result = result && getEmail()
            .equals(other.getEmail());
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
    switch (contentCase_) {
      case 1:
        hash = (37 * hash) + SMS_FIELD_NUMBER;
        hash = (53 * hash) + getSms().hashCode();
        break;
      case 2:
        hash = (37 * hash) + EMAIL_FIELD_NUMBER;
        hash = (53 * hash) + getEmail().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.marketing.Creative parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.marketing.Creative parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.marketing.Creative parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.marketing.Creative parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.marketing.Creative prototype) {
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
   * Specifies the actual content of a marketing campaign ad group.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.marketing.Creative}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.marketing.Creative)
      io.bloombox.schema.marketing.CreativeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.marketing.CampaignOuterClass.internal_static_bloombox_schema_marketing_Creative_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.marketing.CampaignOuterClass.internal_static_bloombox_schema_marketing_Creative_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.marketing.Creative.class, io.bloombox.schema.marketing.Creative.Builder.class);
    }

    // Construct using io.bloombox.schema.marketing.Creative.newBuilder()
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
      contentCase_ = 0;
      content_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.marketing.CampaignOuterClass.internal_static_bloombox_schema_marketing_Creative_descriptor;
    }

    public io.bloombox.schema.marketing.Creative getDefaultInstanceForType() {
      return io.bloombox.schema.marketing.Creative.getDefaultInstance();
    }

    public io.bloombox.schema.marketing.Creative build() {
      io.bloombox.schema.marketing.Creative result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.marketing.Creative buildPartial() {
      io.bloombox.schema.marketing.Creative result = new io.bloombox.schema.marketing.Creative(this);
      if (contentCase_ == 1) {
        if (smsBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = smsBuilder_.build();
        }
      }
      if (contentCase_ == 2) {
        if (emailBuilder_ == null) {
          result.content_ = content_;
        } else {
          result.content_ = emailBuilder_.build();
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
      if (other instanceof io.bloombox.schema.marketing.Creative) {
        return mergeFrom((io.bloombox.schema.marketing.Creative)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.marketing.Creative other) {
      if (other == io.bloombox.schema.marketing.Creative.getDefaultInstance()) return this;
      switch (other.getContentCase()) {
        case SMS: {
          mergeSms(other.getSms());
          break;
        }
        case EMAIL: {
          mergeEmail(other.getEmail());
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
      io.bloombox.schema.marketing.Creative parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.marketing.Creative) e.getUnfinishedMessage();
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


    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.marketing.SMSContent, io.bloombox.schema.marketing.SMSContent.Builder, io.bloombox.schema.marketing.SMSContentOrBuilder> smsBuilder_;
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public boolean hasSms() {
      return contentCase_ == 1;
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public io.bloombox.schema.marketing.SMSContent getSms() {
      if (smsBuilder_ == null) {
        if (contentCase_ == 1) {
          return (io.bloombox.schema.marketing.SMSContent) content_;
        }
        return io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
      } else {
        if (contentCase_ == 1) {
          return smsBuilder_.getMessage();
        }
        return io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public Builder setSms(io.bloombox.schema.marketing.SMSContent value) {
      if (smsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        smsBuilder_.setMessage(value);
      }
      contentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public Builder setSms(
        io.bloombox.schema.marketing.SMSContent.Builder builderForValue) {
      if (smsBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        smsBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public Builder mergeSms(io.bloombox.schema.marketing.SMSContent value) {
      if (smsBuilder_ == null) {
        if (contentCase_ == 1 &&
            content_ != io.bloombox.schema.marketing.SMSContent.getDefaultInstance()) {
          content_ = io.bloombox.schema.marketing.SMSContent.newBuilder((io.bloombox.schema.marketing.SMSContent) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 1) {
          smsBuilder_.mergeFrom(value);
        }
        smsBuilder_.setMessage(value);
      }
      contentCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public Builder clearSms() {
      if (smsBuilder_ == null) {
        if (contentCase_ == 1) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 1) {
          contentCase_ = 0;
          content_ = null;
        }
        smsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public io.bloombox.schema.marketing.SMSContent.Builder getSmsBuilder() {
      return getSmsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    public io.bloombox.schema.marketing.SMSContentOrBuilder getSmsOrBuilder() {
      if ((contentCase_ == 1) && (smsBuilder_ != null)) {
        return smsBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 1) {
          return (io.bloombox.schema.marketing.SMSContent) content_;
        }
        return io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * SMS-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.SMSContent sms = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.marketing.SMSContent, io.bloombox.schema.marketing.SMSContent.Builder, io.bloombox.schema.marketing.SMSContentOrBuilder> 
        getSmsFieldBuilder() {
      if (smsBuilder_ == null) {
        if (!(contentCase_ == 1)) {
          content_ = io.bloombox.schema.marketing.SMSContent.getDefaultInstance();
        }
        smsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.marketing.SMSContent, io.bloombox.schema.marketing.SMSContent.Builder, io.bloombox.schema.marketing.SMSContentOrBuilder>(
                (io.bloombox.schema.marketing.SMSContent) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 1;
      onChanged();;
      return smsBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.marketing.EmailContent, io.bloombox.schema.marketing.EmailContent.Builder, io.bloombox.schema.marketing.EmailContentOrBuilder> emailBuilder_;
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public boolean hasEmail() {
      return contentCase_ == 2;
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public io.bloombox.schema.marketing.EmailContent getEmail() {
      if (emailBuilder_ == null) {
        if (contentCase_ == 2) {
          return (io.bloombox.schema.marketing.EmailContent) content_;
        }
        return io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
      } else {
        if (contentCase_ == 2) {
          return emailBuilder_.getMessage();
        }
        return io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public Builder setEmail(io.bloombox.schema.marketing.EmailContent value) {
      if (emailBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        emailBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public Builder setEmail(
        io.bloombox.schema.marketing.EmailContent.Builder builderForValue) {
      if (emailBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        emailBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public Builder mergeEmail(io.bloombox.schema.marketing.EmailContent value) {
      if (emailBuilder_ == null) {
        if (contentCase_ == 2 &&
            content_ != io.bloombox.schema.marketing.EmailContent.getDefaultInstance()) {
          content_ = io.bloombox.schema.marketing.EmailContent.newBuilder((io.bloombox.schema.marketing.EmailContent) content_)
              .mergeFrom(value).buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 2) {
          emailBuilder_.mergeFrom(value);
        }
        emailBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public Builder clearEmail() {
      if (emailBuilder_ == null) {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
        }
        emailBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public io.bloombox.schema.marketing.EmailContent.Builder getEmailBuilder() {
      return getEmailFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    public io.bloombox.schema.marketing.EmailContentOrBuilder getEmailOrBuilder() {
      if ((contentCase_ == 2) && (emailBuilder_ != null)) {
        return emailBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 2) {
          return (io.bloombox.schema.marketing.EmailContent) content_;
        }
        return io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Email-specific content.
     * </pre>
     *
     * <code>.bloombox.schema.marketing.EmailContent email = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.marketing.EmailContent, io.bloombox.schema.marketing.EmailContent.Builder, io.bloombox.schema.marketing.EmailContentOrBuilder> 
        getEmailFieldBuilder() {
      if (emailBuilder_ == null) {
        if (!(contentCase_ == 2)) {
          content_ = io.bloombox.schema.marketing.EmailContent.getDefaultInstance();
        }
        emailBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.marketing.EmailContent, io.bloombox.schema.marketing.EmailContent.Builder, io.bloombox.schema.marketing.EmailContentOrBuilder>(
                (io.bloombox.schema.marketing.EmailContent) content_,
                getParentForChildren(),
                isClean());
        content_ = null;
      }
      contentCase_ = 2;
      onChanged();;
      return emailBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.marketing.Creative)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.marketing.Creative)
  private static final io.bloombox.schema.marketing.Creative DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.marketing.Creative();
  }

  public static io.bloombox.schema.marketing.Creative getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Creative>
      PARSER = new com.google.protobuf.AbstractParser<Creative>() {
    public Creative parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Creative(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Creative> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Creative> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.marketing.Creative getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

