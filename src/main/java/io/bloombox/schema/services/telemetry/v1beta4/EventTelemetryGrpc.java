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
 * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0-SNAPSHOT)",
    comments = "Source: telemetry/v1beta4/TelemetryService_Beta4.proto")
public final class EventTelemetryGrpc {

  private EventTelemetryGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.telemetry.v1beta4.EventTelemetry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request,
      io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request.class,
      responseType = io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request,
      io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> getPingMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request, io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> getPingMethod;
    if ((getPingMethod = EventTelemetryGrpc.getPingMethod) == null) {
      synchronized (EventTelemetryGrpc.class) {
        if ((getPingMethod = EventTelemetryGrpc.getPingMethod) == null) {
          EventTelemetryGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request, io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.EventTelemetry", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTelemetryMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.Request,
      com.google.protobuf.Empty> getEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Event",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.Event.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.Request,
      com.google.protobuf.Empty> getEventMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.Request, com.google.protobuf.Empty> getEventMethod;
    if ((getEventMethod = EventTelemetryGrpc.getEventMethod) == null) {
      synchronized (EventTelemetryGrpc.class) {
        if ((getEventMethod = EventTelemetryGrpc.getEventMethod) == null) {
          EventTelemetryGrpc.getEventMethod = getEventMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.Event.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.EventTelemetry", "Event"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.Event.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTelemetryMethodDescriptorSupplier("Event"))
                  .build();
          }
        }
     }
     return getEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest,
      io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> getBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Batch",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest.class,
      responseType = io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest,
      io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> getBatchMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest, io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> getBatchMethod;
    if ((getBatchMethod = EventTelemetryGrpc.getBatchMethod) == null) {
      synchronized (EventTelemetryGrpc.class) {
        if ((getBatchMethod = EventTelemetryGrpc.getBatchMethod) == null) {
          EventTelemetryGrpc.getBatchMethod = getBatchMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest, io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.EventTelemetry", "Batch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTelemetryMethodDescriptorSupplier("Batch"))
                  .build();
          }
        }
     }
     return getBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Exception,
      com.google.protobuf.Empty> getErrorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Error",
      requestType = io.bloombox.schema.services.telemetry.v1beta4.Exception.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Exception,
      com.google.protobuf.Empty> getErrorMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta4.Exception, com.google.protobuf.Empty> getErrorMethod;
    if ((getErrorMethod = EventTelemetryGrpc.getErrorMethod) == null) {
      synchronized (EventTelemetryGrpc.class) {
        if ((getErrorMethod = EventTelemetryGrpc.getErrorMethod) == null) {
          EventTelemetryGrpc.getErrorMethod = getErrorMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta4.Exception, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.telemetry.v1beta4.EventTelemetry", "Error"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.telemetry.v1beta4.Exception.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTelemetryMethodDescriptorSupplier("Error"))
                  .build();
          }
        }
     }
     return getErrorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventTelemetryStub newStub(io.grpc.Channel channel) {
    return new EventTelemetryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventTelemetryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventTelemetryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventTelemetryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventTelemetryFutureStub(channel);
  }

  /**
   * <pre>
   * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
   * </pre>
   */
  public static abstract class EventTelemetryImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public void event(io.bloombox.schema.services.telemetry.v1beta4.Event.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public void batch(io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public void error(io.bloombox.schema.services.telemetry.v1beta4.Exception request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getErrorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request,
                io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.Event.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_EVENT)))
          .addMethod(
            getBatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest,
                io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse>(
                  this, METHODID_BATCH)))
          .addMethod(
            getErrorMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta4.Exception,
                com.google.protobuf.Empty>(
                  this, METHODID_ERROR)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
   * </pre>
   */
  public static final class EventTelemetryStub extends io.grpc.stub.AbstractStub<EventTelemetryStub> {
    private EventTelemetryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTelemetryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTelemetryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTelemetryStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public void event(io.bloombox.schema.services.telemetry.v1beta4.Event.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public void batch(io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public void error(io.bloombox.schema.services.telemetry.v1beta4.Exception request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
   * </pre>
   */
  public static final class EventTelemetryBlockingStub extends io.grpc.stub.AbstractStub<EventTelemetryBlockingStub> {
    private EventTelemetryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTelemetryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTelemetryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTelemetryBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response ping(io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public com.google.protobuf.Empty event(io.bloombox.schema.services.telemetry.v1beta4.Event.Request request) {
      return blockingUnaryCall(
          getChannel(), getEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse batch(io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public com.google.protobuf.Empty error(io.bloombox.schema.services.telemetry.v1beta4.Exception request) {
      return blockingUnaryCall(
          getChannel(), getErrorMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
   * </pre>
   */
  public static final class EventTelemetryFutureStub extends io.grpc.stub.AbstractStub<EventTelemetryFutureStub> {
    private EventTelemetryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTelemetryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTelemetryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTelemetryFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response> ping(
        io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> event(
        io.bloombox.schema.services.telemetry.v1beta4.Event.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse> batch(
        io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> error(
        io.bloombox.schema.services.telemetry.v1beta4.Exception request) {
      return futureUnaryCall(
          getChannel().newCall(getErrorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_EVENT = 1;
  private static final int METHODID_BATCH = 2;
  private static final int METHODID_ERROR = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventTelemetryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventTelemetryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryPing.Response>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((io.bloombox.schema.services.telemetry.v1beta4.Event.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH:
          serviceImpl.batch((io.bloombox.schema.services.telemetry.v1beta4.Event.BatchRequest) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta4.TelemetryResponse>) responseObserver);
          break;
        case METHODID_ERROR:
          serviceImpl.error((io.bloombox.schema.services.telemetry.v1beta4.Exception) request,
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

  private static abstract class EventTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventTelemetryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta4.TelemetryServiceBeta4.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventTelemetry");
    }
  }

  private static final class EventTelemetryFileDescriptorSupplier
      extends EventTelemetryBaseDescriptorSupplier {
    EventTelemetryFileDescriptorSupplier() {}
  }

  private static final class EventTelemetryMethodDescriptorSupplier
      extends EventTelemetryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventTelemetryMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventTelemetryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventTelemetryFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getEventMethod())
              .addMethod(getBatchMethod())
              .addMethod(getErrorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
