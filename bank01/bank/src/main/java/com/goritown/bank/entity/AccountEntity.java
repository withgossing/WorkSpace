package com.goritown.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountEntity {
    private UserEntity user;

    private String accountId;
    private String accountName;
    private String signUpDate;
}
