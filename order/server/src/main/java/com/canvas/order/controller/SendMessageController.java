package com.canvas.order.controller;

import com.canvas.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author: 宗恣
 * @Date: 2018/8/1 0001 17:41
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient steamClient;

    @GetMapping("/sendMessage")
    public void process() {
        String message = "now " + new Date();
        steamClient.output().send(MessageBuilder.withPayload(message).build());
    }

}
