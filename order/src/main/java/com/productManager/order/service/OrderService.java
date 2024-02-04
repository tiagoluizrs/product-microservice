package com.productManager.order.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.productManager.order.domain.Order;

public interface OrderService extends GenericService<Order>{
    void sendNotification(Order order) throws JsonProcessingException;

    Order createOrder(Order order);
}

