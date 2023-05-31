package com.example.egm.controller;

import com.example.egm.model.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("user")
public class UserController {


	@GetMapping("/info") // localhost:8080/user/info => user json datasını donemsını
	public User getInfo() {

		User user = new User();
		user.setEmail("a@egm.org.tr");
		user.setName("Java");
		user.setSurname("Developer");

		return user;

	}


	@PostMapping("/create")
	public User createUser(@Valid @RequestBody User user) {

		return user;
	}
	@GetMapping("/query")
	public User getUserWithQuery(@RequestParam(value = "name",defaultValue = "EGM") String name,
								 @RequestParam(value = "surname",required = false) String surname) {

		User user = new User();
		user.setName(name);
		user.setSurname(surname);
		return user;
	}

}
