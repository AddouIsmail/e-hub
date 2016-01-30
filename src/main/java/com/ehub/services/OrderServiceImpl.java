package com.ehub.services;

import com.ehub.entities.Order;
import com.ehub.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
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
    public Order findById(String id) {
        return orderRepository.findOne(id);
    }
    public Order insert(Order order) {
        return orderRepository.insert(order);
    }
    @Override
    public Order update(Order order) {
        return orderRepository.save(order);
    }
	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return orderRepository.deleteById(id);
	}
}
