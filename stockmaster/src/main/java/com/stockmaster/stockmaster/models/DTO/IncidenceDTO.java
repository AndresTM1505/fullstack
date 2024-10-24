package com.stockmaster.stockmaster.models.DTO;
import com.stockmaster.stockmaster.models.utils.enums.Priorities;
import com.stockmaster.stockmaster.models.utils.enums.Scopes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IncidenceDTO {
      //crtl + alt + shift + flecha abajo
    private String description;
    private Priorities priority;
    private Scopes scope;
    private String userCreated;
   }
