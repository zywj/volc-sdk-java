// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodCommitUploadInfoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodCommitUploadInfoRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 上传的空间名 
   * </pre>
   *
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 上传 1005 阶段需要带上 1001 的 Session 
   * </pre>
   *
   * <code>string SessionKey = 2;</code>
   * @return The sessionKey.
   */
  java.lang.String getSessionKey();
  /**
   * <pre>
   * 上传 1005 阶段需要带上 1001 的 Session 
   * </pre>
   *
   * <code>string SessionKey = 2;</code>
   * @return The bytes for sessionKey.
   */
  com.google.protobuf.ByteString
      getSessionKeyBytes();

  /**
   * <pre>
   * 业务希望上传透传的信息，会在上传成功时返回给用户 
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 业务希望上传透传的信息，会在上传成功时返回给用户 
   * </pre>
   *
   * <code>string CallbackArgs = 3;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   * 上传的功能函数 
   * </pre>
   *
   * <code>string Functions = 4;</code>
   * @return The functions.
   */
  java.lang.String getFunctions();
  /**
   * <pre>
   * 上传的功能函数 
   * </pre>
   *
   * <code>string Functions = 4;</code>
   * @return The bytes for functions.
   */
  com.google.protobuf.ByteString
      getFunctionsBytes();

  /**
   * <pre>
   * 上传中文件的来源 
   * </pre>
   *
   * <code>string VodUploadSource = 5;</code>
   * @return The vodUploadSource.
   */
  java.lang.String getVodUploadSource();
  /**
   * <pre>
   * 上传中文件的来源 
   * </pre>
   *
   * <code>string VodUploadSource = 5;</code>
   * @return The bytes for vodUploadSource.
   */
  com.google.protobuf.ByteString
      getVodUploadSourceBytes();
}
