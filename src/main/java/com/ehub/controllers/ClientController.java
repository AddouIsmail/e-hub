package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ehub.services.ClientService;
import com.ehub.entities.Client;
@CrossOrigin
@RestController
@RequestMapping("/client")
public class ClientController {
	private ClientService clientService;
	@Autowired
	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}
	@RequestMapping(method = RequestMethod.GET)
    public Iterable listCLients(){
	return clientService.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
    public Client insetClient(@RequestBody Client client){
	return clientService.insert(client);
	}
	@RequestMapping(method = RequestMethod.PUT)
    public Client updateClient(@RequestBody Client client){
	return clientService.update(client);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Client getClientById(@PathVariable String id){
	return clientService.findById(id);
	}
	@RequestMapping(value = "/authentification/{login}", method = RequestMethod.GET)
	public Client getClientByLogin(@PathVariable String login){
		return clientService.findByLogin(login);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteClientById(@PathVariable String id){
	return clientService.deleteById(id);
	}
}
