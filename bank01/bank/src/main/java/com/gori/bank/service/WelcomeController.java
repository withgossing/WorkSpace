package com.gori.bank.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gori.bank.entity.UserEntity;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String index() {
        return "Welcome GORI BANK";
    }

    @GetMapping("/welcome")
    public UserEntity welCome() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId("withGossing");
        userEntity.setUserName("KO SEUNGYOUN");
        userEntity.setUserEmail("withgossing@naver.com");

        System.out.println(userEntity.getUserId());
        System.out.println(userEntity.getUserName());
        System.out.println(userEntity.getUserEmail());
        return userEntity;
    }
}
