package com.cxlsky.controller;

import com.cxlsky.controller.mq.MessageSender;
import com.netflix.ribbon.Ribbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * className IndexController
 * description IndexController
 *
 * @author Toby
 * @date 2019-6-11
 */
@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${test}")
    private String test;
    @Autowired
    private MessageSender messageSender;
    @GetMapping("/hello")
    public String hello() {
        messageSender.send();
        return "applicationName is: " + applicationName + ", port is: " + port + " config server test: " + test;
    }

}
