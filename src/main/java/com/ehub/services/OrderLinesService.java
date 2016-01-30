package com.ehub.services;

import com.ehub.entities.OrderLines;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface OrderLinesService {
    public Iterable findAll();

    public OrderLines getProductById(String id);

    public OrderLines save(OrderLines orderlines);
}
