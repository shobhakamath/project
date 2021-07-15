package com.example.mq.controller;

import com.example.mq.CustomMessage;
import com.example.mq.config.MQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@RestController
public class MessagePublisher {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("/publish")
    public String publishMessage(@RequestBody CustomMessage customMessage){
        customMessage.setMessageId(UUID.randomUUID().toString());
        customMessage.setMessageDate(new Date());
       rabbitTemplate.convertAndSend(MQConfig.MESSAGE_EXCHANGE,MQConfig.MESSAGE_ROUTING_KEY,customMessage);
       return  "Message published";
    }
}
