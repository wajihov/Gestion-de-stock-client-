package com.access.hr.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.ILigneCmdFournisseurDao;
import com.access.hr.services.ILigneCmdFournisseurService;

@Transactional
public class LigneCmdFournisseurServiceImpl implements ILigneCmdFournisseurService {

	private ILigneCmdFournisseurDao dao;

	public void setDao(ILigneCmdFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public com.access.hr.entities.LigneCmdFournisseur save(com.access.hr.entities.LigneCmdFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public com.access.hr.entities.LigneCmdFournisseur update(com.access.hr.entities.LigneCmdFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<com.access.hr.entities.LigneCmdFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<com.access.hr.entities.LigneCmdFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public com.access.hr.entities.LigneCmdFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public com.access.hr.entities.LigneCmdFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public com.access.hr.entities.LigneCmdFournisseur findOne(String[] paramNames, Object[] paramValue) {
		return dao.findOne(paramNames, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}