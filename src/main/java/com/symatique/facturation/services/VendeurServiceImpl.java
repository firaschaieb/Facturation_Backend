package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.Vendeur;
import com.symatique.facturation.repository.StockRepository;
import com.symatique.facturation.repository.VendeurRepository;

/**
 * @author fir19
 *
 */
@Service
public class VendeurServiceImpl implements IVendeurService {
	@Autowired
	VendeurRepository vendeurRepository;
	@Autowired
	StockRepository stockRepository;
	@Override
	public List<Vendeur> retrieveAllVendeurs() {
		return (List<Vendeur>) vendeurRepository.findAll();
	}

	@Override
	public Vendeur addVendeur(Vendeur r) {
		vendeurRepository.save(r);
		return r;
	}

	@Override
	public void deleteVendeur(Long id) {

		vendeurRepository.deleteById(id);

	}
	
	@Override
	public Vendeur retrieveVendeur(Long id) {
		return vendeurRepository.findById(id).orElse(new Vendeur());
	}
//	@Override
//	public void assignStockToVendeur(Long idStock, Long idVendeur) {
//		Vendeur vendeur = vendeurRepository.findById(idVendeur).orElse(null);
//		Stock stock = stockRepository.findById(idStock).orElse(null);
//        vendeur.getStock().;
//        vendeurRepository.save(vendeur);
//		
//		
//	}
}