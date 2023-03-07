package com.microservices.course.customer.repository;

import com.microservices.course.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for entity: Customer.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
