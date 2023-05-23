package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.BonSortie;
import com.symatique.facturation.models.DetailsBonSortie;

public interface IDetailsBonSortieService {

	List<DetailsBonSortie> retrieveAllDetailsBonSorties();

	DetailsBonSortie addDetailsBonSortie(DetailsBonSortie r);

	void deleteDetailsBonSortie(Long id);
	
	List<DetailsBonSortie> retrieveAllDetailsBonSortiesByBs(BonSortie bs);

	
	DetailsBonSortie retrieveDetailsBonSortie(Long id);
}
