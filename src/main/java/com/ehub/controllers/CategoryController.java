package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ehub.entities.Category;
import com.ehub.services.CategoryService;
@CrossOrigin
@RestController
@RequestMapping("/category")
public class CategoryController {
	private CategoryService categoryService;
	@Autowired
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	@RequestMapping(method = RequestMethod.GET)
    public Iterable listCategories(){
	return categoryService.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
    public Category insertCategory(@RequestBody Category category){
	return categoryService.insert(category);
	}
	@RequestMapping(method = RequestMethod.PUT)
    public Category updateCategory(@RequestBody Category category){
	return categoryService.update(category);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable String id){
	return categoryService.findById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteCategoryById(@PathVariable String id){
	return categoryService.deleteById(id);
	}
}
