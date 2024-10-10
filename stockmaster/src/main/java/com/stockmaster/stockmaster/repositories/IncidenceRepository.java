package com.stockmaster.stockmaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmaster.stockmaster.models.Incidence;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long>{

}
