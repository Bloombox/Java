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
// source: checkin/v1beta1/CheckinService_Beta1.proto

package io.bloombox.schema.services.checkin.v1beta1;

/**
 * <pre>
 * Specifies a response to a request to check a user in, regardless of whether they checked in via their government ID,
 * a physical card, or an authenticated digital card.
 * </pre>
 *
 * Protobuf type {@code bloombox.schema.services.checkin.v1beta1.CheckinResponse}
 */
public  final class CheckinResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.schema.services.checkin.v1beta1.CheckinResponse)
    CheckinResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckinResponse.newBuilder() to construct.
  private CheckinResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckinResponse() {
    success_ = false;
    mustEnroll_ = false;
    error_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckinResponse(
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

            success_ = input.readBool();
            break;
          }
          case 16: {

            mustEnroll_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            error_ = rawValue;
            break;
          }
          case 34: {
            io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(io.bloombox.schema.services.checkin.v1beta1.CheckinUser.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          case 42: {
            io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder subBuilder = null;
            if (enrollment_ != null) {
              subBuilder = enrollment_.toBuilder();
            }
            enrollment_ = input.readMessage(io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(enrollment_);
              enrollment_ = subBuilder.buildPartial();
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
    return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.class, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.Builder.class);
  }

  public static final int SUCCESS_FIELD_NUMBER = 1;
  private boolean success_;
  /**
   * <pre>
   * Specifies whether the operation was successful. If not, there should be an error listed.
   * </pre>
   *
   * <code>bool success = 1;</code>
   */
  public boolean getSuccess() {
    return success_;
  }

  public static final int MUST_ENROLL_FIELD_NUMBER = 2;
  private boolean mustEnroll_;
  /**
   * <pre>
   * Specifies whether the user must enroll to continue.
   * </pre>
   *
   * <code>bool must_enroll = 2;</code>
   */
  public boolean getMustEnroll() {
    return mustEnroll_;
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private int error_;
  /**
   * <pre>
   * Specifies a known checkin error that occurred, if applicable.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
   */
  public int getErrorValue() {
    return error_;
  }
  /**
   * <pre>
   * Specifies a known checkin error that occurred, if applicable.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
   */
  public io.bloombox.schema.services.checkin.v1beta1.CheckinError getError() {
    io.bloombox.schema.services.checkin.v1beta1.CheckinError result = io.bloombox.schema.services.checkin.v1beta1.CheckinError.valueOf(error_);
    return result == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinError.UNRECOGNIZED : result;
  }

  public static final int USER_FIELD_NUMBER = 4;
  private io.bloombox.schema.services.checkin.v1beta1.CheckinUser user_;
  /**
   * <pre>
   * Information about the resulting user account.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <pre>
   * Information about the resulting user account.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
   */
  public io.bloombox.schema.services.checkin.v1beta1.CheckinUser getUser() {
    return user_ == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinUser.getDefaultInstance() : user_;
  }
  /**
   * <pre>
   * Information about the resulting user account.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
   */
  public io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder getUserOrBuilder() {
    return getUser();
  }

  public static final int ENROLLMENT_FIELD_NUMBER = 5;
  private io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment_;
  /**
   * <pre>
   * Information related to the user's next enrollment action, if required.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
   */
  public boolean hasEnrollment() {
    return enrollment_ != null;
  }
  /**
   * <pre>
   * Information related to the user's next enrollment action, if required.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
   */
  public io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment getEnrollment() {
    return enrollment_ == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.getDefaultInstance() : enrollment_;
  }
  /**
   * <pre>
   * Information related to the user's next enrollment action, if required.
   * </pre>
   *
   * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
   */
  public io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollmentOrBuilder getEnrollmentOrBuilder() {
    return getEnrollment();
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
    if (success_ != false) {
      output.writeBool(1, success_);
    }
    if (mustEnroll_ != false) {
      output.writeBool(2, mustEnroll_);
    }
    if (error_ != io.bloombox.schema.services.checkin.v1beta1.CheckinError.NO_ERROR.getNumber()) {
      output.writeEnum(3, error_);
    }
    if (user_ != null) {
      output.writeMessage(4, getUser());
    }
    if (enrollment_ != null) {
      output.writeMessage(5, getEnrollment());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, success_);
    }
    if (mustEnroll_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, mustEnroll_);
    }
    if (error_ != io.bloombox.schema.services.checkin.v1beta1.CheckinError.NO_ERROR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, error_);
    }
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUser());
    }
    if (enrollment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getEnrollment());
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
    if (!(obj instanceof io.bloombox.schema.services.checkin.v1beta1.CheckinResponse)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.checkin.v1beta1.CheckinResponse other = (io.bloombox.schema.services.checkin.v1beta1.CheckinResponse) obj;

    boolean result = true;
    result = result && (getSuccess()
        == other.getSuccess());
    result = result && (getMustEnroll()
        == other.getMustEnroll());
    result = result && error_ == other.error_;
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
    }
    result = result && (hasEnrollment() == other.hasEnrollment());
    if (hasEnrollment()) {
      result = result && getEnrollment()
          .equals(other.getEnrollment());
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
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    hash = (37 * hash) + MUST_ENROLL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getMustEnroll());
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + error_;
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (hasEnrollment()) {
      hash = (37 * hash) + ENROLLMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnrollment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.checkin.v1beta1.CheckinResponse prototype) {
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
   * Specifies a response to a request to check a user in, regardless of whether they checked in via their government ID,
   * a physical card, or an authenticated digital card.
   * </pre>
   *
   * Protobuf type {@code bloombox.schema.services.checkin.v1beta1.CheckinResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.schema.services.checkin.v1beta1.CheckinResponse)
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.class, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.Builder.class);
    }

    // Construct using io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.newBuilder()
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
      success_ = false;

      mustEnroll_ = false;

      error_ = 0;

      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      if (enrollmentBuilder_ == null) {
        enrollment_ = null;
      } else {
        enrollment_ = null;
        enrollmentBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.internal_static_bloombox_schema_services_checkin_v1beta1_CheckinResponse_descriptor;
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse getDefaultInstanceForType() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance();
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse build() {
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse buildPartial() {
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse result = new io.bloombox.schema.services.checkin.v1beta1.CheckinResponse(this);
      result.success_ = success_;
      result.mustEnroll_ = mustEnroll_;
      result.error_ = error_;
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      if (enrollmentBuilder_ == null) {
        result.enrollment_ = enrollment_;
      } else {
        result.enrollment_ = enrollmentBuilder_.build();
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
      if (other instanceof io.bloombox.schema.services.checkin.v1beta1.CheckinResponse) {
        return mergeFrom((io.bloombox.schema.services.checkin.v1beta1.CheckinResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.checkin.v1beta1.CheckinResponse other) {
      if (other == io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance()) return this;
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (other.getMustEnroll() != false) {
        setMustEnroll(other.getMustEnroll());
      }
      if (other.error_ != 0) {
        setErrorValue(other.getErrorValue());
      }
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasEnrollment()) {
        mergeEnrollment(other.getEnrollment());
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
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.checkin.v1beta1.CheckinResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean success_ ;
    /**
     * <pre>
     * Specifies whether the operation was successful. If not, there should be an error listed.
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <pre>
     * Specifies whether the operation was successful. If not, there should be an error listed.
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether the operation was successful. If not, there should be an error listed.
     * </pre>
     *
     * <code>bool success = 1;</code>
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private boolean mustEnroll_ ;
    /**
     * <pre>
     * Specifies whether the user must enroll to continue.
     * </pre>
     *
     * <code>bool must_enroll = 2;</code>
     */
    public boolean getMustEnroll() {
      return mustEnroll_;
    }
    /**
     * <pre>
     * Specifies whether the user must enroll to continue.
     * </pre>
     *
     * <code>bool must_enroll = 2;</code>
     */
    public Builder setMustEnroll(boolean value) {
      
      mustEnroll_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether the user must enroll to continue.
     * </pre>
     *
     * <code>bool must_enroll = 2;</code>
     */
    public Builder clearMustEnroll() {
      
      mustEnroll_ = false;
      onChanged();
      return this;
    }

    private int error_ = 0;
    /**
     * <pre>
     * Specifies a known checkin error that occurred, if applicable.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
     */
    public int getErrorValue() {
      return error_;
    }
    /**
     * <pre>
     * Specifies a known checkin error that occurred, if applicable.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
     */
    public Builder setErrorValue(int value) {
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a known checkin error that occurred, if applicable.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinError getError() {
      io.bloombox.schema.services.checkin.v1beta1.CheckinError result = io.bloombox.schema.services.checkin.v1beta1.CheckinError.valueOf(error_);
      return result == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinError.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies a known checkin error that occurred, if applicable.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
     */
    public Builder setError(io.bloombox.schema.services.checkin.v1beta1.CheckinError value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      error_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies a known checkin error that occurred, if applicable.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinError error = 3;</code>
     */
    public Builder clearError() {
      
      error_ = 0;
      onChanged();
      return this;
    }

    private io.bloombox.schema.services.checkin.v1beta1.CheckinUser user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.checkin.v1beta1.CheckinUser, io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder> userBuilder_;
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinUser getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinUser.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public Builder setUser(io.bloombox.schema.services.checkin.v1beta1.CheckinUser value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public Builder setUser(
        io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public Builder mergeUser(io.bloombox.schema.services.checkin.v1beta1.CheckinUser value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            io.bloombox.schema.services.checkin.v1beta1.CheckinUser.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            io.bloombox.schema.services.checkin.v1beta1.CheckinUser.getDefaultInstance() : user_;
      }
    }
    /**
     * <pre>
     * Information about the resulting user account.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinUser user = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.checkin.v1beta1.CheckinUser, io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.services.checkin.v1beta1.CheckinUser, io.bloombox.schema.services.checkin.v1beta1.CheckinUser.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinUserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollmentOrBuilder> enrollmentBuilder_;
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public boolean hasEnrollment() {
      return enrollmentBuilder_ != null || enrollment_ != null;
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment getEnrollment() {
      if (enrollmentBuilder_ == null) {
        return enrollment_ == null ? io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.getDefaultInstance() : enrollment_;
      } else {
        return enrollmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public Builder setEnrollment(io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment value) {
      if (enrollmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enrollment_ = value;
        onChanged();
      } else {
        enrollmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public Builder setEnrollment(
        io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder builderForValue) {
      if (enrollmentBuilder_ == null) {
        enrollment_ = builderForValue.build();
        onChanged();
      } else {
        enrollmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public Builder mergeEnrollment(io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment value) {
      if (enrollmentBuilder_ == null) {
        if (enrollment_ != null) {
          enrollment_ =
            io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.newBuilder(enrollment_).mergeFrom(value).buildPartial();
        } else {
          enrollment_ = value;
        }
        onChanged();
      } else {
        enrollmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public Builder clearEnrollment() {
      if (enrollmentBuilder_ == null) {
        enrollment_ = null;
        onChanged();
      } else {
        enrollment_ = null;
        enrollmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder getEnrollmentBuilder() {
      
      onChanged();
      return getEnrollmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollmentOrBuilder getEnrollmentOrBuilder() {
      if (enrollmentBuilder_ != null) {
        return enrollmentBuilder_.getMessageOrBuilder();
      } else {
        return enrollment_ == null ?
            io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.getDefaultInstance() : enrollment_;
      }
    }
    /**
     * <pre>
     * Information related to the user's next enrollment action, if required.
     * </pre>
     *
     * <code>.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment enrollment = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollmentOrBuilder> 
        getEnrollmentFieldBuilder() {
      if (enrollmentBuilder_ == null) {
        enrollmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollment.Builder, io.bloombox.schema.services.checkin.v1beta1.CheckinEnrollmentOrBuilder>(
                getEnrollment(),
                getParentForChildren(),
                isClean());
        enrollment_ = null;
      }
      return enrollmentBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.schema.services.checkin.v1beta1.CheckinResponse)
  }

  // @@protoc_insertion_point(class_scope:bloombox.schema.services.checkin.v1beta1.CheckinResponse)
  private static final io.bloombox.schema.services.checkin.v1beta1.CheckinResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.checkin.v1beta1.CheckinResponse();
  }

  public static io.bloombox.schema.services.checkin.v1beta1.CheckinResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckinResponse>
      PARSER = new com.google.protobuf.AbstractParser<CheckinResponse>() {
    public CheckinResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckinResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckinResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckinResponse> getParserForType() {
    return PARSER;
  }

  public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

