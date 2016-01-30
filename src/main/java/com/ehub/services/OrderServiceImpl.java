package com.ehub.services;

import com.ehub.entities.Order;
import com.ehub.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Ismail on 30/01/2016.
 */
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order getProductById(String id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}
