package com.symatique.facturation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.symatique.facturation.models.*;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{
	Optional<Privilege> findByName(EPrivilege name);
}
