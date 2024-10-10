package com.stockmaster.stockmaster.services.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;
import com.stockmaster.stockmaster.repositories.IncidenceRepository;
import com.stockmaster.stockmaster.services.IncidenceService;


@Service
public class IncidenceServiceImpl implements IncidenceService{

    @Autowired
    IncidenceRepository incidenceRepository;
 
    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Incidence incidence = new Incidence();
        incidence.setCategory(datos.getCategory());
        incidence.setDescription(datos.getDescription());
        incidence.setPriority(datos.getPriority());
        incidence.setCreatedAt(LocalDateTime.now());

        incidenceRepository.save(incidence);
    }
 
    @Override
    public void deleteIncidence(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }
 
    @Override
    public List<IncidenceDTO> getIncidencesById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesById'");
    }
 
    @Override
    public List<IncidenceDTO> getIncidencesByUserName(String username) {
        throw new UnsupportedOperationException("Unimplemented method 'getIncidencesByUserName'");
    }
}
