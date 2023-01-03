package com.goritown.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goritown.bank.domain.CustomerDao;
import com.goritown.bank.domain.CustomerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    private CustomerDao customerDao;

    @AfterEach
    public void cleanUp() {
        customerRepository.deleteAll();
    }

    @BeforeEach
    public void setUp() {
        String customerId = "goribank";
        String customerName = "GoRi";
        String customerPassword = "bank1234!";
        String customerEmail = "goribank@naver.com";
        String signUpDate = "20230102";

        customerDao = CustomerDao
                        .builder()
                        .customerId(customerId)
                        .customerName(customerName)
                        .customerPassword(customerPassword)
                        .customerEmail(customerEmail)
                        .signUpDate(signUpDate)
                        .build();
    }

    @Test
    public void testSave() {
        System.out.println(">>> SetUp customerDao: " + customerDao.toString());

        // given
        String customerId = "goribank";
        String customerName = "GoRi";
        String customerPassword = "bank1234!";
        String customerEmail = "goribank@naver.com";
        String signUpDate = "20230103";

        customerRepository.save(CustomerDao.builder()
                                .customerId(customerId)
                                .customerName(customerName)
                                .customerPassword(customerPassword)
                                .customerEmail(customerEmail)
                                .signUpDate(signUpDate)
                                .build());

        System.out.println(">>> Origin customerDao: " + customerDao.toString());

        // when
        CustomerDao savedCustomerDao = customerRepository.save(customerDao);
        System.out.println(">>> Saved customerDao: " + savedCustomerDao);

        // then
        assertThat(savedCustomerDao.getKey()).isNotNull();
        assertThat(savedCustomerDao.getCustomerId()).isEqualTo("goribank");
        assertThat(savedCustomerDao.getCustomerName()).isEqualTo("GoRi");
        assertThat(savedCustomerDao.getCustomerPassword()).isEqualTo("bank1234");
        assertThat(savedCustomerDao.getCustomerEmail()).isEqualTo("goribank@naver.com");
        assertThat(savedCustomerDao.getSignUpDate()).isEqualTo("20230103");
    }
}
