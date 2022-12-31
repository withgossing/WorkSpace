package com.goritown.bank.domain.record;

import com.goritown.bank.domain.AccountDao;

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
public class RecordCashDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(length = 8, nullable = false)
    private String recordDate;

    private AccountDao account;
    
    @Column(length = 3, nullable = false)
    private String currency;

    @Column(length = 20, nullable = false)
    private Number balance;

    @Builder
    public RecordCashDao(String recordDate, AccountDao account, String currency, Number balance) {
        this.recordDate = recordDate;
        this.account = account;
        this.currency = currency;
        this.balance = balance;
    }
}
