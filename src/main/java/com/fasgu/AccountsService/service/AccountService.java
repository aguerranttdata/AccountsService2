package com.fasgu.AccountsService.service;

import com.fasgu.AccountsService.dto.AccountRequest;
import com.fasgu.AccountsService.dto.AccountResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AccountService {
    Flux<AccountResponse> getAll();

    Mono<AccountResponse> save(AccountRequest accountRequest);
}
