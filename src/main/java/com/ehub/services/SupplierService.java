package com.ehub.services;

import com.ehub.entities.Supplier;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface SupplierService {
    public Iterable findAll();
    public Supplier findById(String id);
    public Supplier insert(Supplier supplier);
    public Supplier update(Supplier supplier);
    public Long deleteById(String id);
}
