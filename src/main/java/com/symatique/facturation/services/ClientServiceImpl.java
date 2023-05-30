package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.models.User;
import com.symatique.facturation.repository.ClientRepository;


@Service
public class ClientServiceImpl implements IClientService {
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) clientRepository.findAll();
	}

	
	
	@Override
	public Client addClient(Client r) {
		clientRepository.save(r);
		return r;
	}

	@Override
	public void deleteClient(Long id) {

		clientRepository.deleteById(id);

	}
	
	@Override
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).orElse(new Client());
	}



	@Override
	public List<Client> retieveAllByUser(User user) {
		
		return clientRepository.findAllByUser(user);
	}



/*
 * @Override public Client modifyClient(Long clientId, Client client) {
 * 
 * return clientRepository.findAndReplace(clientId, client); } }
 */
	
	
}
