// Code generated by protoc-gen-volcengine-sdk
// source: getAllPlayInfo
// DO NOT EDIT!

package com.volcengine.example.vod.play;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodGetAllPlayInfoDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.VodGetAllPlayInfoRequest.Builder reqBuilder = com.volcengine.service.vod.model.request.VodGetAllPlayInfoRequest.newBuilder();
			reqBuilder.setVids("your Vids");
			reqBuilder.setFormats("your Formats");
			reqBuilder.setCodecs("your Codecs");
			reqBuilder.setDefinitions("your Definitions");
			reqBuilder.setFileTypes("your FileTypes");
			reqBuilder.setLogoTypes("your LogoTypes");
			reqBuilder.setNeedEncryptStream("your NeedEncryptStream");
			reqBuilder.setSsl("your Ssl");
			reqBuilder.setNeedThumbs("your NeedThumbs");
			reqBuilder.setNeedBarrageMask("your NeedBarrageMask");
			reqBuilder.setCdnType("your CdnType");
			reqBuilder.setUnionInfo("your UnionInfo");
			reqBuilder.setPlayScene("your PlayScene");
			reqBuilder.setDrmExpireTimestamp("your DrmExpireTimestamp");
			reqBuilder.setHDRType("your HDRType");
			reqBuilder.setKeyFrameAlignmentVersion("your KeyFrameAlignmentVersion");
			reqBuilder.setUserAction("your UserAction");
			reqBuilder.setQuality("your Quality");
			
            com.volcengine.service.vod.model.response.VodGetAllPlayInfoResponse resp = vodService.getAllPlayInfo(reqBuilder.build());
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