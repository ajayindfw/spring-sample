package com.lennox.spring.repository;

import java.util.List;

import com.lennox.spring.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}