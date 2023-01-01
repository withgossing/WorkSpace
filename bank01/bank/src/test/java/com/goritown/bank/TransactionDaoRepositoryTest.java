package com.goritown.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.goritown.bank.domain.TransactionDao;
import com.goritown.bank.domain.TransactionDaoRepository;

@SpringBootTest
public class TransactionDaoRepositoryTest {

    @Autowired
    TransactionDaoRepository transactionDaoRepository;

    public void cleanup() {
        transactionDaoRepository.deleteAll();
    }

    public void loadTransaction() {
        String transactionDate = "";
        Number transactionAmount = 0;
        Long accountKey = (long) 0;

        transactionDaoRepository.save(TransactionDao.builder()
                                    .transactionDate(transactionDate)
                                    .transactionAmount(transactionAmount)
                                    .accountKey(accountKey)
                                    .build());

        List<TransactionDao>transactionDaoList = transactionDaoRepository.findAll();

        TransactionDao transactionDao = transactionDaoList.get(0);

    }
}
