package com.volcengine.example.live.v20230101;


import com.volcengine.model.live.v20230101.*;
import com.volcengine.service.live.v20230101.LiveService;

public class GetVqosRawDataExample {
    public static void main(String[] args) {
        LiveService service = LiveService.getInstance();
        service.setAccessKey("ak");
        service.setSecretKey("sk");

        GetVqosRawDataQuery query = new GetVqosRawDataQuery();
        GetVqosRawDataBody body = new GetVqosRawDataBody();
        
        try {
            GetVqosRawDataRes resp = service.getVqosRawData(query, body);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
