package com.symatique.facturation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.*;
@Repository
public interface DetailsBonSortieRepository extends JpaRepository<DetailsBonSortie, Long>{

	 List<DetailsBonSortie> findAllByBonSortie(BonSortie Bs);
}
