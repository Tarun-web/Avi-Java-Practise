package com.ecommerce.poc.Ecommercepoc.Services;

import com.ecommerce.poc.Ecommercepoc.Entities.CustomerEntity;
import com.ecommerce.poc.Ecommercepoc.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<CustomerEntity> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Optional<CustomerEntity> getCustomerById(int id) {
        return customerRepository.findById(id);
    }

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return customerRepository.save(customer);
    }

    public CustomerEntity updateCustomer(int id, CustomerEntity updatedCustomer) {
        Optional<CustomerEntity> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()) {
            updatedCustomer.setId(id);
            return customerRepository.save(updatedCustomer);
        }
        return null; // Handle error or throw exception if customer with given id is not found
    }

    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }
}
