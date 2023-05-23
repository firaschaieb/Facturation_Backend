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
	FactureRepository FactureRepository;
	@Autowired
	DetailsFactureRepository detailFactureRepository;

	@Override
	public List<Facture> retrieveAllFactures() {
		return (List<Facture>) FactureRepository.findAll();
	}

	@Override
	public Facture addFacture(Facture r) {
		FactureRepository.save(r);
		return r;
	}

	@Override
	public void deleteFacture(Long id) {

		FactureRepository.deleteById(id);

	}
	
	@Override
	public Facture retrieveFacture(Long id) {
		return FactureRepository.findById(id).orElse(new Facture());
	}
	
	

}
