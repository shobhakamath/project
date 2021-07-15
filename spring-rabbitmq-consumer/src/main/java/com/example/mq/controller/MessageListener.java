package com.example.mq.controller;

import com.example.mq.CustomMessage;
import com.example.mq.config.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @RabbitListener(queues = MQConfig.MESSAGE_QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }

}
