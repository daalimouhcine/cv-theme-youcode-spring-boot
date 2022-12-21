package com.example.cvtheme.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public class UserController {

    @GetMapping
    public String getUsers() {
        System.out.println("getUsers");
        return "get users";
    }

    @PostMapping
    public String createUser() {
        return "create user";
    }
}
