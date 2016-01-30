package com.ehub.services;

import com.ehub.entities.Category;

public interface CategoryService {
    Iterable findAll();
	public Category findById(String id);
	public Category insert(Category category);
	public Category update(Category category);
	public Long deleteById(String id);
	
}
