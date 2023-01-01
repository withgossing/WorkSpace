package com.goritown.bank.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionDaoRepository extends JpaRepository<TransactionDao, Long> {
    
}