package com.example.pfe.repository;
import com.example.pfe.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pfe.model.Customer;
import com.example.pfe.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Customer")
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
