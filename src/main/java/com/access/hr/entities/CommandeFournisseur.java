package com.access.hr.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
public class CommandeFournisseur implements Serializable {
	@Id
	@GeneratedValue
	private Long idCmdFournisseur;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCmd;
	@ManyToOne
	@JoinColumn(name = "idFournisseur")
	private Fournisseur fournisseur;

	@OneToMany(mappedBy = "commandeFournisseurs")
	private List<LigneCmdFournisseur> ligneCmdFournisseurs;

	public Long getIdCmdFournisseur() {
		return idCmdFournisseur;
	}

	public void setIdCmdFournisseur(Long idCmdFournisseur) {
		this.idCmdFournisseur = idCmdFournisseur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCmd() {
		return dateCmd;
	}

	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCmdFournisseur> getLigneCmdFournisseurs() {
		return ligneCmdFournisseurs;
	}

	public void setLigneCmdFournisseurs(List<LigneCmdFournisseur> ligneCmdFournisseurs) {
		this.ligneCmdFournisseurs = ligneCmdFournisseurs;
	}

}