package com.example.demo.service;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
 
	@Autowired
	ProductRepository productRepository;
	
	public Product add(Product product) {
		return productRepository.save(product);
	}

	
	public Product update(Product product) {
		return productRepository.save(product);
	}


	public void deleteById(int id) {
		productRepository.deleteById(id);
	}


	public List<Product> findAll() {
		return (List<Product>) productRepository.findAll();
	}
	
	public Optional<Product> searchProduct(int productID, String season,String brand, String category, int price,String color,Date date)
	{
		return productRepository.findByProductIDAndSeasonAndBrandAndCategoryAndPriceAndColorAndDate(productID, season, brand, category, price, color, date);
	}
}
