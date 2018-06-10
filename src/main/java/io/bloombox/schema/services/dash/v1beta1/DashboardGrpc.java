package io.bloombox.schema.services.dash.v1beta1;

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
 * Provides methods related to dashboard support operations. This includes management of partner details and settings,
 * account allocation, and more.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.0-SNAPSHOT)",
    comments = "Source: dash/v1beta1/DashService_Beta1.proto")
public final class DashboardGrpc {

  private DashboardGrpc() {}

  public static final String SERVICE_NAME = "bloombox.schema.services.dash.v1beta1.Dashboard";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> METHOD_PARTNER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetPartner.Request, io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "Partner"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetPartner.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetPartner.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request,
      io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> METHOD_LOCATIONS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.ListLocations.Request, io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "Locations"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.ListLocations.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.ListLocations.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> METHOD_LOCATION =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetLocation.Request, io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "Location"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetLocation.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetLocation.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> METHOD_PARTNER_SETTINGS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "PartnerSettings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request,
      com.google.protobuf.Empty> METHOD_PARTNER_SETTINGS_UPDATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "PartnerSettingsUpdate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request,
      io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> METHOD_LOCATION_SETTINGS =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request, io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "LocationSettings"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request,
      com.google.protobuf.Empty> METHOD_LOCATION_SETTINGS_UPDATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request, com.google.protobuf.Empty>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "LocationSettingsUpdate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> METHOD_INTEGRATION_VALIDATE =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request, io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "IntegrationValidate"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> METHOD_INTEGRATION_TEST =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "IntegrationTest"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request,
      io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> METHOD_INTEGRATION_TRIGGER =
      io.grpc.MethodDescriptor.<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request, io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "bloombox.schema.services.dash.v1beta1.Dashboard", "IntegrationTrigger"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DashboardStub newStub(io.grpc.Channel channel) {
    return new DashboardStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DashboardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DashboardBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DashboardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DashboardFutureStub(channel);
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static abstract class DashboardImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PARTNER, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATIONS, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATION, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PARTNER_SETTINGS, responseObserver);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_PARTNER_SETTINGS_UPDATE, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATION_SETTINGS, responseObserver);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOCATION_SETTINGS_UPDATE, responseObserver);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INTEGRATION_VALIDATE, responseObserver);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INTEGRATION_TEST, responseObserver);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_INTEGRATION_TRIGGER, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_PARTNER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetPartner.Request,
                io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>(
                  this, METHODID_PARTNER)))
          .addMethod(
            METHOD_LOCATIONS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.ListLocations.Request,
                io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>(
                  this, METHODID_LOCATIONS)))
          .addMethod(
            METHOD_LOCATION,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetLocation.Request,
                io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>(
                  this, METHODID_LOCATION)))
          .addMethod(
            METHOD_PARTNER_SETTINGS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request,
                io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>(
                  this, METHODID_PARTNER_SETTINGS)))
          .addMethod(
            METHOD_PARTNER_SETTINGS_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_PARTNER_SETTINGS_UPDATE)))
          .addMethod(
            METHOD_LOCATION_SETTINGS,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request,
                io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>(
                  this, METHODID_LOCATION_SETTINGS)))
          .addMethod(
            METHOD_LOCATION_SETTINGS_UPDATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request,
                com.google.protobuf.Empty>(
                  this, METHODID_LOCATION_SETTINGS_UPDATE)))
          .addMethod(
            METHOD_INTEGRATION_VALIDATE,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>(
                  this, METHODID_INTEGRATION_VALIDATE)))
          .addMethod(
            METHOD_INTEGRATION_TEST,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>(
                  this, METHODID_INTEGRATION_TEST)))
          .addMethod(
            METHOD_INTEGRATION_TRIGGER,
            asyncUnaryCall(
              new MethodHandlers<
                io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request,
                io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>(
                  this, METHODID_INTEGRATION_TRIGGER)))
          .build();
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardStub extends io.grpc.stub.AbstractStub<DashboardStub> {
    private DashboardStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public void partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PARTNER, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public void locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATIONS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public void location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATION, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PARTNER_SETTINGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public void partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_PARTNER_SETTINGS_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATION_SETTINGS, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public void locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOCATION_SETTINGS_UPDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_VALIDATE, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_TEST, getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public void integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request,
        io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_TRIGGER, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardBlockingStub extends io.grpc.stub.AbstractStub<DashboardBlockingStub> {
    private DashboardBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetPartner.Response partner(io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PARTNER, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.ListLocations.Response locations(io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATIONS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetLocation.Response location(io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATION, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response partnerSettings(io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PARTNER_SETTINGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.protobuf.Empty partnerSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_PARTNER_SETTINGS_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response locationSettings(io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATION_SETTINGS, getCallOptions(), request);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public com.google.protobuf.Empty locationSettingsUpdate(io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOCATION_SETTINGS_UPDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response integrationValidate(io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INTEGRATION_VALIDATE, getCallOptions(), request);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response integrationTest(io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INTEGRATION_TEST, getCallOptions(), request);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response integrationTrigger(io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request) {
      return blockingUnaryCall(
          getChannel(), METHOD_INTEGRATION_TRIGGER, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Provides methods related to dashboard support operations. This includes management of partner details and settings,
   * account allocation, and more.
   * </pre>
   */
  public static final class DashboardFutureStub extends io.grpc.stub.AbstractStub<DashboardFutureStub> {
    private DashboardFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DashboardFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DashboardFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DashboardFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Retrieve an individual partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response> partner(
        io.bloombox.schema.services.dash.v1beta1.GetPartner.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PARTNER, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a list of location records for a given partner record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response> locations(
        io.bloombox.schema.services.dash.v1beta1.ListLocations.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATIONS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an individual partner location record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response> location(
        io.bloombox.schema.services.dash.v1beta1.GetLocation.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATION, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response> partnerSettings(
        io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PARTNER_SETTINGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> partnerSettingsUpdate(
        io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_PARTNER_SETTINGS_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve partner-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response> locationSettings(
        io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATION_SETTINGS, getCallOptions()), request);
    }

    /**
     * <pre>
     * Update location-level settings from the Dashboard.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> locationSettingsUpdate(
        io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOCATION_SETTINGS_UPDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Validate configuration for an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response> integrationValidate(
        io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_VALIDATE, getCallOptions()), request);
    }

    /**
     * <pre>
     * Test an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response> integrationTest(
        io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_TEST, getCallOptions()), request);
    }

    /**
     * <pre>
     * Manually trigger an integrated piece of software against a Bloombox account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response> integrationTrigger(
        io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_INTEGRATION_TRIGGER, getCallOptions()), request);
    }
  }

  private static final int METHODID_PARTNER = 0;
  private static final int METHODID_LOCATIONS = 1;
  private static final int METHODID_LOCATION = 2;
  private static final int METHODID_PARTNER_SETTINGS = 3;
  private static final int METHODID_PARTNER_SETTINGS_UPDATE = 4;
  private static final int METHODID_LOCATION_SETTINGS = 5;
  private static final int METHODID_LOCATION_SETTINGS_UPDATE = 6;
  private static final int METHODID_INTEGRATION_VALIDATE = 7;
  private static final int METHODID_INTEGRATION_TEST = 8;
  private static final int METHODID_INTEGRATION_TRIGGER = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DashboardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DashboardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARTNER:
          serviceImpl.partner((io.bloombox.schema.services.dash.v1beta1.GetPartner.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartner.Response>) responseObserver);
          break;
        case METHODID_LOCATIONS:
          serviceImpl.locations((io.bloombox.schema.services.dash.v1beta1.ListLocations.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ListLocations.Response>) responseObserver);
          break;
        case METHODID_LOCATION:
          serviceImpl.location((io.bloombox.schema.services.dash.v1beta1.GetLocation.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocation.Response>) responseObserver);
          break;
        case METHODID_PARTNER_SETTINGS:
          serviceImpl.partnerSettings((io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetPartnerSettings.Response>) responseObserver);
          break;
        case METHODID_PARTNER_SETTINGS_UPDATE:
          serviceImpl.partnerSettingsUpdate((io.bloombox.schema.services.dash.v1beta1.UpdatePartnerSettings.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LOCATION_SETTINGS:
          serviceImpl.locationSettings((io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.GetLocationSettings.Response>) responseObserver);
          break;
        case METHODID_LOCATION_SETTINGS_UPDATE:
          serviceImpl.locationSettingsUpdate((io.bloombox.schema.services.dash.v1beta1.UpdateLocationSettings.Request) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_INTEGRATION_VALIDATE:
          serviceImpl.integrationValidate((io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.ValidateIntegration.Response>) responseObserver);
          break;
        case METHODID_INTEGRATION_TEST:
          serviceImpl.integrationTest((io.bloombox.schema.services.dash.v1beta1.TestIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TestIntegration.Response>) responseObserver);
          break;
        case METHODID_INTEGRATION_TRIGGER:
          serviceImpl.integrationTrigger((io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Request) request,
              (io.grpc.stub.StreamObserver<io.bloombox.schema.services.dash.v1beta1.TriggerIntegration.Response>) responseObserver);
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

  private static final class DashboardDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.bloombox.schema.services.dash.v1beta1.DashServiceBeta1.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DashboardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DashboardDescriptorSupplier())
              .addMethod(METHOD_PARTNER)
              .addMethod(METHOD_LOCATIONS)
              .addMethod(METHOD_LOCATION)
              .addMethod(METHOD_PARTNER_SETTINGS)
              .addMethod(METHOD_PARTNER_SETTINGS_UPDATE)
              .addMethod(METHOD_LOCATION_SETTINGS)
              .addMethod(METHOD_LOCATION_SETTINGS_UPDATE)
              .addMethod(METHOD_INTEGRATION_VALIDATE)
              .addMethod(METHOD_INTEGRATION_TEST)
              .addMethod(METHOD_INTEGRATION_TRIGGER)
              .build();
        }
      }
    }
    return result;
  }
}
