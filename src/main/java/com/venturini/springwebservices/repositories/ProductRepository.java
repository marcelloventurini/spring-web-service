package com.venturini.springwebservices.repositories;

import com.venturini.springwebservices.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
