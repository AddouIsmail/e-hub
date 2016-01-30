package com.ehub.services;

import com.ehub.entities.Product;
import com.ehub.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ismail on 30/01/2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(String id) {
        return productRepository.findOne(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

	@Override
	public Product insert(Product product) {
		// TODO Auto-generated method stub
		return productRepository.insert(product);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return productRepository.deleteById(id);
	}
}
