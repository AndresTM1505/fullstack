package com.stockmaster.stockmaster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.stockmaster.stockmaster.models.User;
import com.stockmaster.stockmaster.models.DTO.UserDTO;
import com.stockmaster.stockmaster.repositories.UserRepository;
import com.stockmaster.stockmaster.services.UserService;

public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDTO getUserByEmail(String email) {
       User user = userRepository.getUserByEmail(email).get();
       UserDTO response = new UserDTO();
       response.setActive(user.getActive());
       response.setEmail(user.getEmail());
       response.setId(user.getId());
       response.getLastConnection();
       response.setName(user.getName());
       response.setRol(user.getRol());
       response.setLastConnection(user.getLastConnection());
       return response;
    }

    @Override
    public void updateUser(UserDTO user) {

        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }

    @Override
    public void deleteUser(Long id) {
     
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }

    @Override
    public void storeUSer() {
        
        throw new UnsupportedOperationException("Unimplemented method 'storeUSer'");
    }

}
