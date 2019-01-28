package com.dev.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;


    public void send(){
        String context = "发送："+new Date();
        System.out.println("send:"+context);
        amqpTemplate.convertAndSend("testQueue",context);
    }

}
