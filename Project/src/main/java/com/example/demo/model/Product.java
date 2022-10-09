package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity(name="product")
@Table(name="product")
@EnableTransactionManagement
public class Product {

	public Product()
	{
		
	}
	public Product(int productID, String season, String brand,String category, int price, String color, Date date,int discount,int quantity,String productName)
	{
	
		this.productID = productID;
		this.season = season;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.color = color;
		this.date = date;
		this.discount = discount;
		this.quantity = quantity;
		this.productName = productName;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productID")
	private int productID;
	
	@Column(name = "season")
	private String season;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "created_date")
	private Date date;
	
	@Column(name = "discount")
	private int discount;
	
	@Column(name = "quantity")
	private int quantity;

	@Column(name = "product_name")
	private String productName;
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getCreatedDate() {
		return date;
	}
	public void setCreatedDate(Date created_date) {
		this.date = created_date;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
