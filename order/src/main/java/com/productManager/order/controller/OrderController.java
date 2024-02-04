package com.productManager.order.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.productManager.order.domain.Order;
import com.productManager.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController extends GenericController<Order> {
    @Autowired
    public OrderService service;
    public OrderController(OrderService service) {
        super(service);
    }

    @PostMapping("create-order")
    public ResponseEntity<Void> createOrder(@RequestBody Order order) throws JsonProcessingException {
        Order ord = service.createOrder(order);

        service.sendNotification(ord);

        return ResponseEntity.ok().build();
    }
}
