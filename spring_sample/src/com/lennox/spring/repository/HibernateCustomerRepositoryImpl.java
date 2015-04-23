package com.lennox.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.lennox.spring.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	/* (non-Javadoc)
	 * @see com.lennox.spring.repository.CustomerRepository#findAll()
	 */
	
	@Value("${someProperty}")
	private String name;
	
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName(name);
		customer.setLastName("Gupta");
		
		customers.add(customer);
		return customers;
	}
}
