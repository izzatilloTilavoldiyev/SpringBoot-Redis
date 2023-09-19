package com.tillo.springbootredis.controller;


import com.tillo.springbootredis.entity.User;
import com.tillo.springbootredis.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<String> saveUser(
            @RequestBody User user
    ) {
        boolean result = userService.saveUser(user);
        if (result)
            return ResponseEntity.status(HttpStatus.CREATED).body("User successfully created!");
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }
}