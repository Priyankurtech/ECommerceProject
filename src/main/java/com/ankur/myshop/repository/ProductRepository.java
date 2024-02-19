package com.ankur.myshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.myshop.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	boolean existsByName(String name);

	Product findByName(String name);

}
