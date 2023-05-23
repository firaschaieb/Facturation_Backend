package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.BonSortie;



public interface IBonSortieService {
	List<BonSortie> retrieveAllBonSorties();
	BonSortie addBonSortie(BonSortie r);
	BonSortie retrieveBonSortie(Long id);
	void deleteBonSortie(Long id);

}
