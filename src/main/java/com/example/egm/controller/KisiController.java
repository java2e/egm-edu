package com.example.egm.controller;


import com.example.egm.exception.MyException;
import com.example.egm.model.Kisi;
import com.example.egm.model.Sikayet;
import com.example.egm.repository.KisiRepository;
import com.example.egm.repository.SikayetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@RequestMapping("kisi")
public class KisiController {

	@Autowired
	private KisiRepository kisiRepository;

	@Autowired
	private SikayetRepository sikayetRepository;

	@PostMapping("/create")
	public ResponseEntity<?> create(@RequestBody Kisi kisi) {

		kisiRepository.save(kisi);

		return ResponseEntity.ok(kisi);
	}

	@PostMapping("/sikayet/{kisiId}")
	public ResponseEntity<?> createSikayet(@RequestBody Sikayet sikayet, @PathVariable("kisiId") Long kisiId) {
		/*
		Kisiye ihtiyac
		 */

		Optional<Kisi> kisi = kisiRepository.findById(kisiId);

		if(kisi.isPresent()){
			sikayet.setKisi(kisi.get());
			sikayetRepository.save(sikayet);
			return ResponseEntity.ok(sikayet);
		}
		else {
			throw new MyException("Kisi bulunamadı!");
		}

	}

}
