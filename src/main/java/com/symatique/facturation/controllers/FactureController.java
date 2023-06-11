package com.symatique.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.models.Facture;
import com.symatique.facturation.models.User;
import com.symatique.facturation.repository.FactureRepository;
import com.symatique.facturation.services.IFactureService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/facture")
public class FactureController {
	
	 @Autowired
	 IFactureService factureService;
	 
	 @Autowired
	 FactureRepository factureRepo;
	 
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Facture> getAll() {
	        return factureService.retrieveAllFactures();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Facture addFacture(@RequestBody Facture r) {
	    	return factureService.addFacture(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteFacture(@PathVariable Long id) {
			  factureService.deleteFacture(id);
		       }
		  
		  @GetMapping("/user/{user}")
		  @ResponseBody
		  public List<Facture> retrieveAllByUser (@PathVariable User user){
			  return factureService.retrieveFactureByUser(user);
		  }
		  
		  
		  
		  @GetMapping("/client/{client}")
		  @ResponseBody
		  public List<Facture> retrieveAllByClient (@PathVariable Client client){
			  return factureService.retrieveFactureByClient(client);
		  }
		  
		  
		  @PutMapping("/total/{idFac}")
		  @ResponseBody
		  public ResponseEntity<Facture> updateTotalFacture (@PathVariable Long idFac , @RequestBody Facture updatedFacture) {
			  
		        Facture facture = factureService.retrieveFacture(idFac);
		        if (facture == null) {
		            return ResponseEntity.notFound().build();
		        }

		        // Update the user object with the new values
		        facture.setTotalHt(updatedFacture.getTotalHt());
		        facture.setTotalTtc(updatedFacture.getTotalTtc());
		        facture.setTva(updatedFacture.getTva());
		        // Update other fields as needed

		        Facture savedFacture = factureRepo.save(facture);
		        return ResponseEntity.ok(savedFacture);
		  }
	    
		  
	    
	    

	

}