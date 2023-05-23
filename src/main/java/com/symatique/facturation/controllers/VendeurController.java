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

import com.symatique.facturation.models.Vendeur;
import com.symatique.facturation.services.IVendeurService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/vendeur")
public class VendeurController {
	
	 @Autowired
	    IVendeurService VendeurService;
	    @GetMapping("")
	    @ResponseBody
	    public List<Vendeur> getAll() {
	        return VendeurService.retrieveAllVendeurs();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Vendeur addVendeur(@RequestBody Vendeur r) {
	    	return VendeurService.addVendeur(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteVendeur(@PathVariable Long id) {
			  VendeurService.deleteVendeur(id);
		       }
	    
	    
	    

	

}