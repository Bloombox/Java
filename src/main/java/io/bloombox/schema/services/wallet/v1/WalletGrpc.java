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

package io.bloombox.schema.services.wallet.v1;

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
 * Provides the Wallet API, which allows a user to provision issue, manage, and otherwise control digital wallet card
 * passes issued for them under various circumstances.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: wallet/v1/WalletService_v1.proto")
public final class WalletGrpc {

  private WalletGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.wallet.v1.Wallet";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardProvision.Request,
      io.bloombox.schema.services.wallet.v1.CardProvision.Response> METHOD_PROVISION_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardProvision.Request, io.bloombox.schema.services.wallet.v1.CardProvision.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "ProvisionCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardProvision.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardProvision.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardIssuance.Request,
      io.bloombox.schema.services.wallet.v1.CardIssuance.Response> METHOD_ISSUE_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardIssuance.Request, io.bloombox.schema.services.wallet.v1.CardIssuance.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "IssueCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardIssuance.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardIssuance.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardList.Request,
      io.bloombox.schema.services.wallet.v1.CardList.Response> METHOD_LIST_CARDS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardList.Request, io.bloombox.schema.services.wallet.v1.CardList.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "ListCards"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardList.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardList.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardActivate.Request,
      com.google.protobuf.Empty> METHOD_ACTIVATE_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardActivate.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "ActivateCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardActivate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request,
      io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> METHOD_RETRIEVE_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardRetrieve.Request, io.bloombox.schema.services.wallet.v1.CardRetrieve.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "RetrieveCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardRetrieve.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardRetrieve.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardEnroll.Request,
      io.bloombox.schema.services.wallet.v1.CardEnroll.Response> METHOD_PERSONALIZE_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardEnroll.Request, io.bloombox.schema.services.wallet.v1.CardEnroll.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "PersonalizeCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardEnroll.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardEnroll.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.wallet.v1.CardVoid.Request,
      com.google.protobuf.Empty> METHOD_DECOMMISSION_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.wallet.v1.CardVoid.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.wallet.v1.Wallet", "DecommissionCard"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.wallet.v1.CardVoid.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

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
      asyncUnimplementedUnaryCall(METHOD_PROVISION_CARD, responseObserver);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public void issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ISSUE_CARD, responseObserver);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public void listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CARDS, responseObserver);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public void activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACTIVATE_CARD, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public void retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE_CARD, responseObserver);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public void personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PERSONALIZE_CARD, responseObserver);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public void decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DECOMMISSION_CARD, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PROVISION_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardProvision.Request,
                io.bloombox.schema.services.wallet.v1.CardProvision.Response>(
                  this, METHODID_PROVISION_CARD)))
          .addMethod(
            METHOD_ISSUE_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardIssuance.Request,
                io.bloombox.schema.services.wallet.v1.CardIssuance.Response>(
                  this, METHODID_ISSUE_CARD)))
          .addMethod(
            METHOD_LIST_CARDS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardList.Request,
                io.bloombox.schema.services.wallet.v1.CardList.Response>(
                  this, METHODID_LIST_CARDS)))
          .addMethod(
            METHOD_ACTIVATE_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardActivate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_ACTIVATE_CARD)))
          .addMethod(
            METHOD_RETRIEVE_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardRetrieve.Request,
                io.bloombox.schema.services.wallet.v1.CardRetrieve.Response>(
                  this, METHODID_RETRIEVE_CARD)))
          .addMethod(
            METHOD_PERSONALIZE_CARD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.wallet.v1.CardEnroll.Request,
                io.bloombox.schema.services.wallet.v1.CardEnroll.Response>(
                  this, METHODID_PERSONALIZE_CARD)))
          .addMethod(
            METHOD_DECOMMISSION_CARD,
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
          getChannel().newCall(METHOD_PROVISION_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public void issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ISSUE_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public void listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CARDS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public void activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public void retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public void personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PERSONALIZE_CARD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public void decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DECOMMISSION_CARD, getCallOptions()), request, responseObserver);
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
          getChannel(), METHOD_PROVISION_CARD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardIssuance.Response issueCard(io.bloombox.schema.services.wallet.v1.CardIssuance.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ISSUE_CARD, getCallOptions(), request);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardList.Response listCards(io.bloombox.schema.services.wallet.v1.CardList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CARDS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public com.google.protobuf.Empty activateCard(io.bloombox.schema.services.wallet.v1.CardActivate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACTIVATE_CARD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardRetrieve.Response retrieveCard(io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE_CARD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public io.bloombox.schema.services.wallet.v1.CardEnroll.Response personalizeCard(io.bloombox.schema.services.wallet.v1.CardEnroll.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PERSONALIZE_CARD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public com.google.protobuf.Empty decommissionCard(io.bloombox.schema.services.wallet.v1.CardVoid.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DECOMMISSION_CARD, getCallOptions(), request);
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
          getChannel().newCall(METHOD_PROVISION_CARD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Issue a previously-provisioned digital pass card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardIssuance.Response> issueCard(
        io.bloombox.schema.services.wallet.v1.CardIssuance.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ISSUE_CARD, getCallOptions()), request);
    }

    /**
     * <pre>
     * List cards for a given user, potentially in a given partnership context.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardList.Response> listCards(
        io.bloombox.schema.services.wallet.v1.CardList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CARDS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Register a wallet pass for remote updates.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> activateCard(
        io.bloombox.schema.services.wallet.v1.CardActivate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACTIVATE_CARD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve the latest version of a given wallet pass.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardRetrieve.Response> retrieveCard(
        io.bloombox.schema.services.wallet.v1.CardRetrieve.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE_CARD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Enroll a personalized wallet pass in rewards programs.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.wallet.v1.CardEnroll.Response> personalizeCard(
        io.bloombox.schema.services.wallet.v1.CardEnroll.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PERSONALIZE_CARD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Decommission an existing digital pass card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> decommissionCard(
        io.bloombox.schema.services.wallet.v1.CardVoid.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DECOMMISSION_CARD, getCallOptions()), request);
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

  private static final class WalletDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.wallet.v1.WalletServiceV1.getDescriptor();
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
              .setSchemaDescriptor(new WalletDescriptorSupplier())
              .addMethod(METHOD_PROVISION_CARD)
              .addMethod(METHOD_ISSUE_CARD)
              .addMethod(METHOD_LIST_CARDS)
              .addMethod(METHOD_ACTIVATE_CARD)
              .addMethod(METHOD_RETRIEVE_CARD)
              .addMethod(METHOD_PERSONALIZE_CARD)
              .addMethod(METHOD_DECOMMISSION_CARD)
              .build();
        }
      }
    }
    return result;
  }
}
