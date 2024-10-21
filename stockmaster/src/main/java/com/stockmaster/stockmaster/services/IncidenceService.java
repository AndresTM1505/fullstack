package com.stockmaster.stockmaster.services;

import java.util.List;
import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;

public interface IncidenceService {
    void storeIncidence(IncidenceDTO datos);
    void deleteIncidence(Long id);
    List<IncidenceDTO> getIncidencesById(Long id);
    List<Incidence> getIncidencesByUserName(String username);
    List<Incidence> getAllIncidences();
}


