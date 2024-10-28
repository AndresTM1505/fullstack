package com.stockmaster.stockmaster.models.DTO;

import java.time.LocalDateTime;

import com.stockmaster.stockmaster.models.utils.enums.Roles;
import com.stockmaster.stockmaster.models.utils.validators.StrongPassword;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;
    @NotNull(message = "Se debe agregar un nombre")
    private String name;
    @Email
    @NotNull
    @NotBlank
    @NotEmpty
    private String email;
    @StrongPassword
    private String password;
    private Roles rol;
    private Boolean active;
    private LocalDateTime lastConnection;
    private LocalDateTime createdAt;
    private LocalDateTime deletedAt;
    private LocalDateTime updatedAt;
   
}
