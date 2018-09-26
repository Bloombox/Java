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

package io.bloombox.schema.services.ledger.v1beta1;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
 * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
 * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
 * intangible value.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: ledger/v1beta1/LedgerService_Beta1.proto")
public final class LedgerGrpc {

  private LedgerGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.ledger.v1beta1.Ledger";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> METHOD_GET_ASSET =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "GetAsset"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> METHOD_GET_TRANSACTION =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "GetTransaction"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> METHOD_GET_ASSET_HISTORY =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "GetAssetHistory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> METHOD_GET_ACCOUNT_HOLDINGS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "GetAccountHoldings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> METHOD_GET_ACCOUNT_HISTORY =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "GetAccountHistory"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> METHOD_CREATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request, io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "Create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> METHOD_TRANSFER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request, io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "Transfer"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.ledger.Transactions.Transaction,
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> METHOD_TRANSACT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.services.ledger.v1beta1.InflightTransaction>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.ledger.v1beta1.Ledger", "Transact"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.ledger.Transactions.Transaction.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LedgerStub newStub(io.grpc.Channel channel) {
    return new LedgerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LedgerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LedgerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LedgerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LedgerFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
   * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
   * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
   * intangible value.
   * </pre>
   */
  public static abstract class LedgerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve an individual digital asset from the ledger.
     * </pre>
     */
    public void getAsset(io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ASSET, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public void getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_TRANSACTION, responseObserver);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public void getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ASSET_HISTORY, responseObserver);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public void getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACCOUNT_HOLDINGS, responseObserver);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public void getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ACCOUNT_HISTORY, responseObserver);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public void create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRANSFER, responseObserver);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public void transact(io.bloombox.schema.ledger.Transactions.Transaction request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TRANSACT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ASSET,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request,
                io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response>(
                  this, METHODID_GET_ASSET)))
          .addMethod(
            METHOD_GET_TRANSACTION,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request,
                io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            METHOD_GET_ASSET_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response>(
                  this, METHODID_GET_ASSET_HISTORY)))
          .addMethod(
            METHOD_GET_ACCOUNT_HOLDINGS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request,
                io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response>(
                  this, METHODID_GET_ACCOUNT_HOLDINGS)))
          .addMethod(
            METHOD_GET_ACCOUNT_HISTORY,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request,
                io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response>(
                  this, METHODID_GET_ACCOUNT_HISTORY)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            METHOD_TRANSFER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response>(
                  this, METHODID_TRANSFER)))
          .addMethod(
            METHOD_TRANSACT,
            asyncServerStreamingCall(
              new MethodHandlers<
                io.bloombox.schema.ledger.Transactions.Transaction,
                io.bloombox.schema.services.ledger.v1beta1.InflightTransaction>(
                  this, METHODID_TRANSACT)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
   * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
   * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
   * intangible value.
   * </pre>
   */
  public static final class LedgerStub extends io.grpc.stub.AbstractStub<LedgerStub> {
    private LedgerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LedgerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LedgerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LedgerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual digital asset from the ledger.
     * </pre>
     */
    public void getAsset(io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ASSET, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public void getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public void getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ASSET_HISTORY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public void getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_HOLDINGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public void getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_HISTORY, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public void create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TRANSFER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public void transact(io.bloombox.schema.ledger.Transactions.Transaction request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_TRANSACT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
   * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
   * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
   * intangible value.
   * </pre>
   */
  public static final class LedgerBlockingStub extends io.grpc.stub.AbstractStub<LedgerBlockingStub> {
    private LedgerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LedgerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LedgerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LedgerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual digital asset from the ledger.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response getAsset(io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ASSET, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_TRANSACTION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ASSET_HISTORY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCOUNT_HOLDINGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ACCOUNT_HISTORY, getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TRANSFER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public java.util.Iterator<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> transact(
        io.bloombox.schema.ledger.Transactions.Transaction request) {
      return blockingServerStreamingCall(
          getChannel(), METHOD_TRANSACT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
   * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
   * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
   * intangible value.
   * </pre>
   */
  public static final class LedgerFutureStub extends io.grpc.stub.AbstractStub<LedgerFutureStub> {
    private LedgerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LedgerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LedgerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LedgerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual digital asset from the ledger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> getAsset(
        io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ASSET, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> getTransaction(
        io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_TRANSACTION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> getAssetHistory(
        io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ASSET_HISTORY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> getAccountHoldings(
        io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_HOLDINGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> getAccountHistory(
        io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ACCOUNT_HISTORY, getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> create(
        io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> transfer(
        io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TRANSFER, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ASSET = 0;
  private static final int METHODID_GET_TRANSACTION = 1;
  private static final int METHODID_GET_ASSET_HISTORY = 2;
  private static final int METHODID_GET_ACCOUNT_HOLDINGS = 3;
  private static final int METHODID_GET_ACCOUNT_HISTORY = 4;
  private static final int METHODID_CREATE = 5;
  private static final int METHODID_TRANSFER = 6;
  private static final int METHODID_TRANSACT = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LedgerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LedgerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ASSET:
          serviceImpl.getAsset((io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response>) responseObserver);
          break;
        case METHODID_GET_TRANSACTION:
          serviceImpl.getTransaction((io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response>) responseObserver);
          break;
        case METHODID_GET_ASSET_HISTORY:
          serviceImpl.getAssetHistory((io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_HOLDINGS:
          serviceImpl.getAccountHoldings((io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_HISTORY:
          serviceImpl.getAccountHistory((io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response>) responseObserver);
          break;
        case METHODID_TRANSACT:
          serviceImpl.transact((io.bloombox.schema.ledger.Transactions.Transaction) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class LedgerDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (LedgerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LedgerDescriptorSupplier())
              .addMethod(METHOD_GET_ASSET)
              .addMethod(METHOD_GET_TRANSACTION)
              .addMethod(METHOD_GET_ASSET_HISTORY)
              .addMethod(METHOD_GET_ACCOUNT_HOLDINGS)
              .addMethod(METHOD_GET_ACCOUNT_HISTORY)
              .addMethod(METHOD_CREATE)
              .addMethod(METHOD_TRANSFER)
              .addMethod(METHOD_TRANSACT)
              .build();
        }
      }
    }
    return result;
  }
}
