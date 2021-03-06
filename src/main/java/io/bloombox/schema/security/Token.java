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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: security/Token.proto

package io.bloombox.schema.security;

public final class Token {
  private Token() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_security_IDTokenPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_security_IDTokenPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_security_IDToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_security_IDToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_security_TokenPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_security_TokenPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_security_AuthToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_security_AuthToken_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bloombox_security_AuthPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bloombox_security_AuthPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024security/Token.proto\022\021bloombox.securit" +
      "y\032\036oauth/AuthorizationScope.proto\"h\n\016IDT" +
      "okenPayload\022\r\n\005token\030\001 \001(\t\022\022\n\nexpiration" +
      "\030\002 \001(\004\022\020\n\010issuance\030\003 \001(\004\022\017\n\007subject\030\004 \001(" +
      "\t\022\020\n\010audience\030\005 \001(\t\"Z\n\007IDToken\022\021\n\007encode" +
      "d\030\001 \001(\tH\000\0221\n\004data\030\002 \001(\0132!.bloombox.secur" +
      "ity.IDTokenPayloadH\000B\t\n\007payload\"z\n\014Token" +
      "Payload\022\r\n\005token\030\001 \001(\t\022\022\n\nexpiration\030\002 \001" +
      "(\004\022\020\n\010issuance\030\003 \001(\004\0225\n\005scope\030\004 \003(\0132&.op" +
      "encannabis.oauth.AuthorizationScope\"\\\n\tA" +
      "uthToken\022\021\n\007encoded\030\001 \001(\tH\000\0221\n\006ticket\030\002 " +
      "\001(\0132\037.bloombox.security.TokenPayloadH\000B\t" +
      "\n\007payload\"a\n\013AuthPayload\022&\n\002id\030\001 \001(\0132\032.b" +
      "loombox.security.IDToken\022*\n\004auth\030\002 \001(\0132\034" +
      ".bloombox.security.AuthTokenB\'\n\033io.bloom" +
      "box.schema.securityH\001P\001\242\002\003BBSb\006proto3"
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
          io.opencannabis.schema.oauth.AuthorizationScopeOuterClass.getDescriptor(),
        }, assigner);
    internal_static_bloombox_security_IDTokenPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bloombox_security_IDTokenPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_security_IDTokenPayload_descriptor,
        new java.lang.String[] { "Token", "Expiration", "Issuance", "Subject", "Audience", });
    internal_static_bloombox_security_IDToken_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bloombox_security_IDToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_security_IDToken_descriptor,
        new java.lang.String[] { "Encoded", "Data", "Payload", });
    internal_static_bloombox_security_TokenPayload_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_bloombox_security_TokenPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_security_TokenPayload_descriptor,
        new java.lang.String[] { "Token", "Expiration", "Issuance", "Scope", });
    internal_static_bloombox_security_AuthToken_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_bloombox_security_AuthToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_security_AuthToken_descriptor,
        new java.lang.String[] { "Encoded", "Ticket", "Payload", });
    internal_static_bloombox_security_AuthPayload_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_bloombox_security_AuthPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bloombox_security_AuthPayload_descriptor,
        new java.lang.String[] { "Id", "Auth", });
    io.opencannabis.schema.oauth.AuthorizationScopeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
