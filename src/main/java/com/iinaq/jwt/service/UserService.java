package com.iinaq.jwt.service;

import com.iinaq.jwt.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
