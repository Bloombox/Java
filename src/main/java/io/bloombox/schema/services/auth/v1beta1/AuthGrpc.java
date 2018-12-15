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

package io.bloombox.schema.services.auth.v1beta1;

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
 * Specifies the Auth service, which is responsible for authenticating and authorizing users. It also provides limited
 * profile information for UI purposes.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.18.0-SNAPSHOT)",
    comments = "Source: auth/v1beta1/AuthService_Beta1.proto")
public final class AuthGrpc {

  private AuthGrpc() {}

  public static final String SERVICE_NAME = "bloombox.services.auth.v1beta1.Auth";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.bloombox.schema.services.auth.v1beta1.AuthNonce> getNonceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Nonce",
      requestType = com.google.protobuf.Empty.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.AuthNonce.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      io.bloombox.schema.services.auth.v1beta1.AuthNonce> getNonceMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, io.bloombox.schema.services.auth.v1beta1.AuthNonce> getNonceMethod;
    if ((getNonceMethod = AuthGrpc.getNonceMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getNonceMethod = AuthGrpc.getNonceMethod) == null) {
          AuthGrpc.getNonceMethod = getNonceMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, io.bloombox.schema.services.auth.v1beta1.AuthNonce>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Nonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.AuthNonce.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Nonce"))
                  .build();
          }
        }
     }
     return getNonceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
      io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> getAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Authenticate",
      requestType = io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
      io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> getAuthenticateMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request, io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> getAuthenticateMethod;
    if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAuthenticateMethod = AuthGrpc.getAuthenticateMethod) == null) {
          AuthGrpc.getAuthenticateMethod = getAuthenticateMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request, io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Authenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Authenticate"))
                  .build();
          }
        }
     }
     return getAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
      io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> getConsentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Consent",
      requestType = io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
      io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> getConsentMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request, io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> getConsentMethod;
    if ((getConsentMethod = AuthGrpc.getConsentMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getConsentMethod = AuthGrpc.getConsentMethod) == null) {
          AuthGrpc.getConsentMethod = getConsentMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request, io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Consent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Consent"))
                  .build();
          }
        }
     }
     return getConsentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request,
      io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> getTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Token",
      requestType = io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request,
      io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> getTokenMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request, io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> getTokenMethod;
    if ((getTokenMethod = AuthGrpc.getTokenMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getTokenMethod = AuthGrpc.getTokenMethod) == null) {
          AuthGrpc.getTokenMethod = getTokenMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request, io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Token"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Token"))
                  .build();
          }
        }
     }
     return getTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept,
      com.google.protobuf.Empty> getAcceptMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Accept",
      requestType = io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept,
      com.google.protobuf.Empty> getAcceptMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept, com.google.protobuf.Empty> getAcceptMethod;
    if ((getAcceptMethod = AuthGrpc.getAcceptMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getAcceptMethod = AuthGrpc.getAcceptMethod) == null) {
          AuthGrpc.getAcceptMethod = getAcceptMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Accept"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Accept"))
                  .build();
          }
        }
     }
     return getAcceptMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject,
      com.google.protobuf.Empty> getRejectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Reject",
      requestType = io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject,
      com.google.protobuf.Empty> getRejectMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject, com.google.protobuf.Empty> getRejectMethod;
    if ((getRejectMethod = AuthGrpc.getRejectMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getRejectMethod = AuthGrpc.getRejectMethod) == null) {
          AuthGrpc.getRejectMethod = getRejectMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Reject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Reject"))
                  .build();
          }
        }
     }
     return getRejectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request,
      io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> getConnectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Connect",
      requestType = io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request,
      io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> getConnectMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request, io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> getConnectMethod;
    if ((getConnectMethod = AuthGrpc.getConnectMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getConnectMethod = AuthGrpc.getConnectMethod) == null) {
          AuthGrpc.getConnectMethod = getConnectMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request, io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Connect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Connect"))
                  .build();
          }
        }
     }
     return getConnectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.UserContext.Request,
      io.bloombox.schema.services.auth.v1beta1.UserContext.Response> getContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Context",
      requestType = io.bloombox.schema.services.auth.v1beta1.UserContext.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.UserContext.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.UserContext.Request,
      io.bloombox.schema.services.auth.v1beta1.UserContext.Response> getContextMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.UserContext.Request, io.bloombox.schema.services.auth.v1beta1.UserContext.Response> getContextMethod;
    if ((getContextMethod = AuthGrpc.getContextMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getContextMethod = AuthGrpc.getContextMethod) == null) {
          AuthGrpc.getContextMethod = getContextMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.UserContext.Request, io.bloombox.schema.services.auth.v1beta1.UserContext.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Context"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.UserContext.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.UserContext.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Context"))
                  .build();
          }
        }
     }
     return getContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
      io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> getProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Profile",
      requestType = io.bloombox.schema.services.auth.v1beta1.GetProfile.Request.class,
      responseType = io.bloombox.schema.services.auth.v1beta1.GetProfile.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
      io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> getProfileMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request, io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> getProfileMethod;
    if ((getProfileMethod = AuthGrpc.getProfileMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getProfileMethod = AuthGrpc.getProfileMethod) == null) {
          AuthGrpc.getProfileMethod = getProfileMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.GetProfile.Request, io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "Profile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.GetProfile.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.GetProfile.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("Profile"))
                  .build();
          }
        }
     }
     return getProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request,
      com.google.protobuf.Empty> getUpdateProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateProfile",
      requestType = io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request,
      com.google.protobuf.Empty> getUpdateProfileMethod() {
    io.grpc.MethodDescriptor<io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request, com.google.protobuf.Empty> getUpdateProfileMethod;
    if ((getUpdateProfileMethod = AuthGrpc.getUpdateProfileMethod) == null) {
      synchronized (AuthGrpc.class) {
        if ((getUpdateProfileMethod = AuthGrpc.getUpdateProfileMethod) == null) {
          AuthGrpc.getUpdateProfileMethod = getUpdateProfileMethod = 
              io.grpc.MethodDescriptor.<io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "bloombox.services.auth.v1beta1.Auth", "UpdateProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new AuthMethodDescriptorSupplier("UpdateProfile"))
                  .build();
          }
        }
     }
     return getUpdateProfileMethod;
  }

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
      asyncUnimplementedUnaryCall(getNonceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public void authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAuthenticateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getConsentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public void token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public void accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getAcceptMethod(), responseObserver);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public void reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRejectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public void connect(io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getConnectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public void context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public void profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getProfileMethod(), responseObserver);
    }

    /**
     */
    public void updateProfile(io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNonceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                io.bloombox.schema.services.auth.v1beta1.AuthNonce>(
                  this, METHODID_NONCE)))
          .addMethod(
            getAuthenticateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request,
                io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response>(
                  this, METHODID_AUTHENTICATE)))
          .addMethod(
            getConsentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request,
                io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response>(
                  this, METHODID_CONSENT)))
          .addMethod(
            getTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request,
                io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response>(
                  this, METHODID_TOKEN)))
          .addMethod(
            getAcceptMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept,
                com.google.protobuf.Empty>(
                  this, METHODID_ACCEPT)))
          .addMethod(
            getRejectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject,
                com.google.protobuf.Empty>(
                  this, METHODID_REJECT)))
          .addMethod(
            getConnectMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request,
                io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response>(
                  this, METHODID_CONNECT)))
          .addMethod(
            getContextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.UserContext.Request,
                io.bloombox.schema.services.auth.v1beta1.UserContext.Response>(
                  this, METHODID_CONTEXT)))
          .addMethod(
            getProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Request,
                io.bloombox.schema.services.auth.v1beta1.GetProfile.Response>(
                  this, METHODID_PROFILE)))
          .addMethod(
            getUpdateProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_PROFILE)))
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
          getChannel().newCall(getNonceMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public void consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConsentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public void token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public void accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAcceptMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public void reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRejectMethod(), getCallOptions()), request, responseObserver);
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
          getChannel().newCall(getConnectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public void context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public void profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProfile(io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request, responseObserver);
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
          getChannel(), getNonceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Authenticate an identity assertion of some kind from a user. Decide whether to grant them access to the subject
     * account.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Response authenticate(io.bloombox.schema.services.auth.v1beta1.AuthenticateUser.Request request) {
      return blockingUnaryCall(
          getChannel(), getAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response consent(io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return blockingUnaryCall(
          getChannel(), getConsentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response token(io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request) {
      return blockingUnaryCall(
          getChannel(), getTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public com.google.protobuf.Empty accept(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request) {
      return blockingUnaryCall(
          getChannel(), getAcceptMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public com.google.protobuf.Empty reject(io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request) {
      return blockingUnaryCall(
          getChannel(), getRejectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Connect a signed and validated user identity to a user account. If the user account in question doesn't exist yet,
     * create it, initializing with any user details passed in along with the provided identity.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Response connect(io.bloombox.schema.services.auth.v1beta1.IdentityConnect.Request request) {
      return blockingUnaryCall(
          getChannel(), getConnectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.UserContext.Response context(io.bloombox.schema.services.auth.v1beta1.UserContext.Request request) {
      return blockingUnaryCall(
          getChannel(), getContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public io.bloombox.schema.services.auth.v1beta1.GetProfile.Response profile(io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request) {
      return blockingUnaryCall(
          getChannel(), getProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateProfile(io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProfileMethod(), getCallOptions(), request);
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
          getChannel().newCall(getNonceMethod(), getCallOptions()), request);
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
          getChannel().newCall(getAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve consent flow information by ID.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Response> consent(
        io.bloombox.schema.services.auth.v1beta1.ConsentFlow.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getConsentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an access token, given a completed ID and authorization ticket.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.ResolveToken.Response> token(
        io.bloombox.schema.services.auth.v1beta1.ResolveToken.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Indicates an affirmative consent decision from a user, during a consent flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> accept(
        io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Accept request) {
      return futureUnaryCall(
          getChannel().newCall(getAcceptMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Indicates declined consent from a user, during a consent flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reject(
        io.bloombox.schema.services.auth.v1beta1.ConsentDecision.Reject request) {
      return futureUnaryCall(
          getChannel().newCall(getRejectMethod(), getCallOptions()), request);
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
          getChannel().newCall(getConnectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generate a full user context after a successful ID and authorization flow.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.UserContext.Response> context(
        io.bloombox.schema.services.auth.v1beta1.UserContext.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a user's profile by key.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.auth.v1beta1.GetProfile.Response> profile(
        io.bloombox.schema.services.auth.v1beta1.GetProfile.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateProfile(
        io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProfileMethod(), getCallOptions()), request);
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
  private static final int METHODID_UPDATE_PROFILE = 9;

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
        case METHODID_UPDATE_PROFILE:
          serviceImpl.updateProfile((io.bloombox.schema.services.auth.v1beta1.ProfileUpdate.Request) request,
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

  private static abstract class AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.auth.v1beta1.AuthServiceBeta1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Auth");
    }
  }

  private static final class AuthFileDescriptorSupplier
      extends AuthBaseDescriptorSupplier {
    AuthFileDescriptorSupplier() {}
  }

  private static final class AuthMethodDescriptorSupplier
      extends AuthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuthMethodDescriptorSupplier(String methodName) {
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
      synchronized (AuthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthFileDescriptorSupplier())
              .addMethod(getNonceMethod())
              .addMethod(getAuthenticateMethod())
              .addMethod(getConsentMethod())
              .addMethod(getTokenMethod())
              .addMethod(getAcceptMethod())
              .addMethod(getRejectMethod())
              .addMethod(getConnectMethod())
              .addMethod(getContextMethod())
              .addMethod(getProfileMethod())
              .addMethod(getUpdateProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
