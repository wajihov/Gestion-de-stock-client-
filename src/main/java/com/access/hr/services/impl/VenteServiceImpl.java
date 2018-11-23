package com.access.hr.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.IVenteDao;
import com.access.hr.entities.Vente;
import com.access.hr.services.IVenteService;
@Transactional
public class VenteServiceImpl implements IVenteService {

	private IVenteDao dao;
	
	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}
	
	@Override
	public Vente save(Vente entity) {
		return dao.save(entity);
	}

	@Override
	public Vente update(Vente entity) {
		return dao.update(entity);
	}

	@Override
	public List<Vente> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Vente> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Vente getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public Vente findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Vente findOne(String[] paramNames, Object[] paramValue) {
		return dao.findOne(paramNames, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}