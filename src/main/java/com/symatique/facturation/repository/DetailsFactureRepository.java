package com.symatique.facturation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.DetailsFacture;
import com.symatique.facturation.models.Facture;
@Repository
public interface DetailsFactureRepository extends JpaRepository<DetailsFacture, Long>{
    List<DetailsFacture> findByFacture(Facture facture);
}
