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

import com.symatique.facturation.models.Facture;
import com.symatique.facturation.services.IFactureService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/facture")
public class FactureController {
	
	 @Autowired
	    IFactureService FactureService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Facture> getAll() {
	        return FactureService.retrieveAllFactures();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Facture addFacture(@RequestBody Facture r) {
	    	return FactureService.addFacture(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteFacture(@PathVariable Long id) {
			  FactureService.deleteFacture(id);
		       }
	    
	    
	    

	

}