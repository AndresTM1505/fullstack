package com.stockmaster.stockmaster.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmaster.stockmaster.models.User;
import com.stockmaster.stockmaster.models.DTO.UserDTO;
import com.stockmaster.stockmaster.models.mappers.UserMapper;
import com.stockmaster.stockmaster.repositories.UserRepository;
import com.stockmaster.stockmaster.services.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDTO getUserByEmail(String email) {
        User user = userRepository.getUserByEmail(email).get();
        return UserMapper.instance.userToUserDTOWithoutPassword(user);
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
    public void storeUser(UserDTO userFromControl) {
        User userToDb = UserMapper.instance.userDTOToUserDB(userFromControl);
        userRepository.save(userToDb);
    }

   

}
