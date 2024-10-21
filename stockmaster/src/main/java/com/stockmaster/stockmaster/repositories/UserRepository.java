package com.stockmaster.stockmaster.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmaster.stockmaster.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
 Optional<User> getUserByEmail(String email);
}
