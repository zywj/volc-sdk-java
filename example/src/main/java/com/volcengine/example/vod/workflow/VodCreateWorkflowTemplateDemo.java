// Code generated by protoc-gen-volcengine-sdk
// source: CreateWorkflowTemplate
// DO NOT EDIT!

package com.volcengine.example.vod.workflow;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodCreateWorkflowTemplateDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodCreateWorkflowTemplateRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodCreateWorkflowTemplateRequest.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setName("your Name");
			reqBuilder.setDescription("your Description");
			com.volcengine.service.vod.model.business.Activity.Builder activitiesBuilder = com.volcengine.service.vod.model.business.Activity.newBuilder();
			reqBuilder.addActivities(activitiesBuilder);
			
            com.volcengine.service.vod.model.response.VodCreateWorkflowTemplateResponse resp = vodService.CreateWorkflowTemplate(reqBuilder.build());
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