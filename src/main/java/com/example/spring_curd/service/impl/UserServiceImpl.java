package com.example.spring_curd.service.impl;

import com.example.spring_curd.entity.User;
import com.example.spring_curd.repository.UserRepository;
import com.example.spring_curd.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void addUser(User user) {
    userRepository.save(user);
  }

  @Override
  public List<User> getUsers() {
    return userRepository.findAll();
  }
}
