package com.firstapp.conferencedemo.repositories;

import com.firstapp.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//JPA repository
public interface SessionRepository extends JpaRepository<Session, Long> {
}
