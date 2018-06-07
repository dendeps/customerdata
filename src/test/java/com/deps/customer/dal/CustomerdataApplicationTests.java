package com.deps.customer.dal;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.deps.customer.dal.entities.Customer;
import com.deps.customer.dal.repos.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerdataApplicationTests {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("John");
		customer.setEmail("john@gmail.com");
		Customer result = customerRepository.save(customer);
		System.out.println(result);
	}
	
	@Test
	public void testFindCustomerById() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}
	
	@Test
	public void testUpdateCustomert() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
		customer.setEmail("johny.walker@gmail.com");
		System.out.println(customer);
		customerRepository.save(customer);
	}
	
	@Test
	public void testDeleteCustomer() {
		customerRepository.deleteById(1l);
	}

}