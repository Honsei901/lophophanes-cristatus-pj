package com.example.spring_curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

  @GetMapping("/")
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @GetMapping("/get")
  public User getUser(@RequestParam Integer id) {
    return userService.getUser(id);
  }

  @PutMapping("/update/{id}")
  public ResponseEntity<Void> updateUser(@PathVariable Integer id, @RequestBody User user) {
    userService.updateUser(id, user);
    return ResponseEntity.noContent().build();
  }
}
