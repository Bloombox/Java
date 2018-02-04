// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo/Province.proto

package io.opencannabis.schema.geo;

/**
 * <pre>
 * Specifies a US or non-US province.
 * </pre>
 *
 * Protobuf type {@code opencannabis.geo.Province}
 */
public  final class Province extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.geo.Province)
    ProvinceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Province.newBuilder() to construct.
  private Province(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Province() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Province(
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
          case 8: {
            int rawValue = input.readEnum();
            specCase_ = 1;
            spec_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            specCase_ = 2;
            spec_ = s;
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
    return io.opencannabis.schema.geo.ProvinceOuterClass.internal_static_opencannabis_geo_Province_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.geo.ProvinceOuterClass.internal_static_opencannabis_geo_Province_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.geo.Province.class, io.opencannabis.schema.geo.Province.Builder.class);
  }

  private int specCase_ = 0;
  private java.lang.Object spec_;
  public enum SpecCase
      implements com.google.protobuf.Internal.EnumLite {
    STATE(1),
    PROVINCE(2),
    SPEC_NOT_SET(0);
    private final int value;
    private SpecCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SpecCase valueOf(int value) {
      return forNumber(value);
    }

    public static SpecCase forNumber(int value) {
      switch (value) {
        case 1: return STATE;
        case 2: return PROVINCE;
        case 0: return SPEC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public SpecCase
  getSpecCase() {
    return SpecCase.forNumber(
        specCase_);
  }

  public static final int STATE_FIELD_NUMBER = 1;
  /**
   * <code>.opencannabis.geo.usa.USState state = 1;</code>
   */
  public int getStateValue() {
    if (specCase_ == 1) {
      return (java.lang.Integer) spec_;
    }
    return 0;
  }
  /**
   * <code>.opencannabis.geo.usa.USState state = 1;</code>
   */
  public io.opencannabis.schema.geo.usa.USState getState() {
    if (specCase_ == 1) {
      io.opencannabis.schema.geo.usa.USState result = io.opencannabis.schema.geo.usa.USState.valueOf(
          (java.lang.Integer) spec_);
      return result == null ? io.opencannabis.schema.geo.usa.USState.UNRECOGNIZED : result;
    }
    return io.opencannabis.schema.geo.usa.USState.UNSPECIFIED;
  }

  public static final int PROVINCE_FIELD_NUMBER = 2;
  /**
   * <code>string province = 2;</code>
   */
  public java.lang.String getProvince() {
    java.lang.Object ref = "";
    if (specCase_ == 2) {
      ref = spec_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (specCase_ == 2) {
        spec_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string province = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProvinceBytes() {
    java.lang.Object ref = "";
    if (specCase_ == 2) {
      ref = spec_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (specCase_ == 2) {
        spec_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (specCase_ == 1) {
      output.writeEnum(1, ((java.lang.Integer) spec_));
    }
    if (specCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, spec_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (specCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ((java.lang.Integer) spec_));
    }
    if (specCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, spec_);
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
    if (!(obj instanceof io.opencannabis.schema.geo.Province)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.geo.Province other = (io.opencannabis.schema.geo.Province) obj;

    boolean result = true;
    result = result && getSpecCase().equals(
        other.getSpecCase());
    if (!result) return false;
    switch (specCase_) {
      case 1:
        result = result && getStateValue()
            == other.getStateValue();
        break;
      case 2:
        result = result && getProvince()
            .equals(other.getProvince());
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
    switch (specCase_) {
      case 1:
        hash = (37 * hash) + STATE_FIELD_NUMBER;
        hash = (53 * hash) + getStateValue();
        break;
      case 2:
        hash = (37 * hash) + PROVINCE_FIELD_NUMBER;
        hash = (53 * hash) + getProvince().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.geo.Province parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Province parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Province parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.geo.Province parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.geo.Province prototype) {
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
   * Specifies a US or non-US province.
   * </pre>
   *
   * Protobuf type {@code opencannabis.geo.Province}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.geo.Province)
      io.opencannabis.schema.geo.ProvinceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.geo.ProvinceOuterClass.internal_static_opencannabis_geo_Province_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.geo.ProvinceOuterClass.internal_static_opencannabis_geo_Province_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.geo.Province.class, io.opencannabis.schema.geo.Province.Builder.class);
    }

    // Construct using io.opencannabis.schema.geo.Province.newBuilder()
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
      specCase_ = 0;
      spec_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.geo.ProvinceOuterClass.internal_static_opencannabis_geo_Province_descriptor;
    }

    public io.opencannabis.schema.geo.Province getDefaultInstanceForType() {
      return io.opencannabis.schema.geo.Province.getDefaultInstance();
    }

    public io.opencannabis.schema.geo.Province build() {
      io.opencannabis.schema.geo.Province result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.geo.Province buildPartial() {
      io.opencannabis.schema.geo.Province result = new io.opencannabis.schema.geo.Province(this);
      if (specCase_ == 1) {
        result.spec_ = spec_;
      }
      if (specCase_ == 2) {
        result.spec_ = spec_;
      }
      result.specCase_ = specCase_;
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
      if (other instanceof io.opencannabis.schema.geo.Province) {
        return mergeFrom((io.opencannabis.schema.geo.Province)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.geo.Province other) {
      if (other == io.opencannabis.schema.geo.Province.getDefaultInstance()) return this;
      switch (other.getSpecCase()) {
        case STATE: {
          setStateValue(other.getStateValue());
          break;
        }
        case PROVINCE: {
          specCase_ = 2;
          spec_ = other.spec_;
          onChanged();
          break;
        }
        case SPEC_NOT_SET: {
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
      io.opencannabis.schema.geo.Province parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.geo.Province) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int specCase_ = 0;
    private java.lang.Object spec_;
    public SpecCase
        getSpecCase() {
      return SpecCase.forNumber(
          specCase_);
    }

    public Builder clearSpec() {
      specCase_ = 0;
      spec_ = null;
      onChanged();
      return this;
    }


    /**
     * <code>.opencannabis.geo.usa.USState state = 1;</code>
     */
    public int getStateValue() {
      if (specCase_ == 1) {
        return ((java.lang.Integer) spec_).intValue();
      }
      return 0;
    }
    /**
     * <code>.opencannabis.geo.usa.USState state = 1;</code>
     */
    public Builder setStateValue(int value) {
      specCase_ = 1;
      spec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.opencannabis.geo.usa.USState state = 1;</code>
     */
    public io.opencannabis.schema.geo.usa.USState getState() {
      if (specCase_ == 1) {
        io.opencannabis.schema.geo.usa.USState result = io.opencannabis.schema.geo.usa.USState.valueOf(
            (java.lang.Integer) spec_);
        return result == null ? io.opencannabis.schema.geo.usa.USState.UNRECOGNIZED : result;
      }
      return io.opencannabis.schema.geo.usa.USState.UNSPECIFIED;
    }
    /**
     * <code>.opencannabis.geo.usa.USState state = 1;</code>
     */
    public Builder setState(io.opencannabis.schema.geo.usa.USState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      specCase_ = 1;
      spec_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.opencannabis.geo.usa.USState state = 1;</code>
     */
    public Builder clearState() {
      if (specCase_ == 1) {
        specCase_ = 0;
        spec_ = null;
        onChanged();
      }
      return this;
    }

    /**
     * <code>string province = 2;</code>
     */
    public java.lang.String getProvince() {
      java.lang.Object ref = "";
      if (specCase_ == 2) {
        ref = spec_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (specCase_ == 2) {
          spec_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string province = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProvinceBytes() {
      java.lang.Object ref = "";
      if (specCase_ == 2) {
        ref = spec_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (specCase_ == 2) {
          spec_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder setProvince(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  specCase_ = 2;
      spec_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder clearProvince() {
      if (specCase_ == 2) {
        specCase_ = 0;
        spec_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string province = 2;</code>
     */
    public Builder setProvinceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      specCase_ = 2;
      spec_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:opencannabis.geo.Province)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.geo.Province)
  private static final io.opencannabis.schema.geo.Province DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.geo.Province();
  }

  public static io.opencannabis.schema.geo.Province getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Province>
      PARSER = new com.google.protobuf.AbstractParser<Province>() {
    public Province parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Province(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Province> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Province> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.geo.Province getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

