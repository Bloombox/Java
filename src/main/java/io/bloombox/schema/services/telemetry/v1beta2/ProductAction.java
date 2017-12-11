// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: telemetry/v1beta2/commerce/ProductEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

/**
 * <pre>
 * Specifies product 'action' request and response operations, wherein an end-user has affirmatively elected to take
 * some conversion-style action related to a particular product, such as purchasing, sharing, or reviewing it, etc.
 * </pre>
 *
 * Protobuf type {@code services.telemetry.v1beta2.ProductAction}
 */
public  final class ProductAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.telemetry.v1beta2.ProductAction)
    ProductActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductAction.newBuilder() to construct.
  private ProductAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductAction() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductAction(
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
          case 10: {
            io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder subBuilder = null;
            if (context_ != null) {
              subBuilder = context_.toBuilder();
            }
            context_ = input.readMessage(io.bloombox.schema.telemetry.AnalyticsContext.Context.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(context_);
              context_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder subBuilder = null;
            if (action_ != null) {
              subBuilder = action_.toBuilder();
            }
            action_ = input.readMessage(io.bloombox.schema.analytics.product.ProductAnalytics.Action.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(action_);
              action_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.internal_static_services_telemetry_v1beta2_ProductAction_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.internal_static_services_telemetry_v1beta2_ProductAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.telemetry.v1beta2.ProductAction.class, io.bloombox.schema.services.telemetry.v1beta2.ProductAction.Builder.class);
  }

  public static final int CONTEXT_FIELD_NUMBER = 1;
  private io.bloombox.schema.telemetry.AnalyticsContext.Context context_;
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public boolean hasContext() {
    return context_ != null;
  }
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public io.bloombox.schema.telemetry.AnalyticsContext.Context getContext() {
    return context_ == null ? io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
  }
  /**
   * <pre>
   * Event context.
   * </pre>
   *
   * <code>.analytics.Context context = 1;</code>
   */
  public io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder() {
    return getContext();
  }

  public static final int ACTION_FIELD_NUMBER = 2;
  private io.bloombox.schema.analytics.product.ProductAnalytics.Action action_;
  /**
   * <pre>
   * Product action data to record.
   * </pre>
   *
   * <code>.analytics.product.Action action = 2;</code>
   */
  public boolean hasAction() {
    return action_ != null;
  }
  /**
   * <pre>
   * Product action data to record.
   * </pre>
   *
   * <code>.analytics.product.Action action = 2;</code>
   */
  public io.bloombox.schema.analytics.product.ProductAnalytics.Action getAction() {
    return action_ == null ? io.bloombox.schema.analytics.product.ProductAnalytics.Action.getDefaultInstance() : action_;
  }
  /**
   * <pre>
   * Product action data to record.
   * </pre>
   *
   * <code>.analytics.product.Action action = 2;</code>
   */
  public io.bloombox.schema.analytics.product.ProductAnalytics.ActionOrBuilder getActionOrBuilder() {
    return getAction();
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
    if (context_ != null) {
      output.writeMessage(1, getContext());
    }
    if (action_ != null) {
      output.writeMessage(2, getAction());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (context_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getContext());
    }
    if (action_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAction());
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
    if (!(obj instanceof io.bloombox.schema.services.telemetry.v1beta2.ProductAction)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.telemetry.v1beta2.ProductAction other = (io.bloombox.schema.services.telemetry.v1beta2.ProductAction) obj;

    boolean result = true;
    result = result && (hasContext() == other.hasContext());
    if (hasContext()) {
      result = result && getContext()
          .equals(other.getContext());
    }
    result = result && (hasAction() == other.hasAction());
    if (hasAction()) {
      result = result && getAction()
          .equals(other.getAction());
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
    if (hasContext()) {
      hash = (37 * hash) + CONTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getContext().hashCode();
    }
    if (hasAction()) {
      hash = (37 * hash) + ACTION_FIELD_NUMBER;
      hash = (53 * hash) + getAction().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.telemetry.v1beta2.ProductAction prototype) {
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
   * Specifies product 'action' request and response operations, wherein an end-user has affirmatively elected to take
   * some conversion-style action related to a particular product, such as purchasing, sharing, or reviewing it, etc.
   * </pre>
   *
   * Protobuf type {@code services.telemetry.v1beta2.ProductAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.telemetry.v1beta2.ProductAction)
      io.bloombox.schema.services.telemetry.v1beta2.ProductActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.internal_static_services_telemetry_v1beta2_ProductAction_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.internal_static_services_telemetry_v1beta2_ProductAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.telemetry.v1beta2.ProductAction.class, io.bloombox.schema.services.telemetry.v1beta2.ProductAction.Builder.class);
    }

    // Construct using io.bloombox.schema.services.telemetry.v1beta2.ProductAction.newBuilder()
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
      if (contextBuilder_ == null) {
        context_ = null;
      } else {
        context_ = null;
        contextBuilder_ = null;
      }
      if (actionBuilder_ == null) {
        action_ = null;
      } else {
        action_ = null;
        actionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ProductEventsBeta2.internal_static_services_telemetry_v1beta2_ProductAction_descriptor;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ProductAction getDefaultInstanceForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ProductAction.getDefaultInstance();
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ProductAction build() {
      io.bloombox.schema.services.telemetry.v1beta2.ProductAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ProductAction buildPartial() {
      io.bloombox.schema.services.telemetry.v1beta2.ProductAction result = new io.bloombox.schema.services.telemetry.v1beta2.ProductAction(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      if (actionBuilder_ == null) {
        result.action_ = action_;
      } else {
        result.action_ = actionBuilder_.build();
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
      if (other instanceof io.bloombox.schema.services.telemetry.v1beta2.ProductAction) {
        return mergeFrom((io.bloombox.schema.services.telemetry.v1beta2.ProductAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.telemetry.v1beta2.ProductAction other) {
      if (other == io.bloombox.schema.services.telemetry.v1beta2.ProductAction.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasAction()) {
        mergeAction(other.getAction());
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
      io.bloombox.schema.services.telemetry.v1beta2.ProductAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.telemetry.v1beta2.ProductAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.bloombox.schema.telemetry.AnalyticsContext.Context context_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder> contextBuilder_;
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public boolean hasContext() {
      return contextBuilder_ != null || context_ != null;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.Context getContext() {
      if (contextBuilder_ == null) {
        return context_ == null ? io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
      } else {
        return contextBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder setContext(io.bloombox.schema.telemetry.AnalyticsContext.Context value) {
      if (contextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        context_ = value;
        onChanged();
      } else {
        contextBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder setContext(
        io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder builderForValue) {
      if (contextBuilder_ == null) {
        context_ = builderForValue.build();
        onChanged();
      } else {
        contextBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder mergeContext(io.bloombox.schema.telemetry.AnalyticsContext.Context value) {
      if (contextBuilder_ == null) {
        if (context_ != null) {
          context_ =
            io.bloombox.schema.telemetry.AnalyticsContext.Context.newBuilder(context_).mergeFrom(value).buildPartial();
        } else {
          context_ = value;
        }
        onChanged();
      } else {
        contextBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public Builder clearContext() {
      if (contextBuilder_ == null) {
        context_ = null;
        onChanged();
      } else {
        context_ = null;
        contextBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder getContextBuilder() {
      
      onChanged();
      return getContextFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    public io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder getContextOrBuilder() {
      if (contextBuilder_ != null) {
        return contextBuilder_.getMessageOrBuilder();
      } else {
        return context_ == null ?
            io.bloombox.schema.telemetry.AnalyticsContext.Context.getDefaultInstance() : context_;
      }
    }
    /**
     * <pre>
     * Event context.
     * </pre>
     *
     * <code>.analytics.Context context = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder> 
        getContextFieldBuilder() {
      if (contextBuilder_ == null) {
        contextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.telemetry.AnalyticsContext.Context, io.bloombox.schema.telemetry.AnalyticsContext.Context.Builder, io.bloombox.schema.telemetry.AnalyticsContext.ContextOrBuilder>(
                getContext(),
                getParentForChildren(),
                isClean());
        context_ = null;
      }
      return contextBuilder_;
    }

    private io.bloombox.schema.analytics.product.ProductAnalytics.Action action_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.product.ProductAnalytics.Action, io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder, io.bloombox.schema.analytics.product.ProductAnalytics.ActionOrBuilder> actionBuilder_;
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public boolean hasAction() {
      return actionBuilder_ != null || action_ != null;
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public io.bloombox.schema.analytics.product.ProductAnalytics.Action getAction() {
      if (actionBuilder_ == null) {
        return action_ == null ? io.bloombox.schema.analytics.product.ProductAnalytics.Action.getDefaultInstance() : action_;
      } else {
        return actionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public Builder setAction(io.bloombox.schema.analytics.product.ProductAnalytics.Action value) {
      if (actionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        action_ = value;
        onChanged();
      } else {
        actionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public Builder setAction(
        io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder builderForValue) {
      if (actionBuilder_ == null) {
        action_ = builderForValue.build();
        onChanged();
      } else {
        actionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public Builder mergeAction(io.bloombox.schema.analytics.product.ProductAnalytics.Action value) {
      if (actionBuilder_ == null) {
        if (action_ != null) {
          action_ =
            io.bloombox.schema.analytics.product.ProductAnalytics.Action.newBuilder(action_).mergeFrom(value).buildPartial();
        } else {
          action_ = value;
        }
        onChanged();
      } else {
        actionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public Builder clearAction() {
      if (actionBuilder_ == null) {
        action_ = null;
        onChanged();
      } else {
        action_ = null;
        actionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder getActionBuilder() {
      
      onChanged();
      return getActionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    public io.bloombox.schema.analytics.product.ProductAnalytics.ActionOrBuilder getActionOrBuilder() {
      if (actionBuilder_ != null) {
        return actionBuilder_.getMessageOrBuilder();
      } else {
        return action_ == null ?
            io.bloombox.schema.analytics.product.ProductAnalytics.Action.getDefaultInstance() : action_;
      }
    }
    /**
     * <pre>
     * Product action data to record.
     * </pre>
     *
     * <code>.analytics.product.Action action = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.product.ProductAnalytics.Action, io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder, io.bloombox.schema.analytics.product.ProductAnalytics.ActionOrBuilder> 
        getActionFieldBuilder() {
      if (actionBuilder_ == null) {
        actionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.analytics.product.ProductAnalytics.Action, io.bloombox.schema.analytics.product.ProductAnalytics.Action.Builder, io.bloombox.schema.analytics.product.ProductAnalytics.ActionOrBuilder>(
                getAction(),
                getParentForChildren(),
                isClean());
        action_ = null;
      }
      return actionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.telemetry.v1beta2.ProductAction)
  }

  // @@protoc_insertion_point(class_scope:services.telemetry.v1beta2.ProductAction)
  private static final io.bloombox.schema.services.telemetry.v1beta2.ProductAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.telemetry.v1beta2.ProductAction();
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ProductAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductAction>
      PARSER = new com.google.protobuf.AbstractParser<ProductAction>() {
    public ProductAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProductAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductAction> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.telemetry.v1beta2.ProductAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

