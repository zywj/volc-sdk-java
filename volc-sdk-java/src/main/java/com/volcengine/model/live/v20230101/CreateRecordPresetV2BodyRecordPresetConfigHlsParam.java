package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * CreateRecordPresetV2BodyRecordPresetConfigHlsParam
 */
@lombok.Data
public final class CreateRecordPresetV2BodyRecordPresetConfigHlsParam  {

    /**
     * <p>当前格式的录制是否开启，默认 false，取值及含义如下所示。</p>
     *
     *
     *
     * <p>- false：不开启；</p>
     *
     * <p>- true：开启。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Enable")
    private Boolean enable;

    /**
     * <p>断流录制单文件录制时长，单位为 s，默认值为 7200，取值范围为 -1，[300,86400]，-1表示一直录制，目前只对HLS生效</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Duration")
    private Integer duration;

    /**
     * <p>断流等待时长，取值范围[0,3600]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "ContinueDuration")
    private Integer continueDuration;

    /**
     * <p>实时录制文件时长，单位为 s，取值范围为 [300,21600]</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "RealtimeRecordDuration")
    private Integer realtimeRecordDuration;

    /**
     * <p>断流拼接间隔时长，对实时录制无效，单位为 s，默认值为 0。支持的取值如下所示。</p>
     *
     *
     *
     * <p>-1：一直拼接；</p>
     *
     * <p>0：不拼接；</p>
     *
     * <p>大于 0：断流拼接时间间隔，对 HLS 录制生效。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Splice")
    private Integer splice;

    /**
     * <p>TOS 存储相关配置</p>
     *
     *
     *
     * <p>说明</p>
     *
     *
     *
     * <p>TOSParam和VODParam配置且配置其中一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TOSParam")
    private CreateRecordPresetV2BodyRecordPresetConfigHlsParamTOSParam tOSParam;

    /**
     * <p>VOD 存储相关配置</p>
     *
     *
     *
     * <p>说明</p>
     *
     *
     *
     * <p>TOSParam和VODParam配置且配置其中一个。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "VODParam")
    private CreateRecordPresetV2BodyRecordPresetConfigHlsParamVODParam vODParam;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
