package com.example.project.service;

import com.example.project.dto.CreateSurveyRequest;
import com.example.project.entity.Question;
import com.example.project.entity.Survey;
import com.example.project.repository.QuestionRepository;
import com.example.project.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyService implements SurveyInterface{

    @Autowired
    SurveyRepository surveyRepository;

    @Autowired
    QuestionRepository questionRepository;
    @Override
    public ResponseEntity<String> createSurvey(CreateSurveyRequest request) {
        Survey survey = new Survey();
        survey.setTitle(request.getTitle());
        surveyRepository.save(survey); // save to get the ID

        List<Question> questionEntities = request.getQuestions().stream()
                .map(q -> {
                    Question question = new Question();
                    question.setQuestionString(q);
                    question.setSurveyId(survey.getId());
                    return question;
                }).toList();

        questionRepository.saveAll(questionEntities);

        return new ResponseEntity<>("Survey with ID " + survey.getId() + " created", HttpStatus.CREATED);
    }
}
