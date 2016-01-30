package com.ehub.services;

import com.ehub.entities.Facture;

public interface FactureService {
	    Iterable findAll();
		public Facture findById(String id);
		public Facture update(Facture facture);
		public Facture insert(Facture facture);
		public Long deleteById(String id);
}
