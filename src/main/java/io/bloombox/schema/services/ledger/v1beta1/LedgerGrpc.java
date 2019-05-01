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

package io.bloombox.schema.services.ledger.v1beta1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Specifies the Ledger service, which can be used to interact with distributed ledger services. The elements of the
 * distributed ledger include transactions and assets. Transactions are split into CREATE and TRANSFER transactions,
 * which issue or create, and interchange, assets, respectively. Assets are digital representations of tangible or
 * intangible value.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: ledger/v1beta1/LedgerService_Beta1.proto")
public final class LedgerGrpc {

  private LedgerGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.ledger.v1beta1.Ledger";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> getGetAssetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAsset",
      requestType = io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> getGetAssetMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response> getGetAssetMethod;
    if ((getGetAssetMethod = LedgerGrpc.getGetAssetMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getGetAssetMethod = LedgerGrpc.getGetAssetMethod) == null) {
          LedgerGrpc.getGetAssetMethod = getGetAssetMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "GetAsset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("GetAsset"))
                  .build();
          }
        }
     }
     return getGetAssetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> getGetTransactionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTransaction",
      requestType = io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request,
      io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> getGetTransactionMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> getGetTransactionMethod;
    if ((getGetTransactionMethod = LedgerGrpc.getGetTransactionMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getGetTransactionMethod = LedgerGrpc.getGetTransactionMethod) == null) {
          LedgerGrpc.getGetTransactionMethod = getGetTransactionMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request, io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "GetTransaction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("GetTransaction"))
                  .build();
          }
        }
     }
     return getGetTransactionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> getGetAssetHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAssetHistory",
      requestType = io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> getGetAssetHistoryMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> getGetAssetHistoryMethod;
    if ((getGetAssetHistoryMethod = LedgerGrpc.getGetAssetHistoryMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getGetAssetHistoryMethod = LedgerGrpc.getGetAssetHistoryMethod) == null) {
          LedgerGrpc.getGetAssetHistoryMethod = getGetAssetHistoryMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "GetAssetHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("GetAssetHistory"))
                  .build();
          }
        }
     }
     return getGetAssetHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> getGetAccountHoldingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountHoldings",
      requestType = io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> getGetAccountHoldingsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> getGetAccountHoldingsMethod;
    if ((getGetAccountHoldingsMethod = LedgerGrpc.getGetAccountHoldingsMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getGetAccountHoldingsMethod = LedgerGrpc.getGetAccountHoldingsMethod) == null) {
          LedgerGrpc.getGetAccountHoldingsMethod = getGetAccountHoldingsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "GetAccountHoldings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("GetAccountHoldings"))
                  .build();
          }
        }
     }
     return getGetAccountHoldingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> getGetAccountHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountHistory",
      requestType = io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request,
      io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> getGetAccountHistoryMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> getGetAccountHistoryMethod;
    if ((getGetAccountHistoryMethod = LedgerGrpc.getGetAccountHistoryMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getGetAccountHistoryMethod = LedgerGrpc.getGetAccountHistoryMethod) == null) {
          LedgerGrpc.getGetAccountHistoryMethod = getGetAccountHistoryMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request, io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "GetAccountHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("GetAccountHistory"))
                  .build();
          }
        }
     }
     return getGetAccountHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request, io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> getCreateMethod;
    if ((getCreateMethod = LedgerGrpc.getCreateMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getCreateMethod = LedgerGrpc.getCreateMethod) == null) {
          LedgerGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request, io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("Create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transfer",
      requestType = io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request,
      io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> getTransferMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request, io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> getTransferMethod;
    if ((getTransferMethod = LedgerGrpc.getTransferMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getTransferMethod = LedgerGrpc.getTransferMethod) == null) {
          LedgerGrpc.getTransferMethod = getTransferMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request, io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "Transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("Transfer"))
                  .build();
          }
        }
     }
     return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.ledger.Transactions.Transaction,
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> getTransactMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Transact",
      requestType = io.bloombox.schema.ledger.Transactions.Transaction.class,
      responseType = io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.ledger.Transactions.Transaction,
      io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> getTransactMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> getTransactMethod;
    if ((getTransactMethod = LedgerGrpc.getTransactMethod) == null) {
      synchronized (LedgerGrpc.class) {
        if ((getTransactMethod = LedgerGrpc.getTransactMethod) == null) {
          LedgerGrpc.getTransactMethod = getTransactMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.ledger.Transactions.Transaction, io.bloombox.schema.services.ledger.v1beta1.InflightTransaction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.ledger.v1beta1.Ledger", "Transact"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.ledger.Transactions.Transaction.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.ledger.v1beta1.InflightTransaction.getDefaultInstance()))
                  .setSchemaDescriptor(new LedgerMethodDescriptorSupplier("Transact"))
                  .build();
          }
        }
     }
     return getTransactMethod;
  }

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
      asyncUnimplementedUnaryCall(getGetAssetMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public void getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTransactionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public void getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public void getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountHoldingsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public void getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountHistoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public void create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public void transact(io.bloombox.schema.ledger.Transactions.Transaction request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> responseObserver) {
      asyncUnimplementedUnaryCall(getTransactMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAssetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Request,
                io.bloombox.schema.services.ledger.v1beta1.RetrieveAsset.Response>(
                  this, METHODID_GET_ASSET)))
          .addMethod(
            getGetTransactionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request,
                io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response>(
                  this, METHODID_GET_TRANSACTION)))
          .addMethod(
            getGetAssetHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response>(
                  this, METHODID_GET_ASSET_HISTORY)))
          .addMethod(
            getGetAccountHoldingsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request,
                io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response>(
                  this, METHODID_GET_ACCOUNT_HOLDINGS)))
          .addMethod(
            getGetAccountHistoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request,
                io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response>(
                  this, METHODID_GET_ACCOUNT_HISTORY)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getTransferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request,
                io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response>(
                  this, METHODID_TRANSFER)))
          .addMethod(
            getTransactMethod(),
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
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public void getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public void getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public void getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountHoldingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public void getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public void create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public void transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public void transact(io.bloombox.schema.ledger.Transactions.Transaction request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getTransactMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getGetAssetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response getTransaction(io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetTransactionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response getAssetHistory(io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response getAccountHoldings(io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountHoldingsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response getAccountHistory(io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountHistoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response create(io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response transfer(io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request) {
      return blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Low-level method to execute a raw transaction, and receive a stream of responses as status changes.
     * </pre>
     */
    public java.util.Iterator<io.bloombox.schema.services.ledger.v1beta1.InflightTransaction> transact(
        io.bloombox.schema.ledger.Transactions.Transaction request) {
      return blockingServerStreamingCall(
          getChannel(), getTransactMethod(), getCallOptions(), request);
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
          getChannel().newCall(getGetAssetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual transaction from the ledger.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Response> getTransaction(
        io.bloombox.schema.services.ledger.v1beta1.RetrieveTransaction.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTransactionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve transaction history for a given digital asset.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Response> getAssetHistory(
        io.bloombox.schema.services.ledger.v1beta1.AssetHistory.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve holdings for a given ledger account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Response> getAccountHoldings(
        io.bloombox.schema.services.ledger.v1beta1.AccountHoldings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountHoldingsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve history for a given ledger account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Response> getAccountHistory(
        io.bloombox.schema.services.ledger.v1beta1.AccountHistory.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountHistoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a CREATE transaction to issue or create digital assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Response> create(
        io.bloombox.schema.services.ledger.v1beta1.AssetCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Execute a TRANSFER transaction to perform interchange of existing digital assets.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Response> transfer(
        io.bloombox.schema.services.ledger.v1beta1.AssetTransfer.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
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

  private static abstract class LedgerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LedgerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.ledger.v1beta1.LedgerServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Ledger");
    }
  }

  private static final class LedgerFileDescriptorSupplier
      extends LedgerBaseDescriptorSupplier {
    LedgerFileDescriptorSupplier() {}
  }

  private static final class LedgerMethodDescriptorSupplier
      extends LedgerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LedgerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
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
              .setSchemaDescriptor(new LedgerFileDescriptorSupplier())
              .addMethod(getGetAssetMethod())
              .addMethod(getGetTransactionMethod())
              .addMethod(getGetAssetHistoryMethod())
              .addMethod(getGetAccountHoldingsMethod())
              .addMethod(getGetAccountHistoryMethod())
              .addMethod(getCreateMethod())
              .addMethod(getTransferMethod())
              .addMethod(getTransactMethod())
              .build();
        }
      }
    }
    return result;
  }
}
