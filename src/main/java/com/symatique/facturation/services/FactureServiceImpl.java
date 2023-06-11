package com.symatique.facturation.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.*;
import com.symatique.facturation.repository.*;

@Service
public class FactureServiceImpl implements IFactureService {
	@Autowired
	FactureRepository factureRepository;
	@Autowired
	DetailsFactureRepository detailFactureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		return (List<Facture>) factureRepository.findAll();
	}

	@Override
	public Facture addFacture(Facture r) {
		factureRepository.save(r);
		return r;
	}

	@Override
	public void deleteFacture(Long id) {

		factureRepository.deleteById(id);

	}
	
	@Override
	public Facture retrieveFacture(Long id) {
		return factureRepository.findById(id).orElse(new Facture());
	}

	@Override
	public List<Facture> retrieveFactureByUser(User user) {

		return factureRepository.getFactureByUser(user);
	}

	@Override
	public List<Facture> retrieveFactureByClient(Client client) {
		
		return factureRepository.getFactureByClient(client);
	}
	
	

}
