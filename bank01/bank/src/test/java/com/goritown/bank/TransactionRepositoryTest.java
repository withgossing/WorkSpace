package com.goritown.bank;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.goritown.bank.domain.TransactionDao;
import com.goritown.bank.domain.TransactionRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionRepositoryTest {

    @Autowired
    TransactionRepository transactionRepository;

    private TransactionDao transactionDao;

    @AfterEach
    public void cleanUp() {
        transactionRepository.deleteAll();
    }

    @BeforeEach
    public void setUp() {
        String transactionDate = "20230103";
        Number transactionAmount = 0;
        Long accountKey = (long) 0;

        transactionDao = TransactionDao
                            .builder()
                            .transactionDate(transactionDate)
                            .transactionAmount(transactionAmount)
                            .accountKey(accountKey)
                            .build();
    }

    @Test
    public void testSave() {
        System.out.println(">>> SetUp transactionDao: " + transactionDao.toString());

        // givn
        String transactionDate = "20230103";
        Number transactionAmount = 100;
        Long accountKey = (long) 0;

        transactionRepository.save(TransactionDao.builder()
                                    .transactionDate(transactionDate)
                                    .transactionAmount(transactionAmount)
                                    .accountKey(accountKey)
                                    .build());

        System.out.println(">>> Origin transactionDao: " + transactionDao.toString());

        // when
        TransactionDao savedTransactionDao = transactionRepository.save(transactionDao);
        System.out.println(">>> Saved transactionDao: " + savedTransactionDao);

        // when
        assertThat(savedTransactionDao.getKey()).isNotNull();
        assertThat(savedTransactionDao.getTransactionDate()).isEqualTo("20230103");
        assertThat(savedTransactionDao.getTransactionAmount()).isEqualTo(100);
    }
}
