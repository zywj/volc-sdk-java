// Code generated by protoc-gen-volcengine-sdk
// source: describeVodSpaceStorageData
// DO NOT EDIT!

package com.volcengine.example.vod.measure;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodDescribeVodSpaceStorageDataDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodDescribeVodSpaceStorageDataRequest.newBuilder();
			reqBuilder.setSpaceList("your SpaceList");
			reqBuilder.setStartTime("your StartTime");
			reqBuilder.setEndTime("your EndTime");
			reqBuilder.setAggregation(0);
			reqBuilder.setType("your Type");
			
            com.volcengine.service.vod.model.response.VodDescribeVodSpaceStorageDataResponse resp = vodService.describeVodSpaceStorageData(reqBuilder.build());
            if (resp.getResponseMetadata().hasError()) {
                System.out.println(resp.getResponseMetadata().getError());
                System.exit(-1);
            }
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}