// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: live/business/deny_config.proto

package com.volcengine.service.live.model.business;

public interface DenyConfigDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Volcengine.Live.Models.Business.DenyConfigDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *协议类型，比如tcp,kcp,quic
   * </pre>
   *
   * <code>repeated string ProType = 1;</code>
   * @return A list containing the proType.
   */
  java.util.List<String>
      getProTypeList();
  /**
   * <pre>
   *协议类型，比如tcp,kcp,quic
   * </pre>
   *
   * <code>repeated string ProType = 1;</code>
   * @return The count of proType.
   */
  int getProTypeCount();
  /**
   * <pre>
   *协议类型，比如tcp,kcp,quic
   * </pre>
   *
   * <code>repeated string ProType = 1;</code>
   * @param index The index of the element to return.
   * @return The proType at the given index.
   */
  String getProType(int index);
  /**
   * <pre>
   *协议类型，比如tcp,kcp,quic
   * </pre>
   *
   * <code>repeated string ProType = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the proType at the given index.
   */
  com.google.protobuf.ByteString
      getProTypeBytes(int index);

  /**
   * <pre>
   *格式类型，比如http，rtmp
   * </pre>
   *
   * <code>repeated string FmtType = 2;</code>
   * @return A list containing the fmtType.
   */
  java.util.List<String>
      getFmtTypeList();
  /**
   * <pre>
   *格式类型，比如http，rtmp
   * </pre>
   *
   * <code>repeated string FmtType = 2;</code>
   * @return The count of fmtType.
   */
  int getFmtTypeCount();
  /**
   * <pre>
   *格式类型，比如http，rtmp
   * </pre>
   *
   * <code>repeated string FmtType = 2;</code>
   * @param index The index of the element to return.
   * @return The fmtType at the given index.
   */
  String getFmtType(int index);
  /**
   * <pre>
   *格式类型，比如http，rtmp
   * </pre>
   *
   * <code>repeated string FmtType = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the fmtType at the given index.
   */
  com.google.protobuf.ByteString
      getFmtTypeBytes(int index);

  /**
   * <pre>
   *大洲
   * </pre>
   *
   * <code>string Continent = 3;</code>
   * @return The continent.
   */
  String getContinent();
  /**
   * <pre>
   *大洲
   * </pre>
   *
   * <code>string Continent = 3;</code>
   * @return The bytes for continent.
   */
  com.google.protobuf.ByteString
      getContinentBytes();

  /**
   * <pre>
   *国家码
   * </pre>
   *
   * <code>string Country = 4;</code>
   * @return The country.
   */
  String getCountry();
  /**
   * <pre>
   *国家码
   * </pre>
   *
   * <code>string Country = 4;</code>
   * @return The bytes for country.
   */
  com.google.protobuf.ByteString
      getCountryBytes();

  /**
   * <pre>
   *区域
   * </pre>
   *
   * <code>string Region = 5;</code>
   * @return The region.
   */
  String getRegion();
  /**
   * <pre>
   *区域
   * </pre>
   *
   * <code>string Region = 5;</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   *城市
   * </pre>
   *
   * <code>string City = 6;</code>
   * @return The city.
   */
  String getCity();
  /**
   * <pre>
   *城市
   * </pre>
   *
   * <code>string City = 6;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <pre>
   *运营商
   * </pre>
   *
   * <code>string ISP = 7;</code>
   * @return The iSP.
   */
  String getISP();
  /**
   * <pre>
   *运营商
   * </pre>
   *
   * <code>string ISP = 7;</code>
   * @return The bytes for iSP.
   */
  com.google.protobuf.ByteString
      getISPBytes();

  /**
   * <pre>
   *黑名单
   * </pre>
   *
   * <code>repeated string DenyList = 8;</code>
   * @return A list containing the denyList.
   */
  java.util.List<String>
      getDenyListList();
  /**
   * <pre>
   *黑名单
   * </pre>
   *
   * <code>repeated string DenyList = 8;</code>
   * @return The count of denyList.
   */
  int getDenyListCount();
  /**
   * <pre>
   *黑名单
   * </pre>
   *
   * <code>repeated string DenyList = 8;</code>
   * @param index The index of the element to return.
   * @return The denyList at the given index.
   */
  String getDenyList(int index);
  /**
   * <pre>
   *黑名单
   * </pre>
   *
   * <code>repeated string DenyList = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the denyList at the given index.
   */
  com.google.protobuf.ByteString
      getDenyListBytes(int index);

  /**
   * <pre>
   *白名单
   * </pre>
   *
   * <code>repeated string AllowList = 9;</code>
   * @return A list containing the allowList.
   */
  java.util.List<String>
      getAllowListList();
  /**
   * <pre>
   *白名单
   * </pre>
   *
   * <code>repeated string AllowList = 9;</code>
   * @return The count of allowList.
   */
  int getAllowListCount();
  /**
   * <pre>
   *白名单
   * </pre>
   *
   * <code>repeated string AllowList = 9;</code>
   * @param index The index of the element to return.
   * @return The allowList at the given index.
   */
  String getAllowList(int index);
  /**
   * <pre>
   *白名单
   * </pre>
   *
   * <code>repeated string AllowList = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the allowList at the given index.
   */
  com.google.protobuf.ByteString
      getAllowListBytes(int index);
}