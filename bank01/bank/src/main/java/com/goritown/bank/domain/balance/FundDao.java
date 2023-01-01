package com.goritown.bank.domain.balance;
import com.goritown.bank.domain.AccountDao;

import lombok.Getter;

@Getter
public class FundDao {
    private Long id;
    
    private AccountDao account;

    private String symbol;

    private Number balance;
}
