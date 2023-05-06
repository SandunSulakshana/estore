package com.sandcodes.estore.controller;

import com.sandcodes.estore.security.JwtResponse;
import com.sandcodes.estore.model.ApiResponse;
import com.sandcodes.estore.model.LoginRequest;
import com.sandcodes.estore.model.User;
import com.sandcodes.estore.repository.UserRepository;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Value("${JWT.secretKey}")
    private String secretKey;

    @Value("${JWT.expirationTime}")
    private String expirationTime;

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/signUp")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> signUp(@RequestBody User user) {
        // Check if user with given email already exists
        Optional<User> existingUser = userRepository.findByEmail(user.getEmail());
        if (existingUser.isPresent()) {
            return ResponseEntity.badRequest().body(new ApiResponse(false, "Email address already in use."));
        }

        // Create new user
        User newUser = new User(user.getFirstName(), user.getLastName(), user.getEmail(),
                user.getPassword(),new Date(), user.getuserType());
        userRepository.save(newUser);

        System.out.println("Date & time : " + new Date() + "\nNew User : " + newUser.getEmail());
        return ResponseEntity.ok(new ApiResponse(true, "User registered successfully!"));
    }
    @PostMapping("/signIn")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<?> signIn(@RequestBody LoginRequest loginRequest) {
        Optional<User> user = userRepository.findByEmail(loginRequest.getEmail());

        if (!user.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        String temp = loginRequest.getPassword();
        String real = user.get().getPassword();
        if(loginRequest.getPassword() == user.get().getPassword()){
            return ResponseEntity.ok().build();
        }

//        if (!new BCryptPasswordEncoder().matches(loginRequest.getPassword(), user.get().getPassword())) {
//            return ResponseEntity.status(401).body(new ApiResponse(false, "Invalid Password!"));
//        }
//
//        String token = Jwts.builder().setSubject(user.get().getEmail())
//                .setIssuedAt(new Date()).setExpiration(new Date((new Date()).getTime() + expirationTime))
//                .signWith(SignatureAlgorithm.HS512, secretKey.getBytes()).compact();

        return ResponseEntity.ok(user.get());
    }

}
