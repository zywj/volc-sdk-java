// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: imp/response/response_imp.proto

package com.volcengine.service.imp.model.response;

public interface ImpSubmitJobResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Imp.Models.Response.ImpSubmitJobResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return Whether the responseMetadata field is set.
   */
  boolean hasResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   * @return The responseMetadata.
   */
  com.volcengine.service.base.model.base.ResponseMetadata getResponseMetadata();
  /**
   * <pre>
   * 响应通用信息
   * </pre>
   *
   * <code>.Volcengine.Base.Models.Base.ResponseMetadata ResponseMetadata = 1;</code>
   */
  com.volcengine.service.base.model.base.ResponseMetadataOrBuilder getResponseMetadataOrBuilder();

  /**
   * <code>string Result = 2;</code>
   * @return The result.
   */
  java.lang.String getResult();
  /**
   * <code>string Result = 2;</code>
   * @return The bytes for result.
   */
  com.google.protobuf.ByteString
      getResultBytes();
}
