package com.ehub.services;

import com.ehub.entities.Client;

public interface ClientService {
	 	Iterable<Client> findAll();
		public Client findById(String id);
		public Client findByEmail(String email);
		public Client findByLogin(String login);
		public Long deleteById(String id);
		public Client update(Client client);
		public Client insert(Client client);

}
