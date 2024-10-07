package com.example.spring_curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_curd.entity.User;
import com.example.spring_curd.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/add")
  public String addUser(@RequestBody User user) {
    userService.addUser(user);
    return "success add user";
  }

  @GetMapping("/get")
  public List<User> getUser() {
    return userService.getUsers();
  }
}
