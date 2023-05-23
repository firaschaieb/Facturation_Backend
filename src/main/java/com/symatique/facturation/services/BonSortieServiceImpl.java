package com.symatique.facturation.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.*;
import com.symatique.facturation.repository.*;



@Service
public class BonSortieServiceImpl implements IBonSortieService{
	@Autowired
	BonSortieRepository bonSortieRepository;
	
	@Autowired
	PieceRepository pieceRepository;

	@Override
	public List<BonSortie> retrieveAllBonSorties() {
		return (List<BonSortie>) bonSortieRepository.findAll();
	}

	@Override
	public BonSortie addBonSortie(BonSortie r) {
		bonSortieRepository.save(r);
		return r;
	}

	@Override
	public void deleteBonSortie(Long id) {

		bonSortieRepository.deleteById(id);

	}
	
	@Override
	public BonSortie retrieveBonSortie(Long id) {
		return bonSortieRepository.findById(id).orElse(new BonSortie());
	}
	
	@SuppressWarnings("unused")
    private BonSortie addPiece(BonSortie Bs, Set<Piece> piece) {
		
		for (Piece article : piece) {

			pieceRepository.save(article);
		}
		return Bs;
		
	}
	
	
	

}
