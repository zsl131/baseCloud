package com.zslin.service;

import com.zslin.hystrix.SmsServiceHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-sms", fallback = SmsServiceHystrix.class)
public interface ISmsService {

    @RequestMapping(value = "sms/sendMsg", method = RequestMethod.GET)
    String sendSms(@RequestParam(value = "phone") String phone, @RequestParam(value = "content") String content);
}
