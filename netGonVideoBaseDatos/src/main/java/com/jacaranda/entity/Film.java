package com.jacaranda.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Film extends Product implements Serializable {

	//Variables
	private String duration;
	private String pegy;
	
	
	// Relación con visualizaciones
	@OneToMany(mappedBy="film")
	private List<Visual> visualizaciones;
	
	//Constructores
	public Film() {
		super();
	
	}

	public Film(String title, String description, int agno, Category categorias, String duration, String pegy) {
		super(title, description, agno, categorias);
		this.duration=duration;
		this.pegy=pegy;
	}


	//GET Y SET
	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getPegy() {
		return pegy;
	}

	public void setPegy(String pegy) {
		this.pegy = pegy;
	}
	
}
