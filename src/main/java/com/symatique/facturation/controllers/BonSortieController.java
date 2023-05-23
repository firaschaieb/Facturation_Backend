package com.symatique.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.symatique.facturation.services.IBonSortieService;

import com.symatique.facturation.models.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/bonsortie")
public class BonSortieController {

    @Autowired
    IBonSortieService bonSortieService;
    @GetMapping("/all")
    @ResponseBody
    public List<BonSortie> getReglement() {
        return bonSortieService.retrieveAllBonSorties();
    }


    @PostMapping("")
    @ResponseBody
    public BonSortie addBonSortie(@RequestBody BonSortie r) {
    	return bonSortieService.addBonSortie(r);
    }

	
	/*
	 * @PutMapping("/{id}") public BonSortie updateBonSortie(@PathVariable Long
	 * id, @RequestBody BonSortie BonSortieDetails) { BonSortie BonSortie =
	 * bonSortieRepository.findById(id) .orElseThrow(() -> new
	 * ResourceNotFoundException("BonSortie", "id", id));
	 * 
	 * BonSortie.setTitle(BonSortieDetails.get);
	 * BonSortie.setContent(BonSortieDetails.getContent());
	 * 
	 * return bonSortieRepository.save(BonSortie); }
	 */
	 
	 
	
	  @DeleteMapping("/{id}") public void
	  deleteBonSortie(@PathVariable Long id) {
		 bonSortieService.deleteBonSortie(id);
	       }
	 
}
