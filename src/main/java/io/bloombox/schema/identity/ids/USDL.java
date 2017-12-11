/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
 *
 * Source and object computer code contained herein is the private intellectual property
 * of Bloombox, a California Limited Liability Corporation. Use of this code in source form
 * requires permission in writing before use or the publishing of derivative works, for
 * commercial purposes or any other purpose, from a duly authorized officer of Momentum
 * Ideas Co.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: identity/ids/USDL.proto

package io.bloombox.schema.identity.ids;

/**
 * <pre>
 * Specifies a United States Driver's License.
 * </pre>
 *
 * Protobuf type {@code identity.ids.USDL}
 */
public  final class USDL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:identity.ids.USDL)
    USDLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use USDL.newBuilder() to construct.
  private USDL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private USDL() {
    barcode_ = com.google.protobuf.ByteString.EMPTY;
    jurisdiction_ = 0;
    fields_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private USDL(
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

            barcode_ = input.readBytes();
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            jurisdiction_ = rawValue;
            break;
          }
          case 802: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              fields_ = new java.util.ArrayList<io.bloombox.schema.identity.ids.USDLFieldValue>();
              mutable_bitField0_ |= 0x00000004;
            }
            fields_.add(
                input.readMessage(io.bloombox.schema.identity.ids.USDLFieldValue.parser(), extensionRegistry));
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
        fields_ = java.util.Collections.unmodifiableList(fields_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDL_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.identity.ids.USDL.class, io.bloombox.schema.identity.ids.USDL.Builder.class);
  }

  private int bitField0_;
  public static final int BARCODE_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString barcode_;
  /**
   * <pre>
   * Raw barcode data for this Driver's License.
   * </pre>
   *
   * <code>bytes barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
   */
  public com.google.protobuf.ByteString getBarcode() {
    return barcode_;
  }

  public static final int JURISDICTION_FIELD_NUMBER = 5;
  private int jurisdiction_;
  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  public int getJurisdictionValue() {
    return jurisdiction_;
  }
  /**
   * <pre>
   * State that issued this Driver's License.
   * </pre>
   *
   * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
   */
  public io.bloombox.schema.geo.usa.USState getJurisdiction() {
    io.bloombox.schema.geo.usa.USState result = io.bloombox.schema.geo.usa.USState.valueOf(jurisdiction_);
    return result == null ? io.bloombox.schema.geo.usa.USState.UNRECOGNIZED : result;
  }

  public static final int FIELDS_FIELD_NUMBER = 100;
  private java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> fields_;
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  public java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> getFieldsList() {
    return fields_;
  }
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  public java.util.List<? extends io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> 
      getFieldsOrBuilderList() {
    return fields_;
  }
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  public int getFieldsCount() {
    return fields_.size();
  }
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  public io.bloombox.schema.identity.ids.USDLFieldValue getFields(int index) {
    return fields_.get(index);
  }
  /**
   * <pre>
   * Raw field data for this license.
   * </pre>
   *
   * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
   */
  public io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder getFieldsOrBuilder(
      int index) {
    return fields_.get(index);
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
    if (!barcode_.isEmpty()) {
      output.writeBytes(1, barcode_);
    }
    if (jurisdiction_ != io.bloombox.schema.geo.usa.USState.UNSPECIFIED.getNumber()) {
      output.writeEnum(5, jurisdiction_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      output.writeMessage(100, fields_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!barcode_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, barcode_);
    }
    if (jurisdiction_ != io.bloombox.schema.geo.usa.USState.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, jurisdiction_);
    }
    for (int i = 0; i < fields_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(100, fields_.get(i));
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
    if (!(obj instanceof io.bloombox.schema.identity.ids.USDL)) {
      return super.equals(obj);
    }
    io.bloombox.schema.identity.ids.USDL other = (io.bloombox.schema.identity.ids.USDL) obj;

    boolean result = true;
    result = result && getBarcode()
        .equals(other.getBarcode());
    result = result && jurisdiction_ == other.jurisdiction_;
    result = result && getFieldsList()
        .equals(other.getFieldsList());
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
    hash = (37 * hash) + BARCODE_FIELD_NUMBER;
    hash = (53 * hash) + getBarcode().hashCode();
    hash = (37 * hash) + JURISDICTION_FIELD_NUMBER;
    hash = (53 * hash) + jurisdiction_;
    if (getFieldsCount() > 0) {
      hash = (37 * hash) + FIELDS_FIELD_NUMBER;
      hash = (53 * hash) + getFieldsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.identity.ids.USDL parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.identity.ids.USDL prototype) {
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
   * Specifies a United States Driver's License.
   * </pre>
   *
   * Protobuf type {@code identity.ids.USDL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:identity.ids.USDL)
      io.bloombox.schema.identity.ids.USDLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDL_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.identity.ids.USDL.class, io.bloombox.schema.identity.ids.USDL.Builder.class);
    }

    // Construct using io.bloombox.schema.identity.ids.USDL.newBuilder()
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
        getFieldsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      barcode_ = com.google.protobuf.ByteString.EMPTY;

      jurisdiction_ = 0;

      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.identity.ids.USDLOuterClass.internal_static_identity_ids_USDL_descriptor;
    }

    public io.bloombox.schema.identity.ids.USDL getDefaultInstanceForType() {
      return io.bloombox.schema.identity.ids.USDL.getDefaultInstance();
    }

    public io.bloombox.schema.identity.ids.USDL build() {
      io.bloombox.schema.identity.ids.USDL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.identity.ids.USDL buildPartial() {
      io.bloombox.schema.identity.ids.USDL result = new io.bloombox.schema.identity.ids.USDL(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.barcode_ = barcode_;
      result.jurisdiction_ = jurisdiction_;
      if (fieldsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.fields_ = fields_;
      } else {
        result.fields_ = fieldsBuilder_.build();
      }
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
      if (other instanceof io.bloombox.schema.identity.ids.USDL) {
        return mergeFrom((io.bloombox.schema.identity.ids.USDL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.identity.ids.USDL other) {
      if (other == io.bloombox.schema.identity.ids.USDL.getDefaultInstance()) return this;
      if (other.getBarcode() != com.google.protobuf.ByteString.EMPTY) {
        setBarcode(other.getBarcode());
      }
      if (other.jurisdiction_ != 0) {
        setJurisdictionValue(other.getJurisdictionValue());
      }
      if (fieldsBuilder_ == null) {
        if (!other.fields_.isEmpty()) {
          if (fields_.isEmpty()) {
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureFieldsIsMutable();
            fields_.addAll(other.fields_);
          }
          onChanged();
        }
      } else {
        if (!other.fields_.isEmpty()) {
          if (fieldsBuilder_.isEmpty()) {
            fieldsBuilder_.dispose();
            fieldsBuilder_ = null;
            fields_ = other.fields_;
            bitField0_ = (bitField0_ & ~0x00000004);
            fieldsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFieldsFieldBuilder() : null;
          } else {
            fieldsBuilder_.addAllMessages(other.fields_);
          }
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
      io.bloombox.schema.identity.ids.USDL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.identity.ids.USDL) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.ByteString barcode_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Raw barcode data for this Driver's License.
     * </pre>
     *
     * <code>bytes barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public com.google.protobuf.ByteString getBarcode() {
      return barcode_;
    }
    /**
     * <pre>
     * Raw barcode data for this Driver's License.
     * </pre>
     *
     * <code>bytes barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public Builder setBarcode(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      barcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Raw barcode data for this Driver's License.
     * </pre>
     *
     * <code>bytes barcode = 1 [(.gen_bq_schema.ignore) = true];</code>
     */
    public Builder clearBarcode() {
      
      barcode_ = getDefaultInstance().getBarcode();
      onChanged();
      return this;
    }

    private int jurisdiction_ = 0;
    /**
     * <pre>
     * State that issued this Driver's License.
     * </pre>
     *
     * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
     */
    public int getJurisdictionValue() {
      return jurisdiction_;
    }
    /**
     * <pre>
     * State that issued this Driver's License.
     * </pre>
     *
     * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
     */
    public Builder setJurisdictionValue(int value) {
      jurisdiction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * State that issued this Driver's License.
     * </pre>
     *
     * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
     */
    public io.bloombox.schema.geo.usa.USState getJurisdiction() {
      io.bloombox.schema.geo.usa.USState result = io.bloombox.schema.geo.usa.USState.valueOf(jurisdiction_);
      return result == null ? io.bloombox.schema.geo.usa.USState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * State that issued this Driver's License.
     * </pre>
     *
     * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
     */
    public Builder setJurisdiction(io.bloombox.schema.geo.usa.USState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      jurisdiction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * State that issued this Driver's License.
     * </pre>
     *
     * <code>.geo.usa.USState jurisdiction = 5 [(.gen_bq_schema.description) = "State that issued this Driver&#92;'s License."];</code>
     */
    public Builder clearJurisdiction() {
      
      jurisdiction_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> fields_ =
      java.util.Collections.emptyList();
    private void ensureFieldsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        fields_ = new java.util.ArrayList<io.bloombox.schema.identity.ids.USDLFieldValue>(fields_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.identity.ids.USDLFieldValue, io.bloombox.schema.identity.ids.USDLFieldValue.Builder, io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> fieldsBuilder_;

    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue> getFieldsList() {
      if (fieldsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(fields_);
      } else {
        return fieldsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public int getFieldsCount() {
      if (fieldsBuilder_ == null) {
        return fields_.size();
      } else {
        return fieldsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public io.bloombox.schema.identity.ids.USDLFieldValue getFields(int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);
      } else {
        return fieldsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder setFields(
        int index, io.bloombox.schema.identity.ids.USDLFieldValue value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.set(index, value);
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder setFields(
        int index, io.bloombox.schema.identity.ids.USDLFieldValue.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.set(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder addFields(io.bloombox.schema.identity.ids.USDLFieldValue value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder addFields(
        int index, io.bloombox.schema.identity.ids.USDLFieldValue value) {
      if (fieldsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFieldsIsMutable();
        fields_.add(index, value);
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder addFields(
        io.bloombox.schema.identity.ids.USDLFieldValue.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder addFields(
        int index, io.bloombox.schema.identity.ids.USDLFieldValue.Builder builderForValue) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.add(index, builderForValue.build());
        onChanged();
      } else {
        fieldsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder addAllFields(
        java.lang.Iterable<? extends io.bloombox.schema.identity.ids.USDLFieldValue> values) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fields_);
        onChanged();
      } else {
        fieldsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder clearFields() {
      if (fieldsBuilder_ == null) {
        fields_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        fieldsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public Builder removeFields(int index) {
      if (fieldsBuilder_ == null) {
        ensureFieldsIsMutable();
        fields_.remove(index);
        onChanged();
      } else {
        fieldsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public io.bloombox.schema.identity.ids.USDLFieldValue.Builder getFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder getFieldsOrBuilder(
        int index) {
      if (fieldsBuilder_ == null) {
        return fields_.get(index);  } else {
        return fieldsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public java.util.List<? extends io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> 
         getFieldsOrBuilderList() {
      if (fieldsBuilder_ != null) {
        return fieldsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(fields_);
      }
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public io.bloombox.schema.identity.ids.USDLFieldValue.Builder addFieldsBuilder() {
      return getFieldsFieldBuilder().addBuilder(
          io.bloombox.schema.identity.ids.USDLFieldValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public io.bloombox.schema.identity.ids.USDLFieldValue.Builder addFieldsBuilder(
        int index) {
      return getFieldsFieldBuilder().addBuilder(
          index, io.bloombox.schema.identity.ids.USDLFieldValue.getDefaultInstance());
    }
    /**
     * <pre>
     * Raw field data for this license.
     * </pre>
     *
     * <code>repeated .identity.ids.USDLFieldValue fields = 100 [(.gen_bq_schema.description) = "Raw field data for this license."];</code>
     */
    public java.util.List<io.bloombox.schema.identity.ids.USDLFieldValue.Builder> 
         getFieldsBuilderList() {
      return getFieldsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.bloombox.schema.identity.ids.USDLFieldValue, io.bloombox.schema.identity.ids.USDLFieldValue.Builder, io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder> 
        getFieldsFieldBuilder() {
      if (fieldsBuilder_ == null) {
        fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.bloombox.schema.identity.ids.USDLFieldValue, io.bloombox.schema.identity.ids.USDLFieldValue.Builder, io.bloombox.schema.identity.ids.USDLFieldValueOrBuilder>(
                fields_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        fields_ = null;
      }
      return fieldsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:identity.ids.USDL)
  }

  // @@protoc_insertion_point(class_scope:identity.ids.USDL)
  private static final io.bloombox.schema.identity.ids.USDL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.identity.ids.USDL();
  }

  public static io.bloombox.schema.identity.ids.USDL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<USDL>
      PARSER = new com.google.protobuf.AbstractParser<USDL>() {
    public USDL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new USDL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<USDL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<USDL> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.identity.ids.USDL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

