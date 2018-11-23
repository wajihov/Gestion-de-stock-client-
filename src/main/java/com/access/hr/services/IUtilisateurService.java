package com.access.hr.services;

import java.util.List;

import com.access.hr.entities.Utilisateur;

public interface IUtilisateurService {

	public Utilisateur save(Utilisateur entity);

	public Utilisateur update(Utilisateur entity);

	public List<Utilisateur> selectAll();

	public List<Utilisateur> selectAll(String sortField, String sort);

	public Utilisateur getById(Long id);

	public void remove(Long id);

	public Utilisateur findOne(String paramName, Object paramValue);

	public Utilisateur findOne(String[] paramNames, Object[] paramValue);

	public int findCountBy(String paramName, Object paramValue);

}