package io.bloombox.schema.services.partners.v1beta1;

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
 * Specifies the partners service, which provides information about partner and location accounts.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: partners/v1beta1/PartnersService_Beta1.proto")
public final class PartnersGrpc {

  private PartnersGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.partners.v1beta1.Partners";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> METHOD_LIST =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.PartnerList.Request, io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.partners.v1beta1.Partners", "List"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.PartnerList.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.PartnerList.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request,
      io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> METHOD_RETRIEVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request, io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.partners.v1beta1.Partners", "Retrieve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationList.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationList.Response> METHOD_LOCATIONS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.LocationList.Request, io.bloombox.schema.services.partners.v1beta1.LocationList.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.partners.v1beta1.Partners", "Locations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.LocationList.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.LocationList.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request,
      io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> METHOD_LOCATION =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.partners.v1beta1.LocationGet.Request, io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.partners.v1beta1.Partners", "Location"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.LocationGet.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.partners.v1beta1.LocationGet.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PartnersStub newStub(io.grpc.Channel channel) {
    return new PartnersStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PartnersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PartnersBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PartnersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PartnersFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static abstract class PartnersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public void list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE, responseObserver);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATIONS, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATION, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.PartnerList.Request,
                io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_RETRIEVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request,
                io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            METHOD_LOCATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.LocationList.Request,
                io.bloombox.schema.services.partners.v1beta1.LocationList.Response>(
                  this, METHODID_LOCATIONS)))
          .addMethod(
            METHOD_LOCATION,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.partners.v1beta1.LocationGet.Request,
                io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>(
                  this, METHODID_LOCATION)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersStub extends io.grpc.stub.AbstractStub<PartnersStub> {
    private PartnersStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public void list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATION, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersBlockingStub extends io.grpc.stub.AbstractStub<PartnersBlockingStub> {
    private PartnersBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.PartnerList.Response list(io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response retrieve(io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.LocationList.Response locations(io.bloombox.schema.services.partners.v1beta1.LocationList.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public io.bloombox.schema.services.partners.v1beta1.LocationGet.Response location(io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATION, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the partners service, which provides information about partner and location accounts.
   * </pre>
   */
  public static final class PartnersFutureStub extends io.grpc.stub.AbstractStub<PartnersFutureStub> {
    private PartnersFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PartnersFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PartnersFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PartnersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List partners known to the system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response> list(
        io.bloombox.schema.services.partners.v1beta1.PartnerList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response> retrieve(
        io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve locations for an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.LocationList.Response> locations(
        io.bloombox.schema.services.partners.v1beta1.LocationList.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response> location(
        io.bloombox.schema.services.partners.v1beta1.LocationGet.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATION, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_LOCATIONS = 2;
  private static final int METHODID_LOCATION = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PartnersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PartnersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((io.bloombox.schema.services.partners.v1beta1.PartnerList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerList.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.bloombox.schema.services.partners.v1beta1.PartnerGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.PartnerGet.Response>) responseObserver);
          break;
        case METHODID_LOCATIONS:
          serviceImpl.locations((io.bloombox.schema.services.partners.v1beta1.LocationList.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationList.Response>) responseObserver);
          break;
        case METHODID_LOCATION:
          serviceImpl.location((io.bloombox.schema.services.partners.v1beta1.LocationGet.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.partners.v1beta1.LocationGet.Response>) responseObserver);
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

  private static final class PartnersDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.partners.v1beta1.PartnersServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PartnersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PartnersDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_RETRIEVE)
              .addMethod(METHOD_LOCATIONS)
              .addMethod(METHOD_LOCATION)
              .build();
        }
      }
    }
    return result;
  }
}
