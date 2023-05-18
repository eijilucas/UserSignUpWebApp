package com.wepapp.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wepapp.workshop.entity.Category;
import com.wepapp.workshop.repository.CategoryRepository;

@Service
public class CategoryServices {
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findall() {
		return categoryRepository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.get();
	}
}
