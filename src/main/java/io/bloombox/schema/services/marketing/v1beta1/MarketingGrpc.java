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

package io.bloombox.schema.services.marketing.v1beta1;

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
 * Provides support for marketing campaign management, and outreach via arbitrary mediums (SMS, email, etc) to end-
 * customers identified by Bloombox user accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0-SNAPSHOT)",
    comments = "Source: marketing/v1beta1/MarketingService_Beta1.proto")
public final class MarketingGrpc {

  private MarketingGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.marketing.v1beta1.Marketing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> getCreateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCampaign",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> getCreateCampaignMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response> getCreateCampaignMethod;
    if ((getCreateCampaignMethod = MarketingGrpc.getCreateCampaignMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getCreateCampaignMethod = MarketingGrpc.getCreateCampaignMethod) == null) {
          MarketingGrpc.getCreateCampaignMethod = getCreateCampaignMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "CreateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("CreateCampaign"))
                  .build();
          }
        }
     }
     return getCreateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> getGetCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCampaign",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> getGetCampaignMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> getGetCampaignMethod;
    if ((getGetCampaignMethod = MarketingGrpc.getGetCampaignMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getGetCampaignMethod = MarketingGrpc.getGetCampaignMethod) == null) {
          MarketingGrpc.getGetCampaignMethod = getGetCampaignMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "GetCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("GetCampaign"))
                  .build();
          }
        }
     }
     return getGetCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> getListCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCampaigns",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
      io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> getListCampaignsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> getListCampaignsMethod;
    if ((getListCampaignsMethod = MarketingGrpc.getListCampaignsMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getListCampaignsMethod = MarketingGrpc.getListCampaignsMethod) == null) {
          MarketingGrpc.getListCampaignsMethod = getListCampaignsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request, io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "ListCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("ListCampaigns"))
                  .build();
          }
        }
     }
     return getListCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
      com.google.protobuf.Empty> getUpdateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateCampaign",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
      com.google.protobuf.Empty> getUpdateCampaignMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request, com.google.protobuf.Empty> getUpdateCampaignMethod;
    if ((getUpdateCampaignMethod = MarketingGrpc.getUpdateCampaignMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getUpdateCampaignMethod = MarketingGrpc.getUpdateCampaignMethod) == null) {
          MarketingGrpc.getUpdateCampaignMethod = getUpdateCampaignMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "UpdateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("UpdateCampaign"))
                  .build();
          }
        }
     }
     return getUpdateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request,
      com.google.protobuf.Empty> getValidateCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateCampaign",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request,
      com.google.protobuf.Empty> getValidateCampaignMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request, com.google.protobuf.Empty> getValidateCampaignMethod;
    if ((getValidateCampaignMethod = MarketingGrpc.getValidateCampaignMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getValidateCampaignMethod = MarketingGrpc.getValidateCampaignMethod) == null) {
          MarketingGrpc.getValidateCampaignMethod = getValidateCampaignMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "ValidateCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("ValidateCampaign"))
                  .build();
          }
        }
     }
     return getValidateCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
      com.google.protobuf.Empty> getSendCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendCampaign",
      requestType = io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
      com.google.protobuf.Empty> getSendCampaignMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request, com.google.protobuf.Empty> getSendCampaignMethod;
    if ((getSendCampaignMethod = MarketingGrpc.getSendCampaignMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getSendCampaignMethod = MarketingGrpc.getSendCampaignMethod) == null) {
          MarketingGrpc.getSendCampaignMethod = getSendCampaignMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "SendCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("SendCampaign"))
                  .build();
          }
        }
     }
     return getSendCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> getAdgroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Adgroups",
      requestType = io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> getAdgroupsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> getAdgroupsMethod;
    if ((getAdgroupsMethod = MarketingGrpc.getAdgroupsMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getAdgroupsMethod = MarketingGrpc.getAdgroupsMethod) == null) {
          MarketingGrpc.getAdgroupsMethod = getAdgroupsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "Adgroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("Adgroups"))
                  .build();
          }
        }
     }
     return getAdgroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> getCreateAdgroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAdgroup",
      requestType = io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> getCreateAdgroupMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> getCreateAdgroupMethod;
    if ((getCreateAdgroupMethod = MarketingGrpc.getCreateAdgroupMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getCreateAdgroupMethod = MarketingGrpc.getCreateAdgroupMethod) == null) {
          MarketingGrpc.getCreateAdgroupMethod = getCreateAdgroupMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "CreateAdgroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("CreateAdgroup"))
                  .build();
          }
        }
     }
     return getCreateAdgroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> getAdgroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Adgroup",
      requestType = io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request.class,
      responseType = io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request,
      io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> getAdgroupMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> getAdgroupMethod;
    if ((getAdgroupMethod = MarketingGrpc.getAdgroupMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getAdgroupMethod = MarketingGrpc.getAdgroupMethod) == null) {
          MarketingGrpc.getAdgroupMethod = getAdgroupMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request, io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "Adgroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("Adgroup"))
                  .build();
          }
        }
     }
     return getAdgroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request,
      com.google.protobuf.Empty> getUpdateAdgroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAdgroup",
      requestType = io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request,
      com.google.protobuf.Empty> getUpdateAdgroupMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request, com.google.protobuf.Empty> getUpdateAdgroupMethod;
    if ((getUpdateAdgroupMethod = MarketingGrpc.getUpdateAdgroupMethod) == null) {
      synchronized (MarketingGrpc.class) {
        if ((getUpdateAdgroupMethod = MarketingGrpc.getUpdateAdgroupMethod) == null) {
          MarketingGrpc.getUpdateAdgroupMethod = getUpdateAdgroupMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.marketing.v1beta1.Marketing", "UpdateAdgroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MarketingMethodDescriptorSupplier("UpdateAdgroup"))
                  .build();
          }
        }
     }
     return getUpdateAdgroupMethod;
  }

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
      asyncUnimplementedUnaryCall(getCreateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public void getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public void listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getListCampaignsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public void updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public void validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public void sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendCampaignMethod(), responseObserver);
    }

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public void adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAdgroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public void createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAdgroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public void adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAdgroupMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public void updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAdgroupMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignCreate.Response>(
                  this, METHODID_CREATE_CAMPAIGN)))
          .addMethod(
            getGetCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response>(
                  this, METHODID_GET_CAMPAIGN)))
          .addMethod(
            getListCampaignsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request,
                io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response>(
                  this, METHODID_LIST_CAMPAIGNS)))
          .addMethod(
            getUpdateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_CAMPAIGN)))
          .addMethod(
            getValidateCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_VALIDATE_CAMPAIGN)))
          .addMethod(
            getSendCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_CAMPAIGN)))
          .addMethod(
            getAdgroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response>(
                  this, METHODID_ADGROUPS)))
          .addMethod(
            getCreateAdgroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response>(
                  this, METHODID_CREATE_ADGROUP)))
          .addMethod(
            getAdgroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request,
                io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response>(
                  this, METHODID_ADGROUP)))
          .addMethod(
            getUpdateAdgroupMethod(),
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
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public void getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public void listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public void updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public void validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public void sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public void adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdgroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public void createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAdgroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public void adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdgroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public void updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAdgroupMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getCreateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response getCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response listCampaigns(io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request) {
      return blockingUnaryCall(
          getChannel(), getListCampaignsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public com.google.protobuf.Empty updateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public com.google.protobuf.Empty validateCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request) {
      return blockingUnaryCall(
          getChannel(), getValidateCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public com.google.protobuf.Empty sendCampaign(io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request) {
      return blockingUnaryCall(
          getChannel(), getSendCampaignMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response adgroups(io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request) {
      return blockingUnaryCall(
          getChannel(), getAdgroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response createAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request) {
      return blockingUnaryCall(
          getChannel(), getCreateAdgroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response adgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request) {
      return blockingUnaryCall(
          getChannel(), getAdgroupMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public com.google.protobuf.Empty updateAdgroup(io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAdgroupMethod(), getCallOptions(), request);
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
          getChannel().newCall(getCreateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve data for a given marketing campaign, addressed by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Response> getCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Fetch a list of marketing campaigns for a given partner/location scope.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.CampaignList.Response> listCampaigns(
        io.bloombox.schema.services.marketing.v1beta1.CampaignList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getListCampaignsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update underlying data for an existing marketing campaign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignUpdate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate a campaign's readiness before sending.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> validateCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignValidate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Trigger a marketing campaign to be sent.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendCampaign(
        io.bloombox.schema.services.marketing.v1beta1.CampaignSend.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSendCampaignMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List ad groups for a given campaign.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Response> adgroups(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getAdgroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a new marketing campaign ad group from scratch.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Response> createAdgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupCreate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAdgroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a marketing campaign's ad group by its ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Response> adgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getAdgroupMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update underlying data or content for a given set of campaign ad parameters.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAdgroup(
        io.bloombox.schema.services.marketing.v1beta1.AdGroupUpdate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAdgroupMethod(), getCallOptions()), request);
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

  private static abstract class MarketingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MarketingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.marketing.v1beta1.MarketingServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Marketing");
    }
  }

  private static final class MarketingFileDescriptorSupplier
      extends MarketingBaseDescriptorSupplier {
    MarketingFileDescriptorSupplier() {}
  }

  private static final class MarketingMethodDescriptorSupplier
      extends MarketingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MarketingMethodDescriptorSupplier(String methodName) {
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
      synchronized (MarketingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MarketingFileDescriptorSupplier())
              .addMethod(getCreateCampaignMethod())
              .addMethod(getGetCampaignMethod())
              .addMethod(getListCampaignsMethod())
              .addMethod(getUpdateCampaignMethod())
              .addMethod(getValidateCampaignMethod())
              .addMethod(getSendCampaignMethod())
              .addMethod(getAdgroupsMethod())
              .addMethod(getCreateAdgroupMethod())
              .addMethod(getAdgroupMethod())
              .addMethod(getUpdateAdgroupMethod())
              .build();
        }
      }
    }
    return result;
  }
}
