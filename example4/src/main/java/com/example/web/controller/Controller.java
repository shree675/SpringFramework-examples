package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.db.schema.User;
import com.example.web.service.UserService;

@RestController
public class Controller {

    @Autowired
    public UserService userService;

    @GetMapping("users/all")
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("users/find/{id}")
    public User findUserById(@PathVariable long id) {
        return userService.findUserById(id);
    }

    @PostMapping("users")
    /*
     * request body must present user information
     * as a JSON object with the correct instance fields
     */
    public ResponseEntity<?> createUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

}
