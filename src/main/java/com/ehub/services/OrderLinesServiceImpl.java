package com.ehub.services;

import com.ehub.entities.OrderLines;
import com.ehub.repositories.OrderLinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
public class OrderLinesServiceImpl implements OrderLinesService {

    private OrderLinesRepository orderLinesRepository;

    @Autowired
    public void setOrderLinesRepository(OrderLinesRepository orderLinesRepository) {
        this.orderLinesRepository = orderLinesRepository;
    }

    @Override
    public Iterable findAll() {
        return orderLinesRepository.findAll();
    }

    @Override
    public OrderLines getProductById(String id) {
        return orderLinesRepository.findOne(id);
    }

    @Override
    public OrderLines save(OrderLines orderlines) {
        return orderLinesRepository.save(orderlines);
    }
}
