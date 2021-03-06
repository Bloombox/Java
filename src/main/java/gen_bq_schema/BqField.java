// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bq_field.proto

package gen_bq_schema;

public final class BqField {
  private BqField() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(gen_bq_schema.BqField.require);
    registry.add(gen_bq_schema.BqField.typeOverride);
    registry.add(gen_bq_schema.BqField.ignore);
    registry.add(gen_bq_schema.BqField.description);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int REQUIRE_FIELD_NUMBER = 1022;
  /**
   * <pre>
   * Flag to specify that a field should be marked as 'REQUIRED' when
   * used to generate schema for BigQuery.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> require = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int TYPE_OVERRIDE_FIELD_NUMBER = 1023;
  /**
   * <pre>
   * Optionally override whatever type is resolved by the schema
   * generator. This is useful, for example, to store epoch timestamps
   * with the underlying 'TIMESTAMP' type, when normally, they would
   * be structured as 'INTEGER' fields.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> typeOverride = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int IGNORE_FIELD_NUMBER = 1024;
  /**
   * <pre>
   * Optionally omit a field from BigQuery schema.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.Boolean> ignore = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.Boolean.class,
        null);
  public static final int DESCRIPTION_FIELD_NUMBER = 1025;
  /**
   * <pre>
   * Set the description for a field in BigQuery schema.
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> description = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016bq_field.proto\022\rgen_bq_schema\032 google/" +
      "protobuf/descriptor.proto:/\n\007require\022\035.g" +
      "oogle.protobuf.FieldOptions\030\376\007 \001(\010:5\n\rty" +
      "pe_override\022\035.google.protobuf.FieldOptio" +
      "ns\030\377\007 \001(\t:.\n\006ignore\022\035.google.protobuf.Fi" +
      "eldOptions\030\200\010 \001(\010:3\n\013description\022\035.googl" +
      "e.protobuf.FieldOptions\030\201\010 \001(\tB\010Z\006protos" +
      "b\006proto3"
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
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    require.internalInit(descriptor.getExtensions().get(0));
    typeOverride.internalInit(descriptor.getExtensions().get(1));
    ignore.internalInit(descriptor.getExtensions().get(2));
    description.internalInit(descriptor.getExtensions().get(3));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
