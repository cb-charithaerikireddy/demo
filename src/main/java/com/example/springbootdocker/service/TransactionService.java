package com.example.springbootdocker.service;
import java.util.Optional;

import com.example.springbootdocker.models.Transaction;
import com.example.springbootdocker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class TransactionService {

	@Autowired
	TransactionRepository transactionRepository;

	public void saveTransaction(Transaction transaction) {
		transactionRepository.save(transaction);
	}

	public Iterable<Transaction> getTransactionHistory() {
		return transactionRepository.findAll();
	}

	public Optional<Transaction> getTransaction(Long id) {
		return transactionRepository.findById(id);
	}
}
