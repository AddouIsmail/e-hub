package com.ehub.repositories;

import com.ehub.entities.PaymentMode;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Ismail on 30/01/2016.
 */
public interface PaymentModeRepository extends MongoRepository<PaymentMode,String>{
}
