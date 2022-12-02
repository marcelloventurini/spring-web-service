package com.venturini.springwebservices.repositories;

import com.venturini.springwebservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
