package com.symatique.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
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
import com.symatique.facturation.models.Stock;
import com.symatique.facturation.repository.DetailsStockRepository;
import com.symatique.facturation.services.IDetailsStockService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/dstock")
public class DetailsStockController {
	
	 @Autowired
	    IDetailsStockService detailsStockService;

	 @Autowired
	 DetailsStockRepository  dstockRepo; 
	 
	 
	 
	    @GetMapping("/all")
	    @ResponseBody
	    public List<DetailsStock> getAll() {
	        return detailsStockService.retrieveAllDetailsStocks();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public DetailsStock addDetailsStock(@RequestBody DetailsStock r) {
	    	return detailsStockService.addDetailsStock(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteDetailsStock(@PathVariable Long id) {
			  detailsStockService.deleteDetailsStock(id);
		       }
	    
	    
	    
		  @GetMapping("/stock/{stock}")
		  @ResponseBody
		  public List<DetailsStock> retrieveAllByStock (@PathVariable Stock stock){
			  return detailsStockService.retrieveAllDetilsByStock(stock);
					  
		  }
		    
			  @GetMapping("/ref")
			  @ResponseBody
			  public List<DetailsStock> retrieveAllByRefernceArticle (@Param("referenceArticle") String refereceArticle){
				  return dstockRepo.findAllByReferenceArticle(refereceArticle);
						  
			  }
	

}