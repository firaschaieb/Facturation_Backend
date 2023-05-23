package com.symatique.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.symatique.facturation.models.Piece;
import com.symatique.facturation.services.IPieceService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/piece")
public class PieceController {
	
	 @Autowired
	    IPieceService PieceService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Piece> getAll() {
	        return PieceService.retrieveAllPieces();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Piece addPiece(@RequestBody Piece r) {
	    	return PieceService.addPiece(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deletePiece(@PathVariable Long id) {
			  PieceService.deletePiece(id);
		       }
	    
	    
	    

	

}