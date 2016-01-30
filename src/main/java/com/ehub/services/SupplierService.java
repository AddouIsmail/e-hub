package com.ehub.services;

import com.ehub.entities.Supplier;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface SupplierService {
    public Iterable findAll();

    public Supplier getProductById(String id);

    public Supplier save(Supplier supplier);
}
