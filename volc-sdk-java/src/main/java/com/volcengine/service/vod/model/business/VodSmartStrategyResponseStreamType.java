// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_smart_strategy.proto

package com.volcengine.service.vod.model.business;

/**
 * <pre>
 * 响应数据流类型
 * </pre>
 *
 * Protobuf enum {@code Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType}
 */
public enum VodSmartStrategyResponseStreamType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 未定义的（保留置空）
   * </pre>
   *
   * <code>UndefinedVodSmartStrategyResponseStreamType = 0;</code>
   */
  UndefinedVodSmartStrategyResponseStreamType(0),
  /**
   * <pre>
   * 返回原片流
   * </pre>
   *
   * <code>OriginalStreamVodSmartStrategyResponseStreamType = 1;</code>
   */
  OriginalStreamVodSmartStrategyResponseStreamType(1),
  /**
   * <pre>
   * 返回匹配的策略转码流
   * </pre>
   *
   * <code>StrategyEncodeStreamVodSmartStrategyResponseStreamType = 2;</code>
   */
  StrategyEncodeStreamVodSmartStrategyResponseStreamType(2),
  /**
   * <pre>
   * 返回降级的转码流
   * </pre>
   *
   * <code>FallbackEncodeStreamVodSmartStrategyResponseStreamType = 3;</code>
   */
  FallbackEncodeStreamVodSmartStrategyResponseStreamType(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 未定义的（保留置空）
   * </pre>
   *
   * <code>UndefinedVodSmartStrategyResponseStreamType = 0;</code>
   */
  public static final int UndefinedVodSmartStrategyResponseStreamType_VALUE = 0;
  /**
   * <pre>
   * 返回原片流
   * </pre>
   *
   * <code>OriginalStreamVodSmartStrategyResponseStreamType = 1;</code>
   */
  public static final int OriginalStreamVodSmartStrategyResponseStreamType_VALUE = 1;
  /**
   * <pre>
   * 返回匹配的策略转码流
   * </pre>
   *
   * <code>StrategyEncodeStreamVodSmartStrategyResponseStreamType = 2;</code>
   */
  public static final int StrategyEncodeStreamVodSmartStrategyResponseStreamType_VALUE = 2;
  /**
   * <pre>
   * 返回降级的转码流
   * </pre>
   *
   * <code>FallbackEncodeStreamVodSmartStrategyResponseStreamType = 3;</code>
   */
  public static final int FallbackEncodeStreamVodSmartStrategyResponseStreamType_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VodSmartStrategyResponseStreamType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VodSmartStrategyResponseStreamType forNumber(int value) {
    switch (value) {
      case 0: return UndefinedVodSmartStrategyResponseStreamType;
      case 1: return OriginalStreamVodSmartStrategyResponseStreamType;
      case 2: return StrategyEncodeStreamVodSmartStrategyResponseStreamType;
      case 3: return FallbackEncodeStreamVodSmartStrategyResponseStreamType;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VodSmartStrategyResponseStreamType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VodSmartStrategyResponseStreamType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VodSmartStrategyResponseStreamType>() {
          public VodSmartStrategyResponseStreamType findValueByNumber(int number) {
            return VodSmartStrategyResponseStreamType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodSmartStrategy.getDescriptor().getEnumTypes().get(0);
  }

  private static final VodSmartStrategyResponseStreamType[] VALUES = values();

  public static VodSmartStrategyResponseStreamType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VodSmartStrategyResponseStreamType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:Volcengine.Vod.Models.Business.VodSmartStrategyResponseStreamType)
}
