package com.stockmaster.stockmaster.models.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.stockmaster.stockmaster.models.User;
import com.stockmaster.stockmaster.models.DTO.UserDTO;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper instance = Mappers.getMapper(UserMapper.class);

    UserDTO userToUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lastConnection", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true )
    User userDTOToUserDB(UserDTO user);

    @Mapping(target = "id", ignore = true)
    User userDTOToUserWithoutId(UserDTO user);

    @Mapping(target = "password", ignore = true)
    UserDTO userToUserDTOWithoutPassword(User user);

    UserDTO userToUserDTOLastConnection(User user);

}
