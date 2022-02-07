package com.ibuy.product.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibuy.product.demo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByProductId(int productId);

}
