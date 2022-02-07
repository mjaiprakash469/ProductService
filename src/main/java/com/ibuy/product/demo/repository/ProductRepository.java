package com.ibuy.product.demo.repository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByProductId(int productId);

	

	

}
