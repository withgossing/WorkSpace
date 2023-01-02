package com.goritown.bank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.AccountDao;
import com.goritown.bank.domain.AccountRepository;

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
        String signUpDate = "20230102";
        Long customerKey = (long) 0;

        accountDao = AccountDao
                        .builder()
                        .accountName(accountName)
                        .signUpDate(signUpDate)
                        .customerKey(customerKey)
                        .build();
    }

    public void testSave() {
        System.out.println(">>> SetUp accountDao: " + accountDao.toString());

        // given
        String accountName = "1234567801";
        String signUpDate = "20230102";
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
        // assertThat()
        // assertThat(savedAccountDao.getKey()).isNotNull();
        // assertThat(savedAccountDao.getAccountName().isEqualTo();
        //  getOrderCode()).isEqualTo(randomCode);
        // assertThat(savedAccountDao.getOrderUsername()).isEqualTo("test_user");
        // assertThat(savedAccountDao.getShopName()).isEqualTo("test_shop");
        // assertThat(savedAccountDao.getId()).isGreaterThan(0);
    }
}
