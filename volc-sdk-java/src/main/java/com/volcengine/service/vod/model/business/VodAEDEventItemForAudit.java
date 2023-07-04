// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodAEDEventItemForAudit}
 */
public final class VodAEDEventItemForAudit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodAEDEventItemForAudit)
    VodAEDEventItemForAuditOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodAEDEventItemForAudit.newBuilder() to construct.
  private VodAEDEventItemForAudit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodAEDEventItemForAudit() {
    event_ = "";
    timeRanges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodAEDEventItemForAudit();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodAEDEventItemForAudit(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            event_ = s;
            break;
          }
          case 17: {

            uttProb_ = input.readDouble();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              timeRanges_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit>();
              mutable_bitField0_ |= 0x00000001;
            }
            timeRanges_.add(
                input.readMessage(com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        timeRanges_ = java.util.Collections.unmodifiableList(timeRanges_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodAEDEventItemForAudit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodAEDEventItemForAudit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.class, com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.Builder.class);
  }

  public static final int EVENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object event_;
  /**
   * <pre>
   *事件名，仅当识别成功时填写
   * </pre>
   *
   * <code>string Event = 1;</code>
   * @return The event.
   */
  @java.lang.Override
  public java.lang.String getEvent() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      event_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *事件名，仅当识别成功时填写
   * </pre>
   *
   * <code>string Event = 1;</code>
   * @return The bytes for event.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEventBytes() {
    java.lang.Object ref = event_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      event_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UTTPROB_FIELD_NUMBER = 2;
  private double uttProb_;
  /**
   * <pre>
   *整条音频对应的事件概率，仅当识别成功时填写
   * </pre>
   *
   * <code>double UttProb = 2;</code>
   * @return The uttProb.
   */
  @java.lang.Override
  public double getUttProb() {
    return uttProb_;
  }

  public static final int TIMERANGES_FIELD_NUMBER = 3;
  private java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> timeRanges_;
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> getTimeRangesList() {
    return timeRanges_;
  }
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder> 
      getTimeRangesOrBuilderList() {
    return timeRanges_;
  }
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  @java.lang.Override
  public int getTimeRangesCount() {
    return timeRanges_.size();
  }
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit getTimeRanges(int index) {
    return timeRanges_.get(index);
  }
  /**
   * <pre>
   *事件识别区间，仅当识别成功时填写
   * </pre>
   *
   * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder getTimeRangesOrBuilder(
      int index) {
    return timeRanges_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(event_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, event_);
    }
    if (java.lang.Double.doubleToRawLongBits(uttProb_) != 0) {
      output.writeDouble(2, uttProb_);
    }
    for (int i = 0; i < timeRanges_.size(); i++) {
      output.writeMessage(3, timeRanges_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(event_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, event_);
    }
    if (java.lang.Double.doubleToRawLongBits(uttProb_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, uttProb_);
    }
    for (int i = 0; i < timeRanges_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, timeRanges_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodAEDEventItemForAudit)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodAEDEventItemForAudit other = (com.volcengine.service.vod.model.business.VodAEDEventItemForAudit) obj;

    if (!getEvent()
        .equals(other.getEvent())) return false;
    if (java.lang.Double.doubleToLongBits(getUttProb())
        != java.lang.Double.doubleToLongBits(
            other.getUttProb())) return false;
    if (!getTimeRangesList()
        .equals(other.getTimeRangesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EVENT_FIELD_NUMBER;
    hash = (53 * hash) + getEvent().hashCode();
    hash = (37 * hash) + UTTPROB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getUttProb()));
    if (getTimeRangesCount() > 0) {
      hash = (37 * hash) + TIMERANGES_FIELD_NUMBER;
      hash = (53 * hash) + getTimeRangesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodAEDEventItemForAudit prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodAEDEventItemForAudit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodAEDEventItemForAudit)
      com.volcengine.service.vod.model.business.VodAEDEventItemForAuditOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodAEDEventItemForAudit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodAEDEventItemForAudit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.class, com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTimeRangesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      event_ = "";

      uttProb_ = 0D;

      if (timeRangesBuilder_ == null) {
        timeRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        timeRangesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodAEDEventItemForAudit_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAEDEventItemForAudit getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAEDEventItemForAudit build() {
      com.volcengine.service.vod.model.business.VodAEDEventItemForAudit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodAEDEventItemForAudit buildPartial() {
      com.volcengine.service.vod.model.business.VodAEDEventItemForAudit result = new com.volcengine.service.vod.model.business.VodAEDEventItemForAudit(this);
      int from_bitField0_ = bitField0_;
      result.event_ = event_;
      result.uttProb_ = uttProb_;
      if (timeRangesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          timeRanges_ = java.util.Collections.unmodifiableList(timeRanges_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.timeRanges_ = timeRanges_;
      } else {
        result.timeRanges_ = timeRangesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.volcengine.service.vod.model.business.VodAEDEventItemForAudit) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodAEDEventItemForAudit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodAEDEventItemForAudit other) {
      if (other == com.volcengine.service.vod.model.business.VodAEDEventItemForAudit.getDefaultInstance()) return this;
      if (!other.getEvent().isEmpty()) {
        event_ = other.event_;
        onChanged();
      }
      if (other.getUttProb() != 0D) {
        setUttProb(other.getUttProb());
      }
      if (timeRangesBuilder_ == null) {
        if (!other.timeRanges_.isEmpty()) {
          if (timeRanges_.isEmpty()) {
            timeRanges_ = other.timeRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTimeRangesIsMutable();
            timeRanges_.addAll(other.timeRanges_);
          }
          onChanged();
        }
      } else {
        if (!other.timeRanges_.isEmpty()) {
          if (timeRangesBuilder_.isEmpty()) {
            timeRangesBuilder_.dispose();
            timeRangesBuilder_ = null;
            timeRanges_ = other.timeRanges_;
            bitField0_ = (bitField0_ & ~0x00000001);
            timeRangesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTimeRangesFieldBuilder() : null;
          } else {
            timeRangesBuilder_.addAllMessages(other.timeRanges_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.volcengine.service.vod.model.business.VodAEDEventItemForAudit parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodAEDEventItemForAudit) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object event_ = "";
    /**
     * <pre>
     *事件名，仅当识别成功时填写
     * </pre>
     *
     * <code>string Event = 1;</code>
     * @return The event.
     */
    public java.lang.String getEvent() {
      java.lang.Object ref = event_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        event_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *事件名，仅当识别成功时填写
     * </pre>
     *
     * <code>string Event = 1;</code>
     * @return The bytes for event.
     */
    public com.google.protobuf.ByteString
        getEventBytes() {
      java.lang.Object ref = event_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        event_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *事件名，仅当识别成功时填写
     * </pre>
     *
     * <code>string Event = 1;</code>
     * @param value The event to set.
     * @return This builder for chaining.
     */
    public Builder setEvent(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      event_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *事件名，仅当识别成功时填写
     * </pre>
     *
     * <code>string Event = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvent() {
      
      event_ = getDefaultInstance().getEvent();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *事件名，仅当识别成功时填写
     * </pre>
     *
     * <code>string Event = 1;</code>
     * @param value The bytes for event to set.
     * @return This builder for chaining.
     */
    public Builder setEventBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      event_ = value;
      onChanged();
      return this;
    }

    private double uttProb_ ;
    /**
     * <pre>
     *整条音频对应的事件概率，仅当识别成功时填写
     * </pre>
     *
     * <code>double UttProb = 2;</code>
     * @return The uttProb.
     */
    @java.lang.Override
    public double getUttProb() {
      return uttProb_;
    }
    /**
     * <pre>
     *整条音频对应的事件概率，仅当识别成功时填写
     * </pre>
     *
     * <code>double UttProb = 2;</code>
     * @param value The uttProb to set.
     * @return This builder for chaining.
     */
    public Builder setUttProb(double value) {
      
      uttProb_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *整条音频对应的事件概率，仅当识别成功时填写
     * </pre>
     *
     * <code>double UttProb = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUttProb() {
      
      uttProb_ = 0D;
      onChanged();
      return this;
    }

    private java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> timeRanges_ =
      java.util.Collections.emptyList();
    private void ensureTimeRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        timeRanges_ = new java.util.ArrayList<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit>(timeRanges_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder> timeRangesBuilder_;

    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> getTimeRangesList() {
      if (timeRangesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(timeRanges_);
      } else {
        return timeRangesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public int getTimeRangesCount() {
      if (timeRangesBuilder_ == null) {
        return timeRanges_.size();
      } else {
        return timeRangesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit getTimeRanges(int index) {
      if (timeRangesBuilder_ == null) {
        return timeRanges_.get(index);
      } else {
        return timeRangesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder setTimeRanges(
        int index, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit value) {
      if (timeRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeRangesIsMutable();
        timeRanges_.set(index, value);
        onChanged();
      } else {
        timeRangesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder setTimeRanges(
        int index, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder builderForValue) {
      if (timeRangesBuilder_ == null) {
        ensureTimeRangesIsMutable();
        timeRanges_.set(index, builderForValue.build());
        onChanged();
      } else {
        timeRangesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder addTimeRanges(com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit value) {
      if (timeRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeRangesIsMutable();
        timeRanges_.add(value);
        onChanged();
      } else {
        timeRangesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder addTimeRanges(
        int index, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit value) {
      if (timeRangesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTimeRangesIsMutable();
        timeRanges_.add(index, value);
        onChanged();
      } else {
        timeRangesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder addTimeRanges(
        com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder builderForValue) {
      if (timeRangesBuilder_ == null) {
        ensureTimeRangesIsMutable();
        timeRanges_.add(builderForValue.build());
        onChanged();
      } else {
        timeRangesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder addTimeRanges(
        int index, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder builderForValue) {
      if (timeRangesBuilder_ == null) {
        ensureTimeRangesIsMutable();
        timeRanges_.add(index, builderForValue.build());
        onChanged();
      } else {
        timeRangesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder addAllTimeRanges(
        java.lang.Iterable<? extends com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit> values) {
      if (timeRangesBuilder_ == null) {
        ensureTimeRangesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, timeRanges_);
        onChanged();
      } else {
        timeRangesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder clearTimeRanges() {
      if (timeRangesBuilder_ == null) {
        timeRanges_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        timeRangesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public Builder removeTimeRanges(int index) {
      if (timeRangesBuilder_ == null) {
        ensureTimeRangesIsMutable();
        timeRanges_.remove(index);
        onChanged();
      } else {
        timeRangesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder getTimeRangesBuilder(
        int index) {
      return getTimeRangesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder getTimeRangesOrBuilder(
        int index) {
      if (timeRangesBuilder_ == null) {
        return timeRanges_.get(index);  } else {
        return timeRangesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public java.util.List<? extends com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder> 
         getTimeRangesOrBuilderList() {
      if (timeRangesBuilder_ != null) {
        return timeRangesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(timeRanges_);
      }
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder addTimeRangesBuilder() {
      return getTimeRangesFieldBuilder().addBuilder(
          com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.getDefaultInstance());
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder addTimeRangesBuilder(
        int index) {
      return getTimeRangesFieldBuilder().addBuilder(
          index, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.getDefaultInstance());
    }
    /**
     * <pre>
     *事件识别区间，仅当识别成功时填写
     * </pre>
     *
     * <code>repeated .Volcengine.Vod.Models.Business.VodAEDTimeRangeForAudit TimeRanges = 3;</code>
     */
    public java.util.List<com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder> 
         getTimeRangesBuilderList() {
      return getTimeRangesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder> 
        getTimeRangesFieldBuilder() {
      if (timeRangesBuilder_ == null) {
        timeRangesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAudit.Builder, com.volcengine.service.vod.model.business.VodAEDTimeRangeForAuditOrBuilder>(
                timeRanges_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        timeRanges_ = null;
      }
      return timeRangesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodAEDEventItemForAudit)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodAEDEventItemForAudit)
  private static final com.volcengine.service.vod.model.business.VodAEDEventItemForAudit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodAEDEventItemForAudit();
  }

  public static com.volcengine.service.vod.model.business.VodAEDEventItemForAudit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodAEDEventItemForAudit>
      PARSER = new com.google.protobuf.AbstractParser<VodAEDEventItemForAudit>() {
    @java.lang.Override
    public VodAEDEventItemForAudit parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodAEDEventItemForAudit(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodAEDEventItemForAudit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodAEDEventItemForAudit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodAEDEventItemForAudit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

