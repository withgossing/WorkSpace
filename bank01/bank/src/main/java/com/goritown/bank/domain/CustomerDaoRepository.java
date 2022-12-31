package com.goritown.bank.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDaoRepository extends JpaRepository<CustomerDao, Long> {
    
}
