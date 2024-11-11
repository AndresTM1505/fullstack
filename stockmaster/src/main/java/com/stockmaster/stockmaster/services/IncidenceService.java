package com.stockmaster.stockmaster.services;

import java.util.List;
import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;

public interface IncidenceService {
    List<Incidence> getAllIncidences();
    List<Incidence> getIncidencesByUserName(String username);
    void storeIncidence(IncidenceDTO datos);
    void updatePartialIncidence(Long id, IncidenceDTO datos);
    void updateAllIncidence(Incidence datos);
    void deleteIncidence(Long id);
}



