package com.dev.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "testQueue")
public class Receiver {

    @RabbitHandler
    public void process(String context){
        System.out.println("message:"+context);
    }

}
