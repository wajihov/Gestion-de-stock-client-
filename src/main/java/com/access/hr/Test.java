package com.access.hr;

import java.io.FileInputStream;
import java.io.InputStream;

import com.access.hr.dao.impl.FlickrDaoImpl;

public class Test {

	public static void main(String[] args) {
		FlickrDaoImpl daoImpl = new FlickrDaoImpl();
		// daoImpl.auth();

		try {
			InputStream stream = new FileInputStream("C:\\Users\\Wajihov\\Desktop\\fidaa\\1.png");
			String url = daoImpl.savePhoto(stream, "myPicture");
			System.out.println("la photo : " + url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
