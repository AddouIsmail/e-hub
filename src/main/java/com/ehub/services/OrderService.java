package com.ehub.services;

import com.ehub.entities.Order;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface OrderService {
    public Iterable findAll();

    public Order getProductById(String id);

    public Order save(Order order);
}
