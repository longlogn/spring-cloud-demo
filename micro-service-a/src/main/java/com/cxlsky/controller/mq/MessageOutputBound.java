package com.cxlsky.controller.mq;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * className MessageOutputBound
 * description MessageOutputBound
 *
 * @author Toby
 * @date 2019-6-26
 */
public interface MessageOutputBound {

    String OUTPUT_SAY_HELLO_TO_B = "hello_B";

    @Output(OUTPUT_SAY_HELLO_TO_B)
    SubscribableChannel sayHelloToB();


}
