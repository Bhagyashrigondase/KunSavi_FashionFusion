package com.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	//derived query method
		Optional<User> findByEmail(String email);
		//derived query metho
		boolean existsByEmail(String email);

}
