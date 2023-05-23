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

import com.symatique.facturation.models.Client;
import com.symatique.facturation.services.IClientService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	 @Autowired
	    IClientService ClientService;
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Client> getAll() {
	        return ClientService.retrieveAllClients();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Client addClient(@RequestBody Client r) {
	    	return ClientService.addClient(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteClient(@PathVariable Long id) {
			  ClientService.deleteClient(id);
		       }
	    
	    
	    

	

}
