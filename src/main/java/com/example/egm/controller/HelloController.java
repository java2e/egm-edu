package com.example.egm.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("egm") // localhost:8080/egm
public class HelloController {

	@GetMapping("/hello/{userId}") // localhost:8080/egm/hello/123
	public String getHello(@PathVariable("userId") String userId) {
		return "called get method => GELEN USER ID :"+userId;
	}

	@PostMapping("/hello") // localhost:8080/egm/hello
	public String getPostHello() {
		return "called post method";
	}

	@PutMapping("/hello") // localhost:8080/egm/hello
	public String getPutHello() {
		return "called put method";
	}

	@DeleteMapping("/hello") // localhost:8080/egm/hello
	public String getDeleteHello() {
		return "called delete method";
	}




}
