package com.access.hr.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@SuppressWarnings("serial")
public class Categorie implements Serializable {
	@Id
	@GeneratedValue
	private Long idCategorie;
	private String code;
	private String designation;
	// une categorie contient plusieur article
	@OneToMany(mappedBy = "categorie")
	private List<Article> articles;

	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Categorie() {
		super();
	}

}