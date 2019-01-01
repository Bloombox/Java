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

package io.bloombox.schema.services.media.v1beta1;

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
 * Specifies the media service, which provides tools for resolving, uploading/updating, and managing rich media data
 * associated with various system data points.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0-SNAPSHOT)",
    comments = "Source: media/v1beta1/MediaService_Beta1.proto")
public final class MediaGrpc {

  private MediaGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.media.v1beta1.Media";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.ListMedia.Request,
      io.bloombox.schema.services.media.v1beta1.ListMedia.Response> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = io.bloombox.schema.services.media.v1beta1.ListMedia.Request.class,
      responseType = io.bloombox.schema.services.media.v1beta1.ListMedia.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.ListMedia.Request,
      io.bloombox.schema.services.media.v1beta1.ListMedia.Response> getListMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.ListMedia.Request, io.bloombox.schema.services.media.v1beta1.ListMedia.Response> getListMethod;
    if ((getListMethod = MediaGrpc.getListMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getListMethod = MediaGrpc.getListMethod) == null) {
          MediaGrpc.getListMethod = getListMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.ListMedia.Request, io.bloombox.schema.services.media.v1beta1.ListMedia.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.media.v1beta1.Media", "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.ListMedia.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.ListMedia.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaMethodDescriptorSupplier("List"))
                  .build();
          }
        }
     }
     return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.GetMedia.Request,
      io.bloombox.schema.services.media.v1beta1.GetMedia.Response> getRetrieveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Retrieve",
      requestType = io.bloombox.schema.services.media.v1beta1.GetMedia.Request.class,
      responseType = io.bloombox.schema.services.media.v1beta1.GetMedia.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.GetMedia.Request,
      io.bloombox.schema.services.media.v1beta1.GetMedia.Response> getRetrieveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.GetMedia.Request, io.bloombox.schema.services.media.v1beta1.GetMedia.Response> getRetrieveMethod;
    if ((getRetrieveMethod = MediaGrpc.getRetrieveMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getRetrieveMethod = MediaGrpc.getRetrieveMethod) == null) {
          MediaGrpc.getRetrieveMethod = getRetrieveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.GetMedia.Request, io.bloombox.schema.services.media.v1beta1.GetMedia.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.media.v1beta1.Media", "Retrieve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.GetMedia.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.GetMedia.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaMethodDescriptorSupplier("Retrieve"))
                  .build();
          }
        }
     }
     return getRetrieveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request,
      io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> getUploadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Upload",
      requestType = io.bloombox.schema.services.media.v1beta1.UploadMedia.Request.class,
      responseType = io.bloombox.schema.services.media.v1beta1.UploadMedia.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request,
      io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> getUploadMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request, io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> getUploadMethod;
    if ((getUploadMethod = MediaGrpc.getUploadMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getUploadMethod = MediaGrpc.getUploadMethod) == null) {
          MediaGrpc.getUploadMethod = getUploadMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.UploadMedia.Request, io.bloombox.schema.services.media.v1beta1.UploadMedia.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.media.v1beta1.Media", "Upload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.UploadMedia.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.UploadMedia.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaMethodDescriptorSupplier("Upload"))
                  .build();
          }
        }
     }
     return getUploadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request,
      com.google.protobuf.Empty> getAttachMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Attach",
      requestType = io.bloombox.schema.services.media.v1beta1.AttachMedia.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request,
      com.google.protobuf.Empty> getAttachMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request, com.google.protobuf.Empty> getAttachMethod;
    if ((getAttachMethod = MediaGrpc.getAttachMethod) == null) {
      synchronized (MediaGrpc.class) {
        if ((getAttachMethod = MediaGrpc.getAttachMethod) == null) {
          MediaGrpc.getAttachMethod = getAttachMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.media.v1beta1.AttachMedia.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.media.v1beta1.Media", "Attach"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.media.v1beta1.AttachMedia.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new MediaMethodDescriptorSupplier("Attach"))
                  .build();
          }
        }
     }
     return getAttachMethod;
  }

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
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public void retrieve(io.bloombox.schema.services.media.v1beta1.GetMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.GetMedia.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public void upload(io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.media.v1beta1.UploadMedia.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUploadMethod(), responseObserver);
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
      asyncUnimplementedUnaryCall(getAttachMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.ListMedia.Request,
                io.bloombox.schema.services.media.v1beta1.ListMedia.Response>(
                  this, METHODID_LIST)))
          .addMethod(
            getRetrieveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.GetMedia.Request,
                io.bloombox.schema.services.media.v1beta1.GetMedia.Response>(
                  this, METHODID_RETRIEVE)))
          .addMethod(
            getUploadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.media.v1beta1.UploadMedia.Request,
                io.bloombox.schema.services.media.v1beta1.UploadMedia.Response>(
                  this, METHODID_UPLOAD)))
          .addMethod(
            getAttachMethod(),
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
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getUploadMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getAttachMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual media item, addressable by its media key. If it cannot be found or the invoking user does
     * not have permission to access it, a 404 is returned.
     * </pre>
     */
    public io.bloombox.schema.services.media.v1beta1.GetMedia.Response retrieve(io.bloombox.schema.services.media.v1beta1.GetMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Provision a record for a new media item, and update the data attached to that record with an initial value. That
     * is, upload and store a new, individual media item.
     * </pre>
     */
    public io.bloombox.schema.services.media.v1beta1.UploadMedia.Response upload(io.bloombox.schema.services.media.v1beta1.UploadMedia.Request request) {
      return blockingUnaryCall(
          getChannel(), getUploadMethod(), getCallOptions(), request);
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
          getChannel(), getAttachMethod(), getCallOptions(), request);
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
          getChannel().newCall(getListMethod(), getCallOptions()), request);
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
          getChannel().newCall(getRetrieveMethod(), getCallOptions()), request);
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
          getChannel().newCall(getUploadMethod(), getCallOptions()), request);
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
          getChannel().newCall(getAttachMethod(), getCallOptions()), request);
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

  private static abstract class MediaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MediaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.media.v1beta1.MediaServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Media");
    }
  }

  private static final class MediaFileDescriptorSupplier
      extends MediaBaseDescriptorSupplier {
    MediaFileDescriptorSupplier() {}
  }

  private static final class MediaMethodDescriptorSupplier
      extends MediaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MediaMethodDescriptorSupplier(String methodName) {
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
      synchronized (MediaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MediaFileDescriptorSupplier())
              .addMethod(getListMethod())
              .addMethod(getRetrieveMethod())
              .addMethod(getUploadMethod())
              .addMethod(getAttachMethod())
              .build();
        }
      }
    }
    return result;
  }
}
