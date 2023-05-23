package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Facture;

public interface IFactureService {
	List<Facture> retrieveAllFactures();
	Facture addFacture(Facture r);
	Facture retrieveFacture(Long id);
	void deleteFacture(Long id);
}
