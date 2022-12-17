package com.goritown.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goritown.bank.entity.UserEntity;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public UserEntity welcome() {
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
