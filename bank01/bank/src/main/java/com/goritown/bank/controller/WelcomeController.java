package com.goritown.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goritown.bank.domain.CustomerDao;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public CustomerDao welcome() {
        CustomerDao customer = new CustomerDao();

        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerEmail());
        return customer;
    }
}
