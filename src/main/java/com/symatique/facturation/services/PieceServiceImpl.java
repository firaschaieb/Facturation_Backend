package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.Piece;
import com.symatique.facturation.repository.PieceRepository;

@Service
public class PieceServiceImpl implements IPieceService {
	@Autowired
	PieceRepository PieceRepository;

	@Override
	public List<Piece> retrieveAllPieces() {
		return (List<Piece>) PieceRepository.findAll();
	}

	@Override
	public Piece addPiece(Piece r) {
		PieceRepository.save(r);
		return r;
	}

	@Override
	public void deletePiece(Long id) {

		PieceRepository.deleteById(id);

	}
	
	@Override
	public Piece retrievePiece(Long id) {
		return PieceRepository.findById(id).orElse(new Piece());
	}
}