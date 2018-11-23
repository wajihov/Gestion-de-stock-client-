package com.access.hr.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ARTICLE")
@SuppressWarnings("serial")
public class Article implements Serializable {

	@Id
	@GeneratedValue
	private Long idArticle;
	private String codeArticle;
	private String designation;
	private BigDecimal prixUnitaireHT;
	private BigDecimal tauxTVA;
	private BigDecimal prixYnitaireTTC;
	private String photo;
	// un article appartient a un seul categorie
	// ds une categorie contient plusieur articles
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private Categorie categorie;

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTVA() {
		return tauxTVA;
	}

	public void setTauxTVA(BigDecimal tauxTVA) {
		this.tauxTVA = tauxTVA;
	}

	public BigDecimal getPrixYnitaireTTC() {
		return prixYnitaireTTC;
	}

	public void setPrixYnitaireTTC(BigDecimal prixYnitaireTTC) {
		this.prixYnitaireTTC = prixYnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Article() {
		super();
	}

}