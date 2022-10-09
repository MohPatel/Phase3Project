package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserRepository repository;
	
	@GetMapping("all")
	public List<User> getAllUser(){
		List<User> users= (List<User>) repository.findAll();
		return users;
	}
}
