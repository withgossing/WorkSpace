package com.goritown.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.AccountDao;
import com.goritown.bank.domain.AccountDaoRepository;

@SpringBootTest
public class AccountDaoRepositoryTest {
    
    @Autowired
    AccountDaoRepository accountDaoRepository;

    public void cleanup() {
        accountDaoRepository.deleteAll();
    }

    public void loadAccount() {
        String accountName = "";
        String signUpDate = "";
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
