package com.cxlsky.mq;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * className MessageInputBound
 * description MessageInputBound
 *
 * @author Toby
 * @date 2019-7-4
 */
public interface MessageInputBound {

    String INPUT_HELLO_FROM_A = "hello_a";

    @Input(INPUT_HELLO_FROM_A)
    SubscribableChannel receive();
}
