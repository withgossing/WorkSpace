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
    private Long pid;

    @Column(length = 8, nullable = false)
    private String transactionDate;
    
    @Column(length = 20, nullable = false)
    private Number transactionAmount;

    @Column(nullable = false)
    private Long accountPid;

    @Builder
    public TransactionDao(String transactionDate, Number transactionAmount, Long accountPid) {
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
        this.accountPid = accountPid;
    }
}
