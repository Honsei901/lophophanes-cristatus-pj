package com.example.spring_curd.service;

import java.util.List;

import com.example.spring_curd.dto.UserDTO;
import com.example.spring_curd.entity.User;

public interface UserService {
  /**
   * Create a user data.
   * 
   * @param user
   */
  void addUser(User user);

  /**
   * Get all users data.
   * 
   * @return
   */
  List<User> getUsers();

  /**
   * Fetch a user data by id.
   * 
   * @param id
   * @return
   */
  User getUser(Integer id);

  /**
   * Update user data.
   * 
   * @param id
   * @param user
   */
  void updateUser(Integer id, User user);

  /**
   * Delete a user by id.
   * 
   * @param id
   */
  void deleteUser(Integer id);

  /**
   * Update a user name by id.
   * 
   * @param id
   * @param userDTO
   */

  void updateName(Integer id, UserDTO userDTO);
}
