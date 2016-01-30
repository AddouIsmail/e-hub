package com.ehub.controllers;

import com.ehub.entities.Admin;
import com.ehub.entities.Product;
import com.ehub.services.ProductService;
import com.ehub.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ismail on 30/01/2016.
 */
@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    @RequestMapping(value="/products",method= RequestMethod.GET)
    public Iterable listProducts(){
        return productService.findAll();
    }

    @RequestMapping(value="/product/{id}",method= RequestMethod.GET)
    public Product getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @RequestMapping(value="/SaveProduct",method=RequestMethod.POST)
    public Product SaveProduct(@RequestBody Product product){
        return productService.save(product);
    }
}
