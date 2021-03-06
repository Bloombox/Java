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
 * Provides support for recording telemetry information about user events and actions related to their own identity,
 * account, profile, preferences, and so on.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: telemetry/v1beta4/TelemetryService_Beta4.proto")
public final class IdentityTelemetryGrpc {

  private IdentityTelemetryGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.telemetry.v1beta4.IdentityTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action,
      com.google.protobuf.Empty> getActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Action",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action,
      com.google.protobuf.Empty> getActionMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action, com.google.protobuf.Empty> getActionMethod;
    if ((getActionMethod = IdentityTelemetryGrpc.getActionMethod) == null) {
      synchronized (IdentityTelemetryGrpc.class) {
        if ((getActionMethod = IdentityTelemetryGrpc.getActionMethod) == null) {
          IdentityTelemetryGrpc.getActionMethod = getActionMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.IdentityTelemetry", "Action"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new IdentityTelemetryMethodDescriptorSupplier("Action"))
                  .build();
          }
        }
     }
     return getActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IdentityTelemetryStub newStub(io.grpc.Channel channel) {
    return new IdentityTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IdentityTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IdentityTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IdentityTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IdentityTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for recording telemetry information about user events and actions related to their own identity,
   * account, profile, preferences, and so on.
   * </pre>
   */
  public static abstract class IdentityTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register affirmative action taken by an end-user on their own account or identity.
     * </pre>
     */
    public void action(io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action,
                com.google.protobuf.Empty>(
                  this, METHODID_ACTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information about user events and actions related to their own identity,
   * account, profile, preferences, and so on.
   * </pre>
   */
  public static final class IdentityTelemetryStub extends io.grpc.stub.AbstractStub<IdentityTelemetryStub> {
    private IdentityTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register affirmative action taken by an end-user on their own account or identity.
     * </pre>
     */
    public void action(io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information about user events and actions related to their own identity,
   * account, profile, preferences, and so on.
   * </pre>
   */
  public static final class IdentityTelemetryBlockingStub extends io.grpc.stub.AbstractStub<IdentityTelemetryBlockingStub> {
    private IdentityTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register affirmative action taken by an end-user on their own account or identity.
     * </pre>
     */
    public com.google.protobuf.Empty action(io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action request) {
      return blockingUnaryCall(
          getChannel(), getActionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for recording telemetry information about user events and actions related to their own identity,
   * account, profile, preferences, and so on.
   * </pre>
   */
  public static final class IdentityTelemetryFutureStub extends io.grpc.stub.AbstractStub<IdentityTelemetryFutureStub> {
    private IdentityTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IdentityTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IdentityTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IdentityTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register affirmative action taken by an end-user on their own account or identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> action(
        io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action request) {
      return futureUnaryCall(
          getChannel().newCall(getActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACTION = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IdentityTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IdentityTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACTION:
          serviceImpl.action((io.bloombox.schema.services.telemetry.v1beta4.IdentityEvent.Action) request,
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

  private static abstract class IdentityTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IdentityTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta4.TelemetryServiceBeta4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IdentityTelemetry");
    }
  }

  private static final class IdentityTelemetryFileDescriptorSupplier
      extends IdentityTelemetryBaseDescriptorSupplier {
    IdentityTelemetryFileDescriptorSupplier() {}
  }

  private static final class IdentityTelemetryMethodDescriptorSupplier
      extends IdentityTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IdentityTelemetryMethodDescriptorSupplier(String methodName) {
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
      synchronized (IdentityTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IdentityTelemetryFileDescriptorSupplier())
              .addMethod(getActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
