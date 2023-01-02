package com.goritown.bank.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionDao, Long> {
    
}