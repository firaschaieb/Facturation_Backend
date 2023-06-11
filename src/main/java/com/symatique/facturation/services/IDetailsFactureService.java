package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.DetailsFacture;
import com.symatique.facturation.models.Facture;

public interface IDetailsFactureService {

	List<DetailsFacture> retrieveAllDetailsFactures();

	DetailsFacture addDetailsFacture(DetailsFacture r);

	void deleteDetailsFacture(Long id);

	DetailsFacture retrieveDetailsFacture(Long id);
	
	List<DetailsFacture> retrieveAllDetailsByFActure(Facture facture) ;
}
