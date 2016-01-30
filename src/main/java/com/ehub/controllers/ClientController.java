package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ehub.services.ClientService;
import com.ehub.entities.Client;

@RestController
public class ClientController {
	private ClientService clientService;
	@Autowired
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	@RequestMapping(value = "/clients", method = RequestMethod.GET)
    public Iterable listCLients(){
	return clientService.findAll();
	}
	@RequestMapping(value = "/client", method = RequestMethod.POST)
    public Client insetClient(@RequestBody Client client){
	return clientService.insert(client);
	}
	@RequestMapping(value = "/client", method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client client){
	return clientService.update(client);
	}
	@RequestMapping(value = "/client/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable String id){
	return clientService.findById(id);
	}
	@RequestMapping(value = "/client/{id}", method = RequestMethod.DELETE)
    public Long deleteClientById(@PathVariable String id){
	return clientService.deleteById(id);
	}
	

}
