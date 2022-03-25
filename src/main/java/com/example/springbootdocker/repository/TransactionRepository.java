package com.example.springbootdocker.repository;

import com.example.springbootdocker.models.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * *Transaction repository.
 */
@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {

}

