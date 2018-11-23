package com.access.hr.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.ILigneCmdClientDao;
import com.access.hr.entities.LigneCmdClient;
import com.access.hr.services.ILigneCmdClientService;

@Transactional
public class LigneCmdClientServiceImpl implements ILigneCmdClientService {

	private ILigneCmdClientDao dao;
	
	public void setDao(ILigneCmdClientDao dao) {
		this.dao = dao;
	}
	
	@Override
	public LigneCmdClient save(LigneCmdClient entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCmdClient update(LigneCmdClient entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCmdClient> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<LigneCmdClient> selectAll(String sortField, String sort) {
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCmdClient getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
	}

	@Override
	public LigneCmdClient findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCmdClient findOne(String[] paramNames, Object[] paramValue) {
		return dao.findOne(paramNames, paramValue);
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
