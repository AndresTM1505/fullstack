package com.stockmaster.stockmaster.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stockmaster.stockmaster.models.DTO.UserDTO;
import com.stockmaster.stockmaster.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
 @Autowired
    UserService userService;

    @PostMapping("")
    public ResponseEntity<Void> storeIncidence(@Valid @RequestBody UserDTO userDto) {
        try {
            userService.storeUser(userDto);
            return ResponseEntity.status(HttpStatus.OK).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
}
