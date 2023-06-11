package com.symatique.facturation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.models.User;
import com.symatique.facturation.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserRepository userRepo;
    
    @GetMapping("/all")
    @ResponseBody
    public List<User> getAll() {
        return userRepo.findAll();
    }
    
    
    @DeleteMapping("/{id}")
    public void
	  deleteClient(@PathVariable Long id) {
		  userRepo.deleteById(id);
	       }
    
}
