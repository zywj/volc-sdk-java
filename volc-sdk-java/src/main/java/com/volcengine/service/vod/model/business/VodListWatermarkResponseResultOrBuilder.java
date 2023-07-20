// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

public interface VodListWatermarkResponseResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Vod.Models.Business.VodListWatermarkResponseResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 Limit = 1;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>int32 Offset = 2;</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <code>int64 Total = 3;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoTemplate Data = 4;</code>
   */
  java.util.List<com.volcengine.service.vod.model.business.LogoTemplate> 
      getDataList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoTemplate Data = 4;</code>
   */
  com.volcengine.service.vod.model.business.LogoTemplate getData(int index);
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoTemplate Data = 4;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoTemplate Data = 4;</code>
   */
  java.util.List<? extends com.volcengine.service.vod.model.business.LogoTemplateOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .Volcengine.Vod.Models.Business.LogoTemplate Data = 4;</code>
   */
  com.volcengine.service.vod.model.business.LogoTemplateOrBuilder getDataOrBuilder(
      int index);
}