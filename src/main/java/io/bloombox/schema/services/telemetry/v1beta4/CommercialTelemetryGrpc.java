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

package io.bloombox.schema.services.telemetry.v1beta4;

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
 * Provides support for tailored analytics payloads w.r.t. interactions between end-users and commercial models, like
 * menu sections, products, and user orders.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0-SNAPSHOT)",
    comments = "Source: telemetry/v1beta4/TelemetryService_Beta4.proto")
public final class CommercialTelemetryGrpc {

  private CommercialTelemetryGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.telemetry.v1beta4.CommercialTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression,
      com.google.protobuf.Empty> getImpressionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Impression",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression,
      com.google.protobuf.Empty> getImpressionMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression, com.google.protobuf.Empty> getImpressionMethod;
    if ((getImpressionMethod = CommercialTelemetryGrpc.getImpressionMethod) == null) {
      synchronized (CommercialTelemetryGrpc.class) {
        if ((getImpressionMethod = CommercialTelemetryGrpc.getImpressionMethod) == null) {
          CommercialTelemetryGrpc.getImpressionMethod = getImpressionMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.CommercialTelemetry", "Impression"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommercialTelemetryMethodDescriptorSupplier("Impression"))
                  .build();
          }
        }
     }
     return getImpressionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View,
      com.google.protobuf.Empty> getViewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "View",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View,
      com.google.protobuf.Empty> getViewMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View, com.google.protobuf.Empty> getViewMethod;
    if ((getViewMethod = CommercialTelemetryGrpc.getViewMethod) == null) {
      synchronized (CommercialTelemetryGrpc.class) {
        if ((getViewMethod = CommercialTelemetryGrpc.getViewMethod) == null) {
          CommercialTelemetryGrpc.getViewMethod = getViewMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.CommercialTelemetry", "View"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommercialTelemetryMethodDescriptorSupplier("View"))
                  .build();
          }
        }
     }
     return getViewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action,
      com.google.protobuf.Empty> getActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Action",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action,
      com.google.protobuf.Empty> getActionMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action, com.google.protobuf.Empty> getActionMethod;
    if ((getActionMethod = CommercialTelemetryGrpc.getActionMethod) == null) {
      synchronized (CommercialTelemetryGrpc.class) {
        if ((getActionMethod = CommercialTelemetryGrpc.getActionMethod) == null) {
          CommercialTelemetryGrpc.getActionMethod = getActionMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.CommercialTelemetry", "Action"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new CommercialTelemetryMethodDescriptorSupplier("Action"))
                  .build();
          }
        }
     }
     return getActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommercialTelemetryStub newStub(io.grpc.Channel channel) {
    return new CommercialTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommercialTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CommercialTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommercialTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CommercialTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for tailored analytics payloads w.r.t. interactions between end-users and commercial models, like
   * menu sections, products, and user orders.
   * </pre>
   */
  public static abstract class CommercialTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register that a menu section was presented to a user, regardless of whether they acted on it or not.
     * </pre>
     */
    public void impression(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getImpressionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register that a menu section was viewed, browsed-to, or otherwise served to a user.
     * </pre>
     */
    public void view(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getViewMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register that an end-user elected to take action within a section in some way.
     * </pre>
     */
    public void action(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImpressionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression,
                com.google.protobuf.Empty>(
                  this, METHODID_IMPRESSION)))
          .addMethod(
            getViewMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View,
                com.google.protobuf.Empty>(
                  this, METHODID_VIEW)))
          .addMethod(
            getActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action,
                com.google.protobuf.Empty>(
                  this, METHODID_ACTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for tailored analytics payloads w.r.t. interactions between end-users and commercial models, like
   * menu sections, products, and user orders.
   * </pre>
   */
  public static final class CommercialTelemetryStub extends io.grpc.stub.AbstractStub<CommercialTelemetryStub> {
    private CommercialTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommercialTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommercialTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommercialTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register that a menu section was presented to a user, regardless of whether they acted on it or not.
     * </pre>
     */
    public void impression(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImpressionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register that a menu section was viewed, browsed-to, or otherwise served to a user.
     * </pre>
     */
    public void view(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register that an end-user elected to take action within a section in some way.
     * </pre>
     */
    public void action(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for tailored analytics payloads w.r.t. interactions between end-users and commercial models, like
   * menu sections, products, and user orders.
   * </pre>
   */
  public static final class CommercialTelemetryBlockingStub extends io.grpc.stub.AbstractStub<CommercialTelemetryBlockingStub> {
    private CommercialTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommercialTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommercialTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommercialTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register that a menu section was presented to a user, regardless of whether they acted on it or not.
     * </pre>
     */
    public com.google.protobuf.Empty impression(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression request) {
      return blockingUnaryCall(
          getChannel(), getImpressionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register that a menu section was viewed, browsed-to, or otherwise served to a user.
     * </pre>
     */
    public com.google.protobuf.Empty view(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View request) {
      return blockingUnaryCall(
          getChannel(), getViewMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register that an end-user elected to take action within a section in some way.
     * </pre>
     */
    public com.google.protobuf.Empty action(io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action request) {
      return blockingUnaryCall(
          getChannel(), getActionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for tailored analytics payloads w.r.t. interactions between end-users and commercial models, like
   * menu sections, products, and user orders.
   * </pre>
   */
  public static final class CommercialTelemetryFutureStub extends io.grpc.stub.AbstractStub<CommercialTelemetryFutureStub> {
    private CommercialTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CommercialTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommercialTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CommercialTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register that a menu section was presented to a user, regardless of whether they acted on it or not.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> impression(
        io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression request) {
      return futureUnaryCall(
          getChannel().newCall(getImpressionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register that a menu section was viewed, browsed-to, or otherwise served to a user.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> view(
        io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View request) {
      return futureUnaryCall(
          getChannel().newCall(getViewMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register that an end-user elected to take action within a section in some way.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> action(
        io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action request) {
      return futureUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IMPRESSION = 0;
  private static final int METHODID_VIEW = 1;
  private static final int METHODID_ACTION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CommercialTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CommercialTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPRESSION:
          serviceImpl.impression((io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Impression) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VIEW:
          serviceImpl.view((io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.View) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_ACTION:
          serviceImpl.action((io.bloombox.schema.services.telemetry.v1beta4.CommercialEvent.Action) request,
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

  private static abstract class CommercialTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommercialTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta4.TelemetryServiceBeta4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommercialTelemetry");
    }
  }

  private static final class CommercialTelemetryFileDescriptorSupplier
      extends CommercialTelemetryBaseDescriptorSupplier {
    CommercialTelemetryFileDescriptorSupplier() {}
  }

  private static final class CommercialTelemetryMethodDescriptorSupplier
      extends CommercialTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CommercialTelemetryMethodDescriptorSupplier(String methodName) {
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
      synchronized (CommercialTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommercialTelemetryFileDescriptorSupplier())
              .addMethod(getImpressionMethod())
              .addMethod(getViewMethod())
              .addMethod(getActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
