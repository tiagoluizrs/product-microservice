package com.productManager.notification.component;

public interface RabbitMQComponent {
    void handleMessage(String message);
}
