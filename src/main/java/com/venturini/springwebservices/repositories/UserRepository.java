package com.venturini.springwebservices.repositories;

import com.venturini.springwebservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
