/*
 * Copyright 2018, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual
 * property of Bloombox, a California Limited Liability Corporation. Use of this
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
// source: telemetry/v1beta2/commerce/ShopEvents_Beta2.proto

package io.bloombox.schema.services.telemetry.v1beta2;

/**
 * <pre>
 * Specifies a view event for a physical or digital storefront or shop. For brick-and-mortar locations, this would be
 * entering the premises. For a digital storefront, these are pageviews.
 * </pre>
 *
 * Protobuf type {@code services.telemetry.v1beta2.ShopView}
 */
public  final class ShopView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.telemetry.v1beta2.ShopView)
    ShopViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ShopView.newBuilder() to construct.
  private ShopView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ShopView() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ShopView(
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
            io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder subBuilder = null;
            if (view_ != null) {
              subBuilder = view_.toBuilder();
            }
            view_ = input.readMessage(io.bloombox.schema.analytics.shop.ShopAnalytics.View.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(view_);
              view_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopView_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.telemetry.v1beta2.ShopView.class, io.bloombox.schema.services.telemetry.v1beta2.ShopView.Builder.class);
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

  public static final int VIEW_FIELD_NUMBER = 2;
  private io.bloombox.schema.analytics.shop.ShopAnalytics.View view_;
  /**
   * <pre>
   * Shop view data to submit.
   * </pre>
   *
   * <code>.analytics.shop.View view = 2;</code>
   */
  public boolean hasView() {
    return view_ != null;
  }
  /**
   * <pre>
   * Shop view data to submit.
   * </pre>
   *
   * <code>.analytics.shop.View view = 2;</code>
   */
  public io.bloombox.schema.analytics.shop.ShopAnalytics.View getView() {
    return view_ == null ? io.bloombox.schema.analytics.shop.ShopAnalytics.View.getDefaultInstance() : view_;
  }
  /**
   * <pre>
   * Shop view data to submit.
   * </pre>
   *
   * <code>.analytics.shop.View view = 2;</code>
   */
  public io.bloombox.schema.analytics.shop.ShopAnalytics.ViewOrBuilder getViewOrBuilder() {
    return getView();
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
    if (view_ != null) {
      output.writeMessage(2, getView());
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
    if (view_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getView());
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
    if (!(obj instanceof io.bloombox.schema.services.telemetry.v1beta2.ShopView)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.telemetry.v1beta2.ShopView other = (io.bloombox.schema.services.telemetry.v1beta2.ShopView) obj;

    boolean result = true;
    result = result && (hasContext() == other.hasContext());
    if (hasContext()) {
      result = result && getContext()
          .equals(other.getContext());
    }
    result = result && (hasView() == other.hasView());
    if (hasView()) {
      result = result && getView()
          .equals(other.getView());
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
    if (hasView()) {
      hash = (37 * hash) + VIEW_FIELD_NUMBER;
      hash = (53 * hash) + getView().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.telemetry.v1beta2.ShopView prototype) {
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
   * Specifies a view event for a physical or digital storefront or shop. For brick-and-mortar locations, this would be
   * entering the premises. For a digital storefront, these are pageviews.
   * </pre>
   *
   * Protobuf type {@code services.telemetry.v1beta2.ShopView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.telemetry.v1beta2.ShopView)
      io.bloombox.schema.services.telemetry.v1beta2.ShopViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopView_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.telemetry.v1beta2.ShopView.class, io.bloombox.schema.services.telemetry.v1beta2.ShopView.Builder.class);
    }

    // Construct using io.bloombox.schema.services.telemetry.v1beta2.ShopView.newBuilder()
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
      if (viewBuilder_ == null) {
        view_ = null;
      } else {
        view_ = null;
        viewBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopEventsBeta2.internal_static_services_telemetry_v1beta2_ShopView_descriptor;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopView getDefaultInstanceForType() {
      return io.bloombox.schema.services.telemetry.v1beta2.ShopView.getDefaultInstance();
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopView build() {
      io.bloombox.schema.services.telemetry.v1beta2.ShopView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.telemetry.v1beta2.ShopView buildPartial() {
      io.bloombox.schema.services.telemetry.v1beta2.ShopView result = new io.bloombox.schema.services.telemetry.v1beta2.ShopView(this);
      if (contextBuilder_ == null) {
        result.context_ = context_;
      } else {
        result.context_ = contextBuilder_.build();
      }
      if (viewBuilder_ == null) {
        result.view_ = view_;
      } else {
        result.view_ = viewBuilder_.build();
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
      if (other instanceof io.bloombox.schema.services.telemetry.v1beta2.ShopView) {
        return mergeFrom((io.bloombox.schema.services.telemetry.v1beta2.ShopView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.telemetry.v1beta2.ShopView other) {
      if (other == io.bloombox.schema.services.telemetry.v1beta2.ShopView.getDefaultInstance()) return this;
      if (other.hasContext()) {
        mergeContext(other.getContext());
      }
      if (other.hasView()) {
        mergeView(other.getView());
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
      io.bloombox.schema.services.telemetry.v1beta2.ShopView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.telemetry.v1beta2.ShopView) e.getUnfinishedMessage();
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

    private io.bloombox.schema.analytics.shop.ShopAnalytics.View view_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.shop.ShopAnalytics.View, io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ViewOrBuilder> viewBuilder_;
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public boolean hasView() {
      return viewBuilder_ != null || view_ != null;
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.View getView() {
      if (viewBuilder_ == null) {
        return view_ == null ? io.bloombox.schema.analytics.shop.ShopAnalytics.View.getDefaultInstance() : view_;
      } else {
        return viewBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public Builder setView(io.bloombox.schema.analytics.shop.ShopAnalytics.View value) {
      if (viewBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        view_ = value;
        onChanged();
      } else {
        viewBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public Builder setView(
        io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder builderForValue) {
      if (viewBuilder_ == null) {
        view_ = builderForValue.build();
        onChanged();
      } else {
        viewBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public Builder mergeView(io.bloombox.schema.analytics.shop.ShopAnalytics.View value) {
      if (viewBuilder_ == null) {
        if (view_ != null) {
          view_ =
            io.bloombox.schema.analytics.shop.ShopAnalytics.View.newBuilder(view_).mergeFrom(value).buildPartial();
        } else {
          view_ = value;
        }
        onChanged();
      } else {
        viewBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public Builder clearView() {
      if (viewBuilder_ == null) {
        view_ = null;
        onChanged();
      } else {
        view_ = null;
        viewBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder getViewBuilder() {
      
      onChanged();
      return getViewFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    public io.bloombox.schema.analytics.shop.ShopAnalytics.ViewOrBuilder getViewOrBuilder() {
      if (viewBuilder_ != null) {
        return viewBuilder_.getMessageOrBuilder();
      } else {
        return view_ == null ?
            io.bloombox.schema.analytics.shop.ShopAnalytics.View.getDefaultInstance() : view_;
      }
    }
    /**
     * <pre>
     * Shop view data to submit.
     * </pre>
     *
     * <code>.analytics.shop.View view = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.analytics.shop.ShopAnalytics.View, io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ViewOrBuilder> 
        getViewFieldBuilder() {
      if (viewBuilder_ == null) {
        viewBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.analytics.shop.ShopAnalytics.View, io.bloombox.schema.analytics.shop.ShopAnalytics.View.Builder, io.bloombox.schema.analytics.shop.ShopAnalytics.ViewOrBuilder>(
                getView(),
                getParentForChildren(),
                isClean());
        view_ = null;
      }
      return viewBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.telemetry.v1beta2.ShopView)
  }

  // @@protoc_insertion_point(class_scope:services.telemetry.v1beta2.ShopView)
  private static final io.bloombox.schema.services.telemetry.v1beta2.ShopView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.telemetry.v1beta2.ShopView();
  }

  public static io.bloombox.schema.services.telemetry.v1beta2.ShopView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ShopView>
      PARSER = new com.google.protobuf.AbstractParser<ShopView>() {
    public ShopView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ShopView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ShopView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ShopView> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.telemetry.v1beta2.ShopView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

