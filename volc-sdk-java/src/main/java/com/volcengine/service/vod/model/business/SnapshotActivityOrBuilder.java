// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface SnapshotActivityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.SnapshotActivity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 任务模板Id
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * 任务模板Id
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <code>string FileName = 2;</code>
   * @return The fileName.
   */
  java.lang.String getFileName();
  /**
   * <code>string FileName = 2;</code>
   * @return The bytes for fileName.
   */
  com.google.protobuf.ByteString
      getFileNameBytes();

  /**
   * <pre>
   * 条件转码配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.Condition Condition = 3;</code>
   * @return Whether the condition field is set.
   */
  boolean hasCondition();
  /**
   * <pre>
   * 条件转码配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.Condition Condition = 3;</code>
   * @return The condition.
   */
  com.volcengine.service.vod.model.business.Condition getCondition();
  /**
   * <pre>
   * 条件转码配置
   * </pre>
   *
   * <code>.Volcengine.Vod.Models.Business.Condition Condition = 3;</code>
   */
  com.volcengine.service.vod.model.business.ConditionOrBuilder getConditionOrBuilder();
}
