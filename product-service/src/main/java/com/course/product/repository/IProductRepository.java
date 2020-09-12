package com.course.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.course.product.entity.Category;
import com.course.product.entity.Product;

public interface IProductRepository extends JpaRepository<Product, Long> {
	
	public List<Product> findByCategory(Category category);

}
