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
    public Category insertCategory(@RequestBody Category category){
	return categoryService.insert(category);
	}
	@RequestMapping(value = "/category", method = RequestMethod.PUT)
    public Category updateCategory(@RequestBody Category category){
	return categoryService.update(category);
	}
	@RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable String id){
	return categoryService.findById(id);
	}
	@RequestMapping(value = "/category/{id}", method = RequestMethod.DELETE)
    public Long deleteCategoryById(@PathVariable String id){
	return categoryService.deleteById(id);
	}
}
