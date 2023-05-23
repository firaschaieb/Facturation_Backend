package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.BonSortie;
import com.symatique.facturation.models.DetailsBonSortie;
import com.symatique.facturation.repository.DetailsBonSortieRepository;

@Service
public class DetailsBonSortieServiceImpl implements IDetailsBonSortieService{
	@Autowired
	DetailsBonSortieRepository DetailsBonSortieRepository;

	@Override
	public List<DetailsBonSortie> retrieveAllDetailsBonSorties() {
		return (List<DetailsBonSortie>) DetailsBonSortieRepository.findAll();
	}

	@Override
	public DetailsBonSortie addDetailsBonSortie(DetailsBonSortie r) {
		DetailsBonSortieRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsBonSortie(Long id) {

		DetailsBonSortieRepository.deleteById(id);

	}
	
	@Override
	public DetailsBonSortie retrieveDetailsBonSortie(Long id) {
		return DetailsBonSortieRepository.findById(id).orElse(new DetailsBonSortie());
	}

	@Override
	public List<DetailsBonSortie> retrieveAllDetailsBonSortiesByBs(BonSortie bs) {
		
		return DetailsBonSortieRepository.findAllByBonSortie(bs);
	}
}
