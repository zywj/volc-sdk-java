// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_play.proto

package com.volcengine.service.vod.model.business;

public final class VodPlay {
  private VodPlay() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodGetHlsDecryptionKeyResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Volcengine_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Volcengine_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&volcengine/vod/business/vod_play.proto" +
      "\022\036Volcengine.Vod.Models.Business\"\330\001\n\034Vod" +
      "GetOriginalPlayInfoResult\022\020\n\010FileType\030\001 " +
      "\001(\t\022\020\n\010Duration\030\002 \001(\002\022\014\n\004Size\030\003 \001(\001\022\016\n\006H" +
      "eight\030\004 \001(\005\022\r\n\005Width\030\005 \001(\005\022\016\n\006Format\030\006 \001" +
      "(\t\022\r\n\005Codec\030\007 \001(\t\022\017\n\007Bitrate\030\010 \001(\005\022\013\n\003Md" +
      "5\030\t \001(\t\022\023\n\013MainPlayUrl\030\n \001(\t\022\025\n\rBackupPl" +
      "ayUrl\030\013 \001(\t\"H\n\031VodPrivateDrmPlayAuthInfo" +
      "\022\022\n\nPlayAuthId\030\001 \001(\t\022\027\n\017PlayAuthContent\030" +
      "\002 \001(\t\"u\n\036VodGetPrivateDrmPlayAuthResult\022" +
      "S\n\020PlayAuthInfoList\030\001 \003(\01329.Volcengine.V" +
      "od.Models.Business.VodPrivateDrmPlayAuth" +
      "Info\"1\n\034VodGetHlsDecryptionKeyResult\022\021\n\t" +
      "SecretKey\030\001 \001(\t\"t\n!VodPlayInfoWithLiveTi" +
      "meShiftScene\022\020\n\010StoreUri\030\001 \001(\t\022\023\n\013MainPl" +
      "ayUrl\030\002 \001(\t\022\025\n\rBackupPlayUrl\030\003 \001(\t\022\021\n\tUr" +
      "lExpire\030\004 \001(\001\"\205\001\n*VodGetPlayInfoWithLive" +
      "TimeShiftSceneResult\022W\n\014PlayInfoList\030\001 \003" +
      "(\0132A.Volcengine.Vod.Models.Business.VodP" +
      "layInfoWithLiveTimeShiftSceneB\313\001\n)com.vo" +
      "lcengine.service.vod.model.businessB\007Vod" +
      "PlayP\001ZAgithub.com/volcengine/volc-sdk-g" +
      "olang/service/vod/models/business\240\001\001\330\001\001\302" +
      "\002\000\312\002 Volc\\Service\\Vod\\Models\\Business\342\002#" +
      "Volc\\Service\\Vod\\Models\\GPBMetadatab\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Volcengine_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Volcengine_Vod_Models_Business_VodGetOriginalPlayInfoResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodGetOriginalPlayInfoResult_descriptor,
        new java.lang.String[] { "FileType", "Duration", "Size", "Height", "Width", "Format", "Codec", "Bitrate", "Md5", "MainPlayUrl", "BackupPlayUrl", });
    internal_static_Volcengine_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Volcengine_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPrivateDrmPlayAuthInfo_descriptor,
        new java.lang.String[] { "PlayAuthId", "PlayAuthContent", });
    internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodGetPrivateDrmPlayAuthResult_descriptor,
        new java.lang.String[] { "PlayAuthInfoList", });
    internal_static_Volcengine_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_Volcengine_Vod_Models_Business_VodGetHlsDecryptionKeyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodGetHlsDecryptionKeyResult_descriptor,
        new java.lang.String[] { "SecretKey", });
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Volcengine_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodPlayInfoWithLiveTimeShiftScene_descriptor,
        new java.lang.String[] { "StoreUri", "MainPlayUrl", "BackupPlayUrl", "UrlExpire", });
    internal_static_Volcengine_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Volcengine_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Volcengine_Vod_Models_Business_VodGetPlayInfoWithLiveTimeShiftSceneResult_descriptor,
        new java.lang.String[] { "PlayInfoList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
