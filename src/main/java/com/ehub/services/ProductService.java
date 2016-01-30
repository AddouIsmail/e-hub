package com.ehub.services;

import com.ehub.entities.Product;

import java.util.Iterator;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface ProductService {

    public Iterable findAll();
    public Product findById(String id);
    public Product insert(Product product);
    public Product update(Product product);
    public Long deleteById(String id);
}
