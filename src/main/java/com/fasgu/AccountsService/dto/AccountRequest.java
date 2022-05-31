package com.fasgu.AccountsService.dto;

import com.fasgu.AccountsService.model.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class AccountRequest {
    private String client;
    private String type;

    public Account toModel() {
        return Account.builder()
                .client(this.client)
                .balance(0.0)
                .createdAt(LocalDateTime.now())
                .build();
    }
}
