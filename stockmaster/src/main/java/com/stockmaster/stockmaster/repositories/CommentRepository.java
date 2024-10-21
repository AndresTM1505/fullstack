package com.stockmaster.stockmaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stockmaster.stockmaster.models.Chat;

@Repository
public interface CommentRepository extends JpaRepository<Chat, Long> {

}
