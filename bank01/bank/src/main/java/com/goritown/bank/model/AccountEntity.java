package com.goritown.bank.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccountEntity {
    private UserEntity user;

    private String accountId;
    private String accountName;
    private String signUpDate;
}
