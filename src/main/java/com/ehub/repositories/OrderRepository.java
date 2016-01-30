package com.ehub.repositories;

import com.ehub.entities.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface OrderRepository extends MongoRepository<Order,String> {
	 public Long deleteById(String id);
}
