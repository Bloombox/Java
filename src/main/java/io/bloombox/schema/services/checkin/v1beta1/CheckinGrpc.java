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

package io.bloombox.schema.services.checkin.v1beta1;

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
 * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
 * to a physical brick-and-mortar retail location.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: checkin/v1beta1/CheckinService_Beta1.proto")
public final class CheckinGrpc {

  private CheckinGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.checkin.v1beta1.Checkin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.Ping.Request,
      io.bloombox.schema.services.checkin.v1beta1.Ping.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.bloombox.schema.services.checkin.v1beta1.Ping.Request.class,
      responseType = io.bloombox.schema.services.checkin.v1beta1.Ping.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.Ping.Request,
      io.bloombox.schema.services.checkin.v1beta1.Ping.Response> getPingMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.Ping.Request, io.bloombox.schema.services.checkin.v1beta1.Ping.Response> getPingMethod;
    if ((getPingMethod = CheckinGrpc.getPingMethod) == null) {
      synchronized (CheckinGrpc.class) {
        if ((getPingMethod = CheckinGrpc.getPingMethod) == null) {
          CheckinGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.Ping.Request, io.bloombox.schema.services.checkin.v1beta1.Ping.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.checkin.v1beta1.Checkin", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.Ping.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.Ping.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckinMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getIdentificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Identification",
      requestType = io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request.class,
      responseType = io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getIdentificationMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getIdentificationMethod;
    if ((getIdentificationMethod = CheckinGrpc.getIdentificationMethod) == null) {
      synchronized (CheckinGrpc.class) {
        if ((getIdentificationMethod = CheckinGrpc.getIdentificationMethod) == null) {
          CheckinGrpc.getIdentificationMethod = getIdentificationMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.checkin.v1beta1.Checkin", "Identification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckinMethodDescriptorSupplier("Identification"))
                  .build();
          }
        }
     }
     return getIdentificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getCardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Card",
      requestType = io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request.class,
      responseType = io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getCardMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> getCardMethod;
    if ((getCardMethod = CheckinGrpc.getCardMethod) == null) {
      synchronized (CheckinGrpc.class) {
        if ((getCardMethod = CheckinGrpc.getCardMethod) == null) {
          CheckinGrpc.getCardMethod = getCardMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.checkin.v1beta1.Checkin", "Card"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CheckinMethodDescriptorSupplier("Card"))
                  .build();
          }
        }
     }
     return getCardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CheckinStub newStub(io.grpc.Channel channel) {
    return new CheckinStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CheckinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CheckinBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CheckinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CheckinFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
   * to a physical brick-and-mortar retail location.
   * </pre>
   */
  public static abstract class CheckinImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the checkin server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.checkin.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIdentificationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their Bloombox digital card.
     * </pre>
     */
    public void card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.checkin.v1beta1.Ping.Request,
                io.bloombox.schema.services.checkin.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getIdentificationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request,
                io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>(
                  this, METHODID_IDENTIFICATION)))
          .addMethod(
            getCardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request,
                io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>(
                  this, METHODID_CARD)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
   * to a physical brick-and-mortar retail location.
   * </pre>
   */
  public static final class CheckinStub extends io.grpc.stub.AbstractStub<CheckinStub> {
    private CheckinStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the checkin server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.checkin.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIdentificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their Bloombox digital card.
     * </pre>
     */
    public void card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
   * to a physical brick-and-mortar retail location.
   * </pre>
   */
  public static final class CheckinBlockingStub extends io.grpc.stub.AbstractStub<CheckinBlockingStub> {
    private CheckinBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the checkin server.
     * </pre>
     */
    public io.bloombox.schema.services.checkin.v1beta1.Ping.Response ping(io.bloombox.schema.services.checkin.v1beta1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request) {
      return blockingUnaryCall(
          getChannel(), getIdentificationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their Bloombox digital card.
     * </pre>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request) {
      return blockingUnaryCall(
          getChannel(), getCardMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
   * to a physical brick-and-mortar retail location.
   * </pre>
   */
  public static final class CheckinFutureStub extends io.grpc.stub.AbstractStub<CheckinFutureStub> {
    private CheckinFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CheckinFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CheckinFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CheckinFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the checkin server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.checkin.v1beta1.Ping.Response> ping(
        io.bloombox.schema.services.checkin.v1beta1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> identification(
        io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getIdentificationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their Bloombox digital card.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> card(
        io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getCardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_IDENTIFICATION = 1;
  private static final int METHODID_CARD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CheckinImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CheckinImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.checkin.v1beta1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.Ping.Response>) responseObserver);
          break;
        case METHODID_IDENTIFICATION:
          serviceImpl.identification((io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>) responseObserver);
          break;
        case METHODID_CARD:
          serviceImpl.card((io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>) responseObserver);
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

  private static abstract class CheckinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CheckinBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Checkin");
    }
  }

  private static final class CheckinFileDescriptorSupplier
      extends CheckinBaseDescriptorSupplier {
    CheckinFileDescriptorSupplier() {}
  }

  private static final class CheckinMethodDescriptorSupplier
      extends CheckinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CheckinMethodDescriptorSupplier(String methodName) {
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
      synchronized (CheckinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CheckinFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getIdentificationMethod())
              .addMethod(getCardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
