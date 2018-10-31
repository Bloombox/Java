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
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.bloombox.schema.services.auth.v1beta1.AuthNonce> METHOD_NONCE =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.bloombox.schema.services.auth.v1beta1.AuthNonce>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Nonce"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.AuthNonce.getDefaultInstance()))
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
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request,
      io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> METHOD_TOKEN =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request, io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Token"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept,
      com.google.protobuf.Empty> METHOD_ACCEPT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Accept"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject,
      com.google.protobuf.Empty> METHOD_REJECT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Reject"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request,
      io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> METHOD_CONNECT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request, io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Connect"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.UserContext.Request,
      io.bloombox.schema.services.auth.v1beta1.UserContext.Response> METHOD_CONTEXT =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.UserContext.Request, io.bloombox.schema.services.auth.v1beta1.UserContext.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.auth.v1beta1.Auth", "Context"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.UserContext.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.auth.v1beta1.UserContext.Response.getDefaultInstance()))
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
     * Generate an authentication nonce, which is usable once, and only once, to perform an auth flow.
     * </pre>
     */
    public void nonce(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthNonce> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_NONCE, responseObserver);
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
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONSENT, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public void token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_TOKEN, responseObserver);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public void accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_ACCEPT, responseObserver);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public void reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_REJECT, responseObserver);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public void connect(io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONNECT, responseObserver);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public void context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CONTEXT, responseObserver);
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

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_NONCE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.bloombox.schema.services.auth.v1beta1.AuthNonce>(
                  this, METHODID_NONCE)))
          .addMethod(
            METHOD_AUTHENTICATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            METHOD_CONSENT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>(
                  this, METHODID_CONSENT)))
          .addMethod(
            METHOD_TOKEN,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request,
                io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response>(
                  this, METHODID_TOKEN)))
          .addMethod(
            METHOD_ACCEPT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept,
                com.google.protobuf.Empty>(
                  this, METHODID_ACCEPT)))
          .addMethod(
            METHOD_REJECT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject,
                com.google.protobuf.Empty>(
                  this, METHODID_REJECT)))
          .addMethod(
            METHOD_CONNECT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request,
                io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response>(
                  this, METHODID_CONNECT)))
          .addMethod(
            METHOD_CONTEXT,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.UserContext.Request,
                io.bloombox.schema.services.auth.v1beta1.UserContext.Response>(
                  this, METHODID_CONTEXT)))
          .addMethod(
            METHOD_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>(
                  this, METHODID_PROFILE)))
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
     * Generate an authentication nonce, which is usable once, and only once, to perform an auth flow.
     * </pre>
     */
    public void nonce(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthNonce> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NONCE, getCallOptions()), request, responseObserver);
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
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONSENT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public void token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_TOKEN, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public void accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_ACCEPT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public void reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_REJECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public void connect(io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONNECT, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public void context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CONTEXT, getCallOptions()), request, responseObserver);
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
     * Generate an authentication nonce, which is usable once, and only once, to perform an auth flow.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.AuthNonce nonce(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_NONCE, getCallOptions(), request);
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
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONSENT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_TOKEN, getCallOptions(), request);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public com.google.protobuf.Empty accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request) {
      return blockingUnaryCall(
          getChannel(), METHOD_ACCEPT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public com.google.protobuf.Empty reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request) {
      return blockingUnaryCall(
          getChannel(), METHOD_REJECT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response connect(io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONNECT, getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.UserContext.Response context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CONTEXT, getCallOptions(), request);
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
     * Generate an authentication nonce, which is usable once, and only once, to perform an auth flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.AuthNonce> nonce(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NONCE, getCallOptions()), request);
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
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> consent(
        io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONSENT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> token(
        io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_TOKEN, getCallOptions()), request);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> accept(
        io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_ACCEPT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reject(
        io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_REJECT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> connect(
        io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONNECT, getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> context(
        io.bloombox.schema.services.auth.v1beta1.UserContext.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CONTEXT, getCallOptions()), request);
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
  }

  private static final int METHODID_NONCE = 0;
  private static final int METHODID_AUTHENTICATE = 1;
  private static final int METHODID_CONSENT = 2;
  private static final int METHODID_TOKEN = 3;
  private static final int METHODID_ACCEPT = 4;
  private static final int METHODID_REJECT = 5;
  private static final int METHODID_CONNECT = 6;
  private static final int METHODID_CONTEXT = 7;
  private static final int METHODID_PROFILE = 8;

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
        case METHODID_NONCE:
          serviceImpl.nonce((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthNonce>) responseObserver);
          break;
        case METHODID_AUTHENTICATE:
          serviceImpl.authenticate((io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>) responseObserver);
          break;
        case METHODID_CONSENT:
          serviceImpl.consent((io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>) responseObserver);
          break;
        case METHODID_TOKEN:
          serviceImpl.token((io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response>) responseObserver);
          break;
        case METHODID_ACCEPT:
          serviceImpl.accept((io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REJECT:
          serviceImpl.reject((io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CONNECT:
          serviceImpl.connect((io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response>) responseObserver);
          break;
        case METHODID_CONTEXT:
          serviceImpl.context((io.bloombox.schema.services.auth.v1beta1.UserContext.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.UserContext.Response>) responseObserver);
          break;
        case METHODID_PROFILE:
          serviceImpl.profile((io.bloombox.schema.services.auth.v1beta1.GetProfile.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>) responseObserver);
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
              .addMethod(METHOD_NONCE)
              .addMethod(METHOD_AUTHENTICATE)
              .addMethod(METHOD_CONSENT)
              .addMethod(METHOD_TOKEN)
              .addMethod(METHOD_ACCEPT)
              .addMethod(METHOD_REJECT)
              .addMethod(METHOD_CONNECT)
              .addMethod(METHOD_CONTEXT)
              .addMethod(METHOD_PROFILE)
              .build();
        }
      }
    }
    return result;
  }
}
