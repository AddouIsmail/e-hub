package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ehub.entities.Category;
import com.ehub.services.CategoryService;

@RestController
public class CategoryController {
	private CategoryService categoryService;
	@Autowired
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable listCategories(){
	return categoryService.findAll();
	}
	@RequestMapping(value = "/category", method = RequestMethod.POST)
    public Category saveCategory(@RequestBody Category category){
	return categoryService.save(category);
	}
	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable String id){
	return categoryService.getCategoryById(id);
	}
	

}
