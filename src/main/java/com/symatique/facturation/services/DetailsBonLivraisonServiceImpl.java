package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.DetailsBonLivraison;
import com.symatique.facturation.repository.DetailsBonLivraisonRepository;


@Service
public class DetailsBonLivraisonServiceImpl implements IDetailsBonLivraisonService{
	@Autowired
	DetailsBonLivraisonRepository DetailsBonLivraisonRepository;

	@Override
	public List<DetailsBonLivraison> retrieveAllDetailsBonLivraisons() {
		return (List<DetailsBonLivraison>) DetailsBonLivraisonRepository.findAll();
	}

	@Override
	public DetailsBonLivraison addDetailsBonLivraison(DetailsBonLivraison r) {
		DetailsBonLivraisonRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsBonLivraison(Long id) {

		DetailsBonLivraisonRepository.deleteById(id);

	}
	
	@Override
	public DetailsBonLivraison retrieveDetailsBonLivraison(Long id) {
		return DetailsBonLivraisonRepository.findById(id).orElse(new DetailsBonLivraison());
	}
}
