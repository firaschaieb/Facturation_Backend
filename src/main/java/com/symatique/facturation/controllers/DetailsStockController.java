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

import com.symatique.facturation.models.DetailsStock;
import com.symatique.facturation.services.IDetailsStockService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dstock")
public class DetailsStockController {
	
	 @Autowired
	    IDetailsStockService DetailsStockService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<DetailsStock> getAll() {
	        return DetailsStockService.retrieveAllDetailsStocks();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public DetailsStock addDetailsStock(@RequestBody DetailsStock r) {
	    	return DetailsStockService.addDetailsStock(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteDetailsStock(@PathVariable Long id) {
			  DetailsStockService.deleteDetailsStock(id);
		       }
	    
	    
	    

	

}