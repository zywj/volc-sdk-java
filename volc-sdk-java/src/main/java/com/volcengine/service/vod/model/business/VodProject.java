// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_project.proto

package com.volcengine.service.vod.model.business;

public final class VodProject {
  private VodProject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodListProjectsResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodListProjectsResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodProjectInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodProjectInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)volcengine/vod/business/vod_project.pr" +
      "oto\022\036Volcengine.Vod.Models.Business\"\\\n\025V" +
      "odListProjectsResult\022C\n\013ProjectList\030\001 \003(" +
      "\0132..Volcengine.Vod.Models.Business.VodPr" +
      "ojectInfo\":\n\016VodProjectInfo\022\023\n\013ProjectNa" +
      "me\030\001 \001(\t\022\023\n\013DisplayName\030\002 \001(\tB\316\001\n)com.vo" +
      "lcengine.service.vod.model.businessB\nVod" +
      "ProjectP\001ZAgithub.com/volcengine/volc-sd" +
      "k-golang/service/vod/models/business\240\001\001\330" +
      "\001\001\302\002\000\312\002 Volc\\Service\\Vod\\Models\\Business" +
      "\342\002#Volc\\Service\\Vod\\Models\\GPBMetadatab\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_VodListProjectsResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_VodListProjectsResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodListProjectsResult_descriptor,
        new java.lang.String[] { "ProjectList", });
    internal_static_Volcengine_Vod_Models_Business_VodProjectInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_VodProjectInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodProjectInfo_descriptor,
        new java.lang.String[] { "ProjectName", "DisplayName", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
