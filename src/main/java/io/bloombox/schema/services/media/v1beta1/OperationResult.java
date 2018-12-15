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
// source: media/v1beta1/MediaService_Beta1.proto

package io.bloombox.schema.services.media.v1beta1;

/**
 * <pre>
 * Media operation result, when data/operations are performed inline with a request and do not require followup.
 * </pre>
 *
 * Protobuf type {@code bloombox.services.media.v1beta1.OperationResult}
 */
public  final class OperationResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.services.media.v1beta1.OperationResult)
    OperationResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OperationResult.newBuilder() to construct.
  private OperationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OperationResult() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OperationResult(
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
            io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(io.opencannabis.schema.media.AttachedMedia.MediaItem.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
            }

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
    return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_services_media_v1beta1_OperationResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_services_media_v1beta1_OperationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.media.v1beta1.OperationResult.class, io.bloombox.schema.services.media.v1beta1.OperationResult.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private io.opencannabis.schema.media.AttachedMedia.MediaItem item_;
  /**
   * <pre>
   * URI to access this item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem item = 1;</code>
   */
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <pre>
   * URI to access this item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem item = 1;</code>
   */
  public io.opencannabis.schema.media.AttachedMedia.MediaItem getItem() {
    return item_ == null ? io.opencannabis.schema.media.AttachedMedia.MediaItem.getDefaultInstance() : item_;
  }
  /**
   * <pre>
   * URI to access this item.
   * </pre>
   *
   * <code>.opencannabis.media.MediaItem item = 1;</code>
   */
  public io.opencannabis.schema.media.AttachedMedia.MediaItemOrBuilder getItemOrBuilder() {
    return getItem();
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
    if (item_ != null) {
      output.writeMessage(1, getItem());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItem());
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
    if (!(obj instanceof io.bloombox.schema.services.media.v1beta1.OperationResult)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.media.v1beta1.OperationResult other = (io.bloombox.schema.services.media.v1beta1.OperationResult) obj;

    boolean result = true;
    result = result && (hasItem() == other.hasItem());
    if (hasItem()) {
      result = result && getItem()
          .equals(other.getItem());
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.media.v1beta1.OperationResult parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.media.v1beta1.OperationResult prototype) {
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
   * Media operation result, when data/operations are performed inline with a request and do not require followup.
   * </pre>
   *
   * Protobuf type {@code bloombox.services.media.v1beta1.OperationResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.services.media.v1beta1.OperationResult)
      io.bloombox.schema.services.media.v1beta1.OperationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_services_media_v1beta1_OperationResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_services_media_v1beta1_OperationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.media.v1beta1.OperationResult.class, io.bloombox.schema.services.media.v1beta1.OperationResult.Builder.class);
    }

    // Construct using io.bloombox.schema.services.media.v1beta1.OperationResult.newBuilder()
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
      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.internal_static_bloombox_services_media_v1beta1_OperationResult_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.services.media.v1beta1.OperationResult getDefaultInstanceForType() {
      return io.bloombox.schema.services.media.v1beta1.OperationResult.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.services.media.v1beta1.OperationResult build() {
      io.bloombox.schema.services.media.v1beta1.OperationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.services.media.v1beta1.OperationResult buildPartial() {
      io.bloombox.schema.services.media.v1beta1.OperationResult result = new io.bloombox.schema.services.media.v1beta1.OperationResult(this);
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.services.media.v1beta1.OperationResult) {
        return mergeFrom((io.bloombox.schema.services.media.v1beta1.OperationResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.media.v1beta1.OperationResult other) {
      if (other == io.bloombox.schema.services.media.v1beta1.OperationResult.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
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
      io.bloombox.schema.services.media.v1beta1.OperationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.media.v1beta1.OperationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.media.AttachedMedia.MediaItem item_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.AttachedMedia.MediaItem, io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder, io.opencannabis.schema.media.AttachedMedia.MediaItemOrBuilder> itemBuilder_;
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public io.opencannabis.schema.media.AttachedMedia.MediaItem getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? io.opencannabis.schema.media.AttachedMedia.MediaItem.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public Builder setItem(io.opencannabis.schema.media.AttachedMedia.MediaItem value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public Builder setItem(
        io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public Builder mergeItem(io.opencannabis.schema.media.AttachedMedia.MediaItem value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            io.opencannabis.schema.media.AttachedMedia.MediaItem.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    public io.opencannabis.schema.media.AttachedMedia.MediaItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            io.opencannabis.schema.media.AttachedMedia.MediaItem.getDefaultInstance() : item_;
      }
    }
    /**
     * <pre>
     * URI to access this item.
     * </pre>
     *
     * <code>.opencannabis.media.MediaItem item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.media.AttachedMedia.MediaItem, io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder, io.opencannabis.schema.media.AttachedMedia.MediaItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.media.AttachedMedia.MediaItem, io.opencannabis.schema.media.AttachedMedia.MediaItem.Builder, io.opencannabis.schema.media.AttachedMedia.MediaItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bloombox.services.media.v1beta1.OperationResult)
  }

  // @@protoc_insertion_point(class_scope:bloombox.services.media.v1beta1.OperationResult)
  private static final io.bloombox.schema.services.media.v1beta1.OperationResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.media.v1beta1.OperationResult();
  }

  public static io.bloombox.schema.services.media.v1beta1.OperationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OperationResult>
      PARSER = new com.google.protobuf.AbstractParser<OperationResult>() {
    @java.lang.Override
    public OperationResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OperationResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OperationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OperationResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.services.media.v1beta1.OperationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

