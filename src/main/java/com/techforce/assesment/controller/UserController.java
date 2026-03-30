package com.techforce.assesment.controller;

import com.techforce.assesment.Model.User;

import com.techforce.assesment.Repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/register")
    public String createUser(@RequestBody User user){
        repo.save(user);
        return "User registered successfully";
    }
}
