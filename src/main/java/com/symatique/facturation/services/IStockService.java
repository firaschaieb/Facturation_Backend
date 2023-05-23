package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.User;

public interface IStockService {
	List<Stock> retrieveAllStocks();
	Stock addStock(Stock r);
	Stock retrieveStock(Long id);
	void deleteStock(Long id);
	Stock findByUser(User user);
}

