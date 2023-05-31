package com.example.egm.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Kisi {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String surname;

	private String telephone;

	private String email;
}
