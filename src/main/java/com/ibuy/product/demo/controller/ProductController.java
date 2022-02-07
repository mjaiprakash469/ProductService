package com.ibuy.product.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibuy.product.demo.entity.Purchase;
import com.ibuy.product.demo.service.PurchaseService;


@RestController
public class ProductController {
	
	
	@Autowired
	PurchaseService purchaseService;
	
	
	@GetMapping("/history{pageSize}")
	public List<Purchase> getPurchaseHistory(@PathVariable int pageSize){
		return purchaseService.getPurchaseHistory(pageSize);
	}
}
