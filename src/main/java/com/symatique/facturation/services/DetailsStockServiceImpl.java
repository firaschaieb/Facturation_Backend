package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.DetailsStock;
import com.symatique.facturation.repository.DetailsStockRepository;


@Service
public class DetailsStockServiceImpl implements IDetailsStockService{
	@Autowired
	DetailsStockRepository DetailsStockRepository;

	@Override
	public List<DetailsStock> retrieveAllDetailsStocks() {
		return (List<DetailsStock>) DetailsStockRepository.findAll();
	}

	@Override
	public DetailsStock addDetailsStock(DetailsStock r) {
		DetailsStockRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsStock(Long id) {

		DetailsStockRepository.deleteById(id);

	}
	
	@Override
	public DetailsStock retrieveDetailsStock(Long id) {
		return DetailsStockRepository.findById(id).orElse(new DetailsStock());
	}
}
