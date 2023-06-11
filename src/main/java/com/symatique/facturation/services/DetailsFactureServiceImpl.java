package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.DetailsFacture;
import com.symatique.facturation.models.Facture;
import com.symatique.facturation.repository.DetailsFactureRepository;


@Service
public class DetailsFactureServiceImpl implements IDetailsFactureService{
	@Autowired
	DetailsFactureRepository detailsFactureRepository;

	@Override
	public List<DetailsFacture> retrieveAllDetailsFactures() {
		return (List<DetailsFacture>) detailsFactureRepository.findAll();
	}

	@Override
	public DetailsFacture addDetailsFacture(DetailsFacture r) {
		detailsFactureRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsFacture(Long id) {

		detailsFactureRepository.deleteById(id);

	}
	
	@Override
	public DetailsFacture retrieveDetailsFacture(Long id) {
		return detailsFactureRepository.findById(id).orElse(new DetailsFacture());
	}

	@Override
	public List<DetailsFacture> retrieveAllDetailsByFActure(Facture facture) {

		return detailsFactureRepository.findByFacture(facture);
	}
}
