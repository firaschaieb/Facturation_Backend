package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.Client;
import com.symatique.facturation.repository.ClientRepository;


@Service
public class ClientServiceImpl implements IClientService {
	@Autowired
	ClientRepository ClientRepository;

	@Override
	public List<Client> retrieveAllClients() {
		return (List<Client>) ClientRepository.findAll();
	}

	@Override
	public Client addClient(Client r) {
		ClientRepository.save(r);
		return r;
	}

	@Override
	public void deleteClient(Long id) {

		ClientRepository.deleteById(id);

	}
	
	@Override
	public Client retrieveClient(Long id) {
		return ClientRepository.findById(id).orElse(new Client());
	}
}
