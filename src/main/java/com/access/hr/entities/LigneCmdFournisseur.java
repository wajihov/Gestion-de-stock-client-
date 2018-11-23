package com.access.hr.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class LigneCmdFournisseur implements Serializable {
	@Id
	@GeneratedValue
	private Long idLigneCmdFournisseur;
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	@ManyToOne
	@JoinColumn(name = "idCmdFournisseur")
	private CommandeFournisseur commandeFournisseurs;

	public Long getIdLigneCmdFournisseur() {
		return idLigneCmdFournisseur;
	}

	public void setIdLigneCmdFournisseur(Long idLigneCmdFournisseur) {
		this.idLigneCmdFournisseur = idLigneCmdFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseurs() {
		return commandeFournisseurs;
	}

	public void setCommandeFournisseurs(CommandeFournisseur commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}

}