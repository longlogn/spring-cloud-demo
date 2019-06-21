package com.cxlsky.controller;

import com.cxlsky.feign.ClientAFeignClient;
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

    @Autowired
    private ClientAFeignClient clientAFeignClient;
    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/hello/from/a")
    public String helloFromA() {
        String hello = clientAFeignClient.hello();
        return "this is " + applicationName + ", port: " + port + " and receive hello from: " + hello;
    }
}
