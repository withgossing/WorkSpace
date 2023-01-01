package com.goritown.bank;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.AccountDao;
import com.goritown.bank.domain.AccountDaoRepository;

@SpringBootTest
public class AccountDaoRepositoryTest {
    
    @Autowired
    AccountDaoRepository accountDaoRepository;

    @AfterEach
    public void cleanUp() {
        accountDaoRepository.deleteAll();
    }

    @Test
    public void loadEntity() {
        String accountName = "1234567801";
        String signUpDate = "20230102";
        Long customerKey = (long) 0;

        accountDaoRepository.save(AccountDao.builder()
                                .accountName(accountName)
                                .signUpDate(signUpDate)
                                .customerKey(customerKey)
                                .build());

        List<AccountDao>accountDaoList = accountDaoRepository.findAll();

        AccountDao accountDao = accountDaoList.get(0);

        System.out.println(accountDao);
    }
}
