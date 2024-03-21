package com.coderhouse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderhouse.Entities.Client;
import com.coderhouse.repository.ClientRepository;
@Service
public class ClientService {
	@Autowired
	private ClientRepository clientRepository;
	
	public ClientService(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}
	
	public List<Client> getAllClients(){
		return this.clientRepository.findAll();
	}
}
