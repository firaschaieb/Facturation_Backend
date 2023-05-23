package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.BonLivraison;

public interface IBonLivraisonService {
	List<BonLivraison> retrieveAllBonLivraisons();
	BonLivraison addBonLivraison(BonLivraison r);
	BonLivraison retrieveBonLivraison(Long id);
	void deleteBonLivraison(Long id);

}
