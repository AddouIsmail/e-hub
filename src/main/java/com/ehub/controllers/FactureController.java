package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ehub.entities.Facture;
import com.ehub.services.FactureService;

@RestController
public class FactureController {
	private FactureService factureService;
	@Autowired
	public void setFactureService(FactureService factureService) {
		this.factureService = factureService;
	}
	@RequestMapping(value = "/factures", method = RequestMethod.GET)
    public Iterable listFactures(){
	return factureService.findAll();
	}
	@RequestMapping(value = "/facture", method = RequestMethod.POST)
    public Facture insertFacture(@RequestBody Facture facture){
	return factureService.insert(facture);
	}
	@RequestMapping(value = "/facture", method = RequestMethod.PUT)
    public Facture updateFacture(@RequestBody Facture facture){
	return factureService.update(facture);
	}
	@RequestMapping(value = "/facture/{id}", method = RequestMethod.GET)
    public Facture getFactureById(@PathVariable String id){
	return factureService.findById(id);
	}
	@RequestMapping(value = "/facture/{id}", method = RequestMethod.DELETE)
    public Long deleteFactureById(@PathVariable String id){
	return factureService.deleteById(id);
	}

}
