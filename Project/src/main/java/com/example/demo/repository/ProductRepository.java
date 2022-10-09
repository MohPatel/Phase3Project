package com.example.demo.repository;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository  extends CrudRepository<Product, Integer>{

	Optional<Product> findByProductIDAndSeasonAndBrandAndCategoryAndPriceAndColorAndDate(int productID, String season,String brand, String category, int price,String color,Date date);
}
