/*
 * Copyright 2018, Bloombox, LLC.
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
// source: oauth/Client.proto

package io.opencannabis.schema.oauth;

/**
 * <pre>
 * Specifies a ticket responding to a consent flow.
 * </pre>
 *
 * Protobuf type {@code opencannabis.oauth.ConsentTicket}
 */
public  final class ConsentTicket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.oauth.ConsentTicket)
    ConsentTicketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsentTicket.newBuilder() to construct.
  private ConsentTicket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsentTicket() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsentTicket(
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
            io.opencannabis.schema.oauth.Client.Builder subBuilder = null;
            if (client_ != null) {
              subBuilder = client_.toBuilder();
            }
            client_ = input.readMessage(io.opencannabis.schema.oauth.Client.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(client_);
              client_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.opencannabis.schema.oauth.Consent.Builder subBuilder = null;
            if (consent_ != null) {
              subBuilder = consent_.toBuilder();
            }
            consent_ = input.readMessage(io.opencannabis.schema.oauth.Consent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(consent_);
              consent_ = subBuilder.buildPartial();
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
    return io.opencannabis.schema.oauth.OAuthClient.internal_static_opencannabis_oauth_ConsentTicket_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.oauth.OAuthClient.internal_static_opencannabis_oauth_ConsentTicket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.oauth.ConsentTicket.class, io.opencannabis.schema.oauth.ConsentTicket.Builder.class);
  }

  public static final int CLIENT_FIELD_NUMBER = 1;
  private io.opencannabis.schema.oauth.Client client_;
  /**
   * <pre>
   * Specifies client information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Client client = 1;</code>
   */
  public boolean hasClient() {
    return client_ != null;
  }
  /**
   * <pre>
   * Specifies client information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Client client = 1;</code>
   */
  public io.opencannabis.schema.oauth.Client getClient() {
    return client_ == null ? io.opencannabis.schema.oauth.Client.getDefaultInstance() : client_;
  }
  /**
   * <pre>
   * Specifies client information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Client client = 1;</code>
   */
  public io.opencannabis.schema.oauth.ClientOrBuilder getClientOrBuilder() {
    return getClient();
  }

  public static final int CONSENT_FIELD_NUMBER = 2;
  private io.opencannabis.schema.oauth.Consent consent_;
  /**
   * <pre>
   * Specifies consent information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Consent consent = 2;</code>
   */
  public boolean hasConsent() {
    return consent_ != null;
  }
  /**
   * <pre>
   * Specifies consent information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Consent consent = 2;</code>
   */
  public io.opencannabis.schema.oauth.Consent getConsent() {
    return consent_ == null ? io.opencannabis.schema.oauth.Consent.getDefaultInstance() : consent_;
  }
  /**
   * <pre>
   * Specifies consent information for this flow.
   * </pre>
   *
   * <code>.opencannabis.oauth.Consent consent = 2;</code>
   */
  public io.opencannabis.schema.oauth.ConsentOrBuilder getConsentOrBuilder() {
    return getConsent();
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
    if (client_ != null) {
      output.writeMessage(1, getClient());
    }
    if (consent_ != null) {
      output.writeMessage(2, getConsent());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (client_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClient());
    }
    if (consent_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConsent());
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
    if (!(obj instanceof io.opencannabis.schema.oauth.ConsentTicket)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.oauth.ConsentTicket other = (io.opencannabis.schema.oauth.ConsentTicket) obj;

    boolean result = true;
    result = result && (hasClient() == other.hasClient());
    if (hasClient()) {
      result = result && getClient()
          .equals(other.getClient());
    }
    result = result && (hasConsent() == other.hasConsent());
    if (hasConsent()) {
      result = result && getConsent()
          .equals(other.getConsent());
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
    if (hasClient()) {
      hash = (37 * hash) + CLIENT_FIELD_NUMBER;
      hash = (53 * hash) + getClient().hashCode();
    }
    if (hasConsent()) {
      hash = (37 * hash) + CONSENT_FIELD_NUMBER;
      hash = (53 * hash) + getConsent().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.oauth.ConsentTicket parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.oauth.ConsentTicket prototype) {
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
   * Specifies a ticket responding to a consent flow.
   * </pre>
   *
   * Protobuf type {@code opencannabis.oauth.ConsentTicket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.oauth.ConsentTicket)
      io.opencannabis.schema.oauth.ConsentTicketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.oauth.OAuthClient.internal_static_opencannabis_oauth_ConsentTicket_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.oauth.OAuthClient.internal_static_opencannabis_oauth_ConsentTicket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.oauth.ConsentTicket.class, io.opencannabis.schema.oauth.ConsentTicket.Builder.class);
    }

    // Construct using io.opencannabis.schema.oauth.ConsentTicket.newBuilder()
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
      if (clientBuilder_ == null) {
        client_ = null;
      } else {
        client_ = null;
        clientBuilder_ = null;
      }
      if (consentBuilder_ == null) {
        consent_ = null;
      } else {
        consent_ = null;
        consentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.oauth.OAuthClient.internal_static_opencannabis_oauth_ConsentTicket_descriptor;
    }

    public io.opencannabis.schema.oauth.ConsentTicket getDefaultInstanceForType() {
      return io.opencannabis.schema.oauth.ConsentTicket.getDefaultInstance();
    }

    public io.opencannabis.schema.oauth.ConsentTicket build() {
      io.opencannabis.schema.oauth.ConsentTicket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.oauth.ConsentTicket buildPartial() {
      io.opencannabis.schema.oauth.ConsentTicket result = new io.opencannabis.schema.oauth.ConsentTicket(this);
      if (clientBuilder_ == null) {
        result.client_ = client_;
      } else {
        result.client_ = clientBuilder_.build();
      }
      if (consentBuilder_ == null) {
        result.consent_ = consent_;
      } else {
        result.consent_ = consentBuilder_.build();
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
      if (other instanceof io.opencannabis.schema.oauth.ConsentTicket) {
        return mergeFrom((io.opencannabis.schema.oauth.ConsentTicket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.oauth.ConsentTicket other) {
      if (other == io.opencannabis.schema.oauth.ConsentTicket.getDefaultInstance()) return this;
      if (other.hasClient()) {
        mergeClient(other.getClient());
      }
      if (other.hasConsent()) {
        mergeConsent(other.getConsent());
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
      io.opencannabis.schema.oauth.ConsentTicket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.oauth.ConsentTicket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.opencannabis.schema.oauth.Client client_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.oauth.Client, io.opencannabis.schema.oauth.Client.Builder, io.opencannabis.schema.oauth.ClientOrBuilder> clientBuilder_;
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public boolean hasClient() {
      return clientBuilder_ != null || client_ != null;
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public io.opencannabis.schema.oauth.Client getClient() {
      if (clientBuilder_ == null) {
        return client_ == null ? io.opencannabis.schema.oauth.Client.getDefaultInstance() : client_;
      } else {
        return clientBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public Builder setClient(io.opencannabis.schema.oauth.Client value) {
      if (clientBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        client_ = value;
        onChanged();
      } else {
        clientBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public Builder setClient(
        io.opencannabis.schema.oauth.Client.Builder builderForValue) {
      if (clientBuilder_ == null) {
        client_ = builderForValue.build();
        onChanged();
      } else {
        clientBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public Builder mergeClient(io.opencannabis.schema.oauth.Client value) {
      if (clientBuilder_ == null) {
        if (client_ != null) {
          client_ =
            io.opencannabis.schema.oauth.Client.newBuilder(client_).mergeFrom(value).buildPartial();
        } else {
          client_ = value;
        }
        onChanged();
      } else {
        clientBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public Builder clearClient() {
      if (clientBuilder_ == null) {
        client_ = null;
        onChanged();
      } else {
        client_ = null;
        clientBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public io.opencannabis.schema.oauth.Client.Builder getClientBuilder() {
      
      onChanged();
      return getClientFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    public io.opencannabis.schema.oauth.ClientOrBuilder getClientOrBuilder() {
      if (clientBuilder_ != null) {
        return clientBuilder_.getMessageOrBuilder();
      } else {
        return client_ == null ?
            io.opencannabis.schema.oauth.Client.getDefaultInstance() : client_;
      }
    }
    /**
     * <pre>
     * Specifies client information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Client client = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.oauth.Client, io.opencannabis.schema.oauth.Client.Builder, io.opencannabis.schema.oauth.ClientOrBuilder> 
        getClientFieldBuilder() {
      if (clientBuilder_ == null) {
        clientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.oauth.Client, io.opencannabis.schema.oauth.Client.Builder, io.opencannabis.schema.oauth.ClientOrBuilder>(
                getClient(),
                getParentForChildren(),
                isClean());
        client_ = null;
      }
      return clientBuilder_;
    }

    private io.opencannabis.schema.oauth.Consent consent_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.oauth.Consent, io.opencannabis.schema.oauth.Consent.Builder, io.opencannabis.schema.oauth.ConsentOrBuilder> consentBuilder_;
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public boolean hasConsent() {
      return consentBuilder_ != null || consent_ != null;
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public io.opencannabis.schema.oauth.Consent getConsent() {
      if (consentBuilder_ == null) {
        return consent_ == null ? io.opencannabis.schema.oauth.Consent.getDefaultInstance() : consent_;
      } else {
        return consentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public Builder setConsent(io.opencannabis.schema.oauth.Consent value) {
      if (consentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        consent_ = value;
        onChanged();
      } else {
        consentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public Builder setConsent(
        io.opencannabis.schema.oauth.Consent.Builder builderForValue) {
      if (consentBuilder_ == null) {
        consent_ = builderForValue.build();
        onChanged();
      } else {
        consentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public Builder mergeConsent(io.opencannabis.schema.oauth.Consent value) {
      if (consentBuilder_ == null) {
        if (consent_ != null) {
          consent_ =
            io.opencannabis.schema.oauth.Consent.newBuilder(consent_).mergeFrom(value).buildPartial();
        } else {
          consent_ = value;
        }
        onChanged();
      } else {
        consentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public Builder clearConsent() {
      if (consentBuilder_ == null) {
        consent_ = null;
        onChanged();
      } else {
        consent_ = null;
        consentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public io.opencannabis.schema.oauth.Consent.Builder getConsentBuilder() {
      
      onChanged();
      return getConsentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    public io.opencannabis.schema.oauth.ConsentOrBuilder getConsentOrBuilder() {
      if (consentBuilder_ != null) {
        return consentBuilder_.getMessageOrBuilder();
      } else {
        return consent_ == null ?
            io.opencannabis.schema.oauth.Consent.getDefaultInstance() : consent_;
      }
    }
    /**
     * <pre>
     * Specifies consent information for this flow.
     * </pre>
     *
     * <code>.opencannabis.oauth.Consent consent = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.oauth.Consent, io.opencannabis.schema.oauth.Consent.Builder, io.opencannabis.schema.oauth.ConsentOrBuilder> 
        getConsentFieldBuilder() {
      if (consentBuilder_ == null) {
        consentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.oauth.Consent, io.opencannabis.schema.oauth.Consent.Builder, io.opencannabis.schema.oauth.ConsentOrBuilder>(
                getConsent(),
                getParentForChildren(),
                isClean());
        consent_ = null;
      }
      return consentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.oauth.ConsentTicket)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.oauth.ConsentTicket)
  private static final io.opencannabis.schema.oauth.ConsentTicket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.oauth.ConsentTicket();
  }

  public static io.opencannabis.schema.oauth.ConsentTicket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsentTicket>
      PARSER = new com.google.protobuf.AbstractParser<ConsentTicket>() {
    public ConsentTicket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsentTicket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsentTicket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsentTicket> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.oauth.ConsentTicket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

