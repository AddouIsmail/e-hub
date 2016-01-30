package com.ehub.repositories;

import com.ehub.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface ProductRepository extends MongoRepository<Product,String> {
	public Long deleteById(String id);
}
