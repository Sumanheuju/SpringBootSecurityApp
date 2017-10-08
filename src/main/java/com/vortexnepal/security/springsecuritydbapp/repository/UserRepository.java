package com.vortexnepal.security.springsecuritydbapp.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.vortexnepal.security.springsecuritydbapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	Optional<User> findByEmail(String email);

}
