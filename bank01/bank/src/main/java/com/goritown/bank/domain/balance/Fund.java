package com.goritown.bank.domain.balance;
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
public class Fund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Account account;

    @Column(length = 20, nullable = false)
    private String symbol;

    @Column(length = 20, nullable = false)
    private Number balance;

    @Builder
    public Fund(Account account, String symbol, Number balance) {
        this.account = account;
        this.symbol = symbol;
        this.balance = balance;
    }
}
