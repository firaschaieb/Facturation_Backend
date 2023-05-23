package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.DetailsFacture;
import com.symatique.facturation.repository.DetailsFactureRepository;


@Service
public class DetailsFactureServiceImpl implements IDetailsFactureService{
	@Autowired
	DetailsFactureRepository DetailsFactureRepository;

	@Override
	public List<DetailsFacture> retrieveAllDetailsFactures() {
		return (List<DetailsFacture>) DetailsFactureRepository.findAll();
	}

	@Override
	public DetailsFacture addDetailsFacture(DetailsFacture r) {
		DetailsFactureRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsFacture(Long id) {

		DetailsFactureRepository.deleteById(id);

	}
	
	@Override
	public DetailsFacture retrieveDetailsFacture(Long id) {
		return DetailsFactureRepository.findById(id).orElse(new DetailsFacture());
	}
}
