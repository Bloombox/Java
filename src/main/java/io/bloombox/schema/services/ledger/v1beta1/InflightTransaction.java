/*
 * Copyright 2019, Momentum Ideas, Co. All rights reserved.
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
// source: ledger/v1beta1/LedgerService_Beta1.proto

package io.bloombox.schema.services.ledger.v1beta1;

/**
 * <pre>
 * Specifies an RPC structure that provides an update regarding an in-flight transaction's status.
 * </pre>
 *
 * Protobuf type {@code bloombox.services.ledger.v1beta1.InflightTransaction}
 */
public  final class InflightTransaction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:bloombox.services.ledger.v1beta1.InflightTransaction)
    InflightTransactionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InflightTransaction.newBuilder() to construct.
  private InflightTransaction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InflightTransaction() {
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InflightTransaction(
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
          case 8: {
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 18: {
            io.bloombox.schema.ledger.Transactions.Transaction.Builder subBuilder = null;
            if (txn_ != null) {
              subBuilder = txn_.toBuilder();
            }
            txn_ = input.readMessage(io.bloombox.schema.ledger.Transactions.Transaction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(txn_);
              txn_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
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
    return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.internal_static_bloombox_services_ledger_v1beta1_InflightTransaction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.internal_static_bloombox_services_ledger_v1beta1_InflightTransaction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.class, io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <pre>
   * Specifies the status of an inflight transaction.
   * </pre>
   *
   * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Specifies the status of an inflight transaction.
   * </pre>
   *
   * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
   */
  public io.bloombox.schema.services.ledger.v1beta1.TransactionStatus getStatus() {
    @SuppressWarnings("deprecation")
    io.bloombox.schema.services.ledger.v1beta1.TransactionStatus result = io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.valueOf(status_);
    return result == null ? io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.UNRECOGNIZED : result;
  }

  public static final int TXN_FIELD_NUMBER = 2;
  private io.bloombox.schema.ledger.Transactions.Transaction txn_;
  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  public boolean hasTxn() {
    return txn_ != null;
  }
  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  public io.bloombox.schema.ledger.Transactions.Transaction getTxn() {
    return txn_ == null ? io.bloombox.schema.ledger.Transactions.Transaction.getDefaultInstance() : txn_;
  }
  /**
   * <pre>
   * Transaction object. Provided when the transaction has finalized.
   * </pre>
   *
   * <code>.bloombox.ledger.Transaction txn = 2;</code>
   */
  public io.bloombox.schema.ledger.Transactions.TransactionOrBuilder getTxnOrBuilder() {
    return getTxn();
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
    if (status_ != io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.INFLIGHT.getNumber()) {
      output.writeEnum(1, status_);
    }
    if (txn_ != null) {
      output.writeMessage(2, getTxn());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.INFLIGHT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
    }
    if (txn_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTxn());
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
    if (!(obj instanceof io.bloombox.schema.services.ledger.v1beta1.InflightTransaction)) {
      return super.equals(obj);
    }
    io.bloombox.schema.services.ledger.v1beta1.InflightTransaction other = (io.bloombox.schema.services.ledger.v1beta1.InflightTransaction) obj;

    if (status_ != other.status_) return false;
    if (hasTxn() != other.hasTxn()) return false;
    if (hasTxn()) {
      if (!getTxn()
          .equals(other.getTxn())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    if (hasTxn()) {
      hash = (37 * hash) + TXN_FIELD_NUMBER;
      hash = (53 * hash) + getTxn().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parseFrom(
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
  public static Builder newBuilder(io.bloombox.schema.services.ledger.v1beta1.InflightTransaction prototype) {
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
   * Specifies an RPC structure that provides an update regarding an in-flight transaction's status.
   * </pre>
   *
   * Protobuf type {@code bloombox.services.ledger.v1beta1.InflightTransaction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:bloombox.services.ledger.v1beta1.InflightTransaction)
      io.bloombox.schema.services.ledger.v1beta1.InflightTransactionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.internal_static_bloombox_services_ledger_v1beta1_InflightTransaction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.internal_static_bloombox_services_ledger_v1beta1_InflightTransaction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.class, io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.Builder.class);
    }

    // Construct using io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.newBuilder()
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
      status_ = 0;

      if (txnBuilder_ == null) {
        txn_ = null;
      } else {
        txn_ = null;
        txnBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.internal_static_bloombox_services_ledger_v1beta1_InflightTransaction_descriptor;
    }

    @java.lang.Override
    public io.bloombox.schema.services.ledger.v1beta1.InflightTransaction getDefaultInstanceForType() {
      return io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.getDefaultInstance();
    }

    @java.lang.Override
    public io.bloombox.schema.services.ledger.v1beta1.InflightTransaction build() {
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.bloombox.schema.services.ledger.v1beta1.InflightTransaction buildPartial() {
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction result = new io.bloombox.schema.services.ledger.v1beta1.InflightTransaction(this);
      result.status_ = status_;
      if (txnBuilder_ == null) {
        result.txn_ = txn_;
      } else {
        result.txn_ = txnBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.bloombox.schema.services.ledger.v1beta1.InflightTransaction) {
        return mergeFrom((io.bloombox.schema.services.ledger.v1beta1.InflightTransaction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.bloombox.schema.services.ledger.v1beta1.InflightTransaction other) {
      if (other == io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (other.hasTxn()) {
        mergeTxn(other.getTxn());
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
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.bloombox.schema.services.ledger.v1beta1.InflightTransaction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Specifies the status of an inflight transaction.
     * </pre>
     *
     * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Specifies the status of an inflight transaction.
     * </pre>
     *
     * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the status of an inflight transaction.
     * </pre>
     *
     * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
     */
    public io.bloombox.schema.services.ledger.v1beta1.TransactionStatus getStatus() {
      @SuppressWarnings("deprecation")
      io.bloombox.schema.services.ledger.v1beta1.TransactionStatus result = io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.valueOf(status_);
      return result == null ? io.bloombox.schema.services.ledger.v1beta1.TransactionStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies the status of an inflight transaction.
     * </pre>
     *
     * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
     */
    public Builder setStatus(io.bloombox.schema.services.ledger.v1beta1.TransactionStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the status of an inflight transaction.
     * </pre>
     *
     * <code>.bloombox.services.ledger.v1beta1.TransactionStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private io.bloombox.schema.ledger.Transactions.Transaction txn_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.ledger.Transactions.Transaction.Builder, io.bloombox.schema.ledger.Transactions.TransactionOrBuilder> txnBuilder_;
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public boolean hasTxn() {
      return txnBuilder_ != null || txn_ != null;
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public io.bloombox.schema.ledger.Transactions.Transaction getTxn() {
      if (txnBuilder_ == null) {
        return txn_ == null ? io.bloombox.schema.ledger.Transactions.Transaction.getDefaultInstance() : txn_;
      } else {
        return txnBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public Builder setTxn(io.bloombox.schema.ledger.Transactions.Transaction value) {
      if (txnBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        txn_ = value;
        onChanged();
      } else {
        txnBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public Builder setTxn(
        io.bloombox.schema.ledger.Transactions.Transaction.Builder builderForValue) {
      if (txnBuilder_ == null) {
        txn_ = builderForValue.build();
        onChanged();
      } else {
        txnBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public Builder mergeTxn(io.bloombox.schema.ledger.Transactions.Transaction value) {
      if (txnBuilder_ == null) {
        if (txn_ != null) {
          txn_ =
            io.bloombox.schema.ledger.Transactions.Transaction.newBuilder(txn_).mergeFrom(value).buildPartial();
        } else {
          txn_ = value;
        }
        onChanged();
      } else {
        txnBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public Builder clearTxn() {
      if (txnBuilder_ == null) {
        txn_ = null;
        onChanged();
      } else {
        txn_ = null;
        txnBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public io.bloombox.schema.ledger.Transactions.Transaction.Builder getTxnBuilder() {
      
      onChanged();
      return getTxnFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    public io.bloombox.schema.ledger.Transactions.TransactionOrBuilder getTxnOrBuilder() {
      if (txnBuilder_ != null) {
        return txnBuilder_.getMessageOrBuilder();
      } else {
        return txn_ == null ?
            io.bloombox.schema.ledger.Transactions.Transaction.getDefaultInstance() : txn_;
      }
    }
    /**
     * <pre>
     * Transaction object. Provided when the transaction has finalized.
     * </pre>
     *
     * <code>.bloombox.ledger.Transaction txn = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.ledger.Transactions.Transaction.Builder, io.bloombox.schema.ledger.Transactions.TransactionOrBuilder> 
        getTxnFieldBuilder() {
      if (txnBuilder_ == null) {
        txnBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.ledger.Transactions.Transaction.Builder, io.bloombox.schema.ledger.Transactions.TransactionOrBuilder>(
                getTxn(),
                getParentForChildren(),
                isClean());
        txn_ = null;
      }
      return txnBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:bloombox.services.ledger.v1beta1.InflightTransaction)
  }

  // @@protoc_insertion_point(class_scope:bloombox.services.ledger.v1beta1.InflightTransaction)
  private static final io.bloombox.schema.services.ledger.v1beta1.InflightTransaction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.bloombox.schema.services.ledger.v1beta1.InflightTransaction();
  }

  public static io.bloombox.schema.services.ledger.v1beta1.InflightTransaction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InflightTransaction>
      PARSER = new com.google.protobuf.AbstractParser<InflightTransaction>() {
    @java.lang.Override
    public InflightTransaction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InflightTransaction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InflightTransaction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InflightTransaction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.bloombox.schema.services.ledger.v1beta1.InflightTransaction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

