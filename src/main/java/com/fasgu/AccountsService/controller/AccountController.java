package com.fasgu.AccountsService.controller;

import com.fasgu.AccountsService.dto.AccountResponse;
import com.fasgu.AccountsService.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/accounts")
@AllArgsConstructor
public class AccountController {
    @Autowired
    private AccountService accountService;

    @GetMapping
    public Flux<AccountResponse> getAll() {
        return accountService.getAll();
    }
}
