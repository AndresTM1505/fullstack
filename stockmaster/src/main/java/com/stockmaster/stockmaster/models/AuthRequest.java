package com.stockmaster.stockmaster.models;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
