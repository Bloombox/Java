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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth/v1beta1/AuthService_Beta1.proto

package io.bloombox.schema.services.auth.v1beta1;

public final class AuthServiceBeta1 {
  private AuthServiceBeta1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_EmailPasswordAssertion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_EmailPasswordAssertion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_FirebaseTokenAssertion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_FirebaseTokenAssertion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_AccountAssertion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_AccountAssertion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Request_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Response_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Response_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Operation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Operation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$auth/v1beta1/AuthService_Beta1.proto\022%" +
      "bloombox.schema.services.auth.v1beta1\032\023i" +
      "dentity/User.proto\032\034services/ServiceStat" +
      "us.proto\032\034google/api/annotations.proto\"\362" +
      "\001\n\004Ping\032\t\n\007Request\032C\n\010Response\0227\n\006status" +
      "\030\001 \001(\0162\'.bloombox.schema.services.Servic" +
      "eStatus\032\231\001\n\tOperation\022D\n\007request\030\001 \001(\01323" +
      ".bloombox.schema.services.auth.v1beta1.P" +
      "ing.Request\022F\n\010response\030\002 \001(\01324.bloombox" +
      ".schema.services.auth.v1beta1.Ping.Respo" +
      "nse\"9\n\026EmailPasswordAssertion\022\r\n\005email\030\001" +
      " \001(\t\022\020\n\010password\030\002 \001(\t\"4\n\026FirebaseTokenA" +
      "ssertion\022\r\n\005token\030\001 \001(\t\022\013\n\003uid\030\002 \001(\t\"\313\001\n" +
      "\020AccountAssertion\022W\n\016email_password\030\001 \001(" +
      "\0132=.bloombox.schema.services.auth.v1beta" +
      "1.EmailPasswordAssertionH\000\022Q\n\010firebase\030\002" +
      " \001(\0132=.bloombox.schema.services.auth.v1b" +
      "eta1.FirebaseTokenAssertionH\000B\013\n\tasserti" +
      "on\"\324\003\n\020AuthenticateUser\032\223\001\n\007Request\022<\n\010p" +
      "rovider\030\001 \001(\0162*.bloombox.schema.identity" +
      ".IdentityProvider\022J\n\tassertion\030\002 \001(\01327.b" +
      "loombox.schema.services.auth.v1beta1.Acc" +
      "ountAssertion\032v\n\010Response\022A\n\006status\030\001 \001(" +
      "\01621.bloombox.schema.services.auth.v1beta" +
      "1.AuthStatus\022\013\n\003uid\030\002 \001(\t\022\013\n\003key\030\003 \001(\t\022\r" +
      "\n\005token\030\004 \001(\t\032\261\001\n\tOperation\022P\n\007request\030\001" +
      " \001(\0132?.bloombox.schema.services.auth.v1b" +
      "eta1.AuthenticateUser.Request\022R\n\010respons" +
      "e\030\002 \001(\0132@.bloombox.schema.services.auth." +
      "v1beta1.AuthenticateUser.Response*\031\n\tAut" +
      "hError\022\014\n\010NO_ERROR\020\000*W\n\nAuthStatus\022\013\n\007UN" +
      "KNOWN\020\000\022\022\n\016ACCESS_GRANTED\020\001\022\021\n\rACCESS_DE" +
      "NIED\020\002\022\025\n\021ACCOUNT_SUSPENDED\020\0032\335\002\n\004Auth\022\215" +
      "\001\n\004Ping\0223.bloombox.schema.services.auth." +
      "v1beta1.Ping.Request\0324.bloombox.schema.s" +
      "ervices.auth.v1beta1.Ping.Response\"\032\202\323\344\223" +
      "\002\024\022\022/auth/v1beta1/ping\022\304\001\n\014Authenticate\022" +
      "?.bloombox.schema.services.auth.v1beta1." +
      "AuthenticateUser.Request\032@.bloombox.sche" +
      "ma.services.auth.v1beta1.AuthenticateUse" +
      "r.Response\"1\202\323\344\223\002+\"\036/auth/v1beta1/login/" +
      "{provider}:\tassertionB4\n(io.bloombox.sch" +
      "ema.services.auth.v1beta1H\001P\001\242\002\003BBSb\006pro" +
      "to3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.bloombox.schema.identity.UserOuterClass.getDescriptor(),
          io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Request_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_Ping_Request_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Response_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_Ping_Response_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Operation_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_Ping_descriptor.getNestedTypes().get(2);
    internal_static_bloombox_schema_services_auth_v1beta1_Ping_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_Ping_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    internal_static_bloombox_schema_services_auth_v1beta1_EmailPasswordAssertion_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_schema_services_auth_v1beta1_EmailPasswordAssertion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_EmailPasswordAssertion_descriptor,
        new java.lang.String[] { "Email", "Password", });
    internal_static_bloombox_schema_services_auth_v1beta1_FirebaseTokenAssertion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_schema_services_auth_v1beta1_FirebaseTokenAssertion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_FirebaseTokenAssertion_descriptor,
        new java.lang.String[] { "Token", "Uid", });
    internal_static_bloombox_schema_services_auth_v1beta1_AccountAssertion_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_schema_services_auth_v1beta1_AccountAssertion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_AccountAssertion_descriptor,
        new java.lang.String[] { "EmailPassword", "Firebase", "Assertion", });
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor,
        new java.lang.String[] { });
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Request_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor.getNestedTypes().get(0);
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Request_descriptor,
        new java.lang.String[] { "Provider", "Assertion", });
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Response_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor.getNestedTypes().get(1);
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Response_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Response_descriptor,
        new java.lang.String[] { "Status", "Uid", "Key", "Token", });
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Operation_descriptor =
      internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_descriptor.getNestedTypes().get(2);
    internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Operation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_schema_services_auth_v1beta1_AuthenticateUser_Operation_descriptor,
        new java.lang.String[] { "Request", "Response", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.bloombox.schema.identity.UserOuterClass.getDescriptor();
    io.bloombox.schema.services.ServiceStatusOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
