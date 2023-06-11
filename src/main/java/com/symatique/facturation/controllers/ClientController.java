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
import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.User;
import com.symatique.facturation.repository.ClientRepository;
import com.symatique.facturation.services.IClientService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/client")
public class ClientController {
	
	 @Autowired
	    IClientService clientService;
	 
	    @Autowired
	 	ClientRepository clientRepo;
	 
	    @GetMapping("/all")
	    @ResponseBody
	    public List<Client> getAll() {
	        return clientService.retrieveAllClients();
	    }
	    
	    @PostMapping("")
	    @ResponseBody
	    public Client addClient(@RequestBody Client r) {
	    	return clientService.addClient(r);
	    }
	    
		 
		
		  @DeleteMapping("/{id}") public void
		  deleteClient(@PathVariable Long id) {
			  clientService.deleteClient(id);
		       }
	    
	    
		    @GetMapping("/user/{user}")
		    @ResponseBody
		    public List<Client> getAllByUser(@PathVariable User user) {
		    	
		    	return clientService.retieveAllByUser(user);
		    } 
		    
		    

		    
		    
		    @PutMapping("/{id}")
		    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
		        Client client = clientService.retrieveClient(id);
		        if (client == null) {
		            return ResponseEntity.notFound().build();
		        }

		        // Update the user object with the new values
		        client.setNom(updatedClient.getNom());
		        client.setPrenom(updatedClient.getPrenom());
		        client.setAddress(updatedClient.getAddress());
		        client.setNumero(updatedClient.getNumero());
		        // Update other fields as needed

		        Client savedClient = clientRepo.save(client);
		        return ResponseEntity.ok(savedClient);
		    }

}
