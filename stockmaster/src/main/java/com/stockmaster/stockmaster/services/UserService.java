package com.stockmaster.stockmaster.services;

import com.stockmaster.stockmaster.models.DTO.UserDTO;

public interface UserService {

    UserDTO getUserByEmail(String email);
    void updateUser(UserDTO user);
    void deleteUser(Long id);
    void storeUser(UserDTO user);

}
