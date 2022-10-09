package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;


@RestController
@RequestMapping("products")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@GetMapping("all")
	public List<Product> getAllProduct(){
		List<Product> products= productService.findAll();
		return products;
	}
	
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productService.add(product);
	}
	
	@PutMapping("update/{productID}")
	public Product updateProduct(@RequestBody Product product) {
		return productService.update(product);
	}
	
	@DeleteMapping("delete/{productID}")
	public void deleteProduct(@PathVariable int productID) {
		productService.deleteById(productID);
	}
	
	@GetMapping("product/{productID}/{season}/{brand}/{category}/{price}/{color}/{created_date}")
	public Optional<Product> getStudentId(@PathVariable int productID, @PathVariable String season,@PathVariable String brand, @PathVariable String category, @PathVariable int price,@PathVariable String color,@PathVariable Date date)
	{
		return productService.searchProduct(productID, season, brand, category, price, color, date);
	}
}
