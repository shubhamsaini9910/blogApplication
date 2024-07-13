package com.blog.services;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	//update
	CategoryDto updateCategory(CategoryDto category , Integer categoryId);
	
	//get
	CategoryDto getCategoryById(Integer categoryId);

	//get all
	List<CategoryDto> getCategories();
	
	//delete
	 void deleteCategory(Integer categoryId);


	
}
