package com.sandcodes.estore.service;

import com.sandcodes.estore.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    Optional<User> findByEmail(String email);

    List<User> getAllUsers();
}
