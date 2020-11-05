package com.jacaranda.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Serie extends Product implements Serializable{
	
	//Variables
	private String seasson;
	private int chapter;
	
	//Relación con la entidad visual
	@OneToMany(mappedBy="serie")
	private List<Visual> visualizaciones;
	
	//Constructores

	public Serie() {
		super();
		
	}

	public Serie(String title, String description, int agno, Category categorias, String seasson, int chapter) {
		super(title, description, agno, categorias);
		this.seasson = seasson;
		this.chapter = chapter;
	}

	//GET y SET
	public String getSeasson() {
		return seasson;
	}

	public void setSeasson(String seasson) {
		this.seasson = seasson;
	}

	public int getChapter() {
		return chapter;
	}

	public void setChapter(int chapter) {
		this.chapter = chapter;
	}

}
