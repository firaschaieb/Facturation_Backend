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

import com.symatique.facturation.models.DetailsBonLivraison;
import com.symatique.facturation.services.IDetailsBonLivraisonService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dbliv")
public class DetailsBonLivraisonController {
	
	 @Autowired
	    IDetailsBonLivraisonService DetailsBonLivraisonService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<DetailsBonLivraison> getAll() {
	        return DetailsBonLivraisonService.retrieveAllDetailsBonLivraisons();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public DetailsBonLivraison addDetailsBonLivraison(@RequestBody DetailsBonLivraison r) {
	    	return DetailsBonLivraisonService.addDetailsBonLivraison(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteDetailsBonLivraison(@PathVariable Long id) {
			  DetailsBonLivraisonService.deleteDetailsBonLivraison(id);
		       }
	    
	    
	    

	

}