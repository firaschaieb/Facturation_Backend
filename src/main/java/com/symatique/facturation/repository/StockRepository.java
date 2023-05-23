package com.symatique.facturation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.Stock;
import com.symatique.facturation.models.User;
@Repository
public interface StockRepository extends JpaRepository<Stock, Long>{
	Stock findOneByUser(User user);
}
