package com.access.hr.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.ICategorieDao;
import com.access.hr.entities.Categorie;
import com.access.hr.services.ICategorieService;

@Transactional
public class CategorieServiceImpl implements ICategorieService {

	
	private ICategorieDao dao;	
	
	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}

	@Override
	public Categorie save(Categorie entity) {
		return dao.save(entity);
	}

	@Override
	public Categorie update(Categorie entity) {
		return dao.update(entity);
	}

	@Override
	public List<Categorie> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Categorie> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Categorie getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Categorie findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Categorie findOne(String[] paramNames, Object[] paramValue) {
		return dao.findOne(paramNames, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}