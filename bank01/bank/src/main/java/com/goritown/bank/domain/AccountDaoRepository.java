package com.goritown.bank.domain;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDaoRepository extends JpaRepository<AccountDao, Long>{
    
}
