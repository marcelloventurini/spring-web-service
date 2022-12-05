package com.venturini.springwebservices.config;

import com.venturini.springwebservices.entities.Category;
import com.venturini.springwebservices.entities.Order;
import com.venturini.springwebservices.entities.User;
import com.venturini.springwebservices.entities.enums.OrderStatus;
import com.venturini.springwebservices.repositories.CategoryRepository;
import com.venturini.springwebservices.repositories.OrderRepository;
import com.venturini.springwebservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public void run(String... args) throws Exception {
    User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
    User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

    Order o1 = new Order(null, Instant.parse("2022-06-20T19:22:07Z"), OrderStatus.PAID, u1);
    Order o2 = new Order(null, Instant.parse("2022-07-21T03:33:07Z"), OrderStatus.WAITING_PAYMENT, u2);
    Order o3 = new Order(null, Instant.parse("2022-07-22T15:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);

    Category c1 = new Category(null, "Eletronics");
    Category c2 = new Category(null, "Books");
    Category c3 = new Category(null, "Computers");

    userRepository.saveAll(Arrays.asList(u1, u2));
    orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
  }
}
