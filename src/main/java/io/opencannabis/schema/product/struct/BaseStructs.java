// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: structs/ProductFlags.proto

package io.opencannabis.schema.product.struct;

public final class BaseStructs {
  private BaseStructs() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032structs/ProductFlags.proto\022\024opencannab" +
      "is.structs*\231\001\n\013ProductFlag\022\013\n\007VISIBLE\020\000\022" +
      "\n\n\006HIDDEN\020\001\022\013\n\007PREMIUM\020\002\022\014\n\010FEATURED\020\003\022\r" +
      "\n\tEXCLUSIVE\020\004\022\014\n\010IN_HOUSE\020\005\022\017\n\013LAST_CHAN" +
      "CE\020\006\022\020\n\014LIMITED_TIME\020\007\022\t\n\005LOCAL\020\010\022\013\n\007ON_" +
      "SALE\020\024B>\n%io.opencannabis.schema.product" +
      ".structB\013BaseStructsH\001P\001\242\002\003OCSb\006proto3"
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
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
