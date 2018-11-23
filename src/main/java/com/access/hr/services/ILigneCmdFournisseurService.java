package com.access.hr.services;

import java.util.List;

import com.access.hr.entities.LigneCmdFournisseur;

public interface ILigneCmdFournisseurService {

	public LigneCmdFournisseur save(LigneCmdFournisseur entity);

	public LigneCmdFournisseur update(LigneCmdFournisseur entity);

	public List<LigneCmdFournisseur> selectAll();

	public List<LigneCmdFournisseur> selectAll(String sortField, String sort);

	public LigneCmdFournisseur getById(Long id);

	public void remove(Long id);

	public LigneCmdFournisseur findOne(String paramName, Object paramValue);

	public LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValue);

	public int findCountBy(String paramName, Object paramValue);

}
