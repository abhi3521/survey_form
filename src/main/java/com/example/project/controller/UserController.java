package com.example.project.controller;

import com.example.project.entity.User;
import com.example.project.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInterface userInterface;
    @GetMapping(value = "/healthCheck")
    public String healthCheck(){
        return "System is up";
    }

    @PostMapping("/addUser")
    public ResponseEntity<String> addUser(@RequestBody(required = true) User user) {
        return userInterface.addUser(user);
    }

}