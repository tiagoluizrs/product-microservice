package com.productManager.order.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.productManager.order.domain.Order;
import com.productManager.order.domain.OrderItem;
import com.productManager.order.repository.OrderItemRepository;
import com.productManager.order.repository.OrderRepository;
import com.productManager.order.service.OrderService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class OrderServiceImpl extends GenericServiceImpl<Order, Long, OrderRepository> implements OrderService {
    private final AmqpTemplate rabbitTemplate;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Value("${rabbitmq.exchange.name}")
    String exchange;

    @Value("${rabbitmq.routing.key}")
    private String routingkey;

    public OrderServiceImpl(OrderRepository repository, AmqpTemplate rabbitTemplate) {
        super(repository);
        this.rabbitTemplate = rabbitTemplate;
    }

    public Order createOrder(Order order) {
        Order ord = repository.save(order);
        for(OrderItem item: ord.getOrderItems()){
            OrderItem orderItem = new OrderItem();
            orderItem.setProduct_id(item.getProduct_id());
            orderItem.setOrder(ord);

            orderItemRepository.save(orderItem);
        }

        return ord;
    }

    public void sendNotification(Order order) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        String json = objectMapper.writeValueAsString(order);

        rabbitTemplate.convertAndSend(exchange,routingkey,json);
    }
}
