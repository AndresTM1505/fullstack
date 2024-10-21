package com.stockmaster.stockmaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockmaster.stockmaster.models.Chat;

public interface CommentRepository extends JpaRepository<Chat, Long> {

}
