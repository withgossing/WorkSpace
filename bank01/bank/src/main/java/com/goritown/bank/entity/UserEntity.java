package com.goritown.bank.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserEntity {
    private String userId;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String signUpDate;
}
