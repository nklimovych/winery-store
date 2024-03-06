package com.petervine.winerystore.repository;

import com.petervine.winerystore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
