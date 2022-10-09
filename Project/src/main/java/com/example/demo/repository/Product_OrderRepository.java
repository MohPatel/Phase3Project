package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
import com.example.demo.model.Product_Order;



@Repository
public class Product_OrderRepository {

	//@Query( value="select new Product(prod.productID, prod.season,prod.brand,prod.category, prod.price,prod.color,prod.created_date,prod.discount,prod.quantity,prod.product_name) from product prod, user u, product_order po where po.userID= :user.userId and po.productId = :prod.productID", nativeQuery = true)
	//List<Product> findProductByuserIDAndproductID(@Param("user.userId") int userID,@Param("prod.productID") int productID);
//	{
//		TypedQuery<Product> q = em.createQuery("select *from product prod, user u, product_order po where po.userID= :user.userId and po.productId = :prod.productID");
//		q.setParameter("user.userId", userID);
//		q.setParameter("prod.productID", productID);
//		List<Product> results = q.getResultList();
//	}
	@PersistenceContext
	private EntityManager entityManager;
	public List<Product> findProductByuserIDAndproductID(int userID,int productID)
	{
		String query = "select prod from product prod, user u, product_order po where po.userID= :userID and po.productID = :productID ";
		TypedQuery<Product> typedQuery = entityManager.createQuery(query , Product.class);
		 return typedQuery.setParameter("userID", userID).setParameter("productID", productID).getResultList();
	}
	
}
