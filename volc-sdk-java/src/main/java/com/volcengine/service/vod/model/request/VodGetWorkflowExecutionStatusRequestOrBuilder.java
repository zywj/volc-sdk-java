// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

public interface VodGetWorkflowExecutionStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Request.VodGetWorkflowExecutionStatusRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 工作流执行Id
   * </pre>
   *
   * <code>string RunId = 1;</code>
   * @return The runId.
   */
  java.lang.String getRunId();
  /**
   * <pre>
   * 工作流执行Id
   * </pre>
   *
   * <code>string RunId = 1;</code>
   * @return The bytes for runId.
   */
  com.google.protobuf.ByteString
      getRunIdBytes();

  /**
   * <pre>
   * 是否需要子任务详情: true/false
   * </pre>
   *
   * <code>string NeedTasksDetail = 2;</code>
   * @return The needTasksDetail.
   */
  java.lang.String getNeedTasksDetail();
  /**
   * <pre>
   * 是否需要子任务详情: true/false
   * </pre>
   *
   * <code>string NeedTasksDetail = 2;</code>
   * @return The bytes for needTasksDetail.
   */
  com.google.protobuf.ByteString
      getNeedTasksDetailBytes();
}
