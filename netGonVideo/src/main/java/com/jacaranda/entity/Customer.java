package com.jacaranda.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Comparable<Customer>,Serializable {
	//Variables
	private static int idGeneral = 1;
	private int id;
	private String name;
	private String surnames;
	private LocalDate birthDate;
	private String dni;
	private List<Visual> visualizaciones;
	
	//Constructores
	public Customer() {
		super();
		visualizaciones = new ArrayList<Visual>();
		id = idGeneral++;
	}


	public Customer(String name, String surnames, LocalDate birthDate, String dni) {
		super();
		this.name = name;
		this.surnames = surnames;
		this.birthDate = birthDate;
		this.dni = dni;
		visualizaciones = new ArrayList<Visual>();
		id = idGeneral++;
	}

//GET y SET
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurnames() {
		return surnames;
	}


	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public String getDni() {
		return dni;
	}



	public List<Visual> getVisualizaciones() {
		return visualizaciones;
	}
	
	//ComparaTo
	@Override
	public int compareTo(Customer other) {
	
		return Integer.valueOf(getId()).compareTo(getId());
	}
	
}
