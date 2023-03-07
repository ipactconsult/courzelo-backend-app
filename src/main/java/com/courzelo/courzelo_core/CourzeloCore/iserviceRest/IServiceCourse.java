package com.courzelo.courzelo_core.CourzeloCore.iserviceRest;

import com.courzelo.courzelo_core.CourzeloCore.dto.CourseDTO;

import java.util.List;

public interface IServiceCourse {
    public CourseDTO addCourse(CourseDTO courseDTO);
    public List<CourseDTO> getAllCourses();
    public CourseDTO getCourseById(String  idCourse);
    public CourseDTO putCourseById(String  idCourse , CourseDTO requestCourse);
    public void deleteCourse(String  idCourse);
}