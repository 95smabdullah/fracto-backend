package com.fracto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fracto.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
