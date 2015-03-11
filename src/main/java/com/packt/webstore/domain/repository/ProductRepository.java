package com.packt.webstore.domain.repository;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.packt.webstore.domain.*;

public interface ProductRepository {
	List <Product> getAllProducts();
	List<Product> getProductsByCategory(String category);
	Product getProductById(String productID);
	Set<Product> getProductsByFilter(Map<String, List<String>> filterParams);
	List<Product> getProductsByManufacturer(String manufacturer);
	
}

