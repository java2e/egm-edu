package com.example.egm.model;


import javax.validation.constraints.Size;

public class User {

	@Size(min = 5,max = 10,message = "Lütfen 5 ila 10 arasındaki değer giriniz!")
	private String name;

	private String surname;

	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
