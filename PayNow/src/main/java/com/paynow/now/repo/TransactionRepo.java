package com.paynow.now.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paynow.now.model.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction, String>{

}
