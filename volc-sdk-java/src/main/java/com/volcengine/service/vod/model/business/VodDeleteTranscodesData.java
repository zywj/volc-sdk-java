// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_media.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.VodDeleteTranscodesData}
 */
public final class VodDeleteTranscodesData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.VodDeleteTranscodesData)
    VodDeleteTranscodesDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodDeleteTranscodesData.newBuilder() to construct.
  private VodDeleteTranscodesData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodDeleteTranscodesData() {
    notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodDeleteTranscodesData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodDeleteTranscodesData(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              notExistFileIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            notExistFileIds_.add(s);
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
        notExistFileIds_ = notExistFileIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteTranscodesData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteTranscodesData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.VodDeleteTranscodesData.class, com.volcengine.service.vod.model.business.VodDeleteTranscodesData.Builder.class);
  }

  public static final int NOTEXISTFILEIDS_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList notExistFileIds_;
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return A list containing the notExistFileIds.
   */
  public com.google.protobuf.ProtocolStringList
      getNotExistFileIdsList() {
    return notExistFileIds_;
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @return The count of notExistFileIds.
   */
  public int getNotExistFileIdsCount() {
    return notExistFileIds_.size();
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the element to return.
   * @return The notExistFileIds at the given index.
   */
  public java.lang.String getNotExistFileIds(int index) {
    return notExistFileIds_.get(index);
  }
  /**
   * <pre>
   *不存在的转码FileID列表
   * </pre>
   *
   * <code>repeated string NotExistFileIds = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the notExistFileIds at the given index.
   */
  public com.google.protobuf.ByteString
      getNotExistFileIdsBytes(int index) {
    return notExistFileIds_.getByteString(index);
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
    for (int i = 0; i < notExistFileIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, notExistFileIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < notExistFileIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(notExistFileIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotExistFileIdsList().size();
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.VodDeleteTranscodesData)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.VodDeleteTranscodesData other = (com.volcengine.service.vod.model.business.VodDeleteTranscodesData) obj;

    if (!getNotExistFileIdsList()
        .equals(other.getNotExistFileIdsList())) return false;
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
    if (getNotExistFileIdsCount() > 0) {
      hash = (37 * hash) + NOTEXISTFILEIDS_FIELD_NUMBER;
      hash = (53 * hash) + getNotExistFileIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.VodDeleteTranscodesData prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.VodDeleteTranscodesData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.VodDeleteTranscodesData)
      com.volcengine.service.vod.model.business.VodDeleteTranscodesDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteTranscodesData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteTranscodesData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.VodDeleteTranscodesData.class, com.volcengine.service.vod.model.business.VodDeleteTranscodesData.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.VodDeleteTranscodesData.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodMedia.internal_static_Volcengine_Vod_Models_Business_VodDeleteTranscodesData_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteTranscodesData getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.VodDeleteTranscodesData.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteTranscodesData build() {
      com.volcengine.service.vod.model.business.VodDeleteTranscodesData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.VodDeleteTranscodesData buildPartial() {
      com.volcengine.service.vod.model.business.VodDeleteTranscodesData result = new com.volcengine.service.vod.model.business.VodDeleteTranscodesData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        notExistFileIds_ = notExistFileIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.notExistFileIds_ = notExistFileIds_;
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
      if (other instanceof com.volcengine.service.vod.model.business.VodDeleteTranscodesData) {
        return mergeFrom((com.volcengine.service.vod.model.business.VodDeleteTranscodesData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.VodDeleteTranscodesData other) {
      if (other == com.volcengine.service.vod.model.business.VodDeleteTranscodesData.getDefaultInstance()) return this;
      if (!other.notExistFileIds_.isEmpty()) {
        if (notExistFileIds_.isEmpty()) {
          notExistFileIds_ = other.notExistFileIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNotExistFileIdsIsMutable();
          notExistFileIds_.addAll(other.notExistFileIds_);
        }
        onChanged();
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
      com.volcengine.service.vod.model.business.VodDeleteTranscodesData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.VodDeleteTranscodesData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureNotExistFileIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        notExistFileIds_ = new com.google.protobuf.LazyStringArrayList(notExistFileIds_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return A list containing the notExistFileIds.
     */
    public com.google.protobuf.ProtocolStringList
        getNotExistFileIdsList() {
      return notExistFileIds_.getUnmodifiableView();
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return The count of notExistFileIds.
     */
    public int getNotExistFileIdsCount() {
      return notExistFileIds_.size();
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index of the element to return.
     * @return The notExistFileIds at the given index.
     */
    public java.lang.String getNotExistFileIds(int index) {
      return notExistFileIds_.get(index);
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the notExistFileIds at the given index.
     */
    public com.google.protobuf.ByteString
        getNotExistFileIdsBytes(int index) {
      return notExistFileIds_.getByteString(index);
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param index The index to set the value at.
     * @param value The notExistFileIds to set.
     * @return This builder for chaining.
     */
    public Builder setNotExistFileIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistFileIdsIsMutable();
      notExistFileIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param value The notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistFileIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureNotExistFileIdsIsMutable();
      notExistFileIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param values The notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotExistFileIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotExistFileIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notExistFileIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNotExistFileIds() {
      notExistFileIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *不存在的转码FileID列表
     * </pre>
     *
     * <code>repeated string NotExistFileIds = 1;</code>
     * @param value The bytes of the notExistFileIds to add.
     * @return This builder for chaining.
     */
    public Builder addNotExistFileIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureNotExistFileIdsIsMutable();
      notExistFileIds_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.VodDeleteTranscodesData)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.VodDeleteTranscodesData)
  private static final com.volcengine.service.vod.model.business.VodDeleteTranscodesData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.VodDeleteTranscodesData();
  }

  public static com.volcengine.service.vod.model.business.VodDeleteTranscodesData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodDeleteTranscodesData>
      PARSER = new com.google.protobuf.AbstractParser<VodDeleteTranscodesData>() {
    @java.lang.Override
    public VodDeleteTranscodesData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodDeleteTranscodesData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodDeleteTranscodesData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodDeleteTranscodesData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.VodDeleteTranscodesData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

