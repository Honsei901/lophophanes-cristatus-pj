package com.example.spring_curd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_curd.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
