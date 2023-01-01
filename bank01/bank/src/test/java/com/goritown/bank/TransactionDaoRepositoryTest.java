package com.goritown.bank;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.TransactionDao;
import com.goritown.bank.domain.TransactionDaoRepository;

@SpringBootTest
public class TransactionDaoRepositoryTest {

    @Autowired
    TransactionDaoRepository transactionDaoRepository;

    @AfterEach
    public void cleanUp() {
        transactionDaoRepository.deleteAll();
    }

    public void loadEntity() {
        String transactionDate = "20230102";
        Number transactionAmount = 0;
        Long accountKey = (long) 0;

        transactionDaoRepository.save(TransactionDao.builder()
                                    .transactionDate(transactionDate)
                                    .transactionAmount(transactionAmount)
                                    .accountKey(accountKey)
                                    .build());

        List<TransactionDao>transactionDaoList = transactionDaoRepository.findAll();

        TransactionDao transactionDao = transactionDaoList.get(0);

        System.out.println(transactionDao);

    }
}
