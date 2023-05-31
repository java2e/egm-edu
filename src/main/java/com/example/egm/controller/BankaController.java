package com.example.egm.controller;


import com.example.egm.model.Banka;
import com.example.egm.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("banka")
public class BankaController {


	@PostMapping(value = "/create")
	public ResponseEntity<?> create(@Valid @RequestBody Banka banka) {

		System.out.println("Banka kaydedildi");

		return ResponseEntity.ok(banka);
	}

	@PutMapping("/update")
	public Banka update(@Valid @RequestBody Banka banka) {
		System.out.println("Banka güncelledi");

		return banka;
	}


	@GetMapping(value = "/info",produces = { MediaType.APPLICATION_JSON_VALUE,
			MediaType.APPLICATION_XML_VALUE, MediaType.TEXT_XML_VALUE })
	public User getBanka() {
		User user = new User();
		user.setEmail("a@egm.org.tr");
		user.setName("Java");
		user.setSurname("Developer");

		return user;
	}

}
