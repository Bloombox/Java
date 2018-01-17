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

package io.bloombox.schema.services.shop.v1;

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
 * Specifies the retail shop service, which provides functionality for pickup and delivery orders, member verification,
 * member enrollment, and more.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: shop/v1/ShopService_v1.proto")
public final class ShopGrpc {

  private ShopGrpc() {}

  public static final String SERVICE_NAME = "services.shop.v1.Shop";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.Ping.Request,
      io.bloombox.schema.services.shop.v1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.Ping.Request, io.bloombox.schema.services.shop.v1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.ShopInfo.Request,
      io.bloombox.schema.services.shop.v1.ShopInfo.Response> METHOD_SHOP_INFO =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.ShopInfo.Request, io.bloombox.schema.services.shop.v1.ShopInfo.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "ShopInfo"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.ShopInfo.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.ShopInfo.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.EnrollMember.Request,
      io.bloombox.schema.services.shop.v1.EnrollMember.Response> METHOD_ENROLL_MEMBER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.EnrollMember.Request, io.bloombox.schema.services.shop.v1.EnrollMember.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "EnrollMember"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.EnrollMember.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.EnrollMember.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.CheckZipcode.Request,
      io.bloombox.schema.services.shop.v1.CheckZipcode.Response> METHOD_CHECK_ZIPCODE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.CheckZipcode.Request, io.bloombox.schema.services.shop.v1.CheckZipcode.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "CheckZipcode"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.CheckZipcode.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.CheckZipcode.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.VerifyMember.Request,
      io.bloombox.schema.services.shop.v1.VerifyMember.Response> METHOD_VERIFY_MEMBER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.VerifyMember.Request, io.bloombox.schema.services.shop.v1.VerifyMember.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "VerifyMember"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.VerifyMember.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.VerifyMember.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.SubmitOrder.Request,
      io.bloombox.schema.services.shop.v1.SubmitOrder.Response> METHOD_SUBMIT_ORDER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.SubmitOrder.Request, io.bloombox.schema.services.shop.v1.SubmitOrder.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "SubmitOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.SubmitOrder.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.SubmitOrder.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.shop.v1.GetOrder.Request,
      io.bloombox.schema.services.shop.v1.GetOrder.Response> METHOD_GET_ORDER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.shop.v1.GetOrder.Request, io.bloombox.schema.services.shop.v1.GetOrder.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.shop.v1.Shop", "GetOrder"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.GetOrder.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.shop.v1.GetOrder.Response.getDefaultInstance()))
          .build();

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
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public void shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.ShopInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SHOP_INFO, responseObserver);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public void enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.EnrollMember.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ENROLL_MEMBER, responseObserver);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public void checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CHECK_ZIPCODE, responseObserver);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public void verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.VerifyMember.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_VERIFY_MEMBER, responseObserver);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public void submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SUBMIT_ORDER, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public void getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.GetOrder.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.Ping.Request,
                io.bloombox.schema.services.shop.v1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_SHOP_INFO,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.ShopInfo.Request,
                io.bloombox.schema.services.shop.v1.ShopInfo.Response>(
                  this, METHODID_SHOP_INFO)))
          .addMethod(
            METHOD_ENROLL_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.EnrollMember.Request,
                io.bloombox.schema.services.shop.v1.EnrollMember.Response>(
                  this, METHODID_ENROLL_MEMBER)))
          .addMethod(
            METHOD_CHECK_ZIPCODE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.CheckZipcode.Request,
                io.bloombox.schema.services.shop.v1.CheckZipcode.Response>(
                  this, METHODID_CHECK_ZIPCODE)))
          .addMethod(
            METHOD_VERIFY_MEMBER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.VerifyMember.Request,
                io.bloombox.schema.services.shop.v1.VerifyMember.Response>(
                  this, METHODID_VERIFY_MEMBER)))
          .addMethod(
            METHOD_SUBMIT_ORDER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.shop.v1.SubmitOrder.Request,
                io.bloombox.schema.services.shop.v1.SubmitOrder.Response>(
                  this, METHODID_SUBMIT_ORDER)))
          .addMethod(
            METHOD_GET_ORDER,
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
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public void shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.ShopInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SHOP_INFO, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public void enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.EnrollMember.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ENROLL_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public void checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CHECK_ZIPCODE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public void verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.VerifyMember.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_VERIFY_MEMBER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public void submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public void getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.shop.v1.GetOrder.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER, getCallOptions()), request, responseObserver);
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
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.ShopInfo.Response shopInfo(io.bloombox.schema.services.shop.v1.ShopInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SHOP_INFO, getCallOptions(), request);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.EnrollMember.Response enrollMember(io.bloombox.schema.services.shop.v1.EnrollMember.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ENROLL_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.CheckZipcode.Response checkZipcode(io.bloombox.schema.services.shop.v1.CheckZipcode.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CHECK_ZIPCODE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.VerifyMember.Response verifyMember(io.bloombox.schema.services.shop.v1.VerifyMember.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_VERIFY_MEMBER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.SubmitOrder.Response submitOrder(io.bloombox.schema.services.shop.v1.SubmitOrder.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SUBMIT_ORDER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public io.bloombox.schema.services.shop.v1.GetOrder.Response getOrder(io.bloombox.schema.services.shop.v1.GetOrder.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDER, getCallOptions(), request);
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
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Query info and status of a particular shop.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.ShopInfo.Response> shopInfo(
        io.bloombox.schema.services.shop.v1.ShopInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SHOP_INFO, getCallOptions()), request);
    }

    /**
     * <pre>
     * Enroll a new member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.EnrollMember.Response> enrollMember(
        io.bloombox.schema.services.shop.v1.EnrollMember.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ENROLL_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if a given USPS zip code is supported for delivery.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.CheckZipcode.Response> checkZipcode(
        io.bloombox.schema.services.shop.v1.CheckZipcode.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CHECK_ZIPCODE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify a member by their email address.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.VerifyMember.Response> verifyMember(
        io.bloombox.schema.services.shop.v1.VerifyMember.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_VERIFY_MEMBER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit an order for delivery or pickup.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.SubmitOrder.Response> submitOrder(
        io.bloombox.schema.services.shop.v1.SubmitOrder.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SUBMIT_ORDER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an existing order.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.shop.v1.GetOrder.Response> getOrder(
        io.bloombox.schema.services.shop.v1.GetOrder.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDER, getCallOptions()), request);
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

  private static final class ShopDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.shop.v1.ShopServiceV1.getDescriptor();
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
              .setSchemaDescriptor(new ShopDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_SHOP_INFO)
              .addMethod(METHOD_ENROLL_MEMBER)
              .addMethod(METHOD_CHECK_ZIPCODE)
              .addMethod(METHOD_VERIFY_MEMBER)
              .addMethod(METHOD_SUBMIT_ORDER)
              .addMethod(METHOD_GET_ORDER)
              .build();
        }
      }
    }
    return result;
  }
}
