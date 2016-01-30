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
    public OrderLines findById(String id) {
        return orderLinesRepository.findOne(id);
    }

    @Override
    public OrderLines update(OrderLines orderlines) {
        return orderLinesRepository.save(orderlines);
    }

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return orderLinesRepository.deleteById(id);
	}

	@Override
	public OrderLines insert(OrderLines orderlines) {
		// TODO Auto-generated method stub
		return orderLinesRepository.insert(orderlines);
	}

	
}
