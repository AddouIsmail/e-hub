package com.ehub.services;

import com.ehub.entities.Order;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface OrderService {
    public Iterable findAll();
    public Order findById(String id);
    public Order update(Order order);
    public Order insert(Order order);
    public Long deleteById(String id);
}
