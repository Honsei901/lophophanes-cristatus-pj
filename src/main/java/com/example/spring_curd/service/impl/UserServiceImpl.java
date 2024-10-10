package com.example.spring_curd.service.impl;

import com.example.spring_curd.dto.UserDTO;
import com.example.spring_curd.entity.User;
import com.example.spring_curd.repository.UserRepository;
import com.example.spring_curd.service.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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

  @Override
  public User getUser(Integer id) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id"));
    return user;
  }

  @Override
  public void updateUser(Integer id, User user) {
    userRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id"));
    user.setId(id);
    userRepository.save(user);

  }

  @Override
  public void deleteUser(Integer id) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id"));
    userRepository.delete(user);

  }

  @Override
  public void updateName(Integer id, UserDTO userDTO) {
    User user = userRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user id"));
    user.setName(userDTO.getName());
    userRepository.save(user);
  }
}
