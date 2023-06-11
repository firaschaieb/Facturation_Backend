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

import com.symatique.facturation.models.DetailsFacture;
import com.symatique.facturation.models.Facture;
import com.symatique.facturation.services.IDetailsFactureService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dfac")
public class DetailsFactureController {
	
	 @Autowired
	    IDetailsFactureService detailsFactureService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<DetailsFacture> getAll() {
	        return detailsFactureService.retrieveAllDetailsFactures();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public DetailsFacture addDetailsFacture(@RequestBody DetailsFacture r) {
	    	return detailsFactureService.addDetailsFacture(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteDetailsFacture(@PathVariable Long id) {
			  detailsFactureService.deleteDetailsFacture(id);
		       }
		 @GetMapping("/facture/{facture}")
	    @ResponseBody
	    public List<DetailsFacture> getAllByFacture(@PathVariable Facture facture){
	    	return detailsFactureService.retrieveAllDetailsByFActure(facture);
	    }
	    

	

}