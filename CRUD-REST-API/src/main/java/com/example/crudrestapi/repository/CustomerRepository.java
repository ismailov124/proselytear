package com.example.crudrestapi.repository;

import com.example.crudrestapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 *
 * @version 1.0
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    void delete(Long id);
}
