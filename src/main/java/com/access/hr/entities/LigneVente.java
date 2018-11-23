package com.access.hr.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class LigneVente implements Serializable {
	@Id
	@GeneratedValue
	private Long idLigneVente;
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name="idVente")
	private Vente vente;

	public Long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

}