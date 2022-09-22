package com.codeclan.lab.course_booking.controllers;

import com.codeclan.lab.course_booking.models.Booking;
import com.codeclan.lab.course_booking.models.Course;
import com.codeclan.lab.course_booking.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/courses")
    public ResponseEntity<List<Course>> getAllCourses(){
        return new ResponseEntity<>(courseRepository.findAll(), HttpStatus.OK);
    }
}
