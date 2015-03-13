package com.packt.webstore.service.impl;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	public ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.getAllProducts();	
	}

	@Override
	public Product getProductById(String productID) {
		
		return productRepository.getProductById(productID);
	}

	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO implementation of the interface
		return productRepository.getProductsByCategory(category);
	}

	@Override
	public Set<Product> getProductsByFilter(
			Map<String, List<String>> filterParams) {
		// TODO Auto-generated method stub
		return productRepository.getProductsByFilter(filterParams);
		}

	@Override
	public List<Product> getProductsByManufacturer(String manufacturer) {
		// TODO Auto-generated method stub
		
		return productRepository.getProductsByManufacturer(manufacturer);
	}

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		productRepository.addProduct(product);
	}
	
}


