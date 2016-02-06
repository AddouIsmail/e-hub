package com.ehub.controllers;

import com.ehub.entities.Supplier;
import com.ehub.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ismail on 30/01/2016.
 */
@CrossOrigin
@RestController
@RequestMapping("/supplier")
public class SupplierController {
    private SupplierService supplierService;
    @Autowired
    public void setSupplierService(SupplierService supplierService) {
        this.supplierService = supplierService;
    }
    @RequestMapping(method = RequestMethod.GET)
    public Iterable listSuppliers(){
        return supplierService.findAll();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Supplier getSupplierById(@PathVariable String id){
        return supplierService.findById(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public Supplier insertCategory(@RequestBody Supplier category){
        return supplierService.insert(category);
    }
    @RequestMapping(method = RequestMethod.PUT)
    public Supplier updateSupplier(@RequestBody Supplier supplier){
        return supplierService.update(supplier);
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public Long deleteSupplierById(@PathVariable String id){
        return supplierService.deleteById(id);
    }
}
