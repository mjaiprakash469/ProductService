package com.ibuy.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibuy.product.demo.entity.Product;
import com.ibuy.product.demo.service.Impl.ProductServiceImpl;

@RestController
public class ProductController {
	
	@Autowired
	ProductServiceImpl productService;
	
	@GetMapping("/products/{id}")
	public Product getProduct(@PathVariable("id") int id) {
 			return productService.getProduct(id);
 		}
 	}
