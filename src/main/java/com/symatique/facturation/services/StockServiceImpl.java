package com.symatique.facturation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.User;
import com.symatique.facturation.repository.StockRepository;

@Service
public class StockServiceImpl implements IStockService {
	@Autowired
	StockRepository stockRepository;

	@Override
	public List<Stock> retrieveAllStocks() {
		return (List<Stock>) stockRepository.findAll();
	}

	@Override
	public Stock addStock(Stock r) {
		stockRepository.save(r);
		return r;
	}

	@Override
	public void deleteStock(Long id) {

		stockRepository.deleteById(id);

	}
	
	
	
	@Override
	public Stock retrieveStock(Long id) {
		return stockRepository.findById(id).orElse(new Stock());
	}

	@Override
	public Stock findByUser(User user) {
		
		return stockRepository.findOneByUser(user);
	}


}