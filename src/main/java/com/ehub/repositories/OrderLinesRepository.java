package com.ehub.repositories;

import com.ehub.entities.OrderLines;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface OrderLinesRepository extends MongoRepository<OrderLines,String> {
	public Long deleteById(String id);
}
