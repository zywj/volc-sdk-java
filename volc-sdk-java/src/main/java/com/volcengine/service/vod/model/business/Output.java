// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: volcengine/vod/business/vod_edit.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.Output}
 */
public final class Output extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.Output)
    OutputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Output.newBuilder() to construct.
  private Output(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Output() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Output();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Output(
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
          case 8: {

            alpha_ = input.readBool();
            break;
          }
          case 18: {
            com.volcengine.service.vod.model.business.Codec.Builder subBuilder = null;
            if (codec_ != null) {
              subBuilder = codec_.toBuilder();
            }
            codec_ = input.readMessage(com.volcengine.service.vod.model.business.Codec.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(codec_);
              codec_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            disableAudio_ = input.readBool();
            break;
          }
          case 32: {

            disableVideo_ = input.readBool();
            break;
          }
          case 40: {

            fps_ = input.readInt32();
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
    return com.volcengine.service.vod.model.business.VodEdit.internal_static_Volcengine_Vod_Models_Business_Output_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodEdit.internal_static_Volcengine_Vod_Models_Business_Output_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.Output.class, com.volcengine.service.vod.model.business.Output.Builder.class);
  }

  public static final int ALPHA_FIELD_NUMBER = 1;
  private boolean alpha_;
  /**
   * <code>bool Alpha = 1;</code>
   * @return The alpha.
   */
  @java.lang.Override
  public boolean getAlpha() {
    return alpha_;
  }

  public static final int CODEC_FIELD_NUMBER = 2;
  private com.volcengine.service.vod.model.business.Codec codec_;
  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   * @return Whether the codec field is set.
   */
  @java.lang.Override
  public boolean hasCodec() {
    return codec_ != null;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   * @return The codec.
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.Codec getCodec() {
    return codec_ == null ? com.volcengine.service.vod.model.business.Codec.getDefaultInstance() : codec_;
  }
  /**
   * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
   */
  @java.lang.Override
  public com.volcengine.service.vod.model.business.CodecOrBuilder getCodecOrBuilder() {
    return getCodec();
  }

  public static final int DISABLEAUDIO_FIELD_NUMBER = 3;
  private boolean disableAudio_;
  /**
   * <code>bool DisableAudio = 3;</code>
   * @return The disableAudio.
   */
  @java.lang.Override
  public boolean getDisableAudio() {
    return disableAudio_;
  }

  public static final int DISABLEVIDEO_FIELD_NUMBER = 4;
  private boolean disableVideo_;
  /**
   * <code>bool DisableVideo = 4;</code>
   * @return The disableVideo.
   */
  @java.lang.Override
  public boolean getDisableVideo() {
    return disableVideo_;
  }

  public static final int FPS_FIELD_NUMBER = 5;
  private int fps_;
  /**
   * <code>int32 Fps = 5;</code>
   * @return The fps.
   */
  @java.lang.Override
  public int getFps() {
    return fps_;
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
    if (alpha_ != false) {
      output.writeBool(1, alpha_);
    }
    if (codec_ != null) {
      output.writeMessage(2, getCodec());
    }
    if (disableAudio_ != false) {
      output.writeBool(3, disableAudio_);
    }
    if (disableVideo_ != false) {
      output.writeBool(4, disableVideo_);
    }
    if (fps_ != 0) {
      output.writeInt32(5, fps_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (alpha_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, alpha_);
    }
    if (codec_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCodec());
    }
    if (disableAudio_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, disableAudio_);
    }
    if (disableVideo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, disableVideo_);
    }
    if (fps_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, fps_);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.Output)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.Output other = (com.volcengine.service.vod.model.business.Output) obj;

    if (getAlpha()
        != other.getAlpha()) return false;
    if (hasCodec() != other.hasCodec()) return false;
    if (hasCodec()) {
      if (!getCodec()
          .equals(other.getCodec())) return false;
    }
    if (getDisableAudio()
        != other.getDisableAudio()) return false;
    if (getDisableVideo()
        != other.getDisableVideo()) return false;
    if (getFps()
        != other.getFps()) return false;
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
    hash = (37 * hash) + ALPHA_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAlpha());
    if (hasCodec()) {
      hash = (37 * hash) + CODEC_FIELD_NUMBER;
      hash = (53 * hash) + getCodec().hashCode();
    }
    hash = (37 * hash) + DISABLEAUDIO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableAudio());
    hash = (37 * hash) + DISABLEVIDEO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisableVideo());
    hash = (37 * hash) + FPS_FIELD_NUMBER;
    hash = (53 * hash) + getFps();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.Output parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.Output parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.Output parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.Output parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.Output prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.Output}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.Output)
      com.volcengine.service.vod.model.business.OutputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodEdit.internal_static_Volcengine_Vod_Models_Business_Output_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodEdit.internal_static_Volcengine_Vod_Models_Business_Output_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.Output.class, com.volcengine.service.vod.model.business.Output.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.Output.newBuilder()
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
      alpha_ = false;

      if (codecBuilder_ == null) {
        codec_ = null;
      } else {
        codec_ = null;
        codecBuilder_ = null;
      }
      disableAudio_ = false;

      disableVideo_ = false;

      fps_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodEdit.internal_static_Volcengine_Vod_Models_Business_Output_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.Output getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.Output.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.Output build() {
      com.volcengine.service.vod.model.business.Output result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.Output buildPartial() {
      com.volcengine.service.vod.model.business.Output result = new com.volcengine.service.vod.model.business.Output(this);
      result.alpha_ = alpha_;
      if (codecBuilder_ == null) {
        result.codec_ = codec_;
      } else {
        result.codec_ = codecBuilder_.build();
      }
      result.disableAudio_ = disableAudio_;
      result.disableVideo_ = disableVideo_;
      result.fps_ = fps_;
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
      if (other instanceof com.volcengine.service.vod.model.business.Output) {
        return mergeFrom((com.volcengine.service.vod.model.business.Output)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.Output other) {
      if (other == com.volcengine.service.vod.model.business.Output.getDefaultInstance()) return this;
      if (other.getAlpha() != false) {
        setAlpha(other.getAlpha());
      }
      if (other.hasCodec()) {
        mergeCodec(other.getCodec());
      }
      if (other.getDisableAudio() != false) {
        setDisableAudio(other.getDisableAudio());
      }
      if (other.getDisableVideo() != false) {
        setDisableVideo(other.getDisableVideo());
      }
      if (other.getFps() != 0) {
        setFps(other.getFps());
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
      com.volcengine.service.vod.model.business.Output parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.Output) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean alpha_ ;
    /**
     * <code>bool Alpha = 1;</code>
     * @return The alpha.
     */
    @java.lang.Override
    public boolean getAlpha() {
      return alpha_;
    }
    /**
     * <code>bool Alpha = 1;</code>
     * @param value The alpha to set.
     * @return This builder for chaining.
     */
    public Builder setAlpha(boolean value) {
      
      alpha_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool Alpha = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAlpha() {
      
      alpha_ = false;
      onChanged();
      return this;
    }

    private com.volcengine.service.vod.model.business.Codec codec_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.Codec, com.volcengine.service.vod.model.business.Codec.Builder, com.volcengine.service.vod.model.business.CodecOrBuilder> codecBuilder_;
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     * @return Whether the codec field is set.
     */
    public boolean hasCodec() {
      return codecBuilder_ != null || codec_ != null;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     * @return The codec.
     */
    public com.volcengine.service.vod.model.business.Codec getCodec() {
      if (codecBuilder_ == null) {
        return codec_ == null ? com.volcengine.service.vod.model.business.Codec.getDefaultInstance() : codec_;
      } else {
        return codecBuilder_.getMessage();
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public Builder setCodec(com.volcengine.service.vod.model.business.Codec value) {
      if (codecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        codec_ = value;
        onChanged();
      } else {
        codecBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public Builder setCodec(
        com.volcengine.service.vod.model.business.Codec.Builder builderForValue) {
      if (codecBuilder_ == null) {
        codec_ = builderForValue.build();
        onChanged();
      } else {
        codecBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public Builder mergeCodec(com.volcengine.service.vod.model.business.Codec value) {
      if (codecBuilder_ == null) {
        if (codec_ != null) {
          codec_ =
            com.volcengine.service.vod.model.business.Codec.newBuilder(codec_).mergeFrom(value).buildPartial();
        } else {
          codec_ = value;
        }
        onChanged();
      } else {
        codecBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public Builder clearCodec() {
      if (codecBuilder_ == null) {
        codec_ = null;
        onChanged();
      } else {
        codec_ = null;
        codecBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public com.volcengine.service.vod.model.business.Codec.Builder getCodecBuilder() {
      
      onChanged();
      return getCodecFieldBuilder().getBuilder();
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    public com.volcengine.service.vod.model.business.CodecOrBuilder getCodecOrBuilder() {
      if (codecBuilder_ != null) {
        return codecBuilder_.getMessageOrBuilder();
      } else {
        return codec_ == null ?
            com.volcengine.service.vod.model.business.Codec.getDefaultInstance() : codec_;
      }
    }
    /**
     * <code>.Volcengine.Vod.Models.Business.Codec Codec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.volcengine.service.vod.model.business.Codec, com.volcengine.service.vod.model.business.Codec.Builder, com.volcengine.service.vod.model.business.CodecOrBuilder> 
        getCodecFieldBuilder() {
      if (codecBuilder_ == null) {
        codecBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.volcengine.service.vod.model.business.Codec, com.volcengine.service.vod.model.business.Codec.Builder, com.volcengine.service.vod.model.business.CodecOrBuilder>(
                getCodec(),
                getParentForChildren(),
                isClean());
        codec_ = null;
      }
      return codecBuilder_;
    }

    private boolean disableAudio_ ;
    /**
     * <code>bool DisableAudio = 3;</code>
     * @return The disableAudio.
     */
    @java.lang.Override
    public boolean getDisableAudio() {
      return disableAudio_;
    }
    /**
     * <code>bool DisableAudio = 3;</code>
     * @param value The disableAudio to set.
     * @return This builder for chaining.
     */
    public Builder setDisableAudio(boolean value) {
      
      disableAudio_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool DisableAudio = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableAudio() {
      
      disableAudio_ = false;
      onChanged();
      return this;
    }

    private boolean disableVideo_ ;
    /**
     * <code>bool DisableVideo = 4;</code>
     * @return The disableVideo.
     */
    @java.lang.Override
    public boolean getDisableVideo() {
      return disableVideo_;
    }
    /**
     * <code>bool DisableVideo = 4;</code>
     * @param value The disableVideo to set.
     * @return This builder for chaining.
     */
    public Builder setDisableVideo(boolean value) {
      
      disableVideo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool DisableVideo = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisableVideo() {
      
      disableVideo_ = false;
      onChanged();
      return this;
    }

    private int fps_ ;
    /**
     * <code>int32 Fps = 5;</code>
     * @return The fps.
     */
    @java.lang.Override
    public int getFps() {
      return fps_;
    }
    /**
     * <code>int32 Fps = 5;</code>
     * @param value The fps to set.
     * @return This builder for chaining.
     */
    public Builder setFps(int value) {
      
      fps_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Fps = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFps() {
      
      fps_ = 0;
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.Output)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.Output)
  private static final com.volcengine.service.vod.model.business.Output DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.Output();
  }

  public static com.volcengine.service.vod.model.business.Output getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Output>
      PARSER = new com.google.protobuf.AbstractParser<Output>() {
    @java.lang.Override
    public Output parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Output(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Output> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Output> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.Output getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
