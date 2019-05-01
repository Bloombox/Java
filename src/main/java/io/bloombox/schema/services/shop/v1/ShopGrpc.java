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

package io.bloombox.schema.services.shop.v1;

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
 * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
 * member enrollment, and more.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: shop/v1/ShopService_v1.proto")
public final class ShopGrpc {

  private ShopGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.shop.v1.Shop";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.Ping.Request,
      io.bloombox.schema.services.shop.v1.Ping.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.bloombox.schema.services.shop.v1.Ping.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.Ping.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.Ping.Request,
      io.bloombox.schema.services.shop.v1.Ping.Response> getPingMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.Ping.Request, io.bloombox.schema.services.shop.v1.Ping.Response> getPingMethod;
    if ((getPingMethod = ShopGrpc.getPingMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getPingMethod = ShopGrpc.getPingMethod) == null) {
          ShopGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.Ping.Request, io.bloombox.schema.services.shop.v1.Ping.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.Ping.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.Ping.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.ShopInfo.Request,
      io.bloombox.schema.services.shop.v1.ShopInfo.Response> getShopInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ShopInfo",
      requestType = io.bloombox.schema.services.shop.v1.ShopInfo.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.ShopInfo.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.ShopInfo.Request,
      io.bloombox.schema.services.shop.v1.ShopInfo.Response> getShopInfoMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.ShopInfo.Request, io.bloombox.schema.services.shop.v1.ShopInfo.Response> getShopInfoMethod;
    if ((getShopInfoMethod = ShopGrpc.getShopInfoMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getShopInfoMethod = ShopGrpc.getShopInfoMethod) == null) {
          ShopGrpc.getShopInfoMethod = getShopInfoMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.ShopInfo.Request, io.bloombox.schema.services.shop.v1.ShopInfo.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "ShopInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.ShopInfo.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.ShopInfo.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("ShopInfo"))
                  .build();
          }
        }
     }
     return getShopInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.EnrollMember.Request,
      io.bloombox.schema.services.shop.v1.EnrollMember.Response> getEnrollMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnrollMember",
      requestType = io.bloombox.schema.services.shop.v1.EnrollMember.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.EnrollMember.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.EnrollMember.Request,
      io.bloombox.schema.services.shop.v1.EnrollMember.Response> getEnrollMemberMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.EnrollMember.Request, io.bloombox.schema.services.shop.v1.EnrollMember.Response> getEnrollMemberMethod;
    if ((getEnrollMemberMethod = ShopGrpc.getEnrollMemberMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getEnrollMemberMethod = ShopGrpc.getEnrollMemberMethod) == null) {
          ShopGrpc.getEnrollMemberMethod = getEnrollMemberMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.EnrollMember.Request, io.bloombox.schema.services.shop.v1.EnrollMember.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "EnrollMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.EnrollMember.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.EnrollMember.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("EnrollMember"))
                  .build();
          }
        }
     }
     return getEnrollMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.CheckZipcode.Request,
      io.bloombox.schema.services.shop.v1.CheckZipcode.Response> getCheckZipcodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckZipcode",
      requestType = io.bloombox.schema.services.shop.v1.CheckZipcode.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.CheckZipcode.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.CheckZipcode.Request,
      io.bloombox.schema.services.shop.v1.CheckZipcode.Response> getCheckZipcodeMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.CheckZipcode.Request, io.bloombox.schema.services.shop.v1.CheckZipcode.Response> getCheckZipcodeMethod;
    if ((getCheckZipcodeMethod = ShopGrpc.getCheckZipcodeMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getCheckZipcodeMethod = ShopGrpc.getCheckZipcodeMethod) == null) {
          ShopGrpc.getCheckZipcodeMethod = getCheckZipcodeMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.CheckZipcode.Request, io.bloombox.schema.services.shop.v1.CheckZipcode.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "CheckZipcode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.CheckZipcode.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.CheckZipcode.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("CheckZipcode"))
                  .build();
          }
        }
     }
     return getCheckZipcodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.VerifyMember.Request,
      io.bloombox.schema.services.shop.v1.VerifyMember.Response> getVerifyMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyMember",
      requestType = io.bloombox.schema.services.shop.v1.VerifyMember.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.VerifyMember.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.VerifyMember.Request,
      io.bloombox.schema.services.shop.v1.VerifyMember.Response> getVerifyMemberMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.VerifyMember.Request, io.bloombox.schema.services.shop.v1.VerifyMember.Response> getVerifyMemberMethod;
    if ((getVerifyMemberMethod = ShopGrpc.getVerifyMemberMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getVerifyMemberMethod = ShopGrpc.getVerifyMemberMethod) == null) {
          ShopGrpc.getVerifyMemberMethod = getVerifyMemberMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.VerifyMember.Request, io.bloombox.schema.services.shop.v1.VerifyMember.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "VerifyMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.VerifyMember.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.VerifyMember.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("VerifyMember"))
                  .build();
          }
        }
     }
     return getVerifyMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.SubmitOrder.Request,
      io.bloombox.schema.services.shop.v1.SubmitOrder.Response> getSubmitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitOrder",
      requestType = io.bloombox.schema.services.shop.v1.SubmitOrder.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.SubmitOrder.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.SubmitOrder.Request,
      io.bloombox.schema.services.shop.v1.SubmitOrder.Response> getSubmitOrderMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.SubmitOrder.Request, io.bloombox.schema.services.shop.v1.SubmitOrder.Response> getSubmitOrderMethod;
    if ((getSubmitOrderMethod = ShopGrpc.getSubmitOrderMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getSubmitOrderMethod = ShopGrpc.getSubmitOrderMethod) == null) {
          ShopGrpc.getSubmitOrderMethod = getSubmitOrderMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.SubmitOrder.Request, io.bloombox.schema.services.shop.v1.SubmitOrder.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "SubmitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.SubmitOrder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.SubmitOrder.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("SubmitOrder"))
                  .build();
          }
        }
     }
     return getSubmitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.GetOrder.Request,
      io.bloombox.schema.services.shop.v1.GetOrder.Response> getGetOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOrder",
      requestType = io.bloombox.schema.services.shop.v1.GetOrder.Request.class,
      responseType = io.bloombox.schema.services.shop.v1.GetOrder.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.GetOrder.Request,
      io.bloombox.schema.services.shop.v1.GetOrder.Response> getGetOrderMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.GetOrder.Request, io.bloombox.schema.services.shop.v1.GetOrder.Response> getGetOrderMethod;
    if ((getGetOrderMethod = ShopGrpc.getGetOrderMethod) == null) {
      synchronized (ShopGrpc.class) {
        if ((getGetOrderMethod = ShopGrpc.getGetOrderMethod) == null) {
          ShopGrpc.getGetOrderMethod = getGetOrderMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.GetOrder.Request, io.bloombox.schema.services.shop.v1.GetOrder.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.shop.v1.Shop", "GetOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.GetOrder.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.shop.v1.GetOrder.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopMethodDescriptorSupplier("GetOrder"))
                  .build();
          }
        }
     }
     return getGetOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopStub newStub(io.grpc.Channel channel) {
    return new ShopStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShopBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShopFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
   * member enrollment, and more.
   * </pre>
   */
  public static abstract class ShopImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.shop.v1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public void shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.ShopInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getShopInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public void enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.EnrollMember.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getEnrollMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public void checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckZipcodeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public void verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.VerifyMember.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public void submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSubmitOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public void getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.GetOrder.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.Ping.Request,
                io.bloombox.schema.services.shop.v1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getShopInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.ShopInfo.Request,
                io.bloombox.schema.services.shop.v1.ShopInfo.Response>(
                  this, METHODID_SHOP_INFO)))
          .addMethod(
            getEnrollMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.EnrollMember.Request,
                io.bloombox.schema.services.shop.v1.EnrollMember.Response>(
                  this, METHODID_ENROLL_MEMBER)))
          .addMethod(
            getCheckZipcodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.CheckZipcode.Request,
                io.bloombox.schema.services.shop.v1.CheckZipcode.Response>(
                  this, METHODID_CHECK_ZIPCODE)))
          .addMethod(
            getVerifyMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.VerifyMember.Request,
                io.bloombox.schema.services.shop.v1.VerifyMember.Response>(
                  this, METHODID_VERIFY_MEMBER)))
          .addMethod(
            getSubmitOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.SubmitOrder.Request,
                io.bloombox.schema.services.shop.v1.SubmitOrder.Response>(
                  this, METHODID_SUBMIT_ORDER)))
          .addMethod(
            getGetOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.GetOrder.Request,
                io.bloombox.schema.services.shop.v1.GetOrder.Response>(
                  this, METHODID_GET_ORDER)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
   * member enrollment, and more.
   * </pre>
   */
  public static final class ShopStub extends io.grpc.stub.AbstractStub<ShopStub> {
    private ShopStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.shop.v1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public void shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.ShopInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShopInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public void enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.EnrollMember.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnrollMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public void checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckZipcodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public void verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.VerifyMember.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public void submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public void getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.GetOrder.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
   * member enrollment, and more.
   * </pre>
   */
  public static final class ShopBlockingStub extends io.grpc.stub.AbstractStub<ShopBlockingStub> {
    private ShopBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.Ping.Response ping(io.bloombox.schema.services.shop.v1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.ShopInfo.Response shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), getShopInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.EnrollMember.Response enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request) {
      return blockingUnaryCall(
          getChannel(), getEnrollMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.CheckZipcode.Response checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request) {
      return blockingUnaryCall(
          getChannel(), getCheckZipcodeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.VerifyMember.Response verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request) {
      return blockingUnaryCall(
          getChannel(), getVerifyMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.SubmitOrder.Response submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request) {
      return blockingUnaryCall(
          getChannel(), getSubmitOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.GetOrder.Response getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request) {
      return blockingUnaryCall(
          getChannel(), getGetOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
   * member enrollment, and more.
   * </pre>
   */
  public static final class ShopFutureStub extends io.grpc.stub.AbstractStub<ShopFutureStub> {
    private ShopFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.Ping.Response> ping(
        io.bloombox.schema.services.shop.v1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.ShopInfo.Response> shopInfo(
        io.bloombox.schema.services.shop.v1.ShopInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getShopInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.EnrollMember.Response> enrollMember(
        io.bloombox.schema.services.shop.v1.EnrollMember.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getEnrollMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> checkZipcode(
        io.bloombox.schema.services.shop.v1.CheckZipcode.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckZipcodeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.VerifyMember.Response> verifyMember(
        io.bloombox.schema.services.shop.v1.VerifyMember.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> submitOrder(
        io.bloombox.schema.services.shop.v1.SubmitOrder.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSubmitOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.GetOrder.Response> getOrder(
        io.bloombox.schema.services.shop.v1.GetOrder.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_SHOP_INFO = 1;
  private static final int METHODID_ENROLL_MEMBER = 2;
  private static final int METHODID_CHECK_ZIPCODE = 3;
  private static final int METHODID_VERIFY_MEMBER = 4;
  private static final int METHODID_SUBMIT_ORDER = 5;
  private static final int METHODID_GET_ORDER = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShopImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShopImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.shop.v1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.Ping.Response>) responseObserver);
          break;
        case METHODID_SHOP_INFO:
          serviceImpl.shopInfo((io.bloombox.schema.services.shop.v1.ShopInfo.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.ShopInfo.Response>) responseObserver);
          break;
        case METHODID_ENROLL_MEMBER:
          serviceImpl.enrollMember((io.bloombox.schema.services.shop.v1.EnrollMember.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.EnrollMember.Response>) responseObserver);
          break;
        case METHODID_CHECK_ZIPCODE:
          serviceImpl.checkZipcode((io.bloombox.schema.services.shop.v1.CheckZipcode.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.CheckZipcode.Response>) responseObserver);
          break;
        case METHODID_VERIFY_MEMBER:
          serviceImpl.verifyMember((io.bloombox.schema.services.shop.v1.VerifyMember.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.VerifyMember.Response>) responseObserver);
          break;
        case METHODID_SUBMIT_ORDER:
          serviceImpl.submitOrder((io.bloombox.schema.services.shop.v1.SubmitOrder.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.SubmitOrder.Response>) responseObserver);
          break;
        case METHODID_GET_ORDER:
          serviceImpl.getOrder((io.bloombox.schema.services.shop.v1.GetOrder.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.GetOrder.Response>) responseObserver);
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

  private static abstract class ShopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.shop.v1.ShopServiceV1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Shop");
    }
  }

  private static final class ShopFileDescriptorSupplier
      extends ShopBaseDescriptorSupplier {
    ShopFileDescriptorSupplier() {}
  }

  private static final class ShopMethodDescriptorSupplier
      extends ShopBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShopMethodDescriptorSupplier(String methodName) {
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
      synchronized (ShopGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getShopInfoMethod())
              .addMethod(getEnrollMemberMethod())
              .addMethod(getCheckZipcodeMethod())
              .addMethod(getVerifyMemberMethod())
              .addMethod(getSubmitOrderMethod())
              .addMethod(getGetOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
