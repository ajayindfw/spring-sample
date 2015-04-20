package com.lennox.spring.service;

import java.util.List;

import com.lennox.spring.model.Customer;

public interface CustomerService {
	public List<Customer> findAll();
}