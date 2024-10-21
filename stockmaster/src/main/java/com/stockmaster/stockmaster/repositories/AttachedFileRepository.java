package com.stockmaster.stockmaster.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stockmaster.stockmaster.models.Chat;

public interface AttachedFileRepository extends JpaRepository<Chat, Long> {

}
