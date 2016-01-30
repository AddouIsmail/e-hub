package com.ehub.services;

import com.ehub.entities.Supplier;
import com.ehub.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepository supplierRepository;

    @Autowired
    public void setSupplierRepository(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Iterable findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findById(String id) {
        return supplierRepository.findOne(id);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

	@Override
	public Supplier insert(Supplier supplier) {
		// TODO Auto-generated method stub
		return supplierRepository.insert(supplier);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return supplierRepository.deleteById(id);
	}
}
