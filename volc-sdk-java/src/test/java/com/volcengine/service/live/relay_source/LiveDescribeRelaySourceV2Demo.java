// Code generated by protoc-gen-volcengine-sdk
// source: describeRelaySourceV2
// DO NOT EDIT!

package com.volcengine.service.live.relay_source;

import com.volcengine.service.live.LiveService;
import com.volcengine.service.live.impl.LiveServiceImpl;

public class LiveDescribeRelaySourceV2Demo {

    public static void main(String[] args) throws Exception {
        LiveService liveService = LiveServiceImpl.getInstance();
        liveService.setAccessKey("your ak");
        liveService.setSecretKey("your sk");

        try {
            com.volcengine.service.live.model.request.DescribeRelaySourceRequest.Builder reqBuilder = com.volcengine.service.live.model.request.DescribeRelaySourceRequest.newBuilder();
			reqBuilder.setVhost("your Vhost");
			
            com.volcengine.service.live.model.response.DescribeRelaySourceResponse resp = liveService.describeRelaySourceV2(reqBuilder.build());
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