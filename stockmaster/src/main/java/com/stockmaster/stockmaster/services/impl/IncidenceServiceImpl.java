package com.stockmaster.stockmaster.services.impl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmaster.stockmaster.models.User;
import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;
import com.stockmaster.stockmaster.repositories.IncidenceRepository;
import com.stockmaster.stockmaster.repositories.UserRepository;
import com.stockmaster.stockmaster.services.IncidenceService;

@Service
public class IncidenceServiceImpl implements IncidenceService {

    @Autowired
    IncidenceRepository incidenceRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Incidence> getIncidencesByUserName(String username) {
        User user = userRepository.getUserByEmail(username).get();
        Optional<List<Incidence>> incidenceByUser = incidenceRepository.findByUser(user);
        return incidenceByUser.get();
    }

    @Override
    public void storeIncidence(IncidenceDTO datos) {
        Optional<User> user = userRepository.getUserByEmail(datos.getUserCreated());
        if(user.isPresent()){
            Incidence incidence = new Incidence();
            incidence.setDescription(datos.getDescription());
            incidence.setCreatedAt(LocalDateTime.now());
            incidence.setPriority(datos.getPriority());
            incidence.setScope(datos.getScope());
            incidence.setUserCreated(user.get());
            incidenceRepository.save(incidence);
        }
    }

    @Override
    public void deleteIncidence(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteIncidence'");
    }

    @Override
    public List<Incidence> getAllIncidences() {
        return incidenceRepository.findAll();
    }
}
