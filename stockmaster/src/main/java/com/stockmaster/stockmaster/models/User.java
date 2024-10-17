package com.stockmaster.stockmaster.models;

import java.time.LocalDateTime;

import com.stockmaster.stockmaster.models.utils.Roles;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tabla_users")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "password", length = 32)
    private String password;
    @Enumerated(EnumType.STRING)
    @Column(name="rol", nullable = false)
    private Roles rol;
    @Column(name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "deletedAt")
    private LocalDateTime deletedAt;
    @Column(name = "updateAt")
    private LocalDateTime updateAt;
    @Column(name = "lastConnection")
    private LocalDateTime lastConnection;

}
