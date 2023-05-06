package com.sandcodes.estore.controller;

import com.sandcodes.estore.model.User;
import com.sandcodes.estore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<User>> getAllUsers() {
        try
        {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            user.setPassword(null);
        }
        return new ResponseEntity<>(users, HttpStatus.OK);
        }catch (Exception ex){
            String msg = ex.getMessage();
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
