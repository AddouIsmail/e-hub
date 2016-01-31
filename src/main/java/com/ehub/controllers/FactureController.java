package com.ehub.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ehub.entities.Facture;
import com.ehub.services.FactureService;
@CrossOrigin
@RestController
@RequestMapping("/facture")
public class FactureController {
	private FactureService factureService;
	@Autowired
	public void setFactureService(FactureService factureService) {
		this.factureService = factureService;
	}
	@RequestMapping(method = RequestMethod.GET)
    public Iterable listFactures(){
	return factureService.findAll();
	}
	@RequestMapping(method = RequestMethod.POST)
    public Facture insertFacture(@RequestBody Facture facture){
	return factureService.insert(facture);
	}
	@RequestMapping(method = RequestMethod.PUT)
    public Facture updateFacture(@RequestBody Facture facture){
	return factureService.update(facture);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Facture getFactureById(@PathVariable String id){
	return factureService.findById(id);
	}
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Long deleteFactureById(@PathVariable String id){
	return factureService.deleteById(id);
	}
}
