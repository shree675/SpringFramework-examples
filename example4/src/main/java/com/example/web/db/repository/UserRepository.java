package com.example.web.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.web.db.schema.User;

/*
 * acts as a list of entities
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
