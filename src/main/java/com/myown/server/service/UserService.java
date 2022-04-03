package com.myown.server.service;

import com.myown.server.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    User updateUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers(String username);

    void deleteUser(Long id);

    Long numberOfUsers();
}
