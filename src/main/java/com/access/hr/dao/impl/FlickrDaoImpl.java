package com.access.hr.dao.impl;

import java.io.InputStream;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.access.hr.dao.IFlickrDao;
import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;

public class FlickrDaoImpl implements IFlickrDao {

	private Flickr flickr;

	private UploadMetaData uploadMetaData = new UploadMetaData();

	private String apiKey = "63107a52c30c29ef4bfc4091944c9290";
	private String sharedSecret = "f74655ab04e703d5";

	private void connect() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());
		Auth auth = new Auth();
		auth.setPermission(Permission.READ);
		auth.setToken("72157702429850731-2ae5e5a9ef055669");
		auth.setTokenSecret("092cb6a68355148b");
		RequestContext requestContext = RequestContext.getRequestContext();
		requestContext.setAuth(auth);
		flickr.setAuth(auth);
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		connect();
		uploadMetaData.setTitle(title);
		String photoId = flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
	}

	public void auth() {
		flickr = new Flickr(apiKey, sharedSecret, new REST());

		AuthInterface authInterface = flickr.getAuthInterface();

		Token token = authInterface.getRequestToken();
		System.out.println("token: " + token);

		String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		System.out.println("Follow this URL to authorise yourself on Flickr");
		System.out.println(url);
		System.out.println("Paste in the token it gives you:");
		System.out.print(">>");

		String tokenKey = JOptionPane.showInputDialog(null);

		Token requestToken = authInterface.getAccessToken(token, new Verifier(tokenKey));
		System.out.println("Authentication success");

		Auth auth = null;
		try {
			auth = authInterface.checkToken(requestToken);
		} catch (FlickrException e) {
			e.printStackTrace();
		}

		// This token can be used until the user revokes it.
		System.out.println("Token: " + requestToken.getToken());
		System.out.println("Secret: " + requestToken.getSecret());
		System.out.println("nsid: " + auth.getUser().getId());
		System.out.println("Realname: " + auth.getUser().getRealName());
		System.out.println("Username: " + auth.getUser().getUsername());
		System.out.println("Permission: " + auth.getPermission().getType());

	}
}
