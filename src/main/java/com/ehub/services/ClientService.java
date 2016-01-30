package com.ehub.services;

import com.ehub.entities.Client;

public interface ClientService {
	 	Iterable findAll();
		public Client getClientById(String id);
		public Client save(Client client);

}
