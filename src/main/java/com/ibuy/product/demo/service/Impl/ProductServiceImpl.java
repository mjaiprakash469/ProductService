package com.ibuy.product.demo.service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibuy.product.demo.entity.Product;
import com.ibuy.product.demo.repository.ProductRepository;
	
	@Service
	public class ProductServiceImpl {
		
	@Autowired
	ProductRepository productRepository;

		public Product getProduct(int productId) {
			Optional<Product> proOptional = Optional.of(productRepository.findByProductId(productId));
			if(proOptional.isPresent()) {
				return proOptional.get();
			}
			return null;
		}
}
