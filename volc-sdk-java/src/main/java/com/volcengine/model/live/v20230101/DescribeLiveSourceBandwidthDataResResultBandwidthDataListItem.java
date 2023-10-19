package com.volcengine.model.live.v20230101;


import com.alibaba.fastjson.JSON;

/**
 * DescribeLiveSourceBandwidthDataResResultBandwidthDataListItem
 */
@lombok.Data
public final class DescribeLiveSourceBandwidthDataResResultBandwidthDataListItem  {

    /**
     * <p>时间片起始时刻。RFC3339 格式的 UTC 时间，精度为 s。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "TimeStamp")
    private String timeStamp;

    /**
     * <p>时间片内回源带宽峰值，单位 Mbps。</p>
     */
    @com.alibaba.fastjson.annotation.JSONField(name = "Bandwidth")
    private Float bandwidth;

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}