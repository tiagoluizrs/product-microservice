package com.productManager.order.controller;

import com.productManager.order.domain.OrderItem;
import com.productManager.order.service.OrderItemService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/order-item")
public class OrderItemController extends GenericController<OrderItem> {
    public OrderItemController(OrderItemService service) {
        super(service);
    }
}