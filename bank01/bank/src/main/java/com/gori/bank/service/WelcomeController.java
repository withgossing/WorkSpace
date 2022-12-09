package com.gori.bank.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

  @GetMapping("/")
  public String index() {
		return "Welcome GORI BANK";
	}

  @GetMapping("/welcome")
  public String welCome() {
		return "WELCOME";
	}
}