// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commandAndControl.proto

package io.grpc.service.commandandcontrol;

public final class CommandAndControlProto {
  private CommandAndControlProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_commandandcontrol_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_commandandcontrol_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_commandandcontrol_NumberResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_commandandcontrol_NumberResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027commandAndControl.proto\022\021commandandcon" +
      "trol\"\034\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\" \n\016Nu" +
      "mberResponse\022\016\n\006number\030\001 \001(\0052f\n\021CommandA" +
      "ndControl\022Q\n\tGetNumber\022\037.commandandcontr" +
      "ol.HelloRequest\032!.commandandcontrol.Numb" +
      "erResponse\"\000B=\n!io.grpc.service.commanda" +
      "ndcontrolB\026CommandAndControlProtoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_commandandcontrol_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_commandandcontrol_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_commandandcontrol_HelloRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_commandandcontrol_NumberResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_commandandcontrol_NumberResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_commandandcontrol_NumberResponse_descriptor,
        new java.lang.String[] { "Number", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}