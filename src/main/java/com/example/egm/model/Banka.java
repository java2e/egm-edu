package com.example.egm.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Banka {


	@NotNull(message = "ID Bos olamaz!")
	private Long id;

	@Size(min = 7,message = "Minimum 7 karakterli olmak zorundadır!")
	private String name;

	private String branch;

	private String city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
