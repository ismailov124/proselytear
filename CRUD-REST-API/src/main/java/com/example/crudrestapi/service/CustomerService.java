package com.example.crudrestapi.service;

import com.example.crudrestapi.entity.Customer;
import com.example.crudrestapi.model.CustomerDto;

import java.util.List;

/**
 * Service interface for {@link Customer} class.
 *
 * @version 1.0
 */

public interface CustomerService {

    CustomerDto getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
