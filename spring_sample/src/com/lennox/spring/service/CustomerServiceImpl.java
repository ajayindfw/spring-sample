package com.lennox.spring.service;

import java.util.List;

import com.lennox.spring.repository.CustomerRepository;
import com.lennox.spring.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository customerRepository;
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
