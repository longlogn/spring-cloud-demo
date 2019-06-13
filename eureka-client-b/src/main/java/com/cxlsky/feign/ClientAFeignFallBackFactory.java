package com.cxlsky.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * className ClientAFeignFallBackFactory
 * description ClientAFeignFallBackFactory
 *
 * @author Toby
 * @date 2019-6-12
 */
@Component
public class ClientAFeignFallBackFactory implements FallbackFactory<ClientAFeignClient> {

    @Override
    public ClientAFeignClient create(Throwable throwable) {
        return new ClientAFeignClient() {

            @Override
            public String hello() {
                return "eureka-client-a is error";
            }
        };
    }
}
