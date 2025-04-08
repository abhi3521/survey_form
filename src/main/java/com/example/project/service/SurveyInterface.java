package com.example.project.service;

import com.example.project.dto.CreateSurveyRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface SurveyInterface {

    public ResponseEntity<String> createSurvey(CreateSurveyRequest request);
}
