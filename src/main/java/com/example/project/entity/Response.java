package com.example.project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "responses", uniqueConstraints = {@UniqueConstraint(columnNames = {"id"})})
public class Response {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name = "survey_response_id")
    private long surveyResponseId;
    private long questionId;
    private String answer;

}
