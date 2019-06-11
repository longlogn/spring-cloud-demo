package com.cxlsky.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * className ClientAFeignClient
 * description ClientAFeignClient
 *
 * @author Toby
 * @date 2019-6-11
 */
@FeignClient(value = "eureka-client-a")
public interface ClientAFeignClient {

    @GetMapping("/hello")
    String hello();
}
