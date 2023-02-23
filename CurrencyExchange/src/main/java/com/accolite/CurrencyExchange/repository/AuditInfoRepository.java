package com.accolite.CurrencyExchange.repository;

import com.accolite.CurrencyExchange.model.AuditInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditInfoRepository extends JpaRepository<AuditInfo,Integer> {
}
