/*
 * Copyright 2017, Bloombox, LLC. All rights reserved.
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

package io.bloombox.schema.services.checkin.v1beta1;

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
 * Specifies the checkin service, which accepts opaque identification information for the purpose of checking users in
 * to a physical brick-and-mortar retail location.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: checkin/v1beta1/CheckinService_Beta1.proto")
public final class CheckinGrpc {

  private CheckinGrpc() {}

  public static final String SERVICE_NAME = "services.checkin.v1beta1.Checkin";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.Ping.Request,
      io.bloombox.schema.services.checkin.v1beta1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.Ping.Request, io.bloombox.schema.services.checkin.v1beta1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.checkin.v1beta1.Checkin", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> METHOD_IDENTIFICATION =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.checkin.v1beta1.Checkin", "Identification"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request,
      io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> METHOD_CARD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request, io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.checkin.v1beta1.Checkin", "Card"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.checkin.v1beta1.CheckinResponse.getDefaultInstance()))
          .build();

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
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_IDENTIFICATION, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CARD, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.checkin.v1beta1.Ping.Request,
                io.bloombox.schema.services.checkin.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_IDENTIFICATION,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request,
                io.bloombox.schema.services.checkin.v1beta1.CheckinResponse>(
                  this, METHODID_IDENTIFICATION)))
          .addMethod(
            METHOD_CARD,
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
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_IDENTIFICATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public void card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CARD, getCallOptions()), request, responseObserver);
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
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse identification(io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_IDENTIFICATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public io.bloombox.schema.services.checkin.v1beta1.CheckinResponse card(io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CARD, getCallOptions(), request);
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
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> identification(
        io.bloombox.schema.services.checkin.v1beta1.IDCheckin.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_IDENTIFICATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Specifies an operation to check a user in via their government ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.checkin.v1beta1.CheckinResponse> card(
        io.bloombox.schema.services.checkin.v1beta1.CardCheckin.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CARD, getCallOptions()), request);
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

  private static final class CheckinDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.checkin.v1beta1.CheckinServiceBeta1.getDescriptor();
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
              .setSchemaDescriptor(new CheckinDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_IDENTIFICATION)
              .addMethod(METHOD_CARD)
              .build();
        }
      }
    }
    return result;
  }
}
