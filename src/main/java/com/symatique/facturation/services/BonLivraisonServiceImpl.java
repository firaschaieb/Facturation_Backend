package com.symatique.facturation.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.BonLivraison;
import com.symatique.facturation.repository.BonLivraisonRepository;


@Service
public class BonLivraisonServiceImpl implements IBonLivraisonService{
	@Autowired
	BonLivraisonRepository bonLivraisonRepository;

	@Override
	public List<BonLivraison> retrieveAllBonLivraisons() {
		return (List<BonLivraison>) bonLivraisonRepository.findAll();
	}

	@Override
	public BonLivraison addBonLivraison(BonLivraison r) {
		bonLivraisonRepository.save(r);
		return r;
	}

	@Override
	public void deleteBonLivraison(Long id) {

		bonLivraisonRepository.deleteById(id);

	}
	
	@Override
	public BonLivraison retrieveBonLivraison(Long id) {
		return bonLivraisonRepository.findById(id).orElse(new BonLivraison());
	}
}
