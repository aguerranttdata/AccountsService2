package com.fasgu.AccountsService.dto;

import com.fasgu.AccountsService.model.Account;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    private String id;
    private String client;
    private String type;
    private Double balance;
    private LocalDateTime createdAt;

    public static AccountResponse fromModel(Account account) {
        return AccountResponse.builder()
                .id(account.getId())
                .client(account.getClient())
                .type(account.getType())
                .balance(account.getBalance())
                .createdAt(account.getCreatedAt())
                .build();
    }
}
