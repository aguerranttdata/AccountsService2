package com.fasgu.AccountsService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    @Id
    private String id;
    private String client;
    private String type;
    private Double balance;
    private LocalDateTime createdAt;
}
