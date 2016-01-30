package com.ehub.services;

import com.ehub.entities.Category;

public interface CategoryService {
    Iterable findAll();
	public Category getCategoryById(String id);
	public Category save(Category category);
	
}
