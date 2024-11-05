package com.stockmaster.stockmaster.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stockmaster.stockmaster.models.Incidence;
import com.stockmaster.stockmaster.models.DTO.IncidenceDTO;
import com.stockmaster.stockmaster.services.IncidenceService;



@RestController
@RequestMapping("/incidence")
public class IncidenceController {

    @Autowired
    IncidenceService incidenceService;

    @GetMapping("/listByUser")
    public ResponseEntity<List<Incidence>> getIncidencesByUsername(@RequestParam(name = "username") String username) {
        try {
            return ResponseEntity.ok(incidenceService.getIncidencesByUserName(username));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Void> storeIncidence(@RequestBody IncidenceDTO entity) {
        try {
            incidenceService.storeIncidence(entity);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @DeleteMapping("")

    public ResponseEntity<Void> deleteIncidence(@RequestParam(name = "incidence_id") Long id) {
        try {
            incidenceService.deleteIncidence(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
