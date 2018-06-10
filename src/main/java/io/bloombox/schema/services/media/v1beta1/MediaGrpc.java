package io.bloombox.schema.services.media.v1beta1;

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
 * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
 * associated with various system data points.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: media/v1beta1/MediaService_Beta1.proto")
public final class MediaGrpc {

  private MediaGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.media.v1beta1.Media";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.ListMedia.Request,
      io.bloombox.schema.services.media.v1beta1.ListMedia.Response> METHOD_LIST =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.ListMedia.Request, io.bloombox.schema.services.media.v1beta1.ListMedia.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.media.v1beta1.Media", "List"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.ListMedia.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.ListMedia.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.GetMedia.Request,
      io.bloombox.schema.services.media.v1beta1.GetMedia.Response> METHOD_RETRIEVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.GetMedia.Request, io.bloombox.schema.services.media.v1beta1.GetMedia.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.media.v1beta1.Media", "Retrieve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.GetMedia.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.GetMedia.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request,
      io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> METHOD_UPLOAD =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request, io.bloombox.schema.services.media.v1beta1.UploadMedia.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.media.v1beta1.Media", "Upload"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.UploadMedia.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.UploadMedia.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request,
      com.google.protobuf.Empty> METHOD_ATTACH =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.media.v1beta1.Media", "Attach"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.media.v1beta1.AttachMedia.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MediaStub newStub(io.grpc.Channel channel) {
    return new MediaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MediaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MediaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MediaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MediaFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
   * associated with various system data points.
   * </pre>
   */
  public static abstract class MediaImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * List media items for a given ownership scope (usually a partner or partner location). Only media items owned by
     * the invoking partner/location are listed.
     * </pre>
     */
    public void list(io.bloombox.schema.services.media.v1beta1.ListMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.ListMedia.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LIST, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.media.v1beta1.GetMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.GetMedia.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RETRIEVE, responseObserver);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public void upload(io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPLOAD, responseObserver);
    }

    /**
     * <pre>
     * Notify the platform that a piece of recently uploaded/provisioned media is ready to be attached to the underlying
     * subject parent (i.e. the product the media is depicting, or the partner/location the media is branding for, and so
     * on), in cases where a client must perform followup to upload media to a separate endpoint.
     * </pre>
     */
    public void attach(io.bloombox.schema.services.media.v1beta1.AttachMedia.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ATTACH, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LIST,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.ListMedia.Request,
                io.bloombox.schema.services.media.v1beta1.ListMedia.Response>(
                  this, METHODID_LIST)))
          .addMethod(
            METHOD_RETRIEVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.GetMedia.Request,
                io.bloombox.schema.services.media.v1beta1.GetMedia.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            METHOD_UPLOAD,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.UploadMedia.Request,
                io.bloombox.schema.services.media.v1beta1.UploadMedia.Response>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            METHOD_ATTACH,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.AttachMedia.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_ATTACH)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
   * associated with various system data points.
   * </pre>
   */
  public static final class MediaStub extends io.grpc.stub.AbstractStub<MediaStub> {
    private MediaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaStub(channel, callOptions);
    }

    /**
     * <pre>
     * List media items for a given ownership scope (usually a partner or partner location). Only media items owned by
     * the invoking partner/location are listed.
     * </pre>
     */
    public void list(io.bloombox.schema.services.media.v1beta1.ListMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.ListMedia.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.media.v1beta1.GetMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.GetMedia.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public void upload(io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPLOAD, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify the platform that a piece of recently uploaded/provisioned media is ready to be attached to the underlying
     * subject parent (i.e. the product the media is depicting, or the partner/location the media is branding for, and so
     * on), in cases where a client must perform followup to upload media to a separate endpoint.
     * </pre>
     */
    public void attach(io.bloombox.schema.services.media.v1beta1.AttachMedia.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ATTACH, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
   * associated with various system data points.
   * </pre>
   */
  public static final class MediaBlockingStub extends io.grpc.stub.AbstractStub<MediaBlockingStub> {
    private MediaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * List media items for a given ownership scope (usually a partner or partner location). Only media items owned by
     * the invoking partner/location are listed.
     * </pre>
     */
    public io.bloombox.schema.services.media.v1beta1.ListMedia.Response list(io.bloombox.schema.services.media.v1beta1.ListMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LIST, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public io.bloombox.schema.services.media.v1beta1.GetMedia.Response retrieve(io.bloombox.schema.services.media.v1beta1.GetMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RETRIEVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public io.bloombox.schema.services.media.v1beta1.UploadMedia.Response upload(io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPLOAD, getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify the platform that a piece of recently uploaded/provisioned media is ready to be attached to the underlying
     * subject parent (i.e. the product the media is depicting, or the partner/location the media is branding for, and so
     * on), in cases where a client must perform followup to upload media to a separate endpoint.
     * </pre>
     */
    public com.google.protobuf.Empty attach(io.bloombox.schema.services.media.v1beta1.AttachMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ATTACH, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
   * associated with various system data points.
   * </pre>
   */
  public static final class MediaFutureStub extends io.grpc.stub.AbstractStub<MediaFutureStub> {
    private MediaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MediaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MediaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MediaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * List media items for a given ownership scope (usually a partner or partner location). Only media items owned by
     * the invoking partner/location are listed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.media.v1beta1.ListMedia.Response> list(
        io.bloombox.schema.services.media.v1beta1.ListMedia.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LIST, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.media.v1beta1.GetMedia.Response> retrieve(
        io.bloombox.schema.services.media.v1beta1.GetMedia.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RETRIEVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> upload(
        io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPLOAD, getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify the platform that a piece of recently uploaded/provisioned media is ready to be attached to the underlying
     * subject parent (i.e. the product the media is depicting, or the partner/location the media is branding for, and so
     * on), in cases where a client must perform followup to upload media to a separate endpoint.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> attach(
        io.bloombox.schema.services.media.v1beta1.AttachMedia.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ATTACH, getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST = 0;
  private static final int METHODID_RETRIEVE = 1;
  private static final int METHODID_UPLOAD = 2;
  private static final int METHODID_ATTACH = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MediaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MediaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST:
          serviceImpl.list((io.bloombox.schema.services.media.v1beta1.ListMedia.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.ListMedia.Response>) responseObserver);
          break;
        case METHODID_RETRIEVE:
          serviceImpl.retrieve((io.bloombox.schema.services.media.v1beta1.GetMedia.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.GetMedia.Response>) responseObserver);
          break;
        case METHODID_UPLOAD:
          serviceImpl.upload((io.bloombox.schema.services.media.v1beta1.UploadMedia.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.UploadMedia.Response>) responseObserver);
          break;
        case METHODID_ATTACH:
          serviceImpl.attach((io.bloombox.schema.services.media.v1beta1.AttachMedia.Request) request,
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

  private static final class MediaDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MediaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaDescriptorSupplier())
              .addMethod(METHOD_LIST)
              .addMethod(METHOD_RETRIEVE)
              .addMethod(METHOD_UPLOAD)
              .addMethod(METHOD_ATTACH)
              .build();
        }
      }
    }
    return result;
  }
}
