package com.goritown.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goritown.bank.domain.AccountDao;
import com.goritown.bank.domain.AccountRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest {
    
    @Autowired
    AccountRepository accountRepository;

    private AccountDao accountDao;

    @AfterEach
    public void cleanUp() {
        accountRepository.deleteAll();
    }

    @BeforeEach
    public void setUp() {
        String accountName = "1234567801";
        String signUpDate = "20230103";
        Long customerKey = (long) 0;

        accountDao = AccountDao
                        .builder()
                        .accountName(accountName)
                        .signUpDate(signUpDate)
                        .customerKey(customerKey)
                        .build();
    }

    @Test
    public void testSave() {
        System.out.println(">>> SetUp accountDao: " + accountDao.toString());

        // given
        String accountName = "1234567801";
        String signUpDate = "20230103";
        Long customerKey = (long) 0;

        accountDao = AccountDao
                        .builder()
                        .accountName(accountName)
                        .signUpDate(signUpDate)
                        .customerKey(customerKey)
                        .build();

        System.out.println(">>> Origin accountDao: " + accountDao.toString());

        // when
        AccountDao savedAccountDao = accountRepository.save(accountDao);
        System.out.println(">>> Saved accountDao: " + savedAccountDao);

        // then
        assertThat(savedAccountDao.getKey()).isNotNull();
        assertThat(savedAccountDao.getAccountName()).isEqualTo("1234567801");
        assertThat(savedAccountDao.getSignUpDate()).isEqualTo("20230103");
    }
}
