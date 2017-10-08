package com.vortexnepal.security.springsecuritydbapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vortexnepal.security.springsecuritydbapp.model.Product;
import com.vortexnepal.security.springsecuritydbapp.repository.ProductRepository;

@Controller
@RequestMapping(value = "/admin")
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/products")
	public String getAllProductJSP(Model model) {
		model.addAttribute("products", productRepo.findAll());
		return "product/index";
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/getProducts")
	public String getProduct() {
		return "product/addProductPage";
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public @ResponseBody String addProduct(Product product) {
		Product save = productRepo.save(product);
		if(save != null) {
			return "Saved";
		}
		return "Not Saved";
	}
	
}
