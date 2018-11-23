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
public class CommandeClient implements Serializable {
	@Id
	@GeneratedValue
	private Long idCmndClient;
	private String code;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCmd;
	@ManyToOne
	@JoinColumn(name = "idClient")
	private Client client;
	
	@OneToMany(mappedBy = "commandeClient")
	private List<LigneCmdClient> ligneCmdClients;

	public Long getIdCmndClient() {
		return idCmndClient;
	}

	public void setIdCmndClient(Long idCmndClient) {
		this.idCmndClient = idCmndClient;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCmdClient> getLigneCmdClients() {
		return ligneCmdClients;
	}

	public void setLigneCmdClients(List<LigneCmdClient> ligneCmdClients) {
		this.ligneCmdClients = ligneCmdClients;
	}

}