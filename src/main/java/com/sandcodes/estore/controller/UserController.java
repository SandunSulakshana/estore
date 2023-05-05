package com.sandcodes.estore.controller;

import com.sandcodes.estore.repository.UserRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserRepository userRepository;
}
