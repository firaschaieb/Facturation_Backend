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

import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.User;
import com.symatique.facturation.services.IStockService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/stock")
public class StockController {
	
	 @Autowired
	    IStockService stockService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Stock> getAll() {
	        return stockService.retrieveAllStocks();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Stock addStock(@RequestBody Stock r) {
	    	return stockService.addStock(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteStock(@PathVariable Long id) {
			  stockService.deleteStock(id);
			  
		       }
		  
		    @GetMapping("/user/{user}")
		    @ResponseBody
		    public Stock getOneByUser(@PathVariable User user) {
		    	
		    	return stockService.findByUser(user);
		    }
		    
	    
	    

	

}