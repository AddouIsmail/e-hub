package com.ehub.controllers;

import com.ehub.entities.Product;
import com.ehub.services.ProductService;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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

    @RequestMapping(method = RequestMethod.GET)
    public Iterable listProducts() {
        return productService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product insertProduct(@RequestBody Product product) {
        System.out.println(product);
        return productService.insert(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable String id) {
        return productService.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Product updateProduct(@RequestBody Product product) {
        return productService.update(product);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteProductById(@PathVariable String id) {
        return productService.deleteById(id);
    }

    @RequestMapping(value = "/file", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> save(@RequestParam("uploadfile") MultipartFile uploadfile, @RequestParam("name") String name) {
        try {
            // Get the filename and build the local file path (be sure that the
            // application have write permissions on such directory)
            String filename = uploadfile.getOriginalFilename();
            System.out.println(name);
            new File("G:\\" + name).mkdir();
            String directory = "G:\\" + name;
            String filepath = Paths.get(directory, filename).toString();
            Product p = productService.findById(name);
            p.getImages().add(filename);
            productService.update(p);
            // Save the file locally
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
            stream.write(uploadfile.getBytes());
            stream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
