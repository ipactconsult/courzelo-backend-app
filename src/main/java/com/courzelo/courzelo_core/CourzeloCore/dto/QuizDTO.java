package com.courzelo.courzelo_core.CourzeloCore.dto;

import com.courzelo.courzelo_core.CourzeloCore.entity.Evaluation_model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class QuizDTO {

    private String id;
    private String title;
    private String description;
    private Date creationdate;
    private String type;
    private Date limitdate;
    private int nbquestions;
    private String typecountdown;
    private float countperquiz;
    private Evaluation_model evaluationmodel;
    private float finalscore;
    private List<QuestionsDTO> questionsList;
    private List<CorrectionsDTO> correctionsList;


    public QuizDTO() {
        super();
    }
}