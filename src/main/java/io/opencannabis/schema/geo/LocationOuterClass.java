// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: geo/Location.proto

package io.opencannabis.schema.geo;

public final class LocationOuterClass {
  private LocationOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_DistanceValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_DistanceValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_LocationAccuracy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_LocationAccuracy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opencannabis_geo_Distance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opencannabis_geo_Distance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022geo/Location.proto\022\020opencannabis.geo\032\016" +
      "bq_field.proto\032\017geo/Point.proto\032\021geo/Add" +
      "ress.proto\032\022content/Name.proto\"\251\001\n\rDista" +
      "nceValue\022n\n\004unit\030\001 \001(\0162\036.opencannabis.ge" +
      "o.DistanceUnitB@\212@=Specifies the unit of" +
      " measurement employed for this distance." +
      "\022(\n\005value\030\003 \001(\001B\031\212@\026Actual distance valu" +
      "e.\"\276\001\n\020LocationAccuracy\022K\n\010estimate\030\001 \001(" +
      "\010B9\212@6Specifies whether this accuracy ra" +
      "ting is an estimate.\022]\n\005value\030\002 \001(\0132\037.op" +
      "encannabis.geo.DistanceValueB-\212@*Distanc" +
      "e value for the accuracy specified.\"\373\002\n\010" +
      "Location\022S\n\004name\030\001 \001(\0132\032.opencannabis.co" +
      "ntent.NameB)\212@&Name for this location, i" +
      "f applicable.\022X\n\007address\030\002 \001(\0132\031.opencan" +
      "nabis.geo.AddressB,\212@)Address for this l" +
      "ocation, if applicable.\022[\n\005point\030\003 \001(\0132\027" +
      ".opencannabis.geo.PointB3\212@0Geopoint (la" +
      "titude/longitude) for this location.\022c\n\010" +
      "accuracy\030\004 \001(\0132\".opencannabis.geo.Locati" +
      "onAccuracyB-\212@*Specifies the accuracy es" +
      "timate, if known.\"\370\003\n\010Distance\022D\n\010estima" +
      "te\030\001 \001(\010B2\212@/Specifies whether this dist" +
      "ance is an estimate.\022{\n\010accuracy\030\002 \001(\0132\"" +
      ".opencannabis.geo.LocationAccuracyBE\212@BS" +
      "pecifies the accuracy estimate for the d" +
      "istance values, if known.\022`\n\004unit\030\003 \001(\0162" +
      "\036.opencannabis.geo.DistanceUnitB2\212@/Spec" +
      "ifies whether this distance is an estima" +
      "te.\022b\n\005start\030\004 \001(\0132\032.opencannabis.geo.Lo" +
      "cationB7\212@4Specifies the starting locati" +
      "on for a distance span.\022c\n\003end\030\005 \001(\0132\032.o" +
      "pencannabis.geo.LocationB:\212@7Specifies t" +
      "he terminating location for a distance s" +
      "pan.*m\n\014DistanceUnit\022\n\n\006METERS\020\000\022\n\n\006INCH" +
      "ES\020\001\022\010\n\004FEET\020\002\022\017\n\013MILLIMETERS\020\003\022\017\n\013CENTI" +
      "METERS\020\004\022\016\n\nKILOMETERS\020\005\022\t\n\005MILES\020\006B&\n\032i" +
      "o.opencannabis.schema.geoH\001P\001\242\002\003OCSb\006pro" +
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
          gen_bq_schema.BqField.getDescriptor(),
          io.opencannabis.schema.geo.PointOuterClass.getDescriptor(),
          io.opencannabis.schema.geo.AddressOuterClass.getDescriptor(),
          io.opencannabis.schema.content.NameContent.getDescriptor(),
        }, assigner);
    internal_static_opencannabis_geo_DistanceValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opencannabis_geo_DistanceValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_DistanceValue_descriptor,
        new java.lang.String[] { "Unit", "Value", });
    internal_static_opencannabis_geo_LocationAccuracy_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opencannabis_geo_LocationAccuracy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_LocationAccuracy_descriptor,
        new java.lang.String[] { "Estimate", "Value", });
    internal_static_opencannabis_geo_Location_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opencannabis_geo_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_Location_descriptor,
        new java.lang.String[] { "Name", "Address", "Point", "Accuracy", });
    internal_static_opencannabis_geo_Distance_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opencannabis_geo_Distance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opencannabis_geo_Distance_descriptor,
        new java.lang.String[] { "Estimate", "Accuracy", "Unit", "Start", "End", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(gen_bq_schema.BqField.description);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    gen_bq_schema.BqField.getDescriptor();
    io.opencannabis.schema.geo.PointOuterClass.getDescriptor();
    io.opencannabis.schema.geo.AddressOuterClass.getDescriptor();
    io.opencannabis.schema.content.NameContent.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
