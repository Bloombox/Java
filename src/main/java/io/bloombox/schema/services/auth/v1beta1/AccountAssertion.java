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
// source: auth/v1beta1/AuthService_Beta1.proto

package io.bloombox.schema.services.auth.v1beta1;

/**
 * <pre>
 * Specifies a generic assertion for account access privileges.
 * </pre>
 *
 * Protobuf type {@code bloombox.services.auth.v1beta1.AccountAssertion}
 */
public  final class AccountAssertion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.services.auth.v1beta1.AccountAssertion)
    AccountAssertionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountAssertion.newBuilder() to construct.
  private AccountAssertion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountAssertion() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AccountAssertion(
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
            io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder subBuilder = null;
            if (assertionCase_ == 1) {
              subBuilder = ((io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_).toBuilder();
            }
            assertion_ =
                input.readMessage(io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_);
              assertion_ = subBuilder.buildPartial();
            }
            assertionCase_ = 1;
            break;
          }
          case 18: {
            io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder subBuilder = null;
            if (assertionCase_ == 2) {
              subBuilder = ((io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_).toBuilder();
            }
            assertion_ =
                input.readMessage(io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_);
              assertion_ = subBuilder.buildPartial();
            }
            assertionCase_ = 2;
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
    return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.internal_static_bloombox_services_auth_v1beta1_AccountAssertion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.internal_static_bloombox_services_auth_v1beta1_AccountAssertion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.auth.v1beta1.AccountAssertion.class, io.bloombox.schema.services.auth.v1beta1.AccountAssertion.Builder.class);
  }

  private int assertionCase_ = 0;
  private java.lang.Object assertion_;
  public enum AssertionCase
      implements com.google.protobuf.Internal.EnumLite {
    EMAIL_PASSWORD(1),
    FIREBASE(2),
    ASSERTION_NOT_SET(0);
    private final int value;
    private AssertionCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssertionCase valueOf(int value) {
      return forNumber(value);
    }

    public static AssertionCase forNumber(int value) {
      switch (value) {
        case 1: return EMAIL_PASSWORD;
        case 2: return FIREBASE;
        case 0: return ASSERTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AssertionCase
  getAssertionCase() {
    return AssertionCase.forNumber(
        assertionCase_);
  }

  public static final int EMAIL_PASSWORD_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Email/Password-based account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
   */
  public boolean hasEmailPassword() {
    return assertionCase_ == 1;
  }
  /**
   * <pre>
   * Email/Password-based account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
   */
  public io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion getEmailPassword() {
    if (assertionCase_ == 1) {
       return (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_;
    }
    return io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
  }
  /**
   * <pre>
   * Email/Password-based account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
   */
  public io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertionOrBuilder getEmailPasswordOrBuilder() {
    if (assertionCase_ == 1) {
       return (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_;
    }
    return io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
  }

  public static final int FIREBASE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Firebase account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
   */
  public boolean hasFirebase() {
    return assertionCase_ == 2;
  }
  /**
   * <pre>
   * Firebase account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
   */
  public io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion getFirebase() {
    if (assertionCase_ == 2) {
       return (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_;
    }
    return io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
  }
  /**
   * <pre>
   * Firebase account login.
   * </pre>
   *
   * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
   */
  public io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertionOrBuilder getFirebaseOrBuilder() {
    if (assertionCase_ == 2) {
       return (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_;
    }
    return io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
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
    if (assertionCase_ == 1) {
      output.writeMessage(1, (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_);
    }
    if (assertionCase_ == 2) {
      output.writeMessage(2, (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assertionCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_);
    }
    if (assertionCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_);
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
    if (!(obj instanceof io.bloombox.schema.services.auth.v1beta1.AccountAssertion)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.auth.v1beta1.AccountAssertion other = (io.bloombox.schema.services.auth.v1beta1.AccountAssertion) obj;

    boolean result = true;
    result = result && getAssertionCase().equals(
        other.getAssertionCase());
    if (!result) return false;
    switch (assertionCase_) {
      case 1:
        result = result && getEmailPassword()
            .equals(other.getEmailPassword());
        break;
      case 2:
        result = result && getFirebase()
            .equals(other.getFirebase());
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
    switch (assertionCase_) {
      case 1:
        hash = (37 * hash) + EMAIL_PASSWORD_FIELD_NUMBER;
        hash = (53 * hash) + getEmailPassword().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FIREBASE_FIELD_NUMBER;
        hash = (53 * hash) + getFirebase().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.auth.v1beta1.AccountAssertion prototype) {
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
   * Specifies a generic assertion for account access privileges.
   * </pre>
   *
   * Protobuf type {@code bloombox.services.auth.v1beta1.AccountAssertion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.services.auth.v1beta1.AccountAssertion)
      io.bloombox.schema.services.auth.v1beta1.AccountAssertionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.internal_static_bloombox_services_auth_v1beta1_AccountAssertion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.internal_static_bloombox_services_auth_v1beta1_AccountAssertion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.auth.v1beta1.AccountAssertion.class, io.bloombox.schema.services.auth.v1beta1.AccountAssertion.Builder.class);
    }

    // Construct using io.bloombox.schema.services.auth.v1beta1.AccountAssertion.newBuilder()
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
      assertionCase_ = 0;
      assertion_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.internal_static_bloombox_services_auth_v1beta1_AccountAssertion_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.services.auth.v1beta1.AccountAssertion getDefaultInstanceForType() {
      return io.bloombox.schema.services.auth.v1beta1.AccountAssertion.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.services.auth.v1beta1.AccountAssertion build() {
      io.bloombox.schema.services.auth.v1beta1.AccountAssertion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.services.auth.v1beta1.AccountAssertion buildPartial() {
      io.bloombox.schema.services.auth.v1beta1.AccountAssertion result = new io.bloombox.schema.services.auth.v1beta1.AccountAssertion(this);
      if (assertionCase_ == 1) {
        if (emailPasswordBuilder_ == null) {
          result.assertion_ = assertion_;
        } else {
          result.assertion_ = emailPasswordBuilder_.build();
        }
      }
      if (assertionCase_ == 2) {
        if (firebaseBuilder_ == null) {
          result.assertion_ = assertion_;
        } else {
          result.assertion_ = firebaseBuilder_.build();
        }
      }
      result.assertionCase_ = assertionCase_;
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
      if (other instanceof io.bloombox.schema.services.auth.v1beta1.AccountAssertion) {
        return mergeFrom((io.bloombox.schema.services.auth.v1beta1.AccountAssertion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.auth.v1beta1.AccountAssertion other) {
      if (other == io.bloombox.schema.services.auth.v1beta1.AccountAssertion.getDefaultInstance()) return this;
      switch (other.getAssertionCase()) {
        case EMAIL_PASSWORD: {
          mergeEmailPassword(other.getEmailPassword());
          break;
        }
        case FIREBASE: {
          mergeFirebase(other.getFirebase());
          break;
        }
        case ASSERTION_NOT_SET: {
          break;
        }
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
      io.bloombox.schema.services.auth.v1beta1.AccountAssertion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.auth.v1beta1.AccountAssertion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int assertionCase_ = 0;
    private java.lang.Object assertion_;
    public AssertionCase
        getAssertionCase() {
      return AssertionCase.forNumber(
          assertionCase_);
    }

    public Builder clearAssertion() {
      assertionCase_ = 0;
      assertion_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertionOrBuilder> emailPasswordBuilder_;
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public boolean hasEmailPassword() {
      return assertionCase_ == 1;
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion getEmailPassword() {
      if (emailPasswordBuilder_ == null) {
        if (assertionCase_ == 1) {
          return (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_;
        }
        return io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
      } else {
        if (assertionCase_ == 1) {
          return emailPasswordBuilder_.getMessage();
        }
        return io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public Builder setEmailPassword(io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion value) {
      if (emailPasswordBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assertion_ = value;
        onChanged();
      } else {
        emailPasswordBuilder_.setMessage(value);
      }
      assertionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public Builder setEmailPassword(
        io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder builderForValue) {
      if (emailPasswordBuilder_ == null) {
        assertion_ = builderForValue.build();
        onChanged();
      } else {
        emailPasswordBuilder_.setMessage(builderForValue.build());
      }
      assertionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public Builder mergeEmailPassword(io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion value) {
      if (emailPasswordBuilder_ == null) {
        if (assertionCase_ == 1 &&
            assertion_ != io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance()) {
          assertion_ = io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.newBuilder((io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_)
              .mergeFrom(value).buildPartial();
        } else {
          assertion_ = value;
        }
        onChanged();
      } else {
        if (assertionCase_ == 1) {
          emailPasswordBuilder_.mergeFrom(value);
        }
        emailPasswordBuilder_.setMessage(value);
      }
      assertionCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public Builder clearEmailPassword() {
      if (emailPasswordBuilder_ == null) {
        if (assertionCase_ == 1) {
          assertionCase_ = 0;
          assertion_ = null;
          onChanged();
        }
      } else {
        if (assertionCase_ == 1) {
          assertionCase_ = 0;
          assertion_ = null;
        }
        emailPasswordBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder getEmailPasswordBuilder() {
      return getEmailPasswordFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertionOrBuilder getEmailPasswordOrBuilder() {
      if ((assertionCase_ == 1) && (emailPasswordBuilder_ != null)) {
        return emailPasswordBuilder_.getMessageOrBuilder();
      } else {
        if (assertionCase_ == 1) {
          return (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_;
        }
        return io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Email/Password-based account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.EmailPasswordAssertion email_password = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertionOrBuilder> 
        getEmailPasswordFieldBuilder() {
      if (emailPasswordBuilder_ == null) {
        if (!(assertionCase_ == 1)) {
          assertion_ = io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.getDefaultInstance();
        }
        emailPasswordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertionOrBuilder>(
                (io.bloombox.schema.services.auth.v1beta1.EmailPasswordAssertion) assertion_,
                getParentForChildren(),
                isClean());
        assertion_ = null;
      }
      assertionCase_ = 1;
      onChanged();;
      return emailPasswordBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertionOrBuilder> firebaseBuilder_;
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public boolean hasFirebase() {
      return assertionCase_ == 2;
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion getFirebase() {
      if (firebaseBuilder_ == null) {
        if (assertionCase_ == 2) {
          return (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_;
        }
        return io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
      } else {
        if (assertionCase_ == 2) {
          return firebaseBuilder_.getMessage();
        }
        return io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public Builder setFirebase(io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion value) {
      if (firebaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assertion_ = value;
        onChanged();
      } else {
        firebaseBuilder_.setMessage(value);
      }
      assertionCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public Builder setFirebase(
        io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder builderForValue) {
      if (firebaseBuilder_ == null) {
        assertion_ = builderForValue.build();
        onChanged();
      } else {
        firebaseBuilder_.setMessage(builderForValue.build());
      }
      assertionCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public Builder mergeFirebase(io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion value) {
      if (firebaseBuilder_ == null) {
        if (assertionCase_ == 2 &&
            assertion_ != io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance()) {
          assertion_ = io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.newBuilder((io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_)
              .mergeFrom(value).buildPartial();
        } else {
          assertion_ = value;
        }
        onChanged();
      } else {
        if (assertionCase_ == 2) {
          firebaseBuilder_.mergeFrom(value);
        }
        firebaseBuilder_.setMessage(value);
      }
      assertionCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public Builder clearFirebase() {
      if (firebaseBuilder_ == null) {
        if (assertionCase_ == 2) {
          assertionCase_ = 0;
          assertion_ = null;
          onChanged();
        }
      } else {
        if (assertionCase_ == 2) {
          assertionCase_ = 0;
          assertion_ = null;
        }
        firebaseBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder getFirebaseBuilder() {
      return getFirebaseFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    public io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertionOrBuilder getFirebaseOrBuilder() {
      if ((assertionCase_ == 2) && (firebaseBuilder_ != null)) {
        return firebaseBuilder_.getMessageOrBuilder();
      } else {
        if (assertionCase_ == 2) {
          return (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_;
        }
        return io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Firebase account login.
     * </pre>
     *
     * <code>.bloombox.services.auth.v1beta1.FirebaseTokenAssertion firebase = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertionOrBuilder> 
        getFirebaseFieldBuilder() {
      if (firebaseBuilder_ == null) {
        if (!(assertionCase_ == 2)) {
          assertion_ = io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.getDefaultInstance();
        }
        firebaseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion.Builder, io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertionOrBuilder>(
                (io.bloombox.schema.services.auth.v1beta1.FirebaseTokenAssertion) assertion_,
                getParentForChildren(),
                isClean());
        assertion_ = null;
      }
      assertionCase_ = 2;
      onChanged();;
      return firebaseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:bloombox.services.auth.v1beta1.AccountAssertion)
  }

  // @@protoc_insertion_point(class_scope:bloombox.services.auth.v1beta1.AccountAssertion)
  private static final io.bloombox.schema.services.auth.v1beta1.AccountAssertion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.auth.v1beta1.AccountAssertion();
  }

  public static io.bloombox.schema.services.auth.v1beta1.AccountAssertion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountAssertion>
      PARSER = new com.google.protobuf.AbstractParser<AccountAssertion>() {
    @java.lang.Override
    public AccountAssertion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AccountAssertion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AccountAssertion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountAssertion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.services.auth.v1beta1.AccountAssertion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

