package com.access.hr.dao;

import java.io.InputStream;

public interface IFlickrDao {

	public String savePhoto(InputStream stream, String fileName) throws Exception;
}
