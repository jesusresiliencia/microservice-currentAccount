package com.currentAccount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currentAccount.models.entity.Transaction;
import com.currentAccount.models.repository.TransactionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TransactionServiceImpl  implements TransactionService {

	@Autowired
	private TransactionRepository repository;
	
	@Override
	public Flux<Transaction> getAll() {
		return repository.findAll();
	}

	@Override
	public Mono<Transaction> insert(Transaction transaction) {
		return repository.insert(transaction);
	}
}
