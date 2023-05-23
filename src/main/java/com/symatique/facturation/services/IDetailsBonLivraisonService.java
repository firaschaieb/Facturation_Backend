package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.DetailsBonLivraison;

public interface IDetailsBonLivraisonService {

	List<DetailsBonLivraison> retrieveAllDetailsBonLivraisons();

	DetailsBonLivraison addDetailsBonLivraison(DetailsBonLivraison r);

	void deleteDetailsBonLivraison(Long id);

	DetailsBonLivraison retrieveDetailsBonLivraison(Long id);

}
