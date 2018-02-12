package com.zslin.controller;

import com.zslin.tools.SmsTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "sms")
public class SmsController {

    @Autowired
    private SmsTools smsTools;

    @GetMapping(value = "sendMsg")
    public String sendMsg(String phone, String content) {
        if(phone == null || "".equals(phone.trim()) || content==null || "".equals(content.trim())) {
            return "发送失败，参数不全！"+smsTools;
        }
        return "发送成功！phone:"+phone+", content: "+content+" . "+smsTools;
    }
}
