package com.ehub.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehub.entities.Facture;
import com.ehub.repositories.FactureRepository;
@Service
public class FactureServiceImpl implements FactureService{
	private FactureRepository factureRepository;
	@Autowired
	public void setFactureRepository(FactureRepository factureRepository) {
		this.factureRepository = factureRepository;
	}

	@Override
	public Iterable findAll() {
		// TODO Auto-generated method stub
		return factureRepository.findAll();
	}

	@Override
	public Facture getFactureById(String id) {
		// TODO Auto-generated method stub
		return factureRepository.findOne(id);
	}

	@Override
	public Facture save(Facture facture) {
		// TODO Auto-generated method stub
		return factureRepository.save(facture);
	}

}
