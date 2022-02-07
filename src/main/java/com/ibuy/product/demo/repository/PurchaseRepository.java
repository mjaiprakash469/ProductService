package com.ibuy.product.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibuy.product.demo.entity.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Integer>{

}
