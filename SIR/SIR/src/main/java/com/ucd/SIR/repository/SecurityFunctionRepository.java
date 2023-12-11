package com.ucd.SIR.repository;

import com.ucd.SIR.entity.SecurityFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityFunctionRepository extends JpaRepository<SecurityFunction, Long> {
}
