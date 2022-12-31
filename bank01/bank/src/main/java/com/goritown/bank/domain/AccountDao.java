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
    private Long id;

    @Column(length = 128)
    private String accountName;

    @Column(length = 8)
    private String signUpDate;

    private CustomerDao customer;

    @Builder
    public AccountDao(String accountName, String signUpDate, CustomerDao customer) {
        this.accountName = accountName;
        this.signUpDate = signUpDate;
        this.customer = customer;
    }
}
