package com.ehub.services;

import com.ehub.entities.Facture;

public interface FactureService {
	    Iterable findAll();
		public Facture getFactureById(String id);
		public Facture save(Facture facture);
}
