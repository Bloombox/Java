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

package io.bloombox.schema.services.platform.v1;

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
 * Specifies the platform service, which provides utility/low-level platform methods, employed in health check probes
 * and other observability tools.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0)",
    comments = "Source: platform/v1/PlatformService_v1.proto")
public final class PlatformGrpc {

  private PlatformGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.platform.v1.Platform";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.Ping.Request,
      io.bloombox.schema.services.platform.v1.Ping.Response> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = io.bloombox.schema.services.platform.v1.Ping.Request.class,
      responseType = io.bloombox.schema.services.platform.v1.Ping.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.Ping.Request,
      io.bloombox.schema.services.platform.v1.Ping.Response> getPingMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.Ping.Request, io.bloombox.schema.services.platform.v1.Ping.Response> getPingMethod;
    if ((getPingMethod = PlatformGrpc.getPingMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getPingMethod = PlatformGrpc.getPingMethod) == null) {
          PlatformGrpc.getPingMethod = getPingMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.Ping.Request, io.bloombox.schema.services.platform.v1.Ping.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.Ping.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.Ping.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("Ping"))
                  .build();
          }
        }
     }
     return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getHealthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Health",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getHealthMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getHealthMethod;
    if ((getHealthMethod = PlatformGrpc.getHealthMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getHealthMethod = PlatformGrpc.getHealthMethod) == null) {
          PlatformGrpc.getHealthMethod = getHealthMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "Health"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("Health"))
                  .build();
          }
        }
     }
     return getHealthMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainResolve.Request,
      io.bloombox.schema.services.platform.v1.DomainResolve.Response> getResolveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Resolve",
      requestType = io.bloombox.schema.services.platform.v1.DomainResolve.Request.class,
      responseType = io.bloombox.schema.services.platform.v1.DomainResolve.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainResolve.Request,
      io.bloombox.schema.services.platform.v1.DomainResolve.Response> getResolveMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainResolve.Request, io.bloombox.schema.services.platform.v1.DomainResolve.Response> getResolveMethod;
    if ((getResolveMethod = PlatformGrpc.getResolveMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getResolveMethod = PlatformGrpc.getResolveMethod) == null) {
          PlatformGrpc.getResolveMethod = getResolveMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.DomainResolve.Request, io.bloombox.schema.services.platform.v1.DomainResolve.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "Resolve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.DomainResolve.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.DomainResolve.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("Resolve"))
                  .build();
          }
        }
     }
     return getResolveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainInfo.Request,
      io.bloombox.schema.services.platform.v1.DomainInfo.Response> getDomainsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Domains",
      requestType = io.bloombox.schema.services.platform.v1.DomainInfo.Request.class,
      responseType = io.bloombox.schema.services.platform.v1.DomainInfo.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainInfo.Request,
      io.bloombox.schema.services.platform.v1.DomainInfo.Response> getDomainsMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.DomainInfo.Request, io.bloombox.schema.services.platform.v1.DomainInfo.Response> getDomainsMethod;
    if ((getDomainsMethod = PlatformGrpc.getDomainsMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getDomainsMethod = PlatformGrpc.getDomainsMethod) == null) {
          PlatformGrpc.getDomainsMethod = getDomainsMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.DomainInfo.Request, io.bloombox.schema.services.platform.v1.DomainInfo.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "Domains"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.DomainInfo.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.DomainInfo.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("Domains"))
                  .build();
          }
        }
     }
     return getDomainsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.SiteInfo.Request,
      io.bloombox.schema.services.platform.v1.SiteInfo.Response> getSiteInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SiteInfo",
      requestType = io.bloombox.schema.services.platform.v1.SiteInfo.Request.class,
      responseType = io.bloombox.schema.services.platform.v1.SiteInfo.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.SiteInfo.Request,
      io.bloombox.schema.services.platform.v1.SiteInfo.Response> getSiteInfoMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.SiteInfo.Request, io.bloombox.schema.services.platform.v1.SiteInfo.Response> getSiteInfoMethod;
    if ((getSiteInfoMethod = PlatformGrpc.getSiteInfoMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getSiteInfoMethod = PlatformGrpc.getSiteInfoMethod) == null) {
          PlatformGrpc.getSiteInfoMethod = getSiteInfoMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.SiteInfo.Request, io.bloombox.schema.services.platform.v1.SiteInfo.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "SiteInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.SiteInfo.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.SiteInfo.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("SiteInfo"))
                  .build();
          }
        }
     }
     return getSiteInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.BrandInfo.Request,
      io.bloombox.schema.services.platform.v1.BrandInfo.Response> getBrandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Brand",
      requestType = io.bloombox.schema.services.platform.v1.BrandInfo.Request.class,
      responseType = io.bloombox.schema.services.platform.v1.BrandInfo.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.BrandInfo.Request,
      io.bloombox.schema.services.platform.v1.BrandInfo.Response> getBrandMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.platform.v1.BrandInfo.Request, io.bloombox.schema.services.platform.v1.BrandInfo.Response> getBrandMethod;
    if ((getBrandMethod = PlatformGrpc.getBrandMethod) == null) {
      synchronized (PlatformGrpc.class) {
        if ((getBrandMethod = PlatformGrpc.getBrandMethod) == null) {
          PlatformGrpc.getBrandMethod = getBrandMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.platform.v1.BrandInfo.Request, io.bloombox.schema.services.platform.v1.BrandInfo.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.platform.v1.Platform", "Brand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.BrandInfo.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.platform.v1.BrandInfo.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new PlatformMethodDescriptorSupplier("Brand"))
                  .build();
          }
        }
     }
     return getBrandMethod;
  }

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
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getHealthMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public void resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainResolve.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getResolveMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public void domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDomainsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves metadata found in an HTML Document for a given partner/location.
     * </pre>
     */
    public void siteInfo(io.bloombox.schema.services.platform.v1.SiteInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.SiteInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getSiteInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve brand assets and info for a given partner/location.
     * </pre>
     */
    public void brand(io.bloombox.schema.services.platform.v1.BrandInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.BrandInfo.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getBrandMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.Ping.Request,
                io.bloombox.schema.services.platform.v1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            getHealthMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_HEALTH)))
          .addMethod(
            getResolveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.DomainResolve.Request,
                io.bloombox.schema.services.platform.v1.DomainResolve.Response>(
                  this, METHODID_RESOLVE)))
          .addMethod(
            getDomainsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.DomainInfo.Request,
                io.bloombox.schema.services.platform.v1.DomainInfo.Response>(
                  this, METHODID_DOMAINS)))
          .addMethod(
            getSiteInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.SiteInfo.Request,
                io.bloombox.schema.services.platform.v1.SiteInfo.Response>(
                  this, METHODID_SITE_INFO)))
          .addMethod(
            getBrandMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.platform.v1.BrandInfo.Request,
                io.bloombox.schema.services.platform.v1.BrandInfo.Response>(
                  this, METHODID_BRAND)))
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
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public void health(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public void resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainResolve.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResolveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public void domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.DomainInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDomainsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves metadata found in an HTML Document for a given partner/location.
     * </pre>
     */
    public void siteInfo(io.bloombox.schema.services.platform.v1.SiteInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.SiteInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSiteInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve brand assets and info for a given partner/location.
     * </pre>
     */
    public void brand(io.bloombox.schema.services.platform.v1.BrandInfo.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.BrandInfo.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBrandMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public com.google.protobuf.Empty health(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getHealthMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.DomainResolve.Response resolve(io.bloombox.schema.services.platform.v1.DomainResolve.Request request) {
      return blockingUnaryCall(
          getChannel(), getResolveMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.DomainInfo.Response domains(io.bloombox.schema.services.platform.v1.DomainInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), getDomainsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves metadata found in an HTML Document for a given partner/location.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.SiteInfo.Response siteInfo(io.bloombox.schema.services.platform.v1.SiteInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), getSiteInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve brand assets and info for a given partner/location.
     * </pre>
     */
    public io.bloombox.schema.services.platform.v1.BrandInfo.Response brand(io.bloombox.schema.services.platform.v1.BrandInfo.Request request) {
      return blockingUnaryCall(
          getChannel(), getBrandMethod(), getCallOptions(), request);
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
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Run a health check, returning a status code indicating overall service health.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> health(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getHealthMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve ownership information for a hosted domain.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.DomainResolve.Response> resolve(
        io.bloombox.schema.services.platform.v1.DomainResolve.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getResolveMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve domain info for a given partner/location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.DomainInfo.Response> domains(
        io.bloombox.schema.services.platform.v1.DomainInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getDomainsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves metadata found in an HTML Document for a given partner/location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.SiteInfo.Response> siteInfo(
        io.bloombox.schema.services.platform.v1.SiteInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getSiteInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve brand assets and info for a given partner/location.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.platform.v1.BrandInfo.Response> brand(
        io.bloombox.schema.services.platform.v1.BrandInfo.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getBrandMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_HEALTH = 1;
  private static final int METHODID_RESOLVE = 2;
  private static final int METHODID_DOMAINS = 3;
  private static final int METHODID_SITE_INFO = 4;
  private static final int METHODID_BRAND = 5;

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
        case METHODID_SITE_INFO:
          serviceImpl.siteInfo((io.bloombox.schema.services.platform.v1.SiteInfo.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.SiteInfo.Response>) responseObserver);
          break;
        case METHODID_BRAND:
          serviceImpl.brand((io.bloombox.schema.services.platform.v1.BrandInfo.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.platform.v1.BrandInfo.Response>) responseObserver);
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

  private static abstract class PlatformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PlatformBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.platform.v1.PlatformServiceV1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Platform");
    }
  }

  private static final class PlatformFileDescriptorSupplier
      extends PlatformBaseDescriptorSupplier {
    PlatformFileDescriptorSupplier() {}
  }

  private static final class PlatformMethodDescriptorSupplier
      extends PlatformBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PlatformMethodDescriptorSupplier(String methodName) {
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
      synchronized (PlatformGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PlatformFileDescriptorSupplier())
              .addMethod(getPingMethod())
              .addMethod(getHealthMethod())
              .addMethod(getResolveMethod())
              .addMethod(getDomainsMethod())
              .addMethod(getSiteInfoMethod())
              .addMethod(getBrandMethod())
              .build();
        }
      }
    }
    return result;
  }
}
