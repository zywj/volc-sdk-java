// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_upload.proto

package com.volcengine.service.vod.model.business;

public interface CommitUploadInfoParamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.CommitUploadInfoParam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <code>string CallbackArgs = 2;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <code>string CallbackArgs = 2;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <code>string SessionKey = 3;</code>
   * @return The sessionKey.
   */
  java.lang.String getSessionKey();
  /**
   * <code>string SessionKey = 3;</code>
   * @return The bytes for sessionKey.
   */
  com.google.protobuf.ByteString
      getSessionKeyBytes();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadFunction Functions = 4;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.VodUploadFunction> 
      getFunctionsList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadFunction Functions = 4;</code>
   */
  com.volcengine.service.vod.model.business.VodUploadFunction getFunctions(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadFunction Functions = 4;</code>
   */
  int getFunctionsCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadFunction Functions = 4;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.VodUploadFunctionOrBuilder> 
      getFunctionsOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.VodUploadFunction Functions = 4;</code>
   */
  com.volcengine.service.vod.model.business.VodUploadFunctionOrBuilder getFunctionsOrBuilder(
      int index);

  /**
   * <code>string GetMetaMode = 5;</code>
   * @return The getMetaMode.
   */
  java.lang.String getGetMetaMode();
  /**
   * <code>string GetMetaMode = 5;</code>
   * @return The bytes for getMetaMode.
   */
  com.google.protobuf.ByteString
      getGetMetaModeBytes();

  /**
   * <code>string VodUploadSource = 6;</code>
   * @return The vodUploadSource.
   */
  java.lang.String getVodUploadSource();
  /**
   * <code>string VodUploadSource = 6;</code>
   * @return The bytes for vodUploadSource.
   */
  com.google.protobuf.ByteString
      getVodUploadSourceBytes();
}
