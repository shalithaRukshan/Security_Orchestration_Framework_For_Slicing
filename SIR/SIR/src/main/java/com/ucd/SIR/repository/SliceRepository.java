package com.ucd.SIR.repository;

import com.ucd.SIR.entity.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SliceRepository extends JpaRepository<Slice, Long> {
}
