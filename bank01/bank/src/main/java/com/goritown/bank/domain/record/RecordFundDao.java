package com.goritown.bank.domain.record;
import com.goritown.bank.domain.AccountDao;

import lombok.Getter;

@Getter
public class RecordFundDao {
    private Long id;
    
    private String recordDate;

    private AccountDao account;

    private String symbol;

    private Number balance;
}
