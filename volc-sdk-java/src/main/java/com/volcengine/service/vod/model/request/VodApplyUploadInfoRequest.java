// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/request/request_vod.proto

package com.volcengine.service.vod.model.request;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest}
 */
public final class VodApplyUploadInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest)
    VodApplyUploadInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VodApplyUploadInfoRequest.newBuilder() to construct.
  private VodApplyUploadInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VodApplyUploadInfoRequest() {
    spaceName_ = "";
    sessionKey_ = "";
    fileType_ = "";
    fileName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VodApplyUploadInfoRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VodApplyUploadInfoRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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

            spaceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sessionKey_ = s;
            break;
          }
          case 25: {

            fileSize_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            fileType_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fileName_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodApplyUploadInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodApplyUploadInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.class, com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.Builder.class);
  }

  public static final int SPACENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object spaceName_;
  /**
   * <code>string SpaceName = 1;</code>
   * @return The spaceName.
   */
  @java.lang.Override
  public java.lang.String getSpaceName() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      spaceName_ = s;
      return s;
    }
  }
  /**
   * <code>string SpaceName = 1;</code>
   * @return The bytes for spaceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSpaceNameBytes() {
    java.lang.Object ref = spaceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      spaceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSIONKEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object sessionKey_;
  /**
   * <code>string SessionKey = 2;</code>
   * @return The sessionKey.
   */
  @java.lang.Override
  public java.lang.String getSessionKey() {
    java.lang.Object ref = sessionKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sessionKey_ = s;
      return s;
    }
  }
  /**
   * <code>string SessionKey = 2;</code>
   * @return The bytes for sessionKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSessionKeyBytes() {
    java.lang.Object ref = sessionKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sessionKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILESIZE_FIELD_NUMBER = 3;
  private double fileSize_;
  /**
   * <code>double FileSize = 3;</code>
   * @return The fileSize.
   */
  @java.lang.Override
  public double getFileSize() {
    return fileSize_;
  }

  public static final int FILETYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object fileType_;
  /**
   * <code>string FileType = 4;</code>
   * @return The fileType.
   */
  @java.lang.Override
  public java.lang.String getFileType() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileType_ = s;
      return s;
    }
  }
  /**
   * <code>string FileType = 4;</code>
   * @return The bytes for fileType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileTypeBytes() {
    java.lang.Object ref = fileType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILENAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object fileName_;
  /**
   * <code>string FileName = 5;</code>
   * @return The fileName.
   */
  @java.lang.Override
  public java.lang.String getFileName() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fileName_ = s;
      return s;
    }
  }
  /**
   * <code>string FileName = 5;</code>
   * @return The bytes for fileName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFileNameBytes() {
    java.lang.Object ref = fileName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fileName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getSpaceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, spaceName_);
    }
    if (!getSessionKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sessionKey_);
    }
    if (fileSize_ != 0D) {
      output.writeDouble(3, fileSize_);
    }
    if (!getFileTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, fileType_);
    }
    if (!getFileNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fileName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSpaceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, spaceName_);
    }
    if (!getSessionKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sessionKey_);
    }
    if (fileSize_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, fileSize_);
    }
    if (!getFileTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, fileType_);
    }
    if (!getFileNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fileName_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest other = (com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest) obj;

    if (!getSpaceName()
        .equals(other.getSpaceName())) return false;
    if (!getSessionKey()
        .equals(other.getSessionKey())) return false;
    if (java.lang.Double.doubleToLongBits(getFileSize())
        != java.lang.Double.doubleToLongBits(
            other.getFileSize())) return false;
    if (!getFileType()
        .equals(other.getFileType())) return false;
    if (!getFileName()
        .equals(other.getFileName())) return false;
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
    hash = (37 * hash) + SPACENAME_FIELD_NUMBER;
    hash = (53 * hash) + getSpaceName().hashCode();
    hash = (37 * hash) + SESSIONKEY_FIELD_NUMBER;
    hash = (53 * hash) + getSessionKey().hashCode();
    hash = (37 * hash) + FILESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getFileSize()));
    hash = (37 * hash) + FILETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFileType().hashCode();
    hash = (37 * hash) + FILENAME_FIELD_NUMBER;
    hash = (53 * hash) + getFileName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest)
      com.volcengine.service.vod.model.request.VodApplyUploadInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodApplyUploadInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodApplyUploadInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.class, com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.newBuilder()
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
      spaceName_ = "";

      sessionKey_ = "";

      fileSize_ = 0D;

      fileType_ = "";

      fileName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.request.VodRequest.internal_static_Volcengine_Vod_Models_Request_VodApplyUploadInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest build() {
      com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest buildPartial() {
      com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest result = new com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest(this);
      result.spaceName_ = spaceName_;
      result.sessionKey_ = sessionKey_;
      result.fileSize_ = fileSize_;
      result.fileType_ = fileType_;
      result.fileName_ = fileName_;
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
      if (other instanceof com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest) {
        return mergeFrom((com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest other) {
      if (other == com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest.getDefaultInstance()) return this;
      if (!other.getSpaceName().isEmpty()) {
        spaceName_ = other.spaceName_;
        onChanged();
      }
      if (!other.getSessionKey().isEmpty()) {
        sessionKey_ = other.sessionKey_;
        onChanged();
      }
      if (other.getFileSize() != 0D) {
        setFileSize(other.getFileSize());
      }
      if (!other.getFileType().isEmpty()) {
        fileType_ = other.fileType_;
        onChanged();
      }
      if (!other.getFileName().isEmpty()) {
        fileName_ = other.fileName_;
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
      com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object spaceName_ = "";
    /**
     * <code>string SpaceName = 1;</code>
     * @return The spaceName.
     */
    public java.lang.String getSpaceName() {
      java.lang.Object ref = spaceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        spaceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return The bytes for spaceName.
     */
    public com.google.protobuf.ByteString
        getSpaceNameBytes() {
      java.lang.Object ref = spaceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        spaceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      spaceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpaceName() {
      
      spaceName_ = getDefaultInstance().getSpaceName();
      onChanged();
      return this;
    }
    /**
     * <code>string SpaceName = 1;</code>
     * @param value The bytes for spaceName to set.
     * @return This builder for chaining.
     */
    public Builder setSpaceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      spaceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sessionKey_ = "";
    /**
     * <code>string SessionKey = 2;</code>
     * @return The sessionKey.
     */
    public java.lang.String getSessionKey() {
      java.lang.Object ref = sessionKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sessionKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string SessionKey = 2;</code>
     * @return The bytes for sessionKey.
     */
    public com.google.protobuf.ByteString
        getSessionKeyBytes() {
      java.lang.Object ref = sessionKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sessionKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string SessionKey = 2;</code>
     * @param value The sessionKey to set.
     * @return This builder for chaining.
     */
    public Builder setSessionKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sessionKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string SessionKey = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSessionKey() {
      
      sessionKey_ = getDefaultInstance().getSessionKey();
      onChanged();
      return this;
    }
    /**
     * <code>string SessionKey = 2;</code>
     * @param value The bytes for sessionKey to set.
     * @return This builder for chaining.
     */
    public Builder setSessionKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sessionKey_ = value;
      onChanged();
      return this;
    }

    private double fileSize_ ;
    /**
     * <code>double FileSize = 3;</code>
     * @return The fileSize.
     */
    @java.lang.Override
    public double getFileSize() {
      return fileSize_;
    }
    /**
     * <code>double FileSize = 3;</code>
     * @param value The fileSize to set.
     * @return This builder for chaining.
     */
    public Builder setFileSize(double value) {
      
      fileSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double FileSize = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileSize() {
      
      fileSize_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object fileType_ = "";
    /**
     * <code>string FileType = 4;</code>
     * @return The fileType.
     */
    public java.lang.String getFileType() {
      java.lang.Object ref = fileType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string FileType = 4;</code>
     * @return The bytes for fileType.
     */
    public com.google.protobuf.ByteString
        getFileTypeBytes() {
      java.lang.Object ref = fileType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FileType = 4;</code>
     * @param value The fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FileType = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileType() {
      
      fileType_ = getDefaultInstance().getFileType();
      onChanged();
      return this;
    }
    /**
     * <code>string FileType = 4;</code>
     * @param value The bytes for fileType to set.
     * @return This builder for chaining.
     */
    public Builder setFileTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fileName_ = "";
    /**
     * <code>string FileName = 5;</code>
     * @return The fileName.
     */
    public java.lang.String getFileName() {
      java.lang.Object ref = fileName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fileName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string FileName = 5;</code>
     * @return The bytes for fileName.
     */
    public com.google.protobuf.ByteString
        getFileNameBytes() {
      java.lang.Object ref = fileName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fileName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string FileName = 5;</code>
     * @param value The fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fileName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string FileName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileName() {
      
      fileName_ = getDefaultInstance().getFileName();
      onChanged();
      return this;
    }
    /**
     * <code>string FileName = 5;</code>
     * @param value The bytes for fileName to set.
     * @return This builder for chaining.
     */
    public Builder setFileNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fileName_ = value;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Request.VodApplyUploadInfoRequest)
  private static final com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest();
  }

  public static com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VodApplyUploadInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<VodApplyUploadInfoRequest>() {
    @java.lang.Override
    public VodApplyUploadInfoRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VodApplyUploadInfoRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VodApplyUploadInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VodApplyUploadInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.request.VodApplyUploadInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

