package com.manoj.trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manoj.trading.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
