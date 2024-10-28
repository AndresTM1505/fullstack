package com.stockmaster.stockmaster.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.User;

@Repository
public interface IncidenceRepository extends JpaRepository<Incidence, Long> {
    
    Optional<List<Incidence>> findByUser(User user);
}
