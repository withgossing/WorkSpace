package com.goritown.bank.domain.record;
import com.goritown.bank.domain.Account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 8, nullable = false)
    private String recordDate;
    
    private Account account;
    
    @Column(nullable = false)
    private String market;

    @Column(length = 20, nullable = false)
    private String symbol;

    @Column(length = 20, nullable = false)
    private Number balance;

    @Builder
    public Stock(String recordDate, Account account, String market, String symbol, Number balance) {
        this.recordDate = recordDate;
        this.account = account;
        this.market = market;
        this.symbol = symbol;
        this.balance = balance;
    }
}
