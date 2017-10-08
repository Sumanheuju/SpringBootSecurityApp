package com.vortexnepal.security.springsecuritydbapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.vortexnepal.security.springsecuritydbapp.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{

}
