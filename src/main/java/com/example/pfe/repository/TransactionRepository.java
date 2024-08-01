package com.example.pfe.repository;

import com.example.pfe.model.Transaction;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "Transaction ")
public interface TransactionRepository extends JpaRepository <Transaction, Long>{
    ///
}
