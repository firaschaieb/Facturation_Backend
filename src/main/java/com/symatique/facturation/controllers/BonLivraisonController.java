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

import com.symatique.facturation.models.BonLivraison;
import com.symatique.facturation.services.IBonLivraisonService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/bonlivraison")
public class BonLivraisonController {
	
	 @Autowired
	    IBonLivraisonService bonLivraisonService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<BonLivraison> getAll() {
	        return bonLivraisonService.retrieveAllBonLivraisons();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public BonLivraison addBonLivraison(@RequestBody BonLivraison r) {
	    	return bonLivraisonService.addBonLivraison(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteBonLivraison(@PathVariable Long id) {
			  bonLivraisonService.deleteBonLivraison(id);
		       }
	    
	    
	    

	

}
