package com.parkauto.rest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VEHICULE")
public class Vehicule {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDVEHICULE")
	private Long matricule;
	
	@Column(name = "ANNEEMODEL")
	private Long anneeModel;
	
	@Column(name = "PRIX")
	private Long prix;
	
	

}
