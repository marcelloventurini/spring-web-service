package com.venturini.springwebservices.services;

import com.venturini.springwebservices.entities.Product;
import com.venturini.springwebservices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
  @Autowired
  ProductRepository productRepository;

  public List<Product> findAll() {
    return productRepository.findAll();
  }

  public Product findById(Long id) {
    Optional<Product> object = productRepository.findById(id);
    return object.get();
  }
}
