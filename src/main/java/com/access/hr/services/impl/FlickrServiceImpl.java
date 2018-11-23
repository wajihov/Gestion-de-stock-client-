package com.access.hr.services.impl;

import java.io.InputStream;

import org.springframework.transaction.annotation.Transactional;

import com.access.hr.dao.IFlickrDao;
import com.access.hr.services.IFlickrService;

@Transactional
public class FlickrServiceImpl implements IFlickrService {

	private IFlickrDao dao;

	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}

	@Override
	public String savePhoto(InputStream stream, String fileName) throws Exception {
		return dao.savePhoto(stream, fileName);
	}

}
