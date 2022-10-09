package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.Product_Order;
import com.example.demo.repository.Product_OrderRepository;
import com.example.demo.service.Product_OrderService;

@RestController
@RequestMapping("productorder")
public class Product_OrderController {

	@Autowired
	Product_OrderService orderService;
	
	@GetMapping("/{userID}/{productID}")
	public List<Product> getAllProduct(@PathVariable int userID,@PathVariable int productID){
		List<Product> productorders= orderService.findProductByuserIDAndproductID(userID,productID);
		return productorders;
	}
}
