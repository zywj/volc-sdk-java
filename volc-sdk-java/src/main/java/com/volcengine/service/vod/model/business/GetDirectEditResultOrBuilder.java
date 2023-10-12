// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

public interface GetDirectEditResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.GetDirectEditResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 视频编辑执行Id
   * </pre>
   *
   * <code>string ReqId = 1;</code>
   * @return The reqId.
   */
  java.lang.String getReqId();
  /**
   * <pre>
   * 视频编辑执行Id
   * </pre>
   *
   * <code>string ReqId = 1;</code>
   * @return The bytes for reqId.
   */
  com.google.protobuf.ByteString
      getReqIdBytes();

  /**
   * <pre>
   * 视频编辑参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.EditParam EditParam = 2;</code>
   * @return Whether the editParam field is set.
   */
  boolean hasEditParam();
  /**
   * <pre>
   * 视频编辑参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.EditParam EditParam = 2;</code>
   * @return The editParam.
   */
  com.volcengine.service.vod.model.business.EditParam getEditParam();
  /**
   * <pre>
   * 视频编辑参数
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.EditParam EditParam = 2;</code>
   */
  com.volcengine.service.vod.model.business.EditParamOrBuilder getEditParamOrBuilder();

  /**
   * <pre>
   * 优先级
   * </pre>
   *
   * <code>int32 Priority = 3;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * 回调地址
   * </pre>
   *
   * <code>string CallbackUri = 4;</code>
   * @return The callbackUri.
   */
  java.lang.String getCallbackUri();
  /**
   * <pre>
   * 回调地址
   * </pre>
   *
   * <code>string CallbackUri = 4;</code>
   * @return The bytes for callbackUri.
   */
  com.google.protobuf.ByteString
      getCallbackUriBytes();

  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The callbackArgs.
   */
  java.lang.String getCallbackArgs();
  /**
   * <pre>
   * 回调参数
   * </pre>
   *
   * <code>string CallbackArgs = 5;</code>
   * @return The bytes for callbackArgs.
   */
  com.google.protobuf.ByteString
      getCallbackArgsBytes();

  /**
   * <pre>
   * 编辑任务状态
   * </pre>
   *
   * <code>string Status = 6;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   * 编辑任务状态
   * </pre>
   *
   * <code>string Status = 6;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   * 产物vid
   * </pre>
   *
   * <code>string OutputVid = 7;</code>
   * @return The outputVid.
   */
  java.lang.String getOutputVid();
  /**
   * <pre>
   * 产物vid
   * </pre>
   *
   * <code>string OutputVid = 7;</code>
   * @return The bytes for outputVid.
   */
  com.google.protobuf.ByteString
      getOutputVidBytes();
}
