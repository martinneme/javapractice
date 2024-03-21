package com.coderhouse.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.coderhouse.Entities.Client;
import com.coderhouse.service.ClientService;

@RestController
@RequestMapping("api/clients")
public class ClientController {
	
	private final ClientService clientService;
	
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}
	
	
	 @GetMapping
	 public List<Client> getAllClients(){
		 return this.clientService.getAllClients();
	 }
}
