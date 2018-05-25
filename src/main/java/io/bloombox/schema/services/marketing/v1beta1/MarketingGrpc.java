package io.bloombox.schema.services.marketing.v1beta1;

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
 * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
 * customers identified by Bloombox user accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: marketing/v1beta1/MarketingService_Beta1.proto")
public final class MarketingGrpc {

  private MarketingGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.marketing.v1beta1.Marketing";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request,
      io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response> METHOD_TARGETING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request, io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "Targeting"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> METHOD_LIST_CAMPAIGNS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "ListCampaigns"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> METHOD_GET_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "GetCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
      com.google.protobuf.Empty> METHOD_CREATE_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "CreateCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
      com.google.protobuf.Empty> METHOD_UPDATE_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "UpdateCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
      com.google.protobuf.Empty> METHOD_SEND_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "SendCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MarketingStub newStub(io.grpc.Channel channel) {
    return new MarketingStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MarketingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MarketingBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MarketingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MarketingFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
   * customers identified by Bloombox user accounts.
   * </pre>
   */
  public static abstract class MarketingImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Fetch an audience size estimate for a given set of targeting parameters.
     * </pre>
     */
    public void targeting(io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TARGETING, responseObserver);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public void listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CAMPAIGNS, responseObserver);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public void getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_CAMPAIGN, responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public void createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CAMPAIGN, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public void updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_CAMPAIGN, responseObserver);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public void sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SEND_CAMPAIGN, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_TARGETING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request,
                io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response>(
                  this, METHODID_TARGETING)))
          .addMethod(
            METHOD_LIST_CAMPAIGNS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>(
                  this, METHODID_LIST_CAMPAIGNS)))
          .addMethod(
            METHOD_GET_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>(
                  this, METHODID_GET_CAMPAIGN)))
          .addMethod(
            METHOD_CREATE_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_CREATE_CAMPAIGN)))
          .addMethod(
            METHOD_UPDATE_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CAMPAIGN)))
          .addMethod(
            METHOD_SEND_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_CAMPAIGN)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
   * customers identified by Bloombox user accounts.
   * </pre>
   */
  public static final class MarketingStub extends io.grpc.stub.AbstractStub<MarketingStub> {
    private MarketingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an audience size estimate for a given set of targeting parameters.
     * </pre>
     */
    public void targeting(io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TARGETING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public void listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST_CAMPAIGNS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public void getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_CAMPAIGN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public void createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CAMPAIGN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public void updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CAMPAIGN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public void sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND_CAMPAIGN, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
   * customers identified by Bloombox user accounts.
   * </pre>
   */
  public static final class MarketingBlockingStub extends io.grpc.stub.AbstractStub<MarketingBlockingStub> {
    private MarketingBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketingBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketingBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketingBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an audience size estimate for a given set of targeting parameters.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response targeting(io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TARGETING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CAMPAIGNS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_CAMPAIGN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public com.google.protobuf.Empty createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CAMPAIGN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public com.google.protobuf.Empty updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_CAMPAIGN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public com.google.protobuf.Empty sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SEND_CAMPAIGN, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
   * customers identified by Bloombox user accounts.
   * </pre>
   */
  public static final class MarketingFutureStub extends io.grpc.stub.AbstractStub<MarketingFutureStub> {
    private MarketingFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MarketingFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MarketingFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MarketingFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Fetch an audience size estimate for a given set of targeting parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response> targeting(
        io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TARGETING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> listCampaigns(
        io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST_CAMPAIGNS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> getCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_CAMPAIGN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CAMPAIGN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_CAMPAIGN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND_CAMPAIGN, getCallOptions()), request);
    }
  }

  private static final int METHODID_TARGETING = 0;
  private static final int METHODID_LIST_CAMPAIGNS = 1;
  private static final int METHODID_GET_CAMPAIGN = 2;
  private static final int METHODID_CREATE_CAMPAIGN = 3;
  private static final int METHODID_UPDATE_CAMPAIGN = 4;
  private static final int METHODID_SEND_CAMPAIGN = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MarketingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MarketingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TARGETING:
          serviceImpl.targeting((io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.EstimateAudience.Response>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGNS:
          serviceImpl.listCampaigns((io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGN:
          serviceImpl.getCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>) responseObserver);
          break;
        case METHODID_CREATE_CAMPAIGN:
          serviceImpl.createCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_CAMPAIGN:
          serviceImpl.updateCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_CAMPAIGN:
          serviceImpl.sendCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request) request,
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

  private static final class MarketingDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.marketing.v1beta1.MarketingServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MarketingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MarketingDescriptorSupplier())
              .addMethod(METHOD_TARGETING)
              .addMethod(METHOD_LIST_CAMPAIGNS)
              .addMethod(METHOD_GET_CAMPAIGN)
              .addMethod(METHOD_CREATE_CAMPAIGN)
              .addMethod(METHOD_UPDATE_CAMPAIGN)
              .addMethod(METHOD_SEND_CAMPAIGN)
              .build();
        }
      }
    }
    return result;
  }
}
