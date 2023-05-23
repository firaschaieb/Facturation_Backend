package com.symatique.facturation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symatique.facturation.models.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
