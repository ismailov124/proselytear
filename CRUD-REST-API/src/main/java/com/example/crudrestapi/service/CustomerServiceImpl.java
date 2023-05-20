package com.example.crudrestapi.service;

import com.example.crudrestapi.entity.Customer;
import com.example.crudrestapi.model.CustomerDto;
import com.example.crudrestapi.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Implementations of {@link CustomerService} interface.
 *
 * @version 1.0
 */

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    private final ModelMapper modelMapper;

    public CustomerServiceImpl(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public CustomerDto getById(Long id) {
        Optional<Customer> optional = customerRepository.findById(id);

        return optional.map(item -> modelMapper.map(item, CustomerDto.class))
                .orElse(null);
    //    Optional<Customer> optionalCustomer =
        //Optional
    //    log.info("IN CustomerServiceImpl getById {}", id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
}
