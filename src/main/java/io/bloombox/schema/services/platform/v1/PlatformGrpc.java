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

package io.bloombox.schema.services.platform.v1;

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
 * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
 * and other observability tools.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: platform/v1/PlatformService_v1.proto")
public final class PlatformGrpc {

  private PlatformGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.platform.v1.Platform";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.Ping.Request,
      io.bloombox.schema.services.platform.v1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.Ping.Request, io.bloombox.schema.services.platform.v1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.platform.v1.Platform", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_HEALTH =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.platform.v1.Platform", "Health"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainResolve.Request,
      io.bloombox.schema.services.platform.v1.DomainResolve.Response> METHOD_RESOLVE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.DomainResolve.Request, io.bloombox.schema.services.platform.v1.DomainResolve.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.platform.v1.Platform", "Resolve"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.DomainResolve.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.DomainResolve.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainInfo.Request,
      io.bloombox.schema.services.platform.v1.DomainInfo.Response> METHOD_DOMAINS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.DomainInfo.Request, io.bloombox.schema.services.platform.v1.DomainInfo.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.platform.v1.Platform", "Domains"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.DomainInfo.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.platform.v1.DomainInfo.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PlatformStub newStub(io.grpc.Channel channel) {
    return new PlatformStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PlatformBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PlatformBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PlatformFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PlatformFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
   * and other observability tools.
   * </pre>
   */
  public static abstract class PlatformImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the platform server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.platform.v1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_HEALTH, responseObserver);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public void resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainResolve.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_RESOLVE, responseObserver);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public void domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DOMAINS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.Ping.Request,
                io.bloombox.schema.services.platform.v1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_HEALTH,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_HEALTH)))
          .addMethod(
            METHOD_RESOLVE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.DomainResolve.Request,
                io.bloombox.schema.services.platform.v1.DomainResolve.Response>(
                  this, METHODID_RESOLVE)))
          .addMethod(
            METHOD_DOMAINS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.DomainInfo.Request,
                io.bloombox.schema.services.platform.v1.DomainInfo.Response>(
                  this, METHODID_DOMAINS)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
   * and other observability tools.
   * </pre>
   */
  public static final class PlatformStub extends io.grpc.stub.AbstractStub<PlatformStub> {
    private PlatformStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the platform server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.platform.v1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_HEALTH, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public void resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainResolve.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_RESOLVE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public void domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DOMAINS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
   * and other observability tools.
   * </pre>
   */
  public static final class PlatformBlockingStub extends io.grpc.stub.AbstractStub<PlatformBlockingStub> {
    private PlatformBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the platform server.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.Ping.Response ping(io.bloombox.schema.services.platform.v1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public com.google.protobuf.Empty health(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_HEALTH, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.DomainResolve.Response resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_RESOLVE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.DomainInfo.Response domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DOMAINS, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
   * and other observability tools.
   * </pre>
   */
  public static final class PlatformFutureStub extends io.grpc.stub.AbstractStub<PlatformFutureStub> {
    private PlatformFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PlatformFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PlatformFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PlatformFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the platform server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.Ping.Response> ping(
        io.bloombox.schema.services.platform.v1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> health(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_HEALTH, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.DomainResolve.Response> resolve(
        io.bloombox.schema.services.platform.v1.DomainResolve.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_RESOLVE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.DomainInfo.Response> domains(
        io.bloombox.schema.services.platform.v1.DomainInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DOMAINS, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_HEALTH = 1;
  private static final int METHODID_RESOLVE = 2;
  private static final int METHODID_DOMAINS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PlatformImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PlatformImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.platform.v1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.Ping.Response>) responseObserver);
          break;
        case METHODID_HEALTH:
          serviceImpl.health((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_RESOLVE:
          serviceImpl.resolve((io.bloombox.schema.services.platform.v1.DomainResolve.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainResolve.Response>) responseObserver);
          break;
        case METHODID_DOMAINS:
          serviceImpl.domains((io.bloombox.schema.services.platform.v1.DomainInfo.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainInfo.Response>) responseObserver);
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

  private static final class PlatformDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.platform.v1.PlatformServiceV1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PlatformGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlatformDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_HEALTH)
              .addMethod(METHOD_RESOLVE)
              .addMethod(METHOD_DOMAINS)
              .build();
        }
      }
    }
    return result;
  }
}
