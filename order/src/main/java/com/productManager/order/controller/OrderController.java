package com.productManager.order.controller;

import com.productManager.order.domain.Order;
import com.productManager.order.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order")
public class OrderController extends GenericController<Order> {
    public OrderController(OrderService service) {
        super(service);
    }
}
