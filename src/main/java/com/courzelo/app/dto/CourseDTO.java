package com.courzelo.app.dto;

import com.courzelo.app.entity.CustomerExtremCourse;
import com.courzelo.app.entity.ExtremCourse;
import com.courzelo.app.entity.Outcome;
import com.courzelo.app.entity.intrConcluExtremCourse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CourseDTO {

    private String id;
    private long idUser;
    private String title;
    private String language;
    private String category;
    private List<Outcome> outcomes;
    private String description;
    private String details;
    private List<String> skillsRequired;
    private intrConcluExtremCourse introduction;
    private List<ExtremCourse> sections;
    private List<CustomerExtremCourse> customerSections;
    private intrConcluExtremCourse conclusion;
    private String audience;
    private List<String> preRequisites;
    private String instructorInfo;
    private String courseImage;
    private String courseVideo;
    private float price;
    private int progress;
    private String status;
    private String globalQuizzId;
    private int score;
    private boolean type;
    private String studyType;
    private String structure;
    private boolean free;
    private String startDate;
    private String endDate;
    private int nbrAttendee;
    private boolean acceptClassroom;
    private String syllabus;
}
