package com.packt.webstore.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.service.OrderService;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;


@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private ProductRepository productRepository;

	public void processOrder(String productId, long count) {
		// TODO Auto-generated method stub
		Product productById = productRepository.getProductById(productId);
		if(productById.getUnitsInStock()<count){
			throw new IllegalArgumentException("Out of Stock. Available Units in stock"+ productById.getUnitsInStock());
		}
		
		productById.setUnitsInStock(productById.getUnitsInStock()-count);
	}

	
	
}
