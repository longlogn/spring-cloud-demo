package com.cxlsky.controller;

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

    @GetMapping("/hello")
    public String hello() {
        return "applicationName is: " + applicationName + "a2, port is: " + port;
    }

}
