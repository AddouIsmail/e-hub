package com.ehub.repositories;

import com.ehub.entities.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by AyoubOlk on 30/01/2016.
 */
public interface CategoryRepository extends MongoRepository<Category, String> {
}
