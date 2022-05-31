package com.fasgu.AccountsService.serviceimpl;

import com.fasgu.AccountsService.dto.AccountRequest;
import com.fasgu.AccountsService.dto.AccountResponse;
import com.fasgu.AccountsService.repository.AccountRepository;
import com.fasgu.AccountsService.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Flux<AccountResponse> getAll() {
        return accountRepository.findAll().map(AccountResponse::fromModel);
    }

    @Override
    public Mono<AccountResponse> save(AccountRequest accountRequest) {
        return null;
    }
}
