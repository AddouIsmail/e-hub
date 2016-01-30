package com.ehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehub.entities.Category;
import com.ehub.repositories.CategoryRepository;
@Service
public class CategoryServiceImpl implements CategoryService{
	private CategoryRepository categoryRepository;
	@Autowired
	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(String id) {
		// TODO Auto-generated method stub
		return categoryRepository.findOne(id);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return categoryRepository.deleteById(id);
	}

	@Override
	public Category update(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.save(category);
	}

	@Override
	public Category insert(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.insert(category);
	}

}
