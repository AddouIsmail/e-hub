package com.ehub.services;

import com.ehub.entities.Product;

import java.util.Iterator;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface ProductService {
    public Iterator findAll();

    public Product save();
}
