package com.goritown.bank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BalanceEntity {
    private AccountEntity account;
    
    private Number balance;
}
