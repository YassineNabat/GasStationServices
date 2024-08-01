package com.example.pfe.service;

import com.example.pfe.repository.TransactionRepository;

import com.example.pfe.model.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    private final TransactionRepository TransactionRepository;

    @Autowired
    public TransactionService(TransactionRepository TransactionRepository) {
        this.TransactionRepository = TransactionRepository;
    }

    public Transaction saveTransaction(Transaction transaction) {
        return TransactionRepository.save(transaction);
    }

    public List<Transaction> getAllTransactions() {
        return TransactionRepository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return TransactionRepository.findById(id).orElse(null);
    }

    public void deleteTransaction(Long id) {
        TransactionRepository.deleteById(id);
    }
}


