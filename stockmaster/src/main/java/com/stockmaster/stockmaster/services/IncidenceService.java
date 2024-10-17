package com.stockmaster.stockmaster.services;

import java.util.List;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;


public interface IncidenceService {
    List<IncidenceDTO> getIncidencesById(Long id);
    List<IncidenceDTO> getIncidencesByUserName(String username);
    void storeIncidence(IncidenceDTO datos);//vale para guardar la incidencia o para actualizarla
    void deleteIncidence(Long id);
}
