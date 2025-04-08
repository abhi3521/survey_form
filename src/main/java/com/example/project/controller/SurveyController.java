package com.example.project.controller;

import com.example.project.dto.CreateSurveyRequest;
import com.example.project.service.SurveyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("survey")
public class SurveyController {

    @Autowired
    SurveyInterface surveyInterface;

    @PostMapping("/createSurvey")
    public ResponseEntity<String> createSurvey(@RequestBody CreateSurveyRequest request){
        return surveyInterface.createSurvey(request);
    }

    @PostMapping("/surveyResponse/{userId}/{surveyId}")
    public ResponseEntity<String> createSurveyResponse(@RequestBody CreateSurveyRequest request){
        return surveyInterface.createSurvey(request);
    }
}
