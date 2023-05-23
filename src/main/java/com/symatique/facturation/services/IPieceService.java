package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Piece;

public interface IPieceService {
	List<Piece> retrieveAllPieces();
	Piece addPiece(Piece r);
	Piece retrievePiece(Long id);
	void deletePiece(Long id);
}

