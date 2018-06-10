// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/labtesting/TestResults.proto

package io.opencannabis.schema.product.struct.testing;

/**
 * <pre>
 * Structure for a test suite - which contains the item being tested for, the method used to produce the results,
 * the value of the results, and any comments.
 * </pre>
 *
 * Protobuf type {@code opencannabis.structs.labtesting.TestSuite}
 */
public  final class TestSuite extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencannabis.structs.labtesting.TestSuite)
    TestSuiteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TestSuite.newBuilder() to construct.
  private TestSuite(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TestSuite() {
    method_ = 0;
    comments_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TestSuite(
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

            method_ = rawValue;
            break;
          }
          case 18: {
            io.opencannabis.schema.product.struct.testing.TestResults.Builder subBuilder = null;
            if (results_ != null) {
              subBuilder = results_.toBuilder();
            }
            results_ = input.readMessage(io.opencannabis.schema.product.struct.testing.TestResults.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(results_);
              results_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            comments_ = s;
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
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_TestSuite_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_TestSuite_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencannabis.schema.product.struct.testing.TestSuite.class, io.opencannabis.schema.product.struct.testing.TestSuite.Builder.class);
  }

  public static final int METHOD_FIELD_NUMBER = 1;
  private int method_;
  /**
   * <pre>
   * Method used to obtain the test result.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
   */
  public int getMethodValue() {
    return method_;
  }
  /**
   * <pre>
   * Method used to obtain the test result.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
   */
  public io.opencannabis.schema.product.struct.testing.TestMethod getMethod() {
    io.opencannabis.schema.product.struct.testing.TestMethod result = io.opencannabis.schema.product.struct.testing.TestMethod.valueOf(method_);
    return result == null ? io.opencannabis.schema.product.struct.testing.TestMethod.UNRECOGNIZED : result;
  }

  public static final int RESULTS_FIELD_NUMBER = 2;
  private io.opencannabis.schema.product.struct.testing.TestResults results_;
  /**
   * <pre>
   * Result of the test.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
   */
  public boolean hasResults() {
    return results_ != null;
  }
  /**
   * <pre>
   * Result of the test.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
   */
  public io.opencannabis.schema.product.struct.testing.TestResults getResults() {
    return results_ == null ? io.opencannabis.schema.product.struct.testing.TestResults.getDefaultInstance() : results_;
  }
  /**
   * <pre>
   * Result of the test.
   * </pre>
   *
   * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
   */
  public io.opencannabis.schema.product.struct.testing.TestResultsOrBuilder getResultsOrBuilder() {
    return getResults();
  }

  public static final int COMMENTS_FIELD_NUMBER = 3;
  private volatile java.lang.Object comments_;
  /**
   * <pre>
   * String containing any comments about the test.
   * </pre>
   *
   * <code>string comments = 3;</code>
   */
  public java.lang.String getComments() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comments_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * String containing any comments about the test.
   * </pre>
   *
   * <code>string comments = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCommentsBytes() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      comments_ = b;
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
    if (method_ != io.opencannabis.schema.product.struct.testing.TestMethod.UNSPECIFIED_METHOD.getNumber()) {
      output.writeEnum(1, method_);
    }
    if (results_ != null) {
      output.writeMessage(2, getResults());
    }
    if (!getCommentsBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, comments_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (method_ != io.opencannabis.schema.product.struct.testing.TestMethod.UNSPECIFIED_METHOD.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, method_);
    }
    if (results_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResults());
    }
    if (!getCommentsBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, comments_);
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
    if (!(obj instanceof io.opencannabis.schema.product.struct.testing.TestSuite)) {
      return super.equals(obj);
    }
    io.opencannabis.schema.product.struct.testing.TestSuite other = (io.opencannabis.schema.product.struct.testing.TestSuite) obj;

    boolean result = true;
    result = result && method_ == other.method_;
    result = result && (hasResults() == other.hasResults());
    if (hasResults()) {
      result = result && getResults()
          .equals(other.getResults());
    }
    result = result && getComments()
        .equals(other.getComments());
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
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + method_;
    if (hasResults()) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResults().hashCode();
    }
    hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getComments().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencannabis.schema.product.struct.testing.TestSuite parseFrom(
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
  public static Builder newBuilder(io.opencannabis.schema.product.struct.testing.TestSuite prototype) {
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
   * Structure for a test suite - which contains the item being tested for, the method used to produce the results,
   * the value of the results, and any comments.
   * </pre>
   *
   * Protobuf type {@code opencannabis.structs.labtesting.TestSuite}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencannabis.structs.labtesting.TestSuite)
      io.opencannabis.schema.product.struct.testing.TestSuiteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_TestSuite_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_TestSuite_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencannabis.schema.product.struct.testing.TestSuite.class, io.opencannabis.schema.product.struct.testing.TestSuite.Builder.class);
    }

    // Construct using io.opencannabis.schema.product.struct.testing.TestSuite.newBuilder()
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
      method_ = 0;

      if (resultsBuilder_ == null) {
        results_ = null;
      } else {
        results_ = null;
        resultsBuilder_ = null;
      }
      comments_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencannabis.schema.product.struct.testing.LabTesting.internal_static_opencannabis_structs_labtesting_TestSuite_descriptor;
    }

    public io.opencannabis.schema.product.struct.testing.TestSuite getDefaultInstanceForType() {
      return io.opencannabis.schema.product.struct.testing.TestSuite.getDefaultInstance();
    }

    public io.opencannabis.schema.product.struct.testing.TestSuite build() {
      io.opencannabis.schema.product.struct.testing.TestSuite result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.opencannabis.schema.product.struct.testing.TestSuite buildPartial() {
      io.opencannabis.schema.product.struct.testing.TestSuite result = new io.opencannabis.schema.product.struct.testing.TestSuite(this);
      result.method_ = method_;
      if (resultsBuilder_ == null) {
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
      result.comments_ = comments_;
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
      if (other instanceof io.opencannabis.schema.product.struct.testing.TestSuite) {
        return mergeFrom((io.opencannabis.schema.product.struct.testing.TestSuite)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencannabis.schema.product.struct.testing.TestSuite other) {
      if (other == io.opencannabis.schema.product.struct.testing.TestSuite.getDefaultInstance()) return this;
      if (other.method_ != 0) {
        setMethodValue(other.getMethodValue());
      }
      if (other.hasResults()) {
        mergeResults(other.getResults());
      }
      if (!other.getComments().isEmpty()) {
        comments_ = other.comments_;
        onChanged();
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
      io.opencannabis.schema.product.struct.testing.TestSuite parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencannabis.schema.product.struct.testing.TestSuite) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int method_ = 0;
    /**
     * <pre>
     * Method used to obtain the test result.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
     */
    public int getMethodValue() {
      return method_;
    }
    /**
     * <pre>
     * Method used to obtain the test result.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
     */
    public Builder setMethodValue(int value) {
      method_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Method used to obtain the test result.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestMethod getMethod() {
      io.opencannabis.schema.product.struct.testing.TestMethod result = io.opencannabis.schema.product.struct.testing.TestMethod.valueOf(method_);
      return result == null ? io.opencannabis.schema.product.struct.testing.TestMethod.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Method used to obtain the test result.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
     */
    public Builder setMethod(io.opencannabis.schema.product.struct.testing.TestMethod value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      method_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Method used to obtain the test result.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestMethod method = 1;</code>
     */
    public Builder clearMethod() {
      
      method_ = 0;
      onChanged();
      return this;
    }

    private io.opencannabis.schema.product.struct.testing.TestResults results_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.testing.TestResults, io.opencannabis.schema.product.struct.testing.TestResults.Builder, io.opencannabis.schema.product.struct.testing.TestResultsOrBuilder> resultsBuilder_;
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public boolean hasResults() {
      return resultsBuilder_ != null || results_ != null;
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestResults getResults() {
      if (resultsBuilder_ == null) {
        return results_ == null ? io.opencannabis.schema.product.struct.testing.TestResults.getDefaultInstance() : results_;
      } else {
        return resultsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public Builder setResults(io.opencannabis.schema.product.struct.testing.TestResults value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        results_ = value;
        onChanged();
      } else {
        resultsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public Builder setResults(
        io.opencannabis.schema.product.struct.testing.TestResults.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        results_ = builderForValue.build();
        onChanged();
      } else {
        resultsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public Builder mergeResults(io.opencannabis.schema.product.struct.testing.TestResults value) {
      if (resultsBuilder_ == null) {
        if (results_ != null) {
          results_ =
            io.opencannabis.schema.product.struct.testing.TestResults.newBuilder(results_).mergeFrom(value).buildPartial();
        } else {
          results_ = value;
        }
        onChanged();
      } else {
        resultsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = null;
        onChanged();
      } else {
        results_ = null;
        resultsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestResults.Builder getResultsBuilder() {
      
      onChanged();
      return getResultsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    public io.opencannabis.schema.product.struct.testing.TestResultsOrBuilder getResultsOrBuilder() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilder();
      } else {
        return results_ == null ?
            io.opencannabis.schema.product.struct.testing.TestResults.getDefaultInstance() : results_;
      }
    }
    /**
     * <pre>
     * Result of the test.
     * </pre>
     *
     * <code>.opencannabis.structs.labtesting.TestResults results = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.opencannabis.schema.product.struct.testing.TestResults, io.opencannabis.schema.product.struct.testing.TestResults.Builder, io.opencannabis.schema.product.struct.testing.TestResultsOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.opencannabis.schema.product.struct.testing.TestResults, io.opencannabis.schema.product.struct.testing.TestResults.Builder, io.opencannabis.schema.product.struct.testing.TestResultsOrBuilder>(
                getResults(),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private java.lang.Object comments_ = "";
    /**
     * <pre>
     * String containing any comments about the test.
     * </pre>
     *
     * <code>string comments = 3;</code>
     */
    public java.lang.String getComments() {
      java.lang.Object ref = comments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * String containing any comments about the test.
     * </pre>
     *
     * <code>string comments = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCommentsBytes() {
      java.lang.Object ref = comments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        comments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * String containing any comments about the test.
     * </pre>
     *
     * <code>string comments = 3;</code>
     */
    public Builder setComments(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      comments_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String containing any comments about the test.
     * </pre>
     *
     * <code>string comments = 3;</code>
     */
    public Builder clearComments() {
      
      comments_ = getDefaultInstance().getComments();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * String containing any comments about the test.
     * </pre>
     *
     * <code>string comments = 3;</code>
     */
    public Builder setCommentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      comments_ = value;
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


    // @@protoc_insertion_point(builder_scope:opencannabis.structs.labtesting.TestSuite)
  }

  // @@protoc_insertion_point(class_scope:opencannabis.structs.labtesting.TestSuite)
  private static final io.opencannabis.schema.product.struct.testing.TestSuite DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencannabis.schema.product.struct.testing.TestSuite();
  }

  public static io.opencannabis.schema.product.struct.testing.TestSuite getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TestSuite>
      PARSER = new com.google.protobuf.AbstractParser<TestSuite>() {
    public TestSuite parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TestSuite(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TestSuite> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TestSuite> getParserForType() {
    return PARSER;
  }

  public io.opencannabis.schema.product.struct.testing.TestSuite getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

