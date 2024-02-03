package com.productManager.order.service.impl;

import com.productManager.order.domain.OrderItem;
import com.productManager.order.repository.OrderItemRepository;
import com.productManager.order.service.OrderItemService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderItemServiceImpl extends GenericServiceImpl<OrderItem, Long, OrderItemRepository> implements OrderItemService {
    public OrderItemServiceImpl(OrderItemRepository repository) {
        super(repository);
    }
}
