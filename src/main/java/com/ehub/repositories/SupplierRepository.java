package com.ehub.repositories;

import com.ehub.entities.Supplier;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface SupplierRepository extends MongoRepository<Supplier,String> {

}
