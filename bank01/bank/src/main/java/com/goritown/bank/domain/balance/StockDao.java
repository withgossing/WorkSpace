package com.goritown.bank.domain.balance;

import com.goritown.bank.domain.AccountDao;

import lombok.Getter;

@Getter
public class StockDao {
    private Long id;

    private AccountDao account;
    
    private String market;

    private String symbol;

    private Number balance;

}
