package com.wepapp.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wepapp.workshop.entity.Product;
import com.wepapp.workshop.repository.ProductRepository;

@Service
public class ProductServices {
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findall() {
		return productRepository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}
}
