package com.stockmaster.stockmaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;
import com.stockmaster.stockmaster.services.IncidenceService;

@RestController
@RequestMapping("/api")
public class IncidenceController {
     @Autowired
    IncidenceService incidenceService;

    @PostMapping("/incidence")
    public ResponseEntity<Integer> storeIncidence(@RequestBody IncidenceDTO entity) {
        //TODO: process POST request
        try {
            incidenceService.storeIncidence(entity);
            return new ResponseEntity<>(1, HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>(0, HttpStatus.BAD_REQUEST);
        }
    }
}
