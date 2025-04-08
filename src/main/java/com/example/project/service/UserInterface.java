package com.example.project.service;

import com.example.project.entity.User;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserInterface {
    public ResponseEntity<String> addUser(User user);
}
