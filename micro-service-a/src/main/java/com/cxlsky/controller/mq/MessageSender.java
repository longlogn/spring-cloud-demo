package com.cxlsky.controller.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

/**
 * className MessageSender
 * description MessageSender
 *
 * @author Toby
 * @date 2019-6-26
 */
@EnableBinding(MessageOutputBound.class)
public class MessageSender {

    @Autowired
    private MessageOutputBound messageOutputBound;

    public void send() {
        messageOutputBound.sayHelloToB().send(MessageBuilder.withPayload("hello").build());
        System.out.println("=============send message");
    }
}
