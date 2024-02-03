package com.productManager.order.service.impl;

import com.productManager.order.domain.Order;
import com.productManager.order.repository.OrderRepository;
import com.productManager.order.service.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderServiceImpl extends GenericServiceImpl<Order, Long, OrderRepository> implements OrderService {
    public OrderServiceImpl(OrderRepository repository) {
        super(repository);
    }
}
