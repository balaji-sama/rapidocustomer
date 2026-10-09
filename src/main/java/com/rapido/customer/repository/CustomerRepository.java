package com.rapido.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rapido.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
