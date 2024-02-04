package com.productManager.notification.component.impl;

import com.productManager.notification.component.RabbitMQComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQComponentImpl implements RabbitMQComponent {
    @Value("${rabbitmq.queue.name}")
    String  queueName;

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void handleMessage(String message) {
        System.out.println("Received message from queue " + queueName + ": " + message);
//        TODO: Receive data
//        TODO: Indentify product and user
//        TODO: Send an e-mail to user
    }
}
