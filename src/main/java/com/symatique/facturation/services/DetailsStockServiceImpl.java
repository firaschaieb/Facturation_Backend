package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.DetailsStock;
import com.symatique.facturation.models.Stock;
import com.symatique.facturation.repository.DetailsStockRepository;


@Service
public class DetailsStockServiceImpl implements IDetailsStockService{
	@Autowired
	DetailsStockRepository detailsStockRepository;

	@Override
	public List<DetailsStock> retrieveAllDetailsStocks() {
		return (List<DetailsStock>) detailsStockRepository.findAll();
	}

	@Override
	public DetailsStock addDetailsStock(DetailsStock r) {
		detailsStockRepository.save(r);
		return r;
	}

	@Override
	public void deleteDetailsStock(Long id) {

		detailsStockRepository.deleteById(id);

	}
	
	@Override
	public DetailsStock retrieveDetailsStock(Long id) {
		return detailsStockRepository.findById(id).orElse(new DetailsStock());
	}

	@Override
	public List<DetailsStock> retrieveAllDetilsByStock(Stock stock) {
	
		return detailsStockRepository.findAllByStock(stock);
	}
	
	
	
	
}
