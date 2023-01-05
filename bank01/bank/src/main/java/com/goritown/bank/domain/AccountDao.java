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
public class AccountDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(length = 64, nullable = false)
    private String accountName;

    @Column(length = 8, nullable = false)
    private String signUpDate;

    @Column(nullable = false)
    private Long customerPid;

    @Builder
    public AccountDao(String accountName, String signUpDate, Long customerPid) {
        this.accountName = accountName;
        this.signUpDate = signUpDate;
        this.customerPid = customerPid;
    }
}
