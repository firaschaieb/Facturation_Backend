package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Vendeur;

public interface IVendeurService {
	List<Vendeur> retrieveAllVendeurs();
	Vendeur addVendeur(Vendeur r);
	Vendeur retrieveVendeur(Long id);
	void deleteVendeur(Long id);
	//void assignStockToVendeur(Long idStock, Long idVendeur);
}
