// Code generated by protoc-gen-volcengine-sdk
// source: addOrUpdateCertificate20230701
// DO NOT EDIT!

package com.volcengine.example.vod.cdn;

import com.volcengine.service.vod.IVodService;
import com.volcengine.service.vod.impl.VodServiceImpl;
public class VodAddOrUpdateCertificateDemo {

    public static void main(String[] args) throws Exception {
        IVodService vodService = VodServiceImpl.getInstance();
        vodService.setAccessKey("your ak");
        vodService.setSecretKey("your sk");

        try {
            com.volcengine.service.vod.model.request.AddOrUpdateCertificateV2Request.Builder reqBuilder = com.volcengine.service.vod.model.request.AddOrUpdateCertificateV2Request.newBuilder();
			reqBuilder.setSpaceName("your SpaceName");
			reqBuilder.setDomain("your Domain");
			reqBuilder.setDomainType("your DomainType");
			reqBuilder.setCertificateId("your CertificateId");
			reqBuilder.setHttpsStatus("your HttpsStatus");
            com.volcengine.service.vod.model.response.AddOrUpdateCertificateV2Response resp = vodService.addOrUpdateCertificate(reqBuilder.build());
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