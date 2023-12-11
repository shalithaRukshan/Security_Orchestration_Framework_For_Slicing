package com.ucd.SIR.repository;

import com.ucd.SIR.entity.Sla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlaRepository extends JpaRepository <Sla, Long>{
}
