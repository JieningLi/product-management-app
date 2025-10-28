package com.example.productmanager.repository;

import com.example.productmanager.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByNameIgnoreCase(String name);
}
