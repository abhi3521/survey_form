package com.example.project.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
@Getter
@Setter
public class CreateSurveyRequest {
    private String title;
    private List<String> questions;

    public String getTitle() {
        return title;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
}
