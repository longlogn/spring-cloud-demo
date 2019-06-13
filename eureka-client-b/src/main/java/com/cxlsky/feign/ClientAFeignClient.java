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
@FeignClient(value = "eureka-client-a", fallbackFactory = ClientAFeignFallBackFactory.class)
public interface ClientAFeignClient {

    /**
     * 调用hello接口
     * @return
     */
    @GetMapping("/hello")
    String hello();
}
