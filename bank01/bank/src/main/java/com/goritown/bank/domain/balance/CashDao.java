package com.goritown.bank.domain.balance;
import com.goritown.bank.domain.AccountDao;

import lombok.Getter;

@Getter
public class CashDao {
    private Long id;

    private AccountDao account;
    
    private String currency;

    private Number balance;
}
