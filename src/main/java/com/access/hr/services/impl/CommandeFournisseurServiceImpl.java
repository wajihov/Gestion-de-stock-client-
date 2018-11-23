package com.access.hr.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.ICommandeFournisseurDao;
import com.access.hr.entities.CommandeFournisseur;
import com.access.hr.services.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService {

	private ICommandeFournisseurDao dao;

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournisseur save(CommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValue) {
		return dao.findOne(paramNames, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}