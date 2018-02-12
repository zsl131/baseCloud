package com.zslin.hystrix;

import com.zslin.service.ISmsService;
import org.springframework.stereotype.Component;

@Component
public class SmsServiceHystrix implements ISmsService {
    @Override
    public String sendSms(String phone, String content) {
        return "请求失败";
    }
}
