package com.example.egm.repository;

import com.example.egm.model.Kisi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KisiRepository extends JpaRepository<Kisi,Long> {

	List<Kisi> findAllByNameOrderByDesc(String name); // select * from kisi where name = ?

	@Query(value = "Select * from kisi",nativeQuery = true)
	Object getKisi();
}
