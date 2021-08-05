// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: vod/business/vod_workflow.proto

package com.volcengine.service.vod.model.business;

/**
 * Protobuf type {@code Volcengine.Vod.Models.Business.LogoOverride}
 */
public final class LogoOverride extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Volcengine.Vod.Models.Business.LogoOverride)
    LogoOverrideOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogoOverride.newBuilder() to construct.
  private LogoOverride(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogoOverride() {
    templateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogoOverride();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogoOverride(
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

            templateId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              vars_ = com.google.protobuf.MapField.newMapField(
                  VarsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            vars__ = input.readMessage(
                VarsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            vars_.getMutableMap().put(
                vars__.getKey(), vars__.getValue());
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
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetVars();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.volcengine.service.vod.model.business.LogoOverride.class, com.volcengine.service.vod.model.business.LogoOverride.Builder.class);
  }

  public static final int TEMPLATEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object templateId_;
  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The templateId.
   */
  @java.lang.Override
  public java.lang.String getTemplateId() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * 被覆盖的水印模板Id, 支持ALL
   * </pre>
   *
   * <code>string TemplateId = 1;</code>
   * @return The bytes for templateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTemplateIdBytes() {
    java.lang.Object ref = templateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VARS_FIELD_NUMBER = 2;
  private static final class VarsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_VarsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> vars_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetVars() {
    if (vars_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          VarsDefaultEntryHolder.defaultEntry);
    }
    return vars_;
  }

  public int getVarsCount() {
    return internalGetVars().getMap().size();
  }
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */

  @java.lang.Override
  public boolean containsVars(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetVars().getMap().containsKey(key);
  }
  /**
   * Use {@link #getVarsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getVars() {
    return getVarsMap();
  }
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
    return internalGetVars().getMap();
  }
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getVarsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * 自定义水印变量
   * </pre>
   *
   * <code>map&lt;string, string&gt; Vars = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getVarsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetVars().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!getTemplateIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateId_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetVars(),
        VarsDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTemplateIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateId_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetVars().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      vars__ = VarsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, vars__);
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
    if (!(obj instanceof com.volcengine.service.vod.model.business.LogoOverride)) {
      return super.equals(obj);
    }
    com.volcengine.service.vod.model.business.LogoOverride other = (com.volcengine.service.vod.model.business.LogoOverride) obj;

    if (!getTemplateId()
        .equals(other.getTemplateId())) return false;
    if (!internalGetVars().equals(
        other.internalGetVars())) return false;
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
    hash = (37 * hash) + TEMPLATEID_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateId().hashCode();
    if (!internalGetVars().getMap().isEmpty()) {
      hash = (37 * hash) + VARS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVars().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.volcengine.service.vod.model.business.LogoOverride parseFrom(
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
  public static Builder newBuilder(com.volcengine.service.vod.model.business.LogoOverride prototype) {
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
   * Protobuf type {@code Volcengine.Vod.Models.Business.LogoOverride}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Volcengine.Vod.Models.Business.LogoOverride)
      com.volcengine.service.vod.model.business.LogoOverrideOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetVars();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableVars();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.volcengine.service.vod.model.business.LogoOverride.class, com.volcengine.service.vod.model.business.LogoOverride.Builder.class);
    }

    // Construct using com.volcengine.service.vod.model.business.LogoOverride.newBuilder()
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
      templateId_ = "";

      internalGetMutableVars().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.volcengine.service.vod.model.business.VodWorkflow.internal_static_Volcengine_Vod_Models_Business_LogoOverride_descriptor;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.LogoOverride getDefaultInstanceForType() {
      return com.volcengine.service.vod.model.business.LogoOverride.getDefaultInstance();
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.LogoOverride build() {
      com.volcengine.service.vod.model.business.LogoOverride result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.volcengine.service.vod.model.business.LogoOverride buildPartial() {
      com.volcengine.service.vod.model.business.LogoOverride result = new com.volcengine.service.vod.model.business.LogoOverride(this);
      int from_bitField0_ = bitField0_;
      result.templateId_ = templateId_;
      result.vars_ = internalGetVars();
      result.vars_.makeImmutable();
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
      if (other instanceof com.volcengine.service.vod.model.business.LogoOverride) {
        return mergeFrom((com.volcengine.service.vod.model.business.LogoOverride)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.volcengine.service.vod.model.business.LogoOverride other) {
      if (other == com.volcengine.service.vod.model.business.LogoOverride.getDefaultInstance()) return this;
      if (!other.getTemplateId().isEmpty()) {
        templateId_ = other.templateId_;
        onChanged();
      }
      internalGetMutableVars().mergeFrom(
          other.internalGetVars());
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
      com.volcengine.service.vod.model.business.LogoOverride parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.volcengine.service.vod.model.business.LogoOverride) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object templateId_ = "";
    /**
     * <pre>
     * 被覆盖的水印模板Id, 支持ALL
     * </pre>
     *
     * <code>string TemplateId = 1;</code>
     * @return The templateId.
     */
    public java.lang.String getTemplateId() {
      java.lang.Object ref = templateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * 被覆盖的水印模板Id, 支持ALL
     * </pre>
     *
     * <code>string TemplateId = 1;</code>
     * @return The bytes for templateId.
     */
    public com.google.protobuf.ByteString
        getTemplateIdBytes() {
      java.lang.Object ref = templateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * 被覆盖的水印模板Id, 支持ALL
     * </pre>
     *
     * <code>string TemplateId = 1;</code>
     * @param value The templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 被覆盖的水印模板Id, 支持ALL
     * </pre>
     *
     * <code>string TemplateId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTemplateId() {
      
      templateId_ = getDefaultInstance().getTemplateId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 被覆盖的水印模板Id, 支持ALL
     * </pre>
     *
     * <code>string TemplateId = 1;</code>
     * @param value The bytes for templateId to set.
     * @return This builder for chaining.
     */
    public Builder setTemplateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> vars_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetVars() {
      if (vars_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            VarsDefaultEntryHolder.defaultEntry);
      }
      return vars_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableVars() {
      onChanged();;
      if (vars_ == null) {
        vars_ = com.google.protobuf.MapField.newMapField(
            VarsDefaultEntryHolder.defaultEntry);
      }
      if (!vars_.isMutable()) {
        vars_ = vars_.copy();
      }
      return vars_;
    }

    public int getVarsCount() {
      return internalGetVars().getMap().size();
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */

    @java.lang.Override
    public boolean containsVars(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetVars().getMap().containsKey(key);
    }
    /**
     * Use {@link #getVarsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getVars() {
      return getVarsMap();
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getVarsMap() {
      return internalGetVars().getMap();
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getVarsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetVars().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getVarsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetVars().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearVars() {
      internalGetMutableVars().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */

    public Builder removeVars(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableVars().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableVars() {
      return internalGetMutableVars().getMutableMap();
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */
    public Builder putVars(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableVars().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * 自定义水印变量
     * </pre>
     *
     * <code>map&lt;string, string&gt; Vars = 2;</code>
     */

    public Builder putAllVars(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableVars().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:Volcengine.Vod.Models.Business.LogoOverride)
  }

  // @@protoc_insertion_point(class_scope:Volcengine.Vod.Models.Business.LogoOverride)
  private static final com.volcengine.service.vod.model.business.LogoOverride DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.volcengine.service.vod.model.business.LogoOverride();
  }

  public static com.volcengine.service.vod.model.business.LogoOverride getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogoOverride>
      PARSER = new com.google.protobuf.AbstractParser<LogoOverride>() {
    @java.lang.Override
    public LogoOverride parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogoOverride(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogoOverride> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogoOverride> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.volcengine.service.vod.model.business.LogoOverride getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
