package com.ehub.services;

import com.ehub.entities.OrderLines;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
public interface OrderLinesService {
    public Iterable findAll();

    public OrderLines getProductById(String id);

    public OrderLines save(OrderLines orderlines);
}
