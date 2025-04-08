package com.example.project.service;

import com.example.project.entity.User;
import com.example.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface{
    @Autowired
    private UserRepository userRepository;
    @Override
    public ResponseEntity<String> addUser(User user) {
        userRepository.save(user);
        return new ResponseEntity<>("User saved", HttpStatus.OK);
    }
}
