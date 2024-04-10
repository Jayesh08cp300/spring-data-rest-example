package com.example.repository;

import com.example.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

	AppUser findByEmail(@Param("email") String email);
}
