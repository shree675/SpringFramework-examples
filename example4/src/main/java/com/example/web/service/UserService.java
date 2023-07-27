package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.web.db.repository.UserRepository;
import com.example.web.db.schema.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User invalidUser;

    public UserService() {
        invalidUser = new User("<user not found>");
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User findUserById(long id) {
        try {
            return userRepository.findAll().stream().filter(user -> user.id == id).findFirst().get();
        } catch (Exception e) {
            return invalidUser;
        }
    }

    public ResponseEntity<?> insertUser(User user) {
        try {
            userRepository.save(user);
            return new ResponseEntity<Object>("Added successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<Object>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
