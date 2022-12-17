package com.goritown.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BalanceEntity {
    private AccountEntity account;
    
    private Number balance;
}
