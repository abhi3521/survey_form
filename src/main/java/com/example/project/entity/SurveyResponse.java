package com.example.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "survey_responses", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class SurveyResponse {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private long userId;
    private long surveyId;

}

//1 SR : m r
//1 r : 1sr
