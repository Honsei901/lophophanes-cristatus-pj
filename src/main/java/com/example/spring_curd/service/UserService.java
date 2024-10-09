package com.example.spring_curd.service;

import java.util.List;

import com.example.spring_curd.entity.User;

public interface UserService {
  void addUser(User user);

  List<User> getUsers();

  User getUser(Integer id);

  void updateUser(Integer id, User user);
}
