// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface TaskTemplateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.TaskTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 模板Id
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The templateId.
   */
  java.lang.String getTemplateId();
  /**
   * <pre>
   * 模板Id
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The bytes for templateId.
   */
  com.google.protobuf.ByteString
      getTemplateIdBytes();

  /**
   * <pre>
   * 空间名
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
   * @return The spaceName.
   */
  java.lang.String getSpaceName();
  /**
   * <pre>
   * 空间名
   * </pre>
   *
   * <code>string SpaceName = 2;</code>
   * @return The bytes for spaceName.
   */
  com.google.protobuf.ByteString
      getSpaceNameBytes();

  /**
   * <pre>
   * 模板名称
   * </pre>
   *
   * <code>string Name = 3;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * 模板名称
   * </pre>
   *
   * <code>string Name = 3;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string Description = 4;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string Description = 4;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * 多个值通过 ',' 连接
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * 多个值通过 ',' 连接
   * </pre>
   *
   * <code>string Type = 6;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * 版本Id
   * </pre>
   *
   * <code>string CommitId = 9;</code>
   * @return The commitId.
   */
  java.lang.String getCommitId();
  /**
   * <pre>
   * 版本Id
   * </pre>
   *
   * <code>string CommitId = 9;</code>
   * @return The bytes for commitId.
   */
  com.google.protobuf.ByteString
      getCommitIdBytes();

  /**
   * <code>string Hash = 11;</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <code>string Hash = 11;</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  /**
   * <code>.google.protobuf.Timestamp CreatedAt = 12;</code>
   * @return Whether the createdAt field is set.
   */
  boolean hasCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp CreatedAt = 12;</code>
   * @return The createdAt.
   */
  com.google.protobuf.Timestamp getCreatedAt();
  /**
   * <code>.google.protobuf.Timestamp CreatedAt = 12;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedAtOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp UpdatedAt = 13;</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp UpdatedAt = 13;</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp UpdatedAt = 13;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();

  /**
   * <pre>
   * TranscodeVideo|ByteHD|TranscodeAudio|Snapshot
   * </pre>
   *
   * <code>string TaskType = 14;</code>
   * @return The taskType.
   */
  java.lang.String getTaskType();
  /**
   * <pre>
   * TranscodeVideo|ByteHD|TranscodeAudio|Snapshot
   * </pre>
   *
   * <code>string TaskType = 14;</code>
   * @return The bytes for taskType.
   */
  com.google.protobuf.ByteString
      getTaskTypeBytes();

  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeVideoTaskParams TranscodeVideoTaskParams = 15;</code>
   * @return Whether the transcodeVideoTaskParams field is set.
   */
  boolean hasTranscodeVideoTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeVideoTaskParams TranscodeVideoTaskParams = 15;</code>
   * @return The transcodeVideoTaskParams.
   */
  com.volcengine.service.vod.model.business.TranscodeVideoTaskParams getTranscodeVideoTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeVideoTaskParams TranscodeVideoTaskParams = 15;</code>
   */
  com.volcengine.service.vod.model.business.TranscodeVideoTaskParamsOrBuilder getTranscodeVideoTaskParamsOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.ByteHDTaskParams ByteHDTaskParams = 18;</code>
   * @return Whether the byteHDTaskParams field is set.
   */
  boolean hasByteHDTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.ByteHDTaskParams ByteHDTaskParams = 18;</code>
   * @return The byteHDTaskParams.
   */
  com.volcengine.service.vod.model.business.ByteHDTaskParams getByteHDTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.ByteHDTaskParams ByteHDTaskParams = 18;</code>
   */
  com.volcengine.service.vod.model.business.ByteHDTaskParamsOrBuilder getByteHDTaskParamsOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeAudioTaskParams TranscodeAudioTaskParams = 19;</code>
   * @return Whether the transcodeAudioTaskParams field is set.
   */
  boolean hasTranscodeAudioTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeAudioTaskParams TranscodeAudioTaskParams = 19;</code>
   * @return The transcodeAudioTaskParams.
   */
  com.volcengine.service.vod.model.business.TranscodeAudioTaskParams getTranscodeAudioTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.TranscodeAudioTaskParams TranscodeAudioTaskParams = 19;</code>
   */
  com.volcengine.service.vod.model.business.TranscodeAudioTaskParamsOrBuilder getTranscodeAudioTaskParamsOrBuilder();

  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotTaskParams SnapshotTaskParams = 20;</code>
   * @return Whether the snapshotTaskParams field is set.
   */
  boolean hasSnapshotTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotTaskParams SnapshotTaskParams = 20;</code>
   * @return The snapshotTaskParams.
   */
  com.volcengine.service.vod.model.business.SnapshotTaskParams getSnapshotTaskParams();
  /**
   * <code>.Volcengine.Vod.Models.Business.SnapshotTaskParams SnapshotTaskParams = 20;</code>
   */
  com.volcengine.service.vod.model.business.SnapshotTaskParamsOrBuilder getSnapshotTaskParamsOrBuilder();
}
