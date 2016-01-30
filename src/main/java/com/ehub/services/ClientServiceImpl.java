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
	public Client findById(String id) {
		// TODO Auto-generated method stub
		return clientRepository.findOne(id);
	}

	@Override
	public Client update(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	@Override
	public Client findByLogin(String login) {
		// TODO Auto-generated method stub
		return clientRepository.findByLogin(login);
	}

	@Override
	public Long deleteById(String id) {
		// TODO Auto-generated method stub
		return clientRepository.deleteById(id);
	}

	@Override
	public Client insert(Client client) {
		// TODO Auto-generated method stub
		return clientRepository.insert(client);
	}

}
