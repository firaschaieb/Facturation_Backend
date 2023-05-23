package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Client;

public interface IClientService {
	List<Client> retrieveAllClients();
	Client addClient(Client r);
	Client retrieveClient(Long id);
	void deleteClient(Long id);
}
