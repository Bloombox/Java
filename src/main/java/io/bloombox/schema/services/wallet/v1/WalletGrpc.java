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

package io.bloombox.schema.services.wallet.v1;

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
 * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
 * passes issued for them under various circumstances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: wallet/v1/WalletService_v1.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.wallet.v1.Wallet";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardProvision.Request,
      io.bloombox.schema.services.wallet.v1.CardProvision.Response> getProvisionCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProvisionCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardProvision.Request.class,
      responseType = io.bloombox.schema.services.wallet.v1.CardProvision.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardProvision.Request,
      io.bloombox.schema.services.wallet.v1.CardProvision.Response> getProvisionCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardProvision.Request, io.bloombox.schema.services.wallet.v1.CardProvision.Response> getProvisionCardMethod;
    if ((getProvisionCardMethod = WalletGrpc.getProvisionCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getProvisionCardMethod = WalletGrpc.getProvisionCardMethod) == null) {
          WalletGrpc.getProvisionCardMethod = getProvisionCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardProvision.Request, io.bloombox.schema.services.wallet.v1.CardProvision.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "ProvisionCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardProvision.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardProvision.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ProvisionCard"))
                  .build();
          }
        }
     }
     return getProvisionCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardIssuance.Request,
      io.bloombox.schema.services.wallet.v1.CardIssuance.Response> getIssueCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IssueCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardIssuance.Request.class,
      responseType = io.bloombox.schema.services.wallet.v1.CardIssuance.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardIssuance.Request,
      io.bloombox.schema.services.wallet.v1.CardIssuance.Response> getIssueCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardIssuance.Request, io.bloombox.schema.services.wallet.v1.CardIssuance.Response> getIssueCardMethod;
    if ((getIssueCardMethod = WalletGrpc.getIssueCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getIssueCardMethod = WalletGrpc.getIssueCardMethod) == null) {
          WalletGrpc.getIssueCardMethod = getIssueCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardIssuance.Request, io.bloombox.schema.services.wallet.v1.CardIssuance.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "IssueCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardIssuance.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardIssuance.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("IssueCard"))
                  .build();
          }
        }
     }
     return getIssueCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardList.Request,
      io.bloombox.schema.services.wallet.v1.CardList.Response> getListCardsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCards",
      requestType = io.bloombox.schema.services.wallet.v1.CardList.Request.class,
      responseType = io.bloombox.schema.services.wallet.v1.CardList.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardList.Request,
      io.bloombox.schema.services.wallet.v1.CardList.Response> getListCardsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardList.Request, io.bloombox.schema.services.wallet.v1.CardList.Response> getListCardsMethod;
    if ((getListCardsMethod = WalletGrpc.getListCardsMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getListCardsMethod = WalletGrpc.getListCardsMethod) == null) {
          WalletGrpc.getListCardsMethod = getListCardsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardList.Request, io.bloombox.schema.services.wallet.v1.CardList.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "ListCards"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardList.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardList.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ListCards"))
                  .build();
          }
        }
     }
     return getListCardsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardActivate.Request,
      com.google.protobuf.Empty> getActivateCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardActivate.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardActivate.Request,
      com.google.protobuf.Empty> getActivateCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardActivate.Request, com.google.protobuf.Empty> getActivateCardMethod;
    if ((getActivateCardMethod = WalletGrpc.getActivateCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getActivateCardMethod = WalletGrpc.getActivateCardMethod) == null) {
          WalletGrpc.getActivateCardMethod = getActivateCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardActivate.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "ActivateCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardActivate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("ActivateCard"))
                  .build();
          }
        }
     }
     return getActivateCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request,
      io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> getRetrieveCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardRetrieve.Request.class,
      responseType = io.bloombox.schema.services.wallet.v1.CardRetrieve.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request,
      io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> getRetrieveCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request, io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> getRetrieveCardMethod;
    if ((getRetrieveCardMethod = WalletGrpc.getRetrieveCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getRetrieveCardMethod = WalletGrpc.getRetrieveCardMethod) == null) {
          WalletGrpc.getRetrieveCardMethod = getRetrieveCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request, io.bloombox.schema.services.wallet.v1.CardRetrieve.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "RetrieveCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardRetrieve.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardRetrieve.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("RetrieveCard"))
                  .build();
          }
        }
     }
     return getRetrieveCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardEnroll.Request,
      io.bloombox.schema.services.wallet.v1.CardEnroll.Response> getPersonalizeCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PersonalizeCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardEnroll.Request.class,
      responseType = io.bloombox.schema.services.wallet.v1.CardEnroll.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardEnroll.Request,
      io.bloombox.schema.services.wallet.v1.CardEnroll.Response> getPersonalizeCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardEnroll.Request, io.bloombox.schema.services.wallet.v1.CardEnroll.Response> getPersonalizeCardMethod;
    if ((getPersonalizeCardMethod = WalletGrpc.getPersonalizeCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getPersonalizeCardMethod = WalletGrpc.getPersonalizeCardMethod) == null) {
          WalletGrpc.getPersonalizeCardMethod = getPersonalizeCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardEnroll.Request, io.bloombox.schema.services.wallet.v1.CardEnroll.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "PersonalizeCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardEnroll.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardEnroll.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("PersonalizeCard"))
                  .build();
          }
        }
     }
     return getPersonalizeCardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardVoid.Request,
      com.google.protobuf.Empty> getDecommissionCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecommissionCard",
      requestType = io.bloombox.schema.services.wallet.v1.CardVoid.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardVoid.Request,
      com.google.protobuf.Empty> getDecommissionCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardVoid.Request, com.google.protobuf.Empty> getDecommissionCardMethod;
    if ((getDecommissionCardMethod = WalletGrpc.getDecommissionCardMethod) == null) {
      synchronized (WalletGrpc.class) {
        if ((getDecommissionCardMethod = WalletGrpc.getDecommissionCardMethod) == null) {
          WalletGrpc.getDecommissionCardMethod = getDecommissionCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardVoid.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.wallet.v1.Wallet", "DecommissionCard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.wallet.v1.CardVoid.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletMethodDescriptorSupplier("DecommissionCard"))
                  .build();
          }
        }
     }
     return getDecommissionCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletStub newStub(io.grpc.Channel channel) {
    return new WalletStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletFutureStub(channel);
  }

  /**
   * <pre>
   * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
   * passes issued for them under various circumstances.
   * </pre>
   */
  public static abstract class WalletImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Provision a new digital pass card record, for later issuance.
     * </pre>
     */
    public void provisionCard(io.bloombox.schema.services.wallet.v1.CardProvision.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardProvision.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getProvisionCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public void issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public void listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getListCardsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public void activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public void retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public void personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPersonalizeCardMethod(), responseObserver);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public void decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDecommissionCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProvisionCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardProvision.Request,
                io.bloombox.schema.services.wallet.v1.CardProvision.Response>(
                  this, METHODID_PROVISION_CARD)))
          .addMethod(
            getIssueCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardIssuance.Request,
                io.bloombox.schema.services.wallet.v1.CardIssuance.Response>(
                  this, METHODID_ISSUE_CARD)))
          .addMethod(
            getListCardsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardList.Request,
                io.bloombox.schema.services.wallet.v1.CardList.Response>(
                  this, METHODID_LIST_CARDS)))
          .addMethod(
            getActivateCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardActivate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_ACTIVATE_CARD)))
          .addMethod(
            getRetrieveCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardRetrieve.Request,
                io.bloombox.schema.services.wallet.v1.CardRetrieve.Response>(
                  this, METHODID_RETRIEVE_CARD)))
          .addMethod(
            getPersonalizeCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardEnroll.Request,
                io.bloombox.schema.services.wallet.v1.CardEnroll.Response>(
                  this, METHODID_PERSONALIZE_CARD)))
          .addMethod(
            getDecommissionCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardVoid.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_DECOMMISSION_CARD)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
   * passes issued for them under various circumstances.
   * </pre>
   */
  public static final class WalletStub extends io.grpc.stub.AbstractStub<WalletStub> {
    private WalletStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provision a new digital pass card record, for later issuance.
     * </pre>
     */
    public void provisionCard(io.bloombox.schema.services.wallet.v1.CardProvision.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardProvision.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProvisionCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public void issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public void listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCardsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public void activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public void retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public void personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPersonalizeCardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public void decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDecommissionCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
   * passes issued for them under various circumstances.
   * </pre>
   */
  public static final class WalletBlockingStub extends io.grpc.stub.AbstractStub<WalletBlockingStub> {
    private WalletBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provision a new digital pass card record, for later issuance.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardProvision.Response provisionCard(io.bloombox.schema.services.wallet.v1.CardProvision.Request request) {
      return blockingUnaryCall(
          getChannel(), getProvisionCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardIssuance.Response issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request) {
      return blockingUnaryCall(
          getChannel(), getIssueCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardList.Response listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request) {
      return blockingUnaryCall(
          getChannel(), getListCardsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public com.google.protobuf.Empty activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request) {
      return blockingUnaryCall(
          getChannel(), getActivateCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardRetrieve.Response retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardEnroll.Response personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request) {
      return blockingUnaryCall(
          getChannel(), getPersonalizeCardMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public com.google.protobuf.Empty decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request) {
      return blockingUnaryCall(
          getChannel(), getDecommissionCardMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
   * passes issued for them under various circumstances.
   * </pre>
   */
  public static final class WalletFutureStub extends io.grpc.stub.AbstractStub<WalletFutureStub> {
    private WalletFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Provision a new digital pass card record, for later issuance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardProvision.Response> provisionCard(
        io.bloombox.schema.services.wallet.v1.CardProvision.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getProvisionCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> issueCard(
        io.bloombox.schema.services.wallet.v1.CardIssuance.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardList.Response> listCards(
        io.bloombox.schema.services.wallet.v1.CardList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListCardsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> activateCard(
        io.bloombox.schema.services.wallet.v1.CardActivate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> retrieveCard(
        io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> personalizeCard(
        io.bloombox.schema.services.wallet.v1.CardEnroll.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPersonalizeCardMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> decommissionCard(
        io.bloombox.schema.services.wallet.v1.CardVoid.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDecommissionCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROVISION_CARD = 0;
  private static final int METHODID_ISSUE_CARD = 1;
  private static final int METHODID_LIST_CARDS = 2;
  private static final int METHODID_ACTIVATE_CARD = 3;
  private static final int METHODID_RETRIEVE_CARD = 4;
  private static final int METHODID_PERSONALIZE_CARD = 5;
  private static final int METHODID_DECOMMISSION_CARD = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROVISION_CARD:
          serviceImpl.provisionCard((io.bloombox.schema.services.wallet.v1.CardProvision.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardProvision.Response>) responseObserver);
          break;
        case METHODID_ISSUE_CARD:
          serviceImpl.issueCard((io.bloombox.schema.services.wallet.v1.CardIssuance.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardIssuance.Response>) responseObserver);
          break;
        case METHODID_LIST_CARDS:
          serviceImpl.listCards((io.bloombox.schema.services.wallet.v1.CardList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardList.Response>) responseObserver);
          break;
        case METHODID_ACTIVATE_CARD:
          serviceImpl.activateCard((io.bloombox.schema.services.wallet.v1.CardActivate.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RETRIEVE_CARD:
          serviceImpl.retrieveCard((io.bloombox.schema.services.wallet.v1.CardRetrieve.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response>) responseObserver);
          break;
        case METHODID_PERSONALIZE_CARD:
          serviceImpl.personalizeCard((io.bloombox.schema.services.wallet.v1.CardEnroll.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardEnroll.Response>) responseObserver);
          break;
        case METHODID_DECOMMISSION_CARD:
          serviceImpl.decommissionCard((io.bloombox.schema.services.wallet.v1.CardVoid.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static abstract class WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.wallet.v1.WalletServiceV1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Wallet");
    }
  }

  private static final class WalletFileDescriptorSupplier
      extends WalletBaseDescriptorSupplier {
    WalletFileDescriptorSupplier() {}
  }

  private static final class WalletMethodDescriptorSupplier
      extends WalletBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletFileDescriptorSupplier())
              .addMethod(getProvisionCardMethod())
              .addMethod(getIssueCardMethod())
              .addMethod(getListCardsMethod())
              .addMethod(getActivateCardMethod())
              .addMethod(getRetrieveCardMethod())
              .addMethod(getPersonalizeCardMethod())
              .addMethod(getDecommissionCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
