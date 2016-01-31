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

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    @RequestMapping(method= RequestMethod.GET)
    public Iterable listProducts(){
        return productService.findAll();
    }
    @RequestMapping(method= RequestMethod.POST)
    public Product insertProduct(Product product){
        return productService.insert(product);
    }
    @RequestMapping(value="/{id}",method= RequestMethod.GET)
    public Product getProductById(@PathVariable String id){
        return productService.findById(id);
    }
    @RequestMapping(method=RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product){
        return productService.update(product);
    }
    @RequestMapping(value="/{id}",method=RequestMethod.DELETE)
    public Long deleteProductById(@PathVariable String id){
        return productService.deleteById(id);
    }
}
