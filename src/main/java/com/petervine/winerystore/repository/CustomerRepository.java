package com.petervine.winerystore.repository;

import com.petervine.winerystore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
