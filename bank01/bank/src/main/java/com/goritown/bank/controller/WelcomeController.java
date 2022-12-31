package com.goritown.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goritown.bank.domain.Customer;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public Customer welcome() {
        Customer customer = new Customer();

        System.out.println(customer.getCustomerId());
        System.out.println(customer.getCustomerName());
        System.out.println(customer.getCustomerEmail());
        return customer;
    }
}
