package com.currentAccount.models.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.currentAccount.models.entity.CurrentAccount;

@Repository
public interface CurrentAccountRepository extends ReactiveMongoRepository<CurrentAccount, String>{

}
