package com.stockmaster.stockmaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.Authentication;

import com.stockmaster.stockmaster.models.AuthRequest;
import com.stockmaster.stockmaster.models.DTO.UserDTO;
import com.stockmaster.stockmaster.security.CustomUserDetail;
import com.stockmaster.stockmaster.security.JwtTokenUtil;
import com.stockmaster.stockmaster.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
        CustomUserDetail userDetails = (CustomUserDetail) authentication.getPrincipal();
        return jwtTokenUtil.generateToken(userDetails);
    }

    @PostMapping("")
    public ResponseEntity<Void> storeUser(@Valid @RequestBody UserDTO userDto) {
        try {
            userService.storeUser(userDto);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}