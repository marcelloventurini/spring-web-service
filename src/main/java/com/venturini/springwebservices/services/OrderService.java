package com.venturini.springwebservices.services;

import com.venturini.springwebservices.entities.Order;
import com.venturini.springwebservices.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
  @Autowired
  private OrderRepository orderRepository;

  public List<Order> findAll() {
    return orderRepository.findAll();
  }

  public Order findById(Long id) {
    Optional<Order> object = orderRepository.findById(id);
    return object.get();
  }
}
