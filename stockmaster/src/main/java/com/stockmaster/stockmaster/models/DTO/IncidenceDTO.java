package com.stockmaster.stockmaster.models.DTO;
import com.stockmaster.stockmaster.models.utils.Priorities;
import com.stockmaster.stockmaster.models.utils.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncidenceDTO {
 
    private Long id;
    private String description;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;
   
   }
