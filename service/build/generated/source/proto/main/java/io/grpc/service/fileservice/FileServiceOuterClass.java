// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileService.proto

package io.grpc.service.fileservice;

public final class FileServiceOuterClass {
  private FileServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fileservice_DataChunk_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fileservice_DataChunk_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_fileservice_DownloadFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_fileservice_DownloadFileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FileService.proto\022\013fileservice\"\'\n\tData" +
      "Chunk\022\014\n\004data\030\001 \001(\014\022\014\n\004size\030\002 \001(\005\"\'\n\023Dow" +
      "nloadFileRequest\022\020\n\010fileName\030\001 \001(\t2Y\n\013Fi" +
      "leService\022J\n\014downloadFile\022 .fileservice." +
      "DownloadFileRequest\032\026.fileservice.DataCh" +
      "unk0\001B\037\n\033io.grpc.service.fileserviceP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_fileservice_DataChunk_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_fileservice_DataChunk_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fileservice_DataChunk_descriptor,
        new java.lang.String[] { "Data", "Size", });
    internal_static_fileservice_DownloadFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_fileservice_DownloadFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_fileservice_DownloadFileRequest_descriptor,
        new java.lang.String[] { "FileName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
