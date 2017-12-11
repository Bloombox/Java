package io.bloombox.schema.services.telemetry.v1beta2;

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
 * Provides support for transmission of operational and experiential telemetry data from first and second-party devices.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: telemetry/v1beta2/TelemetryService_Beta2.proto")
public final class EventTelemetryGrpc {

  private EventTelemetryGrpc() {}

  public static final String SERVICE_NAME = "services.telemetry.v1beta2.EventTelemetry";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request,
      io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request, io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.telemetry.v1beta2.EventTelemetry", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta2.Event.Request,
      com.google.protobuf.Empty> METHOD_EVENT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta2.Event.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.telemetry.v1beta2.EventTelemetry", "Event"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.Event.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest,
      io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse> METHOD_BATCH =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest, io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.telemetry.v1beta2.EventTelemetry", "Batch"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.telemetry.v1beta2.Exception,
      com.google.protobuf.Empty> METHOD_ERROR =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.telemetry.v1beta2.Exception, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "services.telemetry.v1beta2.EventTelemetry", "Error"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.telemetry.v1beta2.Exception.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

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
    public void ping(io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public void event(io.bloombox.schema.services.telemetry.v1beta2.Event.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_EVENT, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public void batch(io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_BATCH, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public void error(io.bloombox.schema.services.telemetry.v1beta2.Exception request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ERROR, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request,
                io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_EVENT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta2.Event.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_EVENT)))
          .addMethod(
            METHOD_BATCH,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest,
                io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse>(
                  this, METHODID_BATCH)))
          .addMethod(
            METHOD_ERROR,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.telemetry.v1beta2.Exception,
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
    public void ping(io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public void event(io.bloombox.schema.services.telemetry.v1beta2.Event.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EVENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public void batch(io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_BATCH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public void error(io.bloombox.schema.services.telemetry.v1beta2.Exception request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ERROR, getCallOptions()), request, responseObserver);
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
    public io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response ping(io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public com.google.protobuf.Empty event(io.bloombox.schema.services.telemetry.v1beta2.Event.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_EVENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse batch(io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_BATCH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public com.google.protobuf.Empty error(io.bloombox.schema.services.telemetry.v1beta2.Exception request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ERROR, getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response> ping(
        io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit a generic event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> event(
        io.bloombox.schema.services.telemetry.v1beta2.Event.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EVENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit one or more generic events via the batch interface.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse> batch(
        io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_BATCH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Submit one or more exception events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> error(
        io.bloombox.schema.services.telemetry.v1beta2.Exception request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ERROR, getCallOptions()), request);
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
          serviceImpl.ping((io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryPing.Response>) responseObserver);
          break;
        case METHODID_EVENT:
          serviceImpl.event((io.bloombox.schema.services.telemetry.v1beta2.Event.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BATCH:
          serviceImpl.batch((io.bloombox.schema.services.telemetry.v1beta2.Event.BatchRequest) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.telemetry.v1beta2.TelemetryResponse>) responseObserver);
          break;
        case METHODID_ERROR:
          serviceImpl.error((io.bloombox.schema.services.telemetry.v1beta2.Exception) request,
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

  private static final class EventTelemetryDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.telemetry.v1beta2.TelemetryServiceBeta2.getDescriptor();
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
              .setSchemaDescriptor(new EventTelemetryDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_EVENT)
              .addMethod(METHOD_BATCH)
              .addMethod(METHOD_ERROR)
              .build();
        }
      }
    }
    return result;
  }
}
