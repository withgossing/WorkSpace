package com.goritown.bank.domain;

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
public class TransactionDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private AccountDao account;

    @Column(nullable = false)
    private String transactionDate;
    
    @Column(nullable = false)
    private Number transactionAmount;

    @Builder
    public TransactionDao(AccountDao account, String transactionDate, Number transactionAmount) {
        this.account = account;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }
}
