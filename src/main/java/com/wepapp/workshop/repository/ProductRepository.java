package com.wepapp.workshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wepapp.workshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
