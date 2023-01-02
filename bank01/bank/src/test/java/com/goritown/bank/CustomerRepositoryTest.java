package com.goritown.bank;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.CustomerDao;
import com.goritown.bank.domain.CustomerRepository;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @AfterEach
    public void cleanUp() {
        customerRepository.deleteAll();
    }

    public void loadEntity() {
        String customerId = "goribank";
        String customerName = "GoRi";
        String customerPassword = "bank1234!";
        String customerEmail = "goribank@naver.com";
        String signUpDate = "20230102";

        customerRepository.save(CustomerDao.builder()
                                .customerId(customerId)
                                .customerName(customerName)
                                .customerPassword(customerPassword)
                                .customerEmail(customerEmail)
                                .signUpDate(signUpDate)
                                .build());

        List<CustomerDao>customerList = customerRepository.findAll();

        CustomerDao customerDao = customerList.get(0);

        System.out.println(customerDao);
    }
}
