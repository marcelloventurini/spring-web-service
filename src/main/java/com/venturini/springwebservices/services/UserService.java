package com.venturini.springwebservices.services;

import com.venturini.springwebservices.entities.User;
import com.venturini.springwebservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public User findById(Long id) {
    Optional<User> object = userRepository.findById(id);

    return object.get();
  }
}
