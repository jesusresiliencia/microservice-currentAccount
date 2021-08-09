package com.currentAccount.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currentAccount.models.entity.CurrentAccount;
import com.currentAccount.models.repository.CurrentAccountRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

	@Autowired
	private CurrentAccountRepository repository;
	
	@Override
	public Flux<CurrentAccount> getAll() {
		return repository.findAll();
	}

	@Override
	public Mono<CurrentAccount> insert(CurrentAccount currentAccount) {
		return repository.insert(currentAccount);
	}
}
