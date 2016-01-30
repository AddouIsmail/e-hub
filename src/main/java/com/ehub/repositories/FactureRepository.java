package com.ehub.repositories;

import com.ehub.entities.Facture;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface FactureRepository extends MongoRepository<Facture, String> {
	public Long deleteById(String id);
}
