package com.ibuy.product.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import java.util.List;

import com.ibuy.product.demo.entity.Product;
import com.ibuy.product.demo.entity.Purchase;
import com.ibuy.product.demo.exception.PurchaseItenNotFoundException;
import com.ibuy.product.demo.repository.ProductRepository;
import com.ibuy.product.demo.repository.PurchaseRepository;
import com.ibuy.product.demo.service.PurchaseService;

public class PurchaseServiceImpl implements PurchaseService {

	
	@Autowired
	PurchaseRepository purchaseRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	
	@Override
	public List<Purchase> getPurchaseHistory(int pageSize) throws PurchaseItenNotFoundException{
		int pageNumber =0;
		Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by(Direction.DESC, "purchaseId"));
		List<Purchase> getPurchaseList = purchaseRepository.findAll(pageable).getContent();
		//getPurchaseList.forEach(System.out::println);
		if(getPurchaseList.isEmpty()) {
			throw new PurchaseItenNotFoundException("Purchase items not ");
		}
			for(Purchase pr :getPurchaseList) {
				Product na  = productRepository.findByProductId(pr.getProductId());
				pr.setProductName(na.getProductName());
			}
			return getPurchaseList;
	}

}
