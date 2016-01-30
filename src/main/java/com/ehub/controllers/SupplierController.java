package com.ehub.controllers;

import com.ehub.entities.Supplier;
import com.ehub.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ismail on 30/01/2016.
 */
@RestController
public class SupplierController {
    private SupplierService supplierService;

    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @RequestMapping(value = "/suppliers",method = RequestMethod.GET)
    public Iterable listSuppliers(){
        return supplierService.findAll();
    }

    @RequestMapping(value="/supplier/{id}",method = RequestMethod.GET)
    public Supplier getSupplierById(@PathVariable String id){
        return supplierService.getProductById(id);
    }

    @RequestMapping(value="supplier",method = RequestMethod.POST)
    public Supplier saveSupplier(Supplier supplier){
        return supplierService.save(supplier);
    }
}
