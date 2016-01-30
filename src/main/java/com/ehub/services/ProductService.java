package com.ehub.services;

import com.ehub.entities.Product;

import java.util.Iterator;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface ProductService {

    public Iterable findAll();

    public Product getProductById(String id);

    public Product save(Product product);
}
