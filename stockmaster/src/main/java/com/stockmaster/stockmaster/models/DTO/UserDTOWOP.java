package com.stockmaster.stockmaster.models.DTO;

import java.time.LocalDateTime;

import com.stockmaster.stockmaster.models.utils.enums.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTOWOP {
    private Long id;
    private String name;
    private String email;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
}
