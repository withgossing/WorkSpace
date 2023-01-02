package com.goritown.bank;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.TransactionDao;
import com.goritown.bank.domain.TransactionRepository;

@SpringBootTest
public class TransactionRepositoryTest {

    @Autowired
    TransactionRepository transactionRepository;

    @AfterEach
    public void cleanUp() {
        transactionRepository.deleteAll();
    }

    public void loadEntity() {
        String transactionDate = "20230102";
        Number transactionAmount = 0;
        Long accountKey = (long) 0;

        transactionRepository.save(TransactionDao.builder()
                                    .transactionDate(transactionDate)
                                    .transactionAmount(transactionAmount)
                                    .accountKey(accountKey)
                                    .build());

        List<TransactionDao>transactionList = transactionRepository.findAll();

        TransactionDao transactionDao = transactionList.get(0);

        System.out.println(transactionDao);

    }
}
