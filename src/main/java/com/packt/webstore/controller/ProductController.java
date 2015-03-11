package com.packt.webstore.controller;
//import java.math.BigDecimal;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;





import org.springframework.web.bind.annotation.RequestParam;




import com.packt.webstore.domain.Product;
//import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	//private ProductRepository productRepository;
		@RequestMapping
		public String list(Model model){
			model.addAttribute("products",productService.getAllProducts());
			return "products";
		}
		@RequestMapping("/all")
		public String allProducts(Model model){
			model.addAttribute("products",productService.getAllProducts());
			return "products";
		}
		@RequestMapping("/{category}")
		public String getProductsByCategory(Model model, @PathVariable("category") String productCategory){
			model.addAttribute("products", productService.getProductsByCategory(productCategory));
			return "products";
		}
		@RequestMapping("/filter/{ByCriteria}")
		public String getProductsByFilter(@MatrixVariable(pathVar ="ByCriteria") Map<String, List<String>> filterParams, Model model){
			model.addAttribute("products", productService.getProductsByFilter(filterParams));
			return "products";
		}
		@RequestMapping("/product")
		public String getProductById(@RequestParam("id") String productId, Model model){
			model.addAttribute("product", productService.getProductById(productId));
			return "product";
		}
		@RequestMapping("/{category}/price/{ByCriteria}")
		public String filterProducts(@PathVariable("category") String productCategory, 
				@MatrixVariable(pathVar="ByCriteria") Map<String, List<String>> filterParams,
				@RequestParam("manufacturer") String productmanufacturer, Model model){
			Set<Product> productres = new HashSet<Product>();
			productres.addAll(productService.getProductsByCategory(productCategory));
			productres.addAll(productService.getProductsByFilter(filterParams));
			productres.addAll(productService.getProductsByManufacturer(productmanufacturer));
					
			model.addAttribute("products", productres);
			
			return "products";
		}
		
}

