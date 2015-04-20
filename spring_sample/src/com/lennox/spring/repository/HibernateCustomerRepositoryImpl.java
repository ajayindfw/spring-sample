package com.lennox.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.lennox.spring.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.lennox.spring.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Ajay");
		customer.setLastName("Gupta");
		
		customers.add(customer);
		return customers;
	}
}
