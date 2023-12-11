package com.ucd.SIR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttackHistoryRepository extends JpaRepository<AttackHistoryRepository, Long> {
}
