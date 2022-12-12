package com.gori.bank.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gori.bank.model.UserEntity;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public String index() {
		return "Welcome GORI BANK";
	}

  @GetMapping("/welcome")
  public String welCome() {

    UserEntity userEntity = new UserEntity();
    userEntity.setUserId("withGossing");
    userEntity.setUserName("KO SEUNGYOUN");

    String reValue = userEntity.getUserName();
    System.out.println(reValue);
    
		return reValue;
	}
}