package com.ehub.repositories;

import com.ehub.entities.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface ClientRepository extends MongoRepository<Client, String> {
	public Long deleteById(String id);
	public Client findByLogin(String login);
}
