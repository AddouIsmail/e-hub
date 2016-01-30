package com.ehub.repositories;

import com.ehub.entities.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface AdminRepository extends MongoRepository<Admin, String> {
}
