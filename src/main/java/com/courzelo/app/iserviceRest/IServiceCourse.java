package com.courzelo.app.iserviceRest;

import com.courzelo.app.dto.CourseDTO;

import java.util.List;

public interface IServiceCourse {
    public CourseDTO addCourse(CourseDTO courseDTO);
    public List<CourseDTO> getAllCourses();
    public CourseDTO getCourseById(String  idCourse);
    public CourseDTO putCourseById(String  idCourse , CourseDTO requestCourse);
    public void deleteCourse(String  idCourse);
}