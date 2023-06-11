package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.models.Facture;
import com.symatique.facturation.models.User;

public interface IFactureService {
	List<Facture> retrieveAllFactures();
	Facture addFacture(Facture r);
	Facture retrieveFacture(Long id);
	void deleteFacture(Long id);
	List<Facture> retrieveFactureByUser(User user);
	List<Facture> retrieveFactureByClient(Client client) ;
}
