package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.Product_OrderRepository;

@Service
public class Product_OrderService {

	@Autowired
	Product_OrderRepository orderRepository;
	
	public List<Product> findProductByuserIDAndproductID(int userID, int productID)
	{
		List<Product> products = orderRepository.findProductByuserIDAndproductID(userID, productID);
		return products;
	}
}
