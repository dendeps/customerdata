package com.deps.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.deps.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
