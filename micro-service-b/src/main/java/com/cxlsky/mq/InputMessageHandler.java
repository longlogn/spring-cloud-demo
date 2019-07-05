package com.cxlsky.mq;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;

/**
 * className InputMessageHandler
 * description InputMessageHandler
 *
 * @author Toby
 * @date 2019-7-4
 */
@EnableBinding(MessageInputBound.class)
public class InputMessageHandler {

    @StreamListener(MessageInputBound.INPUT_HELLO_FROM_A)
    public void receive(@Payload String hello) {
        System.out.println("===================> receive from a:" + hello);
    }
}
