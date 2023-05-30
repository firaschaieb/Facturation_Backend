package com.symatique.facturation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.*;
@Repository
public interface FactureRepository extends JpaRepository<Facture, Long>{
	List<Facture> getFactureByUser (User user) ;

}
