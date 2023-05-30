package com.symatique.facturation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.models.User;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	List<Client> findAllByUser(User user);
//	Client findAndReplace(Long clientId,Client client);
	
}
