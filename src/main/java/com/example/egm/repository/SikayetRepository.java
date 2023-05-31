package com.example.egm.repository;

import com.example.egm.model.Sikayet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SikayetRepository extends JpaRepository<Sikayet,Long> {
}
