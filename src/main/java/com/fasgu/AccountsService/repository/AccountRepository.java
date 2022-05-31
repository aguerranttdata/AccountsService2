package com.fasgu.AccountsService.repository;

import com.fasgu.AccountsService.model.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AccountRepository extends ReactiveMongoRepository<Account, String> {
}
