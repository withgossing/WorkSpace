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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 64, nullable = false)
    private String customerId;

    @Column(length = 64, nullable = false)
    private String customerName;

    @Column(length = 64, nullable = false)
    private String customerPassword;

    @Column(length = 64, nullable = false)
    private String customerEmail;

    private String signUpDate;

    @Builder
    public Customer(String customerId, String customerName, String customerPassword, String customerEmail, String signUpDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerPassword = customerPassword;
        this.customerEmail = customerEmail;
        this.signUpDate = signUpDate;
    }
}
