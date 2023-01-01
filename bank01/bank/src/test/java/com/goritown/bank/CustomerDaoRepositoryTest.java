package com.goritown.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.CustomerDao;
import com.goritown.bank.domain.CustomerDaoRepository;

@SpringBootTest
public class CustomerDaoRepositoryTest {

    @Autowired
    CustomerDaoRepository customerDaoRepository;

    public void cleanup() {
        customerDaoRepository.deleteAll();
    }

    public void loadCustomer() {
        String customerId = "";
        String customerName = "";
        String customerPassword = "";
        String customerEmail = "";
        String signUpDate = "";

        customerDaoRepository.save(CustomerDao.builder()
                                .customerId(customerId)
                                .customerName(customerName)
                                .customerPassword(customerPassword)
                                .customerEmail(customerEmail)
                                .signUpDate(signUpDate)
                                .build());

        List<CustomerDao>customerDaoList = customerDaoRepository.findAll();

        CustomerDao customerDao = customerDaoList.get(0);
    }
}
