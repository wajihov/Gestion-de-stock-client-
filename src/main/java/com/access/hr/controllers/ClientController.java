package com.access.hr.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.access.hr.entities.Client;
import com.access.hr.services.IClientService;
import com.access.hr.services.IFlickrService;

@Controller
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@Autowired
	private IFlickrService flickrService;

	@RequestMapping(value = "/")
	public String client(Model model) {
		List<Client> clients = clientService.selectAll();
		if (clients == null) {
			clients = new ArrayList<Client>();
		}
		model.addAttribute("clients", clients);
		return "client/client";
	}

	@RequestMapping(value = "/nouveau", method = RequestMethod.GET)
	public String ajouterClient(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "client/ajouterClient";
	}

	/*@RequestMapping(value = "/nouveau", method = RequestMethod.POST)
	public String enregistrerClient(Model model, Client client, MultipartFile file) throws Exception {
		String photoUrl = null;
		if (client != null) {
			if (file != null) {
				if (!file.isEmpty()) {
					InputStream inputStream = file.getInputStream();
					photoUrl = flickrService.savePhoto(inputStream, client.getNom());
				}
			}
			clientService.save(client);
		}
		return "redirect:/client/";
	}*/

}
