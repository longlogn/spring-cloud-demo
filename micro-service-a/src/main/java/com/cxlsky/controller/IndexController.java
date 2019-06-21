package com.cxlsky.controller;

import com.netflix.ribbon.Ribbon;
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
//    @Value("${test}")
//    private String test;

    @GetMapping("/hello")
    public String hello() {
        return "applicationName is: " + applicationName + ", port is: " + port + " config server test: " + "NO";
    }

}
