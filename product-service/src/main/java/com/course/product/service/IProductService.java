package com.course.product.service;

import java.util.List;

import com.course.product.entity.Category;
import com.course.product.entity.Product;

public interface IProductService {

	public List<Product> listAllProduct();
	public Product getProduct(Long id);

	public Product createProduct(Product product);
	public Product updateProduct(Product product);
	public  Product deleteProduct(Long id);
	public List<Product> findByCategory(Category category);
	public Product updateStock(Long id, Double quantity);

}
