package com.zslin.controller;

import com.zslin.service.ISmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "main")
public class MainController {

    @Autowired
    private ISmsService smsService;

    @GetMapping(value = "index")
    public String index(String phone, String content) {
        return smsService.sendSms(phone, content);
    }
}
