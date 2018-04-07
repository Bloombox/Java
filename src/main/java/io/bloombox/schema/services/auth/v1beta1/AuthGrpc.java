package io.bloombox.schema.services.auth.v1beta1;

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
 * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
 * profile information for UI purposes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: auth/v1beta1/AuthService_Beta1.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.auth.v1beta1.Auth";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.Ping.Request,
      io.bloombox.schema.services.auth.v1beta1.Ping.Response> METHOD_PING =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.Ping.Request, io.bloombox.schema.services.auth.v1beta1.Ping.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Ping"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.Ping.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.Ping.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
      io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> METHOD_AUTHENTICATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request, io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Authenticate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
      io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> METHOD_PROFILE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request, io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Profile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.GetProfile.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.GetProfile.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
      io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> METHOD_CONSENT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request, io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Consent"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthStub newStub(io.grpc.Channel channel) {
    return new AuthStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuthBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuthFutureStub(channel);
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static abstract class AuthImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PING, responseObserver);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public void authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_AUTHENTICATE, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public void profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PROFILE, responseObserver);
    }

    /**
     * <pre>
     * Perform a consent flow through Hydra.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONSENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PING,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.Ping.Request,
                io.bloombox.schema.services.auth.v1beta1.Ping.Response>(
                  this, METHODID_PING)))
          .addMethod(
            METHOD_AUTHENTICATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            METHOD_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>(
                  this, METHODID_PROFILE)))
          .addMethod(
            METHOD_CONSENT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>(
                  this, METHODID_CONSENT)))
          .build();
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthStub extends io.grpc.stub.AbstractStub<AuthStub> {
    private AuthStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public void ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public void authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public void profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PROFILE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Perform a consent flow through Hydra.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONSENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthBlockingStub extends io.grpc.stub.AbstractStub<AuthBlockingStub> {
    private AuthBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.Ping.Response ping(io.bloombox.schema.services.auth.v1beta1.Ping.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PING, getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_AUTHENTICATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.GetProfile.Response profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PROFILE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Perform a consent flow through Hydra.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONSENT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
   * profile information for UI purposes.
   * </pre>
   */
  public static final class AuthFutureStub extends io.grpc.stub.AbstractStub<AuthFutureStub> {
    private AuthFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuthFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuthFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Ping the auth server.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.Ping.Response> ping(
        io.bloombox.schema.services.auth.v1beta1.Ping.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PING, getCallOptions()), request);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> authenticate(
        io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_AUTHENTICATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> profile(
        io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PROFILE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Perform a consent flow through Hydra.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> consent(
        io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONSENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_PING = 0;
  private static final int METHODID_AUTHENTICATE = 1;
  private static final int METHODID_PROFILE = 2;
  private static final int METHODID_CONSENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING:
          serviceImpl.ping((io.bloombox.schema.services.auth.v1beta1.Ping.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.Ping.Response>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>) responseObserver);
          break;
        case METHODID_PROFILE:
          serviceImpl.profile((io.bloombox.schema.services.auth.v1beta1.GetProfile.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>) responseObserver);
          break;
        case METHODID_CONSENT:
          serviceImpl.consent((io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>) responseObserver);
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

  private static final class AuthDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthDescriptorSupplier())
              .addMethod(METHOD_PING)
              .addMethod(METHOD_AUTHENTICATE)
              .addMethod(METHOD_PROFILE)
              .addMethod(METHOD_CONSENT)
              .build();
        }
      }
    }
    return result;
  }
}
