package com.example.egm.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Sikayet {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String title;

	private String detail;

	private boolean type;

	@OneToOne
	private Kisi kisi;
}
