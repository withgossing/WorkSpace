package com.goritown.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionEntity {
    private AccountEntity account;

    private String transactionDate;
    private Number serialNumber;
}
