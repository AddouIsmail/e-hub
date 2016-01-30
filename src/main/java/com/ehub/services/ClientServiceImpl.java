package com.ehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehub.entities.Client;
import com.ehub.repositories.ClientRepository;
@Service
public class ClientServiceImpl  implements ClientService{
	private ClientRepository clientRepository;
    @Autowired
	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return clientRepository.findAll();
	}

	@Override
	public Client getClientById(String id) {
		// TODO Auto-generated method stub
		return clientRepository.findOne(id);
	}

	@Override
	public Client save(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

}
