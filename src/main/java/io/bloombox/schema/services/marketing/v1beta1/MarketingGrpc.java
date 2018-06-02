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
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> METHOD_CREATE_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "CreateCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response.getDefaultInstance()))
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
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request,
      com.google.protobuf.Empty> METHOD_VALIDATE_CAMPAIGN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "ValidateCampaign"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request.getDefaultInstance()))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> METHOD_ADGROUPS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "Adgroups"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> METHOD_CREATE_ADGROUP =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "CreateAdgroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> METHOD_ADGROUP =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "Adgroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request,
      com.google.protobuf.Empty> METHOD_UPDATE_ADGROUP =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.marketing.v1beta1.Marketing", "UpdateAdgroup"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request.getDefaultInstance()))
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
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public void createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_CAMPAIGN, responseObserver);
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
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public void listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST_CAMPAIGNS, responseObserver);
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
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public void validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VALIDATE_CAMPAIGN, responseObserver);
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

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public void adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADGROUPS, responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public void createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_ADGROUP, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public void adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ADGROUP, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public void updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_ADGROUP, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response>(
                  this, METHODID_CREATE_CAMPAIGN)))
          .addMethod(
            METHOD_GET_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>(
                  this, METHODID_GET_CAMPAIGN)))
          .addMethod(
            METHOD_LIST_CAMPAIGNS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>(
                  this, METHODID_LIST_CAMPAIGNS)))
          .addMethod(
            METHOD_UPDATE_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CAMPAIGN)))
          .addMethod(
            METHOD_VALIDATE_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_VALIDATE_CAMPAIGN)))
          .addMethod(
            METHOD_SEND_CAMPAIGN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_CAMPAIGN)))
          .addMethod(
            METHOD_ADGROUPS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response>(
                  this, METHODID_ADGROUPS)))
          .addMethod(
            METHOD_CREATE_ADGROUP,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response>(
                  this, METHODID_CREATE_ADGROUP)))
          .addMethod(
            METHOD_ADGROUP,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response>(
                  this, METHODID_ADGROUP)))
          .addMethod(
            METHOD_UPDATE_ADGROUP,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ADGROUP)))
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
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public void createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_CAMPAIGN, getCallOptions()), request, responseObserver);
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
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public void validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VALIDATE_CAMPAIGN, getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public void adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADGROUPS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public void createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_ADGROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public void adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ADGROUP, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public void updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADGROUP, getCallOptions()), request, responseObserver);
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
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response createCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_CAMPAIGN, getCallOptions(), request);
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
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST_CAMPAIGNS, getCallOptions(), request);
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
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public com.google.protobuf.Empty validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VALIDATE_CAMPAIGN, getCallOptions(), request);
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

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADGROUPS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_ADGROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ADGROUP, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public com.google.protobuf.Empty updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_ADGROUP, getCallOptions(), request);
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
     * Create a new marketing campaign from scratch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> createCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_CAMPAIGN, getCallOptions()), request);
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
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> validateCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VALIDATE_CAMPAIGN, getCallOptions()), request);
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

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> adgroups(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADGROUPS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> createAdgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_ADGROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> adgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ADGROUP, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAdgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_ADGROUP, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CAMPAIGN = 0;
  private static final int METHODID_GET_CAMPAIGN = 1;
  private static final int METHODID_LIST_CAMPAIGNS = 2;
  private static final int METHODID_UPDATE_CAMPAIGN = 3;
  private static final int METHODID_VALIDATE_CAMPAIGN = 4;
  private static final int METHODID_SEND_CAMPAIGN = 5;
  private static final int METHODID_ADGROUPS = 6;
  private static final int METHODID_CREATE_ADGROUP = 7;
  private static final int METHODID_ADGROUP = 8;
  private static final int METHODID_UPDATE_ADGROUP = 9;

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
        case METHODID_CREATE_CAMPAIGN:
          serviceImpl.createCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response>) responseObserver);
          break;
        case METHODID_GET_CAMPAIGN:
          serviceImpl.getCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>) responseObserver);
          break;
        case METHODID_LIST_CAMPAIGNS:
          serviceImpl.listCampaigns((io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>) responseObserver);
          break;
        case METHODID_UPDATE_CAMPAIGN:
          serviceImpl.updateCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VALIDATE_CAMPAIGN:
          serviceImpl.validateCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_CAMPAIGN:
          serviceImpl.sendCampaign((io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ADGROUPS:
          serviceImpl.adgroups((io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response>) responseObserver);
          break;
        case METHODID_CREATE_ADGROUP:
          serviceImpl.createAdgroup((io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response>) responseObserver);
          break;
        case METHODID_ADGROUP:
          serviceImpl.adgroup((io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response>) responseObserver);
          break;
        case METHODID_UPDATE_ADGROUP:
          serviceImpl.updateAdgroup((io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request) request,
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
              .addMethod(METHOD_CREATE_CAMPAIGN)
              .addMethod(METHOD_GET_CAMPAIGN)
              .addMethod(METHOD_LIST_CAMPAIGNS)
              .addMethod(METHOD_UPDATE_CAMPAIGN)
              .addMethod(METHOD_VALIDATE_CAMPAIGN)
              .addMethod(METHOD_SEND_CAMPAIGN)
              .addMethod(METHOD_ADGROUPS)
              .addMethod(METHOD_CREATE_ADGROUP)
              .addMethod(METHOD_ADGROUP)
              .addMethod(METHOD_UPDATE_ADGROUP)
              .build();
        }
      }
    }
    return result;
  }
}
