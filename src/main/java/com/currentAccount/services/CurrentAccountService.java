package com.currentAccount.services;

import com.currentAccount.models.entity.CurrentAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrentAccountService {
	 Flux<CurrentAccount> getAll();
     Mono<CurrentAccount>insert(CurrentAccount currentAccount); 
}