package com.symatique.facturation.services;

import java.util.List;

import com.symatique.facturation.models.DetailsStock;

public interface IDetailsStockService {

	List<DetailsStock> retrieveAllDetailsStocks();

	DetailsStock addDetailsStock(DetailsStock r);

	void deleteDetailsStock(Long id);

	DetailsStock retrieveDetailsStock(Long id);
}

